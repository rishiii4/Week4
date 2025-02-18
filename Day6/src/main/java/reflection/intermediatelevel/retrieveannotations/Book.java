package reflection.intermediatelevel.retrieveannotations;

class Book {
    @Author(name = "Devdas")
    public void myMethod() {
        System.out.println("Executing myMethod()");
    }
}

