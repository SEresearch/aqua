package errors.syntax.semic;

public class DoWhileFollowedByTry {

	public static void main(String[] args) {
		int i;
		do
		{int x=10;}
	    while(i==11)		//semicolon should come here
		
		try			//error propagated here? It should be telling me: finally missing
		{
			
		}
		
		
		//same error is seen with another do while statement in place of try
		
		
	}

}
