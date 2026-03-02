import android.os.PersistableBundle;
import java.util.ArrayList;
import java.util.List;

public final class rki implements scz, sec {
    public final List a;
    public final boolean b;

    public rki(List list0, boolean z) {
        ibuq.f(list0, "acceptsInterrupts");
        super();
        this.a = list0;
        this.b = z;
    }

    @Override  // scz
    public final PersistableBundle a() {
        PersistableBundle persistableBundle0 = new PersistableBundle();
        sdq sdq0 = sdq.a;
        ArrayList arrayList0 = new ArrayList(ibpo.q(this.a, 10));
        for(Object object0: this.a) {
            arrayList0.add(new rkg(((rkc)object0)));
        }
        persistableBundle0.putPersistableBundle("acceptsInterrupts", sdq0.a(arrayList0));
        persistableBundle0.putString("empty", String.valueOf(this.b));
        return persistableBundle0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof rki)) {
            return false;
        }
        return ibuq.m(this.a, ((rki)object0).a) ? this.b == ((rki)object0).b : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        return this.b ? v + 0x4CF : v + 0x4D5;
    }

    @Override
    public final String toString() {
        return "PBackgroundOnboardingNode(acceptsInterrupts=" + this.a + ", empty=" + this.b + ")";
    }
}

