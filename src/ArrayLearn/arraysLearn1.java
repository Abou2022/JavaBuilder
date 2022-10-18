package ArrayLearn;

public class arraysLearn1 {
    public static void main(String[] args) {

        int[] array1 = {4, 20, 15, 2, 19};

        String[] words = {"Hello", "there", "how", "are", "you?"};

        System.out.println(array1[2]);

        System.out.println(words[1]);

        System.out.println(array1.length);
        System.out.println(words.length);

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        for (int j = 0; j < words.length; j++) {
            System.out.println(words[j]);
        }


                int[] arr1 = {2,4,6,8};
                int[] arr2 = {1,2,3,5};
                //iterate over the first set of numbers
                for (int i = 0; i < arr1.length; i++) {
                    //iterate over the second set of numbers
                    for (int j = 0; j < arr2.length; j++) {
                        //print the product of the current elements from each set
                        System.out.println(arr1[i] * arr2[j]);
                    }
                }
            }
        }

