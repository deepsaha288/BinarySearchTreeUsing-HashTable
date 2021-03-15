import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest {
    @Test
    public void givenValue_ToInsertFunction() {
        Node<Integer> nodeOne = new Node<>(56);
        Node<Integer> nodeTwo = new Node<>(30);
        Node<Integer> nodeThree = new Node<>(70);
        BinarySearchTree  binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(nodeOne);
        binarySearchTree.insert(nodeTwo);
        binarySearchTree.insert(nodeThree);
        boolean result = binarySearchTree.root.left.value.equals(30) && binarySearchTree.root.value.equals(56) && binarySearchTree.root.right.value.equals(70);
        Assertions.assertTrue(result);
        binarySearchTree.inorder();
    }
}
