import android.util.SparseIntArray;
import java.util.Arrays;

public final class atgy {
    static gged_interceptors a(arae arae0, long v) {
        int[] arr_v = glwy.n(arae0.c);
        int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length + 1);
        arr_v1[arr_v1.length - 1] = (int)v;
        Arrays.sort(arr_v1);
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        int v1 = 0;
        while(v1 < arr_v1.length - 1) {
            int v2 = arr_v1[v1];
            ++v1;
            sparseIntArray0.put(v2, arr_v1[v1] - v2);
        }
        ggdy ggdy0 = new ggdy();
        for(Object object0: arae0.c) {
            int v3 = (int)(((Integer)object0));
            ggdy0.i(atlc.c(v3, sparseIntArray0.get(v3)));
        }
        return ggdy0.h();
    }
}

