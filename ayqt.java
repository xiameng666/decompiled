import android.content.Context;
import android.content.Intent;
import com.google.android.gms.chromesync.sync.SyncIntentOperation;

public final class ayqt {
    public static final Intent a(Context context0, Intent intent0) {
        Intent intent1 = aypn.getStartIntent(context0, SyncIntentOperation.class, "com.google.android.gms.chromesync.DATA_INVALIDATION_RECEIVED");
        if(intent1 == null) {
            throw new ayey(ayex.f);
        }
        ibuq.c(intent0);
        intent1.putExtras(intent0);
        return intent1;
    }
}

