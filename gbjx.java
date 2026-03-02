import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.wallet.bender3.framework.service.pdfrenderer.idl.PdfInfoRequest;
import com.google.android.wallet.bender3.framework.service.pdfrenderer.idl.PdfInfoResult;

public final class gbjx extends wby implements gbjy {
    final gbjm a;
    final PdfInfoRequest b;
    final icbr c;

    public gbjx() {
        super("com.google.android.wallet.bender3.framework.service.pdfrenderer.idl.IGetPdfInfoCallback");
    }

    public gbjx(gbjm gbjm0, PdfInfoRequest pdfInfoRequest0, icbr icbr0) {
        this.a = gbjm0;
        this.b = pdfInfoRequest0;
        this.c = icbr0;
        super("com.google.android.wallet.bender3.framework.service.pdfrenderer.idl.IGetPdfInfoCallback");
    }

    @Override  // gbjy
    public final void a(Status status0, PdfInfoResult pdfInfoResult0) {
        ibuq.f(status0, "status");
        this.a.a.f("InternalPdfRendererClientImpl::onInfoComplete for %s; status: %s; new cacheKey: %s", new Object[]{this.b.b, status0, (pdfInfoResult0 == null ? null : pdfInfoResult0.b)});
        if(!ibuq.m(status0, Status.b)) {
            aztb aztb0 = new aztb(status0);
            this.c.d(aztb0);
            return;
        }
        if(pdfInfoResult0 == null) {
            IllegalStateException illegalStateException0 = new IllegalStateException("result was null when status was successful");
            this.c.d(illegalStateException0);
            return;
        }
        this.c.V(pdfInfoResult0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 2) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            PdfInfoResult pdfInfoResult0 = (PdfInfoResult)wbz.a(parcel0, PdfInfoResult.CREATOR);
            gbjx.gr(parcel0);
            this.a(status0, pdfInfoResult0);
            return true;
        }
        return false;
    }
}

