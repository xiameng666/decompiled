import java.io.Serializable;
import java.util.Arrays;

public class esxf implements Serializable, Comparable {
    public final byte[] m;

    protected esxf(byte[] arr_b) {
        this.m = arr_b;
    }

    @Override
    public final int compareTo(Object object0) {
        byte[] arr_b = ((esxf)object0).m;
        byte[] arr_b1 = this.m;
        int v = Math.min(arr_b1.length, arr_b.length);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = glxj.b(arr_b1[v1], arr_b[v1]);
            if(v2 != 0) {
                return v2;
            }
        }
        return arr_b1.length - arr_b.length;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this != object0) {
            if(object0 != null) {
                Class class0 = this.getClass();
                return object0.getClass() == class0 && Arrays.equals(this.m, ((esxf)object0).m);
            }
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.m);
    }
}

