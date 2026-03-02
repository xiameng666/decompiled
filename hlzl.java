import java.util.Collection;
import java.util.Collections;

public final class hlzl extends hlzt {
    @Override  // hlzt
    protected final Collection b() {
        return Collections.singleton(hlxv.c);
    }

    @Override  // hlzt
    public final boolean[] c(String s) {
        int v = s.length();
        if(v > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + v);
        }
        for(int v1 = 0; v1 < v; ++v1) {
            if("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(s.charAt(v1)) < 0) {
                int v2 = s.length();
                StringBuilder stringBuilder0 = new StringBuilder();
                for(int v3 = 0; v3 < v2; ++v3) {
                    int v4 = s.charAt(v3);
                    switch(v4) {
                        case 0: {
                            stringBuilder0.append("%U");
                            break;
                        }
                        case 0x20: 
                        case 45: 
                        case 46: {
                            stringBuilder0.append(((char)v4));
                            break;
                        }
                        case 0x40: {
                            stringBuilder0.append("%V");
                            break;
                        }
                        case 0x60: {
                            stringBuilder0.append("%W");
                            break;
                        }
                        default: {
                            if(v4 <= 26) {
                                stringBuilder0.append('$');
                                stringBuilder0.append(((char)(v4 + 0x40)));
                            }
                            else if(v4 < 0x20) {
                                stringBuilder0.append('%');
                                stringBuilder0.append(((char)(v4 + 38)));
                            }
                            else if(v4 > 44 && (v4 != 0x2F && v4 != 58)) {
                                if(v4 <= 57) {
                                    stringBuilder0.append(((char)v4));
                                }
                                else if(v4 <= 0x3F) {
                                    stringBuilder0.append('%');
                                    stringBuilder0.append(((char)(v4 + 11)));
                                }
                                else if(v4 <= 90) {
                                    stringBuilder0.append(((char)v4));
                                }
                                else if(v4 <= 0x5F) {
                                    stringBuilder0.append('%');
                                    stringBuilder0.append(((char)(v4 - 16)));
                                }
                                else if(v4 <= 0x7A) {
                                    stringBuilder0.append('+');
                                    stringBuilder0.append(((char)(v4 - 0x20)));
                                }
                                else {
                                    if(v4 > 0x7F) {
                                        throw new IllegalArgumentException("Requested content contains a non-encodable character: \'" + s.charAt(v3) + "\'");
                                    }
                                    stringBuilder0.append('%');
                                    stringBuilder0.append(((char)(v4 - 43)));
                                }
                                break;
                            }
                            else {
                                stringBuilder0.append('/');
                                stringBuilder0.append(((char)(v4 + 0x20)));
                            }
                            break;
                        }
                    }
                }
                s = stringBuilder0.toString();
                v = s.length();
                if(v > 80) {
                    throw new IllegalArgumentException(a.f(v, "Requested contents should be less than 80 digits long, but got ", " (extended full ASCII mode)"));
                }
                break;
            }
        }
        int[] arr_v = new int[9];
        boolean[] arr_z = new boolean[v * 13 + 25];
        hlzl.g(0x94, arr_v);
        int v5 = hlzl.d(arr_z, 0, arr_v, true);
        int[] arr_v1 = {1};
        int v6 = v5 + hlzl.d(arr_z, v5, arr_v1, false);
        for(int v7 = 0; v7 < v; ++v7) {
            hlzl.g(hlzk.a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(s.charAt(v7))], arr_v);
            int v8 = v6 + hlzl.d(arr_z, v6, arr_v, true);
            v6 = v8 + hlzl.d(arr_z, v8, arr_v1, false);
        }
        hlzl.g(0x94, arr_v);
        hlzl.d(arr_z, v6, arr_v, true);
        return arr_z;
    }

    private static void g(int v, int[] arr_v) {
        for(int v1 = 0; true; ++v1) {
            int v2 = 1;
            if(v1 >= 9) {
                break;
            }
            if((1 << 8 - v1 & v) != 0) {
                v2 = 2;
            }
            arr_v[v1] = v2;
        }
    }
}

