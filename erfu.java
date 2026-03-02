import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;

public final class erfu extends erha {
    public erfu(azvd azvd0) {
        super(azvd0);
    }

    @Override  // erha
    public final void c(Status status0, UserCredential[] arr_userCredential, String s, String s1) {
        erfc erfc0 = new erfc(status0, arr_userCredential, s, s1);
        this.a.b(erfc0);
    }
}

