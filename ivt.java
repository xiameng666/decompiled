import java.util.Arrays;

public final class ivt {
    public long[] a;
    public long[] b;
    public int c;

    public ivt() {
        this.a = new long[0xC0];
        this.b = new long[0xC0];
    }

    public final void a(int v, int v1, int v2, int v3, int v4, int v5, boolean z, boolean z1) {
        long[] arr_v = this.a;
        int v6 = this.c;
        this.c = v6 + 3;
        if(arr_v.length <= v6 + 3) {
            int v7 = Math.max(arr_v.length + arr_v.length, v6 + 3);
            long[] arr_v1 = Arrays.copyOf(arr_v, v7);
            ibuq.e(arr_v1, "copyOf(...)");
            this.a = arr_v1;
            long[] arr_v2 = Arrays.copyOf(this.b, v7);
            ibuq.e(arr_v2, "copyOf(...)");
            this.b = arr_v2;
        }
        long[] arr_v3 = this.a;
        arr_v3[v6] = ((long)v2) & 0xFFFFFFFFL | ((long)v1) << 0x20;
        arr_v3[v6 + 1] = ((long)v3) << 0x20 | ((long)v4) & 0xFFFFFFFFL;
        arr_v3[v6 + 2] = ((long)z1) << 0x3F | ((long)z) << 62 | 0x2000000000000000L | ((long)(v5 & 0x3FFFFFF)) << 26 | ((long)(v & 0x3FFFFFF));
        if(v5 >= 0) {
            for(int v8 = v6 - 3; v8 >= 0; v8 += -3) {
                long v9 = arr_v3[v8 + 2];
                if((((int)v9) & 0x3FFFFFF) == (v5 & 0x3FFFFFF)) {
                    arr_v3[v8 + 2] = v9 & 0xE00FFFFFFFFFFFFFL | ((long)(v6 - v8 & 0x1FF)) << 52;
                    return;
                }
            }
        }
    }

    public final void b(int v, ibty ibty0) {
        long[] arr_v = this.a;
        int v1 = this.c;
        for(int v2 = 0; v2 < arr_v.length - 2 && v2 < v1; v2 += 3) {
            if((0x3FFFFFF & ((int)arr_v[v2 + 2])) == (v & 0x3FFFFFF)) {
                long v3 = arr_v[v2];
                long v4 = arr_v[v2 + 1];
                ibty0.a(Integer.valueOf(((int)(v3 >> 0x20))), Integer.valueOf(((int)v3)), Integer.valueOf(((int)(v4 >> 0x20))), Integer.valueOf(((int)v4)));
                return;
            }
        }
    }
}

