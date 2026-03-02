import com.google.location.nearby.direct.client.internal.OperationStatus;
import j..util.Objects;

final class gyge extends gyip {
    final gyim a;

    public gyge(gygg gygg0, gyim gyim0) {
        this.a = gyim0;
        Objects.requireNonNull(gygg0);
        super();
    }

    @Override  // gyiq
    public final void a(OperationStatus operationStatus0) {
        this.a.a(((MessageLite)(operationStatus0.b.g == null ? gyic.a : operationStatus0.b.g)));
    }
}

