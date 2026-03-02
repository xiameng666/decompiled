import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public final class hlzj extends hlzt {
    @Override  // hlzt
    protected final Collection b() {
        return Collections.singleton(hlxv.e);
    }

    @Override  // hlzt
    public final boolean[] c(String s) {
        int v10;
        int v = s.length();
        if(v <= 0 || v > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got " + v);
        }
        int v1 = 0;
        while(v1 < v) {
            int v2 = s.charAt(v1);
            if(v2 != 0xF1 && v2 != 0xF2 && v2 != 0xF3 && v2 != 0xF4 && v2 > 0x7F) {
                throw new IllegalArgumentException("Bad character in input: " + ((char)v2));
            }
            ++v1;
            continue;
        }
        ArrayList arrayList0 = new ArrayList();
        int v3 = 1;
        int v4 = 0;
        int v5 = 0;
        int v6 = 0;
        while(true) {
            int v7 = 103;
            if(v4 >= v) {
                break;
            }
            int v8 = hlzj.g(s, v4);
            int v9 = 0x60;
            if(v8 == 2) {
                if(v6 == 101) {
                    v10 = 101;
                    v6 = 101;
                }
                else {
                    v10 = 100;
                }
            }
            else if(v8 == 1) {
                if(v4 < s.length()) {
                    int v11 = s.charAt(v4);
                    if(v11 < 0x20) {
                        v10 = 101;
                        goto label_73;
                    }
                    else if(v6 == 101) {
                        v10 = v11 >= 0x60 && (v11 < 0xF1 || v11 > 0xF4) ? 100 : 101;
                        v6 = 101;
                        goto label_73;
                    }
                }
                v10 = 100;
            }
            else {
                if(v6 == 101) {
                    if(v8 == 4) {
                        v10 = 101;
                        v6 = 101;
                        goto label_73;
                    }
                    else {
                        v6 = 101;
                    }
                }
                v10 = 99;
                switch(v6) {
                    case 99: {
                        break;
                    }
                    case 100: {
                        if(v8 == 4) {
                            v10 = 100;
                        }
                        else {
                            int v12 = hlzj.g(s, v4 + 2);
                            if(v12 == 1 || v12 == 2) {
                                v10 = 100;
                            }
                            else if(v12 != 4) {
                                int v13 = v4 + 4;
                                int v14;
                                while((v14 = hlzj.g(s, v13)) == 3) {
                                    v13 += 2;
                                }
                                if(v14 == 2) {
                                    v10 = 100;
                                }
                            }
                            else if(hlzj.g(s, v4 + 3) != 3) {
                                v10 = 100;
                            }
                        }
                        break;
                    }
                    default: {
                        if(v8 == 4) {
                            v8 = hlzj.g(s, v4 + 1);
                        }
                        if(v8 != 3) {
                            v10 = 100;
                        }
                    }
                }
            }
        label_73:
            if(v10 == v6) {
                switch(s.charAt(v4)) {
                    case 0xF1: {
                        v9 = 102;
                        break;
                    }
                    case 0xF2: {
                        v9 = 97;
                        break;
                    }
                    case 0xF3: {
                        break;
                    }
                    case 0xF4: {
                        v9 = v6 == 101 ? 101 : 100;
                        break;
                    }
                    default: {
                        switch(v6) {
                            case 100: {
                                v9 = s.charAt(v4) - 0x20;
                                break;
                            }
                            case 101: {
                                int v15 = s.charAt(v4);
                                int v16 = v15 - 0x20;
                                v9 = v16 >= 0 ? v16 : v15 + 0x40;
                                break;
                            }
                            default: {
                                v9 = Integer.parseInt(s.substring(v4, v4 + 2));
                                ++v4;
                            }
                        }
                    }
                }
                ++v4;
            }
            else {
                if(v6 == 0) {
                    switch(v10) {
                        case 100: {
                            v7 = 104;
                            break;
                        }
                        case 101: {
                            break;
                        }
                        default: {
                            v7 = 105;
                        }
                    }
                }
                else {
                    v7 = v10;
                }
                v6 = v10;
                v9 = v7;
            }
            arrayList0.add(hlzi.a[v9]);
            v5 += v9 * v3;
            if(v4 != 0) {
                ++v3;
            }
        }
        arrayList0.add(hlzi.a[v5 % 103]);
        arrayList0.add(hlzi.a[106]);
        int v17 = arrayList0.size();
        int v19 = 0;
        for(int v18 = 0; v18 < v17; ++v18) {
            int[] arr_v = (int[])arrayList0.get(v18);
            for(int v20 = 0; v20 < arr_v.length; ++v20) {
                v19 += arr_v[v20];
            }
        }
        boolean[] arr_z = new boolean[v19];
        int v21 = arrayList0.size();
        int v23 = 0;
        for(int v22 = 0; v22 < v21; ++v22) {
            v23 += hlzj.d(arr_z, v23, ((int[])arrayList0.get(v22)), true);
        }
        return arr_z;
    }

    private static int g(CharSequence charSequence0, int v) {
        int v1 = charSequence0.length();
        if(v >= v1) {
            return 1;
        }
        int v2 = charSequence0.charAt(v);
        if(v2 == 0xF1) {
            return 4;
        }
        if(v2 >= 0x30 && v2 <= 57) {
            if(v + 1 >= v1) {
                return 2;
            }
            int v3 = charSequence0.charAt(v + 1);
            return v3 < 0x30 || v3 > 57 ? 2 : 3;
        }
        return 1;
    }
}

