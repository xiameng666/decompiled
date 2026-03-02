import com.google.android.gms.nearby.fastpair.service.WearableDataListenerChimeraService;
import com.google.android.gms.wearable.internal.MessageEventParcelable;

public final class cyto implements Runnable {
    public final WearableDataListenerChimeraService a;
    public final MessageEventParcelable b;

    public cyto(WearableDataListenerChimeraService wearableDataListenerChimeraService0, MessageEventParcelable messageEventParcelable0) {
        this.a = wearableDataListenerChimeraService0;
        this.b = messageEventParcelable0;
    }

    @Override
    public final void run() {
        WearableDataListenerChimeraService wearableDataListenerChimeraService0 = this.a;
        cywy cywy0 = wearableDataListenerChimeraService0.g();
        cyfr cyfr0 = cywy0.a;
        if(cyfo.e(cyfr0)) {
            cyxm cyxm0 = cywy.a(this.b.c);
            if((cyxm0.b & 8) == 0) {
                ((ggtj)cyjh.a.g().ar(0x205A)).x("AnalyticsHelper_logPeripheralSwitchBack: no headset address");
            }
            else {
                cywy0.b(cyxm0.f, 0);
            }
        }
        else {
            ((ggtj)cyjh.a.f().ar(0x205B)).B("AnalyticsHelper_logPeripheralSwitchBack: skip %s", cyfr0.name());
        }
        wearableDataListenerChimeraService0.w(true);
    }
}

