import com.google.firebase.auth.ActionCodeSettings;

public final class goye implements goxo {
    public String a;
    public String b;
    public ActionCodeSettings c;
    public String d;
    private final String e;
    private String f;

    public goye(gqqm gqqm0) {
        this.e = goye.c(gqqm0);
    }

    public goye(gqqm gqqm0, ActionCodeSettings actionCodeSettings0, String s, String s1) {
        batl.s(gqqm0);
        this.e = goye.c(gqqm0);
        batl.s(actionCodeSettings0);
        this.c = actionCodeSettings0;
        this.a = null;
        this.f = s;
        this.b = s1;
        this.d = null;
    }

    @Override  // goxo
    public final MessageLite a() {
        gqqm gqqm0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gdhr.a).v_newBuilder();
        switch(this.e) {
            case "EMAIL_SIGNIN": {
                gqqm0 = gqqm.g;
                break;
            }
            case "PASSWORD_RESET": {
                gqqm0 = gqqm.b;
                break;
            }
            case "VERIFY_BEFORE_UPDATE_EMAIL": {
                gqqm0 = gqqm.h;
                break;
            }
            case "VERIFY_EMAIL": {
                gqqm0 = gqqm.e;
                break;
            }
            default: {
                gqqm0 = gqqm.a;
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gdhr)hftv0).c = gqqm0.p;
        ((gdhr)hftv0).b |= 1;
        String s = this.a;
        if(s != null) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdhr gdhr0 = (gdhr)hftp0.b_message;
            gdhr0.b |= 2;
            gdhr0.d = s;
        }
        String s1 = this.f;
        if(s1 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdhr gdhr1 = (gdhr)hftp0.b_message;
            gdhr1.b |= 0x20;
            gdhr1.e = s1;
        }
        String s2 = this.b;
        if(s2 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdhr gdhr2 = (gdhr)hftp0.b_message;
            gdhr2.b |= 0x40;
            gdhr2.f = s2;
        }
        ActionCodeSettings actionCodeSettings0 = this.c;
        if(actionCodeSettings0 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((gdhr)hftv1).b |= 0x800;
            ((gdhr)hftv1).k = actionCodeSettings0.e;
            boolean z = this.c.g;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((gdhr)hftv2).b |= 0x2000;
            ((gdhr)hftv2).m = z;
            String s3 = this.c.a;
            if(s3 != null) {
                if(!hftv2.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gdhr gdhr3 = (gdhr)hftp0.b_message;
                gdhr3.b |= 0x80;
                gdhr3.g = s3;
            }
            String s4 = this.c.b;
            if(s4 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gdhr gdhr4 = (gdhr)hftp0.b_message;
                gdhr4.b |= 0x100;
                gdhr4.h = s4;
            }
            String s5 = this.c.c;
            if(s5 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gdhr gdhr5 = (gdhr)hftp0.b_message;
                gdhr5.b |= 0x200;
                gdhr5.i = s5;
            }
            String s6 = this.c.d;
            if(s6 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gdhr gdhr6 = (gdhr)hftp0.b_message;
                gdhr6.b |= 0x400;
                gdhr6.j = s6;
            }
            String s7 = this.c.f;
            if(s7 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gdhr gdhr7 = (gdhr)hftp0.b_message;
                gdhr7.b |= 0x1000;
                gdhr7.l = s7;
            }
            String s8 = this.c.j;
            if(s8 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gdhr gdhr8 = (gdhr)hftp0.b_message;
                gdhr8.b |= 0x8000;
                gdhr8.o = s8;
            }
        }
        String s9 = this.d;
        if(s9 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdhr gdhr9 = (gdhr)hftp0.b_message;
            gdhr9.b |= 0x4000;
            gdhr9.n = s9;
        }
        return (gdhr)hftp0.N_build();
    }

    public final void b(ActionCodeSettings actionCodeSettings0) {
        batl.s(actionCodeSettings0);
        this.c = actionCodeSettings0;
    }

    private static final String c(gqqm gqqm0) {
        switch(gqqm0.ordinal()) {
            case 1: {
                return "PASSWORD_RESET";
            }
            case 4: {
                return "VERIFY_EMAIL";
            }
            case 6: {
                return "EMAIL_SIGNIN";
            }
            case 7: {
                return "VERIFY_BEFORE_UPDATE_EMAIL";
            }
            default: {
                return "REQUEST_TYPE_UNSET_ENUM_VALUE";
            }
        }
    }
}

