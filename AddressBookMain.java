import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
// decalaring instance variables
    String name;
    String address;
    String city;
    String state;
    String number;
    String email;
    int zip;


    //when ever constractor called
    public AddressBookMain(String name, String address, String city, String state, String number, String email, int zip) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.number = number;
        this.email = email;
        this.zip = zip;
    }

// w instance are private so im using gettor method other class
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getNumber() {
        return number;
    }

    public String getEmail() {
        return email;
    }

    public int getZip() {
        return zip;
    }

    // when ever user print instances addressbookmain i want print the value so im using toString method
    @Override
    public String toString() {
        return name+" "+address+" "+city+" "+state+" "+number+" "+email+" "+zip;
    }



    public static void main(String[] args) {
        Collection<AddressBookMain> c = new ArrayList<AddressBookMain>();
        Scanner s = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);



        int ch;
        do{
            System.out.println("1.INSERT ");
            System.out.println("2.DISPLAY ");
            System.out.print("Enter Your Choice ");
            ch = sc.nextInt();


            switch (ch){
                case 1:
                    System.out.println("Enter Name: ");
                    String name = s.nextLine();
                    System.out.println("Enter Address: ");
                    String address = s.nextLine();
                    System.out.println("Enter city: ");
                    String city = s.nextLine();
                    System.out.println("Enter state: ");
                    String state = s.nextLine();
                    System.out.println("Enter Number: ");
                    String number = s.nextLine();
                    System.out.println("Enter email: ");
                    String email = s.nextLine();
                    System.out.println("Enter zip: ");
                    int zip = s.nextInt();

            //here we calling constructor once value is passed in con object will created tat object is added to collection
                    c.add(new AddressBookMain(name,address,city,state,number,email,zip));
                    break;
                case 2:
                    System.out.println(c);
            }

        }while (ch!=0);
    }
}
