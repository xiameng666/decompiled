import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import j..util.Objects;

final class crle implements Runnable {
    final ConditionalUserPropertyParcel a;
    final AppMetadata b;
    final crih c;

    public crle(crih crih0, ConditionalUserPropertyParcel conditionalUserPropertyParcel0, AppMetadata appMetadata0) {
        this.a = conditionalUserPropertyParcel0;
        this.b = appMetadata0;
        Objects.requireNonNull(crih0);
        this.c = crih0;
        super();
    }

    @Override
    public final void run() {
        crqq crqq0 = this.c.a;
        crqq0.F();
        ConditionalUserPropertyParcel conditionalUserPropertyParcel0 = this.a;
        if(conditionalUserPropertyParcel0.c.a() == null) {
            crqq0.V(conditionalUserPropertyParcel0, this.b);
            return;
        }
        crqq0.ad(conditionalUserPropertyParcel0, this.b);
    }
}

