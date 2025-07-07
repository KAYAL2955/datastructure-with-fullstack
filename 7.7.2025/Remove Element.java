public class RemoveElement {
    public static int removeElement(int[] num, int val) {
        int k = 0; 
        for (int i = 0; i < num.length; i++) {
            if (num[i] != val) {
                num[k] = num[i];
                k++;
            }
        }
        return k; 
    }
    public static void main(String[] args) {
        int[] num = {3, 2, 2, 3};
        int val = 3;
        int k = removeElement(num, val);
        System.out.println("Number of elements not equal to " + val + ": " + k);
        System.out.print("Final array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
