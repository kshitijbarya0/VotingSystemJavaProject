import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.*;

///*************************** Admin class starts Here *****************************
class Admin{     // class for administrator
    Admin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your id (should be 8 character long) :");
        String id = sc.nextLine();
        System.out.print("Enter Password (should be 8 character long) :");
        String password = sc.nextLine();
        //verity the id and password then
        System.out.print("Enter 1: admin section , 2: candidate section , 3:User section ");
        int c=sc.nextInt();
        switch (c) {
            case 1:
                ////call the new_admin class
                break;
            case 2:
                //call the candidate class
                break;
            case 3:
                //call the user class
                break;
            default: System.out.print("You can Enter only 2 choices");
        }
    }
    class Candidate {     // candiate inner class
        Candidate(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter 1 to add new candidate Or 2 to remove the candidate ");
            int c=sc.nextInt();
            switch(c){
                case 1 ->add_candidate();
                case 2 ->remove_candidate();
                default->System.out.print("You can Enter only 2 choices ");
            }
        }
        void add_candidate() {  //to add a new candidate
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter candidate name and partyname if no party Enter null");
            String name = sc.nextLine(); //Read name
            String party_name = sc.nextLine(); //Read party name
            //add the new candidate
        }
        void remove_candidate()       //function to remove the candidate from list
        { Scanner sc = new Scanner(System.in);
            System.out.print("Enter candidate name and partyname if no party Enter null");
            String name=sc.nextLine(); //Read name
            String party_name=sc.nextLine(); //Read party name
        }
    }

    class new_User{
        new_User(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter 1 to add new Admin Or 2 to remove the Admin ");
            int c=sc.nextInt();
            switch(c){
                case 1 ->add_user();
                case 2 ->remove_user();
                default->System.out.print("You can Enter only 2 choices ");
            }
        }
        void add_user(){ //method to add new admin

        }
        void remove_user(){ //method to remove the admin

        }
    }

        class new_Admin{
            new_Admin(){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter 1 to add new Admin Or 2 to remove the Admin ");
                int c=sc.nextInt();
                switch(c){
                    case 1 ->add_Admin();
                    case 2 ->remove_Admin();
                    default->System.out.print("You can Enter only 2 choices ");
            }
        }
        void add_Admin(){ //method to add new admin

        }
        void remove_Admin(){ //method to remove the admin

        }
    }
}
//*************************Admin class ends Here **********************************************************
//*************************User class starts Here ***********************************************
class User {   //class for user
    User(){
        System.out.print("Want to Apply to be a voter Or want to vote (Apply:1 / Vote:2) :");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch (choice) {
            case 1 -> this.apply();
            case 2 -> this.vote();
            default -> System.out.print("You can only Enter 2 choices ");
        }
    }
    void apply(){
        System.out.print("Enter you Adhar no ");
        Scanner sc=new Scanner(System.in);
        String adhar_no=sc.next();

        // Here we have to write the code to check the age and verity the adhar no
    }
    void vote()
    {  Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Adhar no and voter Id (Space Seperated)");
        String Adhar_no=sc.next();
        String id=sc.next();
        //Now first verify the id and adhar no
//        Here first show the candidates name and parties name then ask the user to enter the choice
    //    And also update the voting status :
        // if user tries to vote again then show the voting status
    }
}
//**********************User class ends Here **************************
//*************Results class Starts Here *********************
class Result{
    Result(){
        //System.out.print("Show the vote of the candidates ");
    }
}
//**********Result class ends Here *********************
//****************************** Main class starts Here *********************
public class Main  {  //Main class to Run the program

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Online Voting System");
        System.out.print("you are admin Or user Enter(1/2) for  Admin:1 ,User:2 ,Result:3 :");
        int ch=sc.nextInt();
        switch (ch) {
            case 1 -> {
                Admin ob1 = new Admin();
            }
            case 2 -> {
                User ob2 = new User();
            }
            case 3 -> {
                Result ob3 = new Result();
            }
            default -> System.out.print("You can Enter only 3 choices (1/2/3)");
        }

    }
}