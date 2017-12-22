public class ooplab5{
public class myArray {}
    public static void main(String[] args) {
    //    array
        int[] myList;
        myList = new int[5];
        myList[1] = 20;
        myList[3] = 100;
        myList[2] = myList[1] * 5;
        showArray(myList);
        myList[3 - 1] = 500;
        myList[4] = myList[1 + 2] * 10;
        showArray(myList);

    }//main

    private static void showArray(int[] myList) {
        System.out.println(myList[0]);
        System.out.println(myList[1]);
        System.out.println(myList[2]);
        System.out.println(myList[3]);
        System.out.println(myList[4]);
    }

}//class