import com.google.android.gms.auth.proximity.BlePeripheralChimeraService;
import j..util.Objects;

public final class akvi implements akup {
    final BlePeripheralChimeraService a;

    public akvi(BlePeripheralChimeraService blePeripheralChimeraService0) {
        Objects.requireNonNull(blePeripheralChimeraService0);
        this.a = blePeripheralChimeraService0;
        super();
    }

    @Override  // akup
    public final void a(String s) {
        ((ggtj)BlePeripheralChimeraService.a.j()).B("Failed to start advertising: %s", s);
        this.a.f();
    }

    @Override  // akup
    public final void b() {
        this.a.e();
    }
}

