import android.accounts.Account;

final class buyu extends ibsl implements ibtw {
    int a;
    final bbdi b;
    final Account c;
    final long d;
    final ccpr e;

    public buyu(bbdi bbdi0, Account account0, long v, ccpr ccpr0, ibrl ibrl0) {
        this.b = bbdi0;
        this.c = account0;
        this.d = v;
        this.e = ccpr0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((buyu)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new buyu(this.b, this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        ccps ccps0 = ccpt.a(this.b);
        ccps0.b(this.c);
        ccps0.d(ibzw.h(this.d));
        ccop ccop0 = ccoo.a(((ProtoLiteMessage)ccon.a).v_newBuilder());
        if(this.b == bbdi.co) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ccol.a).v_newBuilder();
            ibuq.f(hftp0, "builder");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ccol.b(((ccol)hftp0.b_message));
            ProtoLiteMessage hftv0 = hftp0.N_build();
            ibuq.e(hftv0, "build(...)");
            ibuq.f(((ccol)hftv0), "value");
            ProtoLiteBuilder hftp1 = ccop0.a;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ccon ccon0 = (ccon)hftp1.b_message;
            ((ccol)hftv0).getClass();
            ccon0.c = (ccol)hftv0;
            ccon0.b = 1;
        }
        ccps0.c(ccop0.a());
        ccpu ccpu0 = ccps0.a();
        this.a = 1;
        Object object2 = this.e.b(ccpu0, this);
        return object2 == object1 ? object1 : object2;
    }
}

