public final class bduc implements bdty {
    public final oko a;
    private final omn b;

    public bduc(omn omn0) {
        this.b = omn0;
        this.a = new bdub(this);
    }

    @Override  // bdty
    public final bdud a(String s) {
        bdua bdua0 = new bdua(s);
        return (bdud)oqj.b(this.b, true, false, bdua0);
    }

    @Override  // bdty
    public final void b(bdud bdud0) {
        bdtz bdtz0 = new bdtz(this, bdud0);
        oqj.b(this.b, false, true, bdtz0);
    }
}

