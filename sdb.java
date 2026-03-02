import android.graphics.Bitmap;
import android.os.PersistableBundle;

public final class sdb implements scz {
    public static final sda a;
    public final Bitmap b;

    static {
        sdb.a = new sda();
    }

    public sdb(Bitmap bitmap0) {
        ibuq.f(bitmap0, "value");
        super();
        this.b = bitmap0;
    }

    @Override  // scz
    public final PersistableBundle a() {
        return sda.f(this.b);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof sdb) && ibuq.m(sda.e(this.b), sda.e(((sdb)object0).b));
    }

    @Override
    public final int hashCode() {
        return sda.e(this.b).hashCode();
    }

    @Override
    public final String toString() {
        return "PersistableBitmap";
    }
}

