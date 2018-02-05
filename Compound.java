import java.util.List;
//Component
import java.util.ArrayList;
public class Compound implements Statement{
	   private List<Statement> listStatement=new ArrayList<Statement>();
	    	
	   public Compound(Statement ...statements){
		   for(Statement s:statements)
			   listStatement.add(s);
	   }
	   public void add(Statement s){
	       listStatement.add(s);
	   }
	   public void remove(Statement s){
           listStatement.remove(s);           
       }
	   public void print(int indent){		
	       IndentPrint.Print(indent, "begin");
		   for(Statement s:listStatement){		
			   s.print(indent+1);			 
		   }
		   IndentPrint.Print(indent, "end");
	   }
}
