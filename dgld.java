import java.util.List;
import java.util.Set;

public final class dgld {
    public final int a;
    public final long b;
    public final Set c;
    public final List d;
    public final List e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    private final int j;
    private final boolean k;
    private final boolean l;

    public dgld(int v, long v1, Set set0, int v2, List list0, List list1, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5) {
        ibuq.f(set0, "uwbSenderInfo");
        ibuq.f(list0, "advertisingMediums");
        ibuq.f(list1, "upgradeMediums");
        super();
        this.a = v;
        this.b = v1;
        this.c = set0;
        this.j = v2;
        this.d = list0;
        this.e = list1;
        this.f = z;
        this.k = z1;
        this.l = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dgld)) {
            return false;
        }
        if(this.a != ((dgld)object0).a) {
            return false;
        }
        if(this.b != ((dgld)object0).b) {
            return false;
        }
        if(!ibuq.m(this.c, ((dgld)object0).c)) {
            return false;
        }
        if(this.j != ((dgld)object0).j) {
            return false;
        }
        if(!ibuq.m(this.d, ((dgld)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((dgld)object0).e)) {
            return false;
        }
        if(this.f != ((dgld)object0).f) {
            return false;
        }
        if(this.k != ((dgld)object0).k) {
            return false;
        }
        if(this.l != ((dgld)object0).l) {
            return false;
        }
        if(this.g != ((dgld)object0).g) {
            return false;
        }
        return this.h == ((dgld)object0).h ? this.i == ((dgld)object0).i : false;
    }

    @Override
    public final int hashCode() {
        return ((((((((((this.a * 0x1F + ((int)(this.b ^ this.b >>> 0x20))) * 0x1F + this.c.hashCode()) * 0x1F + this.j) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + dglc.a(this.f)) * 0x1F + dglc.a(this.k)) * 0x1F + dglc.a(this.l)) * 0x1F + dglc.a(this.g)) * 0x1F + dglc.a(this.h)) * 0x1F + dglc.a(this.i);
    }

    @Override
    public final String toString() {
        return "BroadcastProviderOptions(powerLevel=" + this.a + ", flowId=" + this.b + ", uwbSenderInfo=" + this.c + ", deviceType=" + this.j + ", advertisingMediums=" + this.d + ", upgradeMediums=" + this.e + ", useStableIdentifiers=" + this.f + ", allowBluetoothRadioToggling=" + this.k + ", allowWifiRadioToggling=" + this.l + ", enableBleL2capListening=" + this.g + ", allowGattConnections=" + this.h + ", enableFastAdvertisement=" + this.i + ")";
    }
}

