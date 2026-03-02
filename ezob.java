import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.FacsCacheCallOptions;
import com.google.android.gms.facs.cache.FacsInternalSyncCallOptions;
import com.google.android.gms.facs.cache.UpdateActivityControlsSettingsResult;

public final class ezob extends ezna {
    private static final ggtl h;
    private final hfgu i;
    private long j;

    static {
        ezob.h = ezqu.c();
    }

    public ezob(bkcm bkcm0, baqr baqr0, hfgu hfgu0, FacsCacheCallOptions facsCacheCallOptions0, ezqo ezqo0, fpfg fpfg0, bkcb bkcb0) {
        super("UpdateActivityControlsSettingsOperation", bkcm0, baqr0, facsCacheCallOptions0, ezqo0, fpfg0, hffs.h, bkcb0);
        this.i = hfgu0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        ezob.h.h().ar(0x4447).B("Executing operation \'%s\'...", this.q());
        this.j = SystemClock.elapsedRealtime();
        this.d();
        this.e(hzdj.a.l().A());
        this.e.b();
        ezob.h.h().ar(17480).B("Forwarding operation \'%s\' to internal FACS API...", this.q());
        FacsInternalSyncCallOptions facsInternalSyncCallOptions0 = new FacsInternalSyncCallOptions(false);
        azzc azzc0 = new azzc();
        bkcb bkcb0 = this.g;
        azzc0.a = new bkbx(bkcb0, this.i, facsInternalSyncCallOptions0);
        azzc0.d = 0x70E;
        byte[] arr_b = (byte[])ezob.h(bkcb0.iG(azzc0.a()));
        long v = SystemClock.elapsedRealtime();
        this.g(Status.b.i, v - this.j);
        UpdateActivityControlsSettingsResult updateActivityControlsSettingsResult0 = new UpdateActivityControlsSettingsResult(arr_b);
        this.a.a(Status.b, updateActivityControlsSettingsResult0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        long v = SystemClock.elapsedRealtime();
        this.g(status0.i, v - this.j);
        this.a.a(status0, null);
    }
}

