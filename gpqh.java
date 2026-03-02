import android.os.Handler;
import android.os.HandlerThread;
import android.util.Pair;
import j..util.Objects;
import java.util.ArrayList;

final class gpqh extends HandlerThread {
    final gpqi a;

    public gpqh(gpqi gpqi0, String s) {
        Objects.requireNonNull(gpqi0);
        this.a = gpqi0;
        super(s);
    }

    @Override  // android.os.HandlerThread
    protected final void onLooperPrepared() {
        gpqi gpqi0 = this.a;
        ArrayList arrayList0 = gpqi0.c;
        synchronized(arrayList0) {
            gpqi0.b = new Handler(this.getLooper());
            for(Object object0: arrayList0) {
                gpqi0.c(((Runnable)((Pair)object0).first), ((Long)((Pair)object0).second).longValue());
            }
            arrayList0.clear();
        }
    }
}

