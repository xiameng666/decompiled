import com.google.android.gms.nearby.fastpair.service.WearableDataListenerChimeraService;

public final class cytn implements Runnable {
    public final WearableDataListenerChimeraService a;

    public cytn(WearableDataListenerChimeraService wearableDataListenerChimeraService0) {
        this.a = wearableDataListenerChimeraService0;
    }

    @Override
    public final void run() {
        cysr.b(this.a, "com.google.android.gms.nearby.discovery.fastpair.connectionswitch.ACTION_RECEIVE_TRIANGLE_SWITCH_CONNECTION_END", null);
        ++this.a.k;
        this.a.w(true);
    }
}

