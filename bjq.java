import j..util.Objects;

public final class bjq {
    public static bjt a(bjt bjt0, bjt bjt1) {
        if(bjt0 == null && bjt1 == null) {
            return blf.b;
        }
        blb blb0 = bjt1 == null ? blb.a() : blb.b(bjt1);
        if(bjt0 != null) {
            for(Object object0: bjt0.r()) {
                bjq.b(blb0, bjt1, bjt0, ((bjr)object0));
            }
        }
        return blf.f(blb0);
    }

    public static void b(blb blb0, bjt bjt0, bjt bjt1, bjr bjr0) {
        if(Objects.equals(bjr0, bko.O)) {
            btu btu0 = (btu)bjt1.m(bjr0, null);
            btu btu1 = (btu)bjt0.m(bjr0, null);
            bjs bjs0 = bjt1.g(bjr0);
            if(btu0 == null) {
                btu0 = btu1;
            }
            else if(btu1 != null) {
                btu0 = new btu(btu0.a, btu0.b);
            }
            blb0.d(bjr0, bjs0, btu0);
            return;
        }
        blb0.d(bjr0, bjt1.g(bjr0), bjt1.l(bjr0));
    }
}

