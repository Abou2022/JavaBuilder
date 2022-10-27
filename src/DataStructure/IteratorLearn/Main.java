package DataStructure.IteratorLearn;

public class Main {

    public static void main(String[] args) {
        int[] intArr = new int[]{48,21,77,20};
        System.out.println("Standard For-Loop [Array]");

        for (int i = 0; i < intArr.length; i++){
            System.out.println(intArr[i]);
        }
        System.out.println();

        System.out.println("Enhanced For Loop [Array]");
        for(int myArr : intArr){
            System.out.println(myArr);
        }

        NodeStack ns = new NodeStack();
        ns.push(48);
        ns.push(21);
        ns.push(77);
        ns.push(15);

        System.out.println("Enhanced For Loop [NodeStack]");
        for (Node n : ns){
            System.out.println(n);
        }
    }
}
