import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class arut {
    public static final aqql a;
    public final azox b;
    public final gmcg c;
    public final Context d;
    public arvo e;
    private static final long f;

    static {
        arut.a = new aqql(new String[]{"CustomDownloadManagerClient"});
        arut.f = TimeUnit.SECONDS.toMillis(3L);
    }

    public arut(Context context0, gmcg gmcg0) {
        this.b = new azox();
        this.d = context0;
        this.c = gmcg0;
    }

    public static arvo a(azox azox0) {
        try {
            IBinder iBinder0 = azox0.b(arut.f, TimeUnit.MILLISECONDS);
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.backup.extension.internal.ICustomBackupDownloadManagerService");
            return (iInterface0 instanceof arvo) ? ((arvo)iInterface0) : new arvm(iBinder0);
        }
        catch(InterruptedException interruptedException0) {
            Thread.currentThread().interrupt();
            arut.a.g("Interrupted while binding to the manager service", interruptedException0, new Object[0]);
            return null;
        }
        catch(TimeoutException timeoutException0) {
            arut.a.g("Timed out while binding to the manager service", timeoutException0, new Object[0]);
            return null;
        }
    }

    public final void b() {
        arut.a.d("Scheduling disconnection from manager service", new Object[0]);
        aruq aruq0 = new aruq(this);
        this.c.d(aruq0);
    }
}

