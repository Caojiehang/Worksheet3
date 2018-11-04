/**
* @Author: Jiehang CAO
* @Description:
* @Date: 7:24 PM 2018/10/20
*/
public class Exercise2 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{3,2,1},{4,5,1},{5,2,0},{6,4,1}}; //rectangle arrays
        int[][] b = {{1,3,3},{3,2},{4,5},{5,2,1},{6,3,3}};// no rectangle arrays
        System.out.println(Rectangle(a));
        System.out.println(Rectangle(b));

    }

    /**
     *
     * @param a
     * @return
     */
    public static boolean Rectangle(int[][] a) {
        boolean isRectangle = false;
        for(int i = 0;i<a.length -1;i++) {
            for (int j = 0; j < a.length - 1 - i;j++) {
                if (a[j].length == a[j + 1].length) {
                    isRectangle = true;
                } else {
                    isRectangle = false;
                }
            }
        }
        return isRectangle;
    }
}
