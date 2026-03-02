import android.content.Intent;
import android.os.ParcelFileDescriptor;
import com.google.android.wallet.bender3.framework.service.pdfrenderer.idl.PdfInfoRequest;
import com.google.android.wallet.bender3.framework.service.pdfrenderer.idl.PdfInfoResult;

public final class gaqs extends gaok {
    private final ibrt b;
    private final gbjh c;

    public gaqs(gamx gamx0) {
        ibuq.f(gblw.a, "coroutineContext");
        super(gamx0);
        this.b = gblw.a;
        this.c = gamx0.g;
    }

    @Override  // gamu
    public final ganp a(gano gano0) {
        Object object0;
        ibuq.f(gano0, "request");
        try {
            object0 = (ganp)evrg.n(ictn.a(icbb.a(iccl.b(this.b), null, null, new gaqq(this, gano0, null), 3)));
        }
        catch(Throwable throwable0) {
            object0 = ibnx.a(throwable0);
        }
        Throwable throwable1 = ibnw.a(object0);
        ganp ganp0 = throwable1 == null ? ((ganp)object0) : ganp.l(throwable1);
        ibuq.e(ganp0, "fold(...)");
        return ganp0;
    }

    public final Object b(gano gano0, ibrl ibrl0) {
        Object object2;
        Object object1;
        Object object0;
        gaqr gaqr0;
        if((ibrl0 instanceof gaqr)) {
            gaqr0 = (gaqr)ibrl0;
            int v = gaqr0.c;
            if((v & 0x80000000) == 0) {
                gaqr0 = new gaqr(this, ibrl0);
            }
            else {
                gaqr0.c = v - 0x80000000;
            }
        }
        else {
            gaqr0 = new gaqr(this, ibrl0);
        }
        try {
            object0 = gaqr0.a;
            object1 = ibrx.a;
            switch(gaqr0.c) {
                case 0: {
                    goto label_13;
                }
                case 1: {
                    goto label_43;
                }
                case 2: {
                    goto label_48;
                }
            }
        }
        catch(Throwable throwable0) {
            goto label_54;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_13:
        ibnx.b(object0);
        try {
            switch(gaqp.c(gano0)) {
                case 0: {
                    gavv.b("BW_RPA_01", this.d().b, new gaqm(), 4);
                    object2 = ganp.e(2);
                    break;
                }
                case 1: {
                    this.d().c.e("perform GET_INFO_ACTION_ID");
                    gaqr0.c = 1;
                    ParcelFileDescriptor parcelFileDescriptor0 = gaqp.b(gano0);
                    gavr.d(parcelFileDescriptor0, "BE_RPA_01", this.d().b, null, "pdfFileDescriptor was null", 8);
                    PdfInfoRequest pdfInfoRequest0 = new PdfInfoRequest(parcelFileDescriptor0, gaqp.a(gano0));
                    object0 = this.c.a.a(pdfInfoRequest0, gaqr0);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_44;
                }
                case 2: {
                    this.d().c.e("perform RENDER_PAGE_ACTION_ID");
                    gaqr0.c = 2;
                    ParcelFileDescriptor parcelFileDescriptor1 = gaqp.b(gano0);
                    gavr.d(parcelFileDescriptor1, "BE_RPA_02", this.d().b, null, "pdfFileDescriptor was null", 8);
                    ibuq.f(gano0, "<this>");
                    ibuq.e(gano0.a, "getIntent(...)");
                    int v1 = gano0.a.getIntExtra("startPage", 0);
                    ibuq.f(gano0, "<this>");
                    ibuq.e(gano0.a, "getIntent(...)");
                    int v2 = gano0.a.getIntExtra("pageCount", 1);
                    String s = gaqp.a(gano0);
                    object0 = this.c.a(parcelFileDescriptor1, v1, v2, s, gaqr0);
                    if(object0 != object1) {
                        goto label_49;
                    }
                    return object1;
                label_43:
                    ibnx.b(object0);
                label_44:
                    object2 = ganp.e(0);
                    if(((PdfInfoResult)object0) != null) {
                        bauc.l(((PdfInfoResult)object0), ((Intent)object2), "pdfInfo");
                        break;
                    label_48:
                        ibnx.b(object0);
                    label_49:
                        object2 = ganp.e(0);
                        if(((fbbr)object0) != null) {
                            gawi.q(((Intent)object2), "renderedPdfData", ((MessageLite)(((fbbr)object0))));
                        }
                    }
                    break;
                }
                default: {
                    gavv.b("BW_RPA_02", this.d().b, new gaqn(gano0), 4);
                    object2 = ganp.e(2);
                }
            }
        }
        catch(Throwable throwable0) {
        label_54:
            object2 = ibnx.a(throwable0);
        }
        Throwable throwable1 = ibnw.a(object2);
        if(throwable1 != null) {
            this.d().c.f("exception caught performing action: %s", new Object[]{throwable1});
            gavv.b("BW_RPA_03", this.d().b, new gaqo(throwable1), 4);
        }
        Throwable throwable2 = ibnw.a(object2);
        return throwable2 == null ? new ganp(((Intent)object2)) : ganp.l(throwable2);
    }
}

