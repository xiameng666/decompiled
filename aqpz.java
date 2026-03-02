import java.util.Locale;

public final class aqpz {
    public final arzs a;
    public final boolean b;

    public aqpz(arzs arzs0, boolean z) {
        this.a = arzs0;
        this.b = z;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof aqpz) ? ((ProtoLiteMessage)this.a).equals(((aqpz)object0).a) && this.b == ((aqpz)object0).b : false;
    }

    @Override
    public final int hashCode() {
        arzs arzs0 = this.a;
        if(((ProtoLiteMessage)arzs0).isImmutable()) {
            return ((ProtoLiteMessage)arzs0).s() + this.b * 0x1F;
        }
        int v = arzs0.memoizedHashCode;
        if(v == 0) {
            v = ((ProtoLiteMessage)arzs0).s();
            arzs0.memoizedHashCode = v;
        }
        return v + this.b * 0x1F;
    }

    @Override
    public final String toString() {
        Long long0 = (long)this.a.d;
        Long long1 = (long)this.a.c;
        return this.b ? String.format(Locale.US, "QuotaInfo[%d/%d bytes used, %s]", long0, long1, "fresh") : String.format(Locale.US, "QuotaInfo[%d/%d bytes used, %s]", long0, long1, "stale");
    }
}

