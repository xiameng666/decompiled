import com.google.android.gms.pay.bluetooth.service.PayBluetoothLeChimeraService;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;

public final class dltu implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    private final edlf d;

    public dltu(edlf edlf0) {
        this.d = edlf0;
        dxei dxei0 = new dxei(dlni.a);
        this.a = dxei0;
        dxel dxel0 = new dxel(dxei0);
        this.b = dxel0;
        this.c = DoubleCheck.b(new dojz(dxel0));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ((PayBluetoothLeChimeraService)object0).c = new doka(edlf.a(), ((dojy)this.c.get()));
    }
}

