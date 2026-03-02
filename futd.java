import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import j..util.DesugarCollections;
import j..util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

public final class futd implements fuut, fuvt, fuzr, fvtn, fwxs, fwyn, fwzw, fyaq {
    public fuww A;
    public final fusr B;
    public final fusr C;
    public int D;
    public final Queue E;
    public long F;
    public long G;
    public long H;
    public long I;
    public final futp J;
    public Map K;
    public fuuq L;
    public boolean M;
    public boolean N;
    public boolean O;
    public long P;
    public fvsx Q;
    public long R;
    public long S;
    public long T;
    public long U;
    public long V;
    public final List W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public static volatile boolean a;
    public long aa;
    public final fwyu ab;
    public fwvh ac;
    public fuzc ad;
    public final fvsn ae;
    public final fwvq af;
    private static final gged_interceptors ag;
    private static final int[] ah;
    private final fyar ai;
    private final fwyi aj;
    private boolean ak;
    private final fwyx al;
    private Map am;
    private fuzj an;
    private final Queue ao;
    private long ap;
    public final fwxt b;
    public final futh c;
    public final fwyd d;
    public final fvwz e;
    public final fwyk f;
    public final fwzm g;
    public final fwzp h;
    public final futa i;
    public final futc j;
    public fuuz k;
    public fuvb l;
    public final fuuw m;
    public fvsx n;
    public ActivityRecognitionResult o;
    public fvuu p;
    public long q;
    public final futt r;
    public final fwzt s;
    public final fwzt t;
    public final fwyt u;
    public List v;
    public final Map w;
    public final fuvw x;
    public boolean y;
    public final futz z;

    static {
        futd.ag = gged_interceptors.o("angler", "bullhead", "marlin", "sailfish");
        futd.a = false;
        futd.ah = new int[]{0, 1, 2, 3, 4, 7, 8, 16, 17};
    }

