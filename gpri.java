import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class gpri {
    public final byte[] a;
    public int b;
    public int c;
    private final Map d;

    public gpri(byte[] arr_b) {
        this.d = new HashMap();
        this.b = 0;
        this.c = -1;
        this.a = arr_b;
    }

    public final void a(int v) {
        if(1500 - this.b >= v) {
            return;
        }
        throw new IOException();
    }

    public final void b(byte[] arr_b) {
        this.a(arr_b.length);
        System.arraycopy(arr_b, 0, this.a, this.b, arr_b.length);
        this.b += arr_b.length;
    }

    public final void c(String[] arr_s) {
        int[] arr_v;
        Map map0 = this.d;
        int v = 0;
        int v1 = 0;
        for(Object object0: map0.entrySet()) {
            int v2 = (int)(((Integer)((Map.Entry)object0).getKey()));
            String[] arr_s1 = (String[])((Map.Entry)object0).getValue();
            if(gpqj.b(arr_s1, arr_s)) {
                this.f(v2);
                return;
            }
            if(gprm.h(arr_s1, arr_s) && arr_s1.length > v) {
                v = arr_s1.length;
                v1 = v2;
            }
        }
        if(v > 0) {
            arr_v = this.g(arr_s, arr_s.length - v);
            this.f(v1);
        }
        else {
            arr_v = this.g(arr_s, arr_s.length);
            this.e(0);
        }
        int v3 = arr_s.length;
        int v4 = 0;
        while(v4 < arr_s.length - v) {
            String[] arr_s2 = new String[v3];
            System.arraycopy(arr_s, v4, arr_s2, 0, v3);
            map0.put(Integer.valueOf(arr_v[v4]), arr_s2);
            ++v4;
            --v3;
        }
    }

    public final void d(int v) {
        this.a(2);
        int v1 = this.b;
        int v2 = v1 + 1;
        this.b = v2;
        this.a[v1] = (byte)(v >>> 8 & 0xFF);
        this.b = v1 + 2;
        this.a[v2] = (byte)(v & 0xFF);
    }

    public final void e(int v) {
        this.a(1);
        int v1 = this.b;
        this.b = v1 + 1;
        this.a[v1] = (byte)(v & 0xFF);
    }

    private final void f(int v) {
        this.d(v | 0xC000);
    }

    private final int[] g(String[] arr_s, int v) {
        int[] arr_v = new int[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_v[v1] = this.b;
            byte[] arr_b = arr_s[v1].getBytes(StandardCharsets.UTF_8);
            this.e(arr_b.length);
            this.b(arr_b);
        }
        return arr_v;
    }
}

