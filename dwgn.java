import java.util.ArrayList;

final class dwgn extends ibsl implements ibtw {
    int a;
    final dwgo b;
    final gged_interceptors c;
    final long d;

    public dwgn(dwgo dwgo0, gged_interceptors gged0, long v, ibrl ibrl0) {
        this.b = dwgo0;
        this.c = gged0;
        this.d = v;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dwgn)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dwgn(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object3;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                dwgo dwgo0 = this.b;
                ArrayList arrayList0 = new ArrayList(ibpo.q(this.c, 10));
                for(Object object2: this.c) {
                    gvcf gvcf0 = gvce.a(((ProtoLiteMessage)guwv.a).v_newBuilder());
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)guws.a).v_newBuilder();
                    ibuq.f(hftp0, "builder");
                    String s = ((hfir)object2).d.toStringUtf8();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((guws)hftp0.b_message).b = s;
                    hfit hfit0 = hfit.b(((hfir)object2).c);
                    if(hfit0 == null) {
                        hfit0 = hfit.a;
                    }
                    String s1 = hfit0.name();
                    ibuq.f(s1, "value");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    guws guws0 = (guws)hftp0.b_message;
                    s1.getClass();
                    guws0.c = s1;
                    ProtoLiteMessage hftv0 = hftp0.N_build();
                    ibuq.e(hftv0, "build(...)");
                    ibuq.f(((guws)hftv0), "value");
                    ProtoLiteBuilder hftp1 = gvcf0.a;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    guwv guwv0 = (guwv)hftp1.b_message;
                    ((guws)hftv0).getClass();
                    guwv0.c = (guws)hftv0;
                    guwv0.b = 2;
                    arrayList0.add(gvcf0.a());
                }
                evql evql0 = dwgo0.b(ggdx.a(arrayList0));
                this.a = 1;
                object3 = fsdk.a(evql0, this);
                if(object3 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                object3 = ((ibnw)object0).a;
                break;
            }
            default: {
                return ibom.a;
            }
        }
        if(ibnw.b(object3)) {
            dwgo dwgo1 = this.b;
            guwn guwn0 = guwn.a;
            if((object3 instanceof ibnv)) {
                object3 = guwn0;
            }
            this.a = 2;
            if(dwgo1.g(((guwn)object3), this.d, this) == object1) {
                return object1;
            }
        }
        else {
            a.ae(dwgo.a.j(), "Detect and transform pass failed", ibnw.a(object3));
            Throwable throwable0 = ibnw.a(object3);
            dwgo.o(this.b, throwable0, null, this.c, 2);
        }
        return ibom.a;
    }
}

