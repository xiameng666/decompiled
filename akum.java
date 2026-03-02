import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;
import j..util.Objects;
import java.util.Locale;

final class akum extends AdvertiseCallback {
    final aliu a;
    final byte[] b;
    final akup c;
    final akun d;

    public akum(akun akun0, aliu aliu0, byte[] arr_b, akup akup0) {
        this.a = aliu0;
        this.b = arr_b;
        this.c = akup0;
        Objects.requireNonNull(akun0);
        this.d = akun0;
        super();
    }

    @Override  // android.bluetooth.le.AdvertiseCallback
    public final void onStartFailure(int v) {
        this.d.c.g = null;
        akus.e(this.d.c);
        this.d.c.f(3, 3);
        this.a.T(v);
        this.d.c.e = null;
        this.c.a(String.format(Locale.US, "Failed to start advertisement: error_code=%d", v));
    }

    @Override  // android.bluetooth.le.AdvertiseCallback
    public final void onStartSuccess(AdvertiseSettings advertiseSettings0) {
        akus.a.h("Advertising successful.", new Object[0]);
        this.d.c.f(3, 2);
        this.a.U();
        this.d.c.b();
        byte[] arr_b = this.b;
        this.d.c.e = "0x" + bboy.c(arr_b);
        akuq akuq0 = this.d.c.j;
        if(akuq0 != null) {
            akuq0.a(arr_b);
        }
        this.c.b();
    }
}

