import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer.Page;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.wallet.bender3.framework.service.pdfrenderer.idl.RenderPdfRequest;
import com.google.android.wallet.bender3.framework.service.pdfrenderer.idl.RenderPdfResult;
import j..util.DesugarCollections;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class gbje extends ibsl implements ibtw {
    final RenderPdfRequest a;
    final gbke b;
    final gbka c;
    private Object d;

    public gbje(ibrl ibrl0, RenderPdfRequest renderPdfRequest0, gbka gbka0, gbke gbke0) {
        this.a = renderPdfRequest0;
        this.c = gbka0;
        this.b = gbke0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((gbje)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new gbje(ibrl0, this.a, this.c, this.b);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Bitmap bitmap0;
        Object object1;
        ibnx.b(object0);
        icck icck0 = (icck)this.d;
        try {
            RenderPdfRequest renderPdfRequest0 = this.a;
            int v = renderPdfRequest0.b;
            int v1 = renderPdfRequest0.c;
            int v2 = v + v1;
            String s = renderPdfRequest0.e;
            if(v < 0) {
                throw new IllegalStateException("Check failed.");
            }
            if(v1 <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            ibns ibns0 = this.c.c(s, renderPdfRequest0.a);
            String s1 = (String)ibns0.a;
            gbjc gbjc0 = (gbjc)ibns0.b;
            int v3 = gbjc0.b;
            if(v >= v3) {
                throw new IllegalStateException("Check failed.");
            }
            if(v2 > v3) {
                throw new IllegalStateException("Check failed.");
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fbbr.a).v_newBuilder();
            ibuq.f(hftp0, "builder");
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fbbp.a).v_newBuilder();
            ibuq.f(hftp1, "builder");
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            fbbp fbbp0 = (fbbp)hftp1.b_message;
            fbbp0.b |= 1;
            fbbp0.c = v3;
            ibuq.f(s1, "value");
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            fbbp fbbp1 = (fbbp)hftp1.b_message;
            s1.getClass();
            fbbp1.b |= 2;
            fbbp1.d = s1;
            ProtoLiteMessage hftv0 = hftp1.N_build();
            ibuq.e(hftv0, "build(...)");
            ibuq.f(((fbbp)hftv0), "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fbbr fbbr0 = (fbbr)hftp0.b_message;
            ((fbbp)hftv0).getClass();
            fbbr0.c = (fbbp)hftv0;
            fbbr0.b |= 1;
            List list0 = DesugarCollections.unmodifiableList(fbbr0.d);
            ibuq.e(list0, "getPagesList(...)");
            new hfxu(list0);
            ibwm ibwm0 = ibwt.q(v, v2);
            ArrayList arrayList0 = new ArrayList(ibpo.q(ibwm0, 10));
            ibpw ibpw0 = ibwm0.e();
            while(true) {
                if(!((ibwl)ibpw0).a) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    fbbr fbbr1 = (fbbr)hftp0.b_message;
                    hfuo hfuo0 = fbbr1.d;
                    if(!hfuo0.c()) {
                        fbbr1.d = ProtoLiteMessage.E(hfuo0);
                    }
                    hfrj.E(arrayList0, fbbr1.d);
                    ProtoLiteMessage hftv1 = hftp0.N_build();
                    ibuq.e(hftv1, "build(...)");
                    fbbr fbbr2 = (fbbr)hftv1;
                    ParcelFileDescriptor parcelFileDescriptor0 = renderPdfRequest0.d;
                    try {
                        FileOutputStream fileOutputStream0 = new FileOutputStream(parcelFileDescriptor0.getFileDescriptor());
                        try {
                            fbbr2.writeToStream(fileOutputStream0);
                        }
                        catch(Throwable throwable2) {
                            ibsx.a(fileOutputStream0, throwable2);
                            throw throwable2;
                        }
                        ibsx.a(fileOutputStream0, null);
                    }
                    catch(Throwable throwable1) {
                        ibsx.a(parcelFileDescriptor0, throwable1);
                        throw throwable1;
                    }
                    ibsx.a(parcelFileDescriptor0, null);
                    this.c.a.e("Successfully wrote output proto to output file descriptor");
                    object1 = new RenderPdfResult(fbbr2.d.size(), s1);
                    break;
                }
                int v4 = ibpw0.a();
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)fbbq.a).v_newBuilder();
                ibuq.f(hftp2, "builder");
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                fbbq fbbq0 = (fbbq)hftp2.b_message;
                fbbq0.b |= 1;
                fbbq0.c = v4;
                PdfRenderer.Page pdfRenderer$Page0 = gbjc0.a.openPage(v4);
                try {
                    bitmap0 = Bitmap.createBitmap(pdfRenderer$Page0.getWidth(), pdfRenderer$Page0.getHeight(), Bitmap.Config.ARGB_8888);
                    pdfRenderer$Page0.render(bitmap0, null, null, 1);
                }
                catch(Throwable throwable3) {
                    ibte.a(pdfRenderer$Page0, throwable3);
                    throw throwable3;
                }
                ibte.a(pdfRenderer$Page0, null);
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)fbbo.a).v_newBuilder();
                ibuq.f(hftp3, "builder");
                int v5 = bitmap0.getWidth();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                fbbo fbbo0 = (fbbo)hftp3.b_message;
                fbbo0.b |= 1;
                fbbo0.c = v5;
                int v6 = bitmap0.getHeight();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                fbbo fbbo1 = (fbbo)hftp3.b_message;
                fbbo1.b |= 2;
                fbbo1.d = v6;
                fbbn fbbn0 = fbbn.e;
                ibuq.f(fbbn0, "value");
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                fbbo fbbo2 = (fbbo)hftp3.b_message;
                fbbo2.e = fbbn0.a();
                fbbo2.b |= 4;
                ByteBuffer byteBuffer0 = ByteBuffer.allocate(bitmap0.getByteCount());
                ibuq.e(byteBuffer0, "allocate(...)");
                bitmap0.copyPixelsToBuffer(byteBuffer0);
                byteBuffer0.position(0);
                ByteString hfsf0 = ByteString.v(byteBuffer0);
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                fbbo fbbo3 = (fbbo)hftp3.b_message;
                fbbo3.b |= 8;
                fbbo3.f = hfsf0;
                ProtoLiteMessage hftv2 = hftp3.N_build();
                ibuq.e(hftv2, "build(...)");
                ibuq.f(((fbbo)hftv2), "value");
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                fbbq fbbq1 = (fbbq)hftp2.b_message;
                ((fbbo)hftv2).getClass();
                fbbq1.d = (fbbo)hftv2;
                fbbq1.b |= 2;
                ProtoLiteMessage hftv3 = hftp2.N_build();
                ibuq.e(hftv3, "build(...)");
                arrayList0.add(((fbbq)hftv3));
            }
        }
        catch(Throwable throwable0) {
            object1 = ibnx.a(throwable0);
        }
        if(ibnw.b(object1)) {
            this.b.a(Status.b, ((RenderPdfResult)object1));
        }
        Throwable throwable4 = ibnw.a(object1);
        if(throwable4 != null) {
            Log.e("PdfRendererServiceImpl", "renderPdf call failed", throwable4);
            this.b.a(Status.d, null);
        }
        return ibom.a;
    }
}

