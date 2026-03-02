import j..util.Collection.-EL;

public final class dtwi implements evqf {
    public final dtwk a;
    public final dttk b;

    public dtwi(dtwk dtwk0, dttk dttk0) {
        this.a = dtwk0;
        this.b = dttk0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        dttk dttk0 = this.b;
        if(((gtxe)object0).b.isEmpty()) {
            dttk0.a(2);
            return;
        }
        Collection.-EL.stream(((gtxe)object0).b).filter(new dtwg()).forEach(new dtwh(this.a, dttk0));
    }
}

