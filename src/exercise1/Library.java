package exercise1;

public class Library {

    private boolean isVIPMember;
    private int fee;
    private int numberOfDays;


    public boolean isVIPMember() {
        return isVIPMember;
    }

    public void setVIPMember(boolean VIPMember) {
        isVIPMember = VIPMember;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    @Override
    public String toString() {
        return "Library{" +
                "isVIPMember=" + isVIPMember +
                ", fee=" + fee +
                ", numberOfDays=" + numberOfDays +
                '}';
    }

    public String  feeTable() {

        if (numberOfDays <= 5 && isVIPMember == true) {
            System.out.println("Late fine is $0.50 for " + numberOfDays + " days late");
        }
        if (numberOfDays > 5 && numberOfDays <= 10 && isVIPMember == false) {
            System.out.println("Late fine is $5.00 for " + numberOfDays + " days late");
        }
        if (numberOfDays > 10 && isVIPMember == true) {
            System.out.println("Late fine is $5.00 for " + numberOfDays + " days late");
        }
        if (numberOfDays > 10 && isVIPMember == false) {
            System.out.println("late fine is $10.00 for " + numberOfDays + " days late");
        }
        if (numberOfDays <= 5 && isVIPMember == false) {
            System.out.println("Late fine is $1.00 for " + numberOfDays + " days late");
        }
        if (numberOfDays >= 6 && numberOfDays <= 10 && isVIPMember == true) {
            System.out.println("Late fine is $2.50 for " + numberOfDays + " days late");
        }

       return "" ;
    }
}

