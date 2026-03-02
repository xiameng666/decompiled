import java.io.IOException;

public final class cbjb implements cbiw {
    private static final bboh a;
    private final ibts b;

    static {
        cbjb.a = bboh.b("FinishFlowMessageHandler", bbcu.ac);
    }

    public cbjb(ibts ibts0) {
        this.b = ibts0;
    }

    @Override  // cbiw
    public final Object a(ByteString hfsf0, ibrl ibrl0) {
        gvln gvln0;
        int v;
        hftc hftc0 = hftc.a();
        hfsl hfsl0 = hfsf0.k();
        ProtoLiteMessage hftv0 = ((ProtoLiteMessage)gvlo.a).x_newMutableInstance();
        try {
            hfwc hfwc0 = hfvu.a.c(hftv0);
            hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
            hfwc0.g(hftv0);
            v = 0;
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
        ibuq.e(((gvlo)hftv0), "parseFrom(...)");
        switch(((gvlo)hftv0).b) {
            case 0: {
                gvln0 = gvln.a;
                break;
            }
            case 1: {
                gvln0 = gvln.b;
                break;
            }
            case 2: {
                gvln0 = gvln.c;
                break;
            }
            default: {
                gvln0 = null;
            }
        }
        if(gvln0 == null) {
            gvln0 = gvln.d;
        }
        ibuq.e(gvln0, "getStatus(...)");
        if(gvln0 == gvln.b) {
            v = -1;
        }
        ((ggtj)cbjb.a.h()).P("Finish flow with status (resultCode): %s (%s)", gvln0, v);
        this.b.a(new Integer(v));
        return null;
    }
}

