import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.update.ActivityStatus;
import com.google.android.gms.update.ConfigUpdateOptions;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.InstallationOptions;
import com.google.android.gms.update.SystemUpdateStatus;

public final class ezuh extends wbx implements ezuj {
    public ezuh(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.update.ISystemUpdateApiService");
    }

    @Override  // ezuj
    public final long a(ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, apiMetadata0);
        Parcel parcel1 = this.hM(16, parcel0);
        long v = parcel1.readLong();
        parcel1.recycle();
        return v;
    }

    @Override  // ezuj
    public final SystemUpdateStatus b(ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, apiMetadata0);
        Parcel parcel1 = this.hM(4, parcel0);
        SystemUpdateStatus systemUpdateStatus0 = (SystemUpdateStatus)wbz.a(parcel1, SystemUpdateStatus.CREATOR);
        parcel1.recycle();
        return systemUpdateStatus0;
    }

    @Override  // ezuj
    public final void c(DownloadOptions downloadOptions0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, downloadOptions0);
        wbz.f(parcel0, apiMetadata0);
        this.jp(5, parcel0);
    }

    @Override  // ezuj
    public final void d(InstallationOptions installationOptions0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, installationOptions0);
        wbz.f(parcel0, apiMetadata0);
        this.jp(6, parcel0);
    }

    @Override  // ezuj
    public final void e(InstallationOptions installationOptions0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, installationOptions0);
        wbz.f(parcel0, apiMetadata0);
        this.jp(17, parcel0);
    }

    @Override  // ezuj
    public final void f(azxs azxs0, ConfigUpdateOptions configUpdateOptions0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.h(parcel0, azxs0);
        wbz.f(parcel0, configUpdateOptions0);
        wbz.f(parcel0, apiMetadata0);
        this.jp(15, parcel0);
    }

    @Override  // ezuj
    public final void g(ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, apiMetadata0);
        this.jp(11, parcel0);
    }

    @Override  // ezuj
    public final void h(ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, apiMetadata0);
        this.jp(7, parcel0);
    }

    @Override  // ezuj
    public final void i(ezup ezup0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.h(parcel0, ezup0);
        wbz.f(parcel0, apiMetadata0);
        this.jp(2, parcel0);
    }

    @Override  // ezuj
    public final void j(ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, apiMetadata0);
        this.jp(9, parcel0);
    }

    @Override  // ezuj
    public final void k(InstallationOptions installationOptions0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, installationOptions0);
        wbz.f(parcel0, apiMetadata0);
        this.jp(12, parcel0);
    }

    @Override  // ezuj
    public final void l(DownloadOptions downloadOptions0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, downloadOptions0);
        wbz.f(parcel0, apiMetadata0);
        this.jp(8, parcel0);
    }

    @Override  // ezuj
    public final void m(ActivityStatus activityStatus0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, activityStatus0);
        wbz.f(parcel0, apiMetadata0);
        this.jp(10, parcel0);
    }

    @Override  // ezuj
    public final void n(ezup ezup0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.h(parcel0, ezup0);
        wbz.f(parcel0, apiMetadata0);
        this.jp(3, parcel0);
    }

    @Override  // ezuj
    public final boolean o(ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, apiMetadata0);
        Parcel parcel1 = this.hM(14, parcel0);
        boolean z = wbz.i(parcel1);
        parcel1.recycle();
        return z;
    }

    @Override  // ezuj
    public final void p() {
        throw null;
    }
}

