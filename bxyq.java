import android.os.IInterface;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.identitycredentials.ClearCreationOptionsRequest;
import com.google.android.gms.identitycredentials.ClearCredentialStateRequest;
import com.google.android.gms.identitycredentials.ClearExportRequest;
import com.google.android.gms.identitycredentials.ClearRegistryRequest;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;
import com.google.android.gms.identitycredentials.CredentialInformationRequest;
import com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupRequest;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.GetCredentialTransferCapabilitiesRequest;
import com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupRequest;
import com.google.android.gms.identitycredentials.ImportCredentialsRequest;
import com.google.android.gms.identitycredentials.RegisterCreationOptionsRequest;
import com.google.android.gms.identitycredentials.RegisterExportRequest;
import com.google.android.gms.identitycredentials.RegistrationRequest;
import com.google.android.gms.identitycredentials.SignalCredentialStateRequest;

public interface bxyq extends IInterface {
    void a(bxyn arg1, ClearCreationOptionsRequest arg2, ApiMetadata arg3);

    void b(bxyn arg1, ClearCredentialStateRequest arg2, ApiMetadata arg3);

    void c(bxyn arg1, ClearExportRequest arg2, ApiMetadata arg3);

    void d(bxyn arg1, ClearRegistryRequest arg2, ApiMetadata arg3);

    void e(bxyn arg1, CreateCredentialRequest arg2, ApiMetadata arg3);

    void f(bxyn arg1, ExportCredentialsToDeviceSetupRequest arg2, ApiMetadata arg3);

    void g(bxyn arg1, GetCredentialRequest arg2, ApiMetadata arg3);

    void h(bxyn arg1, CredentialInformationRequest arg2, ApiMetadata arg3);

    void i(bxyn arg1, GetCredentialTransferCapabilitiesRequest arg2, ApiMetadata arg3);

    void j(bxyn arg1, ImportCredentialsRequest arg2, ApiMetadata arg3);

    void k(bxyn arg1, ImportCredentialsForDeviceSetupRequest arg2, ApiMetadata arg3);

    void l(bxyn arg1, RegisterCreationOptionsRequest arg2, ApiMetadata arg3);

    void m(bxyn arg1, RegistrationRequest arg2, ApiMetadata arg3);

    void n(bxyn arg1, RegisterExportRequest arg2, ApiMetadata arg3);

    void o(bxyn arg1, SignalCredentialStateRequest arg2, ApiMetadata arg3);
}

