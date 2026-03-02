import java.util.LinkedHashMap;
import java.util.Map;

public final class dgkd {
    public final dggf a;
    public final Map b;
    public final icig c;
    public final dgkm d;
    public ichm e;
    private final ibtx f;
    private final dcpn g;
    private dgfy h;
    private final icta i;

    public dgkd(dgkm dgkm0, ibtx ibtx0, dggf dggf0, dcpn dcpn0) {
        ibuq.f(ibtx0, "payloadTrackerCreator");
        ibuq.f(dggf0, "idGenerator");
        ibuq.f(dcpn0, "analyticsLogger");
        super();
        this.d = dgkm0;
        this.f = ibtx0;
        this.a = dggf0;
        this.g = dcpn0;
        this.b = new LinkedHashMap();
        this.i = new icta();
        this.c = new icjm(icii.b(new icib(new dgjx(this, null)), ((int)hvqs.ay()), 0, 2), new dgjy(this, null));
    }

    public final Object a(dgkn dgkn0, ibrl ibrl0) {
        Object object4;
        Object object3;
        icta icta2;
        Throwable throwable1;
        Object object2;
        icta icta1;
        dgkn dgkn1;
        dgjz dgjz0;
        if((ibrl0 instanceof dgjz)) {
            dgjz0 = (dgjz)ibrl0;
            int v = dgjz0.d;
            if((v & 0x80000000) == 0) {
                dgjz0 = new dgjz(this, ibrl0);
            }
            else {
                dgjz0.d = v - 0x80000000;
            }
        }
        else {
            dgjz0 = new dgjz(this, ibrl0);
        }
        Object object0 = dgjz0.b;
        Object object1 = ibrx.a;
        switch(dgjz0.d) {
            case 0: {
                ibnx.b(object0);
                icta icta0 = this.i;
                dgjz0.a = dgkn0;
                dgjz0.e = icta0;
                dgjz0.d = 1;
                if(icta0.b(dgjz0) != object1) {
                    dgkn1 = dgkn0;
                    icta1 = icta0;
                    goto label_25;
                }
                return object1;
            }
            case 1: {
                icta1 = dgjz0.e;
                dgkn1 = (dgkn)dgjz0.a;
                ibnx.b(object0);
                try {
                label_25:
                    this.h = dgkn1.g.a();
                    dgjz0.a = icta1;
                    dgjz0.e = null;
                    dgjz0.d = 2;
                    object2 = this.d.a(dgkn1, dgjz0);
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    icta2 = icta1;
                    break;
                }
                if(object2 != object1) {
                    object3 = object2;
                    icta2 = icta1;
                    goto label_43;
                }
                return object1;
            }
            case 2: {
                icta2 = (icta)dgjz0.a;
                try {
                    ibnx.b(object0);
                    object3 = ((ibnw)object0).a;
                label_43:
                    Throwable throwable2 = ibnw.a(object3);
                    if(throwable2 == null) {
                        ibom ibom0 = (ibom)object3;
                        dcvz.a.b().p("[ReceiveManager] started.", new Object[0]);
                        object4 = ibom.a;
                    }
                    else {
                        dcvz.a.b().h("[ReceiveManager] failed to start %s.", throwable2);
                        object4 = ibnx.a(throwable2);
                    }
                    goto label_55;
                }
                catch(Throwable throwable1) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        icta2.d();
        throw throwable1;
    label_55:
        icta2.d();
        return object4;
    }

    public final Object b(ibrl ibrl0) {
        icta icta2;
        Throwable throwable1;
        icta icta0;
        dgkb dgkb0;
        if((ibrl0 instanceof dgkb)) {
            dgkb0 = (dgkb)ibrl0;
            int v = dgkb0.c;
            if((v & 0x80000000) == 0) {
                dgkb0 = new dgkb(this, ibrl0);
            }
            else {
                dgkb0.c = v - 0x80000000;
            }
        }
        else {
            dgkb0 = new dgkb(this, ibrl0);
        }
        Object object0 = dgkb0.a;
        Object object1 = ibrx.a;
        switch(dgkb0.c) {
            case 0: {
                ibnx.b(object0);
                icta0 = this.i;
                dgkb0.d = icta0;
                dgkb0.c = 1;
                if(icta0.b(dgkb0) != object1) {
                    goto label_22;
                }
                return object1;
            }
            case 1: {
                icta icta1 = dgkb0.d;
                ibnx.b(object0);
                icta0 = icta1;
                try {
                label_22:
                    this.h = null;
                    dgkb0.d = icta0;
                    dgkb0.c = 2;
                    if(this.d.c(dgkb0) != object1) {
                        icta2 = icta0;
                        break;
                    }
                    return object1;
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    icta2 = icta0;
                    icta2.d();
                    throw throwable1;
                }
                icta2 = icta0;
                break;
            }
            case 2: {
                try {
                    icta2 = dgkb0.d;
                    ibnx.b(object0);
                    break;
                }
                catch(Throwable throwable1) {
                }
                icta2.d();
                throw throwable1;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        icta2.d();
        return ibom.a;
    }

    public final Object c(dgkn dgkn0, ibrl ibrl0) {
        Object object3;
        icta icta2;
        Throwable throwable1;
        Object object2;
        icta icta1;
        dgkn dgkn1;
        dgkc dgkc0;
        if((ibrl0 instanceof dgkc)) {
            dgkc0 = (dgkc)ibrl0;
            int v = dgkc0.d;
            if((v & 0x80000000) == 0) {
                dgkc0 = new dgkc(this, ibrl0);
            }
            else {
                dgkc0.d = v - 0x80000000;
            }
        }
        else {
            dgkc0 = new dgkc(this, ibrl0);
        }
        Object object0 = dgkc0.b;
        Object object1 = ibrx.a;
        switch(dgkc0.d) {
            case 0: {
                ibnx.b(object0);
                icta icta0 = this.i;
                dgkc0.a = dgkn0;
                dgkc0.e = icta0;
                dgkc0.d = 1;
                if(icta0.b(dgkc0) != object1) {
                    dgkn1 = dgkn0;
                    icta1 = icta0;
                    goto label_25;
                }
                return object1;
            }
            case 1: {
                icta1 = dgkc0.e;
                dgkn1 = (dgkn)dgkc0.a;
                ibnx.b(object0);
                try {
                label_25:
                    this.h = dgkn1.g.a();
                    dgkc0.a = icta1;
                    dgkc0.e = null;
                    dgkc0.d = 2;
                    object2 = this.d.e(dgkn1, dgkc0);
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    icta2 = icta1;
                    icta2.d();
                    throw throwable1;
                }
                if(object2 != object1) {
                    object3 = object2;
                    icta2 = icta1;
                    break;
                }
                return object1;
            }
            case 2: {
                icta2 = (icta)dgkc0.a;
                try {
                    ibnx.b(object0);
                    object3 = ((ibnw)object0).a;
                    break;
                }
                catch(Throwable throwable1) {
                }
                icta2.d();
                throw throwable1;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        icta2.d();
        return object3;
    }

    public final boolean d(long v) {
        synchronized(this) {
            dgym.a().a(new dgzt(v));
            boolean z = false;
            Object object0 = null;
            for(Object object1: this.b.values()) {
                if(((dgjr)object1).a != v) {
                    continue;
                }
                if(!z) {
                    object0 = object1;
                    z = true;
                    continue;
                }
                object0 = null;
                goto label_17;
            }
            if(!z) {
                object0 = null;
            }
        label_17:
            if(((dgjr)object0) == null) {
                return false;
            }
            ichm ichm0 = this.e;
            if(ichm0 == null) {
                ibuq.j("producerScope");
                ichm0 = null;
            }
            icbb.b(ichm0, null, null, new dgjs(((dgjr)object0), null), 3);
        }
        return true;
    }

    public final boolean e(long v) {
        synchronized(this) {
            boolean z = false;
            Object object0 = null;
            for(Object object1: this.b.values()) {
                if(((dgjr)object1).a != v) {
                    continue;
                }
                if(!z) {
                    object0 = object1;
                    z = true;
                    continue;
                }
                object0 = null;
                goto label_16;
            }
            if(!z) {
                object0 = null;
            }
        label_16:
            if(((dgjr)object0) == null) {
                return false;
            }
            ichm ichm0 = this.e;
            if(ichm0 == null) {
                ibuq.j("producerScope");
                ichm0 = null;
            }
            icbb.b(ichm0, null, null, new dgjt(((dgjr)object0), null), 3);
        }
        return true;
    }

    public final boolean f(long v) {
        synchronized(this) {
            dgym.a().a(new dgzw(v));
            boolean z = false;
            Object object0 = null;
            for(Object object1: this.b.values()) {
                if(((dgjr)object1).a != v) {
                    continue;
                }
                if(!z) {
                    object0 = object1;
                    z = true;
                    continue;
                }
                object0 = null;
                goto label_17;
            }
            if(!z) {
                object0 = null;
            }
        label_17:
            if(((dgjr)object0) == null) {
                return false;
            }
            ichm ichm0 = this.e;
            if(ichm0 == null) {
                ibuq.j("producerScope");
                ichm0 = null;
            }
            icbb.b(ichm0, null, null, new dgju(((dgjr)object0), null), 3);
        }
        return true;
    }

    public final void g(ichm ichm0, dgmo dgmo0, long v, String s) {
        synchronized(this) {
            dcvz.a.b().h("[NS_INCOMING_TRACKER] %s", dgmo0);
            if((dgmo0 instanceof dgmm)) {
                dgym.a().a(new dhdd(v, false));
                dgjq.a(ichm0, new dgjj(v, ((dgmm)dgmo0).a, ((dgmm)dgmo0).b, ((dgmm)dgmo0).c, ((dgmm)dgmo0).d));
            }
            else if((dgmo0 instanceof dgmn)) {
                if(((dgmn)dgmo0).c) {
                    dgym.a().a(new dhdd(v, true));
                }
                dgjq.a(ichm0, new dgjo(v, ((dgmn)dgmo0).a, ((dgmn)dgmo0).b, ((dgmn)dgmo0).d));
            }
            else if((dgmo0 instanceof dgmh)) {
                dgjq.a(ichm0, new dgjl(v, ((dgmh)dgmo0).a, ((dgmh)dgmo0).b, ((dgmh)dgmo0).c, ((dgmh)dgmo0).d));
            }
            else if((dgmo0 instanceof dgml)) {
                dgjq.a(ichm0, new dgjn(v));
            }
            else if((dgmo0 instanceof dgmj)) {
                dgjq.a(ichm0, new dgjm(v, ((dgmj)dgmo0).a));
            }
            else if((dgmo0 instanceof dglz)) {
                dgjq.a(ichm0, new dgjg(v));
            }
            else if((dgmo0 instanceof dgly)) {
                dgjq.a(ichm0, new dgjf(v));
            }
            else if(!(dgmo0 instanceof dglx) && !(dgmo0 instanceof dglw)) {
                if((dgmo0 instanceof dgma) || (dgmo0 instanceof dgmc) || (dgmo0 instanceof dgmd) || (dgmo0 instanceof dgme) || (dgmo0 instanceof dgmf) || (dgmo0 instanceof dgmg) || (dgmo0 instanceof dgmi) || (dgmo0 instanceof dgmk)) {
                    int v2 = dgjq.b(dgmo0);
                    if(v2 == 0) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    dgjq.a(ichm0, new dgjh(v, v2));
                }
                else if((dgmo0 instanceof dgmb)) {
                    dgjq.a(ichm0, new dgji(v, ((dgmb)dgmo0).a, ((dgmb)dgmo0).b, ((dgmb)dgmo0).c, ((dgmb)dgmo0).d, ((dgmb)dgmo0).e, ((dgmb)dgmo0).f, ((dgmb)dgmo0).g));
                }
                else {
                    if(!ibuq.m(dgmo0, dglv.a)) {
                        throw new ibnq();
                    }
                    dgjq.a(ichm0, new dgje(v));
                }
            }
            if(dgjq.b(dgmo0) != 0 || (dgmo0 instanceof dgly) || (dgmo0 instanceof dgmj) || (dgmo0 instanceof dglw) || (dgmo0 instanceof dglx)) {
                dgym.a().a(new dhch(v));
                dgjr dgjr0 = (dgjr)this.b.remove(s);
                if(dgjr0 != null) {
                    iceb.a(dgjr0.b);
                }
            }
        }
    }

    public final void h(ichm ichm0, long v, String s, icig icig0) {
        synchronized(this) {
            dgym.a().a(new dhcm(v, s, this.g.i));
            Object object0 = this.f.a(s, icig0, this.h);
            dgjr dgjr0 = new dgjr(v, ((dgop)object0), icir.d(new iclv(new icib(new dgod(((dgop)object0), null)), new dgka(this, ichm0, v, s, null)), ichm0));
            this.b.put(s, dgjr0);
        }
    }
}

