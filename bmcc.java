import j..util.Objects;
import java.util.Arrays;

public final class bmcc implements bmbn {
    private final String a;
    private final byte[] b;

    public bmcc(String s, byte[] arr_b) {
        gftb.check(s);
        this.a = s;
        gftb.check(arr_b);
        this.b = arr_b;
    }

    @Override  // bmbn
    public final hhrs a() {
        return hhrs.o(new hhro[]{new hhro(new hhrq("ver"), new hhrq(this.a)), new hhro(new hhrq("response"), hhrs.k(this.b))});
    }

    @Override  // bmbn
    public final String b() {
        return "android-safetynet";
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof bmcc) ? Objects.equals(this.a, ((bmcc)object0).a) && Arrays.equals(this.b, ((bmcc)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        Integer integer0 = Arrays.hashCode(this.b);
        return Objects.hash(new Object[]{this.a, integer0});
    }
}

