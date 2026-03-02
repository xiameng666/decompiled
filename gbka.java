import android.graphics.pdf.PdfRenderer;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.wallet.bender3.framework.service.pdfrenderer.idl.PdfInfoRequest;
import com.google.android.wallet.bender3.framework.service.pdfrenderer.idl.RenderPdfRequest;
import j..time.Duration;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public final class gbka extends wby implements gbkb {
    public final gayl a;
    private final iccd b;
    private final gfvb c;

    public gbka() {
        super("com.google.android.wallet.bender3.framework.service.pdfrenderer.idl.IPdfRendererService");
    }

    public gbka(iccd iccd0, gayl gayl0) {
        ibuq.f(gayl0, "debugLogger");
        super("com.google.android.wallet.bender3.framework.service.pdfrenderer.idl.IPdfRendererService");
        this.b = iccd0;
        this.a = gayl0;
        gfvh gfvh0 = new gfvh();
        gfvh0.f(gfvh.a(Duration.ofMinutes(5L)), TimeUnit.NANOSECONDS);
        gfvh0.n();
        gfvh0.i(new gbjf());
        this.c = gfvh0.b();
    }

    @Override  // gbkb
    public final void a(PdfInfoRequest pdfInfoRequest0, gbjy gbjy0) {
        ibuq.f(pdfInfoRequest0, "request");
        ibuq.f(gbjy0, "callback");
        icbb.b(iccl.b(this.b), null, null, new gbjd(null, this, pdfInfoRequest0, gbjy0), 3);
    }

    @Override  // gbkb
    public final void b(RenderPdfRequest renderPdfRequest0, gbke gbke0) {
        ibuq.f(renderPdfRequest0, "request");
        ibuq.f(gbke0, "callback");
        icbb.b(iccl.b(this.b), null, null, new gbje(null, renderPdfRequest0, this, gbke0), 3);
    }

    public final ibns c(String s, ParcelFileDescriptor parcelFileDescriptor0) {
        ibns ibns0;
        if(s == null || s.length() == 0) {
            s = null;
        }
        if(s == null) {
            s = UUID.randomUUID().toString();
        }
        gfvb gfvb0 = this.c;
        synchronized(gfvb0) {
            gbjc gbjc0 = (gbjc)gfvb0.d(s);
            if(gbjc0 == null) {
                ibuq.f(parcelFileDescriptor0, "fileDescriptor");
                gbjc gbjc1 = new gbjc(new PdfRenderer(parcelFileDescriptor0));
                gfvb0.h(s, gbjc1);
                ibns0 = new ibns(gbjc1, Boolean.valueOf(true));
            }
            else {
                ibns0 = new ibns(gbjc0, Boolean.valueOf(false));
            }
        }
        gbjc gbjc2 = (gbjc)ibns0.a;
        if(!((Boolean)ibns0.b).booleanValue()) {
            parcelFileDescriptor0.close();
        }
        return new ibns(s, gbjc2);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        gbjy gbjy0 = null;
        switch(v) {
            case 2: {
                PdfInfoRequest pdfInfoRequest0 = (PdfInfoRequest)wbz.a(parcel0, PdfInfoRequest.CREATOR);
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.wallet.bender3.framework.service.pdfrenderer.idl.IGetPdfInfoCallback");
                    gbjy0 = (iInterface0 instanceof gbjy) ? ((gbjy)iInterface0) : new gbjw(iBinder0);
                }
                gbka.gr(parcel0);
                this.a(pdfInfoRequest0, gbjy0);
                return true;
            }
            case 3: {
                RenderPdfRequest renderPdfRequest0 = (RenderPdfRequest)wbz.a(parcel0, RenderPdfRequest.CREATOR);
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.wallet.bender3.framework.service.pdfrenderer.idl.IRenderPdfCallback");
                    gbjy0 = (iInterface1 instanceof gbke) ? ((gbke)iInterface1) : new gbkc(iBinder1);
                }
                gbka.gr(parcel0);
                this.b(renderPdfRequest0, ((gbke)gbjy0));
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

