import android.os.Process;
import android.os.SystemClock;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public final class ucy implements Comparable, Runnable, ucs, uqw {
    private Object A;
    private uag B;
    private ubl C;
    private volatile boolean D;
    private boolean E;
    private int F;
    public static final ubb a;
    public final ucu b;
    public final ucv c;
    public final ucw d;
    public txj e;
    public uay f;
    public txn g;
    public int h;
    public int i;
    public udf j;
    public ubc k;
    public int l;
    public boolean m;
    public txl n;
    public Supplier o;
    public uay p;
    public volatile uct q;
    public volatile boolean r;
    public int s;
    public final udk t;
    public udr u;
    private final List v;
    private final uqz w;
    private final kav x;
    private Thread y;
    private uay z;

    static {
        ucy.a = new ubb("glide_thread_priority_override", null, ubb.a);
    }

    public ucy(udk udk0, kav kav0) {
        this.b = new ucu();
        this.v = new ArrayList();
        this.w = new uqz();
        this.c = new ucv();
        this.d = new ucw();
        this.t = udk0;
        this.x = kav0;
    }

    public final void b() {
        this.d.a();
        this.c.a = null;
        this.c.b = null;
        this.c.c = null;
        this.b.c = null;
        this.b.d = null;
        this.b.m = null;
        this.b.g = null;
        this.b.j = null;
        this.b.h = null;
        this.b.n = null;
        this.b.i = null;
        this.b.o = null;
        this.b.a.clear();
        this.b.k = false;
        this.b.b.clear();
        this.b.l = false;
        this.D = false;
        this.e = null;
        this.f = null;
        this.k = null;
        this.g = null;
        this.u = null;
        this.F = 0;
        this.q = null;
        this.y = null;
        this.p = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.r = false;
        this.v.clear();
        this.x.b(this);
    }

    @Override  // ucs
    public final void c(uay uay0, Exception exception0, ubl ubl0, uag uag0) {
        ubl0.e();
        udv udv0 = new udv("Fetching data failed", Collections.singletonList(exception0));
        udv0.b(uay0, uag0, ubl0.a());
        this.v.add(udv0);
        if(Thread.currentThread() != this.y) {
            this.f(2);
            return;
        }
        this.l();
    }

    @Override
    public final int compareTo(Object object0) {
        int v = this.g() - ((ucy)object0).g();
        return v == 0 ? this.l - ((ucy)object0).l : v;
    }

    @Override  // ucs
    public final void d(uay uay0, Object object0, ubl ubl0, uag uag0, uay uay1) {
        this.p = uay0;
        this.A = object0;
        this.C = ubl0;
        this.B = uag0;
        this.z = uay1;
        this.E = uay0 != this.b.d().get(0);
        if(Thread.currentThread() == this.y) {
            this.i();
            return;
        }
        this.f(3);
    }

    public final int e(int v) {
        if(v != 0) {
            switch(v - 1) {
                case 0: {
                    return this.j.b() ? 2 : this.e(2);
                }
                case 1: {
                    return this.j.a() ? 3 : this.e(3);
                }
                default: {
                    switch(v - 1) {
                        case 2: {
                            return this.m ? 6 : 4;
                        }
                        case 3: {
                            break;
                        }
                        default: {
                            if(v - 1 != 5) {
                                throw new IllegalArgumentException("Unrecognized stage: " + ucx.a(v));
                            }
                        }
                    }
                    return 6;
                }
            }
        }
        throw null;
    }

    public final void f(int v) {
        this.s = v;
        this.u.b().execute(this);
    }

    @Override  // uqw
    public final uqz fx() {
        return this.w;
    }

    private final int g() {
        return this.g.ordinal();
    }

    private final uct h() {
        int v = this.F;
        if(v != 0) {
            switch(v - 1) {
                case 1: {
                    return new uec(this.b, this);
                }
                case 2: {
                    return new ucp(this.b.d(), this.b, this);
                }
                case 3: {
                    return new ueh(this.b, this);
                }
                case 5: {
                    return null;
                }
                default: {
                    throw new IllegalStateException("Unrecognized stage: " + ucx.a(v));
                }
            }
        }
        throw null;
    }

    private final void i() {
        ueb ueb5;
        int v9;
        int v8;
        List list4;
        int v6;
        ubf ubf0;
        ucu ucu0;
        ubg ubg1;
        ueb ueb4;
        txj txj0;
        Class class1;
        ubg ubg0;
        Class class0;
        ueb ueb3;
        int v4;
        List list2;
        ucz ucz0;
        int v3;
        ueb ueb2;
        int v2;
        List list1;
        List list0;
        int v1;
        int v;
        ubl ubl1;
        ubn ubn0;
        ubc ubc1;
        udy udy0;
        ueb ueb1;
        uag uag0;
        Object object0;
        ubl ubl0;
        ueb ueb0 = null;
        if(this.n.a(txg.class) && (this.o != null && this.o.get() != null)) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer)this.o.get()).intValue());
            }
            catch(IllegalArgumentException | SecurityException unused_ex) {
                this.o = null;
            }
        }
        try {
            ubl0 = this.C;
            object0 = this.A;
            uag0 = this.B;
            if(object0 == null) {
                ubl0.e();
                ueb1 = null;
                goto label_169;
            }
        }
        catch(udv udv0) {
            goto label_166;
        }
        try {
            SystemClock.elapsedRealtimeNanos();
            udy0 = this.b.b(object0.getClass());
            ubc ubc0 = this.k;
            boolean z = uag0 == uag.d || this.b.q;
            ubb ubb0 = ukj.d;
            Boolean boolean0 = (Boolean)ubc0.b(ubb0);
            if(boolean0 == null) {
            label_21:
                ubc0 = new ubc();
                ubc0.c(this.k);
                ubc0.d(ubb0, Boolean.valueOf(z));
            }
            else if(boolean0.booleanValue() && !z) {
                z = false;
                goto label_21;
            }
            ubc1 = ubc0;
            ubn0 = this.e.a().a(object0);
        }
        catch(Throwable throwable0) {
            ubl1 = ubl0;
            goto label_163;
        }
        try {
            v = this.h;
            v1 = this.i;
            Objects.requireNonNull(this);
            list0 = (List)udy0.a.a();
            uqo.f(list0);
        }
        catch(Throwable throwable1) {
            ubl1 = ubl0;
            goto label_160;
        }
        try {
            list1 = udy0.b;
            v2 = list1.size();
            ueb2 = null;
            v3 = 0;
            while(true) {
            label_43:
                if(v3 >= v2) {
                    goto label_142;
                }
                ucz0 = (ucz)list1.get(v3);
                try {
                    list2 = (List)ucz0.b.a();
                    uqo.f(list2);
                    v4 = v3;
                    goto label_56;
                }
                catch(udv udv1) {
                }
                break;
            }
        }
        catch(Throwable throwable2) {
            ubl1 = ubl0;
            goto label_157;
        }
        ubl1 = ubl0;
        List list3 = list1;
        int v5 = v2;
        v4 = v3;
        ubc ubc2 = ubc1;
        goto label_134;
        try {
        label_56:
            ueb3 = ucz0.a(ubn0, v, v1, ubc1, list2);
            ubc2 = ubc1;
        }
        catch(Throwable throwable3) {
            try {
                ubl1 = ubl0;
                list3 = list1;
                v5 = v2;
                ubc2 = ubc1;
                ucz0.b.b(list2);
                throw throwable3;
            }
            catch(udv udv1) {
                goto label_134;
            }
            catch(Throwable throwable2) {
                goto label_157;
            }
        }
        try {
            ucz0.b.b(list2);
            class0 = ueb3.c().getClass();
            if(uag0 == uag.d) {
                goto label_85;
            }
            else {
                ubg0 = this.b.a(class0);
                class1 = class0;
                txj0 = this.e;
                ubl1 = ubl0;
                goto label_81;
            }
            goto label_90;
        }
        catch(udv udv1) {
        }
        catch(Throwable throwable2) {
            ubl1 = ubl0;
            goto label_157;
        }
        try {
            try {
                ubl1 = ubl0;
                list3 = list1;
                v5 = v2;
            }
            catch(udv udv1) {
            }
            goto label_134;
        label_81:
            list3 = list1;
            try {
                ueb4 = ubg0.b(txj0, ueb3, this.h, this.i);
                ubg1 = ubg0;
                goto label_90;
            label_85:
                class1 = class0;
                ubl1 = ubl0;
                list3 = list1;
                ueb4 = ueb3;
                ubg1 = null;
            label_90:
                if(!ueb3.equals(ueb4)) {
                    ueb3.e();
                }
                ucu0 = this.b;
                if(ucu0.c.a().d.a(ueb4.b()) == null) {
                    v6 = 3;
                    ubf0 = null;
                }
                else {
                    ubf0 = ucu0.c.a().d.a(ueb4.b());
                    if(ubf0 == null) {
                        throw new txr(ueb4.b());
                    }
                    v6 = ubf0.b();
                }
                uay uay0 = this.p;
                list4 = ucu0.e();
                int v7 = list4.size();
                v5 = v2;
                v8 = 0;
                goto label_110;
            }
            catch(udv udv1) {
                try {
                    v5 = v2;
                    goto label_134;
                label_110:
                    while(v8 < v7) {
                        if(!((uhn)list4.get(v8)).a.equals(uay0)) {
                            ++v8;
                            list4 = list4;
                            continue;
                        }
                        v9 = 1;
                        goto label_118;
                    }
                    v9 = 0;
                label_118:
                    if(this.j.d(((boolean)(v9 ^ 1)), uag0, v6)) {
                        if(ubf0 == null) {
                            throw new txr(ueb4.c().getClass());
                        }
                        ued ued0 = v6 - 1 == 0 ? new ucq(this.p, this.f) : new ued(ucu0.h(), this.p, this.f, this.h, this.i, ubg1, class1, this.k);
                        ueb5 = uea.d(ueb4);
                        this.c.a = ued0;
                        this.c.b = ubf0;
                        this.c.c = ueb5;
                    }
                    else {
                        ueb5 = ueb4;
                    }
                    ueb2 = ucz0.a.a(ueb5, ubc2);
                    goto label_135;
                }
                catch(udv udv1) {
                }
            }
        label_134:
            list0.add(udv1);
        }
        catch(Throwable throwable2) {
            goto label_157;
        }
    label_135:
        if(ueb2 == null) {
            try {
                v3 = v4 + 1;
                ubc1 = ubc2;
                ubl0 = ubl1;
                list1 = list3;
                v2 = v5;
                goto label_43;
            label_142:
                ubl1 = ubl0;
            }
            catch(Throwable throwable2) {
                ubl1 = ubl0;
                goto label_157;
            }
        }
        if(ueb2 != null) {
            try {
                udy0.a.b(list0);
            }
            catch(Throwable throwable1) {
                goto label_160;
            }
            try {
                ubn0.b();
            }
            catch(Throwable throwable0) {
                goto label_163;
            }
            try {
                ubl1.e();
                ueb0 = ueb2;
                ueb1 = null;
                goto label_169;
            }
            catch(udv udv0) {
                goto label_166;
            }
        }
        try {
            ArrayList arrayList0 = new ArrayList(list0);
            throw new udv(udy0.c, arrayList0);
        }
        catch(Throwable throwable2) {
        }
        try {
        label_157:
            udy0.a.b(list0);
            throw throwable2;
        }
        catch(Throwable throwable1) {
        }
        try {
        label_160:
            ubn0.b();
            throw throwable1;
        }
        catch(Throwable throwable0) {
        }
        try {
        label_163:
            ubl1.e();
            throw throwable0;
        }
        catch(udv udv0) {
        label_166:
            ueb1 = null;
            udv0.b(this.z, this.B, null);
            this.v.add(udv0);
        }
    label_169:
        if(ueb0 != null) {
            uag uag1 = this.B;
            if((ueb0 instanceof udw)) {
                ((udw)ueb0).d();
            }
            ucv ucv0 = this.c;
            if(ucv0.a()) {
                ueb0 = uea.d(ueb0);
                ueb1 = ueb0;
            }
            if(this.n.a(txg.class)) {
                this.k();
            }
            this.m();
            udr udr0 = this.u;
            synchronized(udr0) {
                udr0.f = ueb0;
                udr0.g = uag1;
                synchronized(udr0) {
                    udr0.b.a();
                    if(udr0.l) {
                        goto label_207;
                    }
                    else {
                        udq udq0 = udr0.a;
                        if(udq0.c()) {
                            throw new IllegalStateException("Received a resource without any callbacks to notify");
                        }
                        if(udr0.h) {
                            throw new IllegalStateException("Already have resource");
                        }
                        udr0.k = new udt(udr0.f, udr0.d, udr0.c, udr0.m);
                        udr0.h = true;
                        udq udq1 = udq0.b();
                        udr0.d(udq1.a() + 1);
                        goto label_197;
                    }
                    goto label_214;
                }
            }
        label_197:
            udr0.n.b(udr0, udr0.c, udr0.k);
            for(Object object1: udq1) {
                udo udo0 = new udo(udr0, ((udp)object1).b);
                ((udp)object1).a.execute(udo0);
            }
            udr0.c();
            goto label_214;
        label_207:
            udr0.f.e();
            udr0.e();
        label_214:
            try {
                this.F = 5;
                if(ucv0.a()) {
                    ubc ubc3 = this.k;
                    try {
                        this.t.a().c(ucv0.a, new ucr(ucv0.b, ucv0.c, ubc3));
                    }
                    finally {
                        ucv0.c.f();
                    }
                }
            }
            finally {
                if(ueb1 != null) {
                    ((uea)ueb1).f();
                }
            }
            if(this.d.b()) {
                this.b();
            }
            return;
        }
        this.l();
    }

    private final void j() {
        uay uay0;
        if(this.n.a(txg.class)) {
            this.k();
        }
        this.m();
        udv udv0 = new udv("Failed to load resource", new ArrayList(this.v));
        udr udr0 = this.u;
        synchronized(udr0) {
            udr0.i = udv0;
            synchronized(udr0) {
                udr0.b.a();
                if(udr0.l) {
                    goto label_30;
                }
                else {
                    udq udq0 = udr0.a;
                    if(udq0.c()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if(udr0.j) {
                        throw new IllegalStateException("Already failed once");
                    }
                    udr0.j = true;
                    uay0 = udr0.c;
                    udq udq1 = udq0.b();
                    udr0.d(udq1.a() + 1);
                    goto label_20;
                }
                goto label_36;
            }
        }
    label_20:
        udr0.n.b(udr0, uay0, null);
        for(Object object0: udq1) {
            udn udn0 = new udn(udr0, ((udp)object0).b);
            ((udp)object0).a.execute(udn0);
        }
        udr0.c();
        goto label_36;
    label_30:
        udr0.e();
    label_36:
        if(this.d.c()) {
            this.b();
        }
    }

    private final void k() {
        if(!this.n.a(txg.class)) {
            throw new IllegalStateException("OverrideGlideThreadPriority experiment is not enabled.");
        }
        if(this.o != null && this.o.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), 9);
            }
            catch(IllegalArgumentException | SecurityException unused_ex) {
                this.o = null;
            }
        }
    }

    private final void l() {
        this.y = Thread.currentThread();
        SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        while(!this.r && this.q != null) {
            z = this.q.b();
            if(z) {
                break;
            }
            this.F = this.e(this.F);
            this.q = this.h();
            if(this.F == 4) {
                this.f(2);
                return;
            }
        }
        if((this.F == 6 || this.r) && !z) {
            this.j();
        }
    }

    private final void m() {
        this.w.a();
        if(this.D) {
            throw new IllegalStateException("Already notified", (this.v.isEmpty() ? null : ((Throwable)this.v.get(this.v.size() - 1))));
        }
        this.D = true;
    }

    @Override
    public final void run() {
        String s;
        ubl ubl0;
        try {
            ubl0 = this.C;
            if(this.r) {
                this.j();
            }
            else {
                int v = this.s;
                if(v == 0) {
                    throw null;
                }
                switch(v - 1) {
                    case 0: {
                        this.F = this.e(1);
                        this.q = this.h();
                        this.l();
                        break;
                    }
                    case 1: {
                        this.l();
                        break;
                    }
                    default: {
                        if(v - 1 != 2) {
                            switch(v) {
                                case 1: {
                                    s = "INITIALIZE";
                                    break;
                                }
                                case 2: {
                                    s = "SWITCH_TO_SOURCE_SERVICE";
                                    break;
                                }
                                default: {
                                    s = "DECODE_DATA";
                                }
                            }
                            throw new IllegalStateException("Unrecognized run reason: " + s);
                        }
                        this.i();
                    }
                }
            }
            goto label_35;
        }
        catch(uco uco0) {
        }
        catch(Throwable throwable0) {
            goto label_27;
        }
        try {
            throw uco0;
        label_27:
            if(this.F != 5) {
                this.v.add(throwable0);
                this.j();
            }
            throw throwable0;
        }
        catch(Throwable throwable1) {
            if(ubl0 != null) {
                ubl0.e();
            }
            throw throwable1;
        }
    label_35:
        if(ubl0 != null) {
            ubl0.e();
        }
    }
}

