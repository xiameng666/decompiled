public final class atpd {
    private static final bboh a;
    private final cdzq b;

    static {
        atpd.a = bboh.b("BankWarningLogger", bbcu.gX);
    }

    public atpd() {
        this.b = cdzq.v();
    }

    public final void a(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhbi.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hhba.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hhba hhba0 = (hhba)hftp1.b_message;
        hhba0.b |= 1;
        hhba0.c = v;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhbi hhbi0 = (hhbi)hftp0.b_message;
        hhba hhba1 = (hhba)hftp1.N_build();
        hhba1.getClass();
        hhbi0.d = hhba1;
        hhbi0.c = 6;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        this.b(((hhbi)hftv0));
    }

    public final void b(hhbi hhbi0) {
        String s;
        int v1;
        this.b.j(((ProtoLiteMessage)hhbi0));
        ggtj ggtj0 = (ggtj)atpd.a.h();
        int v = hhbi0.c;
        switch(v) {
            case 0: {
                s = "EVENTDETAILS_NOT_SET";
                v1 = 1;
                break;
            }
            case 1: {
                v1 = 2;
                s = "CALL_EVENT";
                break;
            }
            case 2: {
                v1 = 3;
                s = "BANK_APP_LAUNCHED_EVENT";
                break;
            }
            case 3: {
                v1 = 4;
                s = "WARNING_DIALOG_OPENED_EVENT";
                break;
            }
            case 4: {
                s = "WARNING_DIALOG_DISMISSED_EVENT";
                v1 = 5;
                break;
            }
            default: {
                if(v == 6) {
                    v1 = 7;
                    s = "CALL_END_EVENT";
                }
                else {
                    v1 = 0;
                    s = "null";
                }
            }
        }
        if(v1 == 0) {
            throw null;
        }
        ggtj0.B("Log event sent to clearcut: %s", s);
    }

    public final void c(hhbf hhbf0, String s, String s1) {
        ibuq.f(hhbf0, "clickBehavior");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhbi.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hhbg.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((hhbg)hftv0).c = hhbf0.e;
        ((hhbg)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((hhbg)hftv1).b |= 2;
        ((hhbg)hftv1).d = s;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        hhbg hhbg0 = (hhbg)hftp1.b_message;
        hhbg0.b |= 4;
        hhbg0.e = s1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhbi hhbi0 = (hhbi)hftp0.b_message;
        hhbg hhbg1 = (hhbg)hftp1.N_build();
        hhbg1.getClass();
        hhbi0.d = hhbg1;
        hhbi0.c = 4;
        ProtoLiteMessage hftv2 = hftp0.N_build();
        ibuq.e(hftv2, "build(...)");
        this.b(((hhbi)hftv2));
    }
}

