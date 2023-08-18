import mypackage.*;

public class Main {
    public static void main(String[] args) {
        // for (int i = 0; i <= 5; i++) {
        //     LPAStudent s = new LPAStudent("S923000", switch (i) {
        //         case 1 -> "Mary";
        //         case 2 -> "Carol";
        //         case 3 -> "Tim";
        //         case 4 -> "Harry";
        //         case 5 -> "Lisa";
        //         default -> "Anonymous";
        //     }, "05/11/1985", "Java Masterclass");

        //     System.out.println(s);
        // }

        Student pojoStudent = new Student("S923006", "Ann", "05/11/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill", "05/11/1985", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP EXam 829");
        // recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829");
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.studentName() + "is taking " + recordStudent.studentClass());

    }
}
