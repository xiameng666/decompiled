import java.io.IOException;
import java.util.List;

public final class igxk extends igyc {
    public final hapr a;
    public final String b;
    public static final int c;

    public igxk() {
        this(null);
    }

    public igxk(hapr hapr0, String s) {
        ibuq.f(hapr0, "event");
        super();
        this.a = hapr0;
        this.b = s;
    }

    public igxk(byte[] arr_b) {
        this(hapr.a, null);
    }

    @Override  // igyc
    public final List a() {
        return ibpo.g(new fsry[]{new fssc(this.a.getDefaultInstanceForType()), new fssr(this.b)});
    }

    @Override  // igyc
    public final igyc c(List list0) {
        ibuq.f(list0, "args");
        fsvb fsvb0 = (fsvb)list0.get(0);
        hfsl hfsl0 = (fsvb0.b == 6 ? ((ByteString)fsvb0.c) : ByteString.b).k();
        ProtoLiteMessage hftv0 = ((ProtoLiteMessage)hapr.a).x_newMutableInstance();
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
        try {
            hfsl0.z(0);
        }
        catch(hfur hfur3) {
            hfur3.a = hftv0;
            throw hfur3;
        }
        ProtoLiteMessage.P_makeImmutable(hftv0);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        ibuq.e(((hapr)hftv0), "parseFrom(...)");
        return new igxk(((hapr)hftv0), ((String)fssm.h(((fsvb)list0.get(1)), new igxj())));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof igxk)) {
            return false;
        }
        return ibuq.m(this.a, ((igxk)object0).a) ? ibuq.m(this.b, ((igxk)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        hapr hapr0 = this.a;
        if(((ProtoLiteMessage)hapr0).isImmutable()) {
            int v = ((ProtoLiteMessage)hapr0).s();
            return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
        }
        int v1 = hapr0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)hapr0).s();
            hapr0.memoizedHashCode = v1;
        }
        return this.b == null ? v1 * 0x1F : v1 * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "ClearcutEvent(event=" + this.a + ", sessionId=" + this.b + ")";
    }
}

