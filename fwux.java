import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.SystemClock;
import android.os.WorkSource.WorkChain;
import android.os.WorkSource;
import com.google.android.gms.libs.platform.GmsAlarmManagerCompat.OnAlarmListener;
import com.google.android.location.os.real.LegacyRealTimers..ExternalSyntheticLambda1;
import j..util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public final class fwux implements fwzp {
    final fwwo[] a;
    public final Context b;
    public final fvwz c;
    public final PendingIntent[] d;
    public final GmsAlarmManagerCompat.OnAlarmListener[] e;
    public final fwtu f;
    private final AlarmManager h;
    private final cjnn[] i;
    private final long[] j;
    private final long[] k;
    private final cjnr l;

    public fwux(Context context0, fwtu fwtu0, fvwz fvwz0) {
        this.b = context0;
        this.c = fvwz0;
        this.f = fwtu0;
        this.l = cjnm.b(context0);
        int v = fwux.g;
        this.a = new fwwo[v];
        long[] arr_v = new long[v];
        this.j = arr_v;
        long[] arr_v1 = new long[v];
        this.k = arr_v1;
        Arrays.fill(arr_v, -1L);
        Arrays.fill(arr_v1, -1L);
        AlarmManager alarmManager0 = (AlarmManager)context0.getSystemService("alarm");
        gftb.check(alarmManager0);
        this.h = alarmManager0;
        this.d = new PendingIntent[v];
        this.e = new GmsAlarmManagerCompat.OnAlarmListener[v];
        this.i = new cjnn[v];
    }

    @Override  // fwzp
    public final Executor a() {
        Objects.requireNonNull(this.f);
        return new fwuu(this.f);
    }

    @Override  // fwzp
    public final void b(fwzf fwzf0) {
        int v = fwzf0.ordinal();
        this.f(fwzf0);
        fwso.b(this.c, fwzf0);
        PendingIntent pendingIntent0 = this.d[v];
        if(pendingIntent0 != null) {
            this.h.cancel(pendingIntent0);
        }
        cjnn[] arr_cjnn = this.i;
        cjnn cjnn0 = arr_cjnn[v];
        if(cjnn0 != null) {
            arr_cjnn[v] = null;
            cjnn0.a();
        }
    }

    @Override  // fwzp
    public final void c(fwzf fwzf0, int v, long v1, fwyc fwyc0) {
        AlarmManager alarmManager1;
        long v2 = v1;
        long[] arr_v = this.j;
        int v3 = fwzf0.ordinal();
        if(Long.compare(arr_v[v3], v2) == 0 && this.k[v3] == -1L) {
            return;
        }
        arr_v[v3] = v2;
        this.k[v3] = -1L;
        fwso.c(this.c, fwzf0, v2, false);
        boolean z = fwux.q(v2);
        if(!z) {
            AlarmManager alarmManager0 = this.h;
            int v4 = fwux.p(v);
            int v5 = fwzf0.ordinal();
            GmsAlarmManagerCompat.OnAlarmListener[] arr_gmsAlarmManagerCompat$OnAlarmListener = this.e;
            if(arr_gmsAlarmManagerCompat$OnAlarmListener[v5] == null) {
                int v6 = v4;
                if((fwyc0 instanceof fyay)) {
                    WorkSource workSource1 = ((fyay)fwyc0).d();
                    if(workSource1 == null) {
                        goto label_36;
                    }
                    else {
                        try {
                            PendingIntent pendingIntent0 = this.d[v5];
                            try {
                                alarmManager0.set(v6, v1, -1L, 0L, pendingIntent0, workSource1);
                                v2 = v1;
                            }
                            catch(Exception unused_ex) {
                                alarmManager1 = alarmManager0;
                                v6 = v6;
                                v2 = v1;
                                goto label_38;
                            }
                        }
                        catch(Exception unused_ex) {
                            goto label_36;
                        }
                    }
                }
                else {
                label_36:
                    alarmManager1 = alarmManager0;
                    v2 = v1;
                    try {
                    label_38:
                        alarmManager1.set(v6, v2, this.d[v5]);
                    }
                    catch(Exception unused_ex) {
                    }
                }
            }
            else {
                WorkSource workSource0 = (fwyc0 instanceof fyay) ? ((fyay)fwyc0).d() : null;
                cjnn[] arr_cjnn = this.i;
                cjnn cjnn0 = arr_cjnn[v5];
                if(cjnn0 != null) {
                    cjnn0.a();
                }
                jyy jyy0 = new jyy(this.f.a());
                arr_cjnn[v5] = this.l.a(fwzf0.x, v4, v1, workSource0, jyy0, arr_gmsAlarmManagerCompat$OnAlarmListener[v5]);
                v2 = v1;
            }
        }
        this.f.i(fwzf0, v2, -1L);
        if(z) {
            cjnn cjnn1 = this.i[v3];
            if(cjnn1 != null) {
                cjnn1.a();
            }
            this.h(fwzf0);
        }
    }

    @Override  // fwzp
    public final void d(fwzf fwzf0, int v, long v1, long v2, fwyc fwyc0) {
        long[] arr_v = this.j;
        int v3 = fwzf0.ordinal();
        if(arr_v[v3] == v1 && this.k[v3] == v2) {
            return;
        }
        arr_v[v3] = v1;
        this.k[v3] = v2;
        fwsf fwsf0 = new fwsf(this.c.f(), fwzf0.ordinal(), ((int)v1), ((int)v2), fwzf0, v1, v2);
        this.c.a(fwsf0);
        boolean z = fwux.q(v1);
        if(!z) {
            int v4 = fwux.p(v);
            GmsAlarmManagerCompat.OnAlarmListener[] arr_gmsAlarmManagerCompat$OnAlarmListener = this.e;
            if(arr_gmsAlarmManagerCompat$OnAlarmListener[v3] == null) {
                AlarmManager alarmManager0 = this.h;
                PendingIntent pendingIntent0 = this.d[v3];
                if((fwyc0 instanceof fyay)) {
                    WorkSource workSource1 = ((fyay)fwyc0).d();
                    if(workSource1 == null) {
                        try {
                            alarmManager0.setWindow(v4, v1, v2, pendingIntent0);
                        }
                        catch(Exception unused_ex) {
                            goto label_31;
                        }
                    }
                    else {
                        try {
                            alarmManager0.set(v4, v1, v2, 0L, pendingIntent0, workSource1);
                        }
                        catch(Exception unused_ex) {
                            pendingIntent0 = pendingIntent0;
                            goto label_31;
                        }
                    }
                }
                else {
                    try {
                    label_31:
                        alarmManager0.setWindow(v4, v1, v2, pendingIntent0);
                    }
                    catch(SecurityException | IllegalStateException unused_ex) {
                    }
                }
            }
            else {
                WorkSource workSource0 = (fwyc0 instanceof fyay) ? ((fyay)fwyc0).d() : null;
                cjnn[] arr_cjnn = this.i;
                cjnn cjnn0 = arr_cjnn[v3];
                if(cjnn0 != null) {
                    cjnn0.a();
                }
                jyy jyy0 = new jyy(this.f.a());
                arr_cjnn[v3] = this.l.c(fwzf0.x, v, v1, v2, workSource0, jyy0, arr_gmsAlarmManagerCompat$OnAlarmListener[v3]);
            }
        }
        this.f.i(fwzf0, v1, v2);
        if(z) {
            cjnn cjnn1 = this.i[v3];
            if(cjnn1 != null) {
                cjnn1.a();
            }
            this.h(fwzf0);
        }
    }

    @Override  // fwzp
    public final void e(fwzf fwzf0) {
        cjnn[] arr_cjnn = this.i;
        int v = fwzf0.ordinal();
        cjnn cjnn0 = arr_cjnn[v];
        if(cjnn0 == null) {
            return;
        }
        cjnn0.a();
        arr_cjnn[v] = null;
        fwso.b(this.c, fwzf0);
    }

    final void f(fwzf fwzf0) {
        int v = fwzf0.ordinal();
        this.j[v] = -1L;
        this.k[v] = -1L;
    }

    public final void g(boolean z) {
        fwzf[] arr_fwzf = fwzf.values();
        for(int v = 0; v < arr_fwzf.length; ++v) {
            fwzf fwzf0 = arr_fwzf[v];
            int v1 = fwzf0.ordinal();
            if(!z || (fwzf0.y & 1) != 0) {
                if(this.a[v1].b()) {
                    this.j(fwzf0);
                }
                this.b(fwzf0);
            }
        }
    }

    public final void h(fwzf fwzf0) {
        int v = fwzf0.ordinal();
        long v1 = SystemClock.elapsedRealtime() - this.j[v];
        this.i[v] = null;
        fwuv fwuv0 = new fwuv(this, fwzf0, ((int)v1));
        this.f.r(fwuv0);
    }

    @Override  // fwzp
    public final void i(fwzf fwzf0, long v, fwyc fwyc0) {
        int v1 = fwzf0.ordinal();
        if(huvd.v()) {
            fvwx fvwx0 = new fvwx(0x2F, this.c.f(), "%2$d", fwzf0.ordinal());
            this.c.a(fvwx0);
        }
        fwwo fwwo0 = this.a[v1];
        WorkSource workSource0 = null;
        if(fwyc0 == null || bbsr.b(this.b).a("android.permission.UPDATE_DEVICE_STATS") != 0) {
            fwyc0 = null;
        }
        if((fwyc0 instanceof fyay)) {
            if(!huvd.a.f().ac()) {
                workSource0 = ((fyay)fwyc0).d();
            }
            else if(fwyc0 != null) {
                List list0 = fwyc0.a();
                WorkSource workSource1 = new WorkSource();
                WorkSource.WorkChain workSource$WorkChain0 = workSource1.createWorkChain();
                for(Object object0: list0) {
                    workSource$WorkChain0.addNode(((Integer)object0).intValue(), null);
                }
                workSource$WorkChain0.addNode(bbrd.a, "com.google.android.gms");
                workSource0 = workSource1;
            }
            if(workSource0 != null) {
                fwwo0.b.k(workSource0);
            }
        }
        fwwo0.b.c(v);
        fwwp fwwp0 = fwwp.a;
        synchronized(fwwp0) {
            if(fwwo0.d == -1L) {
                fwwo0.d = SystemClock.elapsedRealtime();
                if(fwwp0.d == -1L) {
                    fwwp0.d = SystemClock.elapsedRealtime();
                }
                fwwp0.b.add(fwwo0);
            }
        }
    }

    @Override  // fwzp
    public final void j(fwzf fwzf0) {
        int v = fwzf0.ordinal();
        if(huvd.v()) {
            fvwx fvwx0 = new fvwx(0x30, this.c.f(), "%2$d", fwzf0.ordinal());
            this.c.a(fvwx0);
        }
        fwwo fwwo0 = this.a[v];
        try {
            fwwp fwwp0 = fwwp.a;
            synchronized(fwwp0) {
                if(fwwo0.b()) {
                    long v2 = SystemClock.elapsedRealtime();
                    fwwo0.b.g();
                    if(!fwwo0.b() && fwwo0.d != -1L) {
                        long v3 = fwwo0.a(v2);
                        fwwp0.b.remove(fwwo0);
                        String s = fwwo0.c;
                        Map map0 = fwwp0.c;
                        fvtp fvtp0 = (fvtp)map0.get(s);
                        if(fvtp0 == null) {
                            fvtp0 = new fvtp(fwwo0.e);
                            map0.put(s, fvtp0);
                        }
                        fvtp0.a(v3);
                        fwwo0.d = -1L;
                    }
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // fwzp
    public final boolean k(fwzf fwzf0) {
        return this.a[fwzf0.ordinal()].b();
    }

    @Override  // fwzp
    public final void l(fwzf fwzf0, long v, fwyc fwyc0) {
        long v3;
        long v2;
        long[] arr_v = this.j;
        int v1 = fwzf0.ordinal();
        if(arr_v[v1] != v) {
            arr_v[v1] = v;
            fwso.c(this.c, fwzf0, v, true);
            boolean z = fwux.q(v);
            if(z) {
                v3 = v;
            }
            else {
                String s = fwzf0.x;
                GmsAlarmManagerCompat.OnAlarmListener[] arr_gmsAlarmManagerCompat$OnAlarmListener = this.e;
                if(arr_gmsAlarmManagerCompat$OnAlarmListener[v1] == null) {
                    v2 = v;
                    fwwn.h();
                    PendingIntent pendingIntent0 = this.d[v1];
                    try {
                        pendingIntent0.getIntentSender();
                        this.h.setExactAndAllowWhileIdle(2, v2, pendingIntent0);
                    }
                    catch(SecurityException | IllegalStateException unused_ex) {
                    }
                }
                else {
                    WorkSource workSource0 = (fwyc0 instanceof fyay) ? ((fyay)fwyc0).d() : null;
                    cjnn[] arr_cjnn = this.i;
                    cjnn cjnn0 = arr_cjnn[v1];
                    if(cjnn0 != null) {
                        cjnn0.a();
                    }
                    jyy jyy0 = new jyy(this.f.a());
                    v2 = v;
                    arr_cjnn[v1] = this.l.b(s, 2, v, workSource0, jyy0, arr_gmsAlarmManagerCompat$OnAlarmListener[v1]);
                }
                v3 = v2;
            }
            this.f.i(fwzf0, v3, 0L);
            if(z) {
                cjnn cjnn1 = this.i[v1];
                if(cjnn1 != null) {
                    cjnn1.a();
                }
                this.h(fwzf0);
            }
        }
    }

    @Override  // fwzp
    public final void m(Runnable runnable0) {
        this.f.r(runnable0);
    }

    @Override  // fwzp
    public final void n(fwzf fwzf0, Runnable runnable0, Executor executor0, long v, fwyc fwyc0) {
        int v1 = fwzf0.ordinal();
        this.f.i(fwzf0, v, -1L);
        fwso.c(this.c, fwzf0, v, false);
        cjnn[] arr_cjnn = this.i;
        cjnn cjnn0 = arr_cjnn[v1];
        WorkSource workSource0 = null;
        if(cjnn0 != null) {
            cjnn0.a();
            arr_cjnn[v1] = null;
        }
        if(v != 0x7FFFFFFFFFFFFFFFL && v != -1L) {
            fwut fwut0 = new fwut(this, fwzf0, v, runnable0);
            if(v - SystemClock.elapsedRealtime() < 100L) {
                executor0.execute(fwut0);
                return;
            }
            if((fwyc0 instanceof fyay) && bbsr.b(this.b).a("android.permission.UPDATE_DEVICE_STATS") == 0) {
                workSource0 = ((fyay)fwyc0).d();
            }
            LegacyRealTimers..ExternalSyntheticLambda1 legacyRealTimers$$ExternalSyntheticLambda10 = new LegacyRealTimers..ExternalSyntheticLambda1(fwut0);
            arr_cjnn[v1] = this.l.b(fwzf0.x, 2, v, workSource0, executor0, legacyRealTimers$$ExternalSyntheticLambda10);
        }
    }

    @Override  // fwzp
    public final void o(Object object0) {
        fwtg fwtg0 = new fwtg(this.f, object0);
        this.f.r(fwtg0);
    }

    // String Decryptor: 1 succeeded, 0 failed
    private static int p(int v) {
        return v == 2 ? 2 : 3;
    }

    private static boolean q(long v) {
        return v <= 0L;
    }
}

