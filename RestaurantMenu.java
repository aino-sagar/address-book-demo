
public class RestaurantMenu extends R_Menu{
	public void initialize()
	 {
		    
		    setRestaurantTitle("Restaurant_Menu");
		    
		    R_Item R1 = new    R_Item ("tea",20);
		    hm.put(R1.Name,R1.prise);
		    
		    R_Item R2 = new    R_Item ("Coffee",30);
		    hm.put(R2.Name,R2.prise);
		    
		    R_Item R3 = new    R_Item ("Toast Butter",50);
		    hm.put(R3.Name,R3.prise);
	 }

}
