public final class eqnb implements eqmz {
    private final String a;

    public eqnb(String s) {
        this.a = s;
    }

    @Override  // eqmz
    public final eqmw a() {
        return new eqna(this);
    }

    @Override  // eqmz
    public final String b() {
        return this.a;
    }

    @Override  // eqmz
    public final String c() {
        return this.a;
    }
}

