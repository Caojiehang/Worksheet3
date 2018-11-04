
/**
* @Author: Jiehang CAO
* @Description:
* @Date: 7:17 PM 2018/10/20
*/
public class Exercise1 {
	public static void main(String[] args) {
		int[] b = {1,2,3};
		int[] c = {1,5,3};
		int[] d = {7,4,3};
		int[] e = {-1,-2,-3};
		int[] f = {-5};
		System.out.println(max(b));
		System.out.println(max(c));
		System.out.println(max(d));
		System.out.println(max(e));
		System.out.println(max(f));

	}

	/**
	 * bubble sort
	 * @param a
	 * @return
	 */
	public static int max(int[] a) {
		int max = 0;
		int j = a.length;
		for(int i = 0; i< j-1;i++) {
			for (int k = 0; k < j - 1 - i; k++) {
				if (a[k + 1] > a[k]) {
					int temp = a[k];
					a[k] = a[k + 1];
					a[k + 1] = temp;
				}
			}
		}
	   max = a[0];
	   return max;
	}
}