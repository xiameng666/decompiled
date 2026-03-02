import java.util.Arrays;

public final class fvsg {
    public final long a;
    public final float[] b;

    public fvsg(long v, float[] arr_f) {
        this.a = v;
        this.b = arr_f;
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.b);
        return "SensorEvent [timestampNano=" + this.a + ", data=" + s + "]";
    }
}

