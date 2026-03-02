import android.location.Location;
import android.location.LocationListener;
import android.os.Looper;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.LocationRequest;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

public final class eigb {
    public final Set a;
    public final List b;
    public final cmnh c;
    public Location d;
    public final CurrentLocationRequest e;
    final cmoa f;
    public static final int g;
    private static final long h;
    private final Looper i;
    private final int j;

    static {
        eigb.h = TimeUnit.SECONDS.toMillis(30L);
    }

    public eigb(cmnh cmnh0, Looper looper0) {
        this.a = new CopyOnWriteArraySet();
        this.b = new CopyOnWriteArrayList();
        this.d = new Location("network");
        int v = hrtd.a.I().bG() ? 104 : 102;
        this.j = v;
        this.f = new eiga(this);
        this.c = cmnh0;
        this.i = looper0;
        cmmy cmmy0 = new cmmy();
        cmmy0.b(eigb.h);
        cmmy0.d(v);
        cmmy0.e(2);
        this.e = cmmy0.a();
    }

    public final void a(cmoa cmoa0) {
        this.a.add(cmoa0);
    }

    public final void b(LocationListener locationListener0) {
        this.b.add(locationListener0);
    }

    public final void c(eigi eigi0) {
        this.d();
        cmoc cmoc0 = new cmoc(((long)eigi0.a));
        cmoc0.k(this.j);
        cmoc0.l(2);
        cmoc0.j(hrtd.p());
        cmoc0.i(((float)eigi0.b));
        LocationRequest locationRequest0 = cmoc0.a();
        this.c.j(locationRequest0, this.f, this.i);
    }

    public final void d() {
        cmnh cmnh0 = this.c;
        if(cmnh0 != null) {
            cmnh0.f(this.f);
        }
    }
}

