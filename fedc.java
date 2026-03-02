import android.content.pm.PackageManager.NameNotFoundException;
import java.util.Set;
import java.util.concurrent.locks.Lock;

public final class fedc implements Runnable {
    public final fedp a;
    public final String b;

    public fedc(fedp fedp0, String s) {
        this.a = fedp0;
        this.b = s;
    }

    @Override
    public final void run() {
        fedp fedp0 = this.a;
        Lock lock0 = fedp0.m;
        lock0.lock();
        String s = this.b;
        try {
            try {
                if(fedp0.l.get() && fedp0.f) {
                    fdpl fdpl0 = fdpn.a(fedp0.b, s);
                    fecw fecw0 = fedp0.j;
                    String s1 = fedp0.g;
                    fecw0.e.lock();
                    try {
                        Set set0 = fecw0.d(s1);
                        if(set0.add(fdpl0)) {
                            fecw0.f(s1, set0);
                        }
                    }
                    catch(Throwable throwable1) {
                        fecw0.e.unlock();
                        throw throwable1;
                    }
                    fecw0.e.unlock();
                    fedp0.a("Local package added: " + s, "handlePackageAdded");
                    fedp0.d();
                    goto label_29;
                }
                goto label_31;
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                ffmn.c("AppCatalogService", packageManager$NameNotFoundException0, "handlePackageAdded - Could not construct AppKey. No name found.", new Object[0]);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                ffmn.c("AppCatalogService", illegalArgumentException0, "handlePackageAdded - Could not construct AppKey. Illegal arguments.", new Object[0]);
            }
        }
        catch(Throwable throwable0) {
            fedp0.m.unlock();
            throw throwable0;
        }
    label_29:
        fedp0.m.unlock();
        return;
    label_31:
        lock0.unlock();
    }
}

