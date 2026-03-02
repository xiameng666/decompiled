import java.util.Set;

public final class dgkn {
    public final dglj a;
    public final long b;
    public final int c;
    public final boolean d;
    public final Set e;
    public final int f;
    public final dglh g;
    public final boolean h;
    public final boolean i;

    public dgkn(dglj dglj0, long v, int v1, boolean z, Set set0, int v2, dglh dglh0) {
        ibuq.f(dglj0, "mode");
        ibuq.f(set0, "uwbSenderInfo");
        super();
        this.a = dglj0;
        this.b = v;
        this.c = v1;
        this.d = z;
        this.e = set0;
        this.f = v2;
        this.g = dglh0;
        int v3 = dglh0 instanceof dglf;
        this.h = v3;
        this.i = v3 ^ 1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dgkn)) {
            return false;
        }
        if(this.a != ((dgkn)object0).a) {
            return false;
        }
        if(this.b != ((dgkn)object0).b) {
            return false;
        }
        if(this.c != ((dgkn)object0).c) {
            return false;
        }
        if(this.d != ((dgkn)object0).d) {
            return false;
        }
        if(!ibuq.m(this.e, ((dgkn)object0).e)) {
            return false;
        }
        return this.f == ((dgkn)object0).f ? ibuq.m(this.g, ((dgkn)object0).g) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        int v1 = this.e.hashCode();
        return this.d ? (((((v + ((int)(this.b ^ this.b >>> 0x20))) * 0x1F + this.c) * 0x1F + 0x4CF) * 0x1F + v1) * 0x1F + this.f) * 0x1F + this.g.hashCode() : (((((v + ((int)(this.b ^ this.b >>> 0x20))) * 0x1F + this.c) * 0x1F + 0x4D5) * 0x1F + v1) * 0x1F + this.f) * 0x1F + this.g.hashCode();
    }

    @Override
    public final String toString() {
        return "BroadcastOptions(mode=" + this.a + ", flowId=" + this.b + ", dataUsage=" + this.c + ", requireBtAdvertise=" + this.d + ", uwbSenderInfo=" + this.e + ", vendorId=" + this.f + ", extendedIdentityData=" + this.g + ")";
    }
}

