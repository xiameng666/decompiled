import java.io.IOException;

public final class etmr implements evqk {
    @Override  // evqk
    public final evql a(Object object0) {
        ByteString hfsf0 = (ByteString)object0;
        try {
            hftc hftc0 = hftc.a();
            hfsl hfsl0 = hfsf0.k();
            ProtoLiteMessage hftv0 = ((ProtoLiteMessage)ftkc.a).x_newMutableInstance();
            try {
                hfwc hfwc0 = hfvu.a.c(hftv0);
                hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
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
            try {
                hfsl0.z(0);
            }
            catch(hfur hfur4) {
                hfur4.a = hftv0;
                throw hfur4;
            }
            ProtoLiteMessage.P_makeImmutable(hftv0);
            ibuq.e(((ftkc)hftv0), "parseFrom(...)");
            return evrg.d(((ftkc)hftv0));
        }
        catch(hfur hfur0) {
            return evrg.c(hfur0);
        }
    }
}

