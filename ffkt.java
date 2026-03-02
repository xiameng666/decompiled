import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.PrivacyRecordOptinRequest;
import j..util.Objects;

final class ffkt extends ffee {
    final PrivacyRecordOptinRequest c;
    final fdiy d;
    final fflv e;

    public ffkt(fflv fflv0, PrivacyRecordOptinRequest privacyRecordOptinRequest0, fdiy fdiy0) {
        this.c = privacyRecordOptinRequest0;
        this.d = fdiy0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("recordOptIn");
    }

    @Override  // ffee
    public final void a() {
        evql evql0;
        fdcn fdcn0;
        PrivacyRecordOptinRequest privacyRecordOptinRequest0 = this.c;
        int v = privacyRecordOptinRequest0.b;
        String s = null;
        if(v == 1) {
            fdcn0 = fdcn.a;
        }
        else {
            switch(v) {
                case 2: {
                    fdcn0 = fdcn.b;
                    break;
                }
                case 3: {
                    fdcn0 = fdcn.c;
                    break;
                }
                default: {
                    fdcn0 = null;
                }
            }
        }
        if(fdcn0 == null) {
            Log.e("WearableService", "recordOptIn: invalid optin type " + v);
            Status status0 = new Status(13);
            this.d.a(status0);
            return;
        }
        if(hzvd.d() && !ffgp.m()) {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "recordOptIn: setting consentListenerPackageToBlock to " + this.e.f.b);
            }
            s = this.e.f.c;
        }
        fdch fdch0 = this.e.C;
        batl.s(fdch0);
        String s1 = privacyRecordOptinRequest0.d;
        boolean z = privacyRecordOptinRequest0.c;
        if(!ffgp.m()) {
            evql0 = fdcn0 == fdcn.c ? fdch0.e(s1, fdcn0, z, s) : evrg.c(new IllegalArgumentException("Unsupported optInType " + fdcn0.toString()));
        }
        else if(fdcn0 != fdcn.a) {
            evql0 = evrg.c(new IllegalArgumentException("Unsupported optInType " + fdcn0.toString()));
        }
        else {
            evql0 = fdch0.e(s1, fdcn0, z, s);
        }
        evql0.z(new ffkr(this.d));
        evql0.A(new ffks());
    }
}

