import java.io.IOException;

public final class qtj {
    final String[] a;
    final idmj b;

    private qtj(String[] arr_s, idmj idmj0) {
        this.a = arr_s;
        this.b = idmj0;
    }

    public static qtj a(String[] arr_s) {
        String s1;
        try {
            idlq[] arr_idlq = new idlq[arr_s.length];
            idlm idlm0 = new idlm();
            int v = 0;
            while(v < arr_s.length) {
                String s = arr_s[v];
                String[] arr_s1 = qtl.a;
                idlm0.V(34);
                int v1 = s.length();
                int v2 = 0;
                int v3 = 0;
                while(v2 < v1) {
                    int v4 = s.charAt(v2);
                    if(v4 < 0x80) {
                        s1 = arr_s1[v4];
                        if(s1 != null) {
                            goto label_21;
                        }
                    }
                    else {
                        switch(v4) {
                            case 0x2028: {
                                s1 = "\\u2028";
                                break;
                            }
                            case 0x2029: {
                                s1 = "\\u2029";
                                break;
                            }
                            default: {
                                goto label_25;
                            }
                        }
                    label_21:
                        if(v3 < v2) {
                            idlm0.ac(s, v3, v2);
                        }
                        idlm0.ag(s1);
                        v3 = v2 + 1;
                    }
                label_25:
                    ++v2;
                }
                if(v3 < v1) {
                    idlm0.ac(s, v3, v1);
                }
                idlm0.V(34);
                idlm0.d();
                arr_idlq[v] = idlm0.z();
                ++v;
            }
            return new qtj(((String[])arr_s.clone()), idmj.a.a(arr_idlq));
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }

    static String b(qtm qtm0, String s) {
        return s + qtk.a(qtm0.q()) + " at path " + qtm0.e();
    }
}

