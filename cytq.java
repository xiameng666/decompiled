import android.os.Bundle;
import com.google.android.gms.nearby.fastpair.service.WearableDataListenerChimeraService;
import com.google.android.gms.wearable.internal.MessageEventParcelable;

public final class cytq implements Runnable {
    public final WearableDataListenerChimeraService a;
    public final MessageEventParcelable b;

    public cytq(WearableDataListenerChimeraService wearableDataListenerChimeraService0, MessageEventParcelable messageEventParcelable0) {
        this.a = wearableDataListenerChimeraService0;
        this.b = messageEventParcelable0;
    }

    @Override
    public final void run() {
        WearableDataListenerChimeraService wearableDataListenerChimeraService0 = this.a;
        if(cyfo.e(wearableDataListenerChimeraService0.l)) {
            ((ggtj)cyjh.a.d().ar(0x1FFC)).x("WDLS phone receive wear message to know watch is active hfp seeker");
            Bundle bundle0 = new Bundle();
            bundle0.putByteArray("com.google.android.gms.nearby.discovery.fastpair.connectionswitch.RESUME_MEDIA_STATE", this.b.c);
            cysr.b(wearableDataListenerChimeraService0, "com.google.android.gms.nearby.discovery.fastpair.connectionswitch.ACTION_RECEIVE_WATCH_AS_HFP_SEEKER", bundle0);
        }
    }
}

