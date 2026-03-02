import android.content.Context;
import android.content.Intent;
import com.google.android.gms.backup.extension.backup.CustomBackupRequest;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class asgy {
    public final Object a;
    public final AtomicBoolean b;
    public gged_interceptors c;
    public static final int d;
    private static final baun e;
    private static final ggeo f;
    private static final ggfp g;
    private final Context h;
    private final boolean i;
    private final boolean j;
    private final gged_interceptors k;
    private final asfu l;
    private final aqnb m;
    private final long n;
    private final asfw o;

    static {
        asgy.e = aqql.a("CustomBackupsManager");
        asgy.f = ggeo.m("com.google.android.apps.photos", aqfx.c, "com.google.android.gms", aqfx.i);
        asgy.g = new ggoh(((int)29002));
    }

    public asgy(Context context0, boolean z, boolean z1, asfu asfu0, aqnb aqnb0, asfw asfw0, List list0) {
        this.a = new Object();
        this.b = new AtomicBoolean(false);
        this.c = ggna.a;
        this.h = context0;
        this.i = z;
        this.j = z1;
        this.o = asfw0;
        ggdy ggdy0 = new ggdy();
        for(Object object0: list0) {
            asgy.e.d("Creating intent for package: %s", new Object[]{((String)object0)});
            ggdy0.i(new Intent().setPackage(((String)object0)).setAction("com.google.android.gms.backup.action.CUSTOM_BACKUP"));
        }
        this.k = ggdy0.h();
        this.l = asfu0;
        this.m = aqnb0;
        this.n = hqil.f();
    }

    public final int a(asfv asfv0, asgb asgb0, asgc asgc0) {
        gged_interceptors gged1;
        String s1;
        Boolean boolean0;
        gibh gibh0 = (gibh)((ProtoLiteMessage)gibj.a).v_newBuilder();
        if(!gibh0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gibh0).ensureMutable();
        }
        gged_interceptors gged0 = this.k;
        gibj gibj0 = (gibj)gibh0.b_message;
        gibj0.b |= 1;
        gibj0.c = true;
        ggqk ggqk0 = gged0.E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            gibh0.a(((Intent)object0).getPackage());
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        gibj gibj1 = (gibj)((ProtoLiteBuilder)gibh0).N_build();
        gibj1.getClass();
        ghys0.L = gibj1;
        ghys0.c |= 0x8000;
        ghys ghys1 = (ghys)hftp0.N_build();
        this.l.e(ghys1, ghyr.T);
        if(gged0.isEmpty()) {
            asgy.e.j("No custom backup services supported.", new Object[0]);
            return 29000;
        }
        CountDownLatch countDownLatch0 = new CountDownLatch(1);
        aqvc aqvc0 = aqvd.a();
        aqvc0.c(10);
        aqvd aqvd0 = aqvc0.a();
        asgx asgx0 = new asgx(this, countDownLatch0);
        this.m.c(asgx0, aqvd0);
        try {
            boolean0 = Boolean.valueOf(countDownLatch0.await(this.n, TimeUnit.SECONDS));
        }
        catch(InterruptedException interruptedException0) {
            this.l.g(5);
            Thread.currentThread().interrupt();
            asgy.e.g("Interrupted while waiting", interruptedException0, new Object[0]);
            boolean0 = null;
        }
        if(this.b.get()) {
            asgy.e.f("Unable to retrieve disabled packages so not running custom backup", new Object[0]);
            this.l.g(3);
            return 29001;
        }
        if(boolean0 != null) {
            this.l.g((boolean0.booleanValue() ? 2 : 4));
            if(hqkm.a.b().a() && !boolean0.booleanValue()) {
                return 15;
            }
        }
        synchronized(this.a) {
            gged1 = this.c;
        }
        ggdy ggdy0 = new ggdy();
        gged_interceptors gged2 = this.k;
        for(int v1 = 0; v1 < ((ggna)gged2).c; ++v1) {
            Intent intent0 = (Intent)gged2.get(v1);
            String s = intent0.getPackage();
            aqfx aqfx0 = (aqfx)asgy.f.get(s);
            if(aqfx0 != null) {
                gftb.check(gged1);
                if(!gged1.contains(aqfx0)) {
                    ggdy0.i(intent0);
                }
            }
        }
        gged_interceptors gged3 = ggdy0.h();
        if(gged3.isEmpty()) {
            asgy.e.j("No custom backup packages have user consent to run backup.", new Object[0]);
            return 29000;
        }
        int v2 = ((ggna)gged3).c;
        asgb0.c(v2);
        for(int v = 0; v < v2; ++v) {
            Intent intent1 = (Intent)gged3.get(v);
            Context context0 = this.h;
            if(hqlh.a.b().j()) {
                s1 = intent1.getPackage();
                gftb.check(s1);
            }
            else {
                s1 = intent1.getPackage();
            }
            CustomBackupRequest customBackupRequest0 = new CustomBackupRequest(((int)this.i), this.j);
            aqzt aqzt0 = hqil.a.j().ah() ? aqzs.a(context0) : null;
            int v3 = new asgu(context0, s1, intent1, customBackupRequest0, this.l, this.o, aqzt0, this.i).a(asfv0, asgb0, asgc0);
            if(hqil.m() && asgy.g.contains(Integer.valueOf(v3))) {
                return v3;
            }
        }
        return 29000;
    }
}

