import com.google.android.gms.auth.api.phone.internal.SmsRetrieverEvent;

public final class aicq {
    public final SmsRetrieverEvent a;
    public final boolean b;

    public aicq() {
        throw null;
    }

    public aicq(SmsRetrieverEvent smsRetrieverEvent0, boolean z) {
        this.a = smsRetrieverEvent0;
        this.b = z;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof aicq) && this.a.equals(((aicq)object0).a) && this.b == ((aicq)object0).b;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() ^ 1000003;
        return this.b ? 0x4CF ^ v * 1000003 : 0x4D5 ^ v * 1000003;
    }

    @Override
    public final String toString() {
        return "InternalSmsRetrieverEventWrapper{event=" + this.a.toString() + ", attachOperatorName=" + this.b + "}";
    }
}

