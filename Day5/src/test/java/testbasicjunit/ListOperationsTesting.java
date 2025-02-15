package testbasicjunit;

import junit.basicjunittest.ListOperations;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListOperationsTesting {
    @Test
    void testListOperations(){
        ListOperations li = new ListOperations();
        List<Integer> actual = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3,4,5));

        assertEquals(li.addElement(actual,5),expected);
        assertEquals(actual,expected);

    }
}
