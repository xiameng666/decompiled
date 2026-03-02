import j..util.Objects;

final class crkh extends byk {
    final crkk f;

    public crkh(crkk crkk0) {
        Objects.requireNonNull(crkk0);
        this.f = crkk0;
        super(20);
    }

    @Override  // byk
    protected final Object c(Object object0) {
        batl.q(((String)object0));
        crkk crkk0 = this.f;
        crkk0.aA();
        batl.q(((String)object0));
        crdb crdb0 = crkk0.at().k(((String)object0));
        if(crdb0 == null) {
            return null;
        }
        crkk0.aJ().k.b("Populate EES config from database on cache miss. appId", ((String)object0));
        crkk0.i(((String)object0), crkk0.e(((String)object0), crdb0.a));
        return (vys)crkk0.g.g().get(((String)object0));
    }
}

