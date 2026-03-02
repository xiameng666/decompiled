public final class cynw implements Runnable {
    public final cyoi a;

    public cynw(cyoi cyoi0) {
        this.a = cyoi0;
    }

    @Override
    public final void run() {
        int v = 1;
        this.a.k.accept(Boolean.valueOf(true));
        cyom cyom0 = this.a.f;
        cync cync0 = cyom0.a();
        if(cync0 == null) {
            ((ggtj)cyom0.g.g().ar(0x1F26)).x("SwitchHistory: Ignore logRevertFromTheOtherSeeker call since no valid last switch");
            return;
        }
        if(cync0.b) {
            return;
        }
        gmcd gmcd0 = gmbu.i(new cyql(cyqm.a, 1));
        int v1 = cync0.l == 2 ? 3 : 5;
        if(cync0.c) {
            v = 2;
        }
        cyom0.b(gmcd0, v1, v);
    }
}

