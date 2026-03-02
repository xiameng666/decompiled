import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.wallet.bender3.framework.service.pdfrenderer.idl.RenderPdfRequest;
import com.google.android.wallet.bender3.framework.service.pdfrenderer.idl.RenderPdfResult;

public final class gbkd extends wby implements gbke {
    final gbjm a;
    final RenderPdfRequest b;
    final icbr c;

    public gbkd() {
        super("com.google.android.wallet.bender3.framework.service.pdfrenderer.idl.IRenderPdfCallback");
    }

    public gbkd(gbjm gbjm0, RenderPdfRequest renderPdfRequest0, icbr icbr0) {
        this.a = gbjm0;
        this.b = renderPdfRequest0;
        this.c = icbr0;
        super("com.google.android.wallet.bender3.framework.service.pdfrenderer.idl.IRenderPdfCallback");
    }

    @Override  // gbke
    public final void a(Status status0, RenderPdfResult renderPdfResult0) {
        ibuq.f(status0, "status");
        this.a.a.f("InternalPdfRendererClientImpl::onRenderComplete for %s; status: %s; new cacheKey: %s", new Object[]{this.b.e, status0, (renderPdfResult0 == null ? null : renderPdfResult0.b)});
        if(!ibuq.m(status0, Status.b)) {
            aztb aztb0 = new aztb(status0);
            this.c.d(aztb0);
            return;
        }
        if(renderPdfResult0 == null) {
            IllegalStateException illegalStateException0 = new IllegalStateException("result was null when status was successful");
            this.c.d(illegalStateException0);
            return;
        }
        this.c.V(renderPdfResult0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 2) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            RenderPdfResult renderPdfResult0 = (RenderPdfResult)wbz.a(parcel0, RenderPdfResult.CREATOR);
            gbkd.gr(parcel0);
            this.a(status0, renderPdfResult0);
            return true;
        }
        return false;
    }
}

