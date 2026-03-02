import android.os.IInterface;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.ClearCreationOptionsResponse;
import com.google.android.gms.identitycredentials.ClearCredentialStateResponse;
import com.google.android.gms.identitycredentials.ClearExportResponse;
import com.google.android.gms.identitycredentials.ClearRegistryResponse;
import com.google.android.gms.identitycredentials.CreateCredentialHandle;
import com.google.android.gms.identitycredentials.CredentialInformationResponse;
import com.google.android.gms.identitycredentials.CredentialTransferCapabilities;
import com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupResponse;
import com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupResponse;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import com.google.android.gms.identitycredentials.PendingImportCredentialsHandle;
import com.google.android.gms.identitycredentials.RegisterCreationOptionsResponse;
import com.google.android.gms.identitycredentials.RegisterExportResponse;
import com.google.android.gms.identitycredentials.RegistrationResponse;
import com.google.android.gms.identitycredentials.SignalCredentialStateResponse;

public interface bxyn extends IInterface {
    void a(Status arg1, ClearCreationOptionsResponse arg2, ApiMetadata arg3);

    void b(Status arg1, ClearCredentialStateResponse arg2, ApiMetadata arg3);

    void c(Status arg1, ClearExportResponse arg2, ApiMetadata arg3);

    void d(Status arg1, ClearRegistryResponse arg2, ApiMetadata arg3);

    void e(Status arg1, CreateCredentialHandle arg2, ApiMetadata arg3);

    void f(Status arg1, ExportCredentialsToDeviceSetupResponse arg2, ApiMetadata arg3);

    void g(Status arg1, PendingGetCredentialHandle arg2, ApiMetadata arg3);

    void h(Status arg1, CredentialInformationResponse arg2);

    void i(Status arg1, CredentialTransferCapabilities arg2, ApiMetadata arg3);

    void j(Status arg1, PendingImportCredentialsHandle arg2, ApiMetadata arg3);

    void k(Status arg1, ImportCredentialsForDeviceSetupResponse arg2, ApiMetadata arg3);

    void l(Status arg1, RegisterCreationOptionsResponse arg2, ApiMetadata arg3);

    void m(Status arg1, RegistrationResponse arg2, ApiMetadata arg3);

    void n(Status arg1, RegisterExportResponse arg2, ApiMetadata arg3);

    void o(Status arg1, SignalCredentialStateResponse arg2, ApiMetadata arg3);
}

