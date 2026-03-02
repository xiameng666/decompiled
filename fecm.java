import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.node.accountmatching.ui.AccountMatchingChimeraActivity;
import com.google.android.gms.wearable.node.accountmatching.ui.GoogleAccountInfo;
import java.util.ArrayList;

public final class fecm implements View.OnClickListener {
    public final fecn a;

    public fecm(fecn fecn0) {
        this.a = fecn0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        fecc fecc0;
        fecr fecr0 = this.a.a;
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = fecr0.b;
        int v = arrayList1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            GoogleAccountInfo googleAccountInfo0 = (GoogleAccountInfo)arrayList1.get(v1);
            if(!googleAccountInfo0.b()) {
                arrayList0.add(googleAccountInfo0.a());
            }
        }
        if(!arrayList0.isEmpty()) {
            fecn fecn0 = fecr0.f;
            if(hzyg.f()) {
                if(fecn0.b == null) {
                    IBinder iBinder0 = fecn0.requireArguments().getBinder("callback");
                    gftb.check(iBinder0);
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    azxs azxs0 = (iInterface0 instanceof azxs) ? ((azxs)iInterface0) : new azxq(iBinder0);
                    fecn0.b = azxs0;
                }
                azxs azxs1 = fecn0.b;
                Bundle bundle0 = new Bundle();
                bundle0.putStringArrayList("existing_email_list", arrayList0);
                bundle0.putBinder("callback", azxs1.asBinder());
                fecc0 = new fecc();
                fecc0.setArguments(bundle0);
            }
            else {
                Bundle bundle1 = new Bundle();
                bundle1.putStringArrayList("existing_email_list", arrayList0);
                fecc0 = new fecc();
                fecc0.setArguments(bundle1);
            }
            fecc0.show(fecn0.al.getSupportFragmentManager(), "account_matching_confirmation_dialog");
            return;
        }
        fecn fecn1 = fecr0.f;
        if(Log.isLoggable("Wear_AccountMatching", 4)) {
            Log.i("Wear_AccountMatching", "[AccountMatchingFragment] marking activity successful");
        }
        azxs azxs2 = fecn1.b;
        if(azxs2 != null) {
            try {
                azxs2.a(Status.b);
            }
            catch(RemoteException remoteException0) {
                if(Log.isLoggable("Wear_AccountMatching", 6)) {
                    Log.e("Wear_AccountMatching", "[AccountMatchingFragment] callback failed", remoteException0);
                }
            }
        }
        AccountMatchingChimeraActivity accountMatchingChimeraActivity0 = fecn1.al;
        if(accountMatchingChimeraActivity0 != null) {
            accountMatchingChimeraActivity0.setResult(-1);
            fecn1.al.finish();
        }
    }
}

