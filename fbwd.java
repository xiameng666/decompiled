import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysResponse;
import com.google.android.gms.wallet.service.orchestration.SetUpBiometricAuthenticationKeysServiceResponse;

public final class fbwd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        ClassLoader classLoader0 = this.getClass().getClassLoader();
        return new SetUpBiometricAuthenticationKeysServiceResponse(((SetUpBiometricAuthenticationKeysResponse)bauc.a(parcel0.createByteArray(), SetUpBiometricAuthenticationKeysResponse.CREATOR)), ((Status)parcel0.readParcelable(classLoader0)));
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SetUpBiometricAuthenticationKeysServiceResponse[v];
    }
}

