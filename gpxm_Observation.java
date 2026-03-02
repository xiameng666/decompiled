import j..util.Objects;
import java.util.Arrays;

public class gpxm_Observation implements Comparable {
    public final int data_;
    public final double timestamp_;
    public final double[] e;

    public gpxm_Observation(int v, double f) {
        this.data_ = v;
        this.timestamp_ = f;
        this.e = null;
    }

    public gpxm_Observation(int v, double f, DataVector gpxl0) {
        this.data_ = v;
        this.timestamp_ = f;
        this.e = (double[])gpxl0.a.clone();
    }

    public void a(StringBuilder stringBuilder0) {
    }

    public final double b(int v) {
        double[] arr_f = this.e;
        Objects.requireNonNull(arr_f);
        boolean z = true;
        gftb.q(v >= 0);
        if(v >= arr_f.length) {
            z = false;
        }
        gftb.q(z);
        return arr_f[v];
    }

    public static double c(double f) {
        return Math.floor(f * 100.0) / 100.0;
    }

    @Override
    public final int compareTo(Object object0) {
        int v = Double.compare(this.timestamp_, ((gpxm_Observation)object0).timestamp_);
        return v == 0 ? Integer.compare(this.data_, ((gpxm_Observation)object0).data_) : v;
    }

    public final ObservationBuilder d() {
        ObservationBuilder gpwk0 = new ObservationBuilder();
        gpwk0.a = this.data_;
        gpwk0.b = this.timestamp_;
        gpwk0.c = this.b(0);
        gpwk0.d = this.b(1);
        gpwk0.e = this.b(2);
        gpwk0.f = this.b(3);
        gpwk0.g = this.b(4);
        gpwk0.h = this.b(5);
        gpwk0.i = this.b(6);
        gpwk0.j = this.b(7);
        gpwk0.k = this.b(8);
        return gpwk0;
    }

    public final boolean e(int v) {
        return !Double.isNaN(this.b(v));
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof gpxm_Observation) && this.data_ == ((gpxm_Observation)object0).data_ && this.timestamp_ == ((gpxm_Observation)object0).timestamp_ && Arrays.equals(this.e, ((gpxm_Observation)object0).e);
    }

    @Override
    public final int hashCode() {
        Integer integer0 = Arrays.hashCode(this.e);
        return Objects.hash(new Object[]{((int)this.data_), ((double)this.timestamp_), integer0});
    }
}

