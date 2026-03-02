import android.content.Context;
import android.content.Intent;
import android.os.Message;
import j..util.Objects;

public final class ekrf implements Runnable {
    public final Context a;
    public final Intent b;

    public ekrf(Context context0, Intent intent0) {
        this.a = context0;
        this.b = intent0;
    }

    @Override
    public final void run() {
        if(azqk.e(this.a) && Objects.equals(this.b.getStringExtra("debug_sub_action"), "INVOKE_ALL")) {
            ekqw ekqw0 = ekrs.b().d;
            if(ekqw0 != null) {
                ekqw0.d.q.removeMessages(2);
                Message.obtain(ekqw0.d.q, 2, btar.n.q, 0).sendToTarget();
            }
        }
    }
}

