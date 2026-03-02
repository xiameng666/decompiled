import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

final class cqrx {
    public final byte[] a;
    public int b;
    private final Map c;

    public cqrx() {
        this.b = 0;
        this.a = new byte[1500];
        this.c = new HashMap();
    }

    public final void a(String[] arr_s) {
        int v5;
        Map map0 = this.c;
        int v1 = 0;
        int v2 = 0;
        for(Object object0: map0.entrySet()) {
            int v3 = (int)(((Integer)((Map.Entry)object0).getKey()));
            String[] arr_s1 = (String[])((Map.Entry)object0).getValue();
            if(Arrays.equals(arr_s1, arr_s)) {
                this.f(v3);
                return;
            }
            if(cqsd.e(arr_s1, arr_s) && arr_s1.length > v1) {
                v1 = arr_s1.length;
                v2 = v3;
            }
        }
        if(v1 > 0) {
            for(int v = 0; v < arr_s.length - v1; ++v) {
                this.b(arr_s[v]);
            }
            this.f(v2);
            return;
        }
        int[] arr_v = new int[arr_s.length];
        for(int v4 = 0; true; ++v4) {
            v5 = arr_s.length;
            if(v4 >= v5) {
                break;
            }
            arr_v[v4] = this.b;
            this.b(arr_s[v4]);
        }
        this.d(0);
        int v6 = 0;
        while(v6 < arr_s.length) {
            String[] arr_s2 = new String[v5];
            System.arraycopy(arr_s, v6, arr_s2, 0, v5);
            map0.put(Integer.valueOf(arr_v[v6]), arr_s2);
            ++v6;
            --v5;
        }
    }

    public final void b(String s) {
        byte[] arr_b = s.getBytes(StandardCharsets.UTF_8);
        this.d(arr_b.length);
        this.e(arr_b.length);
        System.arraycopy(arr_b, 0, this.a, this.b, arr_b.length);
        this.b += arr_b.length;
    }

    public final void c(int v) {
        this.e(2);
        int v1 = this.b;
        int v2 = v1 + 1;
        this.b = v2;
        this.a[v1] = (byte)(v >>> 8 & 0xFF);
        this.b = v1 + 2;
        this.a[v2] = (byte)(v & 0xFF);
    }

    public final void d(int v) {
        this.e(1);
        int v1 = this.b;
        this.b = v1 + 1;
        this.a[v1] = (byte)(v & 0xFF);
    }

    private final void e(int v) {
        if(1500 - this.b >= v) {
            return;
        }
        throw new IOException();
    }

    private final void f(int v) {
        this.c(v | 0xC000);
    }
}

