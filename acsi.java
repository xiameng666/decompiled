import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.auth.TokenData;
import java.io.IOException;

public final class acsi implements acsn {
    public final Account a;
    public final String b;
    public final Bundle c;
    public final Context d;
    public final acry e;
    public final long f;
    public final long g;

    public acsi(Account account0, String s, Bundle bundle0, Context context0, acry acry0, long v, long v1) {
        this.a = account0;
        this.b = s;
        this.c = bundle0;
        this.d = context0;
        this.e = acry0;
        this.f = v;
        this.g = v1;
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
        Bundle bundle0 = wtv0.d(this.a, this.b, this.c);
        if(bundle0 == null) {
            throw new IOException("Service call returned null");
        }
        long v = this.g;
        long v1 = this.f;
        acry acry0 = this.e;
        Object object0 = TokenData.a(bundle0);
        if(object0 != null) {
            acry0.b(1709, 0, v1, System.currentTimeMillis(), v);
            return object0;
        }
        String s = bundle0.getString("Error");
        Intent intent0 = (Intent)bundle0.getParcelable("userRecoveryIntent");
        PendingIntent pendingIntent0 = (PendingIntent)bundle0.getParcelable("userRecoveryPendingIntent");
        int v2;
        for(v2 = 49500; true; ++v2) {
            if(v2 >= 50000) {
                v2 = 13;
                break;
            }
            if(actj.a(v2).equals(s)) {
                break;
            }
        }
        acry0.b(1709, v2, v1, System.currentTimeMillis(), v);
        acso.k(this.d, "getTokenWithDetails", s, intent0, pendingIntent0);
        throw new acse("Invalid state. Shouldn\'t happen");
    }
}

