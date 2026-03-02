import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public final class fcet extends bakv implements azuj {
    private final Status b;

    public fcet(DataHolder dataHolder0) {
        super(dataHolder0);
        this.b = new Status(dataHolder0.f);
    }

    @Override  // azuj
    public final Status a() {
        return this.b;
    }

    @Override  // bakv
    protected final Object e(int v, int v1) {
        return new fdhf(this.a, v, v1);
    }

    @Override  // bakv
    protected final String f() {
        return "path";
    }
}