    public futd(futh futh0, fwxt fwxt0, fyar fyar0, fwyd fwyd0, fwyi fwyi0, fvwz fvwz0, fwyk fwyk0, fwzm fwzm0, fwzp fwzp0, fwzt fwzt0, fwzt fwzt1, fwvq fwvq0, fwyt fwyt0, fvto fvto0) {
        File file1;
        fuuu fuuu0;
        futd futd1;
        ByteBuffer byteBuffer6;
        ByteBuffer byteBuffer5;
        ByteBuffer byteBuffer4;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer1;
        boolean z3;
        futd futd0;
        this.k = null;
        this.ak = true;
        this.n = null;
        this.o = null;
        this.p = fuvj.a;
        this.q = -1L;
        this.v = new ArrayList();
        this.w = new HashMap();
        this.y = false;
        this.ac = null;
        this.am = Collections.EMPTY_MAP;
        this.B = new fuvc();
        this.C = new fuum();
        this.D = 0;
        this.ao = new PriorityQueue();
        this.E = new PriorityQueue();
        this.F = 0x7FFFFFFFFFFFFFFFL;
        this.G = 0L;
        this.H = 0x7FFFFFFFFFFFFFFFL;
        this.ap = 0x7FFFFFFFFFFFFFFFL;
        this.I = 0x7FFFFFFFFFFFFFFFL;
        this.K = new ConcurrentHashMap();
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = 0x7FFFFFFFFFFFFFFFL;
        this.Q = null;
        this.R = -1L;
        this.S = -1L;
        this.T = -1L;
        this.U = -1L;
        this.V = -1L;
        this.W = new ArrayList();
        this.Y = false;
        this.Z = false;
        this.aa = -1L;
        this.b = fwxt0;
        this.c = futh0;
        this.ai = fyar0;
        this.d = fwyd0;
        this.aj = fwyi0;
        this.e = fvwz0;
        this.f = fwyk0;
        this.g = fwzm0;
        this.h = fwzp0;
        this.J = new futp();
        boolean z = hupk.g();
        ByteBuffer byteBuffer0 = null;
        if(z && ((long)fwyt0.a()) >= huou.b()) {
            try {
                byteBuffer0 = fwyk0.l(fuwu.e);
            }
            catch(IOException unused_ex) {
            }
        }
        fwyw fwyw0 = new fwyw(humr.g(), huou.a.c().u(), huou.a.c().h(), huou.a.c().e(), ((int)humv.a.d().x()), ((int)humv.a.d().y()), ((int)humv.a.d().D()), ((int)humv.a.d().E()), ((int)humf.a.b().b()));
        if(byteBuffer0 == null) {
            futd0 = this;
            futd0.al = new fwyx(fwyd0, this, new fuuu(this, this), fuuu.class, fwyw0);
        }
        else {
            this.al = new fwyx(fwyd0, this, new futs(byteBuffer0, ((int)hupk.b()), hupk.e()), futs.class, fwyw0);
            futd0 = this;
        }
        humi.a.c().e();
        humi.d();
        humi.d();
        futd0.ab = null;
        boolean z1 = hupk.f();
        boolean z2 = hupk.a.d().p();
        Class class0 = fuwj.class;
        try {
            z3 = hupk.i();
        }
        catch(IOException unused_ex) {
            byteBuffer1 = null;
            byteBuffer2 = null;
            byteBuffer3 = null;
            byteBuffer4 = null;
            z3 = false;
            byteBuffer6 = null;
            goto label_117;
        }
        if(z1) {
            try {
                class0 = fuwk.class;
                byteBuffer2 = fwyk0.l((z1 ? fuwu.c : fuwu.a));
                goto label_84;
            }
            catch(IOException unused_ex) {
            }
            goto label_79;
        }
        else {
            class0 = fuwq.class;
            byteBuffer2 = fwyk0.l((z1 ? fuwu.c : fuwu.a));
            goto label_84;
        }
        byteBuffer2 = fwyk0.l((z1 ? fuwu.c : fuwu.a));
        goto label_84;
    label_79:
        byteBuffer1 = null;
        byteBuffer2 = null;
        byteBuffer3 = null;
        byteBuffer4 = null;
        byteBuffer6 = null;
        goto label_117;
    label_84:
        if(!z1 && z3) {
            try {
                byteBuffer3 = fwyk0.l(fuwu.b);
            }
            catch(IOException unused_ex) {
                byteBuffer1 = null;
                byteBuffer3 = null;
                byteBuffer4 = null;
                byteBuffer6 = null;
                goto label_117;
            }
        }
        else {
            byteBuffer3 = null;
        }
        if(z2) {
            try {
                byteBuffer1 = fwyk0.l((z1 ? fuwu.a : fuwu.c));
            }
            catch(IOException unused_ex) {
                byteBuffer1 = null;
                byteBuffer4 = null;
                byteBuffer6 = null;
                goto label_117;
            }
        }
        else {
            byteBuffer1 = null;
        }
        if(z) {
            try {
                byteBuffer4 = z1 ? fwyk0.l(fuwu.h) : fwyk0.l(fuwu.f);
            }
            catch(IOException unused_ex) {
                byteBuffer4 = null;
                byteBuffer6 = null;
                goto label_117;
            }
            try {
                byteBuffer5 = z1 ? fwyk0.l(fuwu.i) : fwyk0.l(fuwu.g);
                goto label_116;
            }
            catch(IOException unused_ex) {
            }
            byteBuffer6 = null;
            goto label_117;
        }
        else {
            byteBuffer5 = null;
            byteBuffer4 = null;
        }
    label_116:
        byteBuffer6 = byteBuffer5;
    label_117:
        fuvw fuvw0 = new fuvw(fvto0);
        futd0.x = fuvw0;
        futd0.ad = futd0.J();
        if(byteBuffer4 != null && byteBuffer6 != null) {
            futd1 = this;
            fuuu0 = new fuue(byteBuffer4, hupk.a.d().h(), byteBuffer6, hupk.a.d().j(), hupk.a.d().i(), ((int)hupk.b()), hupk.e(), hupk.f(), hupk.h(), z3);
        }
        else {
            futd1 = this;
            fuuu0 = new fuuu(futd1, futd1);
        }
        futd1.z = new futz(byteBuffer2, byteBuffer3, class0, byteBuffer1, fuuu0, futd1.ad, fuvw0, fvwz0);
        futd1.l = new fuul(futd1);
        futd1.s = fwzt0;
        futd1.t = fwzt1;
        futd1.af = fwvq0;
        futd1.u = fwyt0;
        fuvf fuvf0 = new fuvf();
        if(huwz.o() || huwz.a.h().D()) {
            byte[] arr_b = fwyi0.b();
            File file0 = ((fwvi)fwyk0).a.getFilesDir();
            if(file0 == null) {
                file1 = null;
            }
            else {
                file1 = hrnt.i() ? new File(ccsb.a.b(file0, "nlp_ash")) : new File(file0, "nlp_ash");
            }
            fvur fvur0 = new fvur(arr_b, file1);
            fuyh fuyh0 = new fuyh(huwz.l() && huwz.k());
            fuyh0.g[0] = (int)huwz.b();
            fuyh0.g[1] = (int)huwz.d();
            fuyh0.h[1] = (int)huwz.a.h().h();
            futd1.k = new fuuz(fvwz0, futd1, new fuyj(fuyh0.a, fuyh0.b, fuyh0.c, fuyh0.d, fuyh0.e, fuyh0.f, fuyh0.g, fuyh0.h, fvur0));
        }
        fuuz fuuz0 = futd1.k;
        futd1.i = new futa(fwxt0, fyar0, fwyd0, fvwz0, fuvf0, fuuz0);
        futd1.j = new futc(fwxt0, fyar0, fwyd0, fvwz0, fuvf0, fuuz0);
        futd1.ae = new fvsn(null);
        futd1.m = new fuuw(fvns.d, fwyd0, fwzm0, fvwz0);
        fvur fvur1 = futd1.O();
        try {
            gwvk gwvk0 = (gwvk)fvur1.a(((Parser)((ProtoLiteMessage)gwvk.a).jf(7, null)));
            if(humr.i()) {
                futd1.w(((gwvk0.b & 1) == 0 ? false : gwvk0.c), false);
            }
            else {
                futd1.w(false, false);
            }
        }
        catch(IOException | IllegalArgumentException unused_ex) {
        }
        futd1.r = new futt(futd.a);
        fwzm0.a();
    }

