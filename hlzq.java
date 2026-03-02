import java.util.Collection;
import java.util.Collections;

public final class hlzq extends hlzw {
    @Override  // hlzt
    protected final Collection b() {
        return Collections.singleton(hlxv.g);
    }

    @Override  // hlzt
    public final boolean[] c(String s) {
        int v = s.length();
        switch(v) {
            case 7: {
                try {
                    s = s + hlzv.a(s);
                    break;
                }
                catch(hlxy hlxy0) {
                    throw new IllegalArgumentException(hlxy0);
                }
            }
            case 8: {
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
                throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got " + v);
            }
        }
        hlzq.f(s);
        boolean[] arr_z = new boolean[67];
        int[] arr_v = hlzv.b;
        int v1 = hlzq.d(arr_z, 0, arr_v, true);
        for(int v2 = 0; v2 <= 3; ++v2) {
            v1 += hlzq.d(arr_z, v1, hlzv.e[Character.digit(s.charAt(v2), 10)], false);
        }
        int v3 = v1 + hlzq.d(arr_z, v1, hlzv.c, false);
        for(int v4 = 4; v4 <= 7; ++v4) {
            v3 += hlzq.d(arr_z, v3, hlzv.e[Character.digit(s.charAt(v4), 10)], true);
        }
        hlzq.d(arr_z, v3, arr_v, true);
        return arr_z;
    }
}

