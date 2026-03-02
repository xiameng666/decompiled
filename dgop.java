import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.nearby.sharing.AppInfo;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.FileAttachment;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class dgop {
    public final Context a;
    public final String b;
    public final dghf c;
    public ibth d;
    public Map e;
    public final dgnq f;
    public final dgii g;
    public iced h;
    public final dglu i;
    public final dghz j;
    public final icnl k;
    public final icnl l;
    public ichm m;
    private final dgfy n;
    private final int o;
    private final dgll p;
    private final Map q;
    private long r;
    private final Map s;
    private final icnl t;

    public dgop(Context context0, String s, dglu dglu0, dghz dghz0, dgfy dgfy0, int v) {
        ibuq.f(context0, "context");
        dghm dghm0;
        super();
        this.a = context0;
        this.b = s;
        this.i = dglu0;
        this.j = dghz0;
        this.n = dgfy0;
        this.o = v;
        this.c = new dghf();
        this.p = new dgll(context0, s);
        this.q = new LinkedHashMap();
        this.d = new dgmp();
        this.k = icnm.a(dgmu.a);
        this.e = ibpt.a;
        this.s = new LinkedHashMap();
        this.l = icnm.a(ibpu.a);
        this.t = icnm.a(Integer.valueOf(0));
        this.f = new dgnq(this);
        if(dgfy0 == null) {
            dghm0 = null;
        }
        else {
            switch(dgfy0.b.ordinal()) {
                case 0: {
                    dghm0 = new dghm(dgfy0);
                    break;
                }
                case 1: {
                    dghm0 = new dgik(dgfy0);
                    break;
                }
                default: {
                    throw new ibnq();
                }
            }
        }
        this.g = dghm0;
    }

    public final Object a(ibrl ibrl0) {
        dgnb dgnb0;
        dgna dgna0;
        dgnc dgnc0;
        if((ibrl0 instanceof dgnc)) {
            dgnc0 = (dgnc)ibrl0;
            int v = dgnc0.c;
            if((v & 0x80000000) == 0) {
                dgnc0 = new dgnc(this, ibrl0);
            }
            else {
                dgnc0.c = v - 0x80000000;
            }
        }
        else {
            dgnc0 = new dgnc(this, ibrl0);
        }
        Object object0 = dgnc0.a;
        Object object1 = ibrx.a;
        switch(dgnc0.c) {
            case 0: {
                ibnx.b(object0);
                synchronized(this) {
                    icnl icnl0 = this.k;
                    dgnb0 = (dgnb)icnl0.b();
                    if(!(dgnb0 instanceof dgna) || ((dgna)dgnb0).b) {
                        dcvz.a.e().p("Try to accept while we are not waiting for local acceptance.", new Object[0]);
                        return ibom.a;
                    }
                    do {
                        Object object2 = icnl0.b();
                        dgnb dgnb1 = (dgnb)object2;
                        if(((dgna)dgnb0).c) {
                            ichm ichm0 = this.m;
                            if(ichm0 != null) {
                                dgmr.c(ichm0, dglv.a);
                            }
                            dgna0 = new dgmx(((dgna)dgnb0).a);
                        }
                        else {
                            dgna0 = dgna.b(((dgna)dgnb0), true, false, 5);
                        }
                    }
                    while(!icnl0.h(object2, dgna0));
                }
                this.e = this.g(((dgna)dgnb0).a);
                cuwu cuwu0 = cuwu.b(new dgeh(this.e).a());
                dgnc0.c = 1;
                if(this.i.b(cuwu0, dgnc0) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.d.a();
        return ibom.a;
    }

    public final Object b(ibrl ibrl0) {
        dgnb dgnb0;
        Object object3;
        dgfc dgfc0;
        dgnd dgnd0;
        if((ibrl0 instanceof dgnd)) {
            dgnd0 = (dgnd)ibrl0;
            int v = dgnd0.d;
            if((v & 0x80000000) == 0) {
                dgnd0 = new dgnd(this, ibrl0);
            }
            else {
                dgnd0.d = v - 0x80000000;
            }
        }
        else {
            dgnd0 = new dgnd(this, ibrl0);
        }
        Object object0 = dgnd0.b;
        Object object1 = ibrx.a;
        switch(dgnd0.d) {
            case 0: {
                ibnx.b(object0);
                synchronized(this) {
                    icnl icnl0 = this.k;
                    dgnb0 = (dgnb)icnl0.b();
                    if(ibuq.m(dgnb0, dgmv.a)) {
                        this.i(gyzg.c);
                        dcvz.a.b().p("Cancel() called after failure!", new Object[0]);
                        return ibom.a;
                    }
                    ichm ichm0 = this.m;
                    if(ichm0 != null) {
                        dgmr.c(ichm0, dglz.a);
                    }
                    do {
                        Object object2 = icnl0.b();
                        dgnb dgnb1 = (dgnb)object2;
                    }
                    while(!icnl0.h(object2, dgmt.a));
                }
                if((dgnb0 instanceof dgmx)) {
                    dgfc0 = ((dgmx)dgnb0).a;
                    object3 = dgfc0.i().iterator();
                    goto label_39;
                }
                goto label_49;
            }
            case 1: {
                object3 = dgnd0.a;
                dgfc0 = dgnd0.e;
                ibnx.b(object0);
            label_39:
                while(((Iterator)object3).hasNext()) {
                    Object object4 = ((Iterator)object3).next();
                    long v2 = ((Number)object4).longValue();
                    dgnd0.e = dgfc0;
                    dgnd0.a = object3;
                    dgnd0.d = 1;
                    if(this.i.a(v2, dgnd0) == object1) {
                        return object1;
                    }
                }
                dgmr.a(dgfc0);
            label_49:
                dgnd0.e = null;
                dgnd0.a = null;
                dgnd0.d = 2;
                if(this.d(dgeq.a, dgnd0) == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.i(gyzg.c);
        ichm ichm1 = this.m;
        if(ichm1 != null) {
            dgmr.c(ichm1, dgly.a);
        }
        return ibom.a;
    }

    public final Object c(ibrl ibrl0) {
        dgnr dgnr0;
        if((ibrl0 instanceof dgnr)) {
            dgnr0 = (dgnr)ibrl0;
            int v = dgnr0.c;
            if((v & 0x80000000) == 0) {
                dgnr0 = new dgnr(this, ibrl0);
            }
            else {
                dgnr0.c = v - 0x80000000;
            }
        }
        else {
            dgnr0 = new dgnr(this, ibrl0);
        }
        Object object0 = dgnr0.a;
        Object object1 = ibrx.a;
        switch(dgnr0.c) {
            case 0: {
                ibnx.b(object0);
                synchronized(this) {
                    dgnb dgnb0 = (dgnb)this.k.b();
                    if(!(dgnb0 instanceof dgna) || ((dgna)dgnb0).b) {
                        dcvz.a.e().p("Try to reject while we are not waiting for local acceptance.", new Object[0]);
                        return ibom.a;
                    }
                }
                dgnr0.c = 1;
                if(this.d(dgfz.a, dgnr0) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ichm ichm0 = this.m;
        if(ichm0 != null) {
            dgmr.c(ichm0, dgme.a);
        }
        return ibom.a;
    }

    public final Object d(dgfe dgfe0, ibrl ibrl0) {
        dgns dgns0;
        if((ibrl0 instanceof dgns)) {
            dgns0 = (dgns)ibrl0;
            int v = dgns0.c;
            if((v & 0x80000000) == 0) {
                dgns0 = new dgns(this, ibrl0);
            }
            else {
                dgns0.c = v - 0x80000000;
            }
        }
        else {
            dgns0 = new dgns(this, ibrl0);
        }
        Object object0 = dgns0.a;
        Object object1 = ibrx.a;
        switch(dgns0.c) {
            case 0: {
                ibnx.b(object0);
                icnl icnl0 = this.k;
                do {
                    Object object2 = icnl0.b();
                    dgnb dgnb0 = (dgnb)object2;
                }
                while(!icnl0.h(object2, dgmt.a));
                cuwu cuwu0 = cuwu.b(dgfe0.a());
                dgns0.c = 1;
                if(this.i.b(cuwu0, dgns0) == object1) {
                    return object1;
                }
                goto label_23;
            }
            case 1: {
                ibnx.b(object0);
            label_23:
                long v1 = hvqs.m();
                dgnu dgnu0 = new dgnu(this, null);
                dgns0.c = 2;
                object0 = icfo.c(v1, dgnu0, dgns0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((dgnb)object0) == null) {
            this.h(null);
        }
        return ibom.a;
    }

    public final Object e(dgfc dgfc0, ibrl ibrl0) {
        ibvd ibvd4;
        long v9;
        File file2;
        File file1;
        ibqu ibqu8;
        ibqu ibqu7;
        Object object9;
        int v6;
        Object object8;
        File file0;
        ibvd ibvd3;
        cuwu cuwu0;
        ibvd ibvd2;
        ibqu ibqu6;
        ibqu ibqu5;
        Object object6;
        Long long1;
        dgof dgof2;
        int v3;
        ibvd ibvd1;
        ibqu ibqu4;
        ibqu ibqu1;
        Object object3;
        ibqu ibqu0;
        Object object2;
        dgof dgof1;
        ibvd ibvd0;
        int v1;
        dgof dgof0;
        dgfc dgfc1 = dgfc0;
        if((ibrl0 instanceof dgof)) {
            dgof0 = (dgof)ibrl0;
            int v = dgof0.f;
            if((v & 0x80000000) == 0) {
                dgof0 = new dgof(this, ibrl0);
            }
            else {
                dgof0.f = v - 0x80000000;
            }
        }
        else {
            dgof0 = new dgof(this, ibrl0);
        }
        Object object0 = dgof0.d;
        Object object1 = ibrx.a;
        switch(dgof0.f) {
            case 0: {
                ibnx.b(object0);
                v1 = dgfc1.c.size() != 1 || ((dgfl)dgfc1.c.get(0)).c != 3 || !dgfc1.d.isEmpty() || !dgfc1.e.isEmpty() || !dgfc1.f.isEmpty() ? 0 : 1;
                ibvd0 = new ibvd();
                dgof1 = dgof0;
                object2 = new LinkedHashMap();
                ibqu0 = new ibqu();
                object3 = dgfc1.c.iterator();
                ibqu1 = ibqu0;
                goto label_49;
            }
            case 1: {
                int v2 = dgof0.c;
                ibqu ibqu2 = dgof0.l;
                Long long0 = dgof0.i;
                Object object4 = dgof0.b;
                ibqu ibqu3 = dgof0.k;
                ibqu4 = dgof0.j;
                Object object5 = dgof0.a;
                ibvd1 = dgof0.h;
                dgfc dgfc2 = dgof0.g;
                ibnx.b(object0);
                v3 = v2;
                dgfc1 = dgfc2;
                dgof2 = dgof0;
                long1 = long0;
                object3 = object4;
                object2 = object5;
                object6 = object1;
                ibqu5 = ibqu2;
                ibqu6 = ibqu3;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            ibqu5.put(long1, object0);
            ibqu1 = ibqu6;
            object1 = object6;
            ibvd0 = ibvd1;
            v1 = v3;
            dgof1 = dgof2;
            ibqu0 = ibqu4;
        label_49:
            if(!((Iterator)object3).hasNext()) {
                return new dgms(ibpz.b(ibqu0), ((Map)object2), ((AppInfo)ibvd0.a));
            }
            Object object7 = ((Iterator)object3).next();
            dgfl dgfl0 = (dgfl)object7;
            long v4 = dgfl0.g;
            Long long2 = (Long)this.e.get(new Long(v4));
            long v5 = long2 == null ? 0L : ((long)long2);
            if(v5 < dgfl0.f) {
                ibvd2 = ibvd0;
                cuwu0 = dgfc1.e(dgfl0.b);
            }
            else {
                ibvd2 = ibvd0;
                cuwu0 = null;
            }
            if(v4 != 0L && v5 != 0L) {
                dgll dgll0 = this.p;
                String s = dgfl0.i;
                ibvd3 = ibvd2;
                String s1 = dgfl0.d;
                if(cuwu0 != null) {
                    cuws cuws0 = cuwu0.l;
                    if(cuws0 != null) {
                        file0 = cuws0.a;
                        object8 = object1;
                        goto label_74;
                    }
                }
                object8 = object1;
                file0 = null;
            label_74:
                boolean z = dgfl0.h;
                v6 = v1;
                ibuq.f(s1, "fileName");
                if(s == null) {
                    ibqu7 = ibqu1;
                    object9 = object3;
                    ibqu8 = ibqu0;
                    file1 = hrnt.i() ? new File(ccsb.a.b(dgll0.b, s1)) : new File(dgll0.b, s1);
                }
                else if(hrnt.i()) {
                    object9 = object3;
                    ibqu7 = ibqu1;
                    ibqu8 = ibqu0;
                    file1 = new File(ccsb.a.d(ccsb.a.b(dgll0.b, s), s1));
                }
                else {
                    ibqu7 = ibqu1;
                    object9 = object3;
                    ibqu8 = ibqu0;
                    file1 = new File(new File(dgll0.b, s), s1);
                }
                Context context0 = dgll0.a;
                gged_interceptors gged0 = djbh.a(context0, v4);
                if(gged0 == null) {
                    file2 = null;
                }
                else {
                    gged_interceptors gged1 = djas.b(dglk.b(context0, z), gged0);
                    if(gged1.isEmpty() && ibuq.m(file0, file1)) {
                        file2 = file0;
                    }
                    else {
                        try {
                            ibqm ibqm0 = new ibqm(null);
                            ibuq.c(gged1);
                            ibqm0.addAll(gged1);
                            if(ibuq.m(file0, file1)) {
                                File file3 = cuua.c(file1);
                                file0.renameTo(file3);
                                ibqm0.add(file3);
                            }
                            else if(file0 != null) {
                                ibqm0.add(file0);
                            }
                            List list0 = ibpo.a(ibqm0);
                            file2 = cuua.c(file1);
                            djad.k(list0, file2);
                        }
                        catch(IOException unused_ex) {
                            file2 = null;
                        }
                        finally {
                            djbh.k(dgll0.a, v4);
                        }
                    }
                }
                if(file2 == null) {
                    return null;
                }
            }
            else {
                ibqu7 = ibqu1;
                object9 = object3;
                object8 = object1;
                v6 = v1;
                ibvd3 = ibvd2;
                ibqu8 = ibqu0;
                if(cuwu0 == null) {
                    return null;
                }
                cuws cuws1 = cuwu0.l;
                if(cuws1 == null) {
                    return null;
                }
                File file4 = cuws1.a;
                if(file4 == null) {
                    return null;
                }
                file2 = dgmr.b(this.b, dgfl0.i, dgfl0.d, file4);
                if(file2 == null) {
                    return null;
                }
            }
            long v8 = dgfl0.a;
            ((Map)object2).put(new Long(v8), file2.getAbsolutePath());
            if(v6 == 0) {
                v9 = v8;
                ibvd4 = ibvd3;
            }
            else {
                ibuq.f(this.a, "context");
                ibuq.f(dgfl0, "metadata");
                ibuq.f(file2, "apkFile");
                PackageInfo packageInfo0 = djao.a(this.a.getPackageManager(), file2);
                ApplicationInfo applicationInfo0 = packageInfo0 == null ? null : packageInfo0.applicationInfo;
                v9 = v8;
                ibvd4 = ibvd3;
                ibvd4.a = dgox.c(this.a, (packageInfo0 == null ? null : packageInfo0.packageName), (applicationInfo0 == null ? dgfl0.d : this.a.getPackageManager().getApplicationLabel(applicationInfo0).toString()), v8, ibpo.b(file2));
                dgyp dgyp0 = dgym.a();
                AppInfo appInfo0 = (AppInfo)ibvd4.a;
                dgyp0.a(new dhcz(this.i.a, (appInfo0 == null ? null : new Integer(appInfo0.e))));
            }
            Long long3 = new Long(v9);
            long v10 = hvqs.S();
            dgof1.g = dgfc1;
            dgof1.h = ibvd4;
            dgof1.a = object2;
            dgof1.j = ibqu8;
            ibqu6 = ibqu7;
            dgof1.k = ibqu6;
            dgof1.b = object9;
            dgof1.i = long3;
            dgof1.l = ibqu6;
            v3 = v6;
            dgof1.c = v3;
            dgof1.f = 1;
            Object object10 = dgox.a.a(this.a, file2, dgfl0.e, ((long)dgfc1.c.size()) <= v10, dgof1);
            object6 = object8;
            if(object10 == object6) {
                break;
            }
            long1 = long3;
            object0 = object10;
            object3 = object9;
            dgof2 = dgof1;
            ibvd1 = ibvd4;
            ibqu4 = ibqu8;
            ibqu5 = ibqu6;
        }
        return object6;
    }

    public final Object f(int v, ibrl ibrl0) {
        dgoj dgoj0;
        if((ibrl0 instanceof dgoj)) {
            dgoj0 = (dgoj)ibrl0;
            int v1 = dgoj0.c;
            if((v1 & 0x80000000) == 0) {
                dgoj0 = new dgoj(this, ibrl0);
            }
            else {
                dgoj0.c = v1 - 0x80000000;
            }
        }
        else {
            dgoj0 = new dgoj(this, ibrl0);
        }
        Object object0 = dgoj0.a;
        Object object1 = ibrx.a;
        switch(dgoj0.c) {
            case 0: {
                ibnx.b(object0);
                if(v != 0) {
                    long v2 = hvqs.al();
                    dgol dgol0 = new dgol(this, v, null);
                    dgoj0.c = 1;
                    object0 = icfo.c(v2, dgol0, dgoj0);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_22;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
            label_22:
                if(((Set)object0) != null) {
                    return (Set)object0;
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return ibpu.a;
    }

    public final Map g(dgfc dgfc0) {
        if(!dgfc0.j) {
            return ibpt.a;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: dgfc0.c) {
            dgfl dgfl0 = (dgfl)object0;
            dgll dgll0 = this.p;
            long v = dgfl0.g;
            boolean z = dgfl0.h;
            long v1 = dgll0.a(v, z);
            Object object1 = null;
            if(Long.compare(v1, 0L) != 0) {
                int v2 = Long.compare(v1, dgfl0.f);
                if(v2 > 0) {
                    Context context0 = dgll0.a;
                    gged_interceptors gged0 = djbh.a(context0, v);
                    if(gged0 != null) {
                        djas.d(context0, v, djas.b(dglk.b(context0, z), gged0));
                    }
                }
                else {
                    long v3 = dgfl0.b;
                    dgfs dgfs0 = v2 == 0 ? dgfs.a : new dgft(v1);
                    if(dgfc0.f(v3, dgfs0) == null) {
                        throw new RuntimeException();
                    }
                    object1 = new ibns(v, v1);
                }
            }
            if(object1 != null) {
                arrayList0.add(object1);
            }
        }
        return ibpz.p(arrayList0);
    }

    public final void h(dgmo dgmo0) {
        synchronized(this) {
            if(dgmo0 != null && this.h != null) {
                ichm ichm0 = this.m;
                if(ichm0 != null) {
                    dgmr.c(ichm0, dgmo0);
                }
            }
            iced iced0 = this.h;
            if(iced0 != null) {
                iceb.a(iced0);
            }
            icnl icnl0 = this.k;
            do {
                Object object0 = icnl0.b();
                dgnb dgnb0 = (dgnb)object0;
            }
            while(!icnl0.h(object0, dgmv.a));
        }
    }

    public final void i(gyzg gyzg0) {
        dgnb dgnb0 = (dgnb)this.k.b();
        if(!(dgnb0 instanceof dgmw)) {
            return;
        }
        dgyp dgyp0 = dgym.a();
        long v = ((dgmw)dgnb0).a().b();
        int v1 = ((Number)this.t.b()).intValue();
        dgyp0.a(new dgxz(this.i.a, v, gyzg0, v1, this.o));
    }

    public final boolean j(dgnb dgnb0, cuwu cuwu0) {
        ibuq.f(dgnb0, "currentState");
        if((dgnb0 instanceof dgmw)) {
            if(((dgmw)dgnb0).a().k(cuwu0) && (dgnb0 instanceof dgna)) {
                icnl icnl0 = this.k;
                do {
                    Object object0 = icnl0.b();
                    dgnb dgnb1 = (dgnb)object0;
                    dgmx dgmx0 = ((dgna)dgnb0).b ? new dgmx(((dgna)dgnb0).a) : dgna.b(((dgna)dgnb0), false, true, 3);
                }
                while(!icnl0.h(object0, dgmx0));
                return true;
            }
            if(hvqz.o()) {
                List list0 = ((dgmw)dgnb0).a().h;
                Long long0 = (long)cuwu0.i;
                if(list0.contains(long0)) {
                    this.s.put(long0, cuwu0);
                    return true;
                }
            }
        }
        return false;
    }

    public final Object k(ichm ichm0, ibrl ibrl0) {
        dcjz dcjz0;
        Map map0;
        ichm ichm1;
        Object object3;
        dgne dgne0;
        if((ibrl0 instanceof dgne)) {
            dgne0 = (dgne)ibrl0;
            int v = dgne0.d;
            if((v & 0x80000000) == 0) {
                dgne0 = new dgne(this, ibrl0);
            }
            else {
                dgne0.d = v - 0x80000000;
            }
        }
        else {
            dgne0 = new dgne(this, ibrl0);
        }
        Object object0 = dgne0.b;
        Object object1 = ibrx.a;
        switch(dgne0.d) {
            case 0: {
                ibnx.b(object0);
                icnl icnl0 = this.k;
                dgnb dgnb0 = (dgnb)icnl0.b();
                if(!(dgnb0 instanceof dgmx)) {
                    dcvz.a.c().p("Transfer complete while waiting for local acceptance.", new Object[0]);
                    this.i(gyzg.D);
                    this.h(dgmg.a);
                    return ibom.a;
                }
                this.i(gyzg.b);
                do {
                    Object object2 = icnl0.b();
                    dgnb dgnb1 = (dgnb)object2;
                }
                while(!icnl0.h(object2, dgmy.a));
                this.h(dgml.a);
                dgne0.e = ichm0;
                dgne0.a = dgnb0;
                dgne0.d = 1;
                object0 = this.e(((dgmx)dgnb0).a, dgne0);
                if(object0 != object1) {
                    object3 = dgnb0;
                    ichm1 = ichm0;
                    break;
                }
                return object1;
            }
            case 1: {
                object3 = dgne0.a;
                ichm1 = dgne0.e;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((dgms)object0) == null) {
            dgym.a().a(new dgwu(this.i.a, gzaj.c));
            dgmr.c(ichm1, dgmk.a);
            return ibom.a;
        }
        AppInfo appInfo0 = ((dgms)object0).c;
        if(appInfo0 == null) {
            dgfc dgfc0 = ((dgmx)object3).a;
            ibqu ibqu0 = new ibqu();
            Iterator iterator0 = dgfc0.f.iterator();
        alab1:
            while(true) {
                if(!iterator0.hasNext()) {
                    map0 = ibpz.b(ibqu0);
                    break;
                }
                Object object4 = iterator0.next();
                ArrayList arrayList0 = new ArrayList(ibpo.q(((dgen)object4).e, 10));
                for(Object object5: ((dgen)object4).e) {
                    cuws cuws0 = dgfc0.e(((dgem)object5).b).l;
                    if(cuws0 != null) {
                        File file0 = cuws0.a;
                        if(file0 != null) {
                            File file1 = dgmr.b(this.b, null, ((dgem)object5).a, file0);
                            if(file1 == null) {
                                dcvz.a.e().p("Failed to move the file to the destination.", new Object[0]);
                                dgym.a().a(new dgwu(this.i.a, gzaj.c));
                                map0 = null;
                                break alab1;
                            }
                            ((dgem)object5).d = file1.getAbsolutePath();
                            arrayList0.add(file1);
                            continue;
                        }
                    }
                    dcvz.a.e().p("Can\'t get the completed file.", new Object[0]);
                    dgym.a().a(new dgwu(this.i.a, gzaj.d));
                    map0 = null;
                    break alab1;
                }
                Long long0 = (long)((dgen)object4).a;
                ibuq.f(this.a, "context");
                ibuq.f(((dgen)object4), "metadata");
                ibqu0.put(long0, dgox.c(this.a, ((dgen)object4).d, ((dgen)object4).b, ((dgen)object4).a, arrayList0));
                dgyp dgyp0 = dgym.a();
                AppInfo appInfo1 = (AppInfo)ibqu0.get(long0);
                dgyp0.a(new dhcz(this.i.a, (appInfo1 == null ? null : ((int)appInfo1.e))));
            }
            if(map0 == null) {
                dgmr.c(ichm1, dgmk.a);
                return ibom.a;
            }
        }
        else {
            map0 = ibpz.c(new ibns(new Long(((dgfl)((dgmx)object3).a.c.get(0)).a), appInfo0));
        }
        ibqu ibqu1 = new ibqu();
        for(Object object6: ((dgmx)object3).a.d) {
            Long long1 = new Long(((dggj)object6).a);
            byte[] arr_b = ((dgmx)object3).a.e(((dggj)object6).b).k;
            if(arr_b != null) {
                ibqu1.put(long1, new String(arr_b, ibyo.a));
                continue;
            }
            dgym.a().a(new dgwu(this.i.a, gzaj.e));
            dgmr.c(ichm1, dgmk.a);
            return ibom.a;
        }
        Map map1 = ibpz.b(ibqu1);
        ibqu ibqu2 = new ibqu();
        for(Object object7: ((dgmx)object3).a.e) {
            Long long2 = new Long(((dggo)object7).a);
            byte[] arr_b1 = ((dgmx)object3).a.e(((dggo)object7).b).k;
            if(arr_b1 != null) {
                try {
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)dcjz.a), arr_b1, 0, arr_b1.length, hftc.a);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    dcjz0 = null;
                    dcjz0 = (dcjz)hftv0;
                }
                catch(hfur unused_ex) {
                }
                if(dcjz0 != null) {
                    ibqu2.put(long2, dcjz0);
                    continue;
                }
            }
            dgym.a().a(new dgwu(this.i.a, gzaj.f));
            dgmr.c(ichm1, dgmk.a);
            return ibom.a;
        }
        Map map2 = ((dgms)object0).a;
        Map map3 = ibpz.b(ibqu2);
        dgfc dgfc1 = ((dgmx)object3).a;
        ibuq.f(map2, "fileUriMap");
        ibuq.f(map0, "appInfoMap");
        ibuq.f(map1, "textBodyMap");
        ibuq.f(map3, "wifiCredentialsMap");
        int v1 = dgfc1.a;
        List list0 = dgfc1.c;
        ArrayList arrayList1 = new ArrayList(ibpo.q(list0, 10));
        for(Object object8: list0) {
            Object object9 = map2.get(Long.valueOf(((dgfl)object8).a));
            if(object9 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            arrayList1.add(((dgfl)object8).c(((Uri)object9)));
            map1 = map1;
            continue;
        }
        ArrayList arrayList2 = new ArrayList(ibpo.q(dgfc1.d, 10));
        for(Object object10: dgfc1.d) {
            Object object11 = map1.get(Long.valueOf(((dggj)object10).a));
            if(object11 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            arrayList2.add(((dggj)object10).c(((String)object11)));
            v1 = v1;
            continue;
        }
        ArrayList arrayList3 = new ArrayList(ibpo.q(dgfc1.e, 10));
        for(Object object12: dgfc1.e) {
            Object object13 = map3.get(Long.valueOf(((dggo)object12).a));
            if(object13 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            arrayList3.add(((dggo)object12).c(((dcjz)object13).c, ((dcjz)object13).d));
            continue;
        }
        ArrayList arrayList4 = new ArrayList(ibpo.q(dgfc1.f, 10));
        for(Object object14: dgfc1.f) {
            arrayList4.add(((dgen)object14).c(((AppInfo)map0.get(Long.valueOf(((dgen)object14).a)))));
        }
        dggc dggc0 = new dggc(v1, false, arrayList1, arrayList2, arrayList3, arrayList4, dgfc1.b, false);
        if(dggc0.c()) {
            Attachment attachment0 = (Attachment)dggc0.c.get(0);
            Object object15 = map0.get(Long.valueOf(((dgfl)list0.get(0)).a));
            if(object15 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            dggb.b(attachment0, ((AppInfo)object15));
        }
        for(Object object16: dggc0.c) {
            FileAttachment fileAttachment0 = (FileAttachment)object16;
            long v2 = fileAttachment0.g;
            String s = (String)((dgms)object0).b.get(new Long(v2));
            if(s != null) {
                ibuq.f(fileAttachment0, "attachment");
                dggc0.i.put(Long.valueOf(v2), s);
            }
        }
        dgym.a().a(new dgwu(this.i.a, gzaj.b));
        dgmr.c(ichm1, new dgmj(dggc0));
        return ibom.a;
    }

    public final Object l(ichm ichm0, dgfc dgfc0, ibrl ibrl0) {
        dgoe dgoe0;
        if((ibrl0 instanceof dgoe)) {
            dgoe0 = (dgoe)ibrl0;
            int v = dgoe0.c;
            if((v & 0x80000000) == 0) {
                dgoe0 = new dgoe(this, ibrl0);
            }
            else {
                dgoe0.c = v - 0x80000000;
            }
        }
        else {
            dgoe0 = new dgoe(this, ibrl0);
        }
        Object object0 = dgoe0.a;
        Object object1 = ibrx.a;
        switch(dgoe0.c) {
            case 0: {
                ibnx.b(object0);
                if(!dgfc0.e.isEmpty() && (djbw.h(this.a) || djbw.f(this.a))) {
                    dcvz.a.e().p("User is not allowed to modify WiFi config.", new Object[0]);
                    this.i(gyzg.z);
                    dgmr.c(ichm0, dgmi.a);
                    dgoe0.c = 1;
                    return this.d(dggm.a, dgoe0) == object1 ? object1 : Boolean.valueOf(false);
                }
                List list0 = dgfc0.c;
                if(!list0.isEmpty() || !dgfc0.f.isEmpty()) {
                    dgll dgll0 = this.p;
                    List list1 = dgfc0.f;
                    Iterator iterator0 = ibpo.g(new Boolean[]{Boolean.valueOf(false), Boolean.valueOf(true)}).iterator();
                    while(iterator0.hasNext()) {
                        Object object2 = iterator0.next();
                        boolean z = ((Boolean)object2).booleanValue();
                        ArrayList arrayList0 = new ArrayList();
                        for(Object object3: list0) {
                            if(((dgfl)object3).h == z) {
                                arrayList0.add(object3);
                            }
                        }
                        ArrayList arrayList1 = new ArrayList(ibpo.q(arrayList0, 10));
                        for(Object object4: arrayList0) {
                            arrayList1.add(Long.valueOf(((dgfl)object4).g));
                        }
                        Set set0 = ibpo.ay(arrayList1);
                        if(!set0.isEmpty()) {
                            ArrayList arrayList2 = new ArrayList();
                            for(Object object5: list0) {
                                if(((dgfl)object5).h == z) {
                                    arrayList2.add(object5);
                                }
                            }
                            long v1 = 0L;
                            for(Object object6: arrayList2) {
                                v1 += ((dgfl)object6).f;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for(Object object7: list1) {
                                if(((dgen)object7).f == z) {
                                    arrayList3.add(object7);
                                }
                            }
                            long v2 = 0L;
                            for(Object object8: arrayList3) {
                                v2 += ((dgen)object8).c;
                                iterator0 = iterator0;
                            }
                            File file0 = hvrc.e() ? dglk.b(dgll0.a, z) : dglk.a(dgll0.a, z);
                            long v3 = 0L;
                            for(Object object9: set0) {
                                v3 += dgll0.a(((Number)object9).longValue(), z);
                            }
                            long v4 = v1 + v2 - v3;
                            float f = (float)hvqs.c();
                            BigDecimal bigDecimal0 = BigDecimal.valueOf(v4);
                            ibuq.e(bigDecimal0, "valueOf(...)");
                            long v5 = djad.c(file0, f, bigDecimal0);
                            if(v5 > 0L) {
                                cunf cunf0 = dcvz.a;
                                cunf0.b().h("Need to free %d storage space on device.", Long.valueOf(v5));
                                File file1 = dglk.b(dgll0.a, z);
                                List list2 = ibpo.ar(set0);
                                djas.g(dgll0.a, file1, v5, list2);
                                BigDecimal bigDecimal1 = djad.i(file0);
                                BigDecimal bigDecimal2 = BigDecimal.valueOf(v4);
                                ibuq.e(bigDecimal2, "valueOf(...)");
                                if(bigDecimal1.compareTo(bigDecimal2) < 0) {
                                    cunf0.e().h("No enough space to store %s data.", (z ? "sensitive" : "insensitive"));
                                    this.i(gyzg.y);
                                    dgmr.c(ichm0, dgmc.a);
                                    dgoe0.c = 2;
                                    return this.d(dgfm.a, dgoe0) != object1 ? Boolean.valueOf(false) : object1;
                                }
                                iterator0 = iterator0;
                                list1 = list1;
                                list0 = list0;
                            }
                            else {
                                iterator0 = iterator0;
                            }
                        }
                    }
                }
                return Boolean.valueOf(true);
            }
            case 1: {
                ibnx.b(object0);
                return Boolean.valueOf(false);
            }
            case 2: {
                ibnx.b(object0);
                return Boolean.valueOf(false);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object m(ichm ichm0, dgfh dgfh0, dgfc dgfc0, String s, List list0, ibrl ibrl0) {
        dgog dgog0;
        if((ibrl0 instanceof dgog)) {
            dgog0 = (dgog)ibrl0;
            int v = dgog0.d;
            if((v & 0x80000000) == 0) {
                dgog0 = new dgog(this, ibrl0);
            }
            else {
                dgog0.d = v - 0x80000000;
            }
        }
        else {
            dgog0 = new dgog(this, ibrl0);
        }
        Object object0 = dgog0.b;
        Object object1 = ibrx.a;
        switch(dgog0.d) {
            case 0: {
                ibnx.b(object0);
                dgmr.c(ichm0, new dgmm(dgfh0, dgfc0, s, list0));
                long v1 = hvqs.ao();
                dgoi dgoi0 = new dgoi(this, null);
                dgog0.g = ichm0;
                dgog0.e = dgfh0;
                dgog0.f = dgfc0;
                dgog0.a = list0;
                dgog0.d = 1;
                object0 = icfo.c(v1, dgoi0, dgog0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_30;
            }
            case 1: {
                list0 = dgog0.a;
                dgfc0 = dgog0.f;
                dgfh0 = dgog0.e;
                ichm0 = dgog0.g;
                ibnx.b(object0);
            label_30:
                if(((dgnb)object0) == null) {
                    dcvz.a.b().h("waited local acceptance for %s ms, no action taken.", new Long(hvqs.ao()));
                    this.i(gyzg.x);
                    dgmr.c(ichm0, dgma.a);
                    dgog0.g = null;
                    dgog0.e = null;
                    dgog0.f = null;
                    dgog0.a = null;
                    dgog0.d = 2;
                    if(this.d(dggk.a, dgog0) == object1) {
                        return object1;
                    }
                }
                else if((((dgnb)object0) instanceof dgna)) {
                    dgmr.c(ichm0, new dgmn(dgfh0, dgfc0, false, list0));
                }
                return ibom.a;
            }
            case 2: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final void n(ichm ichm0, int v) {
        synchronized(this) {
            dgnb dgnb0 = (dgnb)this.k.b();
            if(!(dgnb0 instanceof dgmx) && (!(dgnb0 instanceof dgna) || !((dgna)dgnb0).b)) {
                if(hvrc.a.b().aE() && !Integer.valueOf(v).equals(Integer.valueOf(0))) {
                    return;
                }
                this.d = new dgmq(ichm0, this);
                return;
            }
            icbb.b(ichm0, null, null, new dgnm(this, null), 3);
        }
    }

    public final void o(ichm ichm0, dggz dggz0) {
        synchronized(this) {
            icnl icnl0 = this.k;
            dgmv dgmv0 = dgmv.a;
            if(ibuq.m(icnl0.b(), dgmv0)) {
                dcvz.a.b().h("Received event %s after disconnect is requested.", dggz0);
                return;
            }
            cunf cunf0 = dcvz.a;
            cunf0.b().h("[INCOMING_CONNECTION] event %s", dggz0);
            dgmo dgmo0 = null;
            if((dggz0 instanceof dggq)) {
                List list0 = ((dggq)dggz0).a;
                List list1 = ((dggq)dggz0).b;
                String s = ((dggq)dggz0).c;
                boolean z = ((dggq)dggz0).d;
                dgyp dgyp0 = dgym.a();
                String s1 = this.i.a;
                dgyp0.a(new dgxa(s1));
                dgej dgej0 = dgei.a(ibpo.aC(list0));
                if(dgej0 == null) {
                    cunf0.b().h("Failed to parse incoming connection from endpoint %s. Disconnecting.", list0);
                    dgym.a().a(new dgzr(s1, list0));
                    this.h(dglx.a);
                    return;
                }
                if(dgej0.a == 0) {
                    this.n(ichm0, 0);
                }
                dggg dggg0 = this.j.b(dgej0.b);
                dgfh dgfh0 = dgej0.a(dggg0, this.n);
                if(dgfh0 == null) {
                    cunf0.d().p("Failed to get device device metadata.", new Object[0]);
                    dgym.a().a(new dgzr(s1, list0));
                    this.h(dglx.a);
                    return;
                }
                icbb.b(ichm0, null, null, new dgnh(this, dggg0, list1, dgfh0, ichm0, z, s, null), 3);
                return;
            }
            if(ibuq.m(dggz0, dggs.a)) {
                dgnb dgnb0 = (dgnb)icnl0.b();
                if(!ibuq.m(dgnb0, dgmt.a) && !ibuq.m(dgnb0, dgmy.a)) {
                    if(!ibuq.m(dgnb0, dgmu.a) && !ibuq.m(dgnb0, dgmv0)) {
                        if(!(dgnb0 instanceof dgmx) && !(dgnb0 instanceof dgna)) {
                            throw new ibnq();
                        }
                        dgmo0 = dgmg.a;
                    }
                    else {
                        dgmo0 = dglx.a;
                    }
                }
                this.h(dgmo0);
                return;
            }
            if((dggz0 instanceof dggt)) {
                cuwu cuwu0 = ((dggt)dggz0).a;
                if(hvrc.a.b().o()) {
                    dgnb dgnb1 = (dgnb)icnl0.b();
                    if(this.j(dgnb1, cuwu0)) {
                        return;
                    }
                    if(cuwu0.j == 1) {
                        this.q.put(Long.valueOf(cuwu0.i), cuwu0);
                        return;
                    }
                    if((dgnb1 instanceof dgmw) && ((dgmw)dgnb1).a().j(cuwu0.i)) {
                        return;
                    }
                    icbb.b(ichm0, null, null, new dgnk(dgnb1, this, cuwu0, null), 3);
                    return;
                }
                dgnb dgnb2 = (dgnb)icnl0.b();
                if((dgnb2 instanceof dgmw)) {
                    if(((dgmw)dgnb2).a().k(cuwu0) && (dgnb2 instanceof dgna)) {
                        do {
                            Object object0 = icnl0.b();
                            dgnb dgnb3 = (dgnb)object0;
                            dgmx dgmx0 = ((dgna)dgnb2).b ? new dgmx(((dgna)dgnb2).a) : dgna.b(((dgna)dgnb2), false, true, 3);
                        }
                        while(!icnl0.h(object0, dgmx0));
                        return;
                    }
                    if(hvqz.o()) {
                        List list2 = ((dgmw)dgnb2).a().h;
                        Long long0 = (long)cuwu0.i;
                        if(list2.contains(long0)) {
                            this.s.put(long0, cuwu0);
                            return;
                        }
                    }
                }
                if(cuwu0.j == 1) {
                    this.q.put(Long.valueOf(cuwu0.i), cuwu0);
                    return;
                }
                if((dgnb2 instanceof dgmw) && ((dgmw)dgnb2).a().j(cuwu0.i)) {
                    return;
                }
                icbb.b(ichm0, null, null, new dgnl(this, cuwu0, null), 3);
                return;
            }
            if((dggz0 instanceof dggv)) {
                long v1 = ((dggv)dggz0).a;
                dgnb dgnb4 = (dgnb)icnl0.b();
                if((dgnb4 instanceof dgmw) && ((dgmw)dgnb4).a().i().contains(Long.valueOf(v1))) {
                    this.q(ichm0, ((dgmw)dgnb4).a(), v1, dgfs.a);
                    if(!((dgmw)dgnb4).a().h().isEmpty()) {
                        return;
                    }
                    icbb.b(ichm0, null, null, new dgnp(this, ichm0, null), 3);
                    return;
                }
                if(hvqz.o() && (dgnb4 instanceof dgna)) {
                    Map map0 = this.s;
                    Long long1 = v1;
                    if(map0.keySet().contains(long1)) {
                        cuwu cuwu1 = (cuwu)map0.remove(long1);
                        if(cuwu1 == null) {
                            return;
                        }
                        icnl icnl1 = this.l;
                        do {
                            Object object1 = icnl1.b();
                        }
                        while(!icnl1.h(object1, ibqg.h(((Set)object1), cuwu1)));
                        return;
                    }
                }
                cuwu cuwu2 = (cuwu)this.q.remove(Long.valueOf(v1));
                if(cuwu2 == null) {
                    return;
                }
                dghf dghf0 = this.c;
                byte[] arr_b = cuwu2.k;
                if(arr_b == null) {
                    return;
                }
                dghf0.d(arr_b);
                return;
            }
            if(!(dggz0 instanceof dggw) && !(dggz0 instanceof dggr)) {
                if((dggz0 instanceof dggy)) {
                    long v2 = ((dggy)dggz0).a;
                    long v3 = ((dggy)dggz0).b;
                    dgnb dgnb5 = (dgnb)icnl0.b();
                    if((dgnb5 instanceof dgmw) && ((dgmw)dgnb5).a().i().contains(Long.valueOf(v2))) {
                        this.q(ichm0, ((dgmw)dgnb5).a(), v2, new dgft(v3));
                        return;
                    }
                }
                else if(!(dggz0 instanceof dggu)) {
                    if(!(dggz0 instanceof dggp)) {
                        throw new ibnq();
                    }
                    if(hvqz.ag() && ((icnl0.b() instanceof dgmx) || (icnl0.b() instanceof dgna))) {
                        this.t.g(Integer.valueOf(((dggp)dggz0).d));
                        dgmr.c(ichm0, new dgmb(((dggp)dggz0).c, ((dggp)dggz0).d, ((dggp)dggz0).a, ((dggp)dggz0).b, ((dggp)dggz0).e, ((dggp)dggz0).f, ((dggp)dggz0).g));
                    }
                    if(hvqz.ag()) {
                        int v4 = ((dggp)dggz0).d;
                    alab1:
                        switch(this.o) {
                            case 1: {
                                switch(v4) {
                                    case 9: {
                                        cunf0.b().h("Disconnect connection, because %s is not allowed.", Integer.valueOf(v4));
                                        this.p(gyzg.E);
                                        return;
                                    }
                                    case 12: {
                                        v4 = 12;
                                        cunf0.b().h("Disconnect connection, because %s is not allowed.", Integer.valueOf(v4));
                                        this.p(gyzg.E);
                                        return;
                                    }
                                    default: {
                                        break alab1;
                                    }
                                }
                            }
                            case 3: {
                                if(v4 == 9) {
                                    v4 = 9;
                                    cunf0.b().h("Disconnect connection, because %s is not allowed.", Integer.valueOf(v4));
                                    this.p(gyzg.E);
                                    return;
                                }
                            }
                        }
                    }
                }
                return;
            }
            this.p(gyzg.D);
        }
    }

    private final void p(gyzg gyzg0) {
        dgmg dgmg0;
        dgnb dgnb0 = (dgnb)this.k.b();
        if((dgnb0 instanceof dgmx)) {
            dgfc dgfc0 = ((dgmx)dgnb0).a;
            if(dgfc0.j) {
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: dgfc0.c) {
                    if(dgfc0.j(((dgfl)object0).b)) {
                        arrayList0.add(object0);
                    }
                }
                for(Object object1: arrayList0) {
                    cuwu cuwu0 = dgfc0.e(((dgfl)object1).b);
                    dgll dgll0 = this.p;
                    long v = ((dgfl)object1).g;
                    boolean z = ((dgfl)object1).h;
                    cuws cuws0 = cuwu0.l;
                    if(cuws0 != null) {
                        File file0 = cuws0.a;
                        if(file0 != null) {
                            File file1 = hrnt.i() ? new File(ccsb.a.d(dglk.b(dgll0.a, z).getAbsolutePath(), String.valueOf(cuwu0.i))) : new File(dglk.b(dgll0.a, z).getAbsolutePath(), String.valueOf(cuwu0.i));
                            if(!ibuq.m(file0, file1)) {
                                try {
                                    if(!djad.u(file0, file1)) {
                                        dcvz.a.b().p("Rename file failed when move back, try to copy.", new Object[0]);
                                        djad.p(file0, file1);
                                    }
                                }
                                catch(IOException unused_ex) {
                                    dcvz.a.e().p("Failed to move received file back to the cache.", new Object[0]);
                                    goto label_32;
                                }
                            }
                            djas.c(dgll0.a, v, file1);
                            continue;
                        }
                    }
                label_32:
                    dcvz.a.e().h("Failed to cache downloaded file with hash %s", Long.valueOf(v));
                }
            }
            this.i(gyzg0);
            dgmg0 = dgmg.a;
        }
        else if(ibuq.m(dgnb0, dgmt.a)) {
            dgmg0 = null;
        }
        else {
            dgmg0 = dglx.a;
        }
        this.h(dgmg0);
    }

    private final void q(ichm ichm0, dgfc dgfc0, long v, dgfu dgfu0) {
        float f = dgfc0.a();
        Long long0 = dgfc0.f(v, dgfu0);
        if(long0 != null) {
            float f1 = dgfc0.a();
            long v1 = SystemClock.elapsedRealtime();
            if(v1 - this.r >= hvqs.W() && f1 > f) {
                this.r = v1;
                dgmr.c(ichm0, new dgmh(dgfc0.a(), dgfc0.g(), long0, dgfc0.c()));
            }
        }
    }
}

