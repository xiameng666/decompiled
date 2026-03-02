import j..util.DesugarCollections;

public final class dcxk {
    public final frli a;

    public dcxk(frli frli0) {
        ibuq.f(frli0, "deviceConfig");
        super();
        this.a = frli0;
    }

    public final Object a(ibrl ibrl0) {
        dcxh dcxh0;
        if((ibrl0 instanceof dcxh)) {
            dcxh0 = (dcxh)ibrl0;
            int v = dcxh0.c;
            if((v & 0x80000000) == 0) {
                dcxh0 = new dcxh(this, ibrl0);
            }
            else {
                dcxh0.c = v - 0x80000000;
            }
        }
        else {
            dcxh0 = new dcxh(this, ibrl0);
        }
        Object object0 = dcxh0.a;
        Object object1 = ibrx.a;
        switch(dcxh0.c) {
            case 0: {
                ibnx.b(object0);
                gmcd gmcd0 = this.a.a();
                ibuq.e(gmcd0, "getData(...)");
                dcxh0.c = 1;
                object0 = icpu.c(gmcd0, dcxh0);
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
        Object object2 = DesugarCollections.unmodifiableMap(((dbyi)object0).c);
        ibuq.e(object2, "getDataUsageMessageMap(...)");
        return object2;
    }

    public final Object b(ibrl ibrl0) {
        dcxi dcxi0;
        if((ibrl0 instanceof dcxi)) {
            dcxi0 = (dcxi)ibrl0;
            int v = dcxi0.c;
            if((v & 0x80000000) == 0) {
                dcxi0 = new dcxi(this, ibrl0);
            }
            else {
                dcxi0.c = v - 0x80000000;
            }
        }
        else {
            dcxi0 = new dcxi(this, ibrl0);
        }
        Object object0 = dcxi0.a;
        Object object1 = ibrx.a;
        switch(dcxi0.c) {
            case 0: {
                ibnx.b(object0);
                gmcd gmcd0 = this.a.a();
                ibuq.e(gmcd0, "getData(...)");
                dcxi0.c = 1;
                object0 = icpu.c(gmcd0, dcxi0);
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
        Object object2 = DesugarCollections.unmodifiableMap(((dbyi)object0).f);
        ibuq.e(object2, "getDiscoveryTipsTooltipMap(...)");
        return object2;
    }

    public final Object c(ibrl ibrl0) {
        dcxj dcxj0;
        if((ibrl0 instanceof dcxj)) {
            dcxj0 = (dcxj)ibrl0;
            int v = dcxj0.c;
            if((v & 0x80000000) == 0) {
                dcxj0 = new dcxj(this, ibrl0);
            }
            else {
                dcxj0.c = v - 0x80000000;
            }
        }
        else {
            dcxj0 = new dcxj(this, ibrl0);
        }
        Object object0 = dcxj0.a;
        Object object1 = ibrx.a;
        switch(dcxj0.c) {
            case 0: {
                ibnx.b(object0);
                gmcd gmcd0 = this.a.a();
                ibuq.e(gmcd0, "getData(...)");
                dcxj0.c = 1;
                object0 = icpu.c(gmcd0, dcxj0);
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
        Object object2 = DesugarCollections.unmodifiableMap(((dbyi)object0).e);
        ibuq.e(object2, "getReceiveSurfaceMessageMap(...)");
        return object2;
    }

    public final Object d(ibrl ibrl0) {
        dcxe dcxe0 = new dcxe(new dcxd());
        Object object0 = icpu.c(this.a.b(dcxe0, gmap.a), ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    public final Object e(String s, ibrl ibrl0) {
        dcxg dcxg0 = new dcxg(new dcxf(s));
        Object object0 = icpu.c(this.a.b(dcxg0, gmap.a), ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