    public final void A(boolean z, boolean z1) {
        long v8;
        boolean z2 = z1;
        Queue queue0 = this.ao;
        long v = this.H;
        long v1 = this.ap;
        long v2 = this.I;
        if(queue0.isEmpty() && this.D == 0) {
            this.H = 0x7FFFFFFFFFFFFFFFL;
            this.ap = 0x7FFFFFFFFFFFFFFFL;
        }
        else if(queue0.isEmpty()) {
            this.H = this.F;
            this.ap = this.G;
        }
        else {
            long v3 = (long)(((Long)queue0.peek()));
            this.H = Math.min(this.F, v3);
            this.ap = humr.a.f().n() ? Math.min(this.ap, v3) : Math.min(this.G, v3);
        }
        long v4 = this.N(this.H);
        this.H = v4;
        long v5 = Math.max(this.ap, v4);
        this.ap = v5;
        if(v5 != 0x7FFFFFFFFFFFFFFFL) {
            long v6 = this.H;
            int v7 = Long.compare(v6, 0L);
            if(v7 != 0) {
                this.ap = v7 == 0 ? 4000L : v6 * Math.min(80L, v5 / v6);
            }
        }
        Queue queue1 = this.E;
        if(queue1.isEmpty()) {
            this.I = 0x7FFFFFFFFFFFFFFFL;
            v8 = 0x7FFFFFFFFFFFFFFFL;
        }
        else {
            v8 = (long)(((Long)queue1.peek()));
            this.I = v8;
        }
        this.I = this.N(v8);
        this.u.h();
        if(this.u.h()) {
            long v9 = humf.a.b().a();
            this.H = humb.c() ? Math.max(v9, this.ap) : Math.max(v9, this.H);
            this.I = Math.max(v9, this.I);
        }
        if(this.G()) {
            this.H = Math.min(this.H, huwz.g());
        }
        this.c();
        if(this.c() != 0x7FFFFFFFFFFFFFFFL) {
            if(z) {
                this.l.x(z2);
            }
        }
        else if(this.am.isEmpty() && !humr.a.f().o()) {
            this.l.K();
        }
        long v10 = this.H;
        if(v == v10 && v1 == this.ap && v2 == this.I) {
            if(z2) {
                z2 = true;
                goto label_62;
            }
            return;
        }
    label_62:
        long v11 = this.ap;
        long v12 = this.I;
        futf futf0 = new futf(this.e.f(), Long.toHexString(v11), ((int)v10), ((int)v12), ((int)z2), v10, v11, v12, z2);
        this.e.a(futf0);
    }

    final void B(boolean z) {
        if(!z && this.ak && !this.M) {
            humr humr0 = humr.a;
            long v = humr0.f().g();
            int v1 = 0;
            int v2 = Long.compare(this.c(), v) <= 0 ? 1 : 0;
            if(this.a() <= v) {
                v1 = 1;
            }
            if(this.u.h()) {
                v2 = v1;
            }
            if(v2 != 0) {
                fuuw fuuw0 = this.m;
                if(fuuw0.a && fuuw0.h == 2500 || !fuuw0.e) {
                    return;
                }
                fuuw0.h = 2500;
                fvns fvns0 = fuuw0.d;
                fybc fybc0 = new fybc("ActivityScheduler");
                fvkx fvkx0 = fvkx.a(((fwvo)fuuw0.c).e, ((fwvn)((fwvo)fuuw0.c).b).k, fybc0);
                gftb.check(fvkx0);
                fvkx0.i = humr0.f().f();
                boolean z1 = fvkx0.e("ActivityDetectionScheduler", fvns0, 1, 2500);
                fuuw0.a = z1;
                if(z1) {
                    fuuw0.g = SystemClock.elapsedRealtime();
                    fuuw0.i = 1;
                    fuuw0.f.k(70, 1, Integer.numberOfTrailingZeros(fvns0.z), 1);
                }
                return;
            }
        }
        this.m.a();
    }

