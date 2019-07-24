package mum.domain;

public class Calculator {
    Integer numb1;
    Integer numb2;

    public Calculator() {
    }

    public Calculator(Integer numb1, Integer numb2) {
        this.numb1 = numb1;
        this.numb2 = numb2;
    }

    public Integer getNumb1() {
        return numb1;
    }

    public void setNumb1(Integer numb1) {
        this.numb1 = numb1;
    }

    public Integer getNumb2() {
        return numb2;
    }

    public void setNumb2(Integer numb2) {
        this.numb2 = numb2;
    }
}
