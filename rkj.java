import android.os.PersistableBundle;

public final class rkj implements scz, sec {
    public final rjz a;
    public final rjx b;
    public final boolean c;

    public rkj(rjz rjz0, rjx rjx0, boolean z) {
        ibuq.f(rjz0, "uiType");
        ibuq.f(rjx0, "backButtonBehavior");
        super();
        this.a = rjz0;
        this.b = rjx0;
        this.c = z;
    }

    @Override  // scz
    public final PersistableBundle a() {
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putPersistableBundle("uiType", scy.a(this.a));
        persistableBundle0.putPersistableBundle("backButtonBehavior", scy.a(this.b));
        persistableBundle0.putString("empty", String.valueOf(this.c));
        return persistableBundle0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof rkj)) {
            return false;
        }
        if(this.a != ((rkj)object0).a) {
            return false;
        }
        return this.b == ((rkj)object0).b ? this.c == ((rkj)object0).c : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F + this.b.hashCode();
        return this.c ? v * 0x1F + 0x4CF : v * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        return "PForegroundOnboardingNode(uiType=" + this.a + ", backButtonBehavior=" + this.b + ", empty=" + this.c + ")";
    }
}

