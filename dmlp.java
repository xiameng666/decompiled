import java.io.IOException;

final class dmlp extends ibsl implements ibtw {
    final fsww a;

    public dmlp(fsww fsww0, ibrl ibrl0) {
        this.a = fsww0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dmlp)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dmlp(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        byte[] arr_b2;
        ibnx.b(object0);
        fsww fsww0 = this.a;
        ibuq.f(fsww0, "persoScript");
        fswv fswv0 = (fswv)((ProtoLiteMessage)fsww.a).v_newBuilder();
        ibuq.e(fswv0, "newBuilder(...)");
        try {
            eaqn eaqn0 = eaqm.a();
            try {
                for(Object object1: fsww0.e) {
                    byte[] arr_b = fgzu.e(((fswu)object1).d);
                    if(arr_b.length >= 4 && fgzh.a(arr_b).b == -92) {
                        byte[] arr_b1 = fgzh.a(arr_b).c();
                        ibuq.e(arr_b1, "getCommandData(...)");
                        arr_b2 = eaqn0.a(arr_b1);
                    }
                    else {
                        arr_b2 = eaqn0.b(arr_b);
                    }
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fswu.a).v_newBuilder();
                    String s = ((fswu)object1).c;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    fswu fswu0 = (fswu)hftp0.b_message;
                    s.getClass();
                    fswu0.b |= 1;
                    fswu0.c = s;
                    String s1 = fgzu.d(arr_b2);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    fswu fswu1 = (fswu)hftp0.b_message;
                    fswu1.b |= 2;
                    fswu1.d = s1;
                    fswu fswu2 = (fswu)hftp0.N_build();
                    if(!fswv0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fswv0).ensureMutable();
                    }
                    fsww fsww1 = (fsww)fswv0.b_message;
                    fswu2.getClass();
                    fsww1.b();
                    fsww1.e.add(fswu2);
                }
                object2 = (fsww)((ProtoLiteBuilder)fswv0).N_build();
            }
            catch(Throwable throwable0) {
                ibsx.a(eaqn0, throwable0);
                throw throwable0;
            }
            ibsx.a(eaqn0, null);
            ibuq.e(object2, "use(...)");
            return object2;
        }
        catch(IOException iOException0) {
            throw new eaqo(iOException0);
        }
        catch(IllegalStateException illegalStateException0) {
            throw new eaqo(illegalStateException0);
        }
    }
}

