import android.os.Bundle;
import com.google.android.gms.measurement.internal.AppMetadata;
import j..util.Objects;
import java.util.concurrent.Callable;

final class crls implements Callable {
    final AppMetadata a;
    final Bundle b;
    final crih c;

    public crls(crih crih0, AppMetadata appMetadata0, Bundle bundle0) {
        this.a = appMetadata0;
        this.b = bundle0;
        Objects.requireNonNull(crih0);
        this.c = crih0;
        super();
    }

    @Override
    public final Object call() {
        this.c.a.F();
        return this.c.a.D(this.a, this.b);
    }
}

