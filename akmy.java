import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.google.android.gms.auth.managed.ui.ManagingAppDownloadBroadcastReceiver;
import com.google.android.gms.chimera.modules.auth.managed.AppContextProvider;

public final class akmy extends lvb {
    public final long a;
    public boolean b;
    public long c;
    private final ManagingAppDownloadBroadcastReceiver d;
    private Handler e;
    private Handler f;
    private final HandlerThread g;
    private final akmt h;
    private Integer i;
    private boolean j;

    public akmy(Context context0, long v) {
        HandlerThread handlerThread0 = new HandlerThread("CheckDownloadProgressThread");
        super(context0);
        this.i = null;
        this.a = v;
        this.g = handlerThread0;
        this.d = new ManagingAppDownloadBroadcastReceiver(AppContextProvider.b(), this);
        this.h = new akmt(AppContextProvider.b(), this, v);
    }

    final void a(Integer integer0) {
        this.i = integer0;
        if(this.isStarted()) {
            this.e.post(new akmx(this, integer0));
        }
    }

    public final void b() {
        long v = SystemClock.elapsedRealtime();
        long v1 = this.c;
        if(v1 == 0L) {
            this.c = v;
            v1 = v;
        }
        if(v - v1 < 30000L) {
            this.a(Integer.valueOf(-1));
            this.c();
            return;
        }
        this.a(Integer.valueOf(-2));
    }

    final void c() {
        if(this.isReset()) {
            return;
        }
        if(this.f == null) {
            this.g.start();
            this.f = new clht(this.g.getLooper());
        }
        this.f.postDelayed(this.h, 0xFAL);
    }

    @Override  // lvb
    protected final void onReset() {
        if(this.j) {
            this.j = false;
            this.g.quit();
            if(!hpwb.c()) {
                this.d.c();
            }
            this.f = null;
            this.e = null;
            this.c = 0L;
            this.b = false;
            this.i = null;
        }
    }

    @Override  // lvb
    public final void onStartLoading() {
        Integer integer0 = this.i;
        if(integer0 != null) {
            this.deliverResult(integer0);
        }
        if(!this.j) {
            this.j = true;
            this.e = new clht();
            this.b = false;
            if(!hpwb.c()) {
                this.d.b();
            }
            this.c();
            this.c = 0L;
        }
    }
}

