package builderpattern;



public class User {
    protected final String FirstName;
    protected final String LastName;
    protected final String Emailaddress;
    protected final String address;
    protected final String phone;
    protected final int age;

    private User(UserBuilder builder){
        this.FirstName = builder.FirstName;
        this.LastName = builder.LastName;
        this.Emailaddress = builder.Emailaddress;
        this.address = builder.address;
        this.phone = builder.phone;
        this.age = builder.age;
    }

    protected static class UserBuilder{
        private String FirstName;
        private String LastName;
        private String Emailaddress;
        private String address;
        private String phone;
        private int age;

        public UserBuilder FirstName(String FirstName){
            this.FirstName = FirstName;
            return this;
        }

        public UserBuilder LastName(String LastName){
            this.LastName = LastName;
            return this;
        }

        public UserBuilder Emailaddress(String Emailaddress){
            this.Emailaddress = Emailaddress;
            return this;
        }

        public UserBuilder address(String address){
            this.address = address;
            return this;
        }

        public UserBuilder phone(String phone){
            this.phone = phone;
            return this;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}