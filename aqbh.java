public final class aqbh {
    public static gfsx a(String s) {
        if(s.length() < 0x100) {
            int v = s.length();
            int v1 = ggrk.b(s, 0);
            int v2 = -1;
            if(v1 != -1) {
                int v3 = s.length();
                while(v1 < v3 && s.charAt(v1) == 46) {
                    v1 = ggrk.b(s, v1 + 1);
                    if(v1 == -1) {
                        v1 = -1;
                        break;
                    }
                }
            }
            if(v1 != -1 && v1 < s.length() && s.charAt(v1) == 0x40) {
                int v4 = ggrk.a(s, v1 + 1);
                if(v4 != -1) {
                    int v5 = s.length();
                    while(v4 < v5 && s.charAt(v4) == 46) {
                        v4 = ggrk.a(s, v4 + 1);
                        if(v4 != -1) {
                            continue;
                        }
                        goto label_21;
                    }
                }
                v2 = v4;
            }
        label_21:
            if(v == v2) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)amns.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                amns amns0 = (amns)hftp0.b_message;
                s.getClass();
                amns0.b |= 1;
                amns0.c = s;
                return gfsx.m(((amns)hftp0.N_build()));
            }
        }
        return gfqx.a;
    }
}

