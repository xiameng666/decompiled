public final class fkyk implements ibts {
    public final fkys a;
    public final fkvu b;

    public fkyk(fkys fkys0, fkvu fkvu0) {
        this.a = fkys0;
        this.b = fkvu0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((fkvu)object0), "newServiceResponse");
        fkvu fkvu0 = this.b;
        gssv gssv0 = fkvu0.c == null ? gssv.a : fkvu0.c;
        ibuq.e(gssv0, "getGetPeopleResponse(...)");
        gssv gssv1 = ((fkvu)object0).c;
        if(gssv1 == null) {
            gssv1 = gssv.a;
        }
        fkys fkys0 = this.a;
        ibuq.e(gssv1, "getGetPeopleResponse(...)");
        boolean z = fkys.e(gssv0, gssv1);
        gssv gssv2 = fkvu0.c == null ? gssv.a : fkvu0.c;
        ibuq.e(gssv2, "getGetPeopleResponse(...)");
        gssv gssv3 = ((fkvu)object0).c;
        if(gssv3 == null) {
            gssv3 = gssv.a;
        }
        ibuq.e(gssv3, "getGetPeopleResponse(...)");
        boolean z1 = true;
        if(!fkyo.a(gssv2, gssv3)) {
            ibuq.c(fkvu0);
            fkvt fkvt0 = fkvu0.d == null ? fkvt.a : fkvu0.d;
            fkvt fkvt1 = ((fkvu)object0).d;
            if(fkvt1 == null) {
                fkvt1 = fkvt.a;
            }
            if(ibuq.m(fkvt0, fkvt1)) {
                z1 = false;
            }
        }
        if(!z && !z1) {
            return gmbu.i(fktz.e((fkvu0.c == null ? gssv.a : fkvu0.c)));
        }
        fkrh fkrh0 = new fkrh(new fkxx(new fkxv(((fkvu)object0))));
        return gdtf.j(fkys0.b.b(fkrh0, gmap.a), new fkxz(new fkxy(fkys0, fkvu0)), gmap.a);
    }
}

