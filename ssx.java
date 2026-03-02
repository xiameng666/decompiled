import java.util.Arrays;

public class ssx implements ssw {
    private final byte[] a;
    public final ssy n;

    public ssx(ssy ssy0, byte[] arr_b) {
        stp.b(ssy0, "seosTag");
        stp.b(arr_b, "data");
        this.n = ssy0;
        this.a = stm.a(arr_b);
    }

    @Override  // ssw
    public byte[] a() {
        return stm.a(this.a);
    }

    @Override  // ssw
    public final ssy d() {
        return this.n;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ssw)) {
            return false;
        }
        ssy ssy0 = ((ssw)object0).d();
        if(this.n.equals(ssy0)) {
            byte[] arr_b = ((ssw)object0).a();
            return Arrays.equals(this.a, arr_b);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.a);
        return this.n.a * 0x1F + v;
    }
}

