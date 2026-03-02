import android.content.Intent;

public final class dedi implements dcwb {
    public final dffg a;
    public final Intent b;

    public dedi(dffg dffg0, Intent intent0) {
        ibuq.f(dffg0, "shareTargetItem");
        super();
        this.a = dffg0;
        this.b = intent0;
    }

    @Override  // dcwb
    public final icig a(dcmf dcmf0) {
        ibuq.f(dcmf0, "sharingClient");
        return new icht(new dedh(this, dcmf0, null));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dedi)) {
            return false;
        }
        return ibuq.m(this.a, ((dedi)object0).a) ? ibuq.m(this.b, ((dedi)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        return this.b == null ? v : v + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "AutoSend(shareTargetItem=" + this.a + ", intent=" + this.b + ")";
    }
}

