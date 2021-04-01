import java.util.*;
public class Menu {
	   
	    public String MenuTitle;  
	   int i=1;
       // Setter
	   public void setRestaurantTitle(String MenuTitle)
	   {
	    this.MenuTitle = MenuTitle; 
	   }
	   // Getter
	   public String getMenuTitle()
	   {
	    return MenuTitle;
	   
	   }
	   
	   List< RestaurantItem> MI = new ArrayList< RestaurantItem>();
	   
	   void Display()
	   {
		 System.out.println("======================"+MenuTitle+"==================");
		 for(RestaurantItem Item:MI)
		 {
			 System.out.print("\n"+i+": ");
			 Item.Display();
			 i++;
		 }
		 
	   }
	   }   
