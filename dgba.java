import j..util.Collection.-EL;
import java.util.List;

public final class dgba implements dawy {
    private final dgan a;
    private final dgaw b;

    public dgba(dgan dgan0, dfsk dfsk0) {
        this.a = dgan0;
        this.b = new dgaw(dgan0, dfsk0);
    }

    @Override  // dawy
    public final dawp a() {
        return this.b;
    }

    @Override  // dawy
    public final String b() {
        return "com.google.gms.nearby.sharing";
    }

    @Override  // dawy
    public final List c() {
        dgan dgan0 = this.a;
        if(dgan0.e != -1 && dgan0.e != 0 && dgan0.e != 4) {
            dcpu dcpu0 = new dcpu();
            dcpu0.b = 1;
            dcpu0.a = 4;
            dbwu dbwu0 = dgan0.c(new dcpv(dcpu0));
            if(dbwu0 == null) {
                return ggna.a;
            }
            return (dbwu0.p == null ? heav.a : dbwu0.p).f.isEmpty() ? ggna.a : gged_interceptors.l(dbad.d((dbwu0.p == null ? heav.a : dbwu0.p), "com.google.gms.nearby.sharing"));
        }
        return ggna.a;
    }

    @Override  // dawy
    public final List d() {
        dbwy dbwy0 = this.a.n();
        return dbwy0 == null ? ggna.a : ((List)Collection.-EL.stream(dbwy0.b).filter(new dgax()).filter(new dgay()).map(new dgaz()).collect(ggaf.a));
    }

    @Override  // dawy
    public final void e() {
        dcpu dcpu0 = new dcpu();
        dcpu0.a = 2;
        dcpu0.b = 1;
        dcpv dcpv0 = new dcpv(dcpu0);
        this.a.j(dcpv0);
    }
}

