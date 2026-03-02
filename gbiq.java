import java.util.Set;

public final class gbiq {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final hhdd d;
    public final Set e;

    public gbiq(int v, boolean z, boolean z1, hhdd hhdd0, Set set0) {
        this.a = v;
        this.b = z;
        this.c = z1;
        this.d = hhdd0;
        this.e = set0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof gbiq)) {
            return false;
        }
        if(this.a != ((gbiq)object0).a) {
            return false;
        }
        if(this.b != ((gbiq)object0).b) {
            return false;
        }
        if(this.c != ((gbiq)object0).c) {
            return false;
        }
        return ibuq.m(this.d, ((gbiq)object0).d) ? ibuq.m(this.e, ((gbiq)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        hhdd hhdd0 = this.d;
        if(hhdd0 == null) {
            return ((this.a * 0x1F + gbip.a(this.b)) * 0x1F + gbip.a(this.c)) * 0x1F * 0x1F + this.e.hashCode();
        }
        if(((ProtoLiteMessage)hhdd0).isImmutable()) {
            int v = ((ProtoLiteMessage)hhdd0).s();
            return (((this.a * 0x1F + gbip.a(this.b)) * 0x1F + gbip.a(this.c)) * 0x1F + v) * 0x1F + this.e.hashCode();
        }
        int v1 = hhdd0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)hhdd0).s();
            hhdd0.memoizedHashCode = v1;
        }
        return (((this.a * 0x1F + gbip.a(this.b)) * 0x1F + gbip.a(this.c)) * 0x1F + v1) * 0x1F + this.e.hashCode();
    }

    @Override
    public final String toString() {
        return "StaticSystemData(batteryPercentage=" + this.a + ", isDevModeOn=" + this.b + ", nonPlayInstallAllowed=" + this.c + ", riskLocation=" + this.d + ", supportedCompressionTypes=" + this.e + ")";
    }
}

