import android.os.Parcel;
import android.os.PersistableBundle;
import java.util.Arrays;

public abstract class hjlc {
    protected abstract int a();

    public PersistableBundle b() {
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putInt("bundle_version", this.a());
        persistableBundle0.putString("protocol_name", this.c());
        return persistableBundle0;
    }

    public abstract String c();

    private final byte[] d() {
        Parcel parcel0 = Parcel.obtain();
        this.b().writeToParcel(parcel0, 0);
        byte[] arr_b = parcel0.marshall();
        parcel0.recycle();
        return arr_b;
    }

    public static int e(PersistableBundle persistableBundle0) {
        return persistableBundle0.getInt("bundle_version", -1);
    }

    @Override
    public boolean equals(Object object0) {
        return (object0 instanceof hjlc) && Arrays.equals(this.d(), ((hjlc)object0).d());
    }

    public static boolean f(PersistableBundle persistableBundle0, String s) {
        return persistableBundle0.getString("protocol_name", "unknown").equals(s);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(this.d());
    }
}

