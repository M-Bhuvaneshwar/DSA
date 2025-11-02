package Arrays;

public class leetcode {

    public static void main(String[] args) {
        int[] nums1 = { 0,0,0,0,0 };
        int[] nums2 = { -1,0,0,0,0,0,1 };

        int newarr[] = new int[nums1.length + nums2.length];
        for (int i = 0; i < newarr.length; i++) {
            if (i < nums1.length) {
                newarr[i] = nums1[i];
            } else {
                newarr[i] = nums2[i - nums1.length];
            }

        }
        for (int i = 1; i < newarr.length; i++) {
            if (newarr[i - 1] > newarr[i]) {

                while (newarr[i] < newarr[i - 1]) {
                    int temp = newarr[i - 1];
                    newarr[i - 1] = newarr[i];
                    newarr[i] = temp;
                    if (i >=2) {
                        i--;
                        
                    } else {
                        break;
                    }
                }
            }
        }

        int n = newarr.length;
        double median;

        if (n % 2 == 0) {
            int mid = n / 2;
            median = (newarr[mid - 1] + newarr[mid]) / 2.0;
        } else {
            median = newarr[n / 2];
        }
    System.out.println(median);

    }
}
