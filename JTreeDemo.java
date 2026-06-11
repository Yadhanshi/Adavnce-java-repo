//Program 1.46

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.JTree;

public class JTreeDemo
{
    public  JTreeDemo()
    {
        JFrame jframe = new JFrame("Swing Aapplication");
        jframe.setSize(300,125);
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        DefaultMutableTreeNode topNode = new DefaultMutableTreeNode("McGrawHill Education");
        DefaultMutableTreeNode bookOne = new DefaultMutableTreeNode("C++");
        DefaultMutableTreeNode bookTwo = new DefaultMutableTreeNode("JAVA");
        DefaultMutableTreeNode bookThree = new DefaultMutableTreeNode("PYTHON");
        topNode.add(bookOne);
        topNode.add(bookTwo);
        topNode.add(bookThree);
        JTree mainTree = new JTree(topNode);
        mainTree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        jframe.setContentPane(mainTree);
        jframe.setVisible(true);
    }
    public static void main(String[] args)
    {
        new JTreeDemo();
    }
}
