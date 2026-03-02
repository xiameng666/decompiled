import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConsentParcel;
import j..util.Objects;
import java.util.concurrent.Callable;

final class crln implements Callable {
    final AppMetadata a;
    final crih b;

    public crln(crih crih0, AppMetadata appMetadata0) {
        this.a = appMetadata0;
        Objects.requireNonNull(crih0);
        this.b = crih0;
        super();
    }

    @Override
    public final Object call() {
        this.b.a.F();
        return new ConsentParcel(this.b.a.g(this.a.a));
    }
}

