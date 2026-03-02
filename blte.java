import android.app.KeyguardManager;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.fido.authenticator.service.controllers.TurnOnBluetoothController.1;
import j..util.Objects;
import java.util.concurrent.TimeUnit;

public final class blte implements jqv {
    public final blti a;

    public blte(blti blti0) {
        this.a = blti0;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        Objects.requireNonNull(jqt0);
        bltc bltc0 = new bltc(jqt0);
        blti blti0 = this.a;
        BluetoothAdapter bluetoothAdapter0 = blti0.f;
        if(bluetoothAdapter0 != null && bluetoothAdapter0.getBluetoothLeAdvertiser() != null) {
            if(!bluetoothAdapter0.isEnabled()) {
                blti0.e.y(blti0.b, blhc.aB);
            }
            bltc0.a(Integer.valueOf(0));
            return "Execute turn on Bluetooth stage";
        }
        bltb bltb0 = blti0.c;
        gmcd gmcd0 = jqy.a(new blta(bltb0));
        Context context0 = bltb0.a;
        KeyguardManager keyguardManager0 = (KeyguardManager)context0.getSystemService("keyguard");
        if(keyguardManager0 != null && keyguardManager0.isKeyguardLocked()) {
            bltb0.c.compareAndSet(0, 1);
            bltb0.b(blhc.ao);
            if(bltb0.d == null) {
                bltb0.d = new TurnOnBluetoothController.1(bltb0);
                IntentFilter intentFilter0 = new IntentFilter();
                intentFilter0.addAction("android.intent.action.USER_PRESENT");
                jwe.b(context0, bltb0.d, intentFilter0, 2);
            }
            bltb0.b.b();
        }
        else {
            bltb0.c();
        }
        gmbu.t(glzd.g(gmbt.h(gmbu.q(gmcd0, hsvp.b(), TimeUnit.MILLISECONDS, blti0.d)), new bltf(blti0), gmap.a), new blth(blti0, bltc0), gmap.a);
        return "Execute turn on Bluetooth stage";
    }
}

