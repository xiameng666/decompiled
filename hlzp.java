import java.util.Collection;
import java.util.Collections;

public final class hlzp extends hlzw {
    @Override  // hlzt
    protected final Collection b() {
        return Collections.singleton(hlxv.h);
    }

    @Override  // hlzt
    public final boolean[] c(String s) {
        int v = s.length();
        switch(v) {
            case 12: {
                try {
                    s = s + hlzv.a(s);
                    break;
                }
                catch(hlxy hlxy0) {
                    throw new IllegalArgumentException(hlxy0);
                }
            }
            case 13: {
                try {
                    if(!hlzv.b(s)) {
                        throw new IllegalArgumentException("Contents do not pass checksum");
                    }
                    break;
                }
                catch(hlxy unused_ex) {
                    throw new IllegalArgumentException("Illegal contents");
                }
            }
            default: {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got " + v);
            }
        }
        hlzp.f(s);
        int v1 = hlzo.a[Character.digit(s.charAt(0), 10)];
        boolean[] arr_z = new boolean[0x5F];
        int[] arr_v = hlzv.b;
        int v2 = hlzp.d(arr_z, 0, arr_v, true);
        for(int v3 = 1; v3 <= 6; ++v3) {
            v2 += hlzp.d(arr_z, v2, hlzv.f[((v1 >> 6 - v3 & 1) == 1 ? Character.digit(s.charAt(v3), 10) + 10 : Character.digit(s.charAt(v3), 10))], false);
        }
        int v4 = v2 + hlzp.d(arr_z, v2, hlzv.c, false);
        for(int v5 = 7; v5 <= 12; ++v5) {
            v4 += hlzp.d(arr_z, v4, hlzv.e[Character.digit(s.charAt(v5), 10)], true);
        }
        hlzp.d(arr_z, v4, arr_v, true);
        return arr_z;
    }
}

