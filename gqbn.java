import j..util.Objects;

public final class gqbn extends gqbr {
    public gqbn(gqbo gqbo0) {
        Objects.requireNonNull(gqbo0);
        super(gqbo0.a);
    }

    @Override
    public final Object next() {
        return this.a();
    }
}

