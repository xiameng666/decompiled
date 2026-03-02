import android.content.Intent;
import android.net.Uri.Builder;
import android.util.Log;
import com.google.android.gms.wearable.internal.ConnectionStateEventParcelable;
import j..util.Objects;

final class ffge implements fcei {
    final ffgm a;

    public ffge(ffgm ffgm0) {
        Objects.requireNonNull(ffgm0);
        this.a = ffgm0;
        super();
    }

    @Override  // fcei
    public final void a(ConnectionStateEventParcelable connectionStateEventParcelable0) {
        if(Log.isLoggable("WearableService", 4)) {
            Log.i("WearableService", "onConnectionSetupStateChanged: " + connectionStateEventParcelable0);
        }
        ffgd ffgd0 = new ffgd(this, new Intent("com.google.android.gms.wearable.CONNECTION_STATE_CHANGED", new Uri.Builder().scheme("wear").authority(connectionStateEventParcelable0.b).path("connection-state").build()), new ConnectionStateEventParcelable(connectionStateEventParcelable0.a, connectionStateEventParcelable0.b), connectionStateEventParcelable0);
        ffgm ffgm0 = this.a;
        for(Object object0: ffgm0.p(1)) {
            ffgm0.k(((fdpl)object0), ffgd0, true);
        }
    }
}

