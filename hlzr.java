import java.util.Collection;
import java.util.Collections;

public final class hlzr extends hlzt {
    private static final int[] a;
    private static final int[] b;
    private static final int[][] c;

    static {
        hlzr.a = new int[]{1, 1, 1, 1};
        hlzr.b = new int[]{3, 1, 1};
        hlzr.c = new int[][]{new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};
    }

    @Override  // hlzt
    protected final Collection b() {
        return Collections.singleton(hlxv.i);
    }

    @Override  // hlzt
    public final boolean[] c(String s) {
        int v = s.length();
        if(v % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        }
        if(v > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + v);
        }
        hlzr.f(s);
        boolean[] arr_z = new boolean[v * 9 + 9];
        int v1 = hlzr.d(arr_z, 0, hlzr.a, true);
        for(int v2 = 0; v2 < v; v2 += 2) {
            int v3 = Character.digit(s.charAt(v2), 10);
            int v4 = Character.digit(s.charAt(v2 + 1), 10);
            int[] arr_v = new int[10];
            for(int v5 = 0; v5 < 5; ++v5) {
                int v6 = v5 + v5;
                arr_v[v6] = hlzr.c[v3][v5];
                arr_v[v6 + 1] = hlzr.c[v4][v5];
            }
            v1 += hlzr.d(arr_z, v1, arr_v, true);
        }
        hlzr.d(arr_z, v1, hlzr.b, true);
        return arr_z;
    }
}

