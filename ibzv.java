public final class ibzv {
    public static final long a(String s) {
        int v9;
        ibzz ibzz1;
        try {
            int v = s.length();
            if(v == 0) {
                throw new IllegalArgumentException("The string is empty");
            }
            int v1 = s.charAt(0) == 43 || s.charAt(0) == 45 ? 1 : 0;
            boolean z = v1 != 0 && ibzk.U(s, '-');
            if(v <= v1) {
                throw new IllegalArgumentException("No components");
            }
            if(s.charAt(v1) != 80) {
                throw new IllegalArgumentException();
            }
            int v2 = v1 + 1;
            if(v2 == v) {
                throw new IllegalArgumentException();
            }
            ibzz ibzz0 = null;
            long v3 = 0L;
            boolean z1 = false;
            while(v2 < v) {
                if(s.charAt(v2) == 84) {
                    if(!z1) {
                        ++v2;
                        if(v2 != v) {
                            z1 = true;
                            continue;
                        }
                    }
                    throw new IllegalArgumentException();
                }
                int v4;
                for(v4 = v2; v4 < s.length(); ++v4) {
                    int v5 = s.charAt(v4);
                    if((v5 < 0x30 || v5 >= 58) && !ibzk.F("+-.", ((char)v5))) {
                        break;
                    }
                }
                String s1 = s.substring(v2, v4);
                ibuq.e(s1, "substring(...)");
                if(s1.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int v6 = v2 + s1.length();
                if(v6 < 0 || v6 >= s.length()) {
                    throw new IllegalArgumentException("Missing unit for value " + s1);
                }
                int v7 = s.charAt(v6);
                if(z1) {
                    switch(v7) {
                        case 72: {
                            ibzz1 = ibzz.f;
                            break;
                        }
                        case 77: {
                            ibzz1 = ibzz.e;
                            break;
                        }
                        case 83: {
                            ibzz1 = ibzz.d;
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + ((char)v7));
                        }
                    }
                }
                else {
                    if(v7 != 68) {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + ((char)v7));
                    }
                    ibzz1 = ibzz.g;
                }
                if(ibzz0 != null && ibzz0.compareTo(ibzz1) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int v8 = ibzk.M(s1, '.', 0, 6);
                if(ibzz1 == ibzz.d && v8 > 0) {
                    ibuq.d(s1, "null cannot be cast to non-null type java.lang.String");
                    String s2 = s1.substring(0, v8);
                    ibuq.e(s2, "substring(...)");
                    v9 = v6 + 1;
                    long v10 = ibzw.l(v3, ibzy.i(ibzy.f(s2), ibzz1));
                    ibuq.d(s1, "null cannot be cast to non-null type java.lang.String");
                    String s3 = s1.substring(v8);
                    ibuq.e(s3, "substring(...)");
                    v3 = ibzw.l(v10, ibzy.g(Double.parseDouble(s3), ibzz1));
                }
                else {
                    v9 = v6 + 1;
                    v3 = ibzw.l(v3, ibzy.i(ibzy.f(s1), ibzz1));
                }
                ibzz0 = ibzz1;
                v2 = v9;
                continue;
            }
            return z ? ibzw.o(v3) : v3;
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new IllegalArgumentException(a.a(s, "Invalid ISO duration string format: \'", "\'."), illegalArgumentException0);
        }
    }
}

