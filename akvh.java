import com.google.android.gms.auth.proximity.BlePeripheralChimeraService;
import j..util.Objects;

public final class akvh implements akup {
    final BlePeripheralChimeraService a;

    public akvh(BlePeripheralChimeraService blePeripheralChimeraService0) {
        Objects.requireNonNull(blePeripheralChimeraService0);
        this.a = blePeripheralChimeraService0;
        super();
    }

    @Override  // akup
    public final void a(String s) {
        ((ggtj)BlePeripheralChimeraService.a.j()).B("Failed to restart advertising: %s", s);
    }

    @Override  // akup
    public final void b() {
        this.a.e();
    }
}

