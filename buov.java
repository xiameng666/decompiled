public final class buov implements ibts {
    public final tyb a;
    public final String b;
    public final foec c;

    public buov(tyb tyb0, String s, foec foec0) {
        this.a = tyb0;
        this.b = s;
        this.c = foec0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((frqj)object0), "it");
        txx txx0 = this.a.h(this.b);
        if(uoy.w == null) {
            uoy uoy0 = (uoy)new uoy().q();
            uoy0.X();
            uoy.w = uoy0;
        }
        txx0.b(uoy.w).p(new uph(((frqj)object0)));
        frbi.c();
        ((frqj)object0).c = this.c.g;
        ((frqj)object0).a();
        frbi.c();
        ((frqj)object0).b = 68;
        ((frqj)object0).d = frqi.b(((frqj)object0).getContext(), ((frqj)object0).b);
        ((frqj)object0).a();
        return ibom.a;
    }
}

