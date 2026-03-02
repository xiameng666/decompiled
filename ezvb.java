import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.update.DownloadOptions;

public final class ezvb implements azys {
    public final DownloadOptions a;

    public ezvb(DownloadOptions downloadOptions0) {
        this.a = downloadOptions0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        fabi fabi0 = (fabi)object0;
        ezuj ezuj0 = (ezuj)fabi0.H();
        ApiMetadata apiMetadata0 = cclr.a(fabi0.r);
        ezuj0.l(this.a, apiMetadata0);
        azzf.a(Status.b, ((evqp)object1));
    }
}

