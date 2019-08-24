import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

import java.util.*;

import java.io.*;

public class gui extends JFrame
{

private JTextField item1;
private JTextField item2;
private JTextField item3;
private JPasswordField passwordField;

public gui()
{
	super("POPCORN TIME");
	setLayout(new FlowLayout());
	
item1=new JTextField("WELCOME",20);
item1.setEditable(false);
add(item1);

item2=new JTextField("NAME",20);
add(item2);

item3=new JTextField("email:",20);
add(item3);

passwordField = new JPasswordField("type",20);
add(passwordField);

thehandler handler=new thehandler();

item1.addActionListener(handler);

item2.addActionListener(handler);

item3.addActionListener(handler);

passwordField.addActionListener(handler);
}

private class thehandler implements ActionListener
{

public void actionPerformed(ActionEvent event)
{

String string=" ";
if(event.getSource()==item1)
string=String.format("Field 1 :%s",event.getActionCommand());

else if(event.getSource()==item2)
string=String.format("Field 2 :%s",event.getActionCommand());

else if(event.getSource()==item3)
string=String.format("Field 3 :%s",event.getActionCommand());

else if(event.getSource()==passwordField)
string=String.format("Field 4:%s",event.getActionCommand());


JOptionPane.showMessageDialog(null,string);

}


}

}



public class Nowshowing1 {
	
		
		
		String s[]= {"IT","SIMRAN","SHUBH MANGAL SAAVDHAN","ANNABELLE:CREATION","LUCKNOW CENTRAL","DADDY","BAREILLY KI BARFI","TULA KALNNAAR NAHI","TERMINATOR 2 : JUDGMENT DAY"};
	    String display[]= {"2D","2D","2D","2D","3D","2D","2D","2D","2D  3D"};
		String language[]= {"ENGLISH","HINDI","HINDI","ENGLISH","HINDI","HINDI","HINDI","MARATHI","ENGLISH"};
		String votes[]= {"74%","67%","78%","72%","74%","70%","80%","72%","72%"};
		String category[]= {"A","UA","UA","A","UA","A","UA","U","UA"};
		String dates[]= {"SAT 16","SUN 17","MON 18","TUE 19","WED 20","THU 21","FRI 22"};
		String theatre[]= {"Sun City:Vile Parle","PVR:Phoenix,Lower Parel","Movietime Suburbia:Bndra(W)","Carnival:Moviestar,Goregaon","Carnival:Sangam,Andheri","Bahar Cinema:Vile Parle(E)","Cinemax:Andheri(E)"};
		String time[]= {"9:05 AM","12:35 PM","05:30 PM","11:00 PM"};
		String time1[]= {"09:30 AM","02:35 PM","05:10 PM","10:15 PM"};
		String grab[]= {"Jumbo Nachos Combo","Paneer Sub Combo","Chicken Sub Combo","Tub Salted Combo","Tub Cheese Combo","Tub Caramel Combo"};
		String brief[]= {"Jumbo Nachos + 2 Coke 300 ml","Paneer Tikka Sub + French Fries + Coke 300ml","Chicken Tikka Sub + French Fries + Coke 300ml","Tub Salted Popcorn + 2 Coke 450ml","Tub Cheese Popcorn + 2 Coke 450ml","Tub Caramel Popcorn + 2 Coke 450ml"};

		String rate[]= {"? 288","? 312","? 312","? 384","? 404","? 404"};
		int price[]= {288,312,312,384,404,404};

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int i,j,seat;  
		double pay;
		public static int x=0;
		
		boolean again=true;
		
		int arr[]=new int[40];
		int arr1[]=new int[40];
		int arr2[]=new int[10];
		
