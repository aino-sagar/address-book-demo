import java.util.Scanner; 
public class AddressBook
	{
	
	 public String name;
	 public String city;
	 public String street;
	 public String country;
	 public int Zipcode;
	 
	
	
	public void  accept()
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter name");
		name=sc.next();
	    System.out.println("enter city");
	    city=sc.next();
	    System.out.println("enter street3"
	    		+ "");
	    street=sc.next();
	    System.out.println("enter country");
	    country=sc.next();
		System.out.println("enter Zipcode");
		Zipcode=sc.nextInt();
		
	}
	
	public void  display()
	{
		System.out.print("\t "+name);
		System.out.print("\t "+city);
		System.out.print("\t "+street);
		System.out.print("\t "+country);
		System.out.print("\t "+Zipcode);
		System.out.print("\n");
		
	}
	public static void main(String args[])
	{
		int Choies;
		int i=0;
		
		Scanner sc= new Scanner(System.in);
		
        System.out.println("how many addraces you want to store");
		int No=sc.nextInt();
        AddressBook  obj[] = new AddressBook [No] ;
		do
		{
		System.out.println("\n================Address-1Book-Menu=================");

		System.out.println("1.Create New Addrace");
		
		System.out.println("2.Show all Addrace");
		
		System.out.println("3.EXIT");
		
		System.out.println("Enter Your Choies");
		
		
		Choies=sc.nextInt();
		
		switch(Choies)
		{
		case 1:
			
			obj[i]=new AddressBook();
			obj[i].accept();
			i++;
			break;
		
		case 2:
		
			for(int j=0;j<i;j++)
			{
			obj[j].display();
			}
			break;
			
		default:
			
			    System.exit(0);
		
		
		
		}
		
		}while(Choies != 3);	
		
		}

}
