import java.util.concurrent.Executor;

final class gpkp extends iakr {
    private final gdnz a;
    private final String b;
    private final Executor c;

    public gpkp(cmlu cmlu0, gphr gphr0) {
        this.b = gphr0.b.getAuthority();
        this.c = gphr0.d;
        this.a = new gdnz(new gpkg(cmlu0, gphr0), gphr0.c);
    }

    @Override  // iakr
    public final iakv a(gRPCMethodDescriptor iaoj0, iakq iakq0) {
        if(fhrc.a.compareAndSet(false, true)) {
            hftc hftc0 = hftc.a();
            gftb.z(hftc0, "newRegistry");
            ibjj.a = hftc0;
        }
        Executor executor0 = iakq0.c;
        gmcd gmcd0 = this.a.c();
        gpkf gpkf0 = new gpkf(iaoj0, iakq0);
        if(executor0 == null) {
            executor0 = this.c;
        }
        return new gpko(gdtf.j(gmcd0, gpkf0, executor0));
    }

    @Override  // iakr
    public final String b() {
        return this.b;
    }
}

