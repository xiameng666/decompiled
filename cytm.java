import com.google.android.gms.nearby.fastpair.service.WearableDataListenerChimeraService;
import com.google.android.gms.wearable.internal.MessageEventParcelable;

public final class cytm implements Runnable {
    public final WearableDataListenerChimeraService a;
    public final MessageEventParcelable b;

    public cytm(WearableDataListenerChimeraService wearableDataListenerChimeraService0, MessageEventParcelable messageEventParcelable0) {
        this.a = wearableDataListenerChimeraService0;
        this.b = messageEventParcelable0;
    }

    @Override
    public final void run() {
        this.a.A(this.b);
        ++this.a.k;
        this.a.w(true);
    }
}

