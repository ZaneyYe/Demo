package util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * Created by yzy on 2017/07/18 上午 9:34.
 * email: mia5121@163.com
 */
public class ResourceLoader {

	private static final Logger LOGGER = LoggerFactory.getLogger(ResourceLoader.class);

	private static String filename = "config.properties";

	private static Map<String,String> map;

//	public static Map<String,String> getPropertis(){
//		InputStream inputStream = null;
//		try {
//			inputStream = ResourceLoader.class.getClassLoader().getResourceAsStream(filename);
//		} catch (Exception e) {
//			e.printStackTrace();
//			LOGGER.error("没有该配置文件",e);
//		}
//		if(inputStream != null){
//			map = new HashMap<>();
//			try {
//				BufferedReader reader =
//						new BufferedReader(new InputStreamReader(inputStream, Charset.forName("ISO-8859-1")));
//				String line = reader.readLine();
//				while(StringUtils.isNotBlank(line)){
//					String[] split = line.split("=");
//					if(split.length != 0){
//						map.put(split[0],split[1]);
//					}
//					line = reader.readLine();
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			return map;
//		}
//		return  null;
//	}
	public static Properties getPropertis(){
		InputStream stream = ResourceLoader.class.getClassLoader().getResourceAsStream(filename);
		java.util.Properties prop = new java.util.Properties();
		try {
			prop.load(stream);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return prop;
	}

	public static void main(String[] args) throws IOException {
//		InputStream stream = ResourceLoader.class.getResourceAsStream("../config.properties");
//		InputStream stream = ResourceLoader.class.getClassLoader().getResourceAsStream("config.properties");
//		java.util.Properties prop = new java.util.Properties();
//		prop.load(stream);
//		System.out.println(prop.getProperty("country"));
//
//		String name = "../config.properties";
//		String baseName = ResourceLoader.class.getName();
//		int index = baseName.lastIndexOf('.');
//		if (index != -1) {
//			name = baseName.substring(0, index).replace('.', '/')
//					+"/"+name;
//		}

//		System.out.println(name);



		ResourceBundle bundle = ResourceBundle.getBundle("config");
		System.out.println(bundle.getString("country"));

		Locale locale = new Locale("zh","CN");
		ResourceBundle bundle1 = ResourceBundle.getBundle("config",locale);
//		System.out.println(bundle1.getString("cmy"));
		System.out.println(bundle1.getString("country"));

		Locale locale1 = new Locale("en","US");
		ResourceBundle bundle2 = ResourceBundle.getBundle("config",locale1);
		System.out.println(bundle2.getString("hello"));

	}
}
