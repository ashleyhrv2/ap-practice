package javaPack;

public class Account 
{
	    String base = requestedName;
	    String name = base;

	    int n = 0;

	    if (isAvailable(name)) 
	    {
	        username = name;
	        return;
	    

	    n = n + 1;
	    name = base + n;

	    while (isAvailable(name) == false) 
	    {
	        n = n + 1;
	        name = base + n;
	        name = "" + name;
	        }
	    }
	    
	    public String getShortenedName()
		{
		    String s = name;
		    String out = "";

		    int i = 0;

		    while (i < s.length()) 
		    {

		        char c = s.charAt(i);

		        if (c == '-')
		        {
		            if (out.length() > 0)
		            {
		                out = out.substring(0, out.length() - 1);
		            }
		            i = i + 1;
		        }
		        else 
		        {
		            out = out + c;
		            i = i + 1;
		        }
		    }
		    return out;
		    name = name;
	    
		}
}
