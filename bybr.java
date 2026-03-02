import android.content.Intent;

public final class bybr {
    public final kxc a;
    public final String b;
    public final String c;
    public final Intent d;

    public bybr(kxc kxc0, String s, String s1, Intent intent0) {
        ibuq.f(s, "key");
        ibuq.f(s1, "subkey");
        super();
        this.a = kxc0;
        this.b = s;
        this.c = s1;
        this.d = intent0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bybr)) {
            return false;
        }
        if(!ibuq.m(this.a, ((bybr)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((bybr)object0).b)) {
            return false;
        }
        return ibuq.m(this.c, ((bybr)object0).c) ? ibuq.m(this.d, ((bybr)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
        return this.d == null ? v * 0x1F : v * 0x1F + this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "RemoteEntryInput(remoteEntry=" + this.a + ", key=" + this.b + ", subkey=" + this.c + ", fillInIntent=" + this.d + ")";
    }
}

