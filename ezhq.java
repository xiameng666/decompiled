import android.bluetooth.BluetoothDevice;
import android.view.ContextThemeWrapper;
import com.google.android.gms.trustagent.trustlet.device.bluetooth.model.TrustableDevice;
import com.google.android.gms.trustagent.trustlet.device.ui.GoogleTrustAgentTrustedDevicesChimeraSettings;
import com.google.android.gms.trustagent.trustlet.device.ui.TrustedDevicesCollapsingToolbarChimeraSettings;
import j..util.Collection.-EL;

public final class ezhq {
    private final xob a;

    public ezhq(xob xob0) {
        this.a = xob0;
    }

    final void a(TrustableDevice trustableDevice0) {
        int v;
        ezbn ezbn0 = this.b().P();
        if(ezbn0 == null) {
            return;
        }
        if(ezbn0.m(ezka.c(trustableDevice0.b()))) {
            v = 5;
        }
        else if(Collection.-EL.stream(trustableDevice0.a).allMatch(new ezgu())) {
            goto label_14;
        }
        else {
            String s = ezka.g(trustableDevice0.d());
            Object object0 = ezbn0.b;
            if(ezbn0.d.containsKey(s)) {
                v = 0;
                goto label_19;
            label_14:
                v = 0;
            }
            else {
                v = 2;
            }
        }
    label_19:
        if(v != 0) {
            BluetoothDevice bluetoothDevice0 = trustableDevice0.b();
            xob xob0 = this.a;
            String s1 = ezka.b(bluetoothDevice0);
            String s2 = v == 5 ? xob0.getString(0x7F150986, new Object[]{s1}) : xob0.getString(0x7F150987, new Object[]{s1});  // string:content_error_bt_already_added "Device %s is already added as a trusted device."
            if(bbqa.a()) {
                new fyju(fyhn.a(new ContextThemeWrapper(xob0, 0x7F160C70)), 0x7F160DD5);  // style:Theme.GoogleMaterial3.DayNight.NoActionBar
                return;
            }
            iv iv0 = new iv(xob0);
            iv0.setTitle("Can\'t add device");
            iv0.n(s2);
            iv0.c(false);
            iv0.r("OK", new ezhp());
            iv0.create().show();
            return;
        }
        this.b().L(trustableDevice0);
    }

    private final ezjf b() {
        ezjf ezjf0;
        xob xob0 = this.a;
        if((xob0 instanceof TrustedDevicesCollapsingToolbarChimeraSettings)) {
            ezjf0 = ((TrustedDevicesCollapsingToolbarChimeraSettings)xob0).l();
            gftb.check(ezjf0);
            return ezjf0;
        }
        if(!(xob0 instanceof GoogleTrustAgentTrustedDevicesChimeraSettings)) {
            throw new IllegalStateException("AddDeviceManager not in valid host");
        }
        du du0 = ((GoogleTrustAgentTrustedDevicesChimeraSettings)xob0).getSupportFragmentManager().h("TrustedDevicesFragment");
        gftb.check(du0);
        ezjf0 = (ezjf)du0;
        gftb.check(ezjf0);
        return ezjf0;
    }
}

