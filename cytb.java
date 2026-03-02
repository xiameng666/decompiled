import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.nearby.fastpair.service.WearableDataListenerChimeraService;
import java.util.HashMap;

public final class cytb implements akp {
    public final WearableDataListenerChimeraService a;

    public cytb(WearableDataListenerChimeraService wearableDataListenerChimeraService0) {
        this.a = wearableDataListenerChimeraService0;
    }

    @Override  // akp
    public final Object a(Object object0) {
        Bundle bundle0;
        WearableDataListenerChimeraService wearableDataListenerChimeraService0 = this.a;
        String s = (String)object0;
        Object object1 = null;
        if(hvpg.bM()) {
            gxvi gxvi0 = wearableDataListenerChimeraService0.l();
            if(gxvi0 == null) {
                bundle0 = null;
            }
            else {
                try {
                    bundle0 = gxvi0.f(s);
                }
                catch(RemoteException remoteException0) {
                    ((ggtj)cyjh.a.g().ar(0x1FDF)).B("WDLS getFastPairInformationFromDeviceStatusService: can\'t get FastPair information from Discovery: %s", remoteException0.getMessage());
                    bundle0 = null;
                }
            }
        }
        else {
            bundle0 = null;
        }
        if(bundle0 == null) {
            HashMap hashMap0 = wearableDataListenerChimeraService0.a;
            if(!hashMap0.isEmpty()) {
                cyxd cyxd0 = null;
                for(Object object2: hashMap0.values()) {
                    for(Object object3: ((cyxs)object2).h) {
                        cyxd cyxd1 = (cyxd)object3;
                        if(cyxd1.c.equals(s)) {
                            cyxd0 = cyxd1;
                            break;
                        }
                    }
                    if(cyxd0 != null) {
                        break;
                    }
                }
                if(cyxd0 == null) {
                    ((ggtj)cyjh.a.g().ar(0x1FE0)).x("WDLS getFastPairInformationFromNearbyNode: can\'t get FastPair information");
                    return null;
                }
                object1 = new Bundle();
                if((cyxd0.b & 8) != 0) {
                    ((Bundle)object1).putString("com.google.android.gms.nearby.fastpair.service.EXTRA_FAST_PAIR_DEVICE_MODEL_ID", cyxd0.h);
                }
                if((cyxd0.b & 0x80) != 0) {
                    ((Bundle)object1).putInt("com.google.android.gms.nearby.fastpair.service.EXTRA_FAST_PAIR_DEVICE_TYPE", (higy.b(cyxd0.k) == null ? higy.a : higy.b(cyxd0.k)).u);
                    return object1;
                }
            }
            return object1;
        }
        return bundle0;
    }
}

