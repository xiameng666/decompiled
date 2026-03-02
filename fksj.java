import java.io.IOException;

public final class fksj implements glzn {
    public final fkso a;
    public final gfsx b;

    public fksj(fkso fkso0, gfsx gfsx0) {
        this.a = fkso0;
        this.b = gfsx0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        gged_interceptors gged0 = ((fkjr)object0).a;
        if(gged0.size() != 1) {
            throw new fkru(String.format("The response returned from the server contains %d lookup results, while only one is expected.", ((fkjr)object0).a.size()));
        }
        fkso fkso0 = this.a;
        if(((fkjw)gged0.get(0)).c != 2) {
            throw new fkrs(fkso0.b.c);
        }
        gftb.q(((fkjw)gged0.get(0)).a.i());
        Object object1 = ((fkjw)gged0.get(0)).a.d();
        hftc hftc0 = hftc.a();
        hfsl hfsl0 = ((ByteString)object1).k();
        ProtoLiteMessage hftv0 = ((ProtoLiteMessage)hhfg.a).x_newMutableInstance();
        try {
            hfwc hfwc0 = hfvu.a.c(hftv0);
            hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
            hfwc0.g(hftv0);
        }
        catch(hfur hfur0) {
            if(hfur0.b) {
                hfur0 = new hfur(hfur0);
            }
            hfur0.a = hftv0;
            throw hfur0;
        }
        catch(hfwr hfwr0) {
            hfur hfur1 = hfwr0.a();
            hfur1.a = hftv0;
            throw hfur1;
        }
        catch(IOException iOException0) {
            if((iOException0.getCause() instanceof hfur)) {
                throw (hfur)iOException0.getCause();
            }
            hfur hfur2 = new hfur(iOException0);
            hfur2.a = hftv0;
            throw hfur2;
        }
        catch(RuntimeException runtimeException0) {
            if((runtimeException0.getCause() instanceof hfur)) {
                throw (hfur)runtimeException0.getCause();
            }
            throw runtimeException0;
        }
        try {
            hfsl0.z(0);
        }
        catch(hfur hfur3) {
            hfur3.a = hftv0;
            throw hfur3;
        }
        ProtoLiteMessage.P_makeImmutable(hftv0);
        ggdy ggdy0 = new ggdy();
        for(Object object2: ((hhfg)hftv0).b) {
            ggdy0.i(new fksc(((hhff)object2), fkso0.b.b));
        }
        gged_interceptors gged1 = ggdy0.h();
        fkso.b(this.b, 3);
        return gmbu.i(gged1);
    }
}

