import java.util.Collection;
import java.util.Collections;

public final class hlzh extends hlzt {
    private static final char[] a;
    private static final char[] b;
    private static final char[] c;
    private static final char d;

    static {
        char[] arr_c = {'A', 'B', 'C', 'D'};
        hlzh.a = arr_c;
        hlzh.b = new char[]{'T', 'N', '*', 'E'};
        hlzh.c = new char[]{'/', ':', '+', '.'};
        hlzh.d = arr_c[0];
    }

    @Override  // hlzt
    protected final Collection b() {
        return Collections.singleton(hlxv.b);
    }

    @Override  // hlzt
    public final boolean[] c(String s) {
        if(s.length() >= 2) {
            int v = Character.toUpperCase(s.charAt(0));
            int v1 = Character.toUpperCase(s.charAt(s.length() - 1));
            boolean z = hlzg.a(hlzh.a, ((char)v1));
            boolean z1 = hlzg.a(hlzh.b, ((char)v));
            boolean z2 = hlzg.a(hlzh.b, ((char)v1));
            if(hlzg.a(hlzh.a, ((char)v))) {
                if(z) {
                    goto label_16;
                }
                throw new IllegalArgumentException("Invalid start/end guards: " + s);
            }
            if(z1) {
                if(z2) {
                    goto label_16;
                }
                throw new IllegalArgumentException("Invalid start/end guards: " + s);
            }
            if(z || z2) {
                throw new IllegalArgumentException("Invalid start/end guards: " + s);
            }
        }
        s = hlzh.d + s + hlzh.d;
    label_16:
        int v2 = 20;
        for(int v3 = 1; v3 < s.length() - 1; ++v3) {
            if(!Character.isDigit(s.charAt(v3)) && (s.charAt(v3) != 36 && s.charAt(v3) != 45)) {
                if(!hlzg.a(hlzh.c, s.charAt(v3))) {
                    throw new IllegalArgumentException("Cannot encode : \'" + s.charAt(v3) + "\'");
                }
                v2 += 10;
                continue;
            }
            else {
                v2 += 9;
            }
        }
        boolean[] arr_z = new boolean[v2 + (s.length() - 1)];
        int v4 = 0;
        int v5 = 0;
        while(v4 < s.length()) {
            int v6 = Character.toUpperCase(s.charAt(v4));
            if(v4 == 0 || v4 == s.length() - 1) {
                switch(v6) {
                    case 42: {
                        v6 = 67;
                        break;
                    }
                    case 69: {
                        v6 = 68;
                        break;
                    }
                    case 78: {
                        v6 = 66;
                        break;
                    }
                    case 84: {
                        v6 = 65;
                    }
                }
            }
            int v7 = 0;
            while(true) {
                int v8 = 0;
                char[] arr_c = hlzg.a;
                if(v7 < arr_c.length) {
                    if(v6 == arr_c[v7]) {
                        v8 = hlzg.b[v7];
                    }
                    else {
                        ++v7;
                        continue;
                    }
                }
                break;
            }
            int v9 = 1;
            int v10 = 0;
            int v11 = 0;
            while(v11 < 7) {
                arr_z[v5] = v9;
                if((v8 >> 6 - v11 & 1) != 0 && v10 != 1) {
                    ++v10;
                }
                else {
                    v9 ^= 1;
                    ++v11;
                    v10 = 0;
                }
                ++v5;
            }
            if(v4 < s.length() - 1) {
                arr_z[v5] = false;
                ++v5;
            }
            ++v4;
        }
        return arr_z;
    }
}

