import android.content.Context;
import android.os.Process;
import android.system.Os;
import com.google.android.gms.update.SystemUpdateStatus;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class ezzl extends ezyj implements faaq {
    private faar A;
    public static final fagu g;
    private static final baun h;
    private static final fagf i;
    private static final fagg j;
    private static final fagl k;
    private final hlnn l;
    private final fagt m;
    private final ezxc n;
    private final ezxl o;
    private final ezxs p;
    private final ezyd q;
    private final Context r;
    private final Object s;
    private final AtomicBoolean t;
    private final AtomicBoolean u;
    private final glzo v;
    private final AtomicBoolean w;
    private final AtomicInteger x;
    private final AtomicReference y;
    private boolean z;

    static {
        ezzl.h = fabk.e("NonStreamingAbApplyAction");
        ezzl.g = new fagu("file_path", "");
        ezzl.i = new fagf("post_installation", Boolean.valueOf(false));
        ezzl.j = new fagg("progress", ((double)-1.0));
        ezzl.k = new fagl("post_installation_status", ((int)529));
    }

    public ezzl(Context context0, fagj fagj0) {
        super("non-streaming-ab-apply", fagj0);
        this.z = false;
        this.r = context0;
        this.m = (fagt)fagt.a.b();
        this.n = (ezxc)ezxc.c.b();
        this.o = (ezxl)ezxl.h.b();
        this.p = (ezxs)ezxs.l.b();
        this.q = (ezyd)ezyd.b.b();
        this.s = new Object();
        this.l = faaa.c();
        this.t = new AtomicBoolean(false);
        this.u = new AtomicBoolean(((Boolean)this.c(ezzl.i)).booleanValue());
        this.v = new glzo(((double)(((Double)this.c(ezzl.j)))));
        this.x = new AtomicInteger(((int)(((Integer)this.c(ezzl.k)))));
        this.w = new AtomicBoolean(false);
        this.y = new AtomicReference(gfqx.a);
    }

    @Override  // ezyj
    public final ezyi a() {
        FileOutputStream fileOutputStream0;
        File file0;
        ZipEntry zipEntry0;
        ZipInputStream zipInputStream0;
        String s3;
        esaa esaa0;
        int v2;
        faar faar0;
        gged_interceptors gged0;
        fafn fafn0;
        Object object0;
        gfsx gfsx0;
        ezwb ezwb0;
        this.n.e();
        this.n.f();
        ezxl ezxl0 = this.o;
        ezxl0.l();
        this.n.a();
        try {
            SystemUpdateStatus systemUpdateStatus0 = this.p.b();
            try {
                long v = this.p.a();
                long v1 = ezxl0.c();
                ezwb0 = ezwq.c(this.r, systemUpdateStatus0, v, v1);
            }
            catch(ezwa ezwa0) {
                ezzl.h.g("Unable to continue due to invalid config.", ezwa0, new Object[0]);
                double f = this.v.a();
                this.p.u(786, f);
                gfsx0 = gfsx.m(new ezyi("finished-execution", fagj.b(new fagh[0])));
                goto label_58;
            }
            ezxs ezxs0 = this.p;
            ezxs0.u(ezwb0.a, this.v.a());
            switch(ezwb0.a) {
                case 273: {
                    hlnn hlnn0 = this.l;
                    if(ezwr.g(hlnn0)) {
                        fagi fagi0 = new fagi();
                        fagh[] arr_fagh = new fagh[1];
                        String s = (String)this.c(ezzl.g);
                        arr_fagh[0] = new fagh(ezyv.h, s);
                        fagi0.d(arr_fagh);
                        gfsx0 = gfsx.m(new ezyi("ab-reboot", fagi0.a()));
                    }
                    else if(ezwj.a().booleanValue()) {
                        ezzl.h.h("Bypassing the self-update check.", new Object[0]);
                        goto label_26;
                    }
                    else if(ezwr.h(hlnn0)) {
                        ezzl.h.f("The package has already been applied; stale checkin?", new Object[0]);
                        ezxs0.u(0, -1.0);
                        gfsx0 = gfsx.m(new ezyi("finished-execution", fagj.b(new fagh[0])));
                    }
                    else {
                    label_26:
                        if(ezwr.i(hlnn0)) {
                            ezzl.h.f("The package doesn\'t have a valid timestamp or is unintentionally downgrading.", new Object[0]);
                            ezxs0.u(530, -1.0);
                            gfsx0 = gfsx.m(new ezyi("finished-execution", fagj.b(new fagh[0])));
                        }
                        else {
                            gfsx0 = gfqx.a;
                        }
                    }
                    break;
                }
                case 275: {
                    ezxc ezxc0 = this.n;
                    ezxc0.b();
                    if(hvxt.c() && ezwc.k(this.r)) {
                        ezxc0.c();
                    }
                    goto label_51;
                }
                case 1043: {
                    this.o.n(this.r);
                    this.o.j();
                label_51:
                    SystemUpdateStatus systemUpdateStatus1 = ezxs0.b();
                    this.q.a(systemUpdateStatus1, Long.valueOf(ezwb0.b));
                    ezze ezze0 = new ezze();
                    ezze0.f(ezwb0.b);
                    ezze0.d("non-streaming-ab-apply", this.b());
                    ezze0.g(ezwb0.c);
                    gfsx0 = gfsx.m(ezze0.a());
                    break;
                }
                default: {
                    goto label_51;
                }
            }
        label_58:
            if(gfsx0.i()) {
                object0 = gfsx0.d();
            }
            else {
                gfsx gfsx1 = (gfsx)this.m.b(ezyq.i);
                if(gfsx1.i()) {
                    try {
                        SystemUpdateStatus systemUpdateStatus2 = this.p.b();
                        ggdy ggdy0 = new ggdy();
                        if(!ezwy.g(this.r, systemUpdateStatus2)) {
                            ggdy0.i("SWITCH_SLOT_ON_REBOOT=0");
                        }
                        if(systemUpdateStatus2.h.d) {
                            ggdy0.i("RUN_POST_INSTALL=0");
                        }
                        fafn0 = (fafn)gfsx1.d();
                        gged0 = ggdy0.h();
                        faar0 = new faar();
                        faar0.e(this);
                        goto label_80;
                    }
                    catch(InterruptedException interruptedException0) {
                        goto label_113;
                    }
                }
                else {
                    fagi fagi1 = new fagi();
                    fagh[] arr_fagh1 = new fagh[1];
                    String s1 = (String)this.c(ezzl.g);
                    arr_fagh1[0] = new fagh(ezzn.g, s1);
                    fagi1.d(arr_fagh1);
                    object0 = new ezyi("non-streaming-process-package", fagi1.a());
                }
            }
            goto label_174;
        }
        catch(Throwable throwable0) {
            this.n.d();
            throw throwable0;
        }
        try {
            try {
            label_80:
                faar0.c();
                goto label_87;
            }
            catch(fabe fabe0) {
            }
            ezzl.h.g("Unable to bind to UpdateEngine.", fabe0, new Object[0]);
        }
        catch(Throwable throwable1) {
            goto label_108;
        }
        try {
            faar0.g();
            v2 = -1;
            goto label_117;
        }
        catch(InterruptedException interruptedException0) {
            goto label_113;
        }
        catch(Throwable throwable0) {
            this.n.d();
            throw throwable0;
        }
        try {
        label_87:
            synchronized(this.s) {
                this.A = faar0;
            }
            esaa0 = new esaa(this.r, 1, "non-streaming-ab-apply", null, "com.google.android.gms");
            esaa0.j(false);
            gfsx gfsx2 = gfsx.m(esaa0);
            this.y.set(gfsx2);
            esaa0.b();
            this.w.set(true);
        }
        catch(Throwable throwable1) {
            goto label_108;
        }
        try {
            v2 = faar0.b(fafn0, gged0);
            goto label_103;
        }
        catch(Throwable throwable2) {
            try {
                if(this.w.compareAndSet(true, false)) {
                    esaa0.g();
                }
                this.y.set(gfqx.a);
                throw throwable2;
            label_103:
                if(this.w.compareAndSet(true, false)) {
                    esaa0.g();
                }
                this.y.set(gfqx.a);
                goto label_110;
            }
            catch(Throwable throwable1) {
            }
        }
        try {
            try {
            label_108:
                faar0.g();
                throw throwable1;
            label_110:
                faar0.g();
            }
            catch(InterruptedException interruptedException0) {
            label_113:
                ezzl.h.g("Installation interrupted.", interruptedException0, new Object[0]);
                this.p.u(1042, -1.0);
                object0 = ezzr.a(this.r, false);
                goto label_174;
            }
        label_117:
            if(this.t.get()) {
                goto label_164;
            }
            else if(faas.a(v2)) {
                String s2 = (String)this.c(ezzl.g);
                s3 = bbqr.c((hrnt.i() ? new File(ccsb.a.a(s2)) : new File(s2)).getParent());
                try {
                    zipInputStream0 = new ZipInputStream((hrnt.i() ? new FileInputStream(ccsb.a.a(s2)) : new FileInputStream(s2)));
                    goto label_122;
                }
                catch(IOException iOException0) {
                    goto label_157;
                }
            }
            else {
                goto label_160;
            }
            goto label_174;
        }
        catch(Throwable throwable0) {
            this.n.d();
            throw throwable0;
        }
        try {
            do {
            label_122:
                zipEntry0 = zipInputStream0.getNextEntry();
            label_123:
                if(zipEntry0 == null) {
                    goto label_154;
                }
                if(zipEntry0.isDirectory()) {
                    zipEntry0 = zipInputStream0.getNextEntry();
                    goto label_123;
                }
            }
            while(!"care_map.pb".equals(zipEntry0.getName()) && !"care_map.txt".equals(zipEntry0.getName()));
            file0 = hrnt.i() ? new File(ccsb.a.d(s3, zipEntry0.getName())) : new File(s3, zipEntry0.getName());
            fileOutputStream0 = new FileOutputStream(file0);
        }
        catch(Throwable throwable3) {
            goto label_152;
        }
        try {
            byte[] arr_b = new byte[0x400];
            int v3;
            while((v3 = zipInputStream0.read(arr_b)) > 0) {
                fileOutputStream0.write(arr_b, 0, v3);
            }
            int v4 = Process.getGidForName("cache");
            int v5 = Os.getuid();
            if(v4 != -1) {
                try {
                    Os.fchown(fileOutputStream0.getFD(), v5, v4);
                    Os.fchmod(fileOutputStream0.getFD(), 0x1A0);
                }
                catch(Exception exception0) {
                    faaa.a.g("Failed to set group owner.", exception0, new Object[0]);
                }
            }
            goto label_145;
        }
        catch(Throwable throwable4) {
            try {
                fileOutputStream0.close();
                throw throwable4;
            label_145:
                fileOutputStream0.close();
                file0.getAbsolutePath();
            }
            catch(Throwable throwable3) {
                goto label_152;
            }
        }
        try {
            zipInputStream0.close();
            object0 = new ezyi("ab-reboot", fagj.b(new fagh[0]));
            goto label_174;
        }
        catch(IOException iOException0) {
            goto label_157;
        }
        catch(Throwable throwable0) {
            this.n.d();
            throw throwable0;
        }
        try {
            zipEntry0 = zipInputStream0.getNextEntry();
            goto label_123;
        }
        catch(Throwable throwable3) {
            try {
                try {
                label_152:
                    zipInputStream0.close();
                    throw throwable3;
                label_154:
                    zipInputStream0.close();
                    throw new IOException("Unable to find care_map file.");
                }
                catch(IOException iOException0) {
                label_157:
                    ezzl.h.g("Unable to extract the care_map file.", iOException0, new Object[0]);
                }
                object0 = new ezyi("ab-reboot", fagj.b(new fagh[0]));
                goto label_174;
            label_160:
                ezzl.h.f("Installation failed with error code: %d.", new Object[]{v2});
                this.p.u(1042, -1.0);
                object0 = ezzr.a(this.r, false);
                goto label_174;
            label_164:
                fagi fagi2 = this.b().a();
                Double double0 = this.v.a();
                fagi2.e(ezzl.j, double0);
                Boolean boolean0 = Boolean.valueOf(this.u.get());
                fagi2.e(ezzl.i, boolean0);
                object0 = new ezyi("non-streaming-ab-apply", fagi2.a());
                goto label_174;
            }
            catch(Throwable throwable0) {
            }
        }
        this.n.d();
        throw throwable0;
    label_174:
        this.n.d();
        return (ezyi)object0;
    }

    @Override  // ezyj
    public final void d() {
        super.d();
        ezzl.h.d("Requesting update engine to reset.", new Object[0]);
        this.t.set(true);
        faar faar0 = this.g();
        if(faar0 != null) {
            try {
                faar0.d();
            }
            catch(InterruptedException interruptedException0) {
                ezzl.h.g("Reset operation interrupted.", interruptedException0, new Object[0]);
            }
        }
    }

    @Override  // ezyj
    public final boolean e(int v) {
        int v3;
        try {
            SystemUpdateStatus systemUpdateStatus0 = this.p.b();
            long v1 = this.p.a();
            long v2 = this.o.c();
            v3 = ezwq.c(this.r, systemUpdateStatus0, v1, v2).a;
        }
        catch(ezwa ezwa0) {
            ezzl.h.g("Invalid config.", ezwa0, new Object[0]);
            return true;
        }
        if(v3 != 273) {
            baun baun0 = ezzl.h;
            baun0.h("Maybe stop update engine for delay status: 0x%03X", new Object[]{v3});
            if(!this.u.get() || ezwk.a().booleanValue()) {
                baun0.d("Requesting update engine to stop.", new Object[0]);
                this.t.set(true);
                faar faar0 = this.g();
                if(faar0 != null) {
                    try {
                        faar0.f();
                        return true;
                    }
                    catch(InterruptedException interruptedException0) {
                        ezzl.h.g("Stop operation interrupted.", interruptedException0, new Object[0]);
                    }
                }
            }
        }
        return true;
    }

    @Override  // faaq
    public final void f(int v, int v1, float f) {
        boolean z;
        if(v == 5) {
            z = true;
        }
        else {
            switch(v) {
                case 4: {
                    v = 4;
                    z = true;
                    break;
                }
                case 6: {
                    z = true;
                    break;
                }
                default: {
                    z = false;
                }
            }
        }
        float f1 = (float)hvzw.b();
        if(v == 4) {
            this.z = true;
            f *= f1;
        }
        else if(v == 5) {
            if(this.z) {
                f = f * (1.0f - f1) + f1;
            }
            v = 5;
        }
        this.v.b(((double)f));
        this.u.set(z);
        int v2 = 273;
        if(hwai.c()) {
            if(v == 4) {
                this.x.set(785);
            }
            else {
                this.x.set(529);
            }
            ezxs ezxs0 = this.p;
            if(z) {
                v2 = this.x.get();
            }
            ezxs0.u(v2, ((double)f));
        }
        else {
            ezxs ezxs1 = this.p;
            if(z) {
                v2 = 529;
            }
            ezxs1.u(v2, ((double)f));
        }
        if(z) {
            ezxs ezxs2 = this.p;
            if(!ezxs2.b().I) {
                ezxs2.k();
            }
        }
        this.p.x(v, v1);
        if(v == 5 && hwdg.c() && this.w.compareAndSet(true, false)) {
            gfsx gfsx0 = (gfsx)this.y.get();
            if(gfsx0.i()) {
                ezzl.h.h("Releasing stream-apply wakelock before post-install", new Object[0]);
                ((esaa)gfsx0.d()).g();
            }
        }
    }

    private final faar g() {
        synchronized(this.s) {
        }
        return this.A;
    }
}

