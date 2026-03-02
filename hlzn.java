import java.util.Collection;
import java.util.Collections;

public final class hlzn extends hlzt {
    @Override  // hlzt
    protected final Collection b() {
        return Collections.singleton(hlxv.d);
    }

    @Override  // hlzt
    public final boolean[] c(String s) {
        int v = s.length();
        StringBuilder stringBuilder0 = new StringBuilder(v + v);
        int v1 = 0;
        for(int v2 = 0; v2 < v; ++v2) {
            int v3 = s.charAt(v2);
            if(v3 == 0) {
                stringBuilder0.append("bU");
            }
            else if(v3 <= 26) {
                stringBuilder0.append('a');
                stringBuilder0.append(((char)(v3 + 0x40)));
            }
            else if(v3 <= 0x1F) {
                stringBuilder0.append('b');
                stringBuilder0.append(((char)(v3 + 38)));
            }
            else if(v3 == 0x20 || v3 == 36 || v3 == 37 || v3 == 43) {
                stringBuilder0.append(((char)v3));
            }
            else if(v3 <= 44) {
                stringBuilder0.append('c');
                stringBuilder0.append(((char)(v3 + 0x20)));
            }
            else if(v3 <= 57) {
                stringBuilder0.append(((char)v3));
            }
            else if(v3 == 58) {
                stringBuilder0.append("cZ");
            }
            else if(v3 <= 0x3F) {
                stringBuilder0.append('b');
                stringBuilder0.append(((char)(v3 + 11)));
            }
            else if(v3 == 0x40) {
                stringBuilder0.append("bV");
            }
            else if(v3 <= 90) {
                stringBuilder0.append(((char)v3));
            }
            else if(v3 <= 0x5F) {
                stringBuilder0.append('b');
                stringBuilder0.append(((char)(v3 - 16)));
            }
            else if(v3 == 0x60) {
                stringBuilder0.append("bW");
            }
            else if(v3 <= 0x7A) {
                stringBuilder0.append('d');
                stringBuilder0.append(((char)(v3 - 0x20)));
            }
            else {
                if(v3 > 0x7F) {
                    throw new IllegalArgumentException(a.aa(((char)v3), "Requested content contains a non-encodable character: \'", "\'"));
                }
                stringBuilder0.append('b');
                stringBuilder0.append(((char)(v3 - 43)));
            }
        }
        String s1 = stringBuilder0.toString();
        int v4 = s1.length();
        if(v4 > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long after converting to extended encoding, but got " + v4);
        }
        int v5 = 9;
        boolean[] arr_z = new boolean[(s1.length() + 4) * 9 + 1];
        int v6 = hlzm.b;
        hlzn.h(arr_z, 0, v6);
        while(v1 < v4) {
            hlzn.h(arr_z, v5, hlzm.a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(s1.charAt(v1))]);
            ++v1;
            v5 += 9;
        }
        int v7 = hlzn.g(s1, 20);
        hlzn.h(arr_z, v5, hlzm.a[v7]);
        hlzn.h(arr_z, v5 + 9, hlzm.a[hlzn.g((s1 + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(v7)), 15)]);
        hlzn.h(arr_z, v5 + 18, v6);
        arr_z[v5 + 27] = true;
        return arr_z;
    }

    private static int g(String s, int v) {
        int v1 = s.length() - 1;
        int v2 = 0;
        int v3 = 1;
        while(v1 >= 0) {
            v2 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(s.charAt(v1)) * v3;
            ++v3;
            v3 = v3 <= v ? v3 + 1 : 1;
            --v1;
        }
        return v2 % 0x2F;
    }

    private static void h(boolean[] arr_z, int v, int v1) {
        for(int v2 = 0; true; ++v2) {
            boolean z = true;
            if(v2 >= 9) {
                break;
            }
            if((1 << 8 - v2 & v1) == 0) {
                z = false;
            }
            arr_z[v + v2] = z;
        }
    }
}

