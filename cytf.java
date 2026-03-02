import com.google.android.gms.nearby.fastpair.service.WearableDataListenerChimeraService;
import com.google.android.gms.wearable.internal.MessageEventParcelable;

public final class cytf implements Runnable {
    public final WearableDataListenerChimeraService a;
    public final MessageEventParcelable b;

    public cytf(WearableDataListenerChimeraService wearableDataListenerChimeraService0, MessageEventParcelable messageEventParcelable0) {
        this.a = wearableDataListenerChimeraService0;
        this.b = messageEventParcelable0;
    }

    @Override
    public final void run() {
        WearableDataListenerChimeraService wearableDataListenerChimeraService0 = this.a;
        if(cyfo.e(wearableDataListenerChimeraService0.l)) {
            cyxm cyxm0 = cywy.a(this.b.c);
            if((cyxm0.b & 1) != 0 && (cyxm0.b & 4) != 0 && (cyxm0.b & 8) != 0) {
                cyxs cyxs0 = wearableDataListenerChimeraService0.i(cyxm0.e);
                if(((ProtoLiteMessage)cyxs0).equals(cyxs.b)) {
                    ((ggtj)cyjh.a.g().ar(0x201E)).B("WDLS onTriangleAnalyticsMonitorStartReceived: can\'t get triangle node %s", cyxm0.e);
                }
                else {
                    wearableDataListenerChimeraService0.t((cygy.b(cyxm0.c) == null ? cygy.a : cygy.b(cyxm0.c)), cyxs0, cyxm0.f);
                }
            }
            else {
                ((ggtj)cyjh.a.g().ar(0x201D)).x("WDLS onTriangleAnalyticsMonitorStartReceived: invalid triangle analytics data");
            }
        }
        else {
            ((ggtj)cyjh.a.f().ar(0x201F)).B("WDLS onTriangleAnalyticsMonitorStartReceived: skip logging on %s", wearableDataListenerChimeraService0.l.name());
        }
        ++wearableDataListenerChimeraService0.k;
        wearableDataListenerChimeraService0.w(true);
    }
}

