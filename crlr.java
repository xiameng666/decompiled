import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import j..util.Objects;

final class crlr implements Runnable {
    final UserAttributeParcel a;
    final AppMetadata b;
    final crih c;

    public crlr(crih crih0, UserAttributeParcel userAttributeParcel0, AppMetadata appMetadata0) {
        this.a = userAttributeParcel0;
        this.b = appMetadata0;
        Objects.requireNonNull(crih0);
        this.c = crih0;
        super();
    }

    @Override
    public final void run() {
        crqq crqq0 = this.c.a;
        crqq0.F();
        UserAttributeParcel userAttributeParcel0 = this.a;
        if(userAttributeParcel0.a() == null) {
            crqq0.W(userAttributeParcel0.b, this.b);
            return;
        }
        crqq0.ah(userAttributeParcel0, this.b);
    }
}

