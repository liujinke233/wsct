package helloworld;

public class Ctest {

	public static void main(String[] args) {
	WStest ws = new WStestService().getWStestPort();
	Box bean = ws.getBean(1, "ssr");
	int num = bean.getNum();
	String str = bean.getStr();
	String str2 = ws.str("ljk");
	System.out.println(num+":"+str+":"+str2);
	}
}
