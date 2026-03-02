public final class ehzj {
    public static final cld a(ehwv ehwv0, ehwv ehwv1) {
        ibuq.f(ehwv0, "currentState");
        ibuq.f(ehwv1, "targetState");
        return new ehzi(ehzj.d(ehwv0), ehzj.d(ehwv1));
    }

    public static final cld b(clj clj0) {
        ibuq.f(clj0, "<this>");
        return ehzj.a(((ehwv)clj0.f()), ((ehwv)clj0.g()));
    }

    public static final qnu c(ehzg ehzg0, goz goz0) {
        goz0.M(-74107240);
        qnu qnu0 = qnv.c(goz0);
        goz0.M(-1633490746);
        int v = goz0.X(qnu0) | goz0.Z(ehzg0);
        Object object0 = goz0.j();
        if(v != 0 || object0 == gop.a) {
            object0 = new ehzh(qnu0, ehzg0, null);
            goz0.P(object0);
        }
        goz0.x();
        gqe.f(ehzg0, ((ibtw)object0), goz0);
        goz0.x();
        return qnu0;
    }

    private static final eiaw d(ehwv ehwv0) {
        if(eiav.b(ehwv0)) {
            return eiaw.a;
        }
        boolean z = !eiav.a(ehwv0);
        return eiav.a(ehwv0) ? eiaw.c : eiaw.d;
    }
}

