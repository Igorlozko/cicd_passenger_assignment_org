package ie.PassengerAssignment;

public class Passenger {

    private String title;
    private String name;
    private  String id;
    private  int age;
    private  String phone;

    public Passenger(String Title, String Name, String ID, String Phone, int Age ) {
        this.title=Title;
        this.name=Name;
        this.id=ID;
        this.age=Age;
        this.phone=Phone;
    }

        public String getTitle() {
            String title1 = this.title();
          //  String lowerTitle = this.title.toLowerCase();
            if (this.title.equals("Mr") || this.title.equals("Mrs") || this.title.equals("Ms")) {
                System.out.println("Title selected");
                return this.title;
            } else {
                System.out.println("Error!, You must enter a correct title(Mr/Ms/Mrs). ");
              //  return "Error!, You must enter a correct title. ";
                return this.title;
            }
        }

    private String title() {
        return null;
    }

    public String setTitle(String newTitle) {
            this.title = newTitle;
        return newTitle;
    }


        public String getName(){
            if (this.name.length() <3) {
                System.out.println("Error!, You must enter a Name(min 3 char). ");
                //return "Error!, You must enter a Name. ";
            }
            return this.name;
        }

        public String setName(String newName){
            this.name = newName;
            //System.out.println("Name selected");
            return newName;
        }



        public String getID() {
            int length = this.id.length();
            if (length < 10) {
                System.out.println("the id you have typed is invalid: "+ this.id);
                return "the id you have typed is invalid: "+ this.id;
            }
            return this.id;
        }

        public void setID(String newID) {
            this.id = newID;
        }

    public String getPhone(){
        int length = this.phone.length();
        if(length <=7 || length >=20 ){
            System.out.println("phone you have typed is invalid: " + this.phone);
            return "phone you have typed is invalid: " + this.phone;
        }
        return this.phone;
    }

    public void setPhone(String newPhone) {
        this.phone = newPhone;
    }


    public int getAge(){
            if (this.age < 10) {
                    System.out.println("Too young to fly seat not reserved");
                    return 0;
            } else {
                System.out.println("Seat Reserved(over 16)");
                return age;
            }
    }
    public void setAge(int newAge) {
        this.age = newAge;

    }
}
