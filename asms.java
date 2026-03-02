import android.accounts.Account;
import android.content.Context;
import android.os.UserHandle;

public final class asms {
    public static final bboh a;
    public final aqga b;
    public final asmc c;
    public final Context d;
    public final ibrt e;
    public final icnj f;
    public final icnl g;
    private final icck h;
    private final ibnn i;
    private final ibnn j;
    private final ibnn k;
    private final atof l;

    static {
        asms.a = bboh.b("EnableDeviceDataBackupsUseCase", bbcu.dF);
    }

    public asms(aqga aqga0, atof atof0, asmc asmc0, Context context0, ibrt ibrt0, icck icck0) {
        ibuq.f(aqga0, "g1BackupClient");
        ibuq.f(asmc0, "backupsNetworkSettingsUseCase");
        ibuq.f(icck0, "globalScope");
        super();
        this.b = aqga0;
        this.l = atof0;
        this.c = asmc0;
        this.d = context0;
        this.e = ibrt0;
        this.h = icck0;
        this.i = new ibnz(new asme());
        this.j = new ibnz(new asmf(this));
        this.k = new ibnz(new asmg());
        icnl icnl0 = icnm.a(aqqe.a);
        this.g = icnl0;
        this.f = iclp.b(new icns(icnl0, new asmm(this, null)), icck0, icmy.a(0L, 3), aqqe.a);
    }

    public final Object a(ibrl ibrl0) {
        boolean z1;
        Account account0;
        Boolean boolean0;
        asmn asmn0;
        if((ibrl0 instanceof asmn)) {
            asmn0 = (asmn)ibrl0;
            int v = asmn0.e;
            if((v & 0x80000000) == 0) {
                asmn0 = new asmn(this, ibrl0);
            }
            else {
                asmn0.e = v - 0x80000000;
            }
        }
        else {
            asmn0 = new asmn(this, ibrl0);
        }
        Object object0 = asmn0.c;
        Object object1 = ibrx.a;
        boolean z = true;
        switch(asmn0.e) {
            case 0: {
                ibnx.b(object0);
                evql evql0 = this.b.e();
                asmn0.e = 1;
                object0 = ictn.b(evql0, asmn0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_21;
            }
            case 1: {
                ibnx.b(object0);
            label_21:
                evql evql1 = this.l.a();
                asmn0.a = (Boolean)object0;
                asmn0.e = 2;
                Object object2 = ictn.b(evql1, asmn0);
                if(object2 == object1) {
                    return object1;
                }
                boolean0 = (Boolean)object0;
                object0 = object2;
                goto label_31;
            }
            case 2: {
                boolean0 = (Boolean)asmn0.a;
                ibnx.b(object0);
            label_31:
                iccs iccs0 = ictn.c(this.b.g());
                if(boolean0.booleanValue() && ((Account)object0) != null) {
                    if(!this.f().m(this.d) || !this.f().k(this.d) || !this.f().n(this.d)) {
                        z = false;
                    }
                    asmn0.a = (Account)object0;
                    asmn0.b = z;
                    asmn0.e = 3;
                    Object object3 = iccs0.n(asmn0);
                    if(object3 != object1) {
                        account0 = (Account)object0;
                        object0 = object3;
                        z1 = z;
                        break;
                    }
                    return object1;
                }
                return new asmi(((Account)object0));
            }
            case 3: {
                z1 = asmn0.b;
                account0 = (Account)asmn0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.e(object0, "await(...)");
        return new asmk(account0, z1, ((Boolean)object0).booleanValue());
    }

    public final Object b(ibrl ibrl0) {
        Object object0 = this.d(ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    public final Object c(Account account0, ibrl ibrl0) {
        asmq asmq0;
        if((ibrl0 instanceof asmq)) {
            asmq0 = (asmq)ibrl0;
            int v = asmq0.c;
            if((v & 0x80000000) == 0) {
                asmq0 = new asmq(this, ibrl0);
            }
            else {
                asmq0.c = v - 0x80000000;
            }
        }
        else {
            asmq0 = new asmq(this, ibrl0);
        }
        Object object0 = asmq0.a;
        Object object1 = ibrx.a;
        switch(asmq0.c) {
            case 0: {
                ibnx.b(object0);
                evqp evqp0 = new evqp();
                atod atod0 = new atod(this.l, account0, evqp0);
                this.l.b.execute(atod0);
                asmq0.c = 1;
                if(ictn.b(evqp0.a, asmq0) != object1) {
                    asmq0.c = 2;
                    return this.d(asmq0) != object1 ? ibom.a : object1;
                }
                return object1;
            }
            case 1: {
                ibnx.b(object0);
                asmq0.c = 2;
                return this.d(asmq0) != object1 ? ibom.a : object1;
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

    public final Object d(ibrl ibrl0) {
        Object object2;
        boolean z1;
        icnl icnl0;
        asmr asmr0;
        if((ibrl0 instanceof asmr)) {
            asmr0 = (asmr)ibrl0;
            int v = asmr0.e;
            if((v & 0x80000000) == 0) {
                asmr0 = new asmr(this, ibrl0);
            }
            else {
                asmr0.e = v - 0x80000000;
            }
        }
        else {
            asmr0 = new asmr(this, ibrl0);
        }
        Object object0 = asmr0.c;
        Object object1 = ibrx.a;
        switch(asmr0.e) {
            case 0: {
                ibnx.b(object0);
                boolean z = ((aqjk)this.j.a()).j(UserHandle.of(UserHandle.myUserId()));
                icnl0 = this.g;
                z1 = z;
                goto label_25;
            }
            case 1: {
                z1 = asmr0.a;
                object2 = asmr0.b;
                icnl0 = asmr0.f;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            for(aqqf aqqf0 = new aqqf(object0); true; aqqf0 = new aqqd(new asmh())) {
                if(icnl0.h(object2, aqqf0)) {
                    return ibom.a;
                }
            label_25:
                object2 = icnl0.b();
                aqqh aqqh0 = (aqqh)object2;
                if(z1) {
                    break;
                }
            }
            asmr0.f = icnl0;
            asmr0.b = object2;
            asmr0.a = 1;
            asmr0.e = 1;
            object0 = this.a(asmr0);
        }
        while(object0 != object1);
        return object1;
    }

    public final boolean e() {
        return ((Boolean)this.k.a()).booleanValue();
    }

    private final aqjl f() {
        return (aqjl)this.i.a();
    }
}

