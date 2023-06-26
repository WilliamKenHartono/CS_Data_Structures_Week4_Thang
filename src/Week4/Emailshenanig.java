package Week4;
import java.util.Scanner;
import java.util.LinkedList;
public class Emailshenanig {
    public static void main(String[]args){
        LinkedList<String> name = new LinkedList<String>();
        LinkedList<Long> phoneNumber = new LinkedList<Long>();
        LinkedList<String> email = new LinkedList<String>();
        Scanner scanner = new Scanner(System.in);
        String tempName;
        long tempNum;
        String tempEmail;
        int index;
        boolean done = false;

        while(done == false){
            System.out.println("******************");
            System.out.println("(A)dd");
            System.out.println("(D)elete");
            System.out.println("(E)mail Search");
            System.out.println("(P)rint List");
            System.out.println("******************");
            System.out.println("Enter a command: ");
            String menu = scanner.nextLine();
            switch (menu){
                case "A":
                    System.out.println("Enter Name: ");
                    tempName = scanner.nextLine();
                    name.add(tempName);

                    System.out.println("Enter Phone Number: ");
                    tempNum= scanner.nextLong();
                    phoneNumber.add(tempNum);
                    scanner.nextLine();

                    System.out.println("Enter Email Address: ");
                    tempEmail = scanner.nextLine();
                    email.add(tempEmail);

                    break;
                case "D":
                    System.out.println("Enter Name: ");
                    tempName = scanner.nextLine();
                    if(name.contains(tempName)){
                        index = name.indexOf(tempName);
                        name.remove(tempName);
                        phoneNumber.remove(index);
                        email.remove(index);
                        break;
                    }
                    System.out.println("Error");
                    break;
                case "E":
                    System.out.println("Search Email: ");
                    tempEmail = scanner.nextLine();
                    if(email.contains(tempEmail)){
                        index=email.indexOf(tempEmail);
                        System.out.println("Name: " + name.get(index));
                        System.out.println("Phone Number: " + phoneNumber.get(index));
                        System.out.println("Email: "+ email.get(index));
                        break;
                    }
                    System.out.println("Error");
                    break;
                case "P":
                    System.out.println(name);
                    System.out.println(phoneNumber);
                    System.out.println(email);
                case "S":
                    System.out.println("Enter name: ");
                    tempName = scanner.nextLine();
                    if (name.contains(tempName)){
                        index = name.indexOf(tempName);
                        System.out.println("Name: " + name.get(index));
                        System.out.println("Phone Number: " + phoneNumber.get(index));
                        System.out.println("Email: " + email.get(index));
                    }
                    System.out.println("Error");
                    break;
                case "Q":
                    done = true;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }
}
