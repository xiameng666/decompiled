import java.util.concurrent.Executor;

public final class cjix {
    public String a;
    private Executor b;
    private fkqa c;
    private fkuh d;
    private fgvt e;
    private azts f;

    public final fkvs a() {
        gftb.z(this.b, "A I/O executor must be provided.");
        gftb.z(this.a, "An instance id must be provided.");
        Executor executor0 = this.b;
        String s = this.a;
        babh babh0 = babh.a();
        if(this.c == null) {
            this.c = new fkyu(babh0, fkyw.a);
        }
        if(this.d == null) {
            this.d = new cjiw(this);
        }
        if(this.e == null) {
            this.e = new fgvy();
        }
        if(this.f == null) {
            this.f = new azts(babh0, null);
        }
        fkqa fkqa0 = this.c;
        gftb.check(fkqa0);
        fkuh fkuh0 = this.d;
        gftb.check(fkuh0);
        fgvt fgvt0 = this.e;
        gftb.check(fgvt0);
        azts azts0 = this.f;
        gftb.check(azts0);
        if(hrnt.f()) {
            frcb frcb0 = new frcb(babh0);
            frcb0.a(cjsw.a);
            frcb0.d = cjsi.a;
            return new fkvs(babh0, executor0, s, new frbx(gged_interceptors.l(new ccsd(new frcc(frcb0)))), cjtb.a, fkqa0, fkuh0, fgvt0, cjtc.a, azts0);
        }
        frcb frcb1 = new frcb(babh0);
        frcb1.a(cjsw.a);
        frcb1.d = cjsi.a;
        return new fkvs(babh0, executor0, s, new frbx(gged_interceptors.l(new frcc(frcb1))), cjtb.a, fkqa0, fkuh0, fgvt0, cjtc.a, azts0);
    }

    public final void b(Executor executor0) {
        gftb.check(executor0);
        this.b = executor0;
    }
}

