import android.bluetooth.BluetoothAdapter;
import android.content.IntentFilter;
import com.google.android.gms.fido.authenticator.service.controllers.TurnOnBluetoothStageHandler.2;
import java.util.concurrent.TimeUnit;

public final class bltf implements glzn {
    public final blti a;

    public bltf(blti blti0) {
        this.a = blti0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        switch(((int)(((Integer)object0)))) {
            case 0: {
                blti blti0 = this.a;
                gmcd gmcd0 = jqy.a(new bltg(blti0));
                if(blti0.g != null) {
                    bltd bltd0 = blti0.h;
                    gftb.check(bltd0);
                    bltd0.a(Integer.valueOf(8));
                    return gmcd0;
                }
                BluetoothAdapter bluetoothAdapter0 = blti0.f;
                if(bluetoothAdapter0 == null) {
                    bltd bltd1 = blti0.h;
                    gftb.check(bltd1);
                    bltd1.a(Integer.valueOf(8));
                    return gmcd0;
                }
                blti0.g = new TurnOnBluetoothStageHandler.2(blti0);
                IntentFilter intentFilter0 = new IntentFilter();
                intentFilter0.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
                jwe.b(blti0.a, blti0.g, intentFilter0, 2);
                bluetoothAdapter0.enable();
                return gmbu.q(gmcd0, hsvp.a.c().a(), TimeUnit.MILLISECONDS, blti0.d);
            }
            case 1: {
                return gmbu.i(Integer.valueOf(0));
            }
            default: {
                return gmbu.i(((Integer)object0));
            }
        }
    }
}

