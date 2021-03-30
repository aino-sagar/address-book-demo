import java.util.Scanner; 
/*
The AddressBook program implements an application that
simply Accept record,Display record Find_by_Name, Delete_by Name, Update.
the output on the screen:-
how many addraces you want to store
================Address-Book-Menu=================
*	1.Create New Addrace
*	2.Show all Addrace
*	3.Find by Name
*	4.Delete By Name
*	5.Update By Name
*	6.EXIT
---------------------------------------------------
Enter Your Choies
*/
public class AddressBook
	{
	
	 public String name;
	 public String city;
	 public String street;
	 public String country;
	 public int Zipcode;
	 
	
	
	   public void  accept()
	   {
		  //Accept Record From User
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
		  //Display Record
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
	    	int ObjectIndex=0; 
		Scanner sc= new Scanner(System.in);
                System.out.println("how many addraces you want to store");
	    	int Total_Number_of_Addraces=sc.nextInt();
                AddressBook  obj[] = new AddressBook [Total_Number_of_Addraces];
		
                do
		{
		System.out.println("\n================Address-Book-Menu=================");

		System.out.println("\t1.Create New Addrace");
		
		System.out.println("\t2.Show all Addrace");
		
		System.out.println("\t3.Find by Name");
		
		System.out.println("\t4.Delete By Name");
		
		System.out.println("\t5.Update By Name");
		
		System.out.println("\t6.EXIT");
	
		System.out.println("-----------------------------------------------------");
		
		System.out.println("Enter Your Choies");
		
		
		Choies=sc.nextInt();
		
		switch(Choies)
		{
		case 1:
    
			//Accept Record From The User
      
			obj[ObjectIndex]=new AddressBook();
		       	obj[ObjectIndex].accept();
		      	ObjectIndex++;
			   
			break;
		
		case 2:
    
			    //Display The Each AddressIndex value
      
		      	     for(int j=0;j<ObjectIndex;j++)
			      {
		       	      obj[j].display();
		              }
			
		      	     break;
			
	 	case 3:	
    
				System.out.print("enter name you want to find");
				String Name = sc.next();
                                int flag=0;
				for(int k=0 ; k<Total_Number_of_Addraces; k++) // Travel From Each objectIndex.
				{
					    if(obj[k].name.equals(Name) == true )
				      	{
					     	//if we got the record print it.
						     flag++;
					     	}
				  }
                                                 if(flag>0)
                                                 System.out.println("Record found");
				    	         else
						 System.out.println("Record not found");
				  
			
			        break;
		case 4:
                                  // Accept Name from user for Delete

			          System.out.print("enter name you want Delete");
			    	  String Delete_By_Name = sc.next();
                      
				    for(int l=0;l<Total_Number_of_Addraces;l++)
				    {
      					if(obj[l].name.equals(Delete_By_Name) == true )
					     {
      			                              //using loop and if statement we reach to index which we going to delete and 
      				                      //copy last index value and put it on Index which we want to Delete . 
						       obj[l].city = obj[ObjectIndex-1].city;
						       obj[l].street = obj[ObjectIndex-1].street;
						       obj[l].country = obj[ObjectIndex-1].country;
						       obj[l].Zipcode = obj[ObjectIndex-1].Zipcode;
						       ObjectIndex--; 
						       // reduce object size by one
					
						      System.out.print("Record delete suscessfully");
					     }
				    }
			
			            break;
		case 5:
    
			     // Accept Data Which User Wants to Update
	                     System.out.print("enter name you want Update");
		    
	                      String Update_By_Name = sc.next();
		    
	          for(int l=0;l<Total_Number_of_Addraces;l++)
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
				  //exit() method exits current program
		
			    System.exit(0);
		default:
			
   			 System.out.print("Please Enter Valid Choies");
			
		  }
		
			
		  } while(Choies != 6);	
		
		  }

      }
