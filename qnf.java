import j..util.Objects;

public final class qnf extends qub {
    final qua a;
    final qub b;
    final qpn c;

    public qnf(qng qng0, qua qua0, qub qub0, qpn qpn0) {
        this.a = qua0;
        this.b = qub0;
        this.c = qpn0;
        Objects.requireNonNull(qng0);
        super();
    }

    @Override  // qub
    public final Object a(qua qua0) {
        this.a.a(qua0.a, qua0.b, ((qpn)qua0.c).a, ((qpn)qua0.d).a, qua0.e, qua0.f, qua0.g);
        String s = (String)this.b.a(this.a);
        Object object0 = qua0.f == 1.0f ? qua0.d : qua0.c;
        this.c.a(s, ((qpn)object0).b, ((qpn)object0).c, ((qpn)object0).m, ((qpn)object0).d, ((qpn)object0).e, ((qpn)object0).f, ((qpn)object0).g, ((qpn)object0).h, ((qpn)object0).i, ((qpn)object0).j, ((qpn)object0).k, ((qpn)object0).l);
        return this.c;
    }
}