    final boolean C() {
        return futd.a && !this.I() && !this.M();
    }

    public final boolean D() {
        fwyo fwyo0 = new fwyo(this.am);
        return this.u.g(fwyo0);
    }

    public final boolean E() {
        return !this.O && this.N;
    }

    public final boolean F() {
        return this.y && huwz.o();
    }

    public final boolean G() {
        return this.F() ? this.ac == null || !this.ac.c() : false;
    }

    @Override  // fuzr
    public final boolean H() {
        fwyt fwyt0 = this.u;
        if(!fwyt0.f()) {
            return false;
        }
        return futd.ag.contains(Build.DEVICE) ? ((long)fwyt0.a()) >= huou.a.c().j() : ((long)fwyt0.a()) >= huou.a.c().i();
    }

    public final boolean I() {
        fwvh fwvh0 = this.ac;
        if(fwvh0 != null) {
            fwvh0.b();
        }
        if(this.G()) {
            long v = SystemClock.elapsedRealtime() - this.V;
            long v1 = huwz.a.h().u();
            return v >= this.b() - (this.z.a / 1000000L + 1500L + v1);
        }
        return false;
    }

    public final fuzc J() {
        if(huvr.c() && this.Y) {
            fuzc fuzc0 = this.ad;
            if(fuzc0 != null) {
                return fuzc0;
            }
            this.e.g(0x7D);
            return new fuzc(fuzd.a());
        }
        return null;
    }

    @Override  // fvtn
    public final void K(boolean z, int v) {
        if(v == 1) {
            this.l.T();
        }
    }

    @Override  // fuvt
    public final void L(boolean z, boolean z1) {
        this.Z = z;
    }

    public final boolean M() {
        return this.K.containsKey(Integer.valueOf(9));
    }

    private final long N(long v) {
        return this.E() ? Math.max(humr.a.f().c(), v) : v;
    }

    private final fvur O() {
        byte[] arr_b = this.aj.b();
        File file0 = ((fwvi)this.f).a.getFilesDir();
        if(file0 == null) {
            return new fvur(arr_b, null);
        }
        return hrnt.i() ? new fvur(arr_b, new File(ccsb.a.b(file0, "nlp_acd"))) : new fvur(arr_b, new File(file0, "nlp_acd"));
    }

    final long a() {
        Integer integer0 = (int)9;
        return this.K.containsKey(integer0) ? this.N(((Long)this.K.get(integer0)).longValue()) : 0x7FFFFFFFFFFFFFFFL;
    }

    final long b() {
        return this.y ? this.N(huwz.g()) : 0x7FFFFFFFFFFFFFFFL;
    }

    final long c() {
        long v = Math.min(this.H, this.I);
        for(Object object0: this.K.values()) {
            long v1 = (long)(((Long)object0));
            if(v1 < v) {
                v = v1;
            }
        }
        return Math.min(v, this.b());
    }

    public static ActivityRecognitionResult d(ActivityRecognitionResult activityRecognitionResult0, int v) {
        ArrayList arrayList0 = new ArrayList();
        long v1 = activityRecognitionResult0.c;
        long v2 = activityRecognitionResult0.b;
        arrayList0.addAll(activityRecognitionResult0.a);
        Bundle bundle0 = activityRecognitionResult0.b();
        Integer integer0 = (int)4;
        TreeMap treeMap0 = new TreeMap();
        int v3 = 0;
        for(Object object0: arrayList0) {
            DetectedActivity detectedActivity0 = (DetectedActivity)object0;
            integer0.getClass();
            if(detectedActivity0.a() != 4) {
                v3 += detectedActivity0.e;
                treeMap0.put(Integer.valueOf(detectedActivity0.a()), Integer.valueOf(detectedActivity0.e));
            }
        }
        List list0 = fust.a(treeMap0, ((double)v3) / 50.0, false);
        integer0.getClass();
        list0.add(0, new DetectedActivity(4, 50));
        Collections.sort(list0, fust.a);
        return new ActivityRecognitionResult(list0, v2, v1, v, bundle0);
    }

    @Override  // fyaq
    public final ActivityRecognitionResult e(ActivityRecognitionResult activityRecognitionResult0) {
        int v = activityRecognitionResult0.d().a();
        return this.p == null || activityRecognitionResult0.c - this.q >= 90000L || !(this.p.a >= 0.7) || this.p.b != 1 || v != 0 && v != 1 && v != 2 || v == 2 ? activityRecognitionResult0 : futd.d(activityRecognitionResult0, activityRecognitionResult0.d);
    }

