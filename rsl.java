import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class rsl implements ldr {
    public static final rsl a;
    private static final rsn b;

    static {
        rsl.a = new rsl();
        ibuq.e(rsn.a, "getDefaultInstance(...)");
        rsl.b = rsn.a;
    }

    @Override  // ldr
    public final Object a() {
        return rsl.b;
    }

    @Override  // ldr
    public final Object b(InputStream inputStream0) {
        try {
            hfsl hfsl0 = hfsl.N(inputStream0);
            ProtoLiteMessage hftv0 = ((ProtoLiteMessage)rsn.a).x_newMutableInstance();
            try {
                hfwc hfwc0 = hfvu.a.c(hftv0);
                hfwc0.l(hftv0, hfsm.p(hfsl0), hftc.a);
                hfwc0.g(hftv0);
            }
            catch(hfur hfur1) {
                if(hfur1.b) {
                    hfur1 = new hfur(hfur1);
                }
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
            ibuq.c(((rsn)hftv0));
            return (rsn)hftv0;
        }
        catch(hfur hfur0) {
            throw new laf("Cannot read proto.", hfur0);
        }
    }

    @Override  // ldr
    public final Object c(Object object0, OutputStream outputStream0) {
        ((rsn)object0).writeToStream(outputStream0);
        return ibom.a;
    }
}

