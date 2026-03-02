import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

public final class feca implements DialogInterface.OnClickListener {
    public final fecc a;

    public feca(fecc fecc0) {
        this.a = fecc0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        fecc fecc0 = this.a;
        if(hzyg.f()) {
            Bundle bundle0 = fecc0.getArguments();
            azxs azxs0 = null;
            if(bundle0 != null) {
                IBinder iBinder0 = bundle0.getBinder("callback");
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    azxs0 = (iInterface0 instanceof azxs) ? ((azxs)iInterface0) : new azxq(iBinder0);
                }
            }
            if(azxs0 != null) {
                try {
                    azxs0.a(Status.b);
                }
                catch(RemoteException remoteException0) {
                    if(Log.isLoggable("Wear_AccountMatching", 6)) {
                        Log.e("Wear_AccountMatching", "[AccountMatchingFragment] callback failed", remoteException0);
                    }
                }
            }
        }
        Context context0 = fecc0.requireContext();
        if((context0 instanceof xob)) {
            ((xob)context0).setResult(-1);
            ((xob)context0).finish();
            return;
        }
        if((context0 instanceof Activity)) {
            ((Activity)context0).setResult(-1);
            ((Activity)context0).finish();
        }
    }
}

