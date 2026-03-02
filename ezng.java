import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.FacsCacheCallOptions;
import com.google.android.gms.facs.cache.FacsInternalSyncCallOptions;
import com.google.android.gms.facs.cache.ForceSettingsCacheRefreshResult;

public final class ezng extends ezna {
    private static final ggtl h;
    private long i;

    static {
        ezng.h = ezqu.c();
    }

    public ezng(bkcm bkcm0, baqr baqr0, FacsCacheCallOptions facsCacheCallOptions0, ezqo ezqo0, fpfg fpfg0, bkcb bkcb0) {
        super("ForceSettingsCacheRefreshOperation", bkcm0, baqr0, facsCacheCallOptions0, ezqo0, fpfg0, hffs.g, bkcb0);
    }

    @Override  // cjtm
    public final void f(Context context0) {
        ezng.h.h().ar(0x442F).B("Executing operation \'%s\'...", this.q());
        this.i = SystemClock.elapsedRealtime();
        this.d();
        this.e(hzdj.a.l().y());
        this.e.b();
        ezng.h.h().ar(0x4430).B("Forwarding operation \'%s\' to internal FACS API...", this.q());
        FacsInternalSyncCallOptions facsInternalSyncCallOptions0 = new FacsInternalSyncCallOptions(true);
        byte[] arr_b = (byte[])ezng.h(this.g.e(facsInternalSyncCallOptions0));
        long v = SystemClock.elapsedRealtime();
        this.g(Status.b.i, v - this.i);
        ForceSettingsCacheRefreshResult forceSettingsCacheRefreshResult0 = new ForceSettingsCacheRefreshResult(arr_b);
        this.a.b(Status.b, forceSettingsCacheRefreshResult0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        long v = SystemClock.elapsedRealtime();
        this.g(status0.i, v - this.i);
        this.a.b(status0, null);
    }
}

