import android.os.Looper;
import android.os.Message;
import android.util.Log;
import j..util.Objects;

final class fcyy extends clht {
    final fczm a;
    private boolean c;
    private final fcyx d;

    public fcyy(fczm fczm0, Looper looper0) {
        Objects.requireNonNull(fczm0);
        this.a = fczm0;
        super(looper0);
        this.d = new fcyx(fczm0);
    }

    public final void b(String s) {
        synchronized(this) {
            if(!this.c) {
                return;
            }
            if(Log.isLoggable("WearableLS", 2)) {
                Log.v("WearableLS", "unbindService: " + s + ", " + this.a.n);
            }
            try {
                this.a.unbindService(this.d);
            }
            catch(RuntimeException runtimeException0) {
                Log.e("WearableLS", "Exception when unbinding from local service", runtimeException0);
            }
            this.c = false;
        }
    }

    private final void c() {
        synchronized(this) {
            if(this.c) {
                return;
            }
            if(Log.isLoggable("WearableLS", 2)) {
                Log.v("WearableLS", "bindService: " + this.a.n);
            }
            this.a.bindService(this.a.p, this.d, 1);
            this.c = true;
        }
    }

    @Override  // clht
    protected final void mC(Message message0) {
        this.c();
        try {
            super.mC(message0);
        }
        finally {
            if(!this.hasMessages(0)) {
                this.b("dispatch");
            }
        }
    }
}

