class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName != null && !firstName.isEmpty() ? firstName : this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName != null && !lastName.isEmpty() ? lastName : this.lastName;
    }

    public String getFullName() {
        if (firstName.isEmpty()) {
            if (lastName.isEmpty()) {
                return "Unknown";
            }
            return lastName;
        } else if (lastName.isEmpty())  {
                return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }
}