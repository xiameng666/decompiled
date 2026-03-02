import java.util.Arrays;

public final class czlw {
    public final int a;

    public czlw(int v) {
        this.a = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof czlw) && bata.b(Integer.valueOf(this.a), Integer.valueOf(((czlw)object0).a));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), ((int)0)});
    }
}

