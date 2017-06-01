package WebDriverProgramming;

public class IrctcWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WrapMethods wrap = new WrapMethods();
		
		wrap.launchURL("https://www.services.irctc.co.in/cgi-bin/bv60.dll/irctc/services/register.do?click=true");
		
		wrap.enterValueByName("userName", "selenium");
		
		wrap.selectValueByIndex("question", 3);
		
		wrap.enterValueByName("answer", "Java");
		
		wrap.closeApp();
		
		
	}

}
