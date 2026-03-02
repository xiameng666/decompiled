import java.util.concurrent.CancellationException;

public final class dglu {
    public final String a;
    public final icig b;
    public final cuvm c;
    public ichm d;

    public dglu(String s, icig icig0, cuvm cuvm0) {
        ibuq.f(s, "endpointId");
        ibuq.f(icig0, "connectionsEvents");
        super();
        this.a = s;
        this.b = icig0;
        this.c = cuvm0;
    }

    public final Object a(long v, ibrl ibrl0) {
        dgln dgln0;
        if((ibrl0 instanceof dgln)) {
            dgln0 = (dgln)ibrl0;
            int v1 = dgln0.d;
            if((v1 & 0x80000000) == 0) {
                dgln0 = new dgln(this, ibrl0);
            }
            else {
                dgln0.d = v1 - 0x80000000;
            }
        }
        else {
            dgln0 = new dgln(this, ibrl0);
        }
        Object object0 = dgln0.b;
        Object object1 = ibrx.a;
        switch(dgln0.d) {
            case 0: {
                ibnx.b(object0);
                evql evql0 = this.c.d(v);
                try {
                    dgln0.a = v;
                    dgln0.d = 1;
                    object0 = ictn.b(evql0, dgln0);
                    if(object0 == object1) {
                        return object1;
                    label_20:
                        v = dgln0.a;
                        ibnx.b(object0);
                    }
                }
                catch(Throwable throwable0) {
                    object0 = ibnx.a(throwable0);
                }
                break;
            }
            case 1: {
                goto label_20;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Throwable throwable1 = ibnw.a(object0);
        if((throwable1 instanceof CancellationException)) {
            throw throwable1;
        }
        Throwable throwable2 = ibnw.a(object0);
        if(throwable2 != null) {
            if(dcwk.a(throwable2) == 8014) {
                dcvz.a.e().f(throwable2).h("[NS_ERROR] NC cancel payload %s while it\'s not sent yet.", new Long(v));
                return ibom.a;
            }
            dcvz.a.e().f(throwable2).h("[NS_ERROR] NC cancel error %s", new Integer(dcwk.a(throwable2)));
            ichm ichm0 = this.d;
            if(ichm0 != null) {
                dglm.a(ichm0, new dggr(throwable2));
            }
        }
        return ibom.a;
    }

    public final Object b(cuwu cuwu0, ibrl ibrl0) {
        dglo dglo0;
        if((ibrl0 instanceof dglo)) {
            dglo0 = (dglo)ibrl0;
            int v = dglo0.c;
            if((v & 0x80000000) == 0) {
                dglo0 = new dglo(this, ibrl0);
            }
            else {
                dglo0.c = v - 0x80000000;
            }
        }
        else {
            dglo0 = new dglo(this, ibrl0);
        }
        Object object0 = dglo0.a;
        Object object1 = ibrx.a;
        switch(dglo0.c) {
            case 0: {
                ibnx.b(object0);
                evql evql0 = this.c.k(this.a, cuwu0);
                try {
                    dglo0.c = 1;
                    object0 = ictn.b(evql0, dglo0);
                    if(object0 == object1) {
                        return object1;
                    label_19:
                        ibnx.b(object0);
                    }
                }
                catch(Throwable throwable0) {
                    object0 = ibnx.a(throwable0);
                }
                break;
            }
            case 1: {
                goto label_19;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Throwable throwable1 = ibnw.a(object0);
        if((throwable1 instanceof CancellationException)) {
            throw throwable1;
        }
        Throwable throwable2 = ibnw.a(object0);
        if(throwable2 != null) {
            dcvz.a.e().f(throwable2).p("[NS_ERROR] NC failed to send payload.", new Object[0]);
            ichm ichm0 = this.d;
            if(ichm0 != null) {
                dglm.a(ichm0, new dggr(throwable2));
            }
        }
        return ibom.a;
    }

    public final Object c(String s, ibrl ibrl0) {
        dglp dglp0;
        if((ibrl0 instanceof dglp)) {
            dglp0 = (dglp)ibrl0;
            int v = dglp0.c;
            if((v & 0x80000000) == 0) {
                dglp0 = new dglp(this, ibrl0);
            }
            else {
                dglp0.c = v - 0x80000000;
            }
        }
        else {
            dglp0 = new dglp(this, ibrl0);
        }
        Object object0 = dglp0.a;
        Object object1 = ibrx.a;
        switch(dglp0.c) {
            case 0: {
                ibnx.b(object0);
                evql evql0 = this.c.l(s);
                try {
                    dglp0.d = s;
                    dglp0.c = 1;
                    object0 = ictn.b(evql0, dglp0);
                    if(object0 == object1) {
                        return object1;
                    label_20:
                        s = dglp0.d;
                        ibnx.b(object0);
                    }
                }
                catch(Throwable throwable0) {
                    object0 = ibnx.a(throwable0);
                }
                break;
            }
            case 1: {
                goto label_20;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Throwable throwable1 = ibnw.a(object0);
        if((throwable1 instanceof CancellationException)) {
            throw throwable1;
        }
        Throwable throwable2 = ibnw.a(object0);
        if(throwable2 != null) {
            dcvz.a.e().f(throwable2).h("[NS_ERROR] NC failed to setDownloadsDirectory (%s).", s);
            ichm ichm0 = this.d;
            if(ichm0 != null) {
                dglm.a(ichm0, new dggr(throwable2));
            }
        }
        return ibom.a;
    }

    public final Object d(ibrl ibrl0) {
        dglt dglt0;
        if((ibrl0 instanceof dglt)) {
            dglt0 = (dglt)ibrl0;
            int v = dglt0.c;
            if((v & 0x80000000) == 0) {
                dglt0 = new dglt(this, ibrl0);
            }
            else {
                dglt0.c = v - 0x80000000;
            }
        }
        else {
            dglt0 = new dglt(this, ibrl0);
        }
        Object object0 = dglt0.a;
        Object object1 = ibrx.a;
        switch(dglt0.c) {
            case 0: {
                ibnx.b(object0);
                evql evql0 = this.c.e(this.a);
                try {
                    dglt0.c = 1;
                    object0 = ictn.b(evql0, dglt0);
                    if(object0 == object1) {
                        return object1;
                    label_19:
                        ibnx.b(object0);
                    }
                }
                catch(Throwable throwable0) {
                    object0 = ibnx.a(throwable0);
                }
                break;
            }
            case 1: {
                goto label_19;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Throwable throwable1 = ibnw.a(object0);
        if((throwable1 instanceof CancellationException)) {
            throw throwable1;
        }
        Throwable throwable2 = ibnw.a(object0);
        if(throwable2 != null) {
            dcvz.a.e().f(throwable2).p("[NS_ERROR] NC failed to upgradeBandwidth", new Object[0]);
        }
        return ibom.a;
    }
}

