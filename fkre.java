import java.util.concurrent.Executor;

public final class fkre implements fktp {
    public final hfub a;
    public final fiyj b;
    public final fkrf c;
    public final cmbl d;
    public final cmas e;
    private final flae f;
    private final fkqe g;
    private final gmba h;

    public fkre(hfub hfub0, fiyj fiyj0, cmbl cmbl0, flae flae0, cmas cmas0, fkrf fkrf0, fkqe fkqe0) {
        this.h = new gmba();
        this.a = hfub0;
        this.b = fiyj0;
        this.d = cmbl0;
        this.f = flae0;
        this.e = cmas0;
        this.c = fkrf0;
        this.g = fkqe0;
    }

    @Override  // fktw
    public final gmcd b(fktx fktx0, int v, Executor executor0) {
        throw null;
    }

    @Override  // fktp
    public final gmcd c(fkua fkua0, int v, Executor executor0) {
        this.a.a();
        glzm glzm0 = gdrx.b(new fkqw(this, fkua0, v, this.f, executor0));
        gmcd gmcd0 = this.h.b(glzm0, executor0);
        gdtf.l(gmcd0, new fkrd(this), executor0);
        fkqc fkqc0 = new fkqc();
        return gdtf.b(new gmcd[]{gdtf.j(((gmcd)((gfur_Suppliers)this.g.a).ofInstance_), fkqc0, this.g.b), gmcd0}).b(new fkqd(gmcd0), gmap.a);
    }
}

