/*MINI PROJECT
  FLAT RENTAL SYSTEM
  DONE BY:
  GAURI GADHAVE-UCE2022461
  NILAM GAIKWAD-UCE2022462
  PRACHI GAIKWAD-UCE2022463
 */
package miniproject;
import java.util.*;
class Node{
Node left,right;
 String admin; //admin name

 String name;//customer name

  long AD_ID;// customer aadhar id

  long PH_NO;//customer phone number

  boolean IS_OP;//flag to indicate that flat is occupied
  String type;//category
  String AD;//address of flats
int Rent;//rent
int RT;//rating of flat
int F_NO;//falt no
long A_PH;//admin phone no

 Node(String type, String AD,int F_NO,int Rent){
      this.A_PH=0;
this.admin=null;
this.IS_OP=false;
this.AD_ID=-1;
this.PH_NO=-1;
this.RT=-1;
this.type=type;
this.name=null;
this.type=type;
this.AD=AD;
this.F_NO=F_NO;
this.Rent=Rent;
}
}
class admin{
static Node root;
Scanner s=new Scanner(System.in);

// 1st admin password,username,phone no
String password1="admin1";
String UserName1="admin1@example.com";
long phoneNO1=9999999991L;

// 2nd admin password,username,phone no
String password2="admin2";
String UserName2="admin2@example.com";
long phoneNO2=9999999992L;

// 3rd admin password,username,phone no
String password3="admin3";
String UserName3="admin3@example.com";
long phoneNO3=9999999993L;

// 4th admin password,username,phone no
String password4="admin4";
String UserName4="admin4@example.com";
long phoneNO4=9999999994L;

//5th  admin password,username,phone no
String password5="admin5";
String UserName5="admin5@example.com";
long phoneNO5=9999999995L;

//method for login into admine profile
public void Login() {
System.out.println("                                                     ************************ WELCOME TO ADMIN PORTAL **************************\n\n");
boolean flag=true;
while(flag==true) {
	System.out.println("To Access Admin Page Plzzz Enter your password :");
String PW=s.next();   //taking password
if(password1.equals(PW)) {
                       System.out.println("\n                                    _____________________________________________________________________________________________________\n");

                        System.out.println("                                                                              LOGIN SUCCESSFULLY                                         ");

                        System.out.println("                                    _____________________________________________________________________________________________________\n\n");

menu(UserName1,phoneNO1);
flag=false;
}
else if(password2.equals(PW)) {
                            System.out.println("\n                                    _____________________________________________________________________________________________________\n");

                            System.out.println("                                                                              LOGIN SUCCESSFULLY                                         ");

                            System.out.println("                                    _____________________________________________________________________________________________________\n\n");

                            menu(UserName2,phoneNO2);
flag=false;
}
else if(password3.equals(PW)) {
                            System.out.println("\n                                    _____________________________________________________________________________________________________\n");

                            System.out.println("                                                                              LOGIN SUCCESSFULLY                                         ");

                            System.out.println("                                    _____________________________________________________________________________________________________\n\n");
menu(UserName3,phoneNO3);
flag=false;
}
else if(password4.equals(PW)) {
                           System.out.println("\n                                    _____________________________________________________________________________________________________\n");

                          System.out.println("                                                                              LOGIN SUCCESSFULLY                                         ");

                        System.out.println("\n                                    _____________________________________________________________________________________________________\n");
                        menu(UserName4,phoneNO4);
flag=false;
break;
}
else if(password5.equals(PW)) {
                          System.out.println("\n                                    _____________________________________________________________________________________________________\n");

                          System.out.println("                                                                              LOGIN SUCCESSFULLY                                         ");

                        System.out.println("                                    _____________________________________________________________________________________________________\n\n");
menu(UserName5,phoneNO5);
flag=false;
}
else {
                        System.out.println("                        =======================================================================================\n");

                        System.out.println("                                                     ---- WRONG PASSWORD ----\n                                                  Want To Try Again?(1-yes,0-no)\n                                                       Forgot Password(yes-2)\n                                                        GO TO HOME PAGE(yes-3)\n");

                        System.out.println("                        =======================================================================================\n");
int op=s.nextInt();//taking choosen option
if(op==1) {
flag=true;
}

// forgot password option
if(op==2) {
System.out.println("Enter Your Username: ");
s.nextLine();
String un=s.nextLine();//taking username
System.out.println("Enter Your Login Phone Number: ");
long ph=s.nextLong();//taking phone number
if((UserName1.equals(un) && phoneNO1==ph) || (UserName2.equals(un) && phoneNO2==ph) || (UserName3.equals(un) && phoneNO3==ph) || (UserName4.equals(un) && phoneNO4==ph) || (UserName5.equals(un) && phoneNO5==ph)){

 menu(un,ph);
}else {
                               System.out.println("                        =======================================================================================\n");

                               System.out.println("                                                       WRONG USERNAME OR PHONE NUMBER                                               ");

                               System.out.println("                        =======================================================================================\n");

 flag=true;
}}
// to go to main page
if(op==3 ||op==0) {
flag=false;
}
}
}
}
public void menu(String u,long ph) {
int ch;
do{
           System.out.println(" ________________________________________________");

           System.out.println("|"+"                      MENU                      "+"|");

           System.out.println(" ________________________________________________");

           System.out.println("|                  1. ADD FLATS                    |");

           System.out.println("|                  2.REMOVE FLATS                  |");

           System.out.println("|                 3.VIEW CUSTOMER                  |");

           System.out.println("|                  4.UPDATE RENT                   |");

           System.out.println("|                5.GO TO HOME PAGE                 |");

           System.out.println(" ________________________________________________");
 System.out.println("");
 System.out.println("");
 System.out.println("Enter your choice(Numbers) :");
ch=s.nextInt();
switch(ch) {
case 1:
System.out.println("Enter Flat Type( 1BHK,2BHK,RK):");
String ft=s.next().toUpperCase();;
s.nextLine();
System.out.println("ADDRESS :");
String ad=s.nextLine().toUpperCase();
System.out.println("Flat NO.:");
int fn=s.nextInt();
System.out.println("Enter Rent:");
int re=s.nextInt();
 if(root==null){
Node temp=new Node(ft,ad,fn,re);
root=temp;
root.type=ft;
root.admin=u;
root.A_PH=ph;
}
add(root,ft,ad,fn,re,u,ph);
         System.out.println("\n                                    _____________________________________________________________________________________________________\n");

         System.out.println("                                                                                Flat Added Successfully!                   ");

         System.out.println("                                    _____________________________________________________________________________________________________\n\n");

 break;
case 2:
      System.out.println("Enter the Flat Number : ");
      int flatno=s.nextInt();
      //System.out.println(flatno);
System.out.println("Enter the Rent :");
int rent=s.nextInt();
      if(root.Rent ==rent && root.admin.equals(u) && root.F_NO==flatno ){
      System.out.println(root.admin);
      delroot(root);
      }
      else
           deleteFlatByRent(root,rent,flatno,u,ph);
 System.out.println(" \n                                    _____________________________________________________________________________________________________\n");

 System.out.println("                                                                          Apartment Remove Successfully                 ");

          System.out.println("                                  ____________________________________________________________________________________________________\n\n");
break;
case 3:
      viewC(u,ph);
      break;
case 4:
      if(root!=null) {
      System.out.println("Enter the Flat No :");
      int f=s.nextInt();
      System.out.println("Enter the  Rent: ");

int r=s.nextInt();
update(root,f,r,u,ph);}
      else {
          System.out.println("\n                                    _____________________________________________________________________________________________________\n");

          System.out.println("                                                                          Sorry!!! Appartment Are Not Added                    ");

          System.out.println("                                    _____________________________________________________________________________________________________\n\n");
      }
      break;
case 5:
ch=0;
      break;
      default:
}
           }while(ch!=0);
      } //flat add method
Node add(Node root,String ft,String ad,int fn,int re,String un,long ph) {
           if(root==null) {
        	   Node temp=new Node(ft,ad,fn,re);
                temp.admin=un;
                temp.A_PH=ph;
                return temp;
           }
           else {
                if( re<root.Rent){
                     root.left=add(root.left,ft,ad,fn,re,un,ph);
                        }
                        if(re>root.Rent){
                            root.right=add(root.right,ft,ad,fn,re,un,ph);
                        }
                }
      return root;
      }
    void delroot(Node node) {
    if(node.left==null && node.right==null) {
      root=null;
    }
    else if(node.left!=null && node.right!=null) {
      Node newnode=root.right;
      root=root.left;
      root.right=newnode;
    }else if(node.left!=null && node.right==null) {
      Node newnode=root.left;
      //root=null;
      root=newnode;
    }else if(node.left==null && node.right!=null) {
      Node n=root.right;
      //root=null;
      root=n;
    }
    return;
      }
      //delete the flat from System
Node  deleteFlatByRent(Node root,int rent ,int ft,String un,long ph) {
        if (root == null) {
            System.out.println("\n                                    _____________________________________________________________________________________________________\n");

               System.out.println("                                                                              Sorry!!! Flat not found                   ");

               System.out.println("                                    _____________________________________________________________________________________________________\n\n");
              return root;
        }
        if ( rent< root.Rent) {
            root.left = deleteFlatByRent(root.left, rent,ft,un,ph);
        } else if (rent > root.Rent) {
            root.right = deleteFlatByRent(root.right, rent,ft,un,ph);
        }
        if(root.Rent==rent && root.A_PH==ph && root.admin.equals(un) &&root.F_NO==ft ){
            // Flat with the specified rent found
            if (root.left == null ) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }// Node with two children: get the in-order successor (smallest in the right subtree)
            root.Rent = minValue(root.right);
            // Delete the in-order successor
            root.right = deleteFlatByRent(root.right, root.Rent,ft,un,ph);
        }
        return root;
}
   int minValue(Node node) {
        int minValue = node.Rent;
        while (node.left != null) {
            minValue = node.left.Rent;
           node = node.left;
        }
        //int minValue;
return minValue;
    }//to update the rent of flat
