import java.util.List;

public final class hkx {
    public static final void a(List list0, List list1) {
        if(list1 == null) {
            if(list0.size() >= 2) {
                return;
            }
            throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
        }
        if(list0.size() == list1.size()) {
            return;
        }
        throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
    }

    public static final int[] b(List list0) {
        int v = list0.size();
        int[] arr_v = new int[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_v[v1] = hln.b(((hll)list0.get(v1)).j);
        }
        return arr_v;
    }
}

