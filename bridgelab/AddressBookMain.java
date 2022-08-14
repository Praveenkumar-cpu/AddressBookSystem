package bridgelab;

import java.util.*;

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

        return name + " " + address + " " + city + " " + state + " " + number + " " + email + " " + zip;
    }


    public static void main(String[] args) {
        List<AddressBookMain> c = new ArrayList<AddressBookMain>();
        Scanner s = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);


        int ch;
        do {
            System.out.println("1.INSERT ");
            System.out.println("2.DISPLAY ");
            System.out.println("3.SEARCH ");
            System.out.println("4.DELETE ");
            System.out.println("5.UPDATE");
            System.out.print("Enter Your Choice ");
            ch = sc.nextInt();


            switch (ch) {
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

                    //here we calling constructor once value is passed in constructor  object will created that object is added to collection
                    c.add(new AddressBookMain(name, address, city, state, number, email, zip));
                    break;

                //created instance of iterator it will retrive all object one by one
                case 2:
                    System.out.println("---------------------------------------");
                    Iterator<AddressBookMain> i = c.iterator();
                    while (i.hasNext()) {
                        AddressBookMain e = i.next();
                        System.out.println(e);
                    }
                    System.out.println("------------------------------");
                    break;

               case 3:
                   boolean found = false;
                   System.out.println("Enter name to Search: ");
                   name = s.nextLine();
                   System.out.println("---------------------------------------");
                   i = c.iterator();
                    while (i.hasNext()) {
                    AddressBookMain e = i.next();
                    if (e.getName().equals(name)) {
                        System.out.println(e);
                        found = true;
                    }
                }
                System.out.println("------------------------------");
                    if (!found){
                        System.out.println("Record Not Found");
                    }
                   System.out.println("-----------------------------------------");
                break;
                case 4:
                    found = false;
                    System.out.println("Enter Name to Delete: ");
                    name = s.nextLine();
                    System.out.println("-------------------- -------------------");
                    i = c.iterator();
                    while (i.hasNext()) {
                        AddressBookMain e = i.next();
                        if (e.getName().equals(name)) {
                            i.remove();
                            found = true;
                        }
                    }
                    System.out.println("------------------------------");
                    if (!found){
                        System.out.println("Record Not Found");
                    }else {
                        System.out.println("Record Deleted Successfully");
                    }
                    System.out.println("-----------------------------------------");
                    break;

                case 5:
                    found = false;
                    System.out.println("Enter Name to Update: ");
                    name = s.nextLine();
                    System.out.println("-------------------- -------------------");
                    ListIterator<AddressBookMain>li = c.listIterator();
                    while (li.hasNext()) {
                        AddressBookMain e = li.next();
                        if (e.getName().equals(name)) {
                            System.out.println("Enter new Name :");
                            name = s.nextLine();
                            found = true;
                        }
                    }
                    System.out.println("------------------------------");
                    if (!found){
                        System.out.println("Record Not Found ");
                    }else {
                        System.out.println("Record Updated Successfully");
                    }
                    System.out.println("-----------------------------------------");
                    break;
        }

            }while (ch!=0);

        }
    }
