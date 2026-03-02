public final class aaho implements lqj {
    public final aahu a;

    public aaho(aahu aahu0) {
        this.a = aahu0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        aads aads1;
        aads aads0;
        Long long0;
        aahu aahu0 = this.a;
        if(((xob)aahu0.requireContext()).isFinishing()) {
            return;
        }
        ibnf ibnf0 = aahu0.b;
        aavf aavf0 = aahu0.c;
        aahq aahq0 = new aahq(aahu0, ((aamp)object0));
        aahr aahr0 = new aahr(aahu0, ((aamp)object0));
        aadw aadw0 = new aadw(((aamp)object0).g, ((aamp)object0).a, aahu0, ((aamp)object0).b, ((aamp)object0).d, ((aamp)object0).c, ibnf0, aavf0, aahq0, aahr0);
        grxw grxw0 = aadw0.a;
        grul grul0 = aadw0.b;
        int v = grul0.b;
        if((v & 16) != 0) {
            aadv aadv0 = aadw0.c;
            gsai gsai0 = grul0.f == null ? gsai.a : grul0.f;
            aatb aatb0 = aadv0.b;
            boolean z = aadv0.c;
            boolean z1 = hojn.f().b.contains(Integer.valueOf(grxw0.c));
            du du0 = aadv0.a;
            baun baun0 = aadv0.d;
            fhrt fhrt0 = aadv0.f;
            zed zed0 = (zed)aadv0.g.get();
            Integer integer0 = null;
            if(hoju.c()) {
                aavf aavf1 = aadv0.h;
                String s = aatb0.b;
                ibuq.f(s, "accountName");
                if(ibuq.m(s, (aavf1.d == null ? null : aavf1.d.a))) {
                    aave aave0 = aavf1.d;
                    long0 = aave0 == null ? null : ((long)aave0.b);
                }
                else {
                    long0 = null;
                }
            }
            else {
                long0 = null;
            }
            if(hoju.c()) {
                integer0 = (int)grxw0.c;
            }
            aads0 = new aaek(gsai0, aatb0, z, z1, du0, baun0, fhrt0, zed0, long0, integer0, aadv0.i, aadv0.e);
            aads0.a();
            return;
        }
        if((v & 4) != 0) {
            aads1 = new aads((grul0.d == null ? gruz.a : grul0.d), aadw0.c.b, aadw0.c.a, aadw0.c.d, aadw0.c.i, aadw0.c.e);
            aads0 = aads1;
            aads0.a();
            return;
        }
        if((v & 2) != 0) {
            grwv grwv0 = grul0.c == null ? grwv.a : grul0.c;
            aadt aadt0 = new aadt(aadw0.c, grwv0);
            aads1 = new aaei(grwv0, aadw0.c.b, aadw0.c.a, aadw0.c.i, aadt0);
            aads0 = aads1;
            aads0.a();
            return;
        }
        if((v & 0x100) == 0) {
            throw new IllegalArgumentException("The alternative doesn\'t have any launchable alternatives included");
        }
        grup grup0 = grul0.i == null ? grup.a : grul0.i;
        aadu aadu0 = new aadu(aadw0.c);
        aads0 = new aadx(grup0, aadw0.c.a, aadw0.c.i, aadu0);
        aads0.a();
    }
}

