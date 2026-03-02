import android.accounts.Account;
import android.graphics.Bitmap;
import com.google.android.gms.findmydevice.spot.suw.SetupWizardChimeraActivity;
import java.util.concurrent.ExecutionException;

public final class bpny implements gfsi {
    public final SetupWizardChimeraActivity a;

    public bpny(SetupWizardChimeraActivity setupWizardChimeraActivity0) {
        this.a = setupWizardChimeraActivity0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Account account0 = (Account)object0;
        if(account0 != null) {
            this.a.l = account0;
            foeg foeg0 = fofa.a();
            try {
                return (Bitmap)foeg0.g(account0.name, 0x20).get();
            }
            catch(ExecutionException | InterruptedException exception0) {
                throw new RuntimeException(exception0);
            }
        }
        return null;
    }
}

