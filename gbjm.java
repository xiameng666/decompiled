import com.google.android.wallet.bender3.framework.service.pdfrenderer.idl.PdfInfoRequest;
import com.google.android.wallet.bender3.framework.service.pdfrenderer.idl.RenderPdfRequest;

public final class gbjm {
    public final gayl a;
    private final gbjp b;

    public gbjm(gayl gayl0, gbjp gbjp0) {
        this.a = gayl0;
        this.b = gbjp0;
    }

    public final Object a(PdfInfoRequest pdfInfoRequest0, ibrl ibrl0) {
        gbjk gbjk0;
        if((ibrl0 instanceof gbjk)) {
            gbjk0 = (gbjk)ibrl0;
            int v = gbjk0.c;
            if((v & 0x80000000) == 0) {
                gbjk0 = new gbjk(this, ibrl0);
            }
            else {
                gbjk0.c = v - 0x80000000;
            }
        }
        else {
            gbjk0 = new gbjk(this, ibrl0);
        }
        Object object0 = gbjk0.a;
        Object object1 = ibrx.a;
        switch(gbjk0.c) {
            case 0: {
                ibnx.b(object0);
                this.a.f("InternalPdfRendererClientImpl::getPdfMetadata for %s", new Object[]{pdfInfoRequest0.b});
                gbjk0.d = pdfInfoRequest0;
                gbjk0.c = 1;
                object0 = this.b.a(gbjk0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_22;
            }
            case 1: {
                pdfInfoRequest0 = gbjk0.d;
                ibnx.b(object0);
            label_22:
                icbr icbr0 = new icbr();
                ((gbkb)object0).a(pdfInfoRequest0, new gbjx(this, pdfInfoRequest0, icbr0));
                gbjk0.d = null;
                gbjk0.c = 2;
                Object object2 = icbr0.F(gbjk0);
                return object2 == object1 ? object1 : object2;
            }
            case 2: {
                ibnx.b(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object b(RenderPdfRequest renderPdfRequest0, ibrl ibrl0) {
        gbjl gbjl0;
        if((ibrl0 instanceof gbjl)) {
            gbjl0 = (gbjl)ibrl0;
            int v = gbjl0.c;
            if((v & 0x80000000) == 0) {
                gbjl0 = new gbjl(this, ibrl0);
            }
            else {
                gbjl0.c = v - 0x80000000;
            }
        }
        else {
            gbjl0 = new gbjl(this, ibrl0);
        }
        Object object0 = gbjl0.a;
        Object object1 = ibrx.a;
        switch(gbjl0.c) {
            case 0: {
                ibnx.b(object0);
                this.a.f("InternalPdfRendererClientImpl::convertPdfToBitmaps for %s", new Object[]{renderPdfRequest0.e});
                gbjl0.d = renderPdfRequest0;
                gbjl0.c = 1;
                object0 = this.b.a(gbjl0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_22;
            }
            case 1: {
                renderPdfRequest0 = gbjl0.d;
                ibnx.b(object0);
            label_22:
                icbr icbr0 = new icbr();
                ((gbkb)object0).b(renderPdfRequest0, new gbkd(this, renderPdfRequest0, icbr0));
                gbjl0.d = null;
                gbjl0.c = 2;
                Object object2 = icbr0.F(gbjl0);
                return object2 == object1 ? object1 : object2;
            }
            case 2: {
                ibnx.b(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

