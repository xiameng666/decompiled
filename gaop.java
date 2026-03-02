import android.accounts.Account;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.wallet.service.reauth.ReauthProofTokenRequest;
import com.google.android.gms.wallet.service.reauth.ReauthProofTokenResponse;
import java.util.Locale;

public final class gaop implements gamu {
    private final fbxi a;

    public gaop() {
        throw null;
    }

    public gaop(fbxi fbxi0) {
        this.a = fbxi0;
    }

    @Override  // gamu
    public final ganp a(gano gano0) {
        String s = gano0.a.getStringExtra("extra_reauth_credential");
        Account account0 = (Account)gano0.a.getParcelableExtra("extra_reauth_account");
        gano0.a.getIntExtra("extra_reauth_credential_type", 0);
        int v = 1;
        ReauthProofTokenRequest reauthProofTokenRequest0 = new ReauthProofTokenRequest(account0, s, 3, gano0.a.getIntExtra("extra_reauth_retryCount", 1));
        try {
            ReauthProofTokenResponse reauthProofTokenResponse0 = this.a.a(reauthProofTokenRequest0);
            int v1 = reauthProofTokenResponse0.b;
            if(v1 == 0) {
                Intent intent0 = ganp.e(0);
                intent0.putExtra("extra_reauth_token", reauthProofTokenResponse0.a);
                intent0.putExtra("extra_reauth_response_time_ms", reauthProofTokenResponse0.c);
                return new ganp(intent0);
            }
            switch(v1) {
                case 0: {
                    v = -1;
                    break;
                }
                case 1: {
                    break;
                }
                default: {
                    v = 2;
                    switch(v1) {
                        case 2: {
                            break;
                        }
                        case 3: {
                            v = 3;
                            break;
                        }
                        default: {
                            throw new IllegalStateException(String.format(Locale.US, "illegalState: %d", v1));
                        }
                    }
                }
            }
            return new ganp(ganp.d(v));
        }
        catch(RemoteException unused_ex) {
            return new ganp(ganp.e(3));
        }
    }
}

