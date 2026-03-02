import com.google.android.gms.nearby.common.ble.BleSettings;
import j..util.Objects;

final class gyfq extends gyll {
    public final cuny a;
    final gyll b;
    public boolean c;
    final gyfs d;
    private final BleSettings f;

    public gyfq(gyfs gyfs0, cuny cuny0, BleSettings bleSettings0) {
        Objects.requireNonNull(gyfs0);
        this.d = gyfs0;
        super("BleScanning", new gyll[]{gyfs0.e, gyfs0.g, gyfs0.k});
        this.b = new gyfp(this, new gyll[0]);
        this.a = cuny0;
        this.f = bleSettings0;
        this.c = false;
    }

    @Override  // gyll
    public final long a() {
        hiex hiex0 = this.d.a.a().e;
        if(hiex0 == null) {
            hiex0 = hiex.a;
        }
        return hiex0.k;
    }

    @Override  // gyll
    public final boolean c() {
        return this.c;
    }

    @Override  // gyll
    public final boolean d() {
        boolean z = this.d.b.q(this.f, this.a);
        this.c = z;
        return z;
    }
}

