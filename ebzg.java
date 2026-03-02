import java.util.ArrayList;

public final class ebzg implements evqc {
    public final ebzr a;

    public ebzg(ebzr ebzr0) {
        this.a = ebzr0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(ebzr.a.i(), "TransferEmoneyCardsTaskOperation: Upload cards operation failed", exception0);
        ebzr ebzr0 = this.a;
        frli frli0 = ebzr0.h;
        frli frli1 = null;
        if(frli0 == null) {
            ibuq.j("dataStore");
            frli0 = null;
        }
        dyoi dyoi0 = ((dygd)frli0.a().get()).c;
        if(dyoi0 == null) {
            dyoi0 = dyoi.a;
        }
        hfuo hfuo0 = dyoi0.b;
        ibuq.e(hfuo0, "getCardUploadResultsList(...)");
        ArrayList arrayList0 = new ArrayList(ibpo.q(hfuo0, 10));
        for(Object object0: hfuo0) {
            dyoh dyoh0 = (dyoh)object0;
            if((dyog.b(dyoh0.c) == null ? dyog.h : dyog.b(dyoh0.c)) == dyog.a) {
                ibuq.c(dyoh0);
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dyoh0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)dyoh0));
                dyok dyok0 = dyoj.a(hftp0);
                dyok0.d(dyog.c);
                dyoh0 = dyok0.a();
            }
            arrayList0.add(dyoh0);
        }
        frli frli2 = ebzr0.h;
        if(frli2 == null) {
            ibuq.j("dataStore");
        }
        else {
            frli1 = frli2;
        }
        ((glyq)frli1.b(new ebzk(new ebzj(arrayList0)), ebzr0.f())).u();
        ebzr0.d().a();
    }
}

