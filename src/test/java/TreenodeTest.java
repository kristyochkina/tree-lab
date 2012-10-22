import com.labatree.TreeNode;
import org.junit.Test;


import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: Kristina
 * Date: 22.10.12
 * Time: 21:46
 * To change this template use File | Settings | File Templates.
 */


public class TreenodeTest {
    @Test
    public void shouldHasEmptyLeftAndRightChild() {
        TreeNode node = new TreeNode();

        TreeNode leftChild = node.getLeftChild();
        TreeNode rightChild = node.getRightChild();

        assertNull("left child", leftChild);
        assertNull("right child", rightChild);
    }
}
