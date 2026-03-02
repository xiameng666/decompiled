import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import java.io.IOException;

public final class acsg implements acsn {
    public final String a;
    public final String[] b;
    public final String c;
    public final acry d;
    public final long e;
    public final long f;

    public acsg(String[] arr_s, String s, acry acry0, long v, long v1) {
        this.a = "com.google";
        this.b = arr_s;
        this.c = s;
        this.d = acry0;
        this.e = v;
        this.f = v1;
    }

    @Override  // acsn
    public final Object a(IBinder iBinder0) {
        wtv wtv0;
        if(iBinder0 == null) {
            wtv0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            wtv0 = (iInterface0 instanceof wtv) ? ((wtv)iInterface0) : new wtt(iBinder0);
        }
        Bundle bundle0 = new Bundle();
        bundle0.putString("accountType", this.a);
        bundle0.putStringArray("account_features", this.b);
        bundle0.putString("callingActivity", this.c);
        Bundle bundle1 = wtv0.c(bundle0);
        if(bundle1 != null) {
            Parcelable[] arr_parcelable = bundle1.getParcelableArray("accounts");
            if(arr_parcelable != null) {
                Account[] arr_account = new Account[arr_parcelable.length];
                for(int v = 0; v < arr_parcelable.length; ++v) {
                    arr_account[v] = (Account)arr_parcelable[v];
                }
                this.d.b(1708, 0, this.e, System.currentTimeMillis(), this.f);
                return arr_account;
            }
        }
        throw new IOException("Receive null result from service call.");
    }
}

