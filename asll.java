import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.backup.settings.devicedata.storagemeter.StorageMeterPreference;

public final class asll implements View.OnClickListener {
    public final cmeb a;
    public final StorageMeterPreference b;
    public final String c;

    public asll(cmeb cmeb0, StorageMeterPreference storageMeterPreference0, String s) {
        this.a = cmeb0;
        this.b = storageMeterPreference0;
        this.c = s;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.a(gltz.e);
        ibts ibts0 = this.b.b;
        if(ibts0 != null) {
            String s = hqky.a.b().b();
            ibuq.e(s, "storageMeterGetStorageUrl(...)");
            ibts0.a(aslj.a(s, this.c));
        }
    }
}

