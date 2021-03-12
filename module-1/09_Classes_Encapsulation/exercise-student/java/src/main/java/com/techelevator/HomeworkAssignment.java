package com.techelevator;

public class HomeworkAssignment {

    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;

    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    public String  getLetterGrade(){

        double dblEarnedMarks = this.earnedMarks; // student got
        double dblPossibleMarks = this.possibleMarks; // out of 100
        double dblPercentage = dblEarnedMarks/dblPossibleMarks * 100;
        // 98      /    100


        if(dblPercentage > 90.0 ) {
            return "A";
        }
        else if (dblPercentage>= 80.0 ){
            return "B";
        }
        else if (dblPercentage >= 70 && dblPercentage <80){
            return "C";
        }
        else if(dblPercentage>= 60.0 && dblPercentage < 70){
            return "D";
        } else {
            return "F";
        }

    }


    public int getEarnedMarks() {
        return earnedMarks;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }
}