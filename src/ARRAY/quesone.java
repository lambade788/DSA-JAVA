package ARRAY;
//Q1: Given an array of marks of students, if the mark of any student is less than 35
//print its roll number. [roll number here refers to the index of the array.]

public class quesone {
    public static void main(String[] args) {

        int marks[] = {34,56,77,45,89,77,32,34,99};

        System.out.println("Marks lower than 35 are at these index: ");
        for (int i=0; i < marks.length;i++){
            if(marks[i] < 35)
                System.out.println("Index: "+i);

        }
    }
}
