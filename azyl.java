import com.google.android.gms.common.Feature;

public abstract class azyl {
    public final azyf a;
    public final Feature[] b;
    public final int c;

    protected azyl(azyf azyf0) {
        this(azyf0, null, 0);
    }

    protected azyl(azyf azyf0, Feature[] arr_feature, int v) {
        this.a = azyf0;
        this.b = arr_feature;
        this.c = v;
    }

    public final azyd_linstner getListener() {
        return this.a.listener_;
    }

    protected abstract void b(azsr arg1, evqp arg2);
}

