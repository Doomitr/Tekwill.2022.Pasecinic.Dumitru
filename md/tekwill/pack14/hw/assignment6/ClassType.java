package md.tekwill.pack14.hw.assignment6;

//6. One class with a method or two that return a type of the current class. Hint: using "this".
class ClassType {
    public ClassType getSame(){
        System.out.println("Will be the same object.");
        return this;
    }
    public ClassType getOther(){
        System.out.println("Will still be the same object.");
        return this;
    }
    public ClassType getDifferent(){
        System.out.println("Every time a new one.");
        return new ClassType();
    }

    void message () {
        System.out.println("Random message");
    }
}

class Test6 {
    public static void main(String[] args) {
        ClassType ct = new ClassType();
        System.out.println(ct.getSame());
        System.out.println(ct.getSame());
        System.out.println(ct.getSame());
        System.out.println(ct.getOther());
        System.out.println(ct.getOther());
        System.out.println(ct.getOther());
        System.out.println(ct.getDifferent());
        System.out.println(ct.getDifferent());
        System.out.println(ct.getDifferent());
        System.out.println();

        System.out.println(ct.getSame());
        System.out.println(ct.getOther());
        System.out.println(ct.getDifferent());
        ct.message();
    }
}
