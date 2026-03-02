import com.google.android.gms.nearby.fastpair.service.WearableDataListenerChimeraService;
import com.google.android.gms.wearable.internal.MessageEventParcelable;

public final class cytj implements Runnable {
    public final WearableDataListenerChimeraService a;
    public final MessageEventParcelable b;

    public cytj(WearableDataListenerChimeraService wearableDataListenerChimeraService0, MessageEventParcelable messageEventParcelable0) {
        this.a = wearableDataListenerChimeraService0;
        this.b = messageEventParcelable0;
    }

    @Override
    public final void run() {
        WearableDataListenerChimeraService wearableDataListenerChimeraService0 = this.a;
        if(cyfo.e(wearableDataListenerChimeraService0.l)) {
            cyxm cyxm0 = cywy.a(this.b.c);
            if((cyxm0.b & 1) != 0 && (cyxm0.b & 4) != 0 && (cyxm0.b & 8) != 0) {
                cygy cygy0 = cygy.b(cyxm0.c) == null ? cygy.a : cygy.b(cyxm0.c);
                if(cygy.c.equals(cygy0)) {
                    String s = wearableDataListenerChimeraService0.o();
                    if(s == null) {
                        ((ggtj)cyjh.a.g().ar(0x2021)).x("WDLS onTriangleAnalyticsSwitchLatencyReceived: skip logging for phone and watch tether because unknown local device address");
                    }
                    else {
                        cxzx.c(wearableDataListenerChimeraService0, s, cyxm0.d).g(cyxm0.g);
                    }
                }
                else {
                    cygy cygy1 = cygy.b(cyxm0.c) == null ? cygy.a : cygy.b(cyxm0.c);
                    if(cygy.b.equals(cygy1)) {
                        cxzx.a(wearableDataListenerChimeraService0, cyxm0.d, cyxm0.f).g(cyxm0.g);
                    }
                }
            }
            else {
                ((ggtj)cyjh.a.g().ar(0x2020)).x("WDLS onTriangleAnalyticsSwitchLatencyReceived: invalid triangle analytics data");
            }
        }
        else {
            ((ggtj)cyjh.a.f().ar(0x2022)).B("WDLS onTriangleAnalyticsSwitchLatencyReceived: skip logging on %s", wearableDataListenerChimeraService0.l.name());
        }
        ++wearableDataListenerChimeraService0.k;
        wearableDataListenerChimeraService0.w(true);
    }
}

