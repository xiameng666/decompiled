import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import j..util.Objects;

final class crod implements Runnable {
    final AppMetadata a;
    final boolean b;
    final UserAttributeParcel c;
    final croz d;

    public crod(croz croz0, AppMetadata appMetadata0, boolean z, UserAttributeParcel userAttributeParcel0) {
        this.a = appMetadata0;
        this.b = z;
        this.c = userAttributeParcel0;
        Objects.requireNonNull(croz0);
        this.d = croz0;
        super();
    }

    @Override
    public final void run() {
        croz croz0 = this.d;
        crii crii0 = croz0.b;
        if(crii0 == null) {
            croz0.aJ().c.a("Discarding data. Failed to set user property");
            return;
        }
        batl.s(this.a);
        croz0.y(crii0, (this.b ? null : this.c), this.a);
        croz0.w();
    }
}