    public final fuzj f() {
        if(this.F() && this.an == null) {
            try {
                this.an = new fuzj(this.f);
            }
            catch(IOException unused_ex) {
            }
        }
        return this.an;
    }

    @Override  // fwxs
    public final void g(long v, boolean z) {
        this.ao.add(Long.valueOf(v));
        this.A(true, z);
    }

    final void h() {
        if(this.n != null) {
            this.h.b(fwzf.i);
            this.n = null;
        }
    }

    protected final void i() {
        if(!this.M() && this.L != null) {
            this.L = null;
        }
    }

    final void j(ActivityRecognitionResult activityRecognitionResult0) {
        for(Object object0: this.v) {
            fuvm fuvm0 = (fuvm)object0;
            if(fuvs.e(activityRecognitionResult0)) {
                int v = fuvm0.a + 1;
                fuvm0.a = v;
                if(v <= 1) {
                    continue;
                }
                fuvm0.d.c(fuvm0.c);
            }
            else {
                if(!fuvs.d(activityRecognitionResult0)) {
                    continue;
                }
                int v1 = fuvm0.b + 1;
                fuvm0.b = v1;
                if(v1 <= 2) {
                    continue;
                }
                fuvl fuvl0 = new fuvl(fuvm0.d, fuvm0.c);
                fuvm0.d.a(fuvl0);
            }
        }
    }

    @Override  // fwyn
    public final void k(int v) {
        this.al.l = v;
    }

    @Override  // fwyn
    public final void l() {
        fwyx fwyx0 = this.al;
        fwyx0.i = SystemClock.elapsedRealtime();
        fwyx0.j = fwyx0.d.c();
        fwyx fwyx1 = new fwyx(fwyx0);
        List list0 = fwyx1.c();
        if(!list0.isEmpty()) {
            for(Object object0: list0) {
                this.j(((ActivityRecognitionResult)object0));
            }
        }
        this.t(fwyx1);
        long v = SystemClock.elapsedRealtime();
        this.R = v;
        this.S = v;
        this.l.O();
        fwyx0.e.clear();
        fwyx0.i = -1L;
        fwyx0.j = -1L;
        fwyx0.k = -1L;
        TreeMap treeMap0 = fwyx0.g;
        if(!treeMap0.isEmpty()) {
            Map.Entry map$Entry0 = treeMap0.lastEntry();
            gftb.check(map$Entry0);
            treeMap0.clear();
            treeMap0.put(((Long)map$Entry0.getKey()), ((List)map$Entry0.getValue()));
        }
    }

    @Override  // fwyn
    public final void m(List list0, int[] arr_v) {
        List list1 = list0;
        fwyx fwyx0 = this.al;
        fwyw fwyw0 = fwyx0.h;
        if(fwyw0.b) {
            int v = -1;
            int v1 = -1;
            for(int v2 = 0; v2 < arr_v.length; ++v2) {
                int v3 = arr_v[v2];
                if(v3 == 1) {
                    v = v2;
                }
                else if(v3 == 4) {
                    v1 = v2;
                }
            }
            if(!list1.isEmpty() && v != -1 && v1 != -1) {
                HashSet hashSet0 = new HashSet();
                int v4 = 0;
                int v5 = 0;
                int v6 = 0;
                while(v4 < list1.size()) {
                    float[] arr_f = ((fwyp)list1.get(v4)).b;
                    int v7 = 0;
                    for(int v8 = 0; v8 < arr_f.length; ++v8) {
                        float f = arr_f[v8];
                        if((f > 0.0f)) {
                            int v9 = Math.round(f * 100.0f);
                            int v10 = arr_v[v8];
                            if(v9 > v7) {
                                v7 = v9;
                            }
                            if(v9 >= ((int)fwyw0.e)) {
                                switch(arr_v[v8]) {
                                    case 7: 
                                    case 8: {
                                        ++v5;
                                        continue;
                                    }
                                }
                            }
                            if(v9 >= ((int)fwyw0.g)) {
                                int v11 = arr_v[v8];
                                if(v11 == 16 || (v11 == 0 || v11 == 17)) {
                                    ++v6;
                                }
                            }
                        }
                    }
                    if(Math.round(arr_f[v] * 100.0f) >= v7) {
                        hashSet0.add(Integer.valueOf(v4));
                    }
                    ++v4;
                }
                if(v5 < ((int)fwyw0.f) && v6 < ((int)fwyw0.h)) {
                    hashSet0 = null;
                }
                if(hashSet0 != null && !hashSet0.isEmpty()) {
                    ArrayList arrayList0 = new ArrayList(list1.size());
                    for(int v12 = 0; v12 < list1.size(); ++v12) {
                        fwyp fwyp0 = (fwyp)list1.get(v12);
                        if(hashSet0.contains(Integer.valueOf(v12))) {
                            float f1 = fwyp0.b[v];
                            fwyp0.b[v] = fwyp0.b[v1];
                            fwyp0.b[v1] = f1;
                            arrayList0.add(new fwyp(fwyp0.a, fwyp0.b));
                        }
                        else {
                            arrayList0.add(fwyp0);
                        }
                    }
                    list1 = arrayList0;
                }
            }
        }
        for(Object object0: list1) {
            fwyp fwyp1 = (fwyp)object0;
            float[] arr_f1 = fwyp1.b;
            if(arr_f1.length == arr_v.length) {
                ArrayList arrayList1 = new ArrayList();
                int v14 = 0;
                int v15 = 0;
                for(int v13 = 0; v13 < arr_f1.length; ++v13) {
                    float f2 = arr_f1[v13];
                    if((f2 > 0.0f)) {
                        int v16 = Math.round(f2 * 100.0f);
                        int v17 = arr_v[v13];
                        if(v17 == 7 || v17 == 8) {
                            v14 = fwyx0.l == fuxl.N.am || (fwyx0.l == fuxl.O.am || fwyx0.l == fuxl.P.am) ? Math.max(v14, v16) : v14 + v16;
                        }
                        else if(v17 == 16 || v17 == 17) {
                            if(fwyx0.l != fuxl.N.am && (fwyx0.l != fuxl.O.am && fwyx0.l != fuxl.P.am)) {
                                v15 += v16;
                            }
                            else {
                                v15 = Math.max(v15, v16);
                            }
                        }
                        arrayList1.add(new DetectedActivity(arr_v[v13], v16));
                    }
                }
                if(v14 > 0) {
                    arrayList1.add(new DetectedActivity(2, v14));
                }
                if(v15 > 0) {
                    arrayList1.add(new DetectedActivity(0, v15));
                }
                if(arrayList1.isEmpty()) {
                    arrayList1.add(new DetectedActivity(4, 100));
                }
                Collections.sort(arrayList1, DetectedActivity.a);
                fwyx0.g.put(Long.valueOf(fwyp1.a), arrayList1);
                fwyx0.k = SystemClock.elapsedRealtime();
                Arrays.toString(arr_f1);
            }
        }
    }

