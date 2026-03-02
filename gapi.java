import android.content.Context;
import android.content.Intent;
import com.google.android.gms.payse.SecureElementStoredValue;
import com.google.android.gms.payse.internal.GetSeCardsRequest;

public final class gapi implements gamu {
    final gawf a;

    public gapi(Context context0) {
        this.a = gawf.a(context0);
    }

    @Override  // gamu
    public final ganp a(gano gano0) {
        GetSeCardsRequest getSeCardsRequest0 = new GetSeCardsRequest(gano0.f().a);
        SecureElementStoredValue[] arr_secureElementStoredValue = this.a.g(getSeCardsRequest0).a;
        Intent intent0 = ganp.e(0);
        intent0.putExtra("secureElementStoredValueCards", arr_secureElementStoredValue);
        return new ganp(intent0);
    }
}

