import android.os.ParcelFileDescriptor;
import com.google.android.wallet.bender3.framework.service.pdfrenderer.idl.RenderPdfRequest;
import com.google.android.wallet.bender3.framework.service.pdfrenderer.idl.RenderPdfResult;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class gbjh {
    public final gbjm a;
    private final gaym b;
    private final File c;

    public gbjh(gaym gaym0, File file0, gbjm gbjm0) {
        ibuq.f(gaym0, "eventLogger");
        ibuq.f(file0, "cacheDirectory");
        super();
        this.b = gaym0;
        this.c = file0;
        this.a = gbjm0;
    }

    public final Object a(ParcelFileDescriptor parcelFileDescriptor0, int v, int v1, String s, ibrl ibrl0) {
        Object object6;
        Object object5;
        Object object4;
        Object object3;
        Throwable throwable3;
        Throwable throwable1;
        FileInputStream fileInputStream0;
        Object object2;
        gbjg gbjg0;
        if((ibrl0 instanceof gbjg)) {
            gbjg0 = (gbjg)ibrl0;
            int v2 = gbjg0.f;
            if((v2 & 0x80000000) == 0) {
                gbjg0 = new gbjg(this, ibrl0);
            }
            else {
                gbjg0.f = v2 - 0x80000000;
            }
        }
        else {
            gbjg0 = new gbjg(this, ibrl0);
        }
        Object object0 = gbjg0.d;
        Object object1 = ibrx.a;
        switch(gbjg0.f) {
            case 0: {
                ibnx.b(object0);
                boolean z = false;
                gaym gaym0 = this.b;
                gavr.c(v >= 0, "BE_PBRCI_01", gaym0, "startPage must be positive");
                if(v1 > 0) {
                    z = true;
                }
                gavr.c(z, "BE_PBRCI_02", gaym0, "numberOfPages must be greater than 0");
                File file0 = File.createTempFile("pdfrender-", ".bin", this.c);
                ibuq.e(file0, "createTempFile(...)");
                object2 = ParcelFileDescriptor.open(file0, 0x20000000);
                try {
                    fileInputStream0 = new FileInputStream(file0);
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    throw throwable1;
                }
                try {
                    file0.delete();
                    ibuq.c(object2);
                    RenderPdfRequest renderPdfRequest0 = new RenderPdfRequest(parcelFileDescriptor0, v, v1, ((ParcelFileDescriptor)object2), s);
                    gbjg0.a = object2;
                    gbjg0.b = fileInputStream0;
                    gbjg0.c = fileInputStream0;
                    gbjg0.f = 1;
                    object0 = this.a.b(renderPdfRequest0, gbjg0);
                }
                catch(Throwable throwable2) {
                    throwable3 = throwable2;
                    object3 = fileInputStream0;
                    object4 = object2;
                    throw throwable3;
                }
                if(object0 != object1) {
                    object5 = fileInputStream0;
                    object3 = object5;
                    object4 = object2;
                    goto label_52;
                }
                return object1;
            }
            case 1: {
                try {
                    object5 = gbjg0.c;
                    object3 = gbjg0.b;
                    object4 = gbjg0.a;
                    ibnx.b(object0);
                label_52:
                    RenderPdfResult renderPdfResult0 = (RenderPdfResult)object0;
                    hfsl hfsl0 = hfsl.N(((InputStream)object5));
                    ProtoLiteMessage hftv0 = ((ProtoLiteMessage)fbbr.a).x_newMutableInstance();
                    try {
                        hfwc hfwc0 = hfvu.a.c(hftv0);
                        hfwc0.l(hftv0, hfsm.p(hfsl0), hftc.a);
                        hfwc0.g(hftv0);
                    }
                    catch(hfur hfur0) {
                        hfur hfur1 = hfur0.b ? new hfur(hfur0) : hfur0;
                        hfur1.a = hftv0;
                        throw hfur1;
                    }
                    catch(hfwr hfwr0) {
                        hfur hfur2 = hfwr0.a();
                        hfur2.a = hftv0;
                        throw hfur2;
                    }
                    catch(IOException iOException0) {
                        if((iOException0.getCause() instanceof hfur)) {
                            throw (hfur)iOException0.getCause();
                        }
                        hfur hfur3 = new hfur(iOException0);
                        hfur3.a = hftv0;
                        throw hfur3;
                    }
                    catch(RuntimeException runtimeException0) {
                        if((runtimeException0.getCause() instanceof hfur)) {
                            throw (hfur)runtimeException0.getCause();
                        }
                        throw runtimeException0;
                    }
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    object6 = (fbbr)hftv0;
                    ibuq.e(object6, "parseFrom(...)");
                    goto label_87;
                }
                catch(Throwable throwable4) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throwable3 = throwable4;
        try {
            throw throwable3;
        }
        catch(Throwable throwable5) {
            try {
                ibsx.a(((Closeable)object3), throwable3);
                throw throwable5;
            label_87:
                ibsx.a(((Closeable)object3), null);
                goto label_96;
            }
            catch(Throwable throwable6) {
            }
        }
        throwable1 = throwable6;
        object2 = object4;
        try {
            throw throwable1;
        }
        catch(Throwable throwable7) {
            ibsx.a(((Closeable)object2), throwable1);
            throw throwable7;
        }
    label_96:
        ibsx.a(((Closeable)object4), null);
        return object6;
    }
}

