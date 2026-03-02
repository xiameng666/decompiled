import android.os.Parcel;
import android.os.PersistableBundle;
import java.util.List;

public final class rzy extends wby implements rzz {
    private final List a;
    private int b;

    public rzy() {
        super("com.android.onboarding.tasks.service.IPersistableBundleStream");
    }

    public rzy(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        List list0 = scr.i(persistableBundle0);
        super("com.android.onboarding.tasks.service.IPersistableBundleStream");
        this.a = list0;
    }

    public rzy(scz scz0) {
        ibuq.f(scz0, "persistable");
        this(scz0.a());
    }

    @Override  // rzz
    public final byte[] a() {
        int v = this.b;
        this.b = v + 1;
        return (byte[])ibpo.U(this.a, v);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                parcel1.writeNoException();
                parcel1.writeInt(1);
                return true;
            }
            case 2: {
                byte[] arr_b = this.a();
                parcel1.writeNoException();
                parcel1.writeByteArray(arr_b);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

