import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public final class eqnc {
    public static final eqmz a(String s, eqmx eqmx0) {
        byte[] arr_b;
        String s1;
        if(s == null) {
            throw new eqne();
        }
        try {
            s1 = s.replace(eqnd.b, "");
            arr_b = s1.getBytes("UTF-8");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new eqne(unsupportedEncodingException0);
        }
        if(arr_b.length > 18) {
            arr_b = Arrays.copyOf(arr_b, 18);
            try {
                s1 = new String(arr_b, "UTF-8");
            }
            catch(UnsupportedEncodingException unsupportedEncodingException1) {
                eqnd.a.l(unsupportedEncodingException1);
            }
            eqnd.a.m("%s exceeds max length is %d", new Object[]{s1, ((int)arr_b.length)});
        }
        if(arr_b.length < 18) {
            s1 = s1 + eqnd.b;
        }
        return new eqnd(s1, eqmx0);
    }

    public static final void b(String s, eqmx eqmx0) {
        byte[] arr_b;
        int v;
        eqmx.a.d("Advertising id: %s.", new Object[]{s});
        try {
            v = 5;
            arr_b = s.getBytes("UTF-8");
            if(arr_b.length > 5) {
                goto label_4;
            }
            goto label_7;
        }
        catch(UnsupportedEncodingException unused_ex) {
            return;
        }
    label_4:
        eqmx.a.j("Advertising id is longer than 5 bytes: Quick Start flow.", new Object[0]);
        eqmx0.b[12] = 1;
        v = 10;
    label_7:
        for(int v1 = 0; v1 < arr_b.length && v1 < v; ++v1) {
            eqmx0.b[v1 + 2] = arr_b[v1];
        }
        if(arr_b.length < v) {
            eqmx0.b[arr_b.length + 2] = 0;
        }
    }

    public static final void c(eqoe eqoe0, eqmx eqmx0) {
        eqmx0.b[1] = (byte)eqoe0.k;
    }

    public static final void d(gjpi gjpi0, eqmx eqmx0) {
        eqmx0.b[0] = (byte)gjpi0.h;
    }
}

