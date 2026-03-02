public final class tkq extends tax {
    public boolean m;
    public int n;
    public byte[] o;

    public tkq() {
        super(null, null, null, null, null);
        this.n = 0x7F;
    }

    public tkq(taq taq0, tko tko0, tad tad0, tmz tmz0) {
        super(taq0, tko0, tad0, tmz0, new taz(null));
        this.n = 0x7F;
    }

    @Override  // tax
    public final byte[] b() {
        return this.c().b;
    }

    @Override  // tax
    protected final void f(tad tad0) {
        if(!(tad0 instanceof taf)) {
            if((tad0 instanceof tac)) {
                int v = ((tac)tad0).b;
                if(v != 7) {
                    if(v != 1 || ((tac)tad0).c != 1) {
                        throw new taa(szx.f);
                    }
                    return;
                }
                else if(((tac)tad0).c == 7) {
                    return;
                }
                throw new taa(szx.f);
            }
            if((tad0 instanceof tae)) {
                return;
            }
            throw new taa(szx.f);
        }
        taf taf0 = (taf)tad0;
        this.b();
        throw null;
    }

    public final void g() {
        if((this.a instanceof tab) && ((tab)this.a).a) {
            return;
        }
        throw new taa(szx.j);
    }
}

