import java.util.List;

public final class eyox {
    public final boolean a;
    public final List b;
    public final boolean c;
    public final eyuk d;
    public final eyov e;
    public final eyow f;

    public eyox(boolean z, List list0, boolean z1, eyuk eyuk0, eyov eyov0, eyow eyow0) {
        ibuq.f(eyuk0, "enrollmentUiState");
        ibuq.f(eyov0, "enrollmentType");
        ibuq.f(eyow0, "secondaryAction");
        super();
        this.a = z;
        this.b = list0;
        this.c = z1;
        this.d = eyuk0;
        this.e = eyov0;
        this.f = eyow0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof eyox)) {
            return false;
        }
        if(this.a != ((eyox)object0).a) {
            return false;
        }
        if(!ibuq.m(this.b, ((eyox)object0).b)) {
            return false;
        }
        if(this.c != ((eyox)object0).c) {
            return false;
        }
        if(!ibuq.m(this.d, ((eyox)object0).d)) {
            return false;
        }
        return this.e == ((eyox)object0).e ? this.f == ((eyox)object0).f : false;
    }

    @Override
    public final int hashCode() {
        return ((((eyou.a(this.a) * 0x1F + this.b.hashCode()) * 0x1F + eyou.a(this.c)) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode();
    }

    @Override
    public final String toString() {
        return "DiscoveredDeviceListUiState(isEnrolling=" + this.a + ", unenrolledDeviceUiStates=" + this.b + ", isSearchingForDevices=" + this.c + ", enrollmentUiState=" + this.d + ", enrollmentType=" + this.e + ", secondaryAction=" + this.f + ")";
    }
}

