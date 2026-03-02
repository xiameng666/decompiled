import java.io.IOException;

public final class igxs implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((fsvb)object0), "$this$nullable");
        ByteString hfsf0 = ((fsvb)object0).b == 6 ? ((ByteString)((fsvb)object0).c) : ByteString.b;
        hftc hftc0 = hftc.a();
        hfsl hfsl0 = hfsf0.k();
        ProtoLiteMessage hftv0 = ((ProtoLiteMessage)gjdw.a).x_newMutableInstance();
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
        return (gjdw)hftv0;
    }
}

