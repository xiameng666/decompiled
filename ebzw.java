import j..util.Optional;

public final class ebzw implements evpo {
    public final ecag a;

    public ebzw(ecag ecag0) {
        this.a = ecag0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        if(!evql0.n()) {
            return ecaf.a;
        }
        if(!((Optional)evql0.j()).isPresent()) {
            return ecaf.d;
        }
        dykv dykv0 = ((dyhj)((Optional)evql0.j()).get()).c;
        if(dykv0 == null) {
            dykv0 = dykv.a;
        }
        dylc dylc0 = dykv0.c == null ? dylc.a : dykv0.c;
        ecag ecag0 = this.a;
        ibuq.e(dylc0, "getSePrepaidCardData(...)");
        ecag0.q = dylc0.d;
        if(dyet.b(dylc0.g) != 3) {
            return (ecag0.b.b == 2 ? ((dyoc)ecag0.b.c) : dyoc.a).c ? ecaf.c : ecaf.b;
        }
        return ecaf.b;
    }
}

