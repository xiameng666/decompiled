public final class huv {
    public hva a;
    public hva b;
    public ibth c;
    public icck d;

    public huv() {
        this.c = new hus(this);
    }

    public final long a(long v, long v1, int v2) {
        hur hur0 = this.c();
        return hur0 == null ? 0L : hur0.a(v, v1, v2);
    }

    public final long b(long v, int v1) {
        hur hur0 = this.c();
        return hur0 == null ? 0L : hur0.b(v, v1);
    }

    public final hur c() {
        hva hva0 = this.a;
        return hva0 != null ? hva0.e() : null;
    }

    public final Object d(long v, long v1, ibrl ibrl0) {
        hut hut0;
        if((ibrl0 instanceof hut)) {
            hut0 = (hut)ibrl0;
            int v2 = hut0.c;
            if((v2 & 0x80000000) == 0) {
                hut0 = new hut(this, ibrl0);
            }
            else {
                hut0.c = v2 - 0x80000000;
            }
        }
        else {
            hut0 = new hut(this, ibrl0);
        }
        Object object0 = hut0.a;
        Object object1 = ibrx.a;
        switch(hut0.c) {
            case 0: {
                ibnx.b(object0);
                if(this.c() == null) {
                    hva hva0 = this.b;
                    if(hva0 != null) {
                        hut0.c = 1;
                        object0 = hva0.c(v, v1, hut0);
                        return object0 == object1 ? object1 : new jls(((jls)object0).a);
                    }
                }
                else {
                    hur hur0 = this.c();
                    if(hur0 != null) {
                        hut0.c = 2;
                        object0 = hur0.c(v, v1, hut0);
                        return object0 != object1 ? new jls(((jls)object0).a) : object1;
                    }
                }
                return new jls(0L);
            }
            case 1: {
                ibnx.b(object0);
                return new jls(((jls)object0).a);
            }
            case 2: {
                ibnx.b(object0);
                return new jls(((jls)object0).a);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object e(long v, ibrl ibrl0) {
        huu huu0;
        if((ibrl0 instanceof huu)) {
            huu0 = (huu)ibrl0;
            int v1 = huu0.c;
            if((v1 & 0x80000000) == 0) {
                huu0 = new huu(this, ibrl0);
            }
            else {
                huu0.c = v1 - 0x80000000;
            }
        }
        else {
            huu0 = new huu(this, ibrl0);
        }
        Object object0 = huu0.a;
        Object object1 = ibrx.a;
        switch(huu0.c) {
            case 0: {
                ibnx.b(object0);
                hur hur0 = this.c();
                if(hur0 != null) {
                    huu0.c = 1;
                    object0 = hur0.d(v, huu0);
                    return object0 != object1 ? new jls(((jls)object0).a) : object1;
                }
                return new jls(0L);
            }
            case 1: {
                ibnx.b(object0);
                return new jls(((jls)object0).a);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final icck f() {
        icck icck0 = (icck)this.c.a();
        if(icck0 != null) {
            return icck0;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}

