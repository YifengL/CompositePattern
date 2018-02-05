
public class Main {
	public static void main(String[] args){
		Statement factorial=new Compound(
		    new Assignment("fact",new Expr()),
		    new While(new Expr(),new Compound(
		    	new Assignment("fact",new Expr()),
		        new Assignment("n",new Expr()))));
		factorial.print(0);
	}

}
