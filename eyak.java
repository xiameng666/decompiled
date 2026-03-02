import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import java.util.List;
import java.util.Map;

public final class eyak extends exzl {
    public final exjf a;
    public icbr b;
    private final ibth c;
    private final ibth d;
    private final icck e;
    private final bboh f;

    @AssistedInject
    public eyak(@Assisted ibth ibth0, @Assisted ibth ibth1, icck icck0, bboh bboh0) {
        this.c = ibth0;
        this.d = ibth1;
        this.e = icck0;
        this.f = bboh0;
        this.a = new exjf(ibps.a, icck0, bboh0);
        icbr icbr0 = new icbr();
        icbr0.V(ibom.a);
        this.b = icbr0;
    }

    @Override  // exzl
    public final Object a(exzk exzk0, ibrl ibrl0) {
        eyag eyag0;
        if((ibrl0 instanceof eyag)) {
            eyag0 = (eyag)ibrl0;
            int v = eyag0.c;
            if((v & 0x80000000) == 0) {
                eyag0 = new eyag(this, ibrl0);
            }
            else {
                eyag0.c = v - 0x80000000;
            }
        }
        else {
            eyag0 = new eyag(this, ibrl0);
        }
        Object object0 = eyag0.a;
        Object object1 = ibrx.a;
        switch(eyag0.c) {
            case 0: {
                ibnx.b(object0);
                if(!this.v()) {
                    return ibom.a;
                }
                exzl exzl0 = eyak.t(this);
                eyag0.c = 1;
                if(exzl0.a(exzk0, eyag0) != object1) {
                    eyag0.c = 2;
                    return this.r(eyag0) != object1 ? ibom.a : object1;
                }
                return object1;
            }
            case 1: {
                ibnx.b(object0);
                eyag0.c = 2;
                return this.r(eyag0) != object1 ? ibom.a : object1;
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

    @Override  // exzl
    public final Object b(long v, ibrl ibrl0) {
        eyah eyah0;
        if((ibrl0 instanceof eyah)) {
            eyah0 = (eyah)ibrl0;
            int v1 = eyah0.d;
            if((v1 & 0x80000000) == 0) {
                eyah0 = new eyah(this, ibrl0);
            }
            else {
                eyah0.d = v1 - 0x80000000;
            }
        }
        else {
            eyah0 = new eyah(this, ibrl0);
        }
        Object object0 = eyah0.b;
        Object object1 = ibrx.a;
        switch(eyah0.d) {
            case 0: {
                ibnx.b(object0);
                if(!this.v()) {
                    return new Integer(0);
                }
                exzl exzl0 = eyak.t(this);
                eyah0.d = 1;
                object0 = exzl0.b(v, eyah0);
                if(object0 == object1) {
                    return object1;
                }
                ((Number)object0).intValue();
                eyah0.a = object0;
                eyah0.d = 2;
                return this.r(eyah0) == object1 ? object1 : object0;
            }
            case 1: {
                ibnx.b(object0);
                ((Number)object0).intValue();
                eyah0.a = object0;
                eyah0.d = 2;
                return this.r(eyah0) == object1 ? object1 : object0;
            }
            case 2: {
                Object object2 = eyah0.a;
                ibnx.b(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // exzl
    public final Object c(String s, ibrl ibrl0) {
        return this.v() ? eyak.t(this).c(s, ibrl0) : null;
    }

    @Override  // exzl
    public final Object d(exzk exzk0, ibrl ibrl0) {
        eyai eyai0;
        if((ibrl0 instanceof eyai)) {
            eyai0 = (eyai)ibrl0;
            int v = eyai0.c;
            if((v & 0x80000000) == 0) {
                eyai0 = new eyai(this, ibrl0);
            }
            else {
                eyai0.c = v - 0x80000000;
            }
        }
        else {
            eyai0 = new eyai(this, ibrl0);
        }
        Object object0 = eyai0.a;
        Object object1 = ibrx.a;
        switch(eyai0.c) {
            case 0: {
                ibnx.b(object0);
                eyai0.d = exzk0;
                eyai0.c = 1;
                if(this.b.F(eyai0) == object1) {
                    return object1;
                }
                goto label_20;
            }
            case 1: {
                exzk0 = eyai0.d;
                ibnx.b(object0);
            label_20:
                exzl exzl0 = eyak.t(this);
                eyai0.d = null;
                eyai0.c = 2;
                Object object2 = exzl0.d(exzk0, eyai0);
                return object2 == object1 ? object1 : object2;
            }
            case 2: {
                ibnx.b(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // exzl
    public final Object e(long v, ibrl ibrl0) {
        if(this.v()) {
            Object object0 = eyak.t(this).e(v, ibrl0);
            if(object0 == ibrx.a) {
                return object0;
            }
        }
        return ibom.a;
    }

    @Override  // exzl
    public final Object f(long v, byte[] arr_b, long v1, ibrl ibrl0) {
        if(this.v()) {
            Object object0 = eyak.t(this).f(v, arr_b, v1, ibrl0);
            if(object0 == ibrx.a) {
                return object0;
            }
        }
        return ibom.a;
    }

    @Override  // exzl
    public final Object g(long v, boolean z, ibrl ibrl0) {
        if(this.v()) {
            Object object0 = eyak.t(this).g(v, z, ibrl0);
            if(object0 == ibrx.a) {
                return object0;
            }
        }
        return ibom.a;
    }

    @Override  // exzl
    public final Object h(long v, String s, ibrl ibrl0) {
        if(this.v()) {
            Object object0 = eyak.t(this).h(v, s, ibrl0);
            if(object0 == ibrx.a) {
                return object0;
            }
        }
        return ibom.a;
    }

    @Override  // exzl
    public final Object i(long v, Map map0, ibrl ibrl0) {
        if(this.v()) {
            Object object0 = eyak.t(this).i(v, map0, ibrl0);
            if(object0 == ibrx.a) {
                return object0;
            }
        }
        return ibom.a;
    }

    @Override  // exzl
    public final Object j(long v, List list0, ibrl ibrl0) {
        Object object0 = eyak.t(this).j(v, list0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    @Override  // exzl
    public final Object k(long v, Map map0, ibrl ibrl0) {
        if(this.v()) {
            Object object0 = eyak.t(this).k(v, map0, ibrl0);
            if(object0 == ibrx.a) {
                return object0;
            }
        }
        return ibom.a;
    }

    @Override  // exzl
    public final Object l(long v, Map map0, ibrl ibrl0) {
        if(this.v()) {
            Object object0 = eyak.t(this).l(v, map0, ibrl0);
            if(object0 == ibrx.a) {
                return object0;
            }
        }
        return ibom.a;
    }

    @Override  // exzl
    public final Object m(long v, Map map0, ibrl ibrl0) {
        if(this.v()) {
            Object object0 = eyak.t(this).m(v, map0, ibrl0);
            if(object0 == ibrx.a) {
                return object0;
            }
        }
        return ibom.a;
    }

    @Override  // exzl
    public final Object n(long v, Map map0, ibrl ibrl0) {
        if(this.v()) {
            Object object0 = eyak.t(this).n(v, map0, ibrl0);
            if(object0 == ibrx.a) {
                return object0;
            }
        }
        return ibom.a;
    }

    @Override  // exzl
    public final icig o() {
        return this.a.c;
    }

    @Override  // exzl
    public final Object p(long v, ibrl ibrl0) {
        if(this.v()) {
            Object object0 = eyak.t(this).p(v, ibrl0);
            if(object0 == ibrx.a) {
                return object0;
            }
        }
        return ibom.a;
    }

    @Override  // exzl
    public final Object q(long v, int v1, ibrl ibrl0) {
        if(this.v()) {
            Object object0 = eyak.t(this).q(v, v1, ibrl0);
            if(object0 == ibrx.a) {
                return object0;
            }
        }
        return ibom.a;
    }

    public final Object r(ibrl ibrl0) {
        eyaj eyaj0;
        if((ibrl0 instanceof eyaj)) {
            eyaj0 = (eyaj)ibrl0;
            int v = eyaj0.c;
            if((v & 0x80000000) == 0) {
                eyaj0 = new eyaj(this, ibrl0);
            }
            else {
                eyaj0.c = v - 0x80000000;
            }
        }
        else {
            eyaj0 = new eyaj(this, ibrl0);
        }
        Object object0 = eyaj0.a;
        Object object1 = ibrx.a;
        switch(eyaj0.c) {
            case 0: {
                ibnx.b(object0);
                icig icig0 = this.u(false).o();
                eyaj0.c = 1;
                object0 = icll.a(icig0, eyaj0);
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
        if(!((List)object0).isEmpty()) {
            return ibom.a;
        }
        this.b.V(ibom.a);
        this.b = new icbr();
        this.d.a();
        return ibom.a;
    }

    public final void s() {
        icig icig0 = this.u(false).o();
        this.a.a(icig0);
    }

    static exzl t(eyak eyak0) {
        return eyak0.u(true);
    }

    private final exzl u(boolean z) {
        Object object0 = ((ibuv)this.c).b();
        if(z) {
            this.s();
        }
        return (exzl)object0;
    }

    private final boolean v() {
        return this.a.c();
    }
}

