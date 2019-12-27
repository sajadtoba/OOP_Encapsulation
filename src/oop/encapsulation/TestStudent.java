package oop.encapsulation;

public class TestStudent {
    public static void main(String[] args) {
        // we need to create an object
        Student st1 = new Student();
        st1.setStName("Afsana");
        st1.setStDOB("08/08/1991");
        st1.setStTution(5000);
        st1.setStGrade("+B");
        System.out.println(st1.getStName()+" " +st1.getStDOB()+"   " + st1.getStTution() +"   "+ st1.getStGrade());


        Student st2 = new Student("Sultan","04/07/1992",0,"B-");
        System.out.println(st2.getStName()+""+st2.getStDOB()+""+st2.getStTution()+""+st2.getStGrade());

        Student st3 = new Student("Sajad","01/01/74",2000,"A");
        System.out.println(st3.getStName()+""+st3.getStDOB()+""+st3.getStTution()+""+st3.getStGrade());
        Student st4 = new Student("Sumaria","01/01/72");
        System.out.println(st4.getStName()+""+st4.getStDOB());



    }
}
