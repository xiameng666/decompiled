import com.google.android.gms.nearby.fastpair.service.WearableDataListenerChimeraService;

public final class cytl implements Runnable {
    public final WearableDataListenerChimeraService a;

    public cytl(WearableDataListenerChimeraService wearableDataListenerChimeraService0) {
        this.a = wearableDataListenerChimeraService0;
    }

    @Override
    public final void run() {
        ++this.a.k;
        this.a.w(true);
    }
}

