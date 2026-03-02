public final class fkxy implements ibts {
    public final fkys a;
    public final fkvu b;

    public fkxy(fkys fkys0, fkvu fkvu0) {
        this.a = fkys0;
        this.b = fkvu0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        gssv gssv0 = ((fkvu)object0).c;
        if(gssv0 == null) {
            gssv0 = gssv.a;
        }
        fkty fkty0 = fktz.b(gssv0);
        ibuq.c(this.b);
        ibuq.c(((fkvu)object0));
        fkty0.c = this.a.d(this.b, ((fkvu)object0));
        return fkty0.a();
    }
}

