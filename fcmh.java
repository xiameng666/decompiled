import android.content.Intent;
import android.net.Uri.Builder;
import android.util.Log;
import com.google.android.gms.wearable.internal.RestoreCompletedEventParcelable;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class fcmh implements Consumer {
    public final RestoreCompletedEventParcelable a;

    public fcmh(RestoreCompletedEventParcelable restoreCompletedEventParcelable0) {
        this.a = restoreCompletedEventParcelable0;
    }

    @Override
    public final void accept(Object object0) {
        RestoreCompletedEventParcelable restoreCompletedEventParcelable0 = this.a;
        if(Log.isLoggable("WearableService", 4)) {
            Log.i("WearableService", "onRestoreCompleted: " + restoreCompletedEventParcelable0.toString());
        }
        ffgf ffgf0 = new ffgf(((ffgg)object0), new Intent("com.google.android.gms.wearable.RESTORE_STATE_CHANGED", new Uri.Builder().scheme("wear").authority(restoreCompletedEventParcelable0.a).path("restore-state").build()), new RestoreCompletedEventParcelable(restoreCompletedEventParcelable0.a));
        ffgm ffgm0 = ((ffgg)object0).a;
        for(Object object1: ffgm0.p(1)) {
            ffgm0.k(((fdpl)object1), ffgf0, true);
        }
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

