import java.util.ArrayList;
import java.util.List;

public class While implements Statement {
	private Statement statement;
	private Expr expr;
	
	public While(Expr expr,Statement statement){
		this.expr=expr;
		this.statement=statement;
	}
	public void print(int indent){
		IndentPrint.Print(indent, "while\t"+expr.toString()+"\tdo");	
		statement.print(indent+1);
	};
    
}
