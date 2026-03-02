import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.ConditionVariable;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class arfk {
    protected final arem a;
    protected final Context b;
    public static final int c;
    private static final aqql d;
    private final ConditionVariable e;
    private arfj f;

    static {
        arfk.d = new aqql(new String[]{"D2dTransportDriver"});
    }

    protected arfk(Context context0, arem arem0) {
        TimeUnit.SECONDS.toMillis(hqhq.a.j().g());
        TimeUnit.SECONDS.toMillis(hqhq.a.j().h());
        TimeUnit.SECONDS.toMillis(hqhq.a.j().f());
        this.e = new ConditionVariable(false);
        hqhq.a.j().bj();
        this.b = context0;
        this.a = arem0;
        arfk.b(context0);
    }

    public static arfk a(Context context0, arem arem0) {
        aqze.h();
        return new arfm(context0, arem0);
    }

    public static Set b(Context context0) {
        List list0 = context0.getPackageManager().getInstalledPackages(0);
        Set set0 = new HashSet();
        for(Object object0: list0) {
            PackageInfo packageInfo0 = (PackageInfo)object0;
            if(aqxs.b(packageInfo0.applicationInfo, 1) && !aqxs.a(packageInfo0) && aqzg.d(context0, packageInfo0) == aqzf.a) {
                set0.add(packageInfo0.packageName);
            }
        }
        set0.add("@pm@");
        return set0;
    }

    public void c() {
        throw null;
    }

    public void d() {
        synchronized(this) {
            throw null;
        }
    }

    protected final void e() {
        batl.m(this.f != null, "mShutdownCompleteListener was null even though a shutdown was requested.");
        aqjk aqjk0 = new aqjk(this.b);
        aren.a(this.b, aqjk0, aqjl.a);
        aren.b(this.b, aqjl.a);
        File[] arr_file = new arfi(this.b).c.a.listFiles();
        if(arr_file != null) {
            for(int v = 0; v < arr_file.length; ++v) {
                arr_file[v].delete();
            }
        }
        this.f.a();
        this.f = null;
    }

    protected void f() {
        if(!this.i()) {
            return;
        }
        arfk.d.h("Shutting down D2dDriver.", new Object[0]);
        this.e.close();
        this.e();
    }

    public final void g(arfj arfj0) {
        synchronized(this) {
            this.f = arfj0;
            this.f();
        }
    }

    public boolean h(String s) {
        throw null;
    }

    protected final boolean i() {
        return this.f != null;
    }
}

