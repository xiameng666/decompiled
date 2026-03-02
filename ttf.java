public final class ttf extends tix {
    private final String a;

    public ttf() {
        this.a = "ttf";
    }

    @Override  // tix
    public final ten a(ten ten0) {
        return new ten(ten0.g());
    }

    @Override  // tix
    public final teo b(tgn tgn0, ten ten0) {
        byte[] arr_b;
        try {
            if(!tgn0.e) {
                tjk.f("checkGetDataCommand - Invalid state: SELECT must be performed", new Object[0]);
                throw new teq("Invalid state - SELECT must be performed", tes.c);
            }
            if(!ten0.f()) {
                tjk.f("checkGetDataCommand - Le absent", new Object[0]);
                throw new teq("Le absent", tes.k);
            }
            if(ten0.d() != 0x100) {
                tjk.f("checkGetDataCommand - Le required and is non-zero", new Object[0]);
                throw new teq("Le required and is non-zero", tes.k);
            }
        }
        catch(teq teq0) {
            return new teo(new byte[0], teq0.a);
        }
        tjk.f("Processing [GET DATA] {}", new Object[]{ten0.e()});
        tgg tgg0 = tgn0.b;
        tge tge0 = tgg0.a();
        tgl tgl0 = tgn0.j;
        tfg tfg0 = new tfg(new byte[]{ten0.a(), ten0.b()});
        try {
            if(tfg0.equals(new tfg(tgp.a))) {
                arr_b = tgl0.q().l().c();
            }
            else {
                arr_b = tfg0.equals(new tfg(tra.a)) ? ((tqo)tgn0).h().l().c() : tgm.c(tgl0.a, tfg0);
            }
            if(arr_b == null) {
                tjk.f("Processing [GET DATA] - checking application data", new Object[0]);
                arr_b = ((trq)tge0.d(trq.a)).g(tfg0);
            }
            if(arr_b == null) {
                tjk.f("Processing [GET DATA] - checking Other Data Record", new Object[0]);
                arr_b = ((trv)tge0.d(trv.a)).g(tfg0);
            }
            if(arr_b == null) {
                tjk.f("Processing [GET DATA] - checking risk management", new Object[0]);
                arr_b = tgm.c(tfc.c(tgg0.d), tfg0);
            }
        }
        catch(tev unused_ex) {
            tjk.f("Exception retrieving referenced data {}", new Object[]{new byte[]{ten0.a(), ten0.b()}});
            return new teo(new byte[0], tes.f);
        }
        if(arr_b == null) {
            tjk.f("Referenced data {} not found", new Object[]{new byte[]{ten0.a(), ten0.b()}});
            return new teo(new byte[0], tes.f);
        }
        tjk.f("Referenced data {} found", new Object[]{new byte[]{ten0.a(), ten0.b()}});
        return new teo(arr_b, tes.g);
    }
}

