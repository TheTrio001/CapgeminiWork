public class WebsiteSlash
{
	public static void main(String[] args) {
	    String url1 = "www.codegram.in/admin/reports/daywiseuser.php";
	    String command = ShowCommand(url1);
		System.out.println("command:"+command);
	}
	
	private static String ShowCommand(String url){
	    String [] token = url.split("/");
	    int I = token.length;
	    String last = token[I-1];
	    String [] name = last.split("\\.");
	    return name[0];
	}
}