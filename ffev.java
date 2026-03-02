import android.content.pm.PackageInfo;
import android.database.Cursor;
import j..util.Objects;
import java.util.concurrent.CountDownLatch;
import jeb.synthetic.TWR;

final class ffev implements Runnable {
    final CountDownLatch a;
    final ffew b;

    public ffev(ffew ffew0, CountDownLatch countDownLatch0) {
        this.a = countDownLatch0;
        Objects.requireNonNull(ffew0);
        this.b = ffew0;
        super();
    }

    @Override
    public final void run() {
        this.a.countDown();
        try {
            ffew ffew0 = this.b;
            for(Object object0: ffew0.d.getInstalledPackages(0xC0)) {
                PackageInfo packageInfo0 = (PackageInfo)object0;
                ffew0.b(packageInfo0);
                if(hzzf.c()) {
                    ffew0.p(packageInfo0);
                }
            }
            ffew0.l();
            Cursor cursor0 = ((fdvl)ffew0.g.get()).c(ffew0.c, ffew.a);
            try {
                cursor0.moveToFirst();
                while(!cursor0.isAfterLast()) {
                    fduq fduq0 = fdur.f(cursor0);
                    String s = ffew.f(fduq0);
                    if(!ffew0.m.a().a.equals(s)) {
                        ffew0.m(fduq0);
                    }
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
            cursor0.close();
            int v = 0;
            for(Object object1: ffew0.j.keySet()) {
                v |= ffew0.n(((String)object1));
            }
            if(v != 0) {
                ffew0.j();
            }
            ffew0.h();
            ffew0.e.set(true);
            ffew0.f.countDown();
        }
        catch(Exception exception0) {
            ffmn.c("TrustedPeersService", exception0, "start crashed", new Object[0]);
        }
    }
}