    @Override  // fwyn
    public final void n(List list0) {
        if(this.u.i()) {
            fwyx fwyx0 = this.al;
            for(Object object0: list0) {
                fwyq fwyq0 = (fwyq)object0;
                if(fwyq0.c == 0) {
                    long v = fwyq0.a;
                    int v1 = fwyq0.b;
                    if(v1 == 5) {
                        fwyx0.e.i(v);
                    }
                    else {
                        HashSet hashSet0 = fwyx0.f;
                        if(hashSet0.add(Integer.valueOf(v1))) {
                            List list1 = DesugarCollections.unmodifiableList(fwyx0.g(hashSet0));
                            fwyx0.g.put(Long.valueOf(v), list1);
                        }
                    }
                }
                else {
                    long v2 = fwyq0.a;
                    int v3 = fwyq0.b;
                    if(v3 != 5) {
                        HashSet hashSet1 = fwyx0.f;
                        if(hashSet1.remove(Integer.valueOf(v3))) {
                            List list2 = DesugarCollections.unmodifiableList(fwyx0.g(hashSet1));
                            fwyx0.g.put(Long.valueOf(v2), list2);
                        }
                    }
                }
                fwyx0.k = SystemClock.elapsedRealtime();
            }
        }
    }

    @Override  // fwyn
    public final void o(fwys fwys0) {
        if(fwys0 == null) {
            return;
        }
        fwyx fwyx0 = this.al;
        if(fwyx0.m != -1L) {
            fwyx0.n = TimeUnit.MILLISECONDS.toSeconds(fwys0.a - fwyx0.m);
        }
        fwyx0.m = fwys0.a;
    }

    @Override  // fwyn
    public final void p(fwyr fwyr0) {
    }

    @Override  // fwzw
    public final void q() {
        long v = SystemClock.elapsedRealtime();
        ActivityRecognitionResult activityRecognitionResult0 = new ActivityRecognitionResult(new DetectedActivity(5, 100), this.d.c(), v, fuxl.t.am, null);
        this.j(activityRecognitionResult0);
        this.s(activityRecognitionResult0);
        this.S = v;
        this.l.Q();
    }

    @Override  // fwxs
    public final void r(long v) {
        this.ao.remove(Long.valueOf(v));
        this.A(false, false);
    }

    final void s(ActivityRecognitionResult activityRecognitionResult0) {
        this.t(new fvus(activityRecognitionResult0));
    }

