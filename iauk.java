import j..util.Objects;

public final class iauk {
    final iaul a;

    public iauk(iaul iaul0) {
        Objects.requireNonNull(iaul0);
        this.a = iaul0;
        super();
    }

    public final void a() {
        iaul iaul0 = this.a;
        if(iaul0.c.decrementAndGet() == 0) {
            iaul0.e();
        }
    }
}

