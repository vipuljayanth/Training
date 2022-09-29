public class Contsructorrs {
        int a;
        int b;
    }

    class Cons {
        Cons(int a) {
            System.out.println("a = " + a);
        }

        Cons() {

        }

        public static void main(String[] args) {
            Cons c1 = new Cons(3);
        }
    }

    class Customers {
        String name;
        int id;
        String contact_no;
        String address;
        public Customers(String name, int id, String contact_no, String address) {
            this.name = name;
            this.id = id;
            this.contact_no = contact_no;
            this.address = address;
        }

        public Customers() {
            System.out.println("From Constructor");
        }

        public Customers(int a) {
            System.out.println("From Constructor" + a);
        }

        public Customers(int a, String b) {
            System.out.println("From Constructor");
        }

        public Customers(String a, int b) {
            System.out.println("From Constructor = " + a + "  " + b);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getContact_no() {
            return contact_no;
        }

        public void setContact_no(String contact_no) {
            this.contact_no = contact_no;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        //Function Overloading-> Function name is same but no of argument is diff or arrangement of argument is diff
        public void display(int a, int b) {
            System.out.println("from display");
        }

        public void display(int a, int b, String c) {
            System.out.println("from display");
        }

        public void display(int a) {
            System.out.println("from display");
        }

        public void display(int a, String b) {
            System.out.println("from display");
        }

        public static void main(String[] args) {
            new Customers(2);
            new Customers("vipul", 5);
            Customers c1 = new Customers();
            c1.func();
            Customers c2 = new Customers();
            c2.setName("jayanth");
            c2.id = 10;
            c2.contact_no = "345435";
            c2.address = "mysuru";
            System.out.println("c2.name = " + c2.name);
            System.out.println("c2.getContactNo() = " + c2.getContact_no());
            System.out.println("c2.getAddress() = " + c2.getAddress());
            Customers c3 = new Customers("udit",101,"34543543","banglore");
            System.out.println("c3.getName() = " + c3.getName());
            System.out.println("c3.getContact() = " + c3.getContact_no());
        }

        void func(){
            Customers c1  =new Customers();
            setData(c1);
            getData(c1);
        }
        void setData(Customers c1){
            c1.setName("vipul");
            c1.setId(12);
            c1.setContact_no("2354454");
            c1.setAddress("karnataka");
        }
        void getData(Customers c1){
            c1.display(6);
            c1.display(4, 5);
            c1.display(6, "hello");
            c1.display(6, 6, "hello");
            System.out.println(c1.getName());
            System.out.println(c1.getId());
        }

    }

