import android.util.Log;
import com.google.android.gms.wearable.internal.FetchBackupRequest;
import com.google.android.gms.wearable.internal.GetCachedBackupsResponse;
import com.google.android.gms.wearable.internal.ParcelableBackupDevice;
import j..util.Optional;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class ffgy implements fflt {
    public final fflv a;
    public final fdiy b;
    public final FetchBackupRequest c;
    public final String d;

    public ffgy(fflv fflv0, fdiy fdiy0, FetchBackupRequest fetchBackupRequest0) {
        this.a = fflv0;
        this.b = fdiy0;
        this.c = fetchBackupRequest0;
        this.d = "getCachedBackups";
    }

    @Override  // fflt
    public final void a() {
        Optional optional0;
        fflv fflv0 = this.a;
        fdiy fdiy0 = this.b;
        FetchBackupRequest fetchBackupRequest0 = this.c;
        if(!hzyp.c()) {
            fdiy0.o(new GetCachedBackupsResponse(0xFAE, false, null));
            return;
        }
        try {
            fcmj fcmj0 = fflv0.E;
            batl.s(fcmj0);
            String s = fetchBackupRequest0.a;
            String s1 = fetchBackupRequest0.b;
            if(hzyp.c()) {
                evql evql0 = (evql)fcmj0.h.get(fcmj.a(s, s1));
                if(evql0 != null && evql0.n()) {
                    fcmj.a.d("Found successful cached backups task for node: %s, account: %s", new Object[]{s, s1});
                    optional0 = Optional.of(((List)evql0.j()));
                }
                else {
                    fcmj.a.d("No successful cached backups task found for node: %s, account: %s", new Object[]{s, s1});
                    optional0 = Optional.empty();
                }
            }
            else {
                optional0 = Optional.empty();
            }
            Optional optional1 = optional0.map(new ffhd());
            if(optional1.isEmpty()) {
                fdiy0.o(new GetCachedBackupsResponse(0, false, null));
                return;
            }
            fdiy0.o(new GetCachedBackupsResponse(0, true, ((ParcelableBackupDevice[])optional1.get())));
        }
        catch(ExecutionException executionException0) {
            Log.e("WearableService", this.d + ": exception during processing", executionException0);
            fdiy0.o(new GetCachedBackupsResponse(8, false, null));
        }
    }
}

