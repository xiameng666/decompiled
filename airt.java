import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.blockstore.logging.service.BufferedLogUploadTaskService;

public final class airt implements glzn {
    public final Context a;
    public final Bundle b;

    public airt(Context context0, Bundle bundle0) {
        this.a = context0;
        this.b = bundle0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(((ajap)object0) == ajap.b) {
            ((ggtj)BufferedLogUploadTaskService.a.h()).x("There is already a buffer flush task scheduled, rescheduling the task.");
            BufferedLogUploadTaskService.e(this.a, this.b);
        }
        return gmbx.a;
    }
}

