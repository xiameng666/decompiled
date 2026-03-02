import android.os.IInterface;
import com.google.android.gms.identitycredentials.CallingAppInfoParcelable;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;
import com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupRequest;
import com.google.android.gms.identitycredentials.GetCredentialTransferCapabilitiesRequest;
import com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupRequest;
import com.google.android.gms.identitycredentials.SignalCredentialStateRequest;

public interface bycn extends IInterface {
    void a(CreateCredentialRequest arg1, CallingAppInfoParcelable arg2, byck arg3);

    void b(ExportCredentialsToDeviceSetupRequest arg1, CallingAppInfoParcelable arg2, byct arg3);

    void c(GetCredentialTransferCapabilitiesRequest arg1, CallingAppInfoParcelable arg2, bycq arg3);

    void d(ImportCredentialsForDeviceSetupRequest arg1, CallingAppInfoParcelable arg2, bycw arg3);

    void e(SignalCredentialStateRequest arg1, CallingAppInfoParcelable arg2, bycz arg3);
}

