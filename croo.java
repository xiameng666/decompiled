import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import j..util.Objects;

final class croo implements Runnable {
    final boolean a;
    final AppMetadata b;
    final boolean c;
    final ConditionalUserPropertyParcel d;
    final ConditionalUserPropertyParcel e;
    final croz f;

    public croo(croz croz0, boolean z, AppMetadata appMetadata0, boolean z1, ConditionalUserPropertyParcel conditionalUserPropertyParcel0, ConditionalUserPropertyParcel conditionalUserPropertyParcel1) {
        this.a = z;
        this.b = appMetadata0;
        this.c = z1;
        this.d = conditionalUserPropertyParcel0;
        this.e = conditionalUserPropertyParcel1;
        Objects.requireNonNull(croz0);
        this.f = croz0;
        super();
    }

    @Override
    public final void run() {
        croz croz0 = this.f;
        crii crii0 = croz0.b;
        if(crii0 == null) {
            croz0.aJ().c.a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if(this.a) {
            batl.s(this.b);
            croz0.y(crii0, (this.c ? null : this.d), this.b);
        }
        else {
            try {
                if(TextUtils.isEmpty(this.e.a)) {
                    batl.s(this.b);
                    crii0.l(this.d, this.b);
                }
                else {
                    crii0.m(this.d);
                }
            }
            catch(RemoteException remoteException0) {
                this.f.aJ().c.b("Failed to send conditional user property to the service", remoteException0);
            }
        }
        this.f.w();
    }
}

