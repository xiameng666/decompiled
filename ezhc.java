import android.bluetooth.BluetoothDevice;
import androidx.preference.Preference;
import com.google.android.gms.trustagent.trustlet.device.bluetooth.model.TrustableDevice;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ezhc implements Function {
    public final ezhe a;

    public ezhc(ezhe ezhe0) {
        this.a = ezhe0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        Object object1 = new Preference(this.a.requireContext());
        object1.C = 0x7F0E07F9;  // layout:preference_material
        ((Preference)object1).L(((TrustableDevice)object0).d());
        object1.w = false;
        ((Preference)object1).O(true);
        ((Preference)object1).r().putParcelable("trustable_device", ((TrustableDevice)object0));
        ((Preference)object1).S(((TrustableDevice)object0).e());
        ((Preference)object1).K(false);
        BluetoothDevice bluetoothDevice0 = ((TrustableDevice)object0).b();
        if(ezcn.a().e.contains(Integer.valueOf(bluetoothDevice0.getBluetoothClass().getMajorDeviceClass()))) {
            ((Preference)object1).H(false);
            ((Preference)object1).P(0x7F150322);  // string:auth_trust_agent_dpm_disabled "Disabled by administrator"
        }
        return object1;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

