package annotations.exercise;

import java.util.ArrayList;
import java.util.List;

public class SuppressUncheckedWarnings {
    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        List myList = new ArrayList();

    }
}
