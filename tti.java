public final class tti extends tiw {
    private final String c;

    public tti() {
        this.c = "tti";
        tjk.f("Processing Interac Flash Select", new Object[0]);
    }

    @Override  // tiw
    public final teo b(tgn tgn0, ten ten0) {
        tjk.f("Processing [SELECT] for {}", new Object[]{tgj.q});
        byte[] arr_b = ten0.h();
        if(ten0.a() == 4) {
            if(ten0.b() != 0 && ten0.b() != 2) {
                tjk.f("Processing [SELECT] - incorrect P2", new Object[0]);
                throw new teq("incorrect P1/P2", tes.h);
            }
            if(ten0.f()) {
                if(ten0.d() == 0x100) {
                    if(ten0.c() == ten0.h().length) {
                        if(tgn0.d && (ten0.c() < 5 || ten0.c() > 16)) {
                            tjk.f("Processing [SELECT] - Incorrect Application Length", new Object[0]);
                            throw new teq("Wrong length in application length", tes.k);
                        }
                        tgg tgg0 = tgn0.b;
                        thp thp0 = this.c(tgg0);
                        if(tiw.e(tiw.f(tgn0).k(), arr_b)) {
                            tjk.f("Processing the application selection", new Object[0]);
                            if(tgn0.d) {
                                tgn0.e = true;
                                tgn0.f = false;
                                tge tge0 = tgg0.a();
                                tge0.b = tjs.b(arr_b);
                                tjk.f("Generating the select response : {}", new Object[]{thp0.d()});
                                tfe tfe0 = new tfe(new tfg(ter.a));
                                tfe0.g(tiw.f(tgn0).l());
                                tfe0.g(tfc.c(thp0.e()).b(new tfg(ter.b)));
                                byte[] arr_b1 = tfe0.c();
                                tjk.f("Constructed selection Dedicated File name constructed Tag: {}", new Object[]{arr_b1});
                                return new ter(arr_b1, tes.g);
                            }
                            tjk.f("PPSE was not selected", new Object[0]);
                            return new ter(tes.c);
                        }
                        if(tti.d(arr_b)) {
                            tjk.f("Processing PPSE", new Object[0]);
                            tgn0.f();
                            return new ter(tti.g(tgn0, thp0), tes.g);
                        }
                        if(tti.d(arr_b) && tgn0.d) {
                            tjk.f("PPSE was already selected", new Object[0]);
                            return new ter(tes.c);
                        }
                        tjk.f("Select is not PPSE and not the application", new Object[0]);
                        return new ter(tes.d);
                    }
                    tjk.f("Processing [SELECT] - Incorrect Data Length", new Object[0]);
                    throw new teq("Wrong length in data", tes.k);
                }
                tjk.f("Processing [SELECT] - Le required and is non-zero", new Object[0]);
                throw new teq("Le required and is non-zero", tes.k);
            }
            tjk.f("Processing [SELECT] - Le absent", new Object[0]);
            throw new teq("Le absent", tes.k);
        }
        tjk.f("Processing [SELECT] - incorrect P1", new Object[0]);
        throw new teq("incorrect P1 - record not found", tes.h);
    }

    @Override  // tiw
    public final thp c(tgg tgg0) {
        tjk.f("in getDGIWithFCITemplate", new Object[0]);
        return (tsg)tgg0.a().d(tsg.a);
    }
}