    final void t(fvsr fvsr0) {
        boolean z2;
        boolean z;
        int v21;
        long v19;
        int v18;
        long v5;
        for(Object object0: fvsr0.c()) {
            ActivityRecognitionResult activityRecognitionResult0 = (ActivityRecognitionResult)object0;
            fusy.b(this.e, activityRecognitionResult0, true);
            this.o = activityRecognitionResult0;
            int v = activityRecognitionResult0.d().a();
            int[] arr_v = futd.ah;
            int v1 = Arrays.binarySearch(arr_v, v);
            if(v1 >= 0) {
                int v2 = arr_v[v1];
            }
            fuuq fuuq0 = this.L;
            if(fuuq0 != null && v == 0) {
                long v3 = activityRecognitionResult0.c;
                fuup fuup0 = fuuq0.f;
                fuup0.a(v3);
                fuup0.d = v3;
                if(fuup0.c == -1L) {
                    fuup0.c = v3;
                }
                ++fuup0.a;
            }
            fvsn fvsn0 = this.ae;
            DetectedActivity detectedActivity0 = activityRecognitionResult0.d();
            long v4 = activityRecognitionResult0.c;
            if(v4 - fvsn0.c < 600000L) {
                v5 = v4;
            }
            else {
                fvsn0.c = v4;
                int v6 = fvsn0.a.size();
                int v7 = 0;
                while(true) {
                    if(v7 < v6) {
                        v5 = v4;
                        if(((fuus)fvsn0.a.get(v7)).b < -3600000L + v4) {
                            ++v7;
                            v4 = v5;
                            continue;
                        }
                        else {
                            break;
                        }
                    }
                    v5 = v4;
                    break;
                }
                if(v7 > 0) {
                    fvsn0.a.subList(0, v7).clear();
                }
            }
            int v8 = detectedActivity0.a();
            if(v8 != 4 && v8 != 5) {
                long v9 = v5;
                fuus fuus0 = new fuus(v8, v9);
                fvsn0.a.add(fuus0);
                if(!fvsn0.a.isEmpty()) {
                    ArrayList arrayList0 = fvsn0.a;
                    ArrayList arrayList1 = new ArrayList();
                    fuus fuus1 = (fuus)arrayList0.get(0);
                    long v10 = 0L;
                    int v11 = 1;
                    while(v11 < arrayList0.size()) {
                        fuus fuus2 = (fuus)arrayList0.get(v11);
                        fuus fuus3 = (fuus)arrayList0.get(v11 - 1);
                        fuus fuus4 = fuus2;
                        long v12 = fuus2.b - fuus3.b;
                        if(v12 > 420000L) {
                            arrayList1.add(fvsn.d(fuus1, v10, fuus3, 210000L));
                            v10 = 210000L;
                            fuus1 = fuus4;
                        }
                        else {
                            int v13 = fuus1.a;
                            if(fuus4.a != v13) {
                                if(v13 == 0) {
                                    fuus fuus5 = (fuus)fvsn0.a.get(v11 - 1);
                                    int v14 = v11;
                                    int v15 = 0;
                                    int v16 = 0;
                                    int v17 = 0;
                                    while(true) {
                                        if(v14 < fvsn0.a.size()) {
                                            fuus fuus6 = (fuus)fvsn0.a.get(v14);
                                            v18 = v11;
                                            v19 = v12;
                                            if(fuus6.b - fuus5.b <= 900000L) {
                                                int v20 = fuus6.a;
                                                switch(v20) {
                                                    case 0: {
                                                        ++v15;
                                                        break;
                                                    }
                                                    case 1: {
                                                        ++v16;
                                                        break;
                                                    }
                                                    case 2: {
                                                        ++v17;
                                                    }
                                                }
                                                if(v20 == 0) {
                                                    break;
                                                }
                                                else {
                                                    ++v14;
                                                    v11 = v18;
                                                    v12 = v19;
                                                    continue;
                                                }
                                            }
                                            else {
                                                break;
                                            }
                                        }
                                        v18 = v11;
                                        v19 = v12;
                                        break;
                                    }
                                    if(v16 != 0 || v17 != 0 || v15 <= 0 && v14 != fvsn0.a.size()) {
                                        v21 = -1;
                                    }
                                    else if(v14 == fvsn0.a.size()) {
                                        v21 = v14 - 1;
                                    }
                                    else {
                                        v21 = v14;
                                    }
                                    if(v21 != -1) {
                                        v11 = v21;
                                        goto label_106;
                                    }
                                }
                                else {
                                    v18 = v11;
                                    v19 = v12;
                                }
                                arrayList1.add(fvsn.d(fuus1, v10, fuus3, v19 - v19 / 2L));
                                v10 = v19 / 2L;
                                fuus1 = fuus4;
                                v11 = v18;
                                goto label_107;
                            }
                        label_106:
                            fuus1 = fuus1;
                        }
                    label_107:
                        ++v11;
                        v9 = v9;
                    }
                    arrayList1.add(fvsn.d(fuus1, v10, ((fuus)arrayList0.get(arrayList0.size() - 1)), 210000L));
                    List list0 = DesugarCollections.unmodifiableList(arrayList1);
                    long v22 = activityRecognitionResult0.b - v9;
                    for(Object object1: list0) {
                        new Date(((fuur)object1).a + v22);
                        new Date(((fuur)object1).b + v22);
                    }
                    fvsn0.b = list0;
                }
            }
        }
        if(fvsr0.e()) {
            if(humr.i()) {
                futt futt0 = this.r;
                long v23 = fvsr0.a();
                if(v23 == -1L) {
                    z = futt0.b();
                }
                else {
                    List list1 = fvsr0.f(Math.max(v23 - 480000L, futt0.d));
                    boolean z1 = futt0.b();
                    Iterator iterator2 = list1.iterator();
                label_131:
                    while(iterator2.hasNext()) {
                        Object object2 = iterator2.next();
                        ActivityRecognitionResult activityRecognitionResult1 = (ActivityRecognitionResult)object2;
                        List list2 = activityRecognitionResult1.a;
                        if(list2.size() == 1) {
                            int v24 = ((DetectedActivity)list2.get(0)).a();
                            int[] arr_v1 = futt.a;
                            int v25 = 0;
                            while(v25 < 2) {
                                if(v24 == arr_v1[v25]) {
                                    z1 = futt0.b();
                                    continue label_131;
                                }
                                ++v25;
                            }
                            if(v24 > 15) {
                                throw new IllegalArgumentException("Unable to handle new activity: " + v24);
                            }
                        }
                        futt0.d = activityRecognitionResult1.c;
                        if(activityRecognitionResult1.a(3) >= 60) {
                            if(futt0.b == null) {
                                futt0.b = activityRecognitionResult1;
                            }
                            futt0.c = activityRecognitionResult1;
                            z1 = true;
                            ++futt0.e;
                            if(futt0.b()) {
                                continue;
                            }
                        }
                        else {
                            int v26 = activityRecognitionResult1.a(3);
                            if(v26 < activityRecognitionResult1.a(0) || v26 < activityRecognitionResult1.a(1) || v26 < activityRecognitionResult1.a(2) || v26 < activityRecognitionResult1.a(4)) {
                                futt0.a();
                            }
                        }
                        z1 = false;
                    }
                    z = z1;
                }
                z2 = z;
            }
            else {
                z2 = false;
            }
            if(futd.a != z2) {
                this.w(z2, true);
            }
        }
        this.c.mN(fvsr0);
    }