		public void swapping()
		{
			System.out.println("\t\t\t***NOW SHOWING***\n\n");
		
			
			System.out.println("~Sort by\n1.Popularity\n2.Alphabetically");
			
			arr[11]=sc.nextInt();
			
			
			if(arr[11]==1)
			{
				for(i=1;i<votes.length;i++)
				{
					for(j=0;j<(votes.length-i);j++)
					{                                       
						if(votes[j].compareTo(votes[j+1])<0)
						{
							
							String temp;
							temp=votes[j];
							votes[j]=votes[j+1];
							votes[j+1]=temp;
							
							temp=s[j];
							s[j]=s[j+1];
							s[j+1]=temp;
							
						    temp=language[j];
						    language[j]=language[j+1];
						    language[j+1]=temp;
						    
						    temp=display[j];
						    display[j]=display[j+1];
						    display[j+1]=temp;
						    
						    temp=category[j];
						    category[j]=category[j+1];
						    category[j+1]=temp;
						
						}
					}
				}
				
			}
			
			if(arr[11]==2)
			{
				for(i=1;i<s.length;i++)
				{
					for(j=0;j<(s.length-i);j++)
					{
						if(s[j].compareTo(s[j+1])>0)
						{
							
							String temp;
							temp=s[j];
							s[j]=s[j+1];
							s[j+1]=temp;
							
							temp=votes[j];
							votes[j]=votes[j+1];
							votes[j+1]=temp;
						
							    temp=language[j];
							    language[j]=language[j+1];
							    language[j+1]=temp;
							    
							    temp=display[j];
							    display[j]=display[j+1];
							    display[j+1]=temp;
							    
							    temp=category[j];
							    category[j]=category[j+1];
							    category[j+1]=temp;
							
						
						
						}
					}
				}
				
			}
			
		}
		
	
		
		public  void display()
		{ 
		if(arr[11]==1 || arr[11]==2)
		{
		for(i=0;i<s.length;i++ )
		{ 
			System.out.println("------------------------------------------------------");
			System.out.println((i+1)+"."+s[i]+"\n"+display[i]+"\n"+language[i]+"\n"+votes[i]+"\n"+category[i]);
			System.out.println("------------------------------------------------------");
			System.out.println("\n\n\n");
		}
		}
		}
		 Scanner sc = new Scanner(System.in);
		public void get()
		{  
		   
			System.out.println("BOOK...");
			arr[0]=sc.nextInt();
			
		}
		
