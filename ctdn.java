public final class ctdn {
    public static final haac a(ctdd ctdd0) {
        haab haab0;
        haaa haaa0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)haac.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ibuq.f(ctdd0.a, "<this>");
        switch(ctdd0.a.ordinal()) {
            case 0: {
                haaa0 = haaa.a;
                break;
            }
            case 1: {
                haaa0 = haaa.b;
                break;
            }
            case 2: {
                haaa0 = haaa.c;
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        ibuq.f(haaa0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        haac haac0 = (haac)hftp0.b_message;
        haac0.b = haaa0.a();
        ibuq.f(ctdd0.b, "<this>");
        switch(ctdd0.b.ordinal()) {
            case 0: {
                haab0 = haab.a;
                break;
            }
            case 1: {
                haab0 = haab.b;
                break;
            }
            case 2: {
                haab0 = haab.c;
                break;
            }
            case 3: {
                haab0 = haab.d;
                break;
            }
            case 4: {
                haab0 = haab.e;
                break;
            }
            case 5: {
                haab0 = haab.f;
                break;
            }
            case 6: {
                haab0 = haab.g;
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        ibuq.f(haab0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        haac haac1 = (haac)hftp0.b_message;
        haac1.c = haab0.a();
        int v = ctdd0.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((haac)hftp0.b_message).d = v;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        return (haac)hftv0;
    }

    public static final haan b(Integer integer0) {
        switch(((int)integer0)) {
            case 0: {
                gzzx gzzx1 = gzzw.a(((ProtoLiteMessage)haan.a).v_newBuilder());
                gzzx1.b(haam.d);
                gzzx1.c(integer0.intValue());
                return gzzx1.a();
            }
            case 1: {
                gzzx gzzx2 = gzzw.a(((ProtoLiteMessage)haan.a).v_newBuilder());
                gzzx2.b(haam.b);
                gzzx2.c(integer0.intValue());
                return gzzx2.a();
            }
            default: {
                gzzx gzzx0 = gzzw.a(((ProtoLiteMessage)haan.a).v_newBuilder());
                gzzx0.b(haam.c);
                gzzx0.c(integer0.intValue());
                return gzzx0.a();
            }
        }
    }

    public static final int c(ctdl ctdl0) {
        ibuq.f(ctdl0, "<this>");
        int v = ctdl0.ordinal();
        switch(v) {
            case 2: {
                return 4;
            }
            case 0: 
            case 1: 
            case 3: {
                return 2;
            }
            case 4: {
                return 3;
            }
            default: {
                if(v != 5) {
                    throw new ibnq();
                }
                return 2;
            }
        }
    }

    public static final haay d(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)haay.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        haax haax0 = v - 1 == 1 ? haax.b : haax.c;
        ibuq.f(haax0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        haay haay0 = (haay)hftp0.b_message;
        haay0.b = haax0.a();
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        return (haay)hftv0;
    }
}

