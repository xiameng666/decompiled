import j..util.Collection.-EL;

public final class fcpq implements gfsi {
    public final fcpu a;

    public fcpq(fcpu fcpu0) {
        this.a = fcpu0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1 = ((aqfl)Collection.-EL.stream(((gged_interceptors)object0)).filter(new fcpd(this.a)).findFirst().orElseThrow(new fcpj())).g;
        return object1 == null ? aqej.a : object1;
    }
}

