import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class aidl extends azvc {
    public aidl(aidr aidr0, aztw aztw0) {
        Objects.requireNonNull(aidr0);
        super(adsx.a, aztw0);
    }

    @Override  // azvc
    public final void b(Object object0) {
        super.n(((azuj)object0));
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    protected final azuj g(Status status0) {
        return new aids(status0);
    }

    @Override  // azvc
    protected final void h(azsr azsr0) {
        ((ahwy)((ahws)azsr0).H()).a(new aidq(this));
    }
}

