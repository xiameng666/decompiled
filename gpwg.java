import java.io.File;
import java.io.Serializable;

public final class gpwg implements Serializable {
    public final File a;
    public final ggrv b;

    public gpwg() {
        throw null;
    }

    public gpwg(File file0, ggrv ggrv0) {
        this.a = file0;
        this.b = ggrv0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof gpwg) && this.a.equals(((gpwg)object0).a)) {
            return this.b == null ? ((gpwg)object0).b == null : this.b.equals(((gpwg)object0).b);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() ^ 1000003;
        return this.b == null ? v * 1000003 : this.b.hashCode() ^ v * 1000003;
    }

    @Override
    public final String toString() {
        return "BarometerCalibrationConfiguration{barometerCalibrationTableDir=" + this.a + ", logger=" + this.b + "}";
    }
}

