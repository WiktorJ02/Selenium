package common;

public class User {
    private String userName;
    private String password;
    private String email;
    private String phoneNumber;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;

    }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public static class UserBuilder {

        private String userName;
        private String email;
        private String password;
        private String phoneNumber;

        public UserBuilder(User user) {
            this.userName = user.userName;
            this.email = user.email;
            this.password = user.password;
            this.phoneNumber=user.phoneNumber;

        }

        public UserBuilder() {

        }

        public UserBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }


        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder password(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }



        public User build() {
            User user = new User();
            user.userName = this.userName;
            user.email = this.email;
            user.password = this.password;
            user.phoneNumber = this.phoneNumber;
            return user;
        }
    }

}
