import java.util.Collection;
import java.util.Collections;

public final class hlzy extends hlzw {
    @Override  // hlzt
    protected final Collection b() {
        return Collections.singleton(hlxv.p);
    }

    @Override  // hlzt
    public final boolean[] c(String s) {
        int v = s.length();
        switch(v) {
            case 7: {
                try {
                    s = s + hlzv.a(hlzx.c(s));
                    break;
                }
                catch(hlxy hlxy0) {
                    throw new IllegalArgumentException(hlxy0);
                }
            }
            case 8: {
                try {
                    if(!hlzv.b(hlzx.c(s))) {
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
        hlzy.f(s);
        int v1 = Character.digit(s.charAt(0), 10);
        if(v1 != 0 && v1 != 1) {
            throw new IllegalArgumentException("Number system must be 0 or 1");
        }
        int v2 = hlzx.a[v1][Character.digit(s.charAt(7), 10)];
        boolean[] arr_z = new boolean[51];
        int v3 = hlzy.d(arr_z, 0, hlzv.b, true);
        for(int v4 = 1; v4 <= 6; ++v4) {
            v3 += hlzy.d(arr_z, v3, hlzv.f[((v2 >> 6 - v4 & 1) == 1 ? Character.digit(s.charAt(v4), 10) + 10 : Character.digit(s.charAt(v4), 10))], false);
        }
        hlzy.d(arr_z, v3, hlzv.d, false);
        return arr_z;
    }
}

