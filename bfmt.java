import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class bfmt implements ldr {
    @Override  // ldr
    public final Object a() {
        return bfmw.a(((ProtoLiteMessage)bfmv.a).v_newBuilder()).a();
    }

    @Override  // ldr
    public final Object b(InputStream inputStream0) {
        hfsl hfsl0 = hfsl.N(inputStream0);
        ProtoLiteMessage hftv0 = ((ProtoLiteMessage)bfmv.a).x_newMutableInstance();
        try {
            hfwc hfwc0 = hfvu.a.c(hftv0);
            hfwc0.l(hftv0, hfsm.p(hfsl0), hftc.a);
            hfwc0.g(hftv0);
        }
        catch(hfur hfur0) {
            if(hfur0.b) {
                hfur0 = new hfur(hfur0);
            }
            hfur0.a = hftv0;
            throw hfur0;
        }
        catch(hfwr hfwr0) {
            hfur hfur1 = hfwr0.a();
            hfur1.a = hftv0;
            throw hfur1;
        }
        catch(IOException iOException0) {
            if((iOException0.getCause() instanceof hfur)) {
                throw (hfur)iOException0.getCause();
            }
            hfur hfur2 = new hfur(iOException0);
            hfur2.a = hftv0;
            throw hfur2;
        }
        catch(RuntimeException runtimeException0) {
            if((runtimeException0.getCause() instanceof hfur)) {
                throw (hfur)runtimeException0.getCause();
            }
            throw runtimeException0;
        }
        ProtoLiteMessage.P_makeImmutable(hftv0);
        ibuq.e(((bfmv)hftv0), "parseFrom(...)");
        return (bfmv)hftv0;
    }

    @Override  // ldr
    public final Object c(Object object0, OutputStream outputStream0) {
        ((bfmv)object0).writeToStream(outputStream0);
        return ibom.a;
    }
}

