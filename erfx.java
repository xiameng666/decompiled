import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;

public final class erfx extends erha {
    public erfx(azvd azvd0) {
        super(azvd0);
    }

    @Override  // erha
    public final void f(Status status0, BootstrapAccount[] arr_bootstrapAccount) {
        if(!status0.e()) {
            this.a.a(status0);
            return;
        }
        this.a.b(arr_bootstrapAccount);
    }
}

