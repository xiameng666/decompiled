final class dnmh implements ibtw {
    final hfc a;
    final boolean b;
    final fule c;
    final ibth d;
    final fryv e;
    final fryv f;

    public dnmh(hfc hfc0, boolean z, fule fule0, ibth ibth0, fryv fryv0, fryv fryv1) {
        this.a = hfc0;
        this.b = z;
        this.c = fule0;
        this.d = ibth0;
        this.e = fryv0;
        this.f = fryv1;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        fcp fcp0;
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        ibth ibth0 = ((fufv)((goz)object0).h(fugo.a)).a;
        hfc hfc0 = iqn.a(dko.a(this.a), "StyledCardRewardsPreview");
        if(hyxx.c()) {
            ((goz)object0).M(0xB405E241);
            fcp0 = fcq.h(fpu.a(((goz)object0)).F, 0L, 0L, 0L, ((goz)object0), 14);
        }
        else {
            ((goz)object0).M(0xB4078E14);
            fcp0 = fcq.i(((goz)object0));
        }
        ((goz)object0).A();
        ((goz)object0).M(0x60A571D2);
        eaa eaa0 = this.b ? fulh.a(this.c, ((goz)object0)) : eah.b(28.0f);
        ((goz)object0).A();
        ((goz)object0).M(1621460061);
        crk crk0 = hyxx.c() ? null : crl.a(1.0f, fpu.a(((goz)object0)).B);
        ((goz)object0).A();
        ibth ibth1 = this.d;
        ((goz)object0).M(0x60A59D54);
        ((goz)object0).M(-1633490746);
        int v = ((goz)object0).X(ibth0) | ((goz)object0).X(ibth1);
        Object object2 = ((goz)object0).k();
        if(v != 0 || object2 == gop.a) {
            object2 = new dnmd(ibth0, ibth1);
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        ((goz)object0).A();
        fdb.b(((ibth)object2), hfc0, ibth1 != null, eaa0, fcp0, null, crk0, gzf.e(0xD038CE2, new dnmg(this.e, this.f), ((goz)object0)), ((goz)object0), 0x6000000, 0xA0);
        return ibom.a;
    }
}

