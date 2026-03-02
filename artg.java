import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.backup.extension.download.CustomBackupDataDownloadRequest;
import com.google.android.gms.backup.extension.download.HostInfo;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class artg {
    public static final aqql a;
    public final Context b;
    public final String c;
    public final arue d;
    public final azox e;
    public final Object f;
    public volatile boolean g;
    public volatile float h;
    public volatile int i;
    public arud j;
    public arua k;
    private static final long l;
    private static final long m;
    private final ScheduledExecutorService n;
    private final CountDownLatch o;

    static {
        artg.a = new aqql(new String[]{"CustomBackupDownloadClient"});
        artg.l = TimeUnit.SECONDS.toMillis(5L);
        artg.m = TimeUnit.MINUTES.toMillis(5L);
    }

    public artg(String s, Context context0, arue arue0, ScheduledExecutorService scheduledExecutorService0, CountDownLatch countDownLatch0) {
        this.e = new azox();
        this.f = new Object();
        this.h = -1.0f;
        this.i = -1;
        this.c = s;
        this.b = context0;
        this.d = arue0;
        this.n = scheduledExecutorService0;
        this.o = countDownLatch0;
    }

    public static arud a(azox azox0, String s) {
        try {
            IBinder iBinder0 = azox0.b(artg.l, TimeUnit.MILLISECONDS);
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.backup.extension.download.ICustomBackupDataDownloaderService");
            return (iInterface0 instanceof arud) ? ((arud)iInterface0) : new arub(iBinder0);
        }
        catch(InterruptedException interruptedException0) {
            Thread.currentThread().interrupt();
            artg.a.f("Interrupted while binding to the service of package: %s", new Object[]{s, interruptedException0});
            return null;
        }
        catch(TimeoutException timeoutException0) {
            artg.a.f("Timed out while binding to the service of package: %s", new Object[]{s, timeoutException0});
            return null;
        }
    }

    public final void b(gfsx gfsx0) {
        synchronized(this.f) {
            String s = this.c;
            artg.a.d("Disconnecting from the service of package: %s", new Object[]{s});
            this.k = null;
            this.j = null;
            if(gfsx0.i()) {
                ((artd)gfsx0.d()).a(s, false);
                this.d.b(s, false, this.i, this.h);
            }
            this.n.shutdownNow();
            bbic.a().b(this.b, this.e);
            this.o.countDown();
        }
    }

    public final void c(artd artd0) {
        synchronized(this.f) {
            if(!this.f()) {
                artg.a.f("Not connected to package: %s", new Object[]{this.c});
                return;
            }
            try {
                arte arte0 = new arte(this, artd0);
                this.j.b(this.k, new HostInfo(1));
                ((bbll)this.n).g(arte0, artg.l, TimeUnit.MILLISECONDS);
            }
            catch(RemoteException | RejectedExecutionException exception0) {
                artg.a.g("Caught exception while handshake:", exception0, new Object[0]);
                this.b(gfsx.m(artd0));
            }
        }
    }

    public final void d(artd artd0, artf artf0) {
        synchronized(this.f) {
            if(!this.f()) {
                artg.a.f("Not connected to package: %s", new Object[]{this.c});
                return;
            }
            CustomBackupDataDownloadRequest customBackupDataDownloadRequest0 = new CustomBackupDataDownloadRequest(1);
            try {
                this.j.c(this.k, customBackupDataDownloadRequest0);
                ((bbll)this.n).a(artf0, artg.m, artg.m, TimeUnit.MILLISECONDS);
            }
            catch(RemoteException | RejectedExecutionException exception0) {
                artg.a.g("Caught exception during startOrResumeDownload()", exception0, new Object[0]);
                this.b(gfsx.m(artd0));
            }
        }
    }

    public final void e(float f, int v) {
        this.h = f;
        this.i = v;
    }

    public final boolean f() {
        boolean z = false;
        synchronized(this.f) {
            if(this.j != null && this.k != null) {
                z = true;
            }
        }
        return z;
    }

    @Override
    public final String toString() {
        return super.toString() + " CustomBackupDownloadClient for package=" + this.c;
    }
}

