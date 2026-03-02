import com.android.settingslib.bluetooth.devicesettings.DeviceSettingItem;
import java.util.ArrayList;
import java.util.List;

public final class shq {
    public String a;
    private final List b;

    public shq() {
        this.b = new ArrayList();
    }

    public final List a(Integer integer0) {
        List list0 = new ArrayList(ibpo.q(this.b, 10));
        for(Object object0: this.b) {
            ibuq.f(((DeviceSettingItem)object0).g, "extras");
            list0.add(new DeviceSettingItem(((DeviceSettingItem)object0).a, ((DeviceSettingItem)object0).b, ((DeviceSettingItem)object0).c, ((DeviceSettingItem)object0).d, ((DeviceSettingItem)object0).e, ((DeviceSettingItem)object0).f, integer0, ((DeviceSettingItem)object0).g));
        }
        return list0;
    }

    public final void b(DeviceSettingItem deviceSettingItem0) {
        ibuq.f(deviceSettingItem0, "<this>");
        this.b.add(deviceSettingItem0);
    }
}

