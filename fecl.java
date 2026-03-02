import android.os.RemoteException;
import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.node.accountmatching.ui.AccountMatchingChimeraActivity;

public final class fecl implements View.OnClickListener {
    public final fecn a;

    public fecl(fecn fecn0) {
        this.a = fecn0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        if(Log.isLoggable("Wear_AccountMatching", 4)) {
            Log.i("Wear_AccountMatching", "[AccountMatchingFragment] cancelling activity");
        }
        fecn fecn0 = this.a;
        azxs azxs0 = fecn0.b;
        if(azxs0 != null) {
            try {
                azxs0.a(Status.f);
            }
            catch(RemoteException remoteException0) {
                if(Log.isLoggable("Wear_AccountMatching", 6)) {
                    Log.e("Wear_AccountMatching", "[AccountMatchingFragment] callback failed", remoteException0);
                }
            }
        }
        AccountMatchingChimeraActivity accountMatchingChimeraActivity0 = fecn0.al;
        if(accountMatchingChimeraActivity0 != null) {
            accountMatchingChimeraActivity0.setResult(0);
            fecn0.al.finish();
        }
    }
}