		public void book()
		{
			System.out.println("SELECT THE DATE...\n\n");
			for(String i : dates)
			{
				System.out.println(i+"\t\t\t");
			}
			System.out.println();
			arr[1]=sc.nextInt();
			System.out.println("SELECT THE THEATRE");
			for(i=0;i<theatre.length;i++)
		{
				System.out.println("\t\t\t"+(i+1)+"."+theatre[i]+"\n\n");
			}
			arr[2]=sc.nextInt();
			System.out.println("SELECT THE TIME...");
			if(arr[2]%2==0)
			{
				for(i=0;i<time.length;i++)
				{
					System.out.println("\t\t\t"+(i+1)+"."+time[i]+"\n\n");
				}
			}
			else
				for(i=0;i<time1.length;i++)
				{
					System.out.println("\t\t\t"+(i+1)+"."+time1[i]+"\n\n");
				}
			arr[3]=sc.nextInt();
			System.out.println("\t\t\t\t***Terms and Conditions***"+"\n\t1.Children above the age of 3 will need a seperate ticket,children will not be allowed in Adult movie."+"\n\t2.Please carry a valid age proof for A rated movies-18 years and over only would be given entry.");
			
			do
			{
			try
			{
			System.out.println("PRESS\t\t1.Cancel\n\t\t2.Accept");
			arr[4]=sc.nextInt();
			if(arr[4]==1|| arr[4]==2)
				again=true;
			else
				again=false;
			}
			catch(InputMismatchException e)
			{
				
			}
			}while(again==false);
		}
		
		
		public void furtherbook()
		{
			System.out.println("How many seats:");
			arr[5]=sc.nextInt();
			int p=1;
			System.out.println("1.LOUNGE Rs. 250.00\n\n2.EXECUTIVE Rs.200.00\n\n3.PREMIUM Rs.150.00");
			arr[6]=sc.nextInt();
			if(arr[6]==1)
			{    System.out.println("LOUNGE Rs.250.00\n");
			     pay=arr[5]*250;
				for(i=0;i<2;i++)
				{
					for(j=0;j<6;j++)
					{
						if(i==1 && j==3)
						{
							System.out.print("\t\t");
						}
						else
						{
							System.out.print(p+"\t");
							p++;
						}
					}
					System.out.println("\n");
				}
					
					System.out.println("Enter seat number:");
					for(i=0;i<arr[5];i++)
					{
						seat=sc.nextInt();
						if(x==0)
						{
							arr1[x]=seat;
							x++;
						}
						else
						{
							
							
							for(j=0;j<x;j++)
							{
								if(arr1[j]==seat)
								{
									System.out.println("Seat-"+seat+"\t Already occupied...Booking Failed!");
									
									break;
								}
								
							}
							arr1[x]=seat;
							x++;
						}
						
					}
				}
				
			if(arr[6]==2)
			{    System.out.println("EXECUTIVE Rs.200.00\n");
			    pay=arr[5]*200;	
			for(i=0;i<3;i++)
				{
					for(j=0;j<15;j++)
					{
						if(i==2 && j==6)
						{
							System.out.print("\t\t");
						}
						else
							
						{
							
							System.out.print(p+"\t");
							p++;
						}
					}
					System.out.println("\n");
				}
					
					System.out.println("Enter seat number:");
					for(i=0;i<arr[5];i++)
					{
						seat=sc.nextInt();
						if(x==0)
						{
							arr1[x]=seat;
							x++;
						}
						else
						{
							
							
							for(j=0;j<x;j++)
							{
								if(arr1[j]==seat)
								{
									System.out.println("Seat-"+seat+"\t Already occupied...Booking Failed!");
									
									break;
								}
								
							}
							arr1[x]=seat;
							x++;
						}
						
					}
				}
				
			if(arr[6]==3)
			{    System.out.println("PREMIUM Rs.150.00\n");
			    pay=arr[5]*150;
				for(i=0;i<12;i++)
				{
					for(j=0;j<20;j++)
					{
						if(i==0 || i%4==0)
						{
							System.out.print(p+"\t");
							p++;
						}
						else if( j==10)
						{
							System.out.print("\t\t");
						}
						else
						{
							System.out.print(p+"\t");
							p++;
						}
						
					}
					System.out.println("\n");
				}
					
					System.out.println("Enter seat number:");
					for(i=0;i<arr[5];i++)
					{
						seat=sc.nextInt();
						if(x==0)
						{
							arr1[x]=seat;
							x++;
						}
						else
						{
							
							
							for(j=0;j<x;j++)
							{
								if(arr1[j]==seat)
								{
									System.out.println("Seat-"+seat+"\t Already occupied...Booking Failed!");
									
									break;
								}
								
							}
							arr1[x]=seat;
							x++;
						}
						
					}
				}	
			}
		public void grababite() 
		{
			System.out.println("\t\t\t\t\tGrab a Bite!!!\n\n");
			for(i=0;i<grab.length;i++)
			{
				System.out.println("\t\t"+(i+1)+".\t\t\t--"+grab[i]+"--"+"\n\t\t\t\t"+brief[i]+"\n\t\t\t\t"+rate[i]+"\n");
			}
			arr[8]=sc.nextInt();
			System.out.println("\n\t\tQuantity:");
			arr[9]=sc.nextInt();
			for(i=0;i<grab.length;i++)
			{
				if(arr[8]==(i+1))
				{
					pay=pay+price[i];
				}
			}
			pay=pay*arr[9];
			}
		
