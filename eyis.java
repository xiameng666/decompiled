import com.google.android.gms.trustagent.activeunlock.common.data.communication.ConnectionInfo;

public final class eyis {
    public final bboh a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    private final eygq f;

    public eyis(eygq eygq0, bboh bboh0) {
        this.f = eygq0;
        this.a = bboh0;
        this.b = true;
        this.e = 1;
    }

    public final Object a(iccs iccs0, exjx exjx0, ConnectionInfo connectionInfo0, Boolean boolean0, ibrl ibrl0) {
        gzym gzym0;
        int v4;
        exjx exjx1;
        int v3;
        eyir eyir0;
        if((ibrl0 instanceof eyir)) {
            eyir0 = (eyir)ibrl0;
            int v = eyir0.d;
            if((v & 0x80000000) == 0) {
                eyir0 = new eyir(this, ibrl0);
            }
            else {
                eyir0.d = v - 0x80000000;
            }
        }
        else {
            eyir0 = new eyir(this, ibrl0);
        }
        Object object0 = eyir0.b;
        Object object1 = ibrx.a;
        switch(eyir0.d) {
            case 0: {
                ibnx.b(object0);
                int v1 = this.b ^ 1;
                int v2 = this.e;
                this.b();
                eyir0.e = exjx0;
                eyir0.f = connectionInfo0;
                eyir0.g = boolean0;
                eyir0.h = v2;
                eyir0.a = v1;
                eyir0.d = 1;
                Object object2 = ((ices)iccs0).F(eyir0);
                if(object2 != object1) {
                    object0 = object2;
                    v3 = v1;
                    exjx1 = exjx0;
                    v4 = v2;
                    break;
                }
                return object1;
            }
            case 1: {
                v3 = eyir0.a;
                v4 = eyir0.h;
                boolean0 = eyir0.g;
                connectionInfo0 = eyir0.f;
                exjx1 = eyir0.e;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        gzyj gzyj0 = null;
        if(((exzh)object0).c) {
            exjo exjo0 = ibuq.m(boolean0, Boolean.valueOf(true)) ? exjo.c : exjo.b;
            eyfl eyfl0 = this.f.a;
            gzyz gzyz0 = gzyz.e;
            if(exjx1 != null) {
                gzyj0 = exjx1.e();
            }
            if(exjo0 == null) {
                gzym0 = gzym.b;
            }
            else {
                gzym0 = exjo0.a();
                if(gzym0 == null) {
                    gzym0 = gzym.b;
                }
            }
            eyfl.i(eyfl0, gzyz0, connectionInfo0, gzyj0, gzym0, 316);
            return ibom.a;
        }
        if(v3 != 0) {
            ((ggtj)this.a.h()).x("No GrantTrustResult received because the device is already unlocked");
            eygq eygq0 = this.f;
            gzyz gzyz1 = gzyz.s;
            if(exjx1 != null) {
                gzyj0 = exjx1.e();
            }
            eyfl.i(eygq0.a, gzyz1, connectionInfo0, gzyj0, null, 444);
            return ibom.a;
        }
        if(v4 == 3) {
            if(this.d) {
                ((ggtj)this.a.j()).x("No GrantTrustResult received when trust has been bootstrapped after initialization");
                eygq eygq1 = this.f;
                gzyz gzyz2 = gzyz.E;
                if(exjx1 != null) {
                    gzyj0 = exjx1.e();
                }
                eyfl.i(eygq1.a, gzyz2, connectionInfo0, gzyj0, null, 444);
                return ibom.a;
            }
            ((ggtj)this.a.j()).x("No GrantTrustResult received when trust has been bootstrapped after gaining copresence");
            eygq eygq2 = this.f;
            gzyz gzyz3 = gzyz.F;
            if(exjx1 != null) {
                gzyj0 = exjx1.e();
            }
            eyfl.i(eygq2.a, gzyz3, connectionInfo0, gzyj0, null, 444);
            return ibom.a;
        }
        ggtj ggtj0 = (ggtj)this.a.h();
        if(v4 == 0) {
            throw null;
        }
        ggtj0.B("No GrantTrustResult received because grantTrust() was called in state %s", eyiq.a(v4));
        eygq eygq3 = this.f;
        gzyz gzyz4 = gzyz.t;
        if(exjx1 != null) {
            gzyj0 = exjx1.e();
        }
        eyfl.i(eygq3.a, gzyz4, connectionInfo0, gzyj0, null, 444);
        return ibom.a;
    }

    public final void b() {
        int v = this.e;
        if(v == 0) {
            throw null;
        }
        if(v - 1 != 0) {
            if(v - 1 != 1 && v - 1 != 2) {
                throw new ibnq();
            }
            ((ggtj)this.a.h()).B("grantTrust() in state %s", eyiq.a(v));
            return;
        }
        if(!this.b) {
            ((ggtj)this.a.h()).x("grantTrust() called when the device is untrusted but unlocked. Moving to the TRUST_RENEWABLE state.");
            this.e = 3;
            return;
        }
        ((ggtj)this.a.h()).x("grantTrust() called when the device is locked. Moving to the TRUST_PENDING state.");
        this.e = 2;
    }
}

