import java.io.IOException;

public final class hftq extends hfrl {
    private final ProtoLiteMessage a;

    public hftq(ProtoLiteMessage hftv0) {
        this.a = hftv0;
    }

    @Override  // hfrl
    public final MessageLite g(byte[] arr_b, int v, int v1, hftc hftc0) {
        return ProtoLiteMessage.y_parseFrom(this.a, arr_b, v, v1, hftc0);
    }

    @Override  // Parser
    public final Object s(hfsl hfsl0, hftc hftc0) {
        MessageLite hfvm0 = this.a.x_newMutableInstance();
        try {
            hfwc hfwc0 = hfvu.a.c(hfvm0);
            hfwc0.l(hfvm0, hfsm.p(hfsl0), hftc0);
            hfwc0.g(hfvm0);
            return hfvm0;
        }
        catch(hfur hfur0) {
            if(hfur0.b) {
                hfur0 = new hfur(hfur0);
            }
            hfur0.a = hfvm0;
            throw hfur0;
        }
        catch(hfwr hfwr0) {
            hfur hfur1 = hfwr0.a();
            hfur1.a = hfvm0;
            throw hfur1;
        }
        catch(IOException iOException0) {
            if((iOException0.getCause() instanceof hfur)) {
                throw (hfur)iOException0.getCause();
            }
            hfur hfur2 = new hfur(iOException0);
            hfur2.a = hfvm0;
            throw hfur2;
        }
        catch(RuntimeException runtimeException0) {
            if((runtimeException0.getCause() instanceof hfur)) {
                throw (hfur)runtimeException0.getCause();
            }
            throw runtimeException0;
        }
    }
}