		public void ticket(int key)
		{
			
			System.out.println("\t\t\t--Review Booking--\n\n ");
			
		   for(i=0;i<s.length;i++)
		   {
			   if(arr[0]==(i+1))
				   System.out.print(s[i]+"\n"+display[i]+"\n"+language[i]+"\n"+votes[i]+"\n"+category[i]+"\n\n"+arr[5]+" Tickets:");
			  }
		   for(j=0;j<arr[5];j++)
			{  
			   System.out.print(arr1[j]+"\t");
			
			}
		   if(key==1)
		   {
			   System.out.println("\n\n\t\t\t--Food and Beverage--\n"+"\nItems:"+grab[arr[8]-1]+"\nQuantity:"+arr[9]);
		   }
		   System.out.println("\n\n\t\t\tPay: ? "+pay);
		  
		   
		   }
		
		 
			 public void payment()throws IOException
			 {
				 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				 int ch,cardno,cardpass,confirm,userid,paytm;
				 String bank;
				 System.out.println("Select payment method:");
				 System.out.println("1.Reserve ticket\n2.Debit/Credit Card\n3.Net Banking\n4.Paytm\n");
				 ch=Integer.parseInt(br.readLine());
				 switch(ch)
				 {
				 case 1: System.out.println("The ticket has been reserved, please complete payment 15 minutes prior to the movie at the ticket counter.");
				 		 break;
				 case 2: System.out.println("Enter your card number:");
				 		 cardno=Integer.parseInt(br.readLine());
				 		 System.out.println("Enter your 4 digit passcode:");
				 		 cardpass=Integer.parseInt(br.readLine());
				 		 System.out.println("Confirm Payment?\n1.Yes\t2.No");
				 		 confirm=Integer.parseInt(br.readLine());
				 		 if(confirm==1)
				 		 System.out.println("Payment Successful");
				 		 else
				 		 System.out.println("Payment Cancelled");
				 		 break;
				 case 3: System.out.println("Enter Bank Name:");
			 			 bank=br.readLine();
			 			System.out.println("Enter User ID:");
			 			 userid=Integer.parseInt(br.readLine());
			 			System.out.println("Enter transaction password:");
			 			 userid=Integer.parseInt(br.readLine());
			 			System.out.println("Confirm Payment?\n1.Yes\t2.No");
				 		 confirm=Integer.parseInt(br.readLine());
				 		 if(confirm==1)
				 		 System.out.println("Payment Successful");
				 		 else
				 		 System.out.println("Payment Cancelled");
				 		 break;
				 case 4:  System.out.println("Enter Paytm Number:");
				 		 paytm=Integer.parseInt(br.readLine());
				 		 
					 
					     System.out.println("Confirm Payment?\n1.Yes\t2.No");
				 		 confirm=Integer.parseInt(br.readLine());
				 		 if(confirm==1)
				 		 System.out.println("Payment Successful");
				 		 else
				 		 System.out.println("Payment Cancelled");
				 		 break;
			 			  
				 }
			 }
		 
		
		 public void done()
		 {
			 Random ran = new Random();
			 System.out.println("\n\n\n\t\t\t--Ticket Confirmation--\n\n");
			 for(i=0;i<s.length;i++)
			   {
				   if(arr[0]==(i+1))
					   System.out.print(s[i]+"\n"+display[i]+"\n"+language[i]+"\n"+votes[i]+"\n"+category[i]+"\n\n"+arr[5]+" Tickets:");
				  }
			 for(j=0;j<arr[5];j++)
				{  
				   System.out.print(arr1[j]+"\t");
				
				}
			 System.out.println("\n\n\t\t\t**TICKET BOOKED**\n\t\t--------------------------------\n\t\t\tPOPCORNTIME!!!!\n\t\t\t\t*");
		     System.out.println("\n\t---------------------------------------------------------------------------\n\n");
		     int out=0;
		     for(i=0;i<10;i++)
		     {
		    	arr2[out] = ran.nextInt(9); 
		    	if(i==0)
		    	{
		    		System.out.print("\t\t\t\tQR Code:");
		    	}
		    	if(arr2[out]==0 || arr2[out]%4==0)
		    	{
		    		System.out.printf("%c",arr2[out]+65);
		    		
		    	}
		    	else
		    	{
		    		System.out.print(arr2[out]);
		    		
		    		
		    	}
		    	out++;
		     }
			 System.out.println("\n\n\t\tTicket details are sent on SMS,You can access the ticket from\n\t\t\t*My Profile* AND Show QR Code at Venue. ");
			 
			
		 }
		
		
}



