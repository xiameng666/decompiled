import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.chimera.config.ModuleManager.ModuleInfo;
import com.google.android.chimera.config.ModuleManager;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class bwts {
    public final bwwe a;
    public final Context b;
    private final ayud c;
    private final Random d;
    private final faik e;
    private final int f;

    public bwts(Context context0) {
        Random random0 = new Random();
        aytt aytt0 = ayud.n(context0, "ICING");
        if(hubu.a.b().V()) {
            aytt0.d(hlqe.c);
        }
        ayud ayud0 = aytt0.a();
        faik faik0 = faih.a(context0);
        super();
        this.a = new bwwe();
        this.b = context0;
        this.d = random0;
        this.c = ayud0;
        this.e = faik0;
        this.f = bwts.a(context0);
    }

    public static int a(Context context0) {
        ModuleManager.ModuleInfo moduleManager$ModuleInfo0;
        try {
            Iterator iterator0 = ModuleManager.get(context0).getAllModules().iterator();
            do {
                if(!iterator0.hasNext()) {
                    return -1;
                }
                Object object0 = iterator0.next();
                moduleManager$ModuleInfo0 = (ModuleManager.ModuleInfo)object0;
            }
            while(!moduleManager$ModuleInfo0.moduleId.equals("com.google.android.gms.icing"));
        }
        catch(Exception exception0) {
            bwne.g("Failed to set icing module version: %s", exception0);
            return -1;
        }
        return moduleManager$ModuleInfo0.moduleVersion;
    }

    public final ayuc b(String s, glnz glnz0) {
        icyl icyl0 = new icyl();
        ayvm ayvm0 = fhbe.b(this.b, icyl0);
        ayuc ayuc0 = this.c.j(((MessageLite)glnz0), ayvm0);
        ayuc0.m(s);
        return ayuc0;
    }

    public final void c(giuz giuz0) {
        long v = huax.a.g().g();
        if(!this.m(v, false)) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glnz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glnz glnz0 = (glnz)hftp0.b_message;
        giuz0.getClass();
        glnz0.z = giuz0;
        glnz0.b |= 0x40000000;
        if(huae.g()) {
            this.t(hftp0);
            this.a.d(cdef.dJ, 5003, hftp0);
            return;
        }
        this.s(5003, hftp0, v);
    }

    public final void d(String s) {
        long v = huax.c();
        if(!this.m(v, false)) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glnz.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gloa.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gloa gloa0 = (gloa)hftp1.b_message;
        gloa0.b |= 1;
        gloa0.c = s;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glnz glnz0 = (glnz)hftp0.b_message;
        gloa gloa1 = (gloa)hftp1.N_build();
        gloa1.getClass();
        glnz0.e = gloa1;
        glnz0.b |= 1;
        if(!huae.g()) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            glnz glnz1 = (glnz)hftp0.b_message;
            glnz1.b |= 0x80000;
            glnz1.s = v;
            this.r("error", hftp0);
            return;
        }
        this.t(hftp0);
        this.a.c(cdef.dJ, "error", hftp0);
    }

    public final void e(String s, int v, glrq glrq0, glrs glrs0, int v1, Set set0, int v2) {
        long v3 = huax.a.g().a();
        if(!this.m(v3, true)) {
            return;
        }
        gloe gloe0 = (gloe)((ProtoLiteMessage)glof.a).v_newBuilder();
        if(!gloe0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gloe0).ensureMutable();
        }
        glof glof0 = (glof)gloe0.b_message;
        s.getClass();
        glof0.b |= 1;
        glof0.c = s;
        if(!gloe0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gloe0).ensureMutable();
        }
        glof glof1 = (glof)gloe0.b_message;
        glof1.b |= 0x20;
        glof1.h = v;
        if(!gloe0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gloe0).ensureMutable();
        }
        glof glof2 = (glof)gloe0.b_message;
        glof2.d = glrq0.a();
        glof2.b |= 2;
        if(!gloe0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gloe0).ensureMutable();
        }
        glof glof3 = (glof)gloe0.b_message;
        glof3.e = glrs0.a();
        glof3.b |= 4;
        if(!gloe0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gloe0).ensureMutable();
        }
        glof glof4 = (glof)gloe0.b_message;
        glof4.b |= 16;
        glof4.g = v1;
        if(!gloe0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gloe0).ensureMutable();
        }
        glof glof5 = (glof)gloe0.b_message;
        glof5.b |= 0x40;
        glof5.j = v2;
        if(bwvu.g() && set0 != null) {
            gloe0.a(set0);
        }
        try {
            int v4 = this.b.getPackageManager().getPackageInfo(s, 0).versionCode;
            if(!gloe0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gloe0).ensureMutable();
            }
            glof glof6 = (glof)gloe0.b_message;
            glof6.b |= 8;
            glof6.f = v4;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            bwne.g("PackageInfo not found for package: %s", s);
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glnz.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)glog.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        glog glog0 = (glog)hftp1.b_message;
        glof glof7 = (glof)((ProtoLiteBuilder)gloe0).N_build();
        glof7.getClass();
        glog0.c = glof7;
        glog0.b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glnz glnz0 = (glnz)hftp0.b_message;
        glog glog1 = (glog)hftp1.N_build();
        glog1.getClass();
        glnz0.k = glog1;
        glnz0.b |= 0x20;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glnz glnz1 = (glnz)hftp0.b_message;
        glnz1.b |= 0x80000;
        glnz1.s = v3;
        this.r("iapistats", hftp0);
    }

    public final void f(String s, glrw glrw0, glru glru0) {
        long v = huax.a.g().d();
        if(!this.m(v, true)) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glog.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gloh.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        s.getClass();
        ((gloh)hftv0).b |= 1;
        ((gloh)hftv0).c = s;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        gloh gloh0 = (gloh)hftp1.b_message;
        gloh0.d = glrw0.a();
        gloh0.b |= 2;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gloh gloh1 = (gloh)hftp1.b_message;
        gloh1.e = glru0.a();
        gloh1.b |= 4;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glog glog0 = (glog)hftp0.b_message;
        gloh gloh2 = (gloh)hftp1.N_build();
        gloh2.getClass();
        glog0.d = gloh2;
        glog0.b |= 2;
        glog glog1 = (glog)hftp0.N_build();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)glnz.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp2.b_message;
        glog1.getClass();
        ((glnz)hftv1).k = glog1;
        ((glnz)hftv1).b |= 0x20;
        if(!hftv1.isImmutable()) {
            hftp2.ensureMutable();
        }
        glnz glnz0 = (glnz)hftp2.b_message;
        glnz0.b |= 0x80000;
        glnz0.s = v;
        this.r("iapistats", hftp2);
    }

    public final void g(gloj gloj0) {
        long v = huax.a.g().k();
        if(!this.m(v, false)) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glnz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glnz glnz0 = (glnz)hftp0.b_message;
        gloj0.getClass();
        glnz0.o = gloj0;
        glnz0.b |= 0x1000;
        if(huae.g()) {
            this.t(hftp0);
            this.a.d(cdef.dL, 5002, hftp0);
            return;
        }
        this.s(5002, hftp0, v);
    }

    public final void h(glqd glqd0) {
        long v = huax.a.g().p();
        if(!this.m(v, false)) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glnz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glnz glnz0 = (glnz)hftp0.b_message;
        glqd0.getClass();
        glnz0.r = glqd0;
        glnz0.b |= 0x10000;
        if(huae.g()) {
            this.t(hftp0);
            this.a.d(cdef.dL, 2006, hftp0);
            return;
        }
        this.s(2006, hftp0, v);
    }

    public final void i(glob glob0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glnz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glnz glnz0 = (glnz)hftp0.b_message;
        glob0.getClass();
        glnz0.g = glob0;
        glnz0.b |= 4;
        if(huae.g()) {
            this.t(hftp0);
            this.a.c(cdef.dJ, "qstats", hftp0);
            return;
        }
        long v = huax.f();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glnz glnz1 = (glnz)hftp0.b_message;
        glnz1.b |= 0x80000;
        glnz1.s = v;
        this.r("qstats", hftp0);
    }

    public final void j(glro glro0, int v) {
        long v1 = huax.a.g().s();
        bwne.r("Timing: %s = %dms", glro0, Integer.valueOf(v));
        if(!this.m(v1, false)) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glnz.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)glod.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        glod glod0 = (glod)hftp1.b_message;
        glod0.c = glro0.a();
        glod0.b |= 1;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        glod glod1 = (glod)hftp1.b_message;
        glod1.b |= 2;
        glod1.d = v;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glnz glnz0 = (glnz)hftp0.b_message;
        glod glod2 = (glod)hftp1.N_build();
        glod2.getClass();
        glnz0.h = glod2;
        glnz0.b |= 8;
        if(!huae.g()) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            glnz glnz1 = (glnz)hftp0.b_message;
            glnz1.b |= 0x80000;
            glnz1.s = v1;
            this.r("tstats", hftp0);
            return;
        }
        this.t(hftp0);
        this.a.c(cdef.dJ, "tstats", hftp0);
    }

    public final boolean k() {
        return this.m(huax.f(), false);
    }

    public final boolean l() {
        if(huae.g()) {
            return true;
        }
        if(!this.m(huax.c(), false)) {
            return false;
        }
        evql evql0 = this.e.cp();
        try {
            if(!((azui)evrg.o(evql0, 500L, TimeUnit.MILLISECONDS)).q()) {
                bwne.k("Skipping storage state: opt-out");
                return false;
            }
            return true;
        }
        catch(InterruptedException | ExecutionException | TimeoutException exception0) {
            if((exception0 instanceof InterruptedException)) {
                Thread.currentThread().interrupt();
            }
            return false;
        }
    }

    public final boolean m(long v, boolean z) {
        if(huae.g() && !z) {
            return true;
        }
        int v1 = Long.compare(v, 0L);
        if(v1 <= 0) {
            if(v1 < 0) {
                bwne.g("Bad sample interval: %d", Long.valueOf(v));
            }
            return false;
        }
        if(v > 0x7FFFFFFFL) {
            bwne.g("Bad sample interval: %d", Long.valueOf(v));
            return false;
        }
        return this.d.nextInt(((int)v)) == 0;
    }

    public static int n(int v) {
        return (v + 9) / 10 * 10;
    }

    public final ayuc o(int v, glnz glnz0) {
        icyl icyl0 = new icyl();
        ayvm ayvm0 = fhbe.b(this.b, icyl0);
        ayuc ayuc0 = this.c.j(((MessageLite)glnz0), ayvm0);
        ayuc0.k(v - 2);
        return ayuc0;
    }

    public final void p(int v) {
        long v1;
        if(!hubu.n()) {
            v1 = huax.c();
        }
        else if(v - 2 != 6008) {
            v1 = huax.c();
        }
        else {
            v1 = huax.a.g().o();
        }
        if(!this.m(v1, false)) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glnz.a).v_newBuilder();
        if(huae.g()) {
            this.t(hftp0);
            this.a.d((v - 2 == 6008 ? cdef.dK : cdef.dJ), v, hftp0);
            return;
        }
        this.s(v, hftp0, v1);
    }

    public final void q(int v, glnu glnu0) {
        long v1 = huax.c();
        if(!this.m(v1, false)) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glnz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glnz glnz0 = (glnz)hftp0.b_message;
        glnu0.getClass();
        glnz0.l = glnu0;
        glnz0.b |= 0x40;
        if(huae.g()) {
            this.t(hftp0);
            this.a.d(cdef.dJ, v, hftp0);
            return;
        }
        this.s(v, hftp0, v1);
    }

    @Deprecated
    public final void r(String s, ProtoLiteBuilder hftp0) {
        this.t(hftp0);
        glnz glnz0 = (glnz)hftp0.N_build();
        if(!hubu.d()) {
            this.b(s, glnz0).d();
            return;
        }
        this.e.cp().b(new bwtr(this, s, glnz0));
    }

    public final void s(int v, ProtoLiteBuilder hftp0, long v1) {
        glnz glnz0 = this.w(hftp0, v1);
        if(!hubu.d()) {
            this.o(v, glnz0).d();
            return;
        }
        this.e.cp().b(new bwtp(this, v, glnz0));
    }

    public final void t(ProtoLiteBuilder hftp0) {
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)glny.a).v_newBuilder();
        boolean z = bwto.a(this.b);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        glny glny0 = (glny)hftp1.b_message;
        glny0.b |= 1;
        glny0.c = z;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glnz glnz0 = (glnz)hftp0.b_message;
        glny glny1 = (glny)hftp1.N_build();
        glny1.getClass();
        glnz0.C = glny1;
        glnz0.c |= 0x80;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)glne.a).v_newBuilder();
        int v = this.f;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        glne glne0 = (glne)hftp2.b_message;
        glne0.b |= 1;
        glne0.c = v;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glnz glnz1 = (glnz)hftp0.b_message;
        glne glne1 = (glne)hftp2.N_build();
        glne1.getClass();
        glnz1.I = glne1;
        glnz1.c |= 0x80000;
    }

    public final void u(glnj glnj0) {
        if(!this.m(huax.c(), false)) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glnz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glnz glnz0 = (glnz)hftp0.b_message;
        glnj0.getClass();
        glnz0.Y = glnj0;
        glnz0.d |= 0x10000;
        this.t(hftp0);
        this.a.d(cdef.dJ, 21002, hftp0);
    }

    public final void v(glnn glnn0) {
        long v = huax.a.g().f();
        if(!this.m(v, false)) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glnz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glnz glnz0 = (glnz)hftp0.b_message;
        glnn0.getClass();
        glnz0.v = glnn0;
        glnz0.b |= 0x4000000;
        if(huae.g()) {
            cdef cdef0 = cdef.dJ;
            this.t(hftp0);
            cdgi cdgi0 = new cdgi(null);
            cdgi0.a(Integer.valueOf(1));
            long v1 = (long)this.a.b(cdef0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            glnz glnz1 = (glnz)hftp0.b_message;
            glnz1.b |= 0x80000;
            glnz1.s = v1;
            glnz glnz2 = (glnz)hftp0.N_build();
            cczb cczb0 = bwwe.a(cdef0).l(glnz2);
            cczb0.c = (int)14001;
            cczb0.d = cdgi0;
            cczb0.a();
            return;
        }
        glnz glnz3 = this.w(hftp0, v);
        if(!hubu.d()) {
            ayuc ayuc0 = this.o(14003, glnz3);
            ayuc0.j(1);
            ayuc0.d();
            return;
        }
        this.e.cp().b(new bwtq(this, glnz3));
    }

    private final glnz w(ProtoLiteBuilder hftp0, long v) {
        this.t(hftp0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glnz glnz0 = (glnz)hftp0.b_message;
        glnz0.b |= 0x80000;
        glnz0.s = v;
        return (glnz)hftp0.N_build();
    }
}

