import android.accounts.Account;
import com.google.android.gms.nearby.sharing.DeviceVisibility;
import java.util.concurrent.TimeUnit;

public final class ddag {
    public final dcmf a;
    public final icmq b;
    public final icmq c;
    public final icmq d;
    public final icmq e;
    public final icmq f;
    public final icmq g;
    public final icmq h;
    public final icmq i;
    public final icmq j;
    public final icmq k;
    public final icmq l;
    public final dcxk m;
    private final icmq n;

    public ddag(dcmf dcmf0, dcxk dcxk0) {
        ibuq.f(dcmf0, "sharingClient");
        ibuq.f(dcxk0, "deviceConfigRepository");
        icck icck0 = iccl.b(cclw.e);
        ibuq.f(dcmf0, "sharingClient");
        ibuq.f(dcxk0, "deviceConfigRepository");
        super();
        this.a = dcmf0;
        this.m = dcxk0;
        icig icig0 = dcmt.c(dcmf0);
        icmq icmq0 = iclp.a(new icjo(new ddae(null), icig0), icck0, icmy.a(0L, 3), 1);
        this.n = icmq0;
        icmq icmq1 = iclp.a(dcvs.a(icmq0, new dcze(null), new dczf(this, null)), icck0, icmy.a(0L, 3), 1);
        this.b = icmq1;
        this.c = iclp.a(dcvs.b(icmq0, new dczi(this, null)), icck0, icmy.a(0L, 3), 1);
        this.d = iclp.a(dcvs.b(icmq0, new dczj(this, null)), icck0, icmy.a(0L, 3), 1);
        this.e = iclp.a(dcvs.b(icmq0, new dczh(this, null)), icck0, icmy.a(0L, 3), 1);
        this.f = iclp.a(dcvs.b(icmq0, new dczm(this, null)), icck0, icmy.a(0L, 3), 1);
        iclp.a(dcvs.b(icmq0, new dczl(this, null)), icck0, icmy.a(0L, 3), 1);
        this.g = iclp.a(dcvs.b(icmq0, new dczk(this, null)), icck0, icmy.a(0L, 3), 1);
        this.h = iclp.a(dcvs.b(icmq0, new dczg(this, null)), icck0, icmy.a(0L, 3), 1);
        this.i = iclp.a(dcvs.b(icmq0, new dczn(this, null)), icck0, icmy.a(0L, 3), 1);
        this.j = iclp.a(new dczx(icmq1, this), icck0, icmy.a(0L, 3), 1);
        this.k = iclp.a(new ddaa(icmq1, this), icck0, icmy.a(0L, 3), 1);
        this.l = iclp.a(new ddad(icmq1, this), icck0, icmy.a(0L, 3), 1);
    }

