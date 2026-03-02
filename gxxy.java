import android.content.Context;
import android.content.Intent;

public final class gxxy implements jqv {
    public final gxya a;
    public final Context b;
    public final Intent c;

    public gxxy(gxya gxya0, Context context0, Intent intent0) {
        this.a = gxya0;
        this.b = context0;
        this.c = intent0;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        this.a.a = jqt0;
        return this.b.bindService(this.c, this.a, 1) ? "ServiceBinder_success" : "ServiceBinder_fail";
    }
}

