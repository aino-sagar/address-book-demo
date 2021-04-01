import java.util.*;
public class Menu {
	   
	   private String MenuTitle;  
	   int i=1;
       // Setter
	   public void setMenuTitle(String MenuTitle)
	   {
	    this.MenuTitle = MenuTitle; 
	   }
	   // Getter
	   public String getMenuTitle()
	   {
	    return MenuTitle;
	   
	   }
	   
	   List<MenuItem> MI = new ArrayList<MenuItem>();
	   
	   void Display()
	   {
		 System.out.println("======================"+MenuTitle+"==================");
		 for(MenuItem Item:MI)
		 {
			 System.out.print("\n"+i+": ");
			 Item.Display();
			 i++;
		 }
		 
	   }
	   }   
