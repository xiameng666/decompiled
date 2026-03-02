public final class ailz {
    public static ailx a(hhqx hhqx0) {
        hhqw hhqw0 = hhqx0.e == null ? hhqw.b : hhqx0.e;
        int v = hhqe.a(hhqw0.e) == 0 ? 1 : hhqe.a(hhqw0.e);
        if(v != 2) {
            throw new aily("Unsupported prompt type: " + hhqe.b(v));
        }
        hhqw hhqw1 = hhqx0.e;
        hhqw hhqw2 = hhqw1 == null ? hhqw.b : hhqw1;
        if((hhpy.b(hhqw2.h) == null ? hhpy.a : hhpy.b(hhqw2.h)) == hhpy.b) {
            if(hhqw1 == null) {
                hhqw1 = hhqw.b;
            }
            if((hhqw1.m == null ? hhpv.a : hhqw1.m).c.size() == 1) {
                return new ailw(hhqx0);
            }
        }
        return new ailv(hhqx0);
    }
}

