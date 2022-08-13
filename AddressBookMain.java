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


    //when ever constructor called
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
        System.out.println("Welcome to AddressBook");
        Scanner sc = new Scanner(System.in);

        int ch;
        do{
            System.out.println("1.INSERT ");
            System.out.println("2.DISPLAY ");
            System.out.print("Enter Your Choice ");
            ch = sc.nextInt();

        }while (ch!=0);
    }
}
