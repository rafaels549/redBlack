class Node {
    int data;
    Node left, right, parent;
    boolean color; 

    public Node(int data) {
        this.data = data;
        left = right = parent = null;
        color = true; 
    }
}