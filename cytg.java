import com.google.android.gms.nearby.fastpair.service.WearableDataListenerChimeraService;

public final class cytg implements Runnable {
    public final WearableDataListenerChimeraService a;

    public cytg(WearableDataListenerChimeraService wearableDataListenerChimeraService0) {
        this.a = wearableDataListenerChimeraService0;
    }

    @Override
    public final void run() {
        WearableDataListenerChimeraService wearableDataListenerChimeraService0 = this.a;
        if(hvpp.aF()) {
            cyvl cyvl0 = wearableDataListenerChimeraService0.e(wearableDataListenerChimeraService0);
            if(hvpp.aF()) {
                cjpa cjpa0 = cyvl0.j.c();
                cjpa0.g("MESSAGE_MONITOR_CURRENT_HOUR", cyvl0.c);
                cjpa0.f("MESSAGE_MONITOR_SENT_COUNT", cyvl0.d);
                cjpa0.g("MESSAGE_MONITOR_SENT_BITS", cyvl.b(cyvl0.e));
                cjpa0.f("MESSAGE_MONITOR_RECEIVED_COUNT", cyvl0.f);
                cjpa0.g("MESSAGE_MONITOR_RECEIVED_BITS", cyvl.b(cyvl0.g));
                cjpa0.f("MESSAGE_MONITOR_EVENT_TRIGGER_COUNT", cyvl0.h);
                cjpa0.g("MESSAGE_MONITOR_EVENT_TRIGGER_BITS", cyvl.b(cyvl0.i));
                if(!cygf.b(cjpa0)) {
                    ((ggtj)cyjh.a.g().ar(0x1FD9)).x("WDLS destroy: failed to store the triangle message states.");
                }
            }
            else {
                ((ggtj)cyjh.a.g().ar(0x1FD9)).x("WDLS destroy: failed to store the triangle message states.");
            }
        }
        gxxu gxxu0 = wearableDataListenerChimeraService0.d;
        if(gxxu0 != null) {
            gxxu0.l();
        }
        wearableDataListenerChimeraService0.n().c(wearableDataListenerChimeraService0);
        WearableDataListenerChimeraService.q(wearableDataListenerChimeraService0.b);
    }
}

