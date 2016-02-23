package sy.rest.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String employeeidCard;

    private String name;

    private String gender;

    private String identityCard;

    private String address;

    private String tel;

    private Date entryDate;

    private Date leaveDate;

    private String labourContract;

    private String socialInsurance;

    private String hireWay;

    private String bankAccount;

    private String bankName;

    private Integer workclothsMark;

    private Integer mealcardMark;

    private Integer gateMark;

    private Integer dormitoryMark;

    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeeidCard() {
        return employeeidCard;
    }

    public void setEmployeeidCard(String employeeidCard) {
        this.employeeidCard = employeeidCard == null ? null : employeeidCard.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard == null ? null : identityCard.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }

    public String getLabourContract() {
        return labourContract;
    }

    public void setLabourContract(String labourContract) {
        this.labourContract = labourContract == null ? null : labourContract.trim();
    }

    public String getSocialInsurance() {
        return socialInsurance;
    }

    public void setSocialInsurance(String socialInsurance) {
        this.socialInsurance = socialInsurance == null ? null : socialInsurance.trim();
    }

    public String getHireWay() {
        return hireWay;
    }

    public void setHireWay(String hireWay) {
        this.hireWay = hireWay == null ? null : hireWay.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public Integer getWorkclothsMark() {
        return workclothsMark;
    }

    public void setWorkclothsMark(Integer workclothsMark) {
        this.workclothsMark = workclothsMark;
    }

    public Integer getMealcardMark() {
        return mealcardMark;
    }

    public void setMealcardMark(Integer mealcardMark) {
        this.mealcardMark = mealcardMark;
    }

    public Integer getGateMark() {
        return gateMark;
    }

    public void setGateMark(Integer gateMark) {
        this.gateMark = gateMark;
    }

    public Integer getDormitoryMark() {
        return dormitoryMark;
    }

    public void setDormitoryMark(Integer dormitoryMark) {
        this.dormitoryMark = dormitoryMark;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
   
//    private Integer id;
//    private String employeeidCard;
//    private String name;
//    private String gender;
//    private String identityCard;
//    private String address;
//    private String tel;
//    private Date entryDate;
//    private Date leaveDate;
//    private String labourContract;
//    private String socialInsurance;
//    private String hireWay;
//    private String bankAccount;
//    private String bankName;
//    private Integer workclothsMark;
//    private Integer mealcardMark;
//    private Integer gateMark;
//    private Integer dormitoryMark;
//    private String note;
    
    @Override
    public String toString() {
        return String.format(
                "Employee[" +
                "id=%d, employeeidCard='%s',name='%s',gender='%s'," +
                "identityCard=%s, address='%s',tel='%s'," +
                "labourContract=%s, socialInsurance='%s',hireWay='%s',bankAccount='%s',bankName='%s'," +
                "workclothsMark=%d, mealcardMark='%d',gateMark='%d',dormitoryMark='%d',note='%s'," +
                "]",
                id, employeeidCard ,name,gender,
                identityCard, address, tel, 
                labourContract, socialInsurance, hireWay, bankAccount, bankName,
                workclothsMark, mealcardMark, gateMark, dormitoryMark, note
        		);
    }
    
}