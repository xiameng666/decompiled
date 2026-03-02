import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.payse.SecureElementStoredValue;
import com.google.android.gms.payse.internal.ExecuteSdkOperationRequest;
import com.google.android.gms.payse.internal.ExecuteSdkOperationResponse;

public final class gapw implements gamu {
    private final gawf a;

    public gapw(Context context0) {
        gawf gawf0 = gawf.a(context0);
        super();
        this.a = gawf0;
    }

    @Override  // gamu
    public final ganp a(gano gano0) {
        int v2;
        Account account0 = gano0.f().a;
        int v = gano0.a.getIntExtra("operation_type", -1);
        SecureElementStoredValue secureElementStoredValue0 = (SecureElementStoredValue)gano0.a.getParcelableExtra("store_value");
        String s = gano0.a.getStringExtra("one_time_execution_token");
        long v1 = gano0.a.getLongExtra("amount", 0L);
        boolean z = true;
        switch(v) {
            case 0: {
                v2 = 0;
                break;
            }
            case 1: {
                v2 = 1;
                break;
            }
            default: {
                z = false;
                v2 = v;
            }
        }
        gftb.s(z, "Unsupported operationType: %s", v2);
        ExecuteSdkOperationRequest executeSdkOperationRequest0 = new ExecuteSdkOperationRequest(account0, v2, secureElementStoredValue0, s, v1);
        ExecuteSdkOperationResponse executeSdkOperationResponse0 = this.a.f(executeSdkOperationRequest0);
        Intent intent0 = ganp.e(0);
        intent0.putExtra("secureElementStoredValueCard", executeSdkOperationResponse0.b);
        intent0.putExtra("performSdkOpErrorCode", gfta.b(executeSdkOperationResponse0.c));
        return new ganp(intent0);
    }
}

