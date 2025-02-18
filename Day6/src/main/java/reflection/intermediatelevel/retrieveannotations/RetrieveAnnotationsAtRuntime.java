package reflection.intermediatelevel.retrieveannotations;

import java.lang.reflect.Method;

public class RetrieveAnnotationsAtRuntime {
    public static void main(String[] args) throws Exception{
        Book book = new Book();
        Class<?> cls = book.getClass();

        Method method = cls.getMethod("myMethod");

        if(method.isAnnotationPresent(Author.class)){
            Author author = method.getAnnotation(Author.class);
            System.out.println(author.name());
        }
        method.invoke(book);
    }
}
