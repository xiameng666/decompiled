import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.ConsentToContactsUploadParams;
import j..util.Objects;

public final class dcdj implements Runnable {
    public final dchp a;
    public final ConsentToContactsUploadParams b;

    public dcdj(dchp dchp0, ConsentToContactsUploadParams consentToContactsUploadParams0) {
        this.a = dchp0;
        this.b = consentToContactsUploadParams0;
    }

    @Override
    public final void run() {
        azxs azxs0 = this.b.a;
        Objects.requireNonNull(this.a.e);
        dcfr dcfr0 = new dcfr(this.a.e);
        NearbySharingChimeraService.ac(this.a.a, "consentToContactsUpload", azxs0, dcfr0);
    }
}

