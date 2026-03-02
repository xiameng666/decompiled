import j..util.Objects;
import java.util.Arrays;

public final class aex extends ajk {
    public final float[] a;
    public final String b;
    private Integer c;

    public aex(float[] arr_f, String s) {
        kay.i(arr_f);
        this.a = arr_f;
        if(arr_f.length == 0) {
            throw new IllegalArgumentException("Embedding values cannot be empty.");
        }
        kay.i(s);
        this.b = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        return (object0 instanceof aex) ? Arrays.equals(this.a, ((aex)object0).a) && this.b.equals(((aex)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        if(this.c == null) {
            this.c = Objects.hash(new Object[]{Arrays.hashCode(this.a), this.b});
        }
        return (int)this.c;
    }
}

