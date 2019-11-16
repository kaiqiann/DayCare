package daycare;

public class Student extends Person {
    private String parentName;
    private String address;
    private String phoneNumber;

    public Student() {
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format(
                "Name: %s, Age: %d, ParentName: %s, PhoneNumber: %s, Address: %s",
                getName(), getAge(), getParentName(), getPhoneNumber(), getAddress()
        );
    }
}
