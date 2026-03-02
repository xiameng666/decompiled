import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

public final class acsm implements acsn {
    final String a;
    final Context b;

    public acsm(String s, Context context0) {
        this.a = s;
        this.b = context0;
        super();
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
        Bundle bundle0 = wtv0.f(this.a);
        acso.o(bundle0);
        String s = bundle0.getString("Error");
        Intent intent0 = (Intent)bundle0.getParcelable("userRecoveryIntent");
        PendingIntent pendingIntent0 = (PendingIntent)bundle0.getParcelable("userRecoveryPendingIntent");
        ajpt ajpt0 = ajpt.a(s);
        if(ajpt.c.equals(ajpt0)) {
            return Boolean.valueOf(true);
        }
        acso.k(this.b, "requestGoogleAccountsAccess", s, intent0, pendingIntent0);
        throw new acse("Invalid state. Shouldn\'t happen");
    }
}

