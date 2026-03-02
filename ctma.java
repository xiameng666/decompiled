import android.graphics.drawable.Icon;

public final class ctma extends ibsl implements ibtw {
    int a;
    final ctmx b;
    final String c;
    final ctmn d;
    final ctmk e;

    public ctma(ctmn ctmn0, ctmx ctmx0, ctmk ctmk0, String s, ibrl ibrl0) {
        this.d = ctmn0;
        this.b = ctmx0;
        this.e = ctmk0;
        this.c = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctma)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctma(this.d, this.b, this.e, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ctmn ctmn0 = this.d;
            String s = this.c;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ctzc.a).v_newBuilder();
            ibuq.f(hftp0, "builder");
            ibuq.f(s, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ctzc ctzc0 = (ctzc)hftp0.b_message;
            s.getClass();
            ctzc0.b |= 1;
            ctzc0.c = s;
            ProtoLiteMessage hftv0 = hftp0.N_build();
            ibuq.e(hftv0, "build(...)");
            this.a = 1;
            object0 = ctmn0.a.b(((ctzc)hftv0), this);
            if(object0 == object1) {
                return object1;
            }
        }
        if(((ctzd)object0).c.isEmpty()) {
            this.b.a(null);
            return ibom.a;
        }
        byte[] arr_b = ((ctzd)object0).c.toByteArray();
        Icon icon0 = Icon.createWithData(arr_b, 0, arr_b.length);
        ibuq.e(icon0, "createWithData(...)");
        this.e.f.put(this.c, icon0);
        this.b.a(icon0);
        return ibom.a;
    }
}

