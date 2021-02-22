
import com.Sparta.Ben.binarytree.Binarytree;
import com.Sparta.Ben.binarytree.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.hamcrest.MatcherAssert.*;
import org.hamcrest.Matchers;

public class BinaryTreeSortTest {

    @Test
    void name() {
        //Matchers.equalTo();
    }
    @BeforeEach
    void setup(){

    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void Parameter(int number){
        Node node = new Node(number);
        Assertions.assertEquals(number,node.getValue());
        Matchers.equalTo(node.getValue());
    }

    @ParameterizedTest
    @ValueSource(ints = {24, 64, 68,23})
    void Test2(int number){
        Binarytree binarytree = new Binarytree(number);
        Assertions.assertEquals(number,binarytree.getRootElement());
    }



}
