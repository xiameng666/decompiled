import android.os.PersistableBundle;
import java.util.ArrayList;
import java.util.List;

public final class rzh implements scz, sec {
    public static final rzg a;
    public final List b;
    public final boolean c;
    public final boolean d;

    static {
        rzh.a = new rzg();
    }

    public rzh(List list0, boolean z, boolean z1) {
        ibuq.f(list0, "triggers");
        super();
        this.b = list0;
        this.c = z;
        this.d = z1;
    }

    public rzh(rzn rzn0) {
        ibuq.f(rzn0, "source");
        ryz[] arr_ryz = rzn0.c();
        ArrayList arrayList0 = new ArrayList(arr_ryz.length);
        for(int v = 0; v < arr_ryz.length; ++v) {
            arrayList0.add(arr_ryz[v]);
        }
        this(arrayList0, rzn0.a(), rzn0.b());
    }

    @Override  // scz
    public final PersistableBundle a() {
        PersistableBundle persistableBundle0 = new PersistableBundle();
        sdq sdq0 = sdq.a;
        ArrayList arrayList0 = new ArrayList(ibpo.q(this.b, 10));
        for(Object object0: this.b) {
            arrayList0.add(new rze(((ryz)object0)));
        }
        persistableBundle0.putPersistableBundle("triggers", sdq0.a(arrayList0));
        persistableBundle0.putString("readOnlyOnce", String.valueOf(this.c));
        persistableBundle0.putString("runAgainOnSuccessiveTriggers", String.valueOf(this.d));
        return persistableBundle0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof rzh)) {
            return false;
        }
        if(!ibuq.m(this.b, ((rzh)object0).b)) {
            return false;
        }
        return this.c == ((rzh)object0).c ? this.d == ((rzh)object0).d : false;
    }

    @Override
    public final int hashCode() {
        return (this.b.hashCode() * 0x1F + rzd.a(this.c)) * 0x1F + rzd.a(this.d);
    }

    @Override
    public final String toString() {
        return "PPrecalculation(triggers=" + this.b + ", readOnlyOnce=" + this.c + ", runAgainOnSuccessiveTriggers=" + this.d + ")";
    }
}

