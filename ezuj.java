import android.os.IInterface;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.update.ActivityStatus;
import com.google.android.gms.update.ConfigUpdateOptions;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.InstallationOptions;
import com.google.android.gms.update.SystemUpdateStatus;

public interface ezuj extends IInterface {
    long a(ApiMetadata arg1);

    SystemUpdateStatus b(ApiMetadata arg1);

    void c(DownloadOptions arg1, ApiMetadata arg2);

    void d(InstallationOptions arg1, ApiMetadata arg2);

    void e(InstallationOptions arg1, ApiMetadata arg2);

    void f(azxs arg1, ConfigUpdateOptions arg2, ApiMetadata arg3);

    void g(ApiMetadata arg1);

    void h(ApiMetadata arg1);

    void i(ezup arg1, ApiMetadata arg2);

    void j(ApiMetadata arg1);

    void k(InstallationOptions arg1, ApiMetadata arg2);

    void l(DownloadOptions arg1, ApiMetadata arg2);

    void m(ActivityStatus arg1, ApiMetadata arg2);

    void n(ezup arg1, ApiMetadata arg2);

    boolean o(ApiMetadata arg1);

    void p();
}

