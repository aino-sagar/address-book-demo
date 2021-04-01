
import java.util.HashMap; // import the HashMap class
import java.util.Iterator;

public class R_Menu {

		   private String RestaurantTitle;  
	       // Setter
		   public void setRestaurantTitle(String RestaurantTitle)
		   {
		    this.RestaurantTitle = RestaurantTitle; 
		   }
		   // Getter
		   public String getRestaurantTitle()
		   {
		    return RestaurantTitle;
		   
		   }
		   HashMap<String, Integer> hm= new HashMap<String, Integer>();
 
		   
		   void Display()
		   {
			 System.out.println("======================"+RestaurantTitle+"==================");
			 Iterator <String> it = hm.keySet().iterator();
			 while(it.hasNext())
			{
				String key=(String)it.next();
				System.out.println(key+":"+"\tRs."+hm.get(key)+"/-");
				
			}
		   }
		   }   

