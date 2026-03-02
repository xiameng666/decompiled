import java.util.Arrays;

public final class hbob {
    public final hboa a;
    private final Boolean b;
    private final String c;

    public hbob(hbnz hbnz0) {
        this.a = hbnz0.a;
        this.b = null;
        this.c = null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof hbob) ? bata.b(this.a, ((hbob)object0).a) && bata.b(null, null) && bata.b(null, null) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, 0, 0});
    }
}

