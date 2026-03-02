import com.google.android.gms.nearby.fastpair.service.WearableDataListenerChimeraService;
import com.google.android.gms.wearable.internal.MessageEventParcelable;

public final class cytk implements Runnable {
    public final WearableDataListenerChimeraService a;
    public final MessageEventParcelable b;

    public cytk(WearableDataListenerChimeraService wearableDataListenerChimeraService0, MessageEventParcelable messageEventParcelable0) {
        this.a = wearableDataListenerChimeraService0;
        this.b = messageEventParcelable0;
    }

    @Override
    public final void run() {
        WearableDataListenerChimeraService wearableDataListenerChimeraService0 = this.a;
        if(cyfo.e(wearableDataListenerChimeraService0.l)) {
            cyxm cyxm0 = cywy.a(this.b.c);
            if((cyxm0.b & 0x20) == 0) {
                ((ggtj)cyjh.a.g().ar(0x2023)).x("WDLS onTriangleAnalyticsSwitchNotTriggerReceived: not found switch connection response");
            }
            else {
                cyxl cyxl0 = cyxl.a;
                if(((ProtoLiteMessage)(cyxm0.h == null ? cyxl.a : cyxm0.h)).equals(cyxl0)) {
                    ((ggtj)cyjh.a.g().ar(0x2023)).x("WDLS onTriangleAnalyticsSwitchNotTriggerReceived: not found switch connection response");
                }
                else {
                    cyxl cyxl1 = cyxm0.h;
                    if(cyxl1 != null) {
                        cyxl0 = cyxl1;
                    }
                    wearableDataListenerChimeraService0.u(cyxl0);
                }
            }
        }
        else {
            ((ggtj)cyjh.a.f().ar(0x2024)).B("WDLS onTriangleAnalyticsSwitchNotTriggerReceived: skip logging on %s", wearableDataListenerChimeraService0.l.name());
        }
        ++wearableDataListenerChimeraService0.k;
        wearableDataListenerChimeraService0.w(true);
    }
}

