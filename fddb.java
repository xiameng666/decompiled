public final class fddb implements evqk {
    public final fddd a;
    public final fdbf b;

    public fddb(fddd fddd0, fdbf fdbf0) {
        this.a = fddd0;
        this.b = fdbf0;
    }

    @Override  // evqk
    public final evql a(Object object0) {
        if(((ffco)object0) == null) {
            return evrg.d(Boolean.valueOf(false));
        }
        fddd fddd0 = this.a;
        fddd0.b.e(((ffco)object0));
        fddd0.c.e(((ffco)object0));
        if(!((ffco)object0).d) {
            return evrg.d(Boolean.valueOf(true));
        }
        fdfz fdfz0 = new fdfz(this.b.c.a, this.b.c.D);
        this.b.c.D.c(fdfz0);
        return batf.b(fdfz0, new fdgd()).c(new fddc(fddd0));
    }
}

