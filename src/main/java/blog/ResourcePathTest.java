package blog;

import java.net.URISyntaxException;
import java.net.URL;

/**
 * Created by yzy on 2017/07/26 下午 3:13.
 * email: mia5121@163.com
 */
public class ResourcePathTest {

//	@Test
	public void test1() throws URISyntaxException {
		URL url = ResourcePathTest.class.getResource("");
		//当前包的路径 file:/E:/IdeaProjects/Demo/target/classes/blog/
		System.out.println(url.toString());
		System.out.println(url.toURI().toString());
		System.out.println(url.getPath());
		//获取的地址有/开头，绝对地址/E:/IdeaProjects/Demo/target/classes/blog/

		String path1 = ResourcePathTest.class.getResource("/").getPath();
		System.out.println(path1);
		//out:  /E:/IdeaProjects/Demo/target/classes/

		String path2 = ResourcePathTest.class.getClassLoader().getResource("").getPath();
		System.out.println("path2 :" + path2);
	}

	public static void main(String[] args){
		String path0 = ResourcePathTest.class.getResource("").getPath();
		System.out.println("path0 :" + path0);
		//out path0 :/E:/IdeaProjects/Demo/target/classes/blog/ 源代码所在包的路径
		String path1 = ResourcePathTest.class.getResource("/").getPath();
		System.out.println("path1 :" +path1);
		//out path1:  /E:/IdeaProjects/Demo/target/classes/  classpath路径
		String path2 = ResourcePathTest.class.getClassLoader().getResource("").getPath();
		System.out.println("path2 :" + path2);
		//out path2:  /E:/IdeaProjects/Demo/target/classes/  classpath路径

		/**
		 *1. Class.getResourceAsStream(String path) ：
		 *  path 不以’/'开头时默认是从此类所在的包下取资源，以’/'开头则是从ClassPath根下获取。
		 *  其只是通过path构造一个绝对路径，最终还是由ClassLoader获取资源。
		 *
		 * 2. Class.getClassLoader.getResourceAsStream(String path) ：
		 * 默认则是从ClassPath根下获取，path不能以’/'开头，最终是由ClassLoader获取资源。
		 *
		 */



	}
}
