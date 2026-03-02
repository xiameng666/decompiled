import android.content.Context;
import android.net.Network;
import android.os.RemoteException;
import com.google.android.gms.update.SystemUpdateStatus;
import j..util.Objects;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ezzs extends ezyj implements faaq, faby {
    private final AtomicReference A;
    private final AtomicBoolean B;
    private final AtomicInteger C;
    private final AtomicReference D;
    private boolean E;
    public static final fagu g;
    public final AtomicBoolean h;
    private static final baun i;
    private static final fagl j;
    private static final fagf k;
    private static final fagg l;
    private static final fagl m;
    private final Context n;
    private final fagt o;
    private final ezxc p;
    private final ezxl q;
    private final ezxs r;
    private final ezxw s;
    private final ezyd t;
    private final hlnn u;
    private final fabj v;
    private final fabz w;
    private final AtomicBoolean x;
    private final glzo y;
    private final AtomicReference z;

    static {
        ezzs.i = fabk.e("StreamingApplyAction");
        ezzs.j = new fagl("network_error_attempts", ((int)0));
        ezzs.k = new fagf("post_installation", Boolean.valueOf(false));
        ezzs.l = new fagg("progress", ((double)-1.0));
        ezzs.m = new fagl("post_installation_status", ((int)529));
        ezzs.g = new fagu("dir_path", "");
    }

    public ezzs(Context context0, fagj fagj0) {
        super("streaming-apply", fagj0);
        this.E = false;
        this.n = context0;
        this.o = (fagt)fagt.a.b();
        this.p = (ezxc)ezxc.c.b();
        this.q = (ezxl)ezxl.h.b();
        this.r = (ezxs)ezxs.l.b();
        this.s = (ezxw)ezxw.c.b();
        this.t = (ezyd)ezyd.b.b();
        this.u = faaa.c();
        this.v = new fabj(context0);
        if(hwdj.c()) {
            facc facc0 = (facc)facc.a.b();
            Objects.requireNonNull(this);
            this.w = facc.a(context0);
        }
        else {
            facd facd0 = ezwd.g() ? new facd(context0, ezwd.b(), ezwi.a().booleanValue(), hvzt.e(), ((long)ezwi.e())) : new faca(context0, hvzt.e());
            this.w = facd0;
        }
        this.x = new AtomicBoolean(false);
        this.y = new glzo(((double)(((Double)this.c(ezzs.l)))));
        this.h = new AtomicBoolean(((Boolean)this.c(ezzs.k)).booleanValue());
        this.C = new AtomicInteger(((int)(((Integer)this.c(ezzs.m)))));
        this.z = new AtomicReference(gfqx.a);
        this.A = new AtomicReference(gfqx.a);
        this.B = new AtomicBoolean(false);
        this.D = new AtomicReference(gfqx.a);
    }

    @Override  // ezyj
    public final ezyi a() {
        int v1;
        AtomicReference atomicReference0;
        Context context0;
        esaa esaa0;
        faar faar0;
        long v;
        fafn fafn0;
        Object object0;
        this.r.v(true);
        this.p.e();
        this.p.f();
        this.q.l();
        this.s.d();
        gfsx gfsx0 = this.k();
        if(gfsx0.i()) {
            return (ezyi)gfsx0.d();
        }
        this.w.c(this);
        try {
            this.w.h();
            gihd gihd0 = ezzg.a(this.n, this.w);
            this.v.d(gihd0);
        }
        catch(IOException iOException0) {
            ezzs.i.g("Failed to request streaming network.", iOException0, new Object[0]);
            double f = this.y.a();
            this.r.u(0x106, f);
            gihd gihd1 = ezzg.a(this.n, this.w);
            this.v.d(gihd1);
            return this.i();
        }
        try {
            this.p.a();
            this.s.a();
            if(hwcb.f() && ((long)ezwj.j()) == 4L) {
                this.q.i();
            }
        }
        catch(Throwable throwable0) {
            goto label_152;
        }
        try {
            gfsx gfsx1 = this.k();
            if(gfsx1.i()) {
                object0 = gfsx1.d();
                goto label_146;
            }
            else {
                gfsx gfsx2 = (gfsx)this.o.b(ezyq.i);
                if(!gfsx2.i()) {
                    goto label_120;
                }
                else if(!this.h.get()) {
                    ezzz ezzz0 = new ezzz();
                    gfsx gfsx3 = gfsx.m(ezzz0);
                    this.A.set(gfsx3);
                    ezzz0.b();
                    if(this.x.get()) {
                        ezzs.i.d("Cancelled. Will restart later.", new Object[0]);
                        object0 = new ezyi("streaming-apply", this.j().a());
                        goto label_146;
                    }
                    goto label_37;
                }
                else {
                label_37:
                    fabv fabv0 = (fabv)this.w.a().g();
                    if(fabv0 == null) {
                        double f1 = this.y.a();
                        this.r.u(0x106, f1);
                        object0 = this.i();
                        goto label_146;
                    }
                    else {
                        fafn0 = (fafn)gfsx2.d();
                        v = ((Network)((gftm)fabv0.a).a).getNetworkHandle();
                        faar0 = new faar();
                        goto label_46;
                    }
                }
            }
            goto label_155;
        }
        catch(RuntimeException runtimeException0) {
            goto label_130;
        }
        catch(Throwable throwable1) {
            goto label_141;
        }
        try {
        label_46:
            faar0.c();
            faar0.e(this);
            gfsx gfsx4 = gfsx.m(faar0);
            this.z.set(gfsx4);
            esaa0 = new esaa(this.n, 1, "streaming-apply", null, "com.google.android.gms");
            context0 = this.n;
            esaa0.j(false);
            atomicReference0 = this.D;
            atomicReference0.set(gfsx.m(esaa0));
            esaa0.b();
            AtomicBoolean atomicBoolean0 = this.B;
            atomicBoolean0.set(true);
        }
        catch(fabe unused_ex) {
            goto label_90;
        }
        catch(Throwable throwable2) {
            goto label_95;
        }
        try {
            try {
                ggdy ggdy0 = new ggdy();
                ggdy0.i(a.u(v, "NETWORK_ID="));
                ggqk ggqk0 = faaa.b(context0).E();
                while(ggqk0.hasNext()) {
                    Object object1 = ggqk0.next();
                    ggdy0.i(((String)((kau)object1).a) + "=" + ((String)((kau)object1).b));
                }
                ezxs ezxs0 = this.r;
                if(!ezwy.g(context0, ezxs0.b())) {
                    ggdy0.i("SWITCH_SLOT_ON_REBOOT=0");
                }
                if(ezxs0.b().h.d) {
                    ggdy0.i("RUN_POST_INSTALL=0");
                }
                v1 = faar0.b(fafn0, ggdy0.h());
                ezzs.i.d("Update engine finished with code %d.", new Object[]{v1});
                goto label_86;
            }
            catch(InterruptedException interruptedException0) {
            }
            ezzs.i.g("Failed to stream the update.", interruptedException0, new Object[0]);
        }
        catch(Throwable throwable3) {
            goto label_82;
        }
        try {
            if(this.B.compareAndSet(true, false)) {
                esaa0.g();
            }
            this.D.set(gfqx.a);
        }
        catch(fabe unused_ex) {
            goto label_90;
        }
        catch(Throwable throwable2) {
            goto label_95;
        }
        try {
            faar0.g();
            v1 = 1;
            goto label_98;
        }
        catch(RuntimeException runtimeException0) {
            goto label_130;
        }
        catch(Throwable throwable1) {
            goto label_141;
        }
        try {
            try {
            label_82:
                if(this.B.compareAndSet(true, false)) {
                    esaa0.g();
                }
                this.D.set(gfqx.a);
                throw throwable3;
            label_86:
                if(atomicBoolean0.compareAndSet(true, false)) {
                    esaa0.g();
                }
                atomicReference0.set(gfqx.a);
                goto label_97;
            }
            catch(fabe unused_ex) {
            }
        label_90:
            ezzs.i.h("Unable to bind to UpdateEngine.", new Object[0]);
        }
        catch(Throwable throwable2) {
            goto label_95;
        }
        try {
            try {
                faar0.g();
                v1 = -1;
                goto label_98;
            label_95:
                faar0.g();
                throw throwable2;
            label_97:
                faar0.g();
            label_98:
                if(this.x.get()) {
                    ezzs.i.d("Cancelled. Will restart later.", new Object[0]);
                    object0 = new ezyi("streaming-apply", this.j().a());
                    goto label_146;
                label_120:
                    fagi fagi1 = new fagi();
                    fagh[] arr_fagh1 = new fagh[1];
                    String s1 = (String)this.c(ezzs.g);
                    arr_fagh1[0] = new fagh(ezzw.g, s1);
                    fagi1.d(arr_fagh1);
                    object0 = new ezyi("streaming-process-package", fagi1.a());
                }
                else if(faas.a(v1)) {
                    File file0 = hrnt.i() ? new File(ccsb.a.d(((String)this.c(ezzs.g)), "payload_metadata.bin")) : new File(((String)this.c(ezzs.g)), "payload_metadata.bin");
                    fagi fagi0 = new fagi();
                    if(file0.exists()) {
                        fagh[] arr_fagh = new fagh[1];
                        String s = file0.getAbsolutePath();
                        arr_fagh[0] = new fagh(ezyv.i, s);
                        fagi0.d(arr_fagh);
                    }
                    object0 = new ezyi("ab-reboot", fagi0.a());
                }
                else if(v1 == 9) {
                    double f2 = this.y.a();
                    this.r.u(0x106, f2);
                    object0 = this.i();
                }
                else {
                    this.r.u(1042, -1.0);
                    object0 = ezzr.a(this.n, true);
                }
                goto label_146;
            }
            catch(RuntimeException runtimeException0) {
            }
        label_130:
            if(!(runtimeException0.getCause() instanceof RemoteException)) {
                throw runtimeException0;
            }
            ezzs.i.g("Failed to apply payload due to UpdateEngine RemoteException.", runtimeException0, new Object[0]);
            this.r.u(1042, -1.0);
            object0 = ezzr.a(this.n, true);
        }
        catch(Throwable throwable1) {
            goto label_141;
        }
        try {
            this.p.d();
            this.s.c();
            if(hwcb.f()) {
                this.q.k();
                goto label_155;
            label_141:
                this.p.d();
                this.s.c();
                if(hwcb.f()) {
                    this.q.k();
                }
                throw throwable1;
            label_146:
                this.p.d();
                this.s.c();
                if(hwcb.f()) {
                    this.q.k();
                }
            }
        }
        catch(Throwable throwable0) {
        label_152:
            gfsx gfsx5 = gfsx.m("streaming-apply Finished Execution");
            this.w.b(gfsx5);
            throw throwable0;
        }
    label_155:
        gfsx gfsx6 = gfsx.m("streaming-apply Finished Execution");
        this.w.b(gfsx6);
        return (ezyi)object0;
    }

    @Override  // ezyj
    public final void d() {
        super.d();
        gfsx gfsx0 = (gfsx)this.A.getAndSet(gfqx.a);
        if(gfsx0.i()) {
            ((ezzz)gfsx0.d()).a();
        }
        this.x.set(true);
        ezzs.i.d("Requesting update engine to reset.", new Object[0]);
        gfsx gfsx1 = (gfsx)this.z.get();
        if(gfsx1.i()) {
            try {
                ((faar)gfsx1.d()).d();
            }
            catch(InterruptedException interruptedException0) {
                ezzs.i.g("Reset operation interrupted.", interruptedException0, new Object[0]);
            }
        }
    }

    @Override  // ezyj
    public final boolean e(int v) {
        int v1;
        try {
            v1 = this.h().a;
        }
        catch(ezwa ezwa0) {
            ezzs.i.g("Unable to continue due to invalid config.", ezwa0, new Object[0]);
            return true;
        }
        if(v1 != 2 && v1 != 273) {
            ezzs.i.h("Maybe stop update engine for delay status: 0x%03X", new Object[]{v1});
            this.g();
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
            this.E = true;
            f *= f1;
        }
        else if(v == 5) {
            if(this.E) {
                f = f * (1.0f - f1) + f1;
            }
            v = 5;
        }
        this.y.b(((double)f));
        this.h.set(z);
        int v2 = 273;
        if(hwai.c()) {
            if(v == 4) {
                this.C.set(785);
            }
            else {
                this.C.set(529);
            }
            ezxs ezxs0 = this.r;
            if(z) {
                v2 = this.C.get();
            }
            ezxs0.u(v2, ((double)f));
        }
        else {
            ezxs ezxs1 = this.r;
            if(z) {
                v2 = 529;
            }
            ezxs1.u(v2, ((double)f));
        }
        if(z) {
            ezxs ezxs2 = this.r;
            if(!ezxs2.b().I) {
                ezxs2.k();
            }
        }
        this.r.x(v, v1);
        if(v == 5 && hwdg.c() && this.B.compareAndSet(true, false)) {
            gfsx gfsx0 = (gfsx)this.D.get();
            if(gfsx0.i()) {
                ezzs.i.h("Releasing stream-apply wakelock before post-install", new Object[0]);
                ((esaa)gfsx0.d()).g();
            }
        }
    }

    public final void g() {
        if(!this.h.get() || ezwk.a().booleanValue()) {
            gfsx gfsx0 = (gfsx)this.A.getAndSet(gfqx.a);
            if(gfsx0.i()) {
                ((ezzz)gfsx0.d()).a();
            }
            this.x.set(true);
            ezzs.i.d("Requesting update engine to stop.", new Object[0]);
            gfsx gfsx1 = (gfsx)this.z.get();
            if(gfsx1.i()) {
                try {
                    ((faar)gfsx1.d()).f();
                }
                catch(InterruptedException interruptedException0) {
                    ezzs.i.g("Stop operation interrupted.", interruptedException0, new Object[0]);
                }
            }
        }
    }

    private final ezwb h() {
        ezxs ezxs0 = this.r;
        SystemUpdateStatus systemUpdateStatus0 = ezxs0.b();
        if(!this.h.get()) {
            gfsx gfsx0 = this.w.a();
            ezwb ezwb0 = ezwd.a(this.n, gfsx0, systemUpdateStatus0);
            if(ezwb0.a != 2) {
                return ezwb0;
            }
        }
        long v = ezxs0.a();
        long v1 = this.q.c();
        return ezwq.c(this.n, systemUpdateStatus0, v, v1);
    }

    private final ezyi i() {
        int v = (int)(((Integer)this.c(ezzs.j)));
        fagi fagi0 = this.j();
        fagi0.e(ezzs.j, Integer.valueOf(v + 1));
        fagj fagj0 = fagi0.a();
        ezzb ezzb0 = new ezzb();
        ezzb0.f(hvzt.d(), ezwi.d().longValue());
        ezzb0.g(hvzt.b());
        ezzb0.h(v);
        ezzb0.d("streaming-apply", fagj0);
        ezzb0.e(gfsx.m(ezyy.g()));
        return ezzb0.a();
    }

    private final fagi j() {
        fagi fagi0 = this.b().a();
        Double double0 = this.y.a();
        fagi0.e(ezzs.l, double0);
        Boolean boolean0 = Boolean.valueOf(this.h.get());
        fagi0.e(ezzs.k, boolean0);
        return fagi0;
    }

    private final gfsx k() {
        int v1;
        int v;
        ezwb ezwb0;
        ezxs ezxs0 = this.r;
        if(gfta.c(ezxs0.b().a)) {
            ezxs0.u(0, -1.0);
            return gfsx.m(new ezyi("finished-execution", fagj.b(new fagh[0])));
        }
        hlnn hlnn0 = this.u;
        if(ezwr.g(hlnn0)) {
            ezzs.i.h("Unable to stream a brick package. Falling back to non-streaming flow.", new Object[0]);
            return gfsx.m(new ezyi("non-streaming-download", fagj.b(new fagh[0])));
        }
        if(ezwj.a().booleanValue()) {
            ezzs.i.h("Bypassing the self-update check.", new Object[0]);
        }
        else if(ezwr.h(hlnn0)) {
            ezzs.i.f("The package has already been applied; stale checkin?", new Object[0]);
            this.r.u(0, -1.0);
            return gfsx.m(new ezyi("finished-execution", fagj.b(new fagh[0])));
        }
        if(ezwr.i(hlnn0)) {
            ezzs.i.f("The package doesn\'t have a valid timestamp or is unintentionally downgrading.", new Object[0]);
            ezxs0.u(530, -1.0);
            return gfsx.m(new ezyi("finished-execution", fagj.b(new fagh[0])));
        }
        try {
            ezwb0 = this.h();
            v = ezwb0.a;
            v1 = 273;
        }
        catch(ezwa ezwa0) {
            ezzs.i.g("Unable to continue due to invalid config.", ezwa0, new Object[0]);
            this.r.u(786, -1.0);
            return gfsx.m(new ezyi("finished-execution", fagj.b(new fagh[0])));
        }
        if(v != 2 && v != 273) {
            ezxs ezxs1 = this.r;
            ezxs1.u(v, this.y.a());
            if(v == 0x80B) {
                this.s.b();
                v = 0x80B;
            }
            if(v == 275 || v == 0x90B) {
                ezxc ezxc0 = this.p;
                ezxc0.b();
                if(hvxt.c() && ezwc.k(this.n)) {
                    ezxc0.c();
                }
            }
            if(v == 1043 || v == 0xB0B) {
                this.q.n(this.n);
                this.q.j();
            }
            SystemUpdateStatus systemUpdateStatus0 = ezxs1.b();
            this.t.a(systemUpdateStatus0, Long.valueOf(ezwb0.b));
            ezze ezze0 = new ezze();
            ezze0.f(ezwb0.b);
            ezze0.d("streaming-apply", this.b());
            ezze0.g(ezwb0.c);
            gfsx gfsx0 = ezwb0.c ? gfqx.a : gfsx.m(ezyy.g());
            ezze0.e(gfsx0);
            return gfsx.m(ezze0.a());
        }
        if(hwai.c()) {
            ezxs ezxs2 = this.r;
            if(this.h.get()) {
                v1 = this.C.get();
            }
            ezxs2.u(v1, this.y.a());
            return gfqx.a;
        }
        ezxs ezxs3 = this.r;
        if(this.h.get()) {
            v1 = 529;
        }
        ezxs3.u(v1, this.y.a());
        return gfqx.a;
    }
}

