// for accessing MunuItem Property We extend it.  
public class RestaurantItem extends MenuItem{

	  String Name;
	  int prise;
	  public RestaurantItem (String Name ,int Prise)
	  {
//call super class(MenuItem) Constructor and Set the value
		  super(Name);
		  this.setPrise(Prise);
	  }
	  public void setPrise(int prise)
	  {
		  this.prise=prise;
		  
	  }
	   public void setTitle(String Title)
	   {
	    this.Title = Title;
	   }
	   public String getTitle()
	   {
	    return Title;
	   
	   }
	  public void Display()
	   {
		   System.out.println(super.Title+ ":"+this.prise);
	   }

}
