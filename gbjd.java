import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.wallet.bender3.framework.service.pdfrenderer.idl.PdfInfoRequest;
import com.google.android.wallet.bender3.framework.service.pdfrenderer.idl.PdfInfoResult;

public final class gbjd extends ibsl implements ibtw {
    final PdfInfoRequest a;
    final gbjy b;
    final gbka c;
    private Object d;

    public gbjd(ibrl ibrl0, gbka gbka0, PdfInfoRequest pdfInfoRequest0, gbjy gbjy0) {
        this.c = gbka0;
        this.a = pdfInfoRequest0;
        this.b = gbjy0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((gbjd)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new gbjd(ibrl0, this.c, this.a, this.b);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1;
        ibnx.b(object0);
        icck icck0 = (icck)this.d;
        try {
            ibns ibns0 = this.c.c(this.a.b, this.a.a);
            object1 = new PdfInfoResult(((gbjc)ibns0.b).b, ((String)ibns0.a));
        }
        catch(Throwable throwable0) {
            object1 = ibnx.a(throwable0);
        }
        if(ibnw.b(object1)) {
            this.b.a(Status.b, ((PdfInfoResult)object1));
        }
        Throwable throwable1 = ibnw.a(object1);
        if(throwable1 != null) {
            Log.e("PdfRendererServiceImpl", "getPdfInfo call failed", throwable1);
            this.b.a(Status.d, null);
        }
        return ibom.a;
    }
}

