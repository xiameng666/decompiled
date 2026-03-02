public class fvve implements Comparable {
    public static int e;
    public final long f;
    public final String g;
    public final int h;
    public final short i;
    public final int j;
    public final int[] k;
    public final long l;

    static {
    }

    public fvve(long v, int v1, String s, short v2, long v3, int v4, int[] arr_v) {
        this.f = v;
        this.h = v1;
        if(s == null) {
            s = "";
        }
        this.g = s;
        this.i = v2;
        this.l = v3;
        this.j = v4;
        this.k = arr_v;
    }

    public final int a() {
        return this.h + fvve.e;
    }

    @Override
    public final int compareTo(Object object0) {
        return ((fvve)object0).h - this.h;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof fvve) && this.f == ((fvve)object0).f;
    }

    @Override
    public final int hashCode() {
        return ((int)(this.f >> 0x20)) ^ ((int)this.f);
    }

    @Override
    public final String toString() {
        return "Device [mac=" + this.f + ", rssi=" + this.h + ", ssid=" + this.g + ", frequency=" + ((int)this.i) + ", scanTime=" + this.l + "]";
    }
}

