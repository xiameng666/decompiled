import j..time.Instant;
import java.util.UUID;

public final class buew {
    public final UUID a;
    public final String b;
    public final budu c;
    public final buds d;
    public final int e;
    public final Instant f;
    public final Instant g;
    public final boolean h;

    public buew() {
        this(null, null, null, 0xFF);
    }

    public buew(String s, budu budu0, buds buds0, int v) {
        UUID uUID0 = (v & 1) == 0 ? null : UUID.randomUUID();
        if((v & 2) != 0) {
            s = "";
        }
        if((v & 4) != 0) {
            budu0 = budu.a;
        }
        if((v & 8) != 0) {
            buds0 = buds.a;
        }
        this(uUID0, s, budu0, buds0, 0, null, null, false);
    }

    public buew(UUID uUID0, String s, budu budu0, buds buds0, int v, Instant instant0, Instant instant1, boolean z) {
        ibuq.f(uUID0, "id");
        ibuq.f(s, "accountName");
        ibuq.f(budu0, "subscriptionStatus");
        ibuq.f(buds0, "storageConsumption");
        super();
        this.a = uUID0;
        this.b = s;
        this.c = budu0;
        this.d = buds0;
        this.e = v;
        this.f = instant0;
        this.g = instant1;
        this.h = z;
    }

    public static buew a(buew buew0, int v, Instant instant0, Instant instant1, boolean z, int v1) {
        buds buds0 = null;
        UUID uUID0 = (v1 & 1) == 0 ? null : buew0.a;
        String s = (v1 & 2) == 0 ? null : buew0.b;
        budu budu0 = (v1 & 4) == 0 ? null : buew0.c;
        if((v1 & 8) != 0) {
            buds0 = buew0.d;
        }
        if((v1 & 16) != 0) {
            v = buew0.e;
        }
        if((v1 & 0x20) != 0) {
            instant0 = buew0.f;
        }
        ibuq.f(uUID0, "id");
        ibuq.f(s, "accountName");
        ibuq.f(budu0, "subscriptionStatus");
        ibuq.f(buds0, "storageConsumption");
        return new buew(uUID0, s, budu0, buds0, v, instant0, ((v1 & 0x40) == 0 ? instant1 : buew0.g), ((v1 & 0x80) == 0 ? z : buew0.h));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof buew)) {
            return false;
        }
        if(!ibuq.m(this.a, ((buew)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((buew)object0).b)) {
            return false;
        }
        if(this.c != ((buew)object0).c) {
            return false;
        }
        if(this.d != ((buew)object0).d) {
            return false;
        }
        if(this.e != ((buew)object0).e) {
            return false;
        }
        if(!ibuq.m(this.f, ((buew)object0).f)) {
            return false;
        }
        return ibuq.m(this.g, ((buew)object0).g) ? this.h == ((buew)object0).h : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e) * 0x1F + (this.f == null ? 0 : this.f.hashCode())) * 0x1F;
        Instant instant0 = this.g;
        if(instant0 != null) {
            v = instant0.hashCode();
        }
        return this.h ? (v1 + v) * 0x1F + 0x4CF : (v1 + v) * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        return "StorageCardEligibilityCooldown(id=" + this.a + ", accountName=" + this.b + ", subscriptionStatus=" + this.c + ", storageConsumption=" + this.d + ", timesShown=" + this.e + ", firstImpressionInstant=" + this.f + ", lastImpressionInstant=" + this.g + ", wasDismissed=" + this.h + ")";
    }
}

