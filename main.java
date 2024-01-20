package Banking_software;

import java.security.Identity;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Scanner;
import java.util.concurrent.Flow.Subscriber;
import java.sql.*;

//=------------------------------------------------------------------------------
public class main {
    public static void main(String[] args) {
        
        class Banking_network {
            int  balance=100,creditM, debitM,idno,contact,user_balance,age;

            String name,Occupation;

            String[] choices = { "*Check_bal", "*creditmon", "*debitmon", "*UPI", "*complaints", "*open_account", "*make_credit_card","*about_you","Apply_for_laoan" };


                void display_balance(){
                System.out.println("your balance:-"+ balance);
            }
                void enterID() {
                Scanner inputid = new Scanner(System.in);
                System.out.println("Enter your ID number:-");
                int indo = inputid.nextInt();
                
                
                if (indo!=55555 && indo!=44444 && indo!=33333 && indo!=22222 && indo!=11111 ){
                    System.out.println("ID not registered.");
                    return;
                }
                display_balance();
    

            }
                void about_you(){
                enterID();
                // display_info();
            }
                void debitmo(){
                enterID();
                Scanner enterAA= new Scanner(System.in);
                System.out.print("Enter the amount you want to dedit:- ");
                debitM=enterAA.nextInt();
                
            
                if(debitM<=balance){
                    balance-=debitM;
                    
                    System.out.println("The amount debited:"+debitM);
                    System.out.println("-_-_-_-_-_-_-_-_-_--_____");
                    System.out.println("Your balance now:"+balance);
                }
                try{
                    if(debitM>balance){
                    
                }
            }
            catch(Exception e){
                System.out.println("Insuficient balance!" + "\n" + "your balance:-" + balance  +"\n"+ "money you want to debit:- "+ debitM);
            }

            }


            void credit(){
                // System.out.println("congratulations on taking the initiative to start the account, you've got 100 on ur account from our side");
                display_balance();
                System.out.println(".......................................");
                Scanner entern= new Scanner(System.in);
                System.out.println("Enter the amount you want to credit:-");
                int creditMoney = entern.nextInt();
                user_balance+=creditMoney;
                System.out.println("Your current balance:-"+ user_balance);
            }

            
            
            void user_balance(){

            }


            void open_account(){
                System.out.println("Fill all the details for opening an account:");
                Scanner enterName= new Scanner(System.in);
                System.out.println("Enter your name:");
                name= enterName.nextLine();
                
                Scanner enterage= new Scanner(System.in);
                System.out.println("Enter your age:");
                age= enterage.nextInt();
                
                if(age<=17){
                        System.out.println("Sorry are bank won't allow people below 18");
                        return;
                }
                
                Scanner enterid= new Scanner(System.in);
                System.out.println("Enter your Indenity(generally its a 5 digit number):");
                idno=enterid.nextInt();
                
                
                if(idno<5){
                    System.out.println("Invalid id no., recheck it again!");
                    return;// here it will return the statement and work as the break keyword.

                }
                
                Scanner enterphno= new Scanner(System.in);
                System.out.println("Enter your Concact number(must be a 10digit number):");
                contact=enterphno.nextInt();
                    
                if(contact<9){
                        System.out.println("Invalid contact number");
                        return;
                    
                }
            

                Scanner enterOCC= new Scanner(System.in);
                System.out.println("Enter your occupation:");
                Occupation= enterOCC.nextLine();
            }
                

            void makecomplain(){
                System.out.println("We are here to assist you, file/choose a complain's category that meets your complain:-");

                //----------------------------db
                Scanner cpl = new Scanner(System.in);
                System.out.println("Enter your conmplain:-");

                String cp= cpl.nextLine();


                // table user 
                Scanner type = new Scanner(System.in);
                System.out.println("Tell us more about it(Type something)");
                String tp= type.nextLine();


                System.out.println("Finding the solution for you complain..--..--..---...");
            }
            
            void make_credit_card(){
               
                Scanner ente= new Scanner(System.in);
                System.out.println("Enter your name:-");
                String name_for_cd= ente.nextLine();
               
                Scanner entee= new Scanner(System.in);
                System.out.println("Enter your age(Don't enter if you are <=17):-");
                int age_for_cd= entee.nextInt();

                Scanner enteee= new Scanner(System.in);
                System.out.println("Enter your gender:-");
                String gender_for_cd= enteee.nextLine();

                Scanner entara= new Scanner(System.in);
                System.out.println("Enter your monthly income:-");
                int income= entara.nextInt();
               
               
                if(income<100000){
                    System.out.println("Your income doesn't meet the eligibility citeria");
                    return;
                }

               

               Scanner eScanner= new Scanner(System.in);
               System.out.println("Enter otp for completing the authentication(usually a 4 digit number):-");
               int opt = eScanner.nextInt();

               
                if(opt<1000||opt>9999 && opt!=4030){
                    System.out.print("Length did'nt; match");
                    
                    return;
                }
               

               System.out.println("Press 1 for reading our guidelines" + "\n"+ "2 for knowing about the benifits and offers");
               
               Scanner entri= new Scanner(System.in);
               System.out.println("Enter a number:-");
               int enterednum = entri.nextInt();

               if(enterednum==1){
                System.out.print("o-0-o-0-o-0-o-0-o-0-o-0-o-0-");
                System.out.println("Thanks for choosing and trusting us.");
                System.out.println("Read the guidelines carefully we did a lot of hardwork in creating and implementing them:-!");
                System.out.println("------------------------------------------)");
                System.out.println("When using a credit card, follow these guidelines for responsible and effective usage. Do's: Always pay your bill on time to avoid late fees and interest charges. Monitor your statements regularly for any unauthorized transactions. Set a budget and use your credit card within your means. Take advantage of rewards programs and cashback offers responsibly. Keep your credit utilization ratio low to maintain a healthy credit score. Don'ts: Avoid making only minimum payments, as it leads to increased interest payments. Refrain from maxing out your credit limit, as it negatively impacts your credit score. Never share your card details with anyone. Resist impulse purchases and prioritize essential expenses. Be cautious of hidden fees and understand the terms of your card agreement. Following these do's and don'ts will help you make the most of your credit card while maintaining financial stability.");
                System.out.println("(-------------------------------------------");
             }
             if(enterednum==2){
                System.out.println("Benifits and offers you will get .");
                System.out.println("++++++++++++++++++$$$$$$$$$$$$$$$$$");
                
                System.out.println("Acquiring a credit card opens up a world of financial opportunities, empowering you with convenience and a plethora of benefits. Unleash the potential of seamless transactions, making every purchase a breeze. Enjoy the luxury of cashless payments, transforming your shopping experience into a delight. With enticing offers like cashback, rewards, and discounts, each transaction becomes a source of joy and savings. Revel in the flexibility to manage your finances with grace, thanks to customizable credit limits. Avail yourself of exclusive perks like travel rewards, airport lounge access, and complimentary insurance coverage. Embrace the security and peace of mind that come with fraud protection and real-time transaction alerts. A credit card isn't just a piece of plastic; it's a gateway to a world of financial freedom and unparalleled advantages.");
                
                System.out.println("----------------$$$$$$$$$$$$$$$$$$");
            }
               Scanner getcreditcard= new Scanner(System.in);
               System.out.println("Enter getcard for procedding: ");
               String card= getcreditcard.nextLine();

               if(card.equals("getcard")){
                System.out.println("You will recieve your credit card soon, for more details(like you card limit(both Transection limit and Single purchase limit.))");

                Scanner enterknow= new Scanner(System.in);
                System.out.println("Enter know more for all the related information above:");
                String more= enterknow.nextLine();

                System.out.println("Single purchase limit:-");
                System.out.println("Single Purchase Limit:\r\n" + //
                        "The single purchase limit on a credit card sets the maximum amount one can spend in a single transaction. It helps control individual transaction amounts, providing security and aligning with the cardholder's financial habits.");

                System.out.println("----------------------------------------------");
                System.out.println("Transaction Limit:\r\n" + //
                        "The transaction limit is the total cap on spending within a specified period, usually monthly. It restricts cumulative charges, promoting responsible card usage and preventing excessive indebtedness. Understanding and managing both limits are crucial for financial prudence.");
                    }
        }
            
        
        
            void display_info(){
                System.out.println("******************");
                
                System.out.println("Congratulation on having a new account, cheers to a new user!:-");
                
                System.out.println("******************");

                System.out.println("Name:-"+ name);
                System.out.println("age:-" + age);
                System.out.println("occupation:-" + Occupation);
                System.out.println("IDentity:-" + idno);
                System.out.println("Contact no:-" + contact);
                System.out.println("Account balance:-" + user_balance);
            }
            void dispChoices() {
                System.out.println("-------Welcome To Your friendly neighbourhood Bank of Maharashtra-----------------");
                System.out.println("What can we do for you ?:-(all the available features are down below)");

                System.out.println("  ");

                for (int i=0; i<choices.length;i++) {
                    System.out.println((i+1) + "\t" + "\n"  + choices[i] );
                }


                System.out.println("  ");
            }
            
            public Banking_network e(){
                dispChoices();
                Scanner enterC= new Scanner(System.in);
                System.out.print("Enter Your choice here:- ");
                String choose=enterC.nextLine();

                
               
                if(choose.equals("check_b")){
                    enterID();
                    
                   
                }
                
                else if(choose.equals("credit")){
                    
                    
                    Scanner enterA= new Scanner(System.in);
                    System.out.print("Enter the amount you want to credit:- ");
                    creditM=enterA.nextInt();
                    
                    
                    
                    // System.out.println(creditM);
                    balance+=creditM;
                    System.out.println("The amount credited:"+creditM);
                    System.out.println("+_+_+_+_+_+_+_+_+_+_____");
                    System.out.print("Your balance now:"+balance);
                
                }
                else if(choose.equals("debit")){
                    
                    debitmo();

                
                }
                
                else if(choose.equals("open_account")){
                    open_account();
                    
                    Scanner enternew= new Scanner(System.in);
                    System.out.print("Enter 'newuser' to get your info and a confirmation from the bank: ");
                    String newuser=enternew.nextLine();
                    if(newuser.equals("newuser")){
                        Scanner enterm =new Scanner(System.in);
                        System.out.println("Do you want to credit money and start the account now?(enter yes or no):- ");
                        String ans= enterm.nextLine();
                        System.out.println("-p -p -p -p -p -p -p");
                        
                        if(ans.equals("yes")){
                            System.out.println("here are some options for crediting money:-");
                            credit();
                            display_info();

                        }
                        else{
                            System.out.println("you entered no, stopping the machine......");
                            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
                            System.out.println("To start your account you need to enter some amount of money.");
                            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
                            
                        }

                    }
                    
                    else{

                        System.out.println("Your will be able to start only when you credit some money in it by being our new user.");
                    }

                }
                else if(choose.equals("about_you")){
                    about_you();
                }
                else if(choose.equals("make_credit_card")){
                    make_credit_card();
                
                    
                    
                }
                else if(choose.equals("Apply for loans")){
                    String [] loans = {"Home_loan","EDU_loan","vehicle_loan"};
                    for(String i:loans){
                        System.out.println(i);
                    }
                    Scanner enter = new Scanner(System.in);
                    System.out.println("Enter your what loan are you intersted in:   ");
                    String loan= enter.nextLine();

                    if(loan.equals("Home_loan")){
                        String [] typol={"FRM","ARM","FHA","DVA","JUMBO_loan"};
                        for(String i:typol){
                            System.out.println(i);
                        }
                        Scanner ent= new Scanner(System.in);
                        System.out.println("Enter typo home loan:");
                        String HL=ent.nextLine();
                        if(HL.equals("FRM")){
                            System.out.println("Showing you the all the details....");
                            System.out.println();
                            System.out.println("A Fixed-Rate Mortgage (FRM) is a type of home loan where the interest rate remains constant for the entire duration of the loan");

                        }
                    }
                else if(choose.equals("Makecomplain")){


                }



                }
                else{
                    System.out.println("Something went wrong!");
                }
                return null;
                
                
            }
        }
    

        Banking_network check = new Banking_network();
        check.e();
    }

}