    public final void u(long v) {
        this.v(new fvsx(v, 0L));
    }

    final void v(fvsx fvsx0) {
        if(this.n != null && this.n.equals(fvsx0)) {
            return;
        }
        this.n = fvsx0;
        if(this.G()) {
            this.h.l(fwzf.i, fvsx0.a, this.J.c);
            return;
        }
        new Date(fxbi.e() + fvsx0.a);
        this.h.d(fwzf.i, 2, fvsx0.a, fvsx0.b, this.J.c);
    }

    final void w(boolean z, boolean z1) {
        futd.a = z;
        if(z1) {
            fvur fvur0 = this.O();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwvk.a).v_newBuilder();
            boolean z2 = futd.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwvk gwvk0 = (gwvk)hftp0.b_message;
            gwvk0.b |= 1;
            gwvk0.c = z2;
            gwvk gwvk1 = (gwvk)hftp0.N_build();
            try {
                fvur0.b(fvur0.c(((MessageLite)gwvk1)));
            }
            catch(IOException unused_ex) {
            }
        }
        for(Object object0: this.W) {
            ((futm)object0).a(z);
        }
        if(z) {
            this.ai.a("com.google.android.location.activity.DEEP_STILL_MODE_ENABLED");
            this.e.g(61);
            return;
        }
        this.ai.a("com.google.android.location.activity.DEEP_STILL_MODE_DISABLED");
        this.e.g(59);
    }

    protected final void x(long v) {
        fuvb fuvb0 = this.l;
        if((fuvb0 instanceof fuuv)) {
            this.aa = v;
            return;
        }
        fuvb0.getClass();
    }

    @Override  // fuzr
    public final void y(Map map0) {
        if(map0 == null) {
            map0 = Collections.EMPTY_MAP;
        }
        this.am = map0;
        if(!this.u.f()) {
            return;
        }
        this.D();
        if(this.am.isEmpty()) {
            this.A(false, false);
        }
    }

    final void z() {
        this.ak = this.j.v.nextDouble() < this.j.u + this.j.t * (1.0 - this.j.u);
    }
}