public class cancel extends Nowshowing1 {

	public void cancelticket()throws IOException
	{  
		int in;
		String last=" ";
		
	   
		
		System.out.println("Are you sure you want to cancel the ticket?\n1.NO\n2.YES");
		 in=sc.nextInt();
		 
			
			
		 
		 if(in==2)
		{
			System.out.println("\n\nEnter the QR Code of your ticket");
			last=br.readLine();
            System.out.println("The ticket has been cancelled.Money will be refunded in your account within 1 week. ");
		}
		

			
		
		
		
		  }
}

public class Comingsoon {

	String movies[]={"RIBBON","GOLMAAL AGAIN","RANCHI DIARIES","AMERICAN MADE","BAAPJANMA","BLADE RUNNER 2049","THE LEGO NINJAGO MOVIE","THE FOREIGNER","THOR: RAGNAROK","ITTEFAQ:IT HAPPENED ONE NIGHT BEFORE"};
	String language[]={"HINDI","HINDI","HINDI","ENGLISH","MARATHI","ENGLISH","ENGLISH","ENGLISH","ENGLISH","HINDI"};
	String release_dates[]={"NOV 03,2017","OCT 20,2017","OCT 13,2017","SEPT 29,2017","SEPT 29,2017","OCT 06,2017","OCT 06,2017","OCT 13,2017","NOV 03,2017","NOV 03,2017"};
	String votes[]={"81%","98%","84%","98%","91%","98%","96%","99%","99%","89%"};
	String genre[]={"COMEDY,DRAMA","COMEDY","COMEDY,CRIME","CRIME,THRILLER","DRAMA,FAMILY","SCI-FI,THRILLER","ADVENTURE,ANIMATION","ACTION,THRILLER","ACTION,ADVENTURE","DRAMA"};
    int i,j;
	public void swapping()
	{
	int choice;
	Scanner sc=new Scanner(System.in);
	System.out.println("\t\t\t***COMING SOON***\n\n");
	System.out.println("~Sort by\n 1)Populatiry\n 2)Alphabetically");
	choice=sc.nextInt();
	String temp;
	if(choice==1)
	 {
		for(int i=1;i<votes.length;i++)
			{
				for(int j=0;j<(votes.length-i);j++)
					{
						if(votes[j].compareTo(votes[j+1])<0)
							{
								
								temp=votes[j];
								votes[j]=votes[j+1];
								votes[j+1]=temp;
								
								temp=movies[j];
								movies[j]=movies[j+1];
								movies[j+1]=temp;
								
								temp=language[j];
								language[j]=language[j+1];
								language[j+1]=temp;

								temp=genre[j];
								genre[j]=genre[j+1];
								genre[j+1]=temp;

	                                                        temp=release_dates[j];
	                                                        release_dates[j]=release_dates[j+1];
	                                                        release_dates[j+1]=temp;
							}
					}
			}
	 }
	if(choice==2)
	{
		for(i=1;i<movies.length;i++)
			{
				for(int j=0;j<(movies.length-i);j++)
					{
						if(movies[j].compareTo(movies[j+1])>0)
							{
								temp=movies[j];
								movies[j]=movies[j+1];
								movies[j+1]=temp;
								
								
								
								temp=votes[j];
								votes[j]=votes[j+1];
								votes[j+1]=temp;
								
								
								temp=language[j];
								language[j]=language[j+1];
								language[j+1]=temp;

								temp=genre[j];
								genre[j]=genre[j+1];
								genre[j+1]=temp;

	                                                        temp=release_dates[j];
	                                                        release_dates[j]=release_dates[j+1];
	                                                        release_dates[j+1]=temp;
							}
					}
			}
	 }

	}

