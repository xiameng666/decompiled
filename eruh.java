import android.accounts.Account;
import com.google.android.gms.auth.aang.GoogleAccount;
import java.util.NoSuchElementException;

public final class eruh implements erua {
    private static final bboh a;
    private final clui b;
    private final clvm c;

    static {
        eruh.a = bboh.b("eruh", bbcu.gt);
    }

    public eruh(clui clui0, clvm clvm0) {
        ibuq.f(clui0, "googleAccountFetcher");
        ibuq.f(clvm0, "spatulaPreferences");
        super();
        this.b = clui0;
        this.c = clvm0;
    }

    @Override  // erua
    public final Object a(String s, ibrl ibrl0) {
        eruf eruf0;
        if((ibrl0 instanceof eruf)) {
            eruf0 = (eruf)ibrl0;
            int v = eruf0.c;
            if((v & 0x80000000) == 0) {
                eruf0 = new eruf(this, ibrl0);
            }
            else {
                eruf0.c = v - 0x80000000;
            }
        }
        else {
            eruf0 = new eruf(this, ibrl0);
        }
        Object object0 = eruf0.a;
        Object object1 = ibrx.a;
        switch(eruf0.c) {
            case 0: {
                ibnx.b(object0);
                eruf0.c = 1;
                object0 = this.c(s, eruf0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_19;
            }
            case 1: {
                ibnx.b(object0);
            label_19:
                if(((clvf)object0) == null) {
                    return ibnx.a(new Exception("unable to get preference for account"));
                }
                eruf0.c = 2;
                object0 = icll.a(icjj.a(new clva(new clux(new icjr(((clvf)object0).a.b(), new clvc(((clvf)object0), null)), ((clvf)object0)))), eruf0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_26;
            }
            case 2: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibnx.b(object0);
    label_26:
        if((((clun)object0) instanceof clum)) {
            return cluo.a(new clum(((clum)(((clun)object0))).a));
        }
        if(!(((clun)object0) instanceof clul)) {
            throw new ibnq();
        }
        cluc cluc0 = (cluc)((clul)(((clun)object0))).a;
        return cluo.a(new clul(new NoSuchElementException("preference is uninitialized")));
    }

    @Override  // erua
    public final Object b(String s, boolean z, ibrl ibrl0) {
        erug erug0;
        if((ibrl0 instanceof erug)) {
            erug0 = (erug)ibrl0;
            int v = erug0.d;
            if((v & 0x80000000) == 0) {
                erug0 = new erug(this, ibrl0);
            }
            else {
                erug0.d = v - 0x80000000;
            }
        }
        else {
            erug0 = new erug(this, ibrl0);
        }
        Object object0 = erug0.b;
        Object object1 = ibrx.a;
        switch(erug0.d) {
            case 0: {
                ibnx.b(object0);
                erug0.a = z;
                erug0.d = 1;
                object0 = this.c(s, erug0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_21;
            }
            case 1: {
                z = erug0.a;
                ibnx.b(object0);
            label_21:
                if(((clvf)object0) == null) {
                    return ibnx.a(new Exception("unable to get preference for account"));
                }
                erug0.d = 2;
                object0 = clvh.a(((clvf)object0).d, "set", new clve(((clvf)object0), Boolean.valueOf(z), null), erug0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_28;
            }
            case 2: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibnx.b(object0);
    label_28:
        if((((clun)object0) instanceof clum)) {
            return cluo.a(new clum(((clum)(((clun)object0))).a));
        }
        if(!(((clun)object0) instanceof clul)) {
            throw new ibnq();
        }
        cluc cluc0 = (cluc)((clul)(((clun)object0))).a;
        ((ggtj)eruh.a.j()).B("unable to write preference value: %s", cluc0);
        return cluo.a(new clul(new Exception(a.i(cluc0, "unable to write preference value (", ")"))));
    }

    public final Object c(String s, ibrl ibrl0) {
        erue erue0;
        if((ibrl0 instanceof erue)) {
            erue0 = (erue)ibrl0;
            int v = erue0.c;
            if((v & 0x80000000) == 0) {
                erue0 = new erue(this, ibrl0);
            }
            else {
                erue0.c = v - 0x80000000;
            }
        }
        else {
            erue0 = new erue(this, ibrl0);
        }
        Object object0 = erue0.a;
        Object object1 = ibrx.a;
        switch(erue0.c) {
            case 0: {
                ibnx.b(object0);
                Account account0 = new Account(s, "com.google");
                erue0.c = 1;
                object0 = this.b.a(account0, erue0);
                if(object0 == object1) {
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
        if((((clun)object0) instanceof clum)) {
            String s1 = ((GoogleAccount)((clum)(((clun)object0))).a).a;
            ibuq.e(s1, "getObfuscatedGaiaId(...)");
            club club0 = new club(s1);
            return new clvf(clvl.e, this.c.a, club0, ibps.a);
        }
        if(!(((clun)object0) instanceof clul)) {
            throw new ibnq();
        }
        ((ggtj)eruh.a.j()).B("fetchGoogleAccount failed: %s", ((cluf)((clul)(((clun)object0))).a));
        return null;
    }
}

