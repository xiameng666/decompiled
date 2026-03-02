import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class ajep extends azxr {
    final ajeq a;

    public ajep(ajeq ajeq0) {
        Objects.requireNonNull(ajeq0);
        this.a = ajeq0;
        super();
    }

    @Override  // azxs
    public final void a(Status status0) {
        if(status0.equals(Status.b)) {
            this.a.e(null);
            return;
        }
        this.a.d(status0);
    }
}

