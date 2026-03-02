import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.firstparty.WarmUpUiProcessRequest;

public final class fbii implements azys {
    @Override  // azys
    public final void d(Object object0, Object object1) {
        fbmg fbmg0 = (fbmg)object0;
        Bundle bundle0 = fbmg0.r();
        fbmf fbmf0 = new fbmf(((evqp)object1));
        try {
            ((fblu)fbmg0.H()).A(new WarmUpUiProcessRequest(SystemClock.elapsedRealtime()), bundle0, fbmf0);
        }
        catch(RemoteException remoteException0) {
            Log.e("WalletClientImpl", "RemoteException during warmUpUiProcess", remoteException0);
            fbmf0.t(Status.d, null, Bundle.EMPTY);
        }
    }
}

