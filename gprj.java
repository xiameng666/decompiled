import java.util.Arrays;

public final class gprj extends gprm {
    public String[] a;

    public gprj(String[] arr_s, long v, boolean z, long v1, String[] arr_s1) {
        super(arr_s, 12, 1, v, z, v1);
        this.a = arr_s1;
    }

    public gprj(String[] arr_s, gprh gprh0, boolean z) {
        super(arr_s, 12, gprh0, z);
    }

    public gprj(String[] arr_s, boolean z) {
        super(arr_s, 12, (z ? 0x8000 : 0) | 1, 0L, false, 0L);
    }

    @Override  // gprm
    protected final void a(gprh gprh0) {
        this.a = gprh0.g();
    }

    @Override  // gprm
    protected final void b(gpri gpri0) {
        gpri0.c(this.a);
    }

    public final boolean c() {
        return this.c != null && this.c.length > 2 && gpqj.c(this.c[1], "_sub");
    }

    @Override  // gprm
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof gprj) ? super.equals(object0) && gpqj.b(this.a, ((gprj)object0).a) : false;
    }

    @Override  // gprm
    public final int hashCode() {
        int v = Arrays.hashCode(gpqj.d(this.a));
        return super.hashCode() * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "PTR: " + gprj.e(this.c) + " -> " + gprj.e(this.a);
    }
}

