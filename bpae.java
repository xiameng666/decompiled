import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;

public final class bpae implements Callable {
    public final bpag a;
    public final long b;

    public bpae(bpag bpag0, long v) {
        this.a = bpag0;
        this.b = v;
    }

    @Override
    public final Object call() {
        Context context0 = this.a.a;
        Intent intent0 = boxr.d(context0);
        if(intent0 != null) {
            intent0.putExtra("scheduled_by", (this.b <= 0L ? "BATCH_UPLOAD_TRIGGERED_BY_FAST_EXECUTOR_SERVICE_ACTIVE_NETWORK" : "BATCH_UPLOAD_TRIGGERED_BY_FAST_EXECUTOR_SERVICE"));
            context0.getApplicationContext().startService(intent0);
        }
        return null;
    }
}

