package com.company;

public class Main {

    public static void main(String[] args) {
	    Student s = new Student("asdf", "ertgsrzs");
        Student s1 = new Student("asdfsg", "dfghd");
        Student s2 = new Student("sdfger", "8it7uj");
        Student s3 = new Student("eyry", "ghrr");
        Student s4 = new Student("asdfvc", "gdsh");

	    s.pridatZnamku(4);
        s.pridatZnamku(3);
        s.pridatZnamku(1);
        s.pridatZnamku(1);
        s.pridatZnamku(5);
        System.out.println(s.prumer());
        System.out.println(Student.getPocetStudentu());
    }
}
