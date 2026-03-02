import java.util.List;

public final class gbin {
    public final int a;
    public final heal b;
    public final boolean c;
    public final boolean d;
    public final List e;
    public final boolean f;

    public gbin(int v, heal heal0, boolean z, boolean z1, List list0, boolean z2) {
        ibuq.f(list0, "simCardList");
        super();
        this.a = v;
        this.b = heal0;
        this.c = z;
        this.d = z1;
        this.e = list0;
        this.f = z2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof gbin)) {
            return false;
        }
        if(this.a != ((gbin)object0).a) {
            return false;
        }
        if(!ibuq.m(this.b, ((gbin)object0).b)) {
            return false;
        }
        if(this.c != ((gbin)object0).c) {
            return false;
        }
        if(this.d != ((gbin)object0).d) {
            return false;
        }
        return ibuq.m(this.e, ((gbin)object0).e) ? this.f == ((gbin)object0).f : false;
    }

    @Override
    public final int hashCode() {
        heal heal0 = this.b;
        if(heal0 == null) {
            return (((this.a * 0x1F * 0x1F + gbim.a(this.c)) * 0x1F + gbim.a(this.d)) * 0x1F + this.e.hashCode()) * 0x1F + gbim.a(this.f);
        }
        if(((ProtoLiteMessage)heal0).isImmutable()) {
            int v = ((ProtoLiteMessage)heal0).s();
            return ((((this.a * 0x1F + v) * 0x1F + gbim.a(this.c)) * 0x1F + gbim.a(this.d)) * 0x1F + this.e.hashCode()) * 0x1F + gbim.a(this.f);
        }
        int v1 = heal0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)heal0).s();
            heal0.memoizedHashCode = v1;
        }
        return ((((this.a * 0x1F + v1) * 0x1F + gbim.a(this.c)) * 0x1F + gbim.a(this.d)) * 0x1F + this.e.hashCode()) * 0x1F + gbim.a(this.f);
    }

    @Override
    public final String toString() {
        return "SimCardWithRiskData(activeSubscriptionCount=" + this.a + ", antennaInfoSecureField=" + this.b + ", hasCameraPermission=" + this.c + ", hasReadPermission=" + this.d + ", simCardList=" + this.e + ", supportsSmsTransmission=" + this.f + ")";
    }
}

