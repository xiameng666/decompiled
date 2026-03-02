public final class iaj {
    public static final igm a(igm igm0) {
        ify ify0 = igm0.L();
        while(true) {
            ify ify1 = ify0.n();
            ify ify2 = null;
            if((ify1 == null ? null : ify1.i) == null) {
                break;
            }
            ify ify3 = ify0.n();
            if(ify3 != null) {
                ify2 = ify3.i;
            }
            ibuq.c(ify2);
            if(ify2.h) {
                ify0 = ify0.n();
            }
            else {
                ify ify4 = ify0.n();
                ibuq.c(ify4);
                ify0 = ify4.i;
            }
            ibuq.c(ify0);
        }
        igm igm1 = ify0.s().C();
        ibuq.c(igm1);
        return igm1;
    }
}

