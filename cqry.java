import java.util.Arrays;

public final class cqry extends cqsd {
    public String[] a;

    public cqry(String[] arr_s, cqrw cqrw0) {
        super(arr_s, 12, cqrw0);
    }

    @Override  // cqsd
    protected final void a(cqrw cqrw0) {
        this.a = cqrw0.f();
    }

    public final boolean b() {
        return this.c != null && this.c.length > 2 && this.c[1].equals("_sub");
    }

    @Override  // cqsd
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof cqry) ? super.equals(object0) && Arrays.equals(this.a, ((cqry)object0).a) : false;
    }

    @Override  // cqsd
    public final int hashCode() {
        int v = Arrays.hashCode(this.a);
        return super.hashCode() * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "PTR: " + cqry.d(this.c) + " -> " + cqry.d(this.a);
    }
}

