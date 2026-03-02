import android.content.Context;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.util.List;
import java.util.concurrent.ExecutorService;

public final class bghr {
    public final Context a;
    public final grcu b;
    public final String c;
    public final grbx d;
    public final grck e;
    public final gful_cronetEngineProvider f;
    public static final int g;
    private static final bboh h;
    private final ExecutorService i;

    static {
        bghr.h = bboh.b("CompromiseCheckRunner", bbcu.cX);
    }

    public bghr(Context context0, ExecutorService executorService0, grcu grcu0, String s, grbx grbx0, grck grck0) {
        ibuq.f(context0, "context");
        ibuq.f(s, "credentialsOwnerAccountName");
        ibuq.f(grck0, "clientUseCase");
        super();
        this.a = context0;
        this.i = executorService0;
        this.b = grcu0;
        this.c = s;
        this.d = grbx0;
        this.e = grck0;
        gful_cronetEngineProvider gful0 = gfus.a(((gful_cronetEngineProvider)new bghf(this)));
        ibuq.e(gful0, "memoize(...)");
        this.f = gful0;
    }

    public final evql a(ggfd ggfd0) {
        return ictn.a(icbb.a(iccl.b(new icds(this.i)), null, null, new bgho(this, ggfd0, null), 3));
    }

    public final Object b(ibts ibts0, ibrl ibrl0) {
        ibts ibts2;
        int v1;
        ibts ibts1;
        bghh bghh0;
        if((ibrl0 instanceof bghh)) {
            bghh0 = (bghh)ibrl0;
            int v = bghh0.d;
            if((v & 0x80000000) == 0) {
                bghh0 = new bghh(this, ibrl0);
            }
            else {
                bghh0.d = v - 0x80000000;
            }
        }
        else {
            bghh0 = new bghh(this, ibrl0);
        }
        Object object0 = bghh0.b;
        Object object1 = ibrx.a;
        switch(bghh0.d) {
            case 0: {
                ibnx.b(object0);
                ibts1 = ibts0;
                v1 = 1;
                goto label_29;
            }
            case 1: {
                try {
                    v1 = bghh0.a;
                    ibts2 = bghh0.e;
                    ibnx.b(object0);
                    return object0;
                }
                catch(iapl iapl0) {
                    goto label_38;
                }
                catch(iapn iapn0) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            ibuq.e(iapn0.a, "getStatus(...)");
            if(!bghg.c(v1, iapn0.a)) {
                throw iapn0;
            }
            while(true) {
                ibts1 = ibts2;
                ++v1;
            label_29:
                if(v1 >= 4) {
                    break alab1;
                }
                try {
                    bghh0.e = (bghj)ibts1;
                    bghh0.a = v1;
                    bghh0.d = 1;
                    Object object2 = ibts1.a(bghh0);
                    return object2 == object1 ? object1 : object2;
                }
                catch(iapl iapl1) {
                    ibts2 = ibts1;
                    iapl0 = iapl1;
                label_38:
                    ibuq.e(iapl0.a, "getStatus(...)");
                    if(bghg.c(v1, iapl0.a)) {
                        continue;
                    }
                    throw iapl0;
                }
                catch(iapn iapn1) {
                    ibts2 = ibts1;
                    iapn0 = iapn1;
                    break;
                }
            }
        }
        ((ggtj)bghr.h.i()).x("Reached impossible method end.");
        return Boolean.valueOf(false);
    }

    public final Object c(bggb bggb0, gged_interceptors gged0, ibrl ibrl0) {
        boolean z2;
        bghi bghi0;
        if((ibrl0 instanceof bghi)) {
            bghi0 = (bghi)ibrl0;
            int v = bghi0.e;
            if((v & 0x80000000) == 0) {
                bghi0 = new bghi(this, ibrl0);
            }
            else {
                bghi0.e = v - 0x80000000;
            }
        }
        else {
            bghi0 = new bghi(this, ibrl0);
        }
        Object object0 = bghi0.c;
        Object object1 = ibrx.a;
        boolean z = false;
        switch(bghi0.e) {
            case 0: {
                ibnx.b(object0);
                gqmd gqmd0 = ((bedh)gged0.get(0)).a;
                hept hept0 = ((bedg)gqmd0.j()).e.s;
                if(hept0 == null) {
                    hept0 = hept.a;
                }
                boolean z1 = (hept0.b & 8) != 0;
                hept hept1 = ((bedg)gqmd0.j()).e.s;
                if(hept1 == null) {
                    hept1 = hept.a;
                }
                if((hept1.b & 1) == 0) {
                    bghi0.a = gged0;
                    bghi0.b = z1;
                    bghi0.e = 1;
                    object0 = this.d(new bghk(this, bggb0.a, bggb0.b.a, null), bghi0);
                    if(object0 != object1) {
                        z2 = z1;
                        goto label_38;
                    }
                    return object1;
                }
                else {
                    z2 = z1;
                    z = true;
                }
                break;
            }
            case 1: {
                z2 = bghi0.b;
                gged0 = bghi0.a;
                ibnx.b(object0);
            label_38:
                if(((Boolean)object0).booleanValue()) {
                    z2 = z2;
                    z = true;
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibqm ibqm0 = new ibqm(null);
        if(z2) {
            ibqm0.add(grbd.c);
        }
        if(z) {
            ibqm0.add(grbd.b);
        }
        List list0 = ibpo.a(ibqm0);
        return !list0.isEmpty() ? new bgiw(gged0, ggdx.a(list0)) : null;
    }

    public final Object d(ibts ibts0, ibrl ibrl0) {
        bghn bghn0;
        if((ibrl0 instanceof bghn)) {
            bghn0 = (bghn)ibrl0;
            int v = bghn0.c;
            if((v & 0x80000000) == 0) {
                bghn0 = new bghn(this, ibrl0);
            }
            else {
                bghn0.c = v - 0x80000000;
            }
        }
        else {
            bghn0 = new bghn(this, ibrl0);
        }
        Object object0 = bghn0.a;
        Object object1 = ibrx.a;
        switch(bghn0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    bghn0.c = 1;
                    Object object2 = ibts0.a(bghn0);
                    return object2 == object1 ? object1 : object2;
                label_19:
                    ibnx.b(object0);
                    return object0;
                }
                catch(UserRecoverableAuthException userRecoverableAuthException0) {
                    throw bghg.a(userRecoverableAuthException0, bghg.b(this.a, userRecoverableAuthException0));
                }
                catch(acse acse0) {
                    throw bghg.a(acse0, null);
                }
                catch(iapl iapl0) {
                    ibuq.e(iapl0.a, "getStatus(...)");
                    this.e(iapl0.a, iapl0);
                    throw new ibnm();
                }
                catch(iapn iapn0) {
                    ibuq.e(iapn0.a, "getStatus(...)");
                    this.e(iapn0.a, iapn0);
                    throw new ibnm();
                }
            }
            case 1: {
                goto label_19;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    private final void e(iapk iapk0, Throwable throwable0) {
        iaph iaph0 = iapk0.t;
        if(iaph0 == iapk.k.t) {
            throw new bebz(0xA9F5, "Leak check service resource exhausted.", null, throwable0);
        }
        if(iaph0 != iapk.j.t) {
            throw new bebz(0xA9F0, "Error while doing LeakCheckService GRPC.", null, throwable0);
        }
        Throwable throwable1 = throwable0.getCause();
        if(!(throwable1 instanceof UserRecoverableAuthException)) {
            if(!(throwable1 instanceof acse)) {
                throw bghg.a(new acse(), null);
            }
            Throwable throwable2 = throwable0.getCause();
            ibuq.d(throwable2, "null cannot be cast to non-null type com.google.android.gms.auth.GoogleAuthException");
            throw bghg.a(((acse)throwable2), null);
        }
        Throwable throwable3 = throwable0.getCause();
        ibuq.d(throwable3, "null cannot be cast to non-null type com.google.android.gms.auth.UserRecoverableAuthException");
        throw bghg.a(((UserRecoverableAuthException)throwable3), bghg.b(this.a, ((UserRecoverableAuthException)throwable3)));
    }
}

