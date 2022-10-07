package model;

public class CalcModel{

    public int calcVal; //data

    public void addTwoNum(int num1, int num2){

        calcVal = num1+num2;
    }

    public int getTotal(){

        return calcVal;
    }
}