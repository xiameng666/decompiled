import android.text.TextUtils;
import android.util.Log;
import j..util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

public final class fdpy implements fdwx, ffmj {
    public final fdpk a;
    public final fdpk b;
    public final AtomicReference c;
    public final Map d;
    public fetz e;
    private final ExecutorService f;
    private final Map g;
    private final fdul h;

    public fdpy(fdul fdul0) {
        this.c = new AtomicReference();
        this.d = new fdpx(this);
        this.g = new ConcurrentHashMap();
        this.h = fdul0;
        this.f = clhl.b.c(new ffdw(), clhr.b);
        this.a = new fdpk(25);
        this.b = new fdpk(25);
    }

    public final gmcd a() {
        gmcd gmcd1;
        synchronized(this) {
            if(this.e != null && this.e.a()) {
                Log.w("assets", "notifyOnCompletedAssetFetches: Data sync tracking already in progress. Ignoring repeat call.");
                return gmbu.g();
            }
            Map map0 = this.d;
            synchronized(map0) {
                if(map0.isEmpty()) {
                    return gmbx.a;
                }
                gmcd1 = jqy.a(new fdpu(this));
            }
        }
        return gmcd1;
    }

    public final void b(String s, boolean z, fdun fdun0, Set set0) {
        Set set1;
        File file0;
        ((fdpx)this.d).a(s);
        if(z) {
            AtomicReference atomicReference0 = this.c;
            file0 = ((fdvl)atomicReference0.get()).q(s);
            if(file0 == null) {
                Log.w("assets", "onAssetAdded: digest " + s + ", owners=[" + TextUtils.join(",", set0) + "], unable to load asset, ignoring");
                return;
            }
            if(hzvs.a.b().i()) {
                if(Log.isLoggable("assets", 3)) {
                    Log.d("assets", "onAssetAdded: digest " + s + ", initial owner count=" + set0.size());
                }
                set1 = new HashSet(set0);
                set1.addAll(((fdvl)atomicReference0.get()).C(s));
            }
            else {
                set1 = set0;
            }
            fdpy.l(s, file0, set1, "onAssetAdded", this.b);
        }
        else {
            file0 = null;
            set1 = set0;
        }
        if(Log.isLoggable("assets", 3)) {
            Log.d("assets", "onAssetAdded: digest " + s + ", owners=[" + TextUtils.join(",", set1) + "], sending");
        }
        for(Object object0: this.g.values()) {
            fdpq fdpq0 = (fdpq)object0;
            fdwy fdwy0 = fdpq0.d;
            if(fdwy0 == null) {
            }
            else if(fdpq0.d == null || !((fdzb)fdpq0.d).b) {
                if(fdun0 != null) {
                    boolean z1 = set1.isEmpty();
                    for(Object object1: set1) {
                        fduq fduq0 = new fduq(((fdpl)object1));
                        fduq0.b = fdun0;
                        int v = fdwy0.a();
                        if(fdpq0.c.a(fduq0, v, false, fdpq0.b)) {
                            fdwy0 = fdwy0;
                            continue;
                        }
                        else {
                            goto label_46;
                        }
                        break;
                    }
                    if(!z1) {
                        if(!Log.isLoggable("assets", 2)) {
                            continue;
                        }
                        Log.v("assets", "filtering asset for peer:, digest=" + s + ", owners=[" + TextUtils.join(",", set1) + "], path=" + fdun0.b);
                        continue;
                    }
                }
            label_46:
                fdpq0.a(s, file0, set1);
            }
            else if(Log.isLoggable("assets", 2)) {
                String s1 = TextUtils.join(",", set1);
                Log.v("assets", a.ai((fdun0 == null ? "" : " path=" + fdun0.b), s1, s, "filtering asset for btle:, digest=", ", owners=[", "]"));
            }
        }
    }

    public final void c(fdpl fdpl0, String s) {
        if(Log.isLoggable("assets", 3)) {
            Log.d("assets", a.X(fdpl0, s, "onAssetMissing: ", ", "));
        }
        this.m(fdpl0, s, false);
    }

    public final void d(fdpl fdpl0, String s) {
        if(Log.isLoggable("assets", 3)) {
            Log.d("assets", a.X(fdpl0, s, "onAssetPermissionMissing: ", ", "));
        }
        this.m(fdpl0, s, true);
    }

    @Override  // fdwx
    public final void f(String s, ffau ffau0, fdwt fdwt0) {
        fdpq fdpq0 = (fdpq)this.g.get(s);
        if(fdpq0 == null) {
            Log.e("assets", "Received message from a disconnected node. What? Node: " + s);
            return;
        }
        int v = ffau0.b;
        if((v & 1) == 0) {
            if((v & 4) == 0) {
                if((v & 2) != 0) {
                    fdpt fdpt0 = new fdpt(fdpq0, ffau0);
                    this.f.execute(fdpt0);
                }
                return;
            }
            fdps fdps0 = new fdps(this, fdpq0, ffau0);
            this.f.execute(fdps0);
            return;
        }
        fdpr fdpr0 = new fdpr(this, fdpq0, ffau0, fdwt0);
        this.f.execute(fdpr0);
    }

    @Override  // fdwx
    public final void g(String s, fdww fdww0) {
    }

