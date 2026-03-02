import com.google.android.gms.auth.proximity.BlePeripheralChimeraService;

public final class akvg implements Runnable {
    public final BlePeripheralChimeraService a;
    public final byte[] b;

    public akvg(BlePeripheralChimeraService blePeripheralChimeraService0, byte[] arr_b) {
        this.a = blePeripheralChimeraService0;
        this.b = arr_b;
    }

    @Override
    public final void run() {
        akyf akyf0 = akyf.c(this.a);
        ByteString hfsf0 = ByteString.copyFrom(this.b);
        try {
            akyf0.e();
            akyf0.g.a().f(hfsf0, bbpj.a(akyf0.b).h());
        }
        catch(ywm ywm0) {
            a.ae(akyf.a.j(), "onEidChanged error", ywm0);
        }
    }
}

