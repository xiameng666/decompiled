import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;

public final class came extends clil {
    final Context a;

    public came(Context context0) {
        this.a = context0;
        super("ipa");
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        if(huhz.n() && !huhz.l()) {
            camd.b(this.a);
        }
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        camd.c(this.a);
    }
}

