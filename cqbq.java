import java.util.Collection;

public final class cqbq implements cqhc {
    private final gful_cronetEngineProvider a;
    private final fkwe b;

    public cqbq(fkwe fkwe0, gful_cronetEngineProvider gful0) {
        this.b = fkwe0;
        this.a = gful0;
    }

    @Override  // cqhc
    public final gmcd a() {
        gged_interceptors gged0 = gged_interceptors.i(((Collection)this.a.mr()));
        fjax fjax0 = fjay.a();
        fjax0.b(true);
        fjay fjay0 = fjax0.a();
        gmcd gmcd0 = gdtf.k(fkwe.d(this.b.a.e(fjay0)), new fkvz(this.b, gged0), gmap.a);
        cqbp cqbp0 = new cqbp();
        return glyi.g(gmcd0, Exception.class, cqbp0, gmap.a);
    }
}

