import java.io.IOException;

public final class fcgc {
    private static final fcgf a;

    static {
        fcgc.a = new fcgf(new String[]{"RestoreUtils"});
    }

    public static aktu a(aqej aqej0) {
        try {
            ByteString hfsf0 = aqej0.d;
            hftc hftc0 = hftc.a();
            hfsl hfsl0 = hfsf0.k();
            ProtoLiteMessage hftv0 = ((ProtoLiteMessage)aktv.a).x_newMutableInstance();
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
            aktu aktu0 = aktu.b(((aktv)hftv0).c);
            return aktu0 == null ? aktu.a : aktu0;
        }
        catch(hfur hfur0) {
            fcgc.a.g("VaultMetadata was not a valid proto", hfur0, new Object[0]);
            return aktu.a;
        }
    }
}

