import java.util.List;

public final class fcwi {
    public static byte[] a(List list0) {
        if(list0 == null) {
            return new byte[0];
        }
        int v1 = list0.size();
        byte[] arr_b = new byte[v1];
        for(int v = 0; v < v1; ++v) {
            fcwo fcwo0 = (fcwo)list0.get(v);
            arr_b[v] = (byte)(fcwo0.a * 3 + fcwo0.b + 49);
        }
        return arr_b;
    }
}

