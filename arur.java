import android.os.RemoteException;
import j..util.Objects;

public final class arur implements Runnable {
    final arut a;
    private final gged_interceptors b;

    public arur(arut arut0, gged_interceptors gged0) {
        Objects.requireNonNull(arut0);
        this.a = arut0;
        super();
        this.b = gged0;
    }

    @Override
    public final void run() {
        aqql aqql0 = arut.a;
        gged_interceptors gged0 = this.b;
        aqql0.f("Sending download request for packages: %s to service", new Object[]{gged0});
        arvo arvo0 = this.a.e;
        if(arvo0 != null) {
            try {
                arvo0.b(((String[])gged0.toArray(new String[0])));
            }
            catch(RemoteException unused_ex) {
                arut.a.f("Remote exception while calling #cancelDownloadForPackage on manager service", new Object[0]);
            }
            return;
        }
        aqql0.f("Connection to service already dead", new Object[0]);
    }
}

