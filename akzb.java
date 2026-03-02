import j..util.Objects;

final class akzb extends alii {
    final akzc a;

    public akzb(akzc akzc0) {
        Objects.requireNonNull(akzc0);
        this.a = akzc0;
        super();
    }

    @Override  // alij
    public final void a(String s, int v, int v1, int v2) {
        akyz akyz0 = new akyz(this, s, v, v1, v2);
        for(Object object0: this.a.b) {
            ((azyf)object0).b(akyz0);
        }
    }

    @Override  // alij
    public final void c(String s, String s1, byte[] arr_b) {
        akza akza0 = new akza(this, s, s1, arr_b);
        for(Object object0: this.a.b) {
            ((azyf)object0).b(akza0);
        }
    }
}

