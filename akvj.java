import com.google.android.gms.auth.proximity.BlePeripheralChimeraService;
import j..util.Objects;
import java.io.IOException;

public final class akvj implements gema {
    final BlePeripheralChimeraService a;

    public akvj(BlePeripheralChimeraService blePeripheralChimeraService0) {
        Objects.requireNonNull(blePeripheralChimeraService0);
        this.a = blePeripheralChimeraService0;
        super();
    }

    @Override  // gema
    public final void a(gelz gelz0) {
        gelz0.f();
        akvp akvp0 = new akvp(gelz0);
        BlePeripheralChimeraService blePeripheralChimeraService0 = this.a;
        akzp akzp0 = new akzp(blePeripheralChimeraService0, blePeripheralChimeraService0.b.e());
        akvp0.d(blePeripheralChimeraService0.c);
        if(blePeripheralChimeraService0.d.h()) {
            blePeripheralChimeraService0.d.j.post(new akuu(blePeripheralChimeraService0.d, akvp0));
        }
        synchronized(akvp0.c) {
            akvp0.f = akzp0;
            akvp0.g = akzp0;
            akvp0.e = akvp0.d.a("peripheral_role_receive_initiator_hello_time");
            akvp0.n(2);
        }
    }

    @Override  // gema
    public final void b(IOException iOException0) {
        a.ae(BlePeripheralChimeraService.a.j(), "Failed to create Weave transport", iOException0);
    }
}

