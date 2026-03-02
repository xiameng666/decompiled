import android.os.Parcel;
import android.os.PersistableBundle;

final class rmx extends ibsl implements ibtw {
    Object a;
    final String b;
    final PersistableBundle c;

    public rmx(String s, PersistableBundle persistableBundle0, ibrl ibrl0) {
        this.b = s;
        this.c = persistableBundle0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rmx)this.c(((lfa)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new rmx(this.b, this.c, ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        byte[] arr_b;
        ibnx.b(object0);
        lfa lfa0 = (lfa)this.a;
        ley ley0 = lfd.a(this.b);
        ibuq.f(this.c, "<this>");
        Parcel parcel0 = Parcel.obtain();
        ibuq.e(parcel0, "obtain(...)");
        try {
            parcel0.writePersistableBundle(this.c);
            arr_b = parcel0.marshall();
        }
        finally {
            parcel0.recycle();
        }
        ibuq.c(arr_b);
        lfa0.e(ley0, arr_b);
        return ibom.a;
    }
}

