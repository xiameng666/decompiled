import j..util.Objects;

final class eiyn implements lsk {
    final eiyf a;

    public eiyn(eiyq eiyq0, eiyf eiyf0) {
        this.a = eiyf0;
        Objects.requireNonNull(eiyq0);
        super();
    }

    @Override  // lsk
    public final lsb a(Class class0) {
        return lsi.b(class0);
    }

    @Override  // lsk
    public final lsb b(Class class0, ltx ltx0) {
        lsb lsb0;
        eiyt eiyt0 = new eiyt();
        ejbk ejbk0 = (ejbk)ltx0.a(ejbk.b);
        if(ejbk0 == null) {
            ejbk0 = ejbk.a;
        }
        lrf lrf0 = lrm.a(ltx0);
        this.a.c(lrf0);
        this.a.d(eiyt0);
        this.a.b(ejbk0);
        eixs eixs0 = this.a.a();
        ibnf ibnf0 = (ibnf)((eiyo)eixh.a(eixs0, eiyo.class)).b().get(class0);
        ibts ibts0 = (ibts)ltx0.a(eiyq.a);
        Object object0 = ((eiyo)eixh.a(eixs0, eiyo.class)).a().get(class0);
        if(object0 == null) {
            if(ibts0 != null) {
                throw new IllegalStateException("Found creation callback but class " + class0.getName() + " does not have an assisted factory specified in @PommelViewModel.");
            }
            if(ibnf0 == null) {
                throw new IllegalStateException("Expected the @PommelViewModel-annotated class " + class0.getName() + " to be available in the multi-binding of @PommelViewModelMap but none was found.");
            }
            lsb0 = (lsb)ibnf0.get();
        }
        else {
            if(ibnf0 != null) {
                throw new AssertionError("Found the @PommelViewModel-annotated class " + class0.getName() + " in both the multi-bindings of @PommelViewModelMap and @PommelViewModelAssistedMap.");
            }
            if(ibts0 == null) {
                throw new IllegalStateException("Found @PommelViewModel-annotated class " + class0.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
            }
            lsb0 = (lsb)ibts0.a(object0);
        }
        Objects.requireNonNull(eiyt0);
        eiym eiym0 = new eiym(eiyt0);
        luk luk0 = lsb0.A;
        if(luk0.d) {
            luk.a(eiym0);
            return lsb0;
        }
        synchronized(luk0.a) {
            luk0.c.add(eiym0);
        }
        return lsb0;
    }

    @Override  // lsk
    public final lsb c(ibwv ibwv0, ltx ltx0) {
        return lsi.a(this, ibwv0, ltx0);
    }
}