    @Override  // fdwx
    public final void h(fdwy fdwy0, fdww fdww0) {
        Map map0 = this.g;
        String s = ((fdzb)fdwy0).a.a;
        fdpq fdpq0 = (fdpq)map0.get(s);
        if(fdpq0 == null) {
            fdpq fdpq1 = new fdpq(s, this.h);
            map0.put(s, fdpq1);
            fdpq0 = fdpq1;
        }
        fdpq0.d = fdwy0;
        for(Object object0: this.d.values()) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffau.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ffau ffau0 = (ffau)hftp0.b_message;
            ((fezj)object0).getClass();
            ffau0.e = (fezj)object0;
            ffau0.b |= 4;
            fdpq0.b(((ffau)hftp0.N_build()), null);
        }
        for(Object object1: fdpq0.a.values()) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ffau.a).v_newBuilder();
            ProtoLiteBuilder hftp2 = ((fdpp)object1).b;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ffau ffau1 = (ffau)hftp1.b_message;
            ffbx ffbx0 = (ffbx)hftp2.N_build();
            ffbx0.getClass();
            ffau1.c = ffbx0;
            ffau1.b |= 1;
            fdpq0.b(((ffau)hftp1.N_build()), ((fdpp)object1).a);
        }
    }

    @Override  // fdwx
    public final void i(String s) {
        fdpq fdpq0 = (fdpq)this.g.get(s);
        if(fdpq0 == null) {
            return;
        }
        fetz fetz0 = this.e;
        if(fetz0 != null && fetz0.a()) {
            fetz0.c.run();
        }
        fdpq0.d = null;
    }

    @Override  // fdwx
    public final boolean j() {
        return false;
    }

    public static final void k(int v, Set set0, File file0) {
        if(hzxv.e()) {
            boolean z = false;
            String s = new gfss(",").b(fdpy.n(set0, false));
            int v1 = file0 == null ? 0 : ((int)file0.length());
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fdog.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((fdog)hftv0).c = v - 1;
            ((fdog)hftv0).b |= 1;
            if(v == 4) {
                if(v1 == 0) {
                    z = true;
                }
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                fdog fdog0 = (fdog)hftp0.b_message;
                fdog0.b |= 2;
                fdog0.d = z;
            }
            fdnd fdnd0 = fdob.b().c;
            if(fdnd0 != null) {
                fdnd0.e(s, 2, v1, ((fdog)hftp0.N_build()));
            }
        }
    }

    static final void l(String s, File file0, Set set0, String s1, fdpk fdpk0) {
        if(hzvs.c()) {
            String s2 = String.format(Locale.ENGLISH, "digest:%s, size:%d, package(s):%s", s, file0.length(), new gfss(",").b(fdpy.n(set0, true)));
            if(Log.isLoggable("assets", 3)) {
                Log.d("assets", String.format(Locale.ENGLISH, "%s: %s", s1, s2));
            }
            fdpk0.a(s2);
        }
    }

    private final void m(fdpl fdpl0, String s, boolean z) {
        Map map0 = this.d;
        fezj fezj0 = (fezj)map0.get(s);
        if(fezj0 == null) {
        label_5:
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fezj.a).v_newBuilder();
            String s1 = fdpl0.b;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s1.getClass();
            ((fezj)hftv0).b |= 1;
            ((fezj)hftv0).c = s1;
            String s2 = fdpl0.d;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            s2.getClass();
            ((fezj)hftv1).b |= 2;
            ((fezj)hftv1).d = s2;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            s.getClass();
            ((fezj)hftv2).b |= 4;
            ((fezj)hftv2).e = s;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            fezj fezj1 = (fezj)hftp0.b_message;
            fezj1.b |= 8;
            fezj1.f = z;
            fezj fezj2 = (fezj)hftp0.N_build();
            map0.put(s, fezj2);
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ffau.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ffau ffau0 = (ffau)hftp1.b_message;
            fezj2.getClass();
            ffau0.e = fezj2;
            ffau0.b |= 4;
            ffau ffau1 = (ffau)hftp1.N_build();
            if(Log.isLoggable("assets", 3)) {
                Log.d("assets", a.X(fdpl0, s, "Sending FetchAsset message for ", ", "));
            }
            for(Object object0: this.g.values()) {
                ((fdpq)object0).b(ffau1, null);
            }
        }
        else if(fezj0.f && !z) {
            z = false;
            goto label_5;
        }
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        bbpd0.println(a.aj(this.d, "Outstanding Fetches: "));
        for(Object object0: this.d.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            fezj fezj0 = (fezj)((Map.Entry)object0).getValue();
            bbpd0.println("  " + s + ", " + String.format("FetchAsset{%s,%s,permissionCheck=%s}", fezj0.c, fezj0.e, Boolean.valueOf(fezj0.f)));
        }
        if(hzvs.c()) {
            bbpd0.println();
            bbpd0.println("Received assets");
            bbpd0.b();
            bbpd0.println(this.a);
            bbpd0.a();
            bbpd0.println();
            bbpd0.println("Sent assets");
            bbpd0.b();
            bbpd0.println(this.b);
            bbpd0.a();
            bbpd0.println();
        }
        for(Object object1: this.g.values()) {
            ((fdpq)object1).md(bbpd0, z, z1);
        }
        if(this.e != null) {
            bbpd0.println();
            bbpd0.println("Outstanding fetches sync tracking");
            bbpd0.b();
            this.e.md(bbpd0, z, z1);
            bbpd0.a();
        }
    }

    private static final Set n(Set set0, boolean z) {
        Set set1 = new TreeSet();
        for(Object object0: set0) {
            String s = ((fdpl)object0).b;
            if(z) {
                s = ffmr.a(s);
            }
            set1.add(s);
        }
        return set1;
    }
}

