import android.accounts.Account;
import android.app.Activity;
import java.util.List;

public final class csym implements csxk {
    public static final bboh a;
    public final csyu b;
    public final icnj c;
    public final icnj d;
    public final icnj e;
    public final cszz f;
    private final csud g;
    private final icck h;
    private final cswv i;

    static {
        csym.a = cume.a(new ibuk(csym.class));
    }

    public csym(csyu csyu0, csud csud0, icck icck0, csrs csrs0, icnj icnj0, ctdo ctdo0, cszz cszz0, cswv cswv0) {
        ibuq.f(csyu0, "repository");
        ibuq.f(csud0, "accountsRepository");
        ibuq.f(icck0, "scope");
        ibuq.f(icnj0, "deviceName");
        ibuq.f(cswv0, "multideviceSyncPermissionManager");
        super();
        this.b = csyu0;
        this.g = csud0;
        this.h = icck0;
        this.f = cszz0;
        this.i = cswv0;
        csyg csyg0 = new csyg(((ctef)csyu0.n().b()), ((List)csud0.c.b()), ((String)icnj0.b()), ((cswx)cswv0.b().b()));
        icnj icnj1 = csyu0.n();
        icnj icnj2 = cswv0.b();
        csyi csyi0 = new csyi(null);
        csyl csyl0 = new csyl(icjj.a(icmm.b(icnj1, csud0.c, icnj0, icnj2, csyi0)), this);
        csyf csyf0 = new csyf(this, csyg0);
        icnj icnj3 = iclp.b(csyl0, icck0, icmy.a, csyf0);
        this.c = icnj3;
        this.d = icnj3;
        this.e = icnj3;
        icbb.b(icck0, null, null, new csxq(this, null), 3);
        icbb.b(icck0, null, null, new csxs(this, null), 3);
        icbb.b(icck0, null, null, new csxu(this, csrs0, null), 3);
        icbb.b(icck0, null, null, new csxz(this, ctdo0, null), 3);
        icbb.b(icck0, null, null, new csye(this, ctdo0, null), 3);
    }

    @Override  // csxk
    public final Object a(Account account0, ibrl ibrl0) {
        String s = account0.name;
        ibuq.e(s, "name");
        Object object0 = this.b.g(s, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    @Override  // csxk
    public final Object b(Account account0, boolean z, ibrl ibrl0) {
        String s = account0.name;
        ibuq.e(s, "name");
        Object object0 = this.b.h(s, z, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    @Override  // csxk
    public final Object c(Account account0, boolean z, ibrl ibrl0) {
        csyh csyh0;
        if((ibrl0 instanceof csyh)) {
            csyh0 = (csyh)ibrl0;
            int v = csyh0.c;
            if((v & 0x80000000) == 0) {
                csyh0 = new csyh(this, ibrl0);
            }
            else {
                csyh0.c = v - 0x80000000;
            }
        }
        else {
            csyh0 = new csyh(this, ibrl0);
        }
        Object object0 = csyh0.a;
        Object object1 = ibrx.a;
        switch(csyh0.c) {
            case 0: {
                ibnx.b(object0);
                if(!z && csvl.b(((csyf)this.e.b()), account0)) {
                    ((ggtj)csym.a.h()).x("Last account disabled. Disabling main multidevice toggle.");
                    csyh0.c = 1;
                    if(this.b.c(csyh0) != object1) {
                        return Boolean.valueOf(false);
                    }
                }
                else if(z && csvl.a(((csyf)this.e.b()))) {
                    ((ggtj)csym.a.h()).x("First account enabled. Enabling main multidevice toggle.");
                    String s = account0.name;
                    ibuq.e(s, "name");
                    csyh0.c = 2;
                    if(this.b.d(s, csyh0) != object1) {
                        return Boolean.valueOf(true);
                    }
                }
                else {
                    String s1 = account0.name;
                    ibuq.e(s1, "name");
                    csyh0.c = 3;
                    if(this.b.h(s1, z, csyh0) != object1) {
                        return Boolean.valueOf(this.b.p());
                    }
                }
                return object1;
            }
            case 1: {
                ibnx.b(object0);
                return Boolean.valueOf(false);
            }
            case 2: {
                ibnx.b(object0);
                return Boolean.valueOf(true);
            }
            case 3: {
                ibnx.b(object0);
                return Boolean.valueOf(this.b.p());
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // csxk
    public final Object d(boolean z, ibrl ibrl0) {
        Object object0 = this.b.j(z, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    @Override  // csxk
    public final Object e(int v, boolean z, ibrl ibrl0) {
        Object object0 = this.b.m(v, z, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    @Override  // csxk
    public final icnj f() {
        return this.e;
    }

    @Override  // csxk
    public final icnj g() {
        return this.d;
    }

    @Override  // csxk
    public final boolean h() {
        return cswr.a(((csyf)this.d.b()));
    }

    @Override  // csxk
    public final csyf i() {
        return (csyf)this.d.b();
    }

    @Override  // csxk
    public final void j(Activity activity0, culo culo0) {
        ibuq.f(activity0, "activity");
        ibuq.f(activity0, "activity");
        cstv cstv0 = new cstv(culo0, new csts(this.g));
        this.g.b.s("com.google", null, activity0, cstv0, null);
        ((ggtj)culr.a.h()).x("Redirect user to add new account");
    }

    @Override  // csxk
    public final Object k(Account account0, ibrl ibrl0) {
        String s = account0.name;
        ibuq.e(s, "name");
        Object object0 = this.b.i(s, true, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    @Override  // csxk
    public final Object l(ibrl ibrl0) {
        Object object0 = this.b.r(ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

