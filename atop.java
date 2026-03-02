public final class atop extends ibsl implements ibtw {
    Object a;
    int b;
    Object c;
    final ator d;

    public atop(ator ator0, ibrl ibrl0) {
        this.d = ator0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((atop)this.c(((String)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new atop(this.d, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        String s;
        Object object2;
        Object object1 = ibrx.a;
        if(this.b != 0) {
            object2 = this.a;
            s = (String)this.c;
            ibnx.b(object0);
            goto label_59;
        }
        ibnx.b(object0);
        s = (String)this.c;
        ator ator0 = this.d;
        ator0.h.g(s);
        bboh bboh0 = ator.a;
        ((ggtj)bboh0.h()).B("Detected target banking app in foreground during active call: %s", s);
        String s1 = ator.i();
        boolean z = ator.j(s1);
        Boolean boolean0 = Boolean.valueOf(z);
        ibuq.f(s, "bankAppPackageName");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhaz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((hhaz)hftv0).b |= 1;
        ((hhaz)hftv0).c = s;
        if(s1 != null) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            hhaz hhaz0 = (hhaz)hftp0.b_message;
            hhaz0.b |= 2;
            hhaz0.d = s1;
            boolean0.getClass();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hhaz hhaz1 = (hhaz)hftp0.b_message;
            hhaz1.b |= 8;
            hhaz1.e = z;
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hhbi.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hhbi hhbi0 = (hhbi)hftp1.b_message;
        hhaz hhaz2 = (hhaz)hftp0.N_build();
        hhaz2.getClass();
        hhbi0.d = hhaz2;
        hhbi0.c = 2;
        ProtoLiteMessage hftv1 = hftp1.N_build();
        ibuq.e(hftv1, "build(...)");
        ator0.e.b(((hhbi)hftv1));
        if(s1 == null) {
            ((ggtj)bboh0.h()).x("No active media projection session detected.");
            return ibom.a;
        }
        if(z) {
            ((ggtj)bboh0.h()).B("Active media projection session detected for ignored screen sharing app. %s", s1);
            return ibom.a;
        }
        ((ggtj)bboh0.h()).R("Bank app in foreground (%s) AND media projection is active created by %s.", s, s1);
        this.c = s;
        this.a = s1;
        this.b = 1;
        object0 = ator0.c(s, this);
        if(object0 != object1) {
            object2 = s1;
        label_59:
            if(((Boolean)object0).booleanValue()) {
                ((ggtj)ator.a.h()).x("Starting BankWarningDialogActivity.");
                ator.k(this.d, ((String)object2), s);
                this.d.f();
                return ibom.a;
            }
            ((ggtj)ator.a.h()).R("Not starting BankWarningDialogActivity because user already accepted the risk for this session %s for app %s.", this.d.d.get(), s);
            return ibom.a;
        }
        return object1;
    }
}

