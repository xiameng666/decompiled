import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import j..util.Objects;

final class crlf implements Runnable {
    final ConditionalUserPropertyParcel a;
    final crih b;

    public crlf(crih crih0, ConditionalUserPropertyParcel conditionalUserPropertyParcel0) {
        this.a = conditionalUserPropertyParcel0;
        Objects.requireNonNull(crih0);
        this.b = crih0;
        super();
    }

    @Override
    public final void run() {
        crqq crqq0 = this.b.a;
        crqq0.F();
        ConditionalUserPropertyParcel conditionalUserPropertyParcel0 = this.a;
        if(conditionalUserPropertyParcel0.c.a() == null) {
            String s = conditionalUserPropertyParcel0.a;
            batl.s(s);
            AppMetadata appMetadata0 = crqq0.k(s);
            if(appMetadata0 != null) {
                crqq0.V(conditionalUserPropertyParcel0, appMetadata0);
            }
        }
        else {
            String s1 = conditionalUserPropertyParcel0.a;
            batl.s(s1);
            AppMetadata appMetadata1 = crqq0.k(s1);
            if(appMetadata1 != null) {
                crqq0.ad(conditionalUserPropertyParcel0, appMetadata1);
            }
        }
    }
}

