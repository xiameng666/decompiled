import java.io.IOException;
import java.util.List;

public final class igyb extends igyc {
    public final grku a;
    public final grns b;
    public final boolean c;
    public static final int d;

    public igyb() {
        this(null);
    }

    public igyb(grku grku0, grns grns0, boolean z) {
        ibuq.f(grku0, "event");
        super();
        this.a = grku0;
        this.b = grns0;
        this.c = z;
    }

    public igyb(byte[] arr_b) {
        this(grku.a, null, true);
    }

    @Override  // igyc
    public final List a() {
        return ibpo.g(new fsry[]{fssm.e(((MessageLite)this.a)), fssm.e(((MessageLite)this.b)), new fssa(Boolean.valueOf(this.c))});
    }

    @Override  // igyc
    public final igyc c(List list0) {
        ibuq.f(list0, "args");
        boolean z = false;
        fsvb fsvb0 = (fsvb)list0.get(0);
        hfsl hfsl0 = (fsvb0.b == 6 ? ((ByteString)fsvb0.c) : ByteString.b).k();
        ProtoLiteMessage hftv0 = ((ProtoLiteMessage)grku.a).x_newMutableInstance();
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
        ibuq.e(((grku)hftv0), "parseFrom(...)");
        grns grns0 = (grns)fssm.h(((fsvb)list0.get(1)), new igya());
        fsvb fsvb1 = (fsvb)list0.get(2);
        if(fsvb1.b == 1) {
            z = ((Boolean)fsvb1.c).booleanValue();
        }
        return new igyb(((grku)hftv0), grns0, z);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof igyb)) {
            return false;
        }
        if(!ibuq.m(this.a, ((igyb)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((igyb)object0).b) ? this.c == ((igyb)object0).c : false;
    }

    @Override
    public final int hashCode() {
        int v;
        grku grku0 = this.a;
        if(((ProtoLiteMessage)grku0).isImmutable()) {
            v = ((ProtoLiteMessage)grku0).s();
        }
        else {
            int v1 = grku0.memoizedHashCode;
            if(v1 == 0) {
                v1 = ((ProtoLiteMessage)grku0).s();
                grku0.memoizedHashCode = v1;
            }
            v = v1;
        }
        grns grns0 = this.b;
        if(grns0 == null) {
            return this.c ? v * 0x1F * 0x1F + 0x4CF : v * 0x1F * 0x1F + 0x4D5;
        }
        if(((ProtoLiteMessage)grns0).isImmutable()) {
            int v2 = ((ProtoLiteMessage)grns0).s();
            return this.c ? (v * 0x1F + v2) * 0x1F + 0x4CF : (v * 0x1F + v2) * 0x1F + 0x4D5;
        }
        int v3 = grns0.memoizedHashCode;
        if(v3 == 0) {
            v3 = ((ProtoLiteMessage)grns0).s();
            grns0.memoizedHashCode = v3;
        }
        return this.c ? (v * 0x1F + v3) * 0x1F + 0x4CF : (v * 0x1F + v3) * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        return "WriteAuditRecord(event=" + this.a + ", uiContext=" + this.b + ", recordAndroidDeviceId=" + this.c + ")";
    }
}

