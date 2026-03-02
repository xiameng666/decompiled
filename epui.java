import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.SignInRequest;
import com.google.android.gms.signin.internal.SignInResponse;

public final class epui extends bark implements azsz {
    public final Integer a;
    private final boolean b;
    private final baqv c;
    private final Bundle d;

    public epui(Context context0, Looper looper0, boolean z, baqv baqv0, Bundle bundle0, aztu aztu0, aztv aztv0) {
        super(context0, looper0, 44, baqv0, aztu0, aztv0);
        this.b = z;
        this.c = baqv0;
        this.d = bundle0;
        this.a = baqv0.h;
    }

    @Override  // azsz, baqp
    public final int a() {
        return 12451000;
    }

    @Override  // baqp
    protected final Bundle b() {
        String s = this.c.e;
        if(!"com.google.android.gms".equals(s)) {
            this.d.putString("com.google.android.gms.signin.internal.realClientPackageName", s);
        }
        return this.d;
    }

    @Override  // baqp
    protected final IInterface c(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return (iInterface0 instanceof epue) ? ((epue)iInterface0) : new epuc(iBinder0);
    }

    @Override  // baqp
    protected final String d() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override  // baqp
    protected final String e() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override  // azsz, baqp
    public final boolean gb() {
        return this.b;
    }

    public static Bundle r(baqv baqv0) {
        Integer integer0 = baqv0.h;
        Bundle bundle0 = new Bundle();
        bundle0.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", baqv0.a);
        if(integer0 != null) {
            bundle0.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", integer0.intValue());
        }
        eppt eppt0 = baqv0.g;
        bundle0.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", eppt0.b);
        bundle0.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", eppt0.c);
        bundle0.putString("com.google.android.gms.signin.internal.serverClientId", eppt0.d);
        bundle0.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle0.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", eppt0.e);
        bundle0.putString("com.google.android.gms.signin.internal.hostedDomain", eppt0.f);
        bundle0.putString("com.google.android.gms.signin.internal.logSessionId", eppt0.g);
        bundle0.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", eppt0.h);
        Long long0 = eppt0.i;
        if(long0 != null) {
            bundle0.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", long0.longValue());
        }
        Long long1 = eppt0.j;
        if(long1 != null) {
            bundle0.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", long1.longValue());
        }
        return bundle0;
    }

    public final void s() {
        this.x(new baqm(this));
    }

    public final void t(epub epub0) {
        try {
            Account account0 = this.c.a == null ? new Account("<<default account>>", "com.google") : this.c.a;
            GoogleSignInAccount googleSignInAccount0 = "<<default account>>".equals(account0.name) ? aiex.c(this.r).a() : null;
            batl.s(this.a);
            ((epue)this.H()).j(new SignInRequest(1, new ResolveAccountRequest(2, account0, ((int)this.a), googleSignInAccount0)), epub0);
        }
        catch(RemoteException remoteException0) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                epub0.a(new SignInResponse());
            }
            catch(RemoteException unused_ex) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", remoteException0);
            }
        }
    }
}

