import java.util.ArrayList;

public final class ebzn implements evqc {
    public final ebzr a;

    public ebzn(ebzr ebzr0) {
        this.a = ebzr0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(ebzr.a.i(), "TransferEmoneyCardsTaskOperation: Download cards operation failed", exception0);
        ebzr ebzr0 = this.a;
        frli frli0 = ebzr0.h;
        frli frli1 = null;
        if(frli0 == null) {
            ibuq.j("dataStore");
            frli0 = null;
        }
        dyfl dyfl0 = ((dygd)frli0.a().get()).d;
        if(dyfl0 == null) {
            dyfl0 = dyfl.a;
        }
        hfuo hfuo0 = dyfl0.b;
        ibuq.e(hfuo0, "getCardDownloadResultsList(...)");
        ArrayList arrayList0 = new ArrayList(ibpo.q(hfuo0, 10));
        for(Object object0: hfuo0) {
            dyfk dyfk0 = (dyfk)object0;
            if((dyfj.b(dyfk0.e) == null ? dyfj.j : dyfj.b(dyfk0.e)) == dyfj.a) {
                ibuq.c(dyfk0);
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dyfk0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)dyfk0));
                dyfn dyfn0 = dyfm.a(hftp0);
                dyfn0.d(dyfj.c);
                dyfk0 = dyfn0.a();
            }
            arrayList0.add(dyfk0);
        }
        frli frli2 = ebzr0.h;
        if(frli2 == null) {
            ibuq.j("dataStore");
        }
        else {
            frli1 = frli2;
        }
        ((glyq)frli1.b(new ebzm(new ebzl(arrayList0)), ebzr0.f())).u();
        ebzr0.d().a();
    }
}

