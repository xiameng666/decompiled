import j..util.DesugarCollections;
import java.util.Map;

public final class betx {
    public final lap a;

    public betx(lap lap0) {
        ibuq.f(lap0, "dataStore");
        super();
        this.a = lap0;
    }

    public final Object a(String s, ibrl ibrl0) {
        beto beto0;
        if((ibrl0 instanceof beto)) {
            beto0 = (beto)ibrl0;
            int v = beto0.c;
            if((v & 0x80000000) == 0) {
                beto0 = new beto(this, ibrl0);
            }
            else {
                beto0.c = v - 0x80000000;
            }
        }
        else {
            beto0 = new beto(this, ibrl0);
        }
        Object object0 = beto0.a;
        Object object1 = ibrx.a;
        switch(beto0.c) {
            case 0: {
                ibnx.b(object0);
                icig icig0 = this.a.b();
                beto0.d = s;
                beto0.c = 1;
                object0 = icll.a(icig0, beto0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                s = beto0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Map map0 = DesugarCollections.unmodifiableMap(((bgov)object0).d);
        ibuq.e(map0, "getAccountUsedPasswordSharingMap(...)");
        return Boolean.valueOf(map0.containsKey(s));
    }

    public final Object b(ibrl ibrl0) {
        bett bett0;
        if((ibrl0 instanceof bett)) {
            bett0 = (bett)ibrl0;
            int v = bett0.c;
            if((v & 0x80000000) == 0) {
                bett0 = new bett(this, ibrl0);
            }
            else {
                bett0.c = v - 0x80000000;
            }
        }
        else {
            bett0 = new bett(this, ibrl0);
        }
        Object object0 = bett0.a;
        Object object1 = ibrx.a;
        switch(bett0.c) {
            case 0: {
                ibnx.b(object0);
                icig icig0 = this.a.b();
                bett0.c = 1;
                object0 = icll.a(icig0, bett0);
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
        Object object2 = ((bgov)object0).c;
        ibuq.c(object2);
        return ((CharSequence)object2).length() == 0 ? null : object2;
    }

    public final Object c(boolean z, ibrl ibrl0) {
        betv betv0 = new betv(z, null);
        Object object0 = this.a.a(betv0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    public final icig d() {
        return new betr(new icku(new icht(new bets(this, null))));
    }
}

