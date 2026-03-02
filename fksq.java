public final class fksq implements fkrl {
    public final String a;
    public final goie b;
    private final icck c;
    private final fkso d;

    public fksq(fkjj fkjj0, hhps hhps0, goie goie0, icck icck0, String s, gfsx gfsx0, gful_cronetEngineProvider gful0) {
        ibuq.f(hhps0, "config");
        ibuq.f(goie0, "clientFgs");
        ibuq.f(icck0, "scope");
        ibuq.f(gfsx0, "infiniteDataLoggerOptional");
        super();
        this.b = goie0;
        this.a = s;
        this.c = iccl.b(icck0.c().plus(new icfg(((iced)icck0.c().get(iced.c)))));
        this.d = new fkso(fkjj0, hhps0, s, gfsx0, gful0);
    }

    @Override  // fkrl
    public final gmcd a(Object object0, fkrn fkrn0) {
        fksp fksp0 = new fksp(this, null);
        gmcd gmcd0 = icpu.e(this.c, fksp0);
        return this.d.a(object0, fkrn0, gmcd0);
    }
}

