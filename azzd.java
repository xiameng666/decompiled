import com.google.android.gms.common.Feature;

public abstract class azzd {
    public final boolean g;
    public final int h;
    private final Feature[] i;

    @Deprecated
    public azzd() {
        this.i = null;
        this.g = false;
        this.h = 0;
    }

    protected azzd(Feature[] arr_feature, boolean z, int v) {
        this.i = arr_feature;
        this.g = arr_feature != null && z;
        this.h = v;
    }

    protected abstract void a(azsr arg1, evqp arg2);

    public Feature[] f() {
        return this.i;
    }
}

