import com.google.android.gms.tapandpay.firstparty.AccountInfo;

public final class cjkw implements evpo {
    public final cjky a;

    public cjkw(cjky cjky0) {
        this.a = cjky0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        cjky cjky0 = this.a;
        if(evql0.n()) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gfnw.a).v_newBuilder();
            String s = ((AccountInfo)evql0.j()).b;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gfnw gfnw0 = (gfnw)hftp0.b_message;
            s.getClass();
            gfnw0.d = s;
            hfsw hfsw0 = hfsw.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gfnw gfnw1 = (gfnw)hftp0.b_message;
            hfsw0.getClass();
            gfnw1.c = hfsw0;
            gfnw1.b = 3;
            ProtoLiteMessage hftv0 = hftp0.N_build();
            ibuq.e(hftv0, "build(...)");
            return new azts(cjky0.a, null).bb(((gfnw)hftv0).toBytesArray());
        }
        ((ggsc)cjky0.b.h().ar(6126)).x("No active account, notification is not delegated.");
        return evrg.d(null);
    }
}

