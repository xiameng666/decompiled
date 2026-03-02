public class ggrs extends ggro {
    @Override  // ggro
    public String a(String s) {
        throw null;
    }

    public static char[] b(char[] arr_c, int v, int v1) {
        if(v1 < 0) {
            throw new AssertionError("Cannot increase internal buffer any further");
        }
        char[] arr_c1 = new char[v1];
        if(v > 0) {
            System.arraycopy(arr_c, 0, arr_c1, 0, v);
        }
        return arr_c1;
    }
}

