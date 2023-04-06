/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addreval_050323;

/**
 *
 * @author addreval
 */
public class StudentRecord {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private  static int studentCount;
     
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address =address;
    }
    public int getAge(){
        return age;
    }
    public void setAddress(int age){
        this.age =age;
    }
    public double getMathGrade(){
        return mathGrade;
    }
    public void setMethGrade(double mathGrade){
        this.mathGrade =mathGrade;
    } public double getScienceGrade(){
        return scienceGrade;
    }
    public void setScienceGrade(double scienceGrade){
        this.scienceGrade =scienceGrade;
    }
     public double getAverage(){
        return average;
    }
    
}
