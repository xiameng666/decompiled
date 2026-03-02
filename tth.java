public final class tth extends tjc {
    private final String a;

    public tth() {
        this.a = "tth";
        new ten(null);
    }

    @Override  // tjc
    public final teo b(tgn tgn0, ten ten0) {
        tjk.f("Processing [READ RECORD] for Interac Flash", new Object[0]);
        tgn0.g = true;
        if(tgn0.e) {
            if(ten0.a() != 0) {
                if((ten0.b() & 7 ^ 4) == 0) {
                    if(ten0.f()) {
                        if(ten0.d() == 0x100) {
                            tjk.f("processReadRecordCommand", new Object[0]);
                            tge tge0 = tgn0.b.a();
                            int v = ten0.a();
                            try {
                                thp thp0 = tge0.d(new tib(((byte)((ten0.b() & 0xFF) >> 3)), ((byte)v)));
                                return thp0.b.a == 1 ? new teo(thp0.e(), tes.g) : new teo(new byte[0], tes.d);
                            }
                            catch(IllegalArgumentException illegalArgumentException0) {
                                tjk.e(("Dgi not found for record number " + v), illegalArgumentException0);
                                return new teo(new byte[0], tes.h);
                            }
                        }
                        tjk.f("checkReadRecordCommand - Le required and is non-zero", new Object[0]);
                        throw new teq("Le required and is non-zero", tes.k);
                    }
                    tjk.f("checkReadRecordCommand - Le absent", new Object[0]);
                    throw new teq("Le absent", tes.k);
                }
                tjk.f("checkReadRecordCommand - incorrect P2, bits 3-1 != 100", new Object[0]);
                throw new teq("incorrect P2, bits 3-1 != 100", tes.f);
            }
            tjk.f("checkReadRecordCommand - incorrect P1", new Object[0]);
            throw new teq("incorrect P1", tes.h);
        }
        tjk.f("checkReadRecordCommand - Invalid state: SELECT must be performed", new Object[0]);
        throw new teq("Invalid state - SELECT must be performed", tes.c);
    }
}

