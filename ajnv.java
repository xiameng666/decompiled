import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.auth.firstparty.dataservice.AccountRemovalRequest;
import com.google.android.gms.auth.firstparty.dataservice.AccountRemovalResponse;
import com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest;
import com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceRequest;
import com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceResponse;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.dataservice.UpdateCredentialsRequest;

public final class ajnv {
    private final Context a;

    public ajnv(Context context0) {
        batl.s(context0);
        this.a = context0;
    }

    public final AccountRemovalResponse a(AccountRemovalRequest accountRemovalRequest0) {
        return (AccountRemovalResponse)this.f(new ajnj(this, accountRemovalRequest0));
    }

    public final CheckFactoryResetPolicyComplianceResponse b(CheckFactoryResetPolicyComplianceRequest checkFactoryResetPolicyComplianceRequest0) {
        return (CheckFactoryResetPolicyComplianceResponse)this.f(new ajno(this, checkFactoryResetPolicyComplianceRequest0));
    }

    public final TokenResponse c(TokenRequest tokenRequest0) {
        batl.t(tokenRequest0, "TokenRequest cannot be null!");
        Bundle bundle0 = tokenRequest0.b();
        bundle0.putLong("gads_service_connection_start_time_millis", SystemClock.elapsedRealtime());
        tokenRequest0.f(bundle0);
        TokenResponse tokenResponse0 = (TokenResponse)this.f(new ajnh(this, tokenRequest0));
        return tokenResponse0 == null ? new TokenResponse() : tokenResponse0;
    }

    public final TokenResponse d(AccountSignInRequest accountSignInRequest0) {
        return (TokenResponse)this.f(new ajni(this, accountSignInRequest0));
    }

    public final TokenResponse e(UpdateCredentialsRequest updateCredentialsRequest0) {
        return (TokenResponse)this.f(new ajnl(this, updateCredentialsRequest0));
    }

    public final Object f(ajnu ajnu0) {
        Object object0;
        ajob ajob0;
        long v = Binder.clearCallingIdentity();
        try {
            object0 = null;
            azox azox0 = new azox();
            baro baro0 = baro.b(this.a);
            if(baro0.c("com.google.android.gms.auth.DATA_PROXY", azox0, "GoogleAccountDataClient")) {
                try {
                    IBinder iBinder0 = azox0.a();
                    if(iBinder0 == null) {
                        ajob0 = null;
                    }
                    else {
                        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService");
                        ajob0 = (iInterface0 instanceof ajob) ? ((ajob)iInterface0) : new ajnz(iBinder0);
                    }
                    object0 = ajnu0.a(ajob0);
                }
                catch(InterruptedException interruptedException0) {
                    Log.w("GoogleAccountDataClient", "[GoogleAccountDataServiceClient] Interrupted when getting service.", interruptedException0);
                }
                catch(RemoteException remoteException0) {
                    Log.w("GoogleAccountDataClient", "[GoogleAccountDataServiceClient] RemoteException when executing call.", remoteException0);
                }
                finally {
                    baro0.g("com.google.android.gms.auth.DATA_PROXY", azox0);
                }
            }
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
        return object0;
    }

    public final String g(String s) {
        return (String)this.f(new ajns(this, s));
    }

    @Deprecated
    public final void h() {
        this.f(new ajnp(this));
    }
}

