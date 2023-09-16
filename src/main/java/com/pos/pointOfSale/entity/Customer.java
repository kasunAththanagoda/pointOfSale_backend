package com.pos.pointOfSale.entity;

import com.vladmihalcea.hibernate.type.json.JsonType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name = "customer")
@TypeDefs({
        @TypeDef(name = "json",typeClass = JsonType.class)
})
public class Customer {

    @Id
    @Column(name = "cutomer_id",length = 45)
    private int cutomerId;

    @Column(name = "customer_name",length = 100,nullable = false)
    private String customerName;

    @Column(name = "customer_address",length = 150)
    private String customerAddress;

    @Column(name = "customer_salary",length = 10)
    private double salary;

    @Type(type = "json")
    @Column(name = "contact_numbers",columnDefinition = "json")
    private ArrayList contactNumber;

    @Column(name = "nic",length = 12,unique = true)
    private String nic;

    @Column(name = "activeStatus",columnDefinition = "TINYINT default 1" )
    private boolean activeStatus;

    public Customer() {
    }

    public Customer(int cutomerId, String customerName, String customerAddress, double salary, ArrayList contactNumber, String nic, boolean activeStatus) {
        this.cutomerId = cutomerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.salary = salary;
        this.contactNumber = contactNumber;
        this.nic = nic;
        this.activeStatus = activeStatus;
    }

    public int getCutomerId() {
        return cutomerId;
    }

    public void setCutomerId(int cutomerId) {
        this.cutomerId = cutomerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ArrayList getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(ArrayList contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public boolean isActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cutomerId=" + cutomerId +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", salary=" + salary +
                ", contactNumber=" + contactNumber +
                ", nic='" + nic + '\'' +
                ", activeStatus=" + activeStatus +
                '}';
    }
}
