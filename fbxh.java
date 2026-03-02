import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.wallet.service.reauth.ReauthProofTokenRequest;
import com.google.android.gms.wallet.service.reauth.ReauthProofTokenResponse;

public final class fbxh extends wbx implements fbxj {
    public fbxh(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.wallet.service.reauth.IReauthService");
    }

    @Override  // fbxj
    public final ReauthProofTokenResponse a(ReauthProofTokenRequest reauthProofTokenRequest0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, reauthProofTokenRequest0);
        Parcel parcel1 = this.hM(1, parcel0);
        ReauthProofTokenResponse reauthProofTokenResponse0 = (ReauthProofTokenResponse)wbz.a(parcel1, ReauthProofTokenResponse.CREATOR);
        parcel1.recycle();
        return reauthProofTokenResponse0;
    }
}

