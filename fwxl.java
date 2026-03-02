import java.util.List;

public final class fwxl {
    public int[] a;
    public final fwxb b;

    public fwxl(fwxb fwxb0, int[] arr_v, List list0) {
        this.b = fwxb0;
        this.a = new int[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            int[] arr_v1 = this.a;
            arr_v1[v] = list0.indexOf(fwxc.a(arr_v[v]));
        }
    }
}

