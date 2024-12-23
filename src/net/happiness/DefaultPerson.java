package net.happiness;

public class DefaultPerson implements Person {

    private final String firstName;
    private final String lastName;

    protected Integer age;
    protected String phoneNumber;
    protected String address;

    public DefaultPerson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private DefaultPerson(Builder builder) {
        this(builder.getFirstName(), builder.getLastName());
        this.phoneNumber = builder.getPhoneNumber();
        this.address = builder.getAddress();
        this.age = builder.getAge();
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    static class Builder extends DefaultPerson {

        public Builder(String firstName, String lastName) {
            super(firstName, lastName);
        }

        public Builder phone(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new DefaultPerson(this);
        }

    }

}
