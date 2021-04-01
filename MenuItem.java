//it is MenuItem common for addraceBook and Restaurant
public class MenuItem {

	  String Title;
    // Setter
	  public MenuItem(String Title)
	  {
		  this.Title=Title;
	  }
	   public void setTitle(String Title)
	   {
	    this.Title = Title;
	   }
	   // Getter
	   public String getTitle()
	   {
	    return Title;
	   
	   }
	   void Display()
	   {
		   System.out.println(this.Title);
	   }

}
