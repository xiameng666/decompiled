public final class ezrk {
    public final ezoh a;

    public ezrk(ezoh ezoh0) {
        this.a = ezoh0;
    }

    public final hfem a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfem.a).v_newBuilder();
        for(Object object0: this.a.b()) {
            hfqj hfqj0 = (hfqj)object0;
            if(this.c(hfqj0.c)) {
                int v = 1;
                switch(hfqj0.c) {
                    case 9: {
                        int v1 = hfqv.a(hfqj0.e);
                        if(v1 != 0) {
                            v = v1;
                        }
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hfem hfem0 = (hfem)hftp0.b_message;
                        hfem0.b |= 2;
                        hfem0.d = v == 3;
                        break;
                    }
                    case 10: {
                        int v2 = hfqv.a(hfqj0.e) == 0 ? 1 : hfqv.a(hfqj0.e);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hfem hfem1 = (hfem)hftp0.b_message;
                        hfem1.b |= 1;
                        hfem1.c = v2 == 3;
                    }
                }
            }
        }
        return (hfem)hftp0.N_build();
    }

    public final boolean b() {
        return this.c(9) || this.c(10);
    }

    public final boolean c(int v) {
        return this.a.c().contains(Integer.valueOf(v));
    }

    public static int d(boolean z) {
        return z ? 3 : 4;
    }

    private static boolean e(int v) {
        return v == 3;
    }
}

