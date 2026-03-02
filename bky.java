import java.util.Objects;

public final class bky {
    public final Object a;

    public bky(Object object0) {
        this.a = object0;
    }

    @Override
    public final String toString() {
        Objects.toString(this.a);
        return "[Result: <" + ("Value: " + this.a) + ">]";
    }
}

