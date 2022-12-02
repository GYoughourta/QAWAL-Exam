package problems.math;

public class FindLowestDifference {
    /*
     *
     * consider these below two arrays (array1 and array2)
     * find the lowest difference between the two arrays cells
     * hint: the lowest difference between cells is 1
     *
	 */

    public static void main(String[] args) {

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        int x=100;

        for (int a : array1){
            for (int b : array2){
                if (a>b){
                    if ((a-b)<x)
                        x=a-b;
                }else{
                    if((b-a)<x)
                        x=b-a;
                }
            }

        }
        System.out.println("the lowest difference between cells is "+x);

    }
}
