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
	    System.out.println("enter street");
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
        AddressBook  obj[] = new AddressBook [No];
		
     do
		{
		System.out.println("\n================Address-Book-Menu=================");

		System.out.println("\t1.Create New Addrace");
		
		System.out.println("\t2.Show all Addrace");
		
		System.out.println("\t3.Find by Name");
		
		System.out.println("\t4.Delete By Name");
		
		System.out.println("\t5.Update By Name");
		
		System.out.println("\t6.EXIT");
	
		System.out.println("-------------------------------------------------------");
		
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
			
		case 3:	
		
        System.out.print("enter name you want to find");
				String Name = sc.next();
				for(int k=0 ; k<No ;k++)
				{
					if(obj[k].name.equals(Name) == true )
					{
						System.out.println("Record is found");
						obj[k].display();
						
					}
					else 
					System.out.println("Record not found");
				}
			
			 break;
		case 4:
			
			        System.out.print("enter name you want Delete");
				    String Delete_By_Name = sc.next();
				    for(int l=0;l<No;l++)
				    {
      					if(obj[l].name.equals(Delete_By_Name) == true )
					     {
						 obj[l].name = obj[i-1].name;
						 obj[l].city = obj[i-1].city;
						 obj[l].street = obj[i-1].street;
						 obj[l].country = obj[i-1].country;
						 obj[l].Zipcode = obj[i-1].Zipcode;
						 i--;
						 System.out.print("Record delete suscessfully");
					     }
				    }
			
			   break;
		case 5:
			
	      System.out.print("enter name you want Update");
		    String Update_By_Name = sc.next();
		    for(int l=0;l<No;l++)
		    {
				if(obj[l].name.equals(Update_By_Name) == true )
			     {
				 System.out.print("enter city");
				 obj[l].city = sc.next();
				 
				 System.out.print("enter street");
				 obj[l].street = sc.next();

				 System.out.print("enter country");
				 obj[l].country = sc.next();

				 System.out.print("enter Zipcode");
				 obj[l].Zipcode = sc.nextInt();

				
				 System.out.print("Record Update suscessfully");
			     }
		       }
			  break;
			
		case 6:
			
			    System.exit(0);
		  }
		
		  } while(Choies != 6);	
		
		  }

      }
