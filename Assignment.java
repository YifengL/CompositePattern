
public class Assignment implements Statement {
	 private String name;
	 private Expr expr;
	 public Assignment(String name,Expr expr){
	      this.name=name;
	      this.expr=expr;
	  }
	  public void print(int indent){
		  IndentPrint.Print(indent, name+"\t:=\t"+expr.toString());		 
	  }

}
