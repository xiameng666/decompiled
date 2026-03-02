import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.blockstore.logging.service.BufferedLogUploadTaskService;

public final class airr implements glzn {
    public final Context a;
    public final Bundle b;
    public final aiqb c;

    public airr(Context context0, Bundle bundle0, aiqb aiqb0) {
        this.a = context0;
        this.b = bundle0;
        this.c = aiqb0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        ajap ajap0 = ajap.b;
        if(((ajap)object0) == ajap0) {
            ((ggtj)BufferedLogUploadTaskService.a.h()).x("There is already a buffer flush task scheduled, skipping this time.");
            return gmbx.a;
        }
        BufferedLogUploadTaskService.e(this.a, this.b);
        ((ggtj)BufferedLogUploadTaskService.a.h()).x("Buffer flush one-off task scheduled.");
        ((ggtj)aiqk.a.h()).B("Updating BufferFlushTaskStatus to: %s", ajap0);
        aiqg aiqg0 = new aiqg(ajap0);
        return ((aiqk)this.c).b.b(aiqg0, gmap.a);
    }
}

