import java.util.ArrayList;
import java.util.List;

public final class idfs {
    public static final int a(String s) {
        ibuq.f(s, "scheme");
        if(ibuq.m(s, "http")) {
            return 80;
        }
        return ibuq.m(s, "https") ? 443 : -1;
    }

    public static String b(String s, int v, int v1, boolean z, int v2) {
        if((v2 & 2) != 0) {
            v1 = s.length();
        }
        int v3 = 0;
        int v4 = 1;
        if(1 == (v2 & 1)) {
            v = 0;
        }
        if((v2 & 4) == 0) {
            v3 = 1;
        }
        int v5 = ((int)z) & v3;
        ibuq.f(s, "<this>");
        int v6 = v;
        while(v6 < v1) {
            switch(s.charAt(v6)) {
                case 37: {
                    v4 = v5;
                    break;
                }
                case 43: {
                    if(v5 == 0) {
                        ++v6;
                        continue;
                    }
                    break;
                }
                default: {
                    ++v6;
                    continue;
                }
            }
            idlm idlm0 = new idlm();
            idlm0.ac(s, v, v6);
            while(v6 < v1) {
                int v7 = s.codePointAt(v6);
                if(v7 == 37) {
                    if(v6 + 2 < v1) {
                        int v8 = idgw.f(s.charAt(v6 + 1));
                        int v9 = idgw.f(s.charAt(v6 + 2));
                        if(v8 != -1 && v9 != -1) {
                            idlm0.V((v8 << 4) + v9);
                            v6 = Character.charCount(37) + (v6 + 2);
                            continue;
                        }
                        else {
                            v7 = 37;
                            goto label_39;
                        }
                    }
                    v7 = 37;
                }
                if(v7 == 43 && v4 != 0) {
                    idlm0.V(0x20);
                    ++v6;
                }
                else {
                label_39:
                    idlm0.ad(v7);
                    v6 += Character.charCount(v7);
                }
            }
            return idlm0.s();
        }
        String s1 = s.substring(v, v1);
        ibuq.e(s1, "substring(...)");
        return s1;
    }

    public static final List c(String s) {
        ibuq.f(s, "<this>");
        List list0 = new ArrayList();
        for(int v = 0; v <= s.length(); v = v1 + 1) {
            int v1 = ibzk.M(s, '&', v, 4);
            if(v1 == -1) {
                v1 = s.length();
            }
            int v2 = ibzk.M(s, '=', v, 4);
            if(v2 != -1 && v2 <= v1) {
                String s1 = s.substring(v, v2);
                ibuq.e(s1, "substring(...)");
                list0.add(s1);
                String s2 = s.substring(v2 + 1, v1);
                ibuq.e(s2, "substring(...)");
                list0.add(s2);
            }
            else {
                String s3 = s.substring(v, v1);
                ibuq.e(s3, "substring(...)");
                list0.add(s3);
                list0.add(null);
            }
        }
        return list0;
    }

    public static String d(String s, int v, int v1, String s1, boolean z, boolean z1, boolean z2, boolean z3, int v2) {
        int v3 = (v2 & 2) == 0 ? v1 : s.length();
        int v4 = 0;
        int v5 = 1 == (v2 & 1) ? 0 : v;
        int v6 = ((v2 & 8) == 0 ? 1 : 0) & ((int)z);
        int v7 = ((v2 & 16) == 0 ? 1 : 0) & ((int)z1);
        int v8 = ((v2 & 0x20) == 0 ? 1 : 0) & ((int)z2);
        if((v2 & 0x40) == 0) {
            v4 = 1;
        }
        int v9 = v4 & ((int)z3);
        ibuq.f(s, "<this>");
        int v10 = v5;
        while(v10 < v3) {
            int v11 = s.codePointAt(v10);
            if(v11 >= 0x20 && v11 != 0x7F && (v11 < 0x80 || v9 != 0) && !ibzk.F(s1, ((char)v11)) && (v11 != 37 || v6 != 0 && (v7 == 0 || idfs.e(s, v10, v3)))) {
                if(v11 == 43 && v8 != 0) {
                    v8 = 1;
                }
                else {
                    v10 += Character.charCount(v11);
                    continue;
                }
            }
            idlm idlm0 = new idlm();
            idlm0.ac(s, v5, v10);
            idlm idlm1 = null;
            while(v10 < v3) {
                int v12 = s.codePointAt(v10);
                if(v6 == 0) {
                label_29:
                    if(v12 == 43 && v8 != 0) {
                        idlm0.ag((1 == v6 ? "+" : "%2B"));
                    }
                    else {
                        if(v12 >= 0x20 && v12 != 0x7F && (v12 < 0x80 || v9 != 0) && !ibzk.F(s1, ((char)v12))) {
                            if(v12 != 37) {
                                idlm0.ad(v12);
                                v12 = v12;
                                goto label_50;
                            }
                            else if(v6 != 0 && (v7 == 0 || idfs.e(s, v10, v3))) {
                                idlm0.ad(37);
                                v12 = 37;
                                goto label_50;
                            }
                        }
                        if(idlm1 == null) {
                            idlm1 = new idlm();
                        }
                        idlm1.ad(v12);
                        while(!idlm1.J()) {
                            int v13 = idlm1.d();
                            idlm0.V(37);
                            idlm0.V(((int)idft.a[(v13 & 0xFF) >> 4]));
                            idlm0.V(((int)idft.a[v13 & 15]));
                        }
                    }
                }
                else {
                    switch(v12) {
                        case 9: 
                        case 10: 
                        case 12: {
                            break;
                        }
                        case 13: {
                            v12 = 13;
                            break;
                        }
                        default: {
                            goto label_29;
                        }
                    }
                }
            label_50:
                v10 += Character.charCount(v12);
            }
            return idlm0.s();
        }
        String s2 = s.substring(v5, v3);
        ibuq.e(s2, "substring(...)");
        return s2;
    }

    private static final boolean e(String s, int v, int v1) {
        return v + 2 < v1 && s.charAt(v) == 37 && idgw.f(s.charAt(v + 1)) != -1 && idgw.f(s.charAt(v + 2)) != -1;
    }
}

