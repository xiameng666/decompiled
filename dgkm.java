import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jeb.synthetic.FIN;

public final class dgkm {
    public final Context a;
    public final dgko b;
    public final icig c;
    private final cuvm d;
    private final ibnn e;
    private dgkn f;
    private final dghz g;
    private final dgwm h;
    private final icta i;

    public dgkm(Context context0, dgko dgko0, dghz dghz0, dgwm dgwm0, cuvm cuvm0) {
        ibuq.f(context0, "context");
        super();
        this.a = context0;
        this.b = dgko0;
        this.g = dghz0;
        this.h = dgwm0;
        this.d = cuvm0;
        this.e = new ibnz(new dgke(this));
        this.i = new icta();
        this.c = icii.b(new icib(new dgkg(this, null)), ((int)hvqs.ay()), 0, 2);
    }

    public final Object a(dgkn dgkn0, ibrl ibrl0) {
        Object object3;
        icta icta2;
        Throwable throwable1;
        Object object2;
        icta icta1;
        dgkn dgkn1;
        dgkh dgkh0;
        if((ibrl0 instanceof dgkh)) {
            dgkh0 = (dgkh)ibrl0;
            int v = dgkh0.d;
            if((v & 0x80000000) == 0) {
                dgkh0 = new dgkh(this, ibrl0);
            }
            else {
                dgkh0.d = v - 0x80000000;
            }
        }
        else {
            dgkh0 = new dgkh(this, ibrl0);
        }
        Object object0 = dgkh0.b;
        Object object1 = ibrx.a;
        switch(dgkh0.d) {
            case 0: {
                ibnx.b(object0);
                icta icta0 = this.i;
                dgkh0.a = dgkn0;
                dgkh0.e = icta0;
                dgkh0.d = 1;
                if(icta0.b(dgkh0) != object1) {
                    dgkn1 = dgkn0;
                    icta1 = icta0;
                    goto label_25;
                }
                return object1;
            }
            case 1: {
                icta1 = dgkh0.e;
                dgkn1 = (dgkn)dgkh0.a;
                ibnx.b(object0);
                try {
                label_25:
                    dgkh0.a = icta1;
                    dgkh0.e = null;
                    dgkh0.d = 2;
                    object2 = this.b(dgkn1, dgkh0);
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
                icta2 = (icta)dgkh0.a;
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

    public final Object b(dgkn dgkn0, ibrl ibrl0) {
        Object object2;
        dgki dgki0;
        if((ibrl0 instanceof dgki)) {
            dgki0 = (dgki)ibrl0;
            int v = dgki0.c;
            if((v & 0x80000000) == 0) {
                dgki0 = new dgki(this, ibrl0);
            }
            else {
                dgki0.c = v - 0x80000000;
            }
        }
        else {
            dgki0 = new dgki(this, ibrl0);
        }
        Object object0 = dgki0.a;
        Object object1 = ibrx.a;
        switch(dgki0.c) {
            case 0: {
                ibnx.b(object0);
                byte[] arr_b = this.j(this.g(), dgkn0);
                dgld dgld0 = this.h(dgkn0);
                dgki0.d = dgkn0;
                dgki0.c = 1;
                object2 = this.b.a(arr_b, dgld0, dgki0);
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                dgkn0 = dgki0.d;
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Throwable throwable0 = ibnw.a(object2);
        if(throwable0 == null) {
            ibom ibom0 = (ibom)object2;
            dcvz.a.b().p("[broadcast controller] started.", new Object[0]);
            this.f = dgkn0;
            return ibom.a;
        }
        dcvz.a.b().h("[broadcast controller] failed to start %s.", throwable0);
        return ibnx.a(throwable0);
    }

    public final Object c(ibrl ibrl0) {
        icta icta2;
        Throwable throwable1;
        icta icta0;
        dgkj dgkj0;
        if((ibrl0 instanceof dgkj)) {
            dgkj0 = (dgkj)ibrl0;
            int v = dgkj0.c;
            if((v & 0x80000000) == 0) {
                dgkj0 = new dgkj(this, ibrl0);
            }
            else {
                dgkj0.c = v - 0x80000000;
            }
        }
        else {
            dgkj0 = new dgkj(this, ibrl0);
        }
        Object object0 = dgkj0.a;
        Object object1 = ibrx.a;
        switch(dgkj0.c) {
            case 0: {
                ibnx.b(object0);
                icta0 = this.i;
                dgkj0.d = icta0;
                dgkj0.c = 1;
                if(icta0.b(dgkj0) != object1) {
                    goto label_22;
                }
                return object1;
            }
            case 1: {
                icta icta1 = dgkj0.d;
                ibnx.b(object0);
                icta0 = icta1;
                try {
                label_22:
                    dgkj0.d = icta0;
                    dgkj0.c = 2;
                    if(this.d(dgkj0) != object1) {
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
                    icta2 = dgkj0.d;
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

    public final Object d(ibrl ibrl0) {
        dgkk dgkk0;
        if((ibrl0 instanceof dgkk)) {
            dgkk0 = (dgkk)ibrl0;
            int v = dgkk0.c;
            if((v & 0x80000000) == 0) {
                dgkk0 = new dgkk(this, ibrl0);
            }
            else {
                dgkk0.c = v - 0x80000000;
            }
        }
        else {
            dgkk0 = new dgkk(this, ibrl0);
        }
        Object object0 = dgkk0.a;
        Object object1 = ibrx.a;
        switch(dgkk0.c) {
            case 0: {
                ibnx.b(object0);
                if(this.f == null) {
                    dcvz.a.b().p("[broadcast controller] already stopped.", new Object[0]);
                    return ibom.a;
                }
                dgkk0.c = 1;
                if(this.b.b(dgkk0) == object1) {
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
        this.f = null;
        return ibom.a;
    }

    public final Object e(dgkn dgkn0, ibrl ibrl0) {
        dgkn dgkn2;
        Object object4;
        icta icta2;
        Object object3;
        Object object2;
        icta icta1;
        dgkn dgkn1;
        dgkl dgkl0;
        if((ibrl0 instanceof dgkl)) {
            dgkl0 = (dgkl)ibrl0;
            int v = dgkl0.d;
            if((v & 0x80000000) == 0) {
                dgkl0 = new dgkl(this, ibrl0);
            }
            else {
                dgkl0.d = v - 0x80000000;
            }
        }
        else {
            dgkl0 = new dgkl(this, ibrl0);
        }
        Object object0 = dgkl0.b;
        Object object1 = ibrx.a;
        switch(dgkl0.d) {
            case 0: {
                ibnx.b(object0);
                icta icta0 = this.i;
                dgkl0.a = dgkn0;
                dgkl0.e = icta0;
                dgkl0.d = 1;
                if(icta0.b(dgkl0) == object1) {
                    return object1;
                }
                dgkn1 = dgkn0;
                icta1 = icta0;
                goto label_25;
            }
            case 1: {
                icta1 = dgkl0.e;
                dgkn1 = (dgkn)dgkl0.a;
                ibnx.b(object0);
                try {
                label_25:
                    dglj dglj0 = dgkn1.a;
                    dglj dglj1 = dglj.e;
                    if(dglj0 == dglj1 && this.f != null) {
                        dcvz.a.b().p("[broadcast controller] suspending.", new Object[0]);
                        dgkl0.a = icta1;
                        dgkl0.e = null;
                        dgkl0.d = 2;
                        if(this.d(dgkl0) == object1) {
                            return object1;
                        }
                        icta2 = icta1;
                        object3 = ibom.a;
                        break;
                    }
                    else if(this.f == null) {
                        if(dglj0 == dglj1) {
                            object2 = ibom.a;
                        }
                        else {
                            dgkl0.a = icta1;
                            dgkl0.e = null;
                            dgkl0.d = 4;
                            object2 = this.b(dgkn1, dgkl0);
                            if(object2 == object1) {
                                return object1;
                            }
                        }
                        object3 = object2;
                        icta2 = icta1;
                    }
                    else {
                        byte[] arr_b = this.j(this.g(), dgkn1);
                        dgld dgld0 = this.h(dgkn1);
                        dgkl0.a = dgkn1;
                        dgkl0.e = icta1;
                        dgkl0.d = 3;
                        object4 = this.b.c(arr_b, dgld0, dgkl0);
                        if(object4 == object1) {
                            return object1;
                        }
                        dgkn2 = dgkn1;
                        this.f = dgkn2;
                        icta2 = icta1;
                        object3 = object4;
                        break;
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    icta2 = icta1;
                    icta2.d();
                    throw throwable1;
                }
                try {
                    icta2 = icta1;
                    object3 = ibom.a;
                    break;
                }
                catch(Throwable throwable1) {
                    icta2.d();
                    throw throwable1;
                }
            }
            case 2: {
                icta2 = (icta)dgkl0.a;
                try {
                    ibnx.b(object0);
                    object3 = ibom.a;
                    break;
                }
                catch(Throwable throwable1) {
                    icta2.d();
                    throw throwable1;
                }
            }
            case 3: {
                icta1 = dgkl0.e;
                dgkn2 = (dgkn)dgkl0.a;
                try {
                    ibnx.b(object0);
                    object4 = ((ibnw)object0).a;
                    this.f = dgkn2;
                    icta2 = icta1;
                    object3 = object4;
                    break;
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    icta2 = icta1;
                    icta2.d();
                    throw throwable1;
                }
            }
            case 4: {
                icta2 = (icta)dgkl0.a;
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

    public final void f(ichm ichm0, dglb dglb0, Map map0) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if((dglb0 instanceof dgky)) {
            dghl dghl0 = new dghl(this.a, this.d, ((dgky)dglb0).a);
            map0.put(((dgky)dglb0).a, dghl0);
            icig icig0 = dghl0.a(((dgky)dglb0).b);
            Object object0 = ichm0.b(new dgli(((dgky)dglb0).a, icig0));
            if(!(object0 instanceof icgz)) {
                goto label_18;
            }
            Throwable throwable0 = icha.b(object0);
            dcvz.a.e().f(throwable0).p("Failed to send BroadcastControllerEvent.", new Object[0]);
            FIN.finallyExec$NT(v);
            return;
        }
        if((dglb0 instanceof dgkx)) {
            dghl dghl1 = (dghl)map0.get(((dgkx)dglb0).a);
            if(dghl1 != null) {
                dghl1.b(((dgkx)dglb0).b);
                FIN.finallyExec$NT(v);
                return;
            }
        label_18:
            FIN.finallyExec$NT(v);
            return;
        }
        if((dglb0 instanceof dgkz)) {
            dghl dghl2 = (dghl)map0.get(((dgkz)dglb0).a);
            if(dghl2 == null) {
                dcvz.a.e().h("Result event %s received after endpoint disconnected ", dglb0);
                FIN.finallyExec$NT(v);
                return;
            }
            dghl2.c(((dgkz)dglb0).b);
            FIN.finallyExec$NT(v);
            return;
        }
        if((dglb0 instanceof dgla)) {
            Object object1 = map0.remove(((dgla)dglb0).a);
            if(object1 != null) {
                ((dghl)object1).d();
                FIN.finallyCodeBegin$NT(v);
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new ibnq();
    }

    private final int g() {
        return ((Number)this.e.a()).intValue();
    }

    private final dgld h(dgkn dgkn0) {
        String s;
        List list0;
        icnj icnj1;
        Set set1;
        int v5;
        int v;
        dgwm dgwm0 = this.h;
        icnj icnj0 = dgwm0.d;
        if(((dgvu)icnj0.b()).a()) {
            v = (int)hvqs.aa();
        }
        else {
            switch(dgkn0.a.ordinal()) {
                case 0: {
                    v = 3;
                    break;
                }
                case 1: {
                    v = (int)hvqs.Z();
                    break;
                }
                case 2: {
                    v = (int)hvqs.Y();
                    break;
                }
                case 3: {
                    v = (int)hvqs.aa();
                    break;
                }
                case 4: {
                    v = (int)hvqs.ab();
                    break;
                }
                default: {
                    throw new ibnq();
                }
            }
        }
        long v1 = dgkn0.b;
        dglj dglj0 = dgkn0.a;
        dglj dglj1 = dglj.a;
        int v2 = dglj0 == dglj1 ? 0 : 1;
        Set set0 = dglj0 == dglj1 && ((Boolean)dgwm0.e.b()).booleanValue() ? dgkn0.e : ibpu.a;
        int v3 = this.g();
        boolean z = dgkn0.g instanceof dglg;
        int v4 = dglj0.ordinal();
        switch(v4) {
            case 0: {
                v5 = 1;
                break;
            }
            case 1: {
                v5 = dgkn0.d && z ? 1 : 0;
                break;
            }
            case 2: {
                v5 = 0;
                break;
            }
            default: {
                if(v4 != 3 && v4 != 4) {
                    throw new ibnq();
                }
                v5 = 0;
            }
        }
        boolean z1 = djbz.h(this.a);
        ibqm ibqm0 = new ibqm(null);
        if(((dgvu)icnj0.b()).a()) {
            set1 = set0;
            icnj1 = icnj0;
            hfuf hfuf5 = hvqs.aJ().b;
            ibuq.e(hfuf5, "getElementList(...)");
            list0 = ibpo.ar(hfuf5);
        }
        else {
            set1 = set0;
            int v6 = dglj0.ordinal();
            if(v6 == 0) {
                icnj1 = icnj0;
                hfuf hfuf4 = hvqs.aG().b;
                ibuq.e(hfuf4, "getElementList(...)");
                list0 = ibpo.ar(hfuf4);
            }
            else {
                icnj1 = icnj0;
                switch(v6) {
                    case 1: {
                        hfuf hfuf0 = hvqs.aI().b;
                        ibuq.e(hfuf0, "getElementList(...)");
                        list0 = ibpo.ar(hfuf0);
                        break;
                    }
                    case 2: {
                        hfuf hfuf1 = hvqs.aH().b;
                        ibuq.e(hfuf1, "getElementList(...)");
                        list0 = ibpo.ar(hfuf1);
                        break;
                    }
                    case 3: {
                        hfuf hfuf2 = hvqs.aJ().b;
                        ibuq.e(hfuf2, "getElementList(...)");
                        list0 = ibpo.ar(hfuf2);
                        break;
                    }
                    case 4: {
                        hfuf hfuf3 = hvqs.aK().b;
                        ibuq.e(hfuf3, "getElementList(...)");
                        list0 = ibpo.ar(hfuf3);
                        break;
                    }
                    default: {
                        throw new ibnq();
                    }
                }
            }
        }
        if(hvqz.B() && dglj0 != dglj.d && !((dgvu)icnj1.b()).b() && z1) {
            hfuf hfuf6 = hvqs.aN().b;
            ibuq.e(hfuf6, "getElementList(...)");
            ibqm0.addAll(hfuf6);
        }
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator0 = list0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(!ibqm0.contains(Integer.valueOf(((Number)object0).intValue()))) {
                arrayList0.add(object0);
            }
            iterator0 = iterator0;
            v5 = v5;
        }
        ibqm0.addAll(arrayList0);
        if(dglj0 != dglj1 && !z1) {
            ibqm0.removeAll(ibqg.c(new Integer[]{((int)5), ((int)6)}));
        }
        if(v5 == 0) {
            ibqm0.remove(Integer.valueOf(2));
        }
        int v7 = dgkn0.c;
        if(!this.i(v7)) {
            ibqm0.remove(Integer.valueOf(9));
        }
        List list1 = ibpo.a(ibqm0);
        ibqm ibqm1 = new ibqm(null);
        hfuf hfuf7 = hvog.bf().b;
        ibuq.e(hfuf7, "getElementList(...)");
        ibqm1.addAll(hfuf7);
        if(!this.i(v7)) {
            cunf cunf0 = dcvz.a.b();
            switch(v7) {
                case 1: {
                    s = "OFFLINE";
                    break;
                }
                case 2: {
                    s = "ONLINE";
                    break;
                }
                case 3: {
                    s = "WIFI_ONLY";
                    break;
                }
                default: {
                    s = a.f(v7, "UNKNOWN[", "]");
                }
            }
            cunf0.h("WEBRTC disabled: dataUsage %s", s);
            ibqm1.remove(Integer.valueOf(9));
        }
        if(hvqz.af() && !ibqm1.contains(Integer.valueOf(9)) && v7 != 1) {
            ibqm1.add(Integer.valueOf(12));
        }
        List list2 = ibpo.a(ibqm1);
        boolean z2 = hvqz.N();
        boolean z3 = hvqz.O();
        return ((dgvu)icnj1.b()).a() || dglj0 == dglj.d || dgkn0.h && dglj0 != dglj1 && dglj0 != dglj.b ? new dgld(v, v1, set1, v3, list1, list2, dgkn0.i, z2, z3, ((boolean)(v2 ^ 1)), false, dgkn0.h) : new dgld(v, v1, set1, v3, list1, list2, dgkn0.i, z2, z3, ((boolean)(v2 ^ 1)), true, dgkn0.h);
    }

    private final boolean i(int v) {
        if(v == 1) {
            return false;
        }
        dgvo dgvo0 = (dgvo)this.h.a().b();
        return dgvo0.a || !dgvo0.b || dgvo0.c ? false : v != 3 || !dgvo0.d;
    }

    private final byte[] j(int v, dgkn dgkn0) {
        return new dgej(1, this.g.a(), v, dgkn0.g.b(), dgkn0.g.c(), dgkn0.f).b();
    }
}

