import com.android.settingslib.bluetooth.devicesettings.DeviceSettingGroup;
import com.android.settingslib.bluetooth.devicesettings.DeviceSettingsConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class shh {
    public static final DeviceSettingsConfig a(ibts ibts0) {
        sgs sgs0 = new sgs();
        ibts0.a(sgs0);
        List list0 = sgs0.a.a;
        List list1 = sgs0.b.a;
        List list2 = ibpo.ak(list0, list1);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list2) {
            String s = ((shq)object0).a;
            if(s != null) {
                arrayList0.add(s);
            }
        }
        HashSet hashSet0 = new HashSet();
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: arrayList0) {
            if(hashSet0.add(((String)object1))) {
                arrayList1.add(object1);
            }
        }
        ArrayList arrayList2 = new ArrayList(ibpo.q(arrayList1, 10));
        int v = 0;
        for(Object object2: arrayList1) {
            if(v < 0) {
                ibpo.m();
            }
            arrayList2.add(new ibns(((String)object2), v));
            ++v;
        }
        Map map0 = ibpz.p(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for(Object object3: list0) {
            ibpo.D(arrayList3, ((shq)object3).a(((Integer)map0.get(((shq)object3).a))));
        }
        ArrayList arrayList4 = new ArrayList();
        for(Object object4: list1) {
            ibpo.D(arrayList4, ((shq)object4).a(((Integer)map0.get(((shq)object4).a))));
        }
        ArrayList arrayList5 = new ArrayList(ibpo.q(arrayList1, 10));
        for(Object object5: arrayList1) {
            arrayList5.add(new DeviceSettingGroup(((String)object5), 2));
        }
        return new DeviceSettingsConfig(arrayList3, arrayList4, null, arrayList5, 40);
    }
}

