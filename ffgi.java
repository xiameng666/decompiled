import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.NodeMigratedEventParcelable;
import j..util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class ffgi extends ffgn {
    final fdpl a;
    final AtomicInteger b;
    final int c;
    final String d;
    final String e;
    final DataHolder f;

    public ffgi(ffgj ffgj0, Intent intent0, fdpl fdpl0, AtomicInteger atomicInteger0, int v, String s, String s1, DataHolder dataHolder0) {
        this.a = fdpl0;
        this.b = atomicInteger0;
        this.c = v;
        this.d = s;
        this.e = s1;
        this.f = dataHolder0;
        Objects.requireNonNull(ffgj0);
        super("onNodeMigrated", intent0);
    }

    @Override  // ffgn
    public final void b(fffu fffu0, fdjb fdjb0) {
        String s = fffu0 == null ? "null" : ffmr.c(fffu0.b, this.a.c);
        if(this.b.get() <= 0 && Log.isLoggable("WearableService", 5)) {
            Log.w("WearableService", String.format("[onNodeMigrated] Expected to deliver %d dataItemsArchiveReady events, but exceeded count: %s/%s", ((int)this.c), this.d, s));
            return;
        }
        try {
            if(Log.isLoggable("WearableService", 4)) {
                Log.i("WearableService", String.format("[onNodeMigrated] Delivering event to %s/%s", this.d, s));
            }
            fdjb0.j(new NodeMigratedEventParcelable(this.e, this.f));
        }
        catch(RemoteException remoteException0) {
            if(Log.isLoggable("WearableService", 5)) {
                Log.w("WearableService", String.format("[onNodeMigrated] Failed for %s/%s", this.d, s), remoteException0);
            }
            throw remoteException0;
        }
        finally {
            if(this.b.decrementAndGet() == 0) {
                this.f.close();
            }
        }
    }

    @Override  // ffgn
    public final boolean c() {
        return false;
    }
}

