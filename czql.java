import java.util.UUID;

public final class czql {
    public final String a;
    public final czsy b;
    public final boolean c;
    public final String d;
    public final UUID e;
    public final int f;

    public czql() {
        throw null;
    }

    public czql(String s, czsy czsy0, boolean z, String s1, UUID uUID0, int v) {
        this.a = s;
        this.b = czsy0;
        this.c = z;
        this.d = s1;
        this.e = uUID0;
        this.f = v;
    }

    public static czqk a() {
        czqk czqk0 = new czqk();
        czqk0.c(false);
        czqk0.a = null;
        czqk0.f(czup.b);
        czqk0.d(3);
        return czqk0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof czql) && this.a.equals(((czql)object0).a) && this.b.equals(((czql)object0).b) && this.c == ((czql)object0).c) {
            String s = this.d;
            if(s == null) {
                return ((czql)object0).d == null ? this.e.equals(((czql)object0).e) && this.f == ((czql)object0).f : false;
            }
            return s.equals(((czql)object0).d) ? this.e.equals(((czql)object0).e) && this.f == ((czql)object0).f : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = (this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode();
        int v1 = this.d == null ? 0 : this.d.hashCode();
        return this.c ? this.f ^ (((v * 1000003 ^ 0x4CF) * 1000003 ^ v1) * 1000003 ^ this.e.hashCode()) * 1000003 : this.f ^ (((v * 1000003 ^ 0x4D5) * 1000003 ^ v1) * 1000003 ^ this.e.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "BleConnectionInfo{serviceId=" + this.a + ", blePeripheral=" + this.b + ", forceL2cap=" + this.c + ", connectionToken=" + this.d + ", serviceUuid=" + this.e + ", powerLevel=" + this.f + "}";
    }
}