    public final Object a(ibrl ibrl0) {
        Object object0 = dcwp.a(this.a.d(), ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    public final Object b(ibrl ibrl0) {
        Object object0 = dcwp.a(evrg.h(new evql[]{this.a.q(), this.a.B(true)}), ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    public final Object c(ibrl ibrl0) {
        Object object0 = iccl.a(new dczq(this, null), ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    public final Object d(Account account0, ibrl ibrl0) {
        Object object0 = dcwp.a(this.a.x(account0), ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    public final Object e(String s, ibrl ibrl0) {
        Object object0 = dcwp.a(this.a.z(s), ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    public final Object f(DeviceVisibility deviceVisibility0, ibrl ibrl0) {
        Object object0 = dcwp.a(this.a.A(deviceVisibility0), ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    public final Object g(ibrl ibrl0) {
        dcxk dcxk1;
        dczr dczr0;
        if((ibrl0 instanceof dczr)) {
            dczr0 = (dczr)ibrl0;
            int v = dczr0.c;
            if((v & 0x80000000) == 0) {
                dczr0 = new dczr(this, ibrl0);
            }
            else {
                dczr0.c = v - 0x80000000;
            }
        }
        else {
            dczr0 = new dczr(this, ibrl0);
        }
        Object object0 = dczr0.a;
        Object object1 = ibrx.a;
        switch(dczr0.c) {
            case 0: {
                ibnx.b(object0);
                dcxk dcxk0 = this.m;
                dczr0.d = dcxk0;
                dczr0.c = 1;
                Object object2 = icll.a(this.b, dczr0);
                if(object2 != object1) {
                    object0 = object2;
                    dcxk1 = dcxk0;
                    dczr0.d = null;
                    dczr0.c = 2;
                    return dcxk1.e((((Account)object0) == null ? null : ((Account)object0).name), dczr0) != object1 ? ibom.a : object1;
                }
                return object1;
            }
            case 1: {
                dcxk1 = dczr0.d;
                ibnx.b(object0);
                dczr0.d = null;
                dczr0.c = 2;
                return dcxk1.e((((Account)object0) == null ? null : ((Account)object0).name), dczr0) != object1 ? ibom.a : object1;
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

    public final Object h(ibrl ibrl0) {
        dcxk dcxk1;
        dczs dczs0;
        if((ibrl0 instanceof dczs)) {
            dczs0 = (dczs)ibrl0;
            int v = dczs0.c;
            if((v & 0x80000000) == 0) {
                dczs0 = new dczs(this, ibrl0);
            }
            else {
                dczs0.c = v - 0x80000000;
            }
        }
        else {
            dczs0 = new dczs(this, ibrl0);
        }
        Object object0 = dczs0.a;
        Object object1 = ibrx.a;
        switch(dczs0.c) {
            case 0: {
                ibnx.b(object0);
                dcxk dcxk0 = this.m;
                dczs0.d = dcxk0;
                dczs0.c = 1;
                Object object2 = icll.a(this.b, dczs0);
                if(object2 != object1) {
                    object0 = object2;
                    dcxk1 = dcxk0;
                    goto label_24;
                }
                return object1;
            }
            case 1: {
                dcxk1 = dczs0.d;
                ibnx.b(object0);
            label_24:
                dczs0.d = null;
                dczs0.c = 2;
                dcwy dcwy0 = new dcwy(new dcwx((((Account)object0) == null ? null : ((Account)object0).name)));
                Object object3 = icpu.c(dcxk1.a.b(dcwy0, gmap.a), dczs0);
                if(object3 != object1) {
                    object3 = ibom.a;
                }
                return object3 != object1 ? ibom.a : object1;
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

    public final Object i(ibrl ibrl0) {
        dcxk dcxk1;
        dczt dczt0;
        if((ibrl0 instanceof dczt)) {
            dczt0 = (dczt)ibrl0;
            int v = dczt0.c;
            if((v & 0x80000000) == 0) {
                dczt0 = new dczt(this, ibrl0);
            }
            else {
                dczt0.c = v - 0x80000000;
            }
        }
        else {
            dczt0 = new dczt(this, ibrl0);
        }
        Object object0 = dczt0.a;
        Object object1 = ibrx.a;
        switch(dczt0.c) {
            case 0: {
                ibnx.b(object0);
                dcxk dcxk0 = this.m;
                dczt0.d = dcxk0;
                dczt0.c = 1;
                Object object2 = icll.a(this.b, dczt0);
                if(object2 != object1) {
                    object0 = object2;
                    dcxk1 = dcxk0;
                    goto label_24;
                }
                return object1;
            }
            case 1: {
                dcxk1 = dczt0.d;
                ibnx.b(object0);
            label_24:
                dczt0.d = null;
                dczt0.c = 2;
                dcxa dcxa0 = new dcxa(new dcwz((((Account)object0) == null ? null : ((Account)object0).name)));
                Object object3 = icpu.c(dcxk1.a.b(dcxa0, gmap.a), dczt0);
                if(object3 != object1) {
                    object3 = ibom.a;
                }
                return object3 != object1 ? ibom.a : object1;
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

    public final Object j(ibrl ibrl0) {
        dbyl dbyl0 = DeviceVisibility.a.a();
        dbyl0.e = true;
        DeviceVisibility deviceVisibility0 = dbyl0.a();
        Object object0 = dcwp.a(this.a.A(deviceVisibility0), ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    public final Object k(boolean z, ibrl ibrl0) {
        Object object0 = dcwp.a(this.a.C(z), ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    public final Object l(ibrl ibrl0) {
        dbyl dbyl0 = DeviceVisibility.a.a();
        dbyl0.e = false;
        dbyl0.d = TimeUnit.SECONDS.toMillis(hvqs.C());
        DeviceVisibility deviceVisibility0 = dbyl0.a();
        Object object0 = dcwp.a(this.a.A(deviceVisibility0), ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    public final Object m(int v, ibrl ibrl0) {
        dczu dczu0;
        if((ibrl0 instanceof dczu)) {
            dczu0 = (dczu)ibrl0;
            int v1 = dczu0.d;
            if((v1 & 0x80000000) == 0) {
                dczu0 = new dczu(this, ibrl0);
            }
            else {
                dczu0.d = v1 - 0x80000000;
            }
        }
        else {
            dczu0 = new dczu(this, ibrl0);
        }
        Object object0 = dczu0.b;
        Object object1 = ibrx.a;
        switch(dczu0.d) {
            case 0: {
                ibnx.b(object0);
                dczu0.a = v;
                dczu0.d = 1;
                object0 = icll.a(this.d, dczu0);
                if(object0 != object1) {
                    goto label_21;
                }
                return object1;
            }
            case 1: {
                v = dczu0.a;
                ibnx.b(object0);
            label_21:
                dbyl dbyl0 = ((DeviceVisibility)object0).a();
                dbyl0.a = v;
                if(!((DeviceVisibility)object0).j) {
                    dbyl0.d = TimeUnit.SECONDS.toMillis(hvqs.C());
                }
                DeviceVisibility deviceVisibility0 = dbyl0.a();
                evql evql0 = this.a.A(deviceVisibility0);
                dczu0.d = 2;
                return dcwp.a(evql0, dczu0) != object1 ? ibom.a : object1;
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

    public final Object n(ibrl ibrl0) {
        Object object0 = dcwp.a(this.a.y(3), ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    public final Object o(ibrl ibrl0) {
        Object object0 = dcwp.a(this.a.y(2), ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    public final Object p(ibrl ibrl0) {
        Object object0 = this.m(0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    public final Object q(ibrl ibrl0) {
        ddaf ddaf0;
        if((ibrl0 instanceof ddaf)) {
            ddaf0 = (ddaf)ibrl0;
            int v = ddaf0.c;
            if((v & 0x80000000) == 0) {
                ddaf0 = new ddaf(this, ibrl0);
            }
            else {
                ddaf0.c = v - 0x80000000;
            }
        }
        else {
            ddaf0 = new ddaf(this, ibrl0);
        }
        Object object0 = ddaf0.a;
        Object object1 = ibrx.a;
        switch(ddaf0.c) {
            case 0: {
                ibnx.b(object0);
                ddaf0.c = 1;
                object0 = icll.a(this.b, ddaf0);
                if(object0 != object1) {
                    goto label_19;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
            label_19:
                if(((Account)object0) == null) {
                    ddaf0.c = 2;
                    return this.l(ddaf0) != object1 ? ibom.a : object1;
                }
                ddaf0.c = 3;
                object0 = icll.a(this.d, ddaf0);
                if(object0 != object1) {
                    goto label_30;
                }
                break;
            }
            case 3: {
                ibnx.b(object0);
            label_30:
                int v1 = ((DeviceVisibility)object0).g;
                if(v1 != -1 && v1 != 0 && v1 != 2) {
                    ddaf0.c = 5;
                    return this.m(v1, ddaf0) != object1 ? ibom.a : object1;
                }
                ddaf0.c = 4;
                if(this.m(4, ddaf0) != object1) {
                    return ibom.a;
                }
                break;
            }
            case 2: 
            case 4: 
            case 5: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return object1;
    }
}

