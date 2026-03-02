import java.io.IOException;

public final class cbje implements cbiw {
    private static final bboh a;
    private final ibts b;

    static {
        cbje.a = bboh.b("ShowAccountPickerMessageHandler", bbcu.ac);
    }

    public cbje(ibts ibts0) {
        this.b = ibts0;
    }

    @Override  // cbiw
    public final Object a(ByteString hfsf0, ibrl ibrl0) {
        hftc hftc0 = hftc.a();
        hfsl hfsl0 = hfsf0.k();
        ProtoLiteMessage hftv0 = ((ProtoLiteMessage)gvlw.a).x_newMutableInstance();
        try {
            hfwc hfwc0 = hfvu.a.c(hftv0);
            hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
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
        try {
            hfsl0.z(0);
        }
        catch(hfur hfur3) {
            hfur3.a = hftv0;
            throw hfur3;
        }
        ProtoLiteMessage.P_makeImmutable(hftv0);
        ibuq.e(((gvlw)hftv0), "parseFrom(...)");
        ((ggtj)cbje.a.h()).x("Showing account picker.");
        String s = ((gvlw)hftv0).b;
        ibuq.e(s, "getContinueUrl(...)");
        this.b.a(s);
        return null;
    }
}

