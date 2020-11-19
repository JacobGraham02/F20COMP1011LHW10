package Models;

import java.time.LocalDate;
import java.time.Period;

public class Customer {
    private String gender, firstName, lastName;
    private String province, bloodType;
    private LocalDate birthday;

    public Customer(String gender, String firstName, String lastName, String province, String bloodType, String birthday) {
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.province = province;
        this.bloodType = bloodType;
        setBirthday(birthday);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
            this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setbloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        //'12/23/1989'
        String[] birthdayInfo = birthday.split("/");
        int month = Integer.parseInt(birthdayInfo[0]);
        int day = Integer.parseInt(birthdayInfo[1]);
        int year = Integer.parseInt(birthdayInfo[2]);

        this.birthday = LocalDate.of(year, month, day);
    }

    public int getAge()
    {
        return Period.between(birthday, LocalDate.now()).getYears();
    }

    public String toString()
    {
        return String.format("%s %s age:%2d   gender: %s ",firstName, lastName,
                                    getAge(), gender);
    }
}
