package inheritance.subjects;


import inheritance.base.Subject;

public class Mathematics extends Subject {

    @Override
    public void teach() {
        System.out.println("I am trying to teach mathematics");
    }

}