	public void display()
	{
		for(int i=0;i<movies.length;i++)
			{
				System.out.println("------------------------------------------------------------------------------------\n\n");
				System.out.println((i+1)+"."+movies[i]+"\n"+genre[i]+"\n"+language[i]+"\n"+votes[i]+"\n"+release_dates[i]+"\n\n");
				System.out.println("------------------------------------------------------------------------------------");
				System.out.println("\n\n\n");
			}
	}
	
}

public class Main {

	public static void main(String args[])throws IOException
	{
		Nowshowing1 s = new Nowshowing1();
		
		gui objs=new gui();
		objs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		objs.setSize(300,200);
		objs.setVisible(true);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1;
		int key,not=0,ask;
		key=0;
		int end=0;
		/*System.out.print("NAME:");
		s1=br.readLine();
		 
		System.out.println("\nHELLO "+s1);*/
		System.out.println("\n");
		System.out.println("\n\t\t\t1.Now Showing.\n\t\t\t2.Coming Soon.\n");
		ask=s.sc.nextInt();
		if(ask==2)
		{
			Comingsoon cs=new Comingsoon();
			cs.swapping();
			cs.display();
		}
		
		else
		{
			
		do
		{
		
	
		s.swapping();
		s.display();
		s.get();
		s.book();
		
		if(s.arr[4]==2)
		{
			
			s.furtherbook();
			System.out.println("\t\t\t1.Grab a Bite!!\n"+"\t\t\t2.SKIP");
			s.arr[7]=s.sc.nextInt();
			not=1;
			
			
		
			if(s.arr[7]==1)
			{   
				 key=1;
				
				s.grababite();
			    s.ticket(key);
			    s.payment();
			    s.done();
			}
			else
			{     key=2;
			
				s.ticket(key);
				s.payment();
				s.done();
			}
			System.out.println("\n\n~Press:\n1.To Book Again.\n2.Cancellation");
			s.arr[12]=s.sc.nextInt();
			if(s.arr[12]==1)
			{
				end=1;
			}
			else
			{
				end=0;
				cancel c= new cancel();
	            c.cancelticket();
	            
			}
		}	
		else if(s.arr[4]==1)
		{ 
			System.out.println("Booking Cancelled.");
		}
	
		
		
	    }while(end==1);
	
		}
	    }
	}



