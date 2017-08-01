package batch;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.batch.item.ItemWriter;
import po.Cadre;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;


/**
 * Created by yzy on 2017/07/25 下午 2:04.
 * email: mia5121@163.com
 */
public class CadreWriter implements ItemWriter<Cadre> {

	private File targetFile = new File(this.getClass().getClassLoader().getResource("").getPath()+"/job/target.txt");

	private BufferedWriter writer = null;

	@Override
	public void write(List<? extends Cadre> items) throws Exception {
		if(!targetFile.exists()){
			targetFile.createNewFile();
		}
		writer = new BufferedWriter(new FileWriter(targetFile,true));
		if(targetFile.exists()){
			if(CollectionUtils.isNotEmpty(items)){
				for(Cadre cadre : items){
					writer.append(cadre.toString());
					writer.newLine();
				}
			}
			writer.flush();
			writer.close();
		}
	}

}
