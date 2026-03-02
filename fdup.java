import j..util.Objects;

public final class fdup {
    final fduq a;

    public fdup(fduq fduq0) {
        Objects.requireNonNull(fduq0);
        this.a = fduq0;
        super();
    }

    private final fdpl a() {
        return this.a.a;
    }

    private final fdun b() {
        return this.a.b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fdup)) {
            return false;
        }
        if(!this.a().equals(((fdup)object0).a())) {
            return false;
        }
        return this.b().b.equals(((fdup)object0).b().b) ? this.b().a.equals(((fdup)object0).b().a) : false;
    }

    @Override
    public final int hashCode() {
        return (((this.a.a.b.hashCode() + 629) * 37 + this.a.a.d.hashCode()) * 37 + this.a.b.a.hashCode()) * 37 + this.a.b.b.hashCode();
    }
}