void update(Node root,int fn,int re,String un,long ph) {
          Node curr=root;
          while(curr!=null) {
               if(curr.Rent == re &&curr.F_NO==fn && curr.admin==un) {
            	   System.out.println("\nEnter the New Rent :");
            	   int m=s.nextInt();
                    System.out.println("\n                                    _____________________________________________________________________________________________________\n");

                    System.out.println("                                                                              Rent Updated Successfully!                                   ");

                    System.out.println("                                    _____________________________________________________________________________________________________\n\n");

                     curr.Rent=m;
                    break;               }
               if( curr.Rent >re) {
                    curr=curr.left;               }

               else if( curr.Rent <re) {
                    curr=curr.right;               }          }
          if(curr==null) {
             System.out.println("\n                                    _____________________________________________________________________________________________________\n");

               System.out.println("                                                                              Sorry!!!! This Flat Is Not Register                  ");

               System.out.println("                                    _____________________________________________________________________________________________________\n\n");
          }      }
      void printt() {
        System.out.println(" ______________________________________________________________________________________________________________________________\n");

           System.out.format(" %7s  %7s %10s %21s  %11s  %18s  %15s %19s","Sr.NO","Flat NO.","Category","Customer Name","Rent","Aadhar NO.","Contact NO.","Location\n");

          System.out.println(" -------------------------------------------------------------------------------------------------------------------------------\n");
     }      // view the flat details
      void viewC(String un,long ph){
    	  if (root == null) {
                    System.out.println("\n                                    _____________________________________________________________________________________________________\n");

                    System.out.println("                                                                             You Not Added Any Aparment                  ");

                    System.out.println("                                    _____________________________________________________________________________________________________\n\n");
                  return;
              }
              Stack<Node>st=new Stack<>();
              Node curr=root;
            int i=0;
              while(!st.isEmpty() || curr!=null){
                 if(curr!=null){
                             st.push(curr);
                             curr=curr.left;
                             }
                 else{
          curr=st.pop();
      if(curr.admin==un){
        i++;
        if(i==1) {
printt();
        }
                if(curr.IS_OP) {
                   System.out.format("%7s %7s %10s %23s %14s %18s %15s %21s ",i,curr.F_NO,curr.type,curr.name,curr.Rent,curr.AD_ID,curr.PH_NO,curr.AD);
                   System.out.println("");
                   System.out.println(" --------------------------------------------------------------------------------------------------------------------------------\n"); }
                                if(!curr.IS_OP) {
                                  System.out.format("%7s %7s %10s %23s %14s %13s %15s %21s ",i,curr.F_NO,curr.type,"Not Occupied",curr.Rent,"-","-",curr.AD);
                                  System.out.println();
                  System.out.println(" --------------------------------------------------------------------------------------------------------------------------------\n");
                  }               }
      curr=curr.right;
}}
if(i==0) {
              System.out.println("\n                                    _____________________________________________________________________________________________________\n");

              System.out.println("                                                                             You Not Added Any Aparment                  ");

              System.out.println("                                    _____________________________________________________________________________________________________\n\n");
}
}}
class customer{
Scanner scs=new Scanner(System.in);
admin ob=new admin();
Node root=ob.root;
void menu() {
int ch;
do{
      System.out.println(" ________________________________________________");
      System.out.println("|"+"                      MENU                      "+"|");
      System.out.println(" ________________________________________________");
      System.out.println("|   1.               View All Falts                |");
      System.out.println("|   2.        View Flats In Specific Area         |");
      System.out.println("|   3.            View Flats By Price             |");
      System.out.println("|   4.           View Flats By Category            |");
      System.out.println("|   5.                Book Flat                   |");
      System.out.println("|   6.            Leave Apartment                 |");
      System.out.println("|   7.            GO TO HOME PAGE                 |");
      System.out.println(" ________________________________________________");
     System.out.println("");
     System.out.println("");
      System.out.println("Enter your choice(Numbers) :");
      ch=scs.nextInt();
switch(ch) {
case 1:
allflats();
break;
case 2:
      SearchByArea();
break;
case 3:
      SearchByPrice();
break;
case 4:
      SearchByTypeBST();
break;
case 5:
     if(root!=null) {
      System.out.println("Enter the Flat Number:");
      int s=scs.nextInt();
      System.out.println("Enter the Rent :");
      int r=scs.nextInt();
      book(s,r);}
      else {
           System.out.println("\n                                    _____________________________________________________________________________________________________\n");
         System.out.println("                                                                         Sorry!!! Appartment Are Not Available                  ");
         System.out.println("                                    _____________________________________________________________________________________________________\n\n");
     }
break;
case 6:if(root!=null) {
      System.out.println("Enter the Flat Number:");
      int ft=scs.nextInt();
      System.out.println("Enter the Rent :");
      int rent=scs.nextInt();
      System.out.println("Enter Your Name:");
      scs.nextLine();
      String n=scs.nextLine();
      System.out.println("Enter Your Aadhar Number:");
      long a=scs.nextLong();
     unbook(ft,rent,n,a);}
else {
      System.out.println("\n                                    _____________________________________________________________________________________________________\n");

         System.out.println("                                                                         Sorry!!! Appartment Are Not Available                  ");

          System.out.println("                                    _____________________________________________________________________________________________________\n\n");
}     break;
default:}
}while(ch!=0);
}
void allflats() {
      if (root == null) {
           System.out.println("\n                                    _____________________________________________________________________________________________________\n");
              System.out.println("                                                                         Flats Not Available                  ");
              System.out.println("                                    _____________________________________________________________________________________________________\n\n");

return;
 }
Stack<Node>st=new Stack<>();
 Node curr=root;
int i=0;
while(!st.isEmpty() || curr!=null){
if(curr!=null){
st.push(curr);
curr=curr.left;
}
else{
curr=st.pop();
if( !curr.IS_OP){
      i++;
      if(i==1) {
          print();
      }
       if(curr.RT==-1) {
                         System.out.format("%7s %7s %12s %29s %13s %10s %19s %23s",i,curr.F_NO,curr.type,curr.admin,curr.Rent,"new",curr.A_PH,curr.AD);
                         System.out.println();
                          System.out.println(" -------------------------------------------------------------------------------------------------------------------------------\n");
                          }else {
           System.out.format("%7s %7s %12s %29s %13s %10s %19s %23s",i,curr.F_NO,curr.type,curr.admin,curr.Rent,curr.RT,curr.A_PH,curr.AD);
           System.out.println();
            System.out.println(" -------------------------------------------------------------------------------------------------------------------------------\n");
      }            }                    curr=curr.right;
}}
     if(i==0) {
       System.out.println("\n                                    _____________________________________________________________________________________________________\n");
              System.out.println("                                                                  Sorry Flats Are Not Available In This Category                  ");
              System.out.println("                                    _____________________________________________________________________________________________________\n\n");

    }}
     void SearchByTypeBST() {
              System.out.print("Enter the type for which you are searching a house: ");
              scs.nextLine();
              String typeToSearch = scs.nextLine().toUpperCase();
              searchByType(root, typeToSearch);
          }
          void searchByType(Node root, String typeToSearch) {
            if (root == null) {
                 System.out.println("\n                                    _____________________________________________________________________________________________________\n");

              System.out.println("                                                                                Apartment Are Not Available                  ");

              System.out.println("                                    _____________________________________________________________________________________________________\n\n");
                return;
            }
Stack<Node>st=new Stack<>();
            Node curr=root;
          int i=0;
            while(!st.isEmpty() || curr!=null){
if(curr!=null){
                          st.push(curr);
                   curr=curr.left;
    }
                else{
        curr=st.pop();
    if(curr.type.equals(typeToSearch) && !curr.IS_OP){
      i++;
     if(i==1) {
           print();
     }      /*  if(curr.IS_OP) {
                 System.out.format("%7s %7s %10s %23s %14s %18s %15s",i,curr.F_NO,curr.type,curr.name,curr.Rent,curr.AD_ID,curr.PH_NO,"\n");
                 System.out.println(" ---------------------------------------------------------------------------------------------------\n"); }*/
       if(curr.RT==-1) {
             System.out.format("%7s %7s %12s %29s %13s %10s %19s %21s",i,curr.F_NO,curr.type,curr.admin,curr.Rent,"new",curr.A_PH,curr.AD);
             System.out.println();
              System.out.println(" -------------------------------------------------------------------------------------------------------------------------------\n");
}else {
System.out.format("%7s %7s %12s %29s %13s %10s %19s %21s",i,curr.F_NO,curr.type,curr.admin,curr.Rent,curr.RT,curr.A_PH,curr.AD);
System.out.println();
System.out.println(" -------------------------------------------------------------------------------------------------------------------------------\n");
}}
                            curr=curr.right;
    }     }
       if(i==0) {
                 System.out.println("\n                                    _____________________________________________________________________________________________________\n");
               System.out.println("                                                              Sorry Apartment Are Not Available In This Category                  ");
               System.out.println("                                    _____________________________________________________________________________________________________\n\n");
            }
            }
           Node node=ob.root;
         void SearchByArea() {
              System.out.print("Enter the area you want to search for: ");
              scs.nextLine();
              String areaToSearch = scs.nextLine().toUpperCase();
              scs.nextLine();
;             searchByArea(node, areaToSearch);
          }
void print() {
      System.out.println(" _______________________________________________________________________________________________________________________________\n");

     System.out.format(" %7s  %7s %11s %20s  %20s  %10s  %16s %19s ","Sr.NO","Flat NO.","Category","Owner","Rent","Rating","Contact NO","Location\n");

     System.out.println("-------------------------------------------------------------------------------------------------------------------------------\n");
}
          void searchByArea(Node root, String areaToSearch) {
             if (root == null) {
                    System.out.println("\n                                    _____________________________________________________________________________________________________\n");

                     System.out.println("                                                                                Apartment Are Not Available                  ");

                     System.out.println("                                    _____________________________________________________________________________________________________\n\n");
                      return;}
Stack<Node>st=new Stack<>();
                  Node curr=root;
                  int i=0;
while(!st.isEmpty() || curr!=null){
                     if(curr!=null){
                    	 st.push(curr);
curr=curr.left;
}                      else{
             curr=st.pop();
          if(curr.AD.equals(areaToSearch) && !curr.IS_OP){
            i++;
           if(i==1)
                  print(); if(curr.RT==-1) {
                     System.out.format("%7s %7s %12s %29s %13s %10s %19s %21s",i,curr.F_NO,curr.type,curr.admin,curr.Rent,"new",curr.A_PH,curr.AD);
                     System.out.println();
                      System.out.println(" -------------------------------------------------------------------------------------------------------------------------------\n");
   }else {
       System.out.format("%7s %7s %12s %29s %13s %10s %19s %21s",i,curr.F_NO,curr.type,curr.admin,curr.Rent,curr.RT,curr.A_PH,curr.AD);
       System.out.println();
        System.out.println(" -------------------------------------------------------------------------------------------------------------------------------\n");
   }}
                                  curr=curr.right;
          }}
                  if(i==0) {
                       System.out.println("\n                                    _____________________________________________________________________________________________________\n");

                      System.out.println("                                                                    Sorry Apartment Are Not Available In This Area                  ");

                  }System.out.println("                                    _____________________________________________________________________________________________________\n\n");
                          }
          void SearchByPrice() {
           if (root == null) {
                    System.out.println("\n                                    _____________________________________________________________________________________________________\n");

                     System.out.println("                                                                                Apartment Are Not Available                  ");

                     System.out.println("                                    _____________________________________________________________________________________________________\n\n");
                      return;
                  }
              System.out.print("Enter the maximum price, below which you are searching for a house:\n ");
              scs.nextLine();
              int maxPrice = scs.nextInt();
                   Node curr=root;
              boolean found = false;
              Stack<Node>st=new Stack<>();
                          int i=0;
            while(!st.isEmpty() || curr!=null){
               if(curr!=null){
                           st.push(curr);
                   curr=curr.left;}
                else{
        curr=st.pop();
       if(curr.Rent>maxPrice) {
         return;
       }
    if(curr.Rent<=maxPrice && !curr.IS_OP){
       i++;
       if(i==1)
            print();
       if(curr.RT==-1) {
             System.out.format("%7s %7s %12s %29s %13s %10s %19s %21s",i,curr.F_NO,curr.type,curr.admin,curr.Rent,"new",curr.A_PH,curr.AD);
             System.out.println();
              System.out.println(" -------------------------------------------------------------------------------------------------------------------------------\n");
}else  {
System.out.format("%7s %7s %12s %29s %13s %10s %19s %21s",i,curr.F_NO,curr.type,curr.admin,curr.Rent,curr.RT,curr.A_PH,curr.AD);
System.out.println();
System.out.println(" -------------------------------------------------------------------------------------------------------------------------------\n");
}
}                           curr=curr.right;    }}
              if (i==0) {
                         System.out.println("\n                                    _____________________________________________________________________________________________________\n");

                         System.out.println("                                                            Sorry!!!! Apartment Are Not Available Below This Price                 ");

                         System.out.println("                                    _____________________________________________________________________________________________________\n\n");
                  }}
void book(int ft,int re) {
      Node ptr = root;
      boolean found = false;
      while (ptr != null) {
          if (re==ptr.Rent && ptr.F_NO==ft && !ptr.IS_OP) {
              System.out.println("Enter Your Name :\n");
              scs.nextLine();
              String n=scs.nextLine();
              System.out.println("Enter your Phone Number:\n");
              long no=scs.nextLong();
              System.out.println("Enter Your Aadhar Number :\n");
              long an=scs.nextLong();
              ptr.AD_ID=an;
              ptr.PH_NO=no;
              ptr.name=n;
              ptr.IS_OP=true;
              System.out.println("\n                                    _____________________________________________________________________________________________________\n");
               System.out.println("                                                                                 Apartment is Booked                   ");

               System.out.println("                                                                                     Thank you!              ");

               System.out.println("                                    _____________________________________________________________________________________________________\n\n");
found=true;          }
          if (re < ptr.Rent) {
              ptr = ptr.left;
          } else {
              ptr = ptr.right;
          }}
      if (!found) {
        System.out.println("\n                                    _____________________________________________________________________________________________________\n");

          System.out.println("                                                                         Sorry!!!! This Apartment Is Not Found                  ");

          System.out.println("                                    _____________________________________________________________________________________________________\n\n");
      }}
void unbook(int f,int r,String n ,long a) {
        Node ptr = root;
      boolean found = false;
      while (ptr != null) {

          if (r==ptr.Rent && ptr.F_NO==f && ptr.name.equals(n)&& ptr.AD_ID==a) {
             System.out.println("\nPlzzz Rate The Apartment and Services(outoff 5 star):\n");
             int re=scs.nextInt();
             ptr.RT=re;
              ptr.AD_ID=-1;
              ptr.PH_NO=-1;
              ptr.name=null;
              ptr.IS_OP=false;
              System.out.println("\n                                         ______________________________________________ Thank You! ________________________________________n");
              System.out.println("");
found=true;          }
          if (r < ptr.Rent) {
              ptr = ptr.left;
          } else {
              ptr = ptr.right;
          }}
      if (!found) {
        System.out.println("\n                                    _____________________________________________________________________________________________________\n");

          System.out.println("                                                                         Sorry!!!! This Apartment Is Not Found                  ");

          System.out.println("                                    _____________________________________________________________________________________________________\n\n");
}}}
public class miniproject {
public static void main(String[]args)throws Exception {
	Scanner sc=new Scanner(System.in);
    admin obj=new admin();
        boolean flag=true;
      while(flag==true) {
           System.out.println("1.ADMIN \n2.CUSTOMER \n3.To Exit the page \n\nChoose Your Portal:");
           try {
           int ch=sc.nextInt();
     if(ch==1) {
           obj.Login();      }
      else if(ch==2) {
        customer o=new customer();
        o.menu();
        }else if(ch==3) {
   flag=false;
      }else {
          System.out.println("                        =======================================================================================\n");
           System.out.println("                                                                 OOPS\n                                                         Somthing Went Wrong\n                                                              Try Again\n");

          System.out.println("                        =======================================================================================\n");
 flag=true;      }}
      catch(Exception e){
          System.out.println("\n                                        =======================================================================================\n");
           System.out.println("                                                                             OOPS\n                                                                     Somthing Went Wrong\n                                                                          Try Again\n");
           System.out.println("\n                                      =======================================================================================\n");
flag=true;
sc.nextLine();           }}
}}
