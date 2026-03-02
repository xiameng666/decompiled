import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.contextmanager.ContextData;

public final class bcvk extends bcvz {
    public static final yfm a;
    public bcsw b;
    public Handler c;
    public final Object d;

    static {
        bcvk.a = new bcvi();
    }

    public bcvk(bcsw bcsw0, Looper looper0) {
        this.d = new Object();
        this.b = bcsw0;
        batl.s(looper0);
        this.c = bcvt.r(looper0);
    }

    @Override  // bcwa
    public final void a(ContextData contextData0) {
        synchronized(this.d) {
            Handler handler0 = this.c;
            if(handler0 != null && this.b != null) {
                handler0.post(new bcvj(this, contextData0));
            }
        }
    }
}

