import android.os.RemoteException;
import j..util.Objects;

public final class arus implements Runnable {
    final arut a;
    private final String b;

    public arus(arut arut0, String s) {
        Objects.requireNonNull(arut0);
        this.a = arut0;
        super();
        this.b = s;
    }

    @Override
    public final void run() {
        aqql aqql0 = arut.a;
        String s = this.b;
        aqql0.f("Sending cancellation request for package: %s to service", new Object[]{s});
        arvo arvo0 = this.a.e;
        if(arvo0 != null) {
            try {
                arvo0.a(s);
            }
            catch(RemoteException unused_ex) {
                arut.a.f("Remote exception while calling #cancelDownloadForPackage on manager service", new Object[0]);
            }
            return;
        }
        aqql0.f("Connection to service already dead", new Object[0]);
    }
}