/*OUTPUT:-









 

                                          1.Now Showing.
			2.Coming Soon.

1
			***NOW SHOWING***


~Sort by
1.Popularity
2.Alphabetically
1
------------------------------------------------------
1.BAREILLY KI BARFI
2D
HINDI
80%
UA
------------------------------------------------------




------------------------------------------------------
2.SHUBH MANGAL SAAVDHAN
2D
HINDI
78%
UA
------------------------------------------------------




------------------------------------------------------
3.IT
2D
ENGLISH
74%
A
------------------------------------------------------




------------------------------------------------------
4.LUCKNOW CENTRAL
3D
HINDI
74%
UA
------------------------------------------------------




------------------------------------------------------
5.ANNABELLE:CREATION
2D
ENGLISH
72%
A
------------------------------------------------------




------------------------------------------------------
6.TULA KALNNAAR NAHI
2D
MARATHI
72%
U
------------------------------------------------------




------------------------------------------------------
7.TERMINATOR 2 : JUDGMENT DAY
2D  3D
ENGLISH
72%
UA
------------------------------------------------------




------------------------------------------------------
8.DADDY
2D
HINDI
70%
A
------------------------------------------------------




------------------------------------------------------
9.SIMRAN
2D
HINDI
67%
UA
------------------------------------------------------




BOOK...
2
SELECT THE DATE...


SAT 16			
SUN 17			
MON 18			
TUE 19			
WED 20			
THU 21			
FRI 22			

2
SELECT THE THEATRE
			1.Sun City:Vile Parle


			2.PVR:Phoenix,Lower Parel


			3.Movietime Suburbia:Bndra(W)


			4.Carnival:Moviestar,Goregaon


			5.Carnival:Sangam,Andheri


			6.Bahar Cinema:Vile Parle(E)


			7.Cinemax:Andheri(E)


3
SELECT THE TIME...
			1.09:30 AM


			2.02:35 PM


			3.05:10 PM


			4.10:15 PM


2
				***Terms and Conditions***
	1.Children above the age of 3 will need a seperate ticket,children will not be allowed in Adult movie.
	2.Please carry a valid age proof for A rated movies-18 years and over only would be given entry.
PRESS		1.Cancel
		2.Accept
2
How many seats:
2
1.LOUNGE Rs. 250.00

2.EXECUTIVE Rs.200.00

3.PREMIUM Rs.150.00
3
PREMIUM Rs.150.00

1	2	3	4	5	6	7	8	9	10	11	12	13	14	15	16	17	18	19	20	

21	22	23	24	25	26	27	28	29	30			31	32	33	34	35	36	37	38	39	

40	41	42	43	44	45	46	47	48	49			50	51	52	53	54	55	56	57	58	

59	60	61	62	63	64	65	66	67	68			69	70	71	72	73	74	75	76	77	

78	79	80	81	82	83	84	85	86	87	88	89	90	91	92	93	94	95	96	97	

98	99	100	101	102	103	104	105	106	107			108	109	110	111	112	113	114	115	116	

117	118	119	120	121	122	123	124	125	126			127	128	129	130	131	132	133	134	135	

136	137	138	139	140	141	142	143	144	145			146	147	148	149	150	151	152	153	154	

155	156	157	158	159	160	161	162	163	164	165	166	167	168	169	170	171	172	173	174	

175	176	177	178	179	180	181	182	183	184			185	186	187	188	189	190	191	192	193	

194	195	196	197	198	199	200	201	202	203			204	205	206	207	208	209	210	211	212	

213	214	215	216	217	218	219	220	221	222			223	224	225	226	227	228	229	230	231	

Enter seat number:
1
2
			1.Grab a Bite!!
			2.SKIP
1
					Grab a Bite!!!


		1.			--Jumbo Nachos Combo--
				Jumbo Nachos + 2 Coke 300 ml
				? 288

		2.			--Paneer Sub Combo--
				Paneer Tikka Sub + French Fries + Coke 300ml
				? 312

		3.			--Chicken Sub Combo--
				Chicken Tikka Sub + French Fries + Coke 300ml
				? 312

		4.			--Tub Salted Combo--
				Tub Salted Popcorn + 2 Coke 450ml
				? 384

		5.			--Tub Cheese Combo--
				Tub Cheese Popcorn + 2 Coke 450ml
				? 404

		6.			--Tub Caramel Combo--
				Tub Caramel Popcorn + 2 Coke 450ml
				? 404

6

		Quantity:
2
			--Review Booking--

 
SHUBH MANGAL SAAVDHAN
2D
HINDI
78%
UA

2 Tickets:1	2	

			--Food and Beverage--

Items:Tub Caramel Combo
Quantity:2


			Pay: ? 1408.0
Select payment method:
1.Reserve ticket
2.Debit/Credit Card
3.Net Banking
4.Paytm

1
The ticket has been reserved, please complete payment 15 minutes prior to the movie at the ticket counter.



			--Ticket Confirmation--


SHUBH MANGAL SAAVDHAN
2D
HINDI
78%
UA

2 Tickets:1	2	

			**TICKET BOOKED**
		--------------------------------
			POPCORNTIME!!!!
				*

	---------------------------------------------------------------------------


				QR Code:6E326I6233

		Ticket details are sent on SMS,You can access the ticket from
			*My Profile* AND Show QR Code at Venue. 


~Press:
1.To Book Again.
2.Cancellation
2
Are you sure you want to cancel the ticket?
1.NO
2.YES
2


Enter the QR Code of your ticket
6E326I6233
The ticket has been cancelled.Money will be refunded in your account within 1 week. */




