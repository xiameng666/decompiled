public final class bdbu implements evpo {
    public final bdcd a;
    public final bdcc b;

    public bdbu(bdcd bdcd0, bdcc bdcc0) {
        this.a = bdcd0;
        this.b = bdcc0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        if(evql0.n()) {
            return evrg.d(evql0.j());
        }
        return bdcd.g(evql0.i()) ? this.a.a.g(this.a.b).e(new bdcb(this.b)) : evrg.c(evql0.i());
    }
}

