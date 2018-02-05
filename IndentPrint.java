
public class IndentPrint {
    public static void Print(int indent,String s){
    	for(int i=0;i<indent;i++){
    		System.out.print('\t');
    	}
    	System.out.println(s);
    }
}
