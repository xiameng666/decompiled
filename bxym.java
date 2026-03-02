import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.ClearCreationOptionsResponse;
import com.google.android.gms.identitycredentials.ClearCredentialStateResponse;
import com.google.android.gms.identitycredentials.ClearExportResponse;
import com.google.android.gms.identitycredentials.ClearRegistryResponse;
import com.google.android.gms.identitycredentials.CreateCredentialHandle;
import com.google.android.gms.identitycredentials.CreateCredentialResponse;
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

public class bxym extends wby implements bxyn {
    public bxym() {
        super("com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
    }

    @Override  // bxyn
    public final void a(Status status0, ClearCreationOptionsResponse clearCreationOptionsResponse0, ApiMetadata apiMetadata0) {
        ibuq.f(status0, "status");
        throw new UnsupportedOperationException();
    }

    @Override  // bxyn
    public final void b(Status status0, ClearCredentialStateResponse clearCredentialStateResponse0, ApiMetadata apiMetadata0) {
        ibuq.f(status0, "status");
        throw new UnsupportedOperationException();
    }

    @Override  // bxyn
    public final void c(Status status0, ClearExportResponse clearExportResponse0, ApiMetadata apiMetadata0) {
        ibuq.f(status0, "status");
        throw new UnsupportedOperationException();
    }

    @Override  // bxyn
    public void d(Status status0, ClearRegistryResponse clearRegistryResponse0, ApiMetadata apiMetadata0) {
        ibuq.f(status0, "status");
        throw new UnsupportedOperationException();
    }

    @Override  // bxyn
    public void e(Status status0, CreateCredentialHandle createCredentialHandle0, ApiMetadata apiMetadata0) {
        ibuq.f(status0, "status");
        throw new UnsupportedOperationException();
    }

    @Override  // bxyn
    public final void f(Status status0, ExportCredentialsToDeviceSetupResponse exportCredentialsToDeviceSetupResponse0, ApiMetadata apiMetadata0) {
        ibuq.f(status0, "status");
        throw new UnsupportedOperationException();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                PendingGetCredentialHandle pendingGetCredentialHandle0 = (PendingGetCredentialHandle)wbz.a(parcel0, PendingGetCredentialHandle.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bxym.gr(parcel0);
                this.g(status0, pendingGetCredentialHandle0, apiMetadata0);
                return true;
            }
            case 2: {
                Status status1 = (Status)wbz.a(parcel0, Status.CREATOR);
                RegistrationResponse registrationResponse0 = (RegistrationResponse)wbz.a(parcel0, RegistrationResponse.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bxym.gr(parcel0);
                this.m(status1, registrationResponse0, apiMetadata1);
                return true;
            }
            case 3: {
                Status status2 = (Status)wbz.a(parcel0, Status.CREATOR);
                ClearRegistryResponse clearRegistryResponse0 = (ClearRegistryResponse)wbz.a(parcel0, ClearRegistryResponse.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bxym.gr(parcel0);
                this.d(status2, clearRegistryResponse0, apiMetadata2);
                return true;
            }
            case 4: {
                Status status3 = (Status)wbz.a(parcel0, Status.CREATOR);
                PendingImportCredentialsHandle pendingImportCredentialsHandle0 = (PendingImportCredentialsHandle)wbz.a(parcel0, PendingImportCredentialsHandle.CREATOR);
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bxym.gr(parcel0);
                this.j(status3, pendingImportCredentialsHandle0, apiMetadata3);
                return true;
            }
            case 5: {
                Status status4 = (Status)wbz.a(parcel0, Status.CREATOR);
                RegisterExportResponse registerExportResponse0 = (RegisterExportResponse)wbz.a(parcel0, RegisterExportResponse.CREATOR);
                ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bxym.gr(parcel0);
                this.n(status4, registerExportResponse0, apiMetadata4);
                return true;
            }
            case 6: {
                Status status5 = (Status)wbz.a(parcel0, Status.CREATOR);
                CreateCredentialResponse createCredentialResponse0 = (CreateCredentialResponse)wbz.a(parcel0, CreateCredentialResponse.CREATOR);
                ApiMetadata apiMetadata5 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bxym.gr(parcel0);
                ibuq.f(status5, "status");
                throw new UnsupportedOperationException();
            }
            case 7: {
                Status status6 = (Status)wbz.a(parcel0, Status.CREATOR);
                CreateCredentialHandle createCredentialHandle0 = (CreateCredentialHandle)wbz.a(parcel0, CreateCredentialHandle.CREATOR);
                ApiMetadata apiMetadata6 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bxym.gr(parcel0);
                this.e(status6, createCredentialHandle0, apiMetadata6);
                return true;
            }
            case 8: {
                Status status7 = (Status)wbz.a(parcel0, Status.CREATOR);
                RegisterCreationOptionsResponse registerCreationOptionsResponse0 = (RegisterCreationOptionsResponse)wbz.a(parcel0, RegisterCreationOptionsResponse.CREATOR);
                ApiMetadata apiMetadata7 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bxym.gr(parcel0);
                this.l(status7, registerCreationOptionsResponse0, apiMetadata7);
                return true;
            }
            case 9: {
                Status status8 = (Status)wbz.a(parcel0, Status.CREATOR);
                ClearCredentialStateResponse clearCredentialStateResponse0 = (ClearCredentialStateResponse)wbz.a(parcel0, ClearCredentialStateResponse.CREATOR);
                ApiMetadata apiMetadata8 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bxym.gr(parcel0);
                this.b(status8, clearCredentialStateResponse0, apiMetadata8);
                return true;
            }
            case 10: {
                Status status9 = (Status)wbz.a(parcel0, Status.CREATOR);
                SignalCredentialStateResponse signalCredentialStateResponse0 = (SignalCredentialStateResponse)wbz.a(parcel0, SignalCredentialStateResponse.CREATOR);
                ApiMetadata apiMetadata9 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bxym.gr(parcel0);
                this.o(status9, signalCredentialStateResponse0, apiMetadata9);
                return true;
            }
            case 11: {
                Status status10 = (Status)wbz.a(parcel0, Status.CREATOR);
                ClearExportResponse clearExportResponse0 = (ClearExportResponse)wbz.a(parcel0, ClearExportResponse.CREATOR);
                ApiMetadata apiMetadata10 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bxym.gr(parcel0);
                this.c(status10, clearExportResponse0, apiMetadata10);
                return true;
            }
            case 12: {
                Status status11 = (Status)wbz.a(parcel0, Status.CREATOR);
                ImportCredentialsForDeviceSetupResponse importCredentialsForDeviceSetupResponse0 = (ImportCredentialsForDeviceSetupResponse)wbz.a(parcel0, ImportCredentialsForDeviceSetupResponse.CREATOR);
                ApiMetadata apiMetadata11 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bxym.gr(parcel0);
                this.k(status11, importCredentialsForDeviceSetupResponse0, apiMetadata11);
                return true;
            }
            case 13: {
                Status status12 = (Status)wbz.a(parcel0, Status.CREATOR);
                ExportCredentialsToDeviceSetupResponse exportCredentialsToDeviceSetupResponse0 = (ExportCredentialsToDeviceSetupResponse)wbz.a(parcel0, ExportCredentialsToDeviceSetupResponse.CREATOR);
                ApiMetadata apiMetadata12 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bxym.gr(parcel0);
                this.f(status12, exportCredentialsToDeviceSetupResponse0, apiMetadata12);
                return true;
            }
            case 14: {
                Status status13 = (Status)wbz.a(parcel0, Status.CREATOR);
                CredentialTransferCapabilities credentialTransferCapabilities0 = (CredentialTransferCapabilities)wbz.a(parcel0, CredentialTransferCapabilities.CREATOR);
                ApiMetadata apiMetadata13 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bxym.gr(parcel0);
                this.i(status13, credentialTransferCapabilities0, apiMetadata13);
                return true;
            }
            case 15: {
                Status status14 = (Status)wbz.a(parcel0, Status.CREATOR);
                ClearCreationOptionsResponse clearCreationOptionsResponse0 = (ClearCreationOptionsResponse)wbz.a(parcel0, ClearCreationOptionsResponse.CREATOR);
                ApiMetadata apiMetadata14 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bxym.gr(parcel0);
                this.a(status14, clearCreationOptionsResponse0, apiMetadata14);
                return true;
            }
            case 16: {
                Status status15 = (Status)wbz.a(parcel0, Status.CREATOR);
                CredentialInformationResponse credentialInformationResponse0 = (CredentialInformationResponse)wbz.a(parcel0, CredentialInformationResponse.CREATOR);
                bxym.gr(parcel0);
                this.h(status15, credentialInformationResponse0);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // bxyn
    public void g(Status status0, PendingGetCredentialHandle pendingGetCredentialHandle0, ApiMetadata apiMetadata0) {
        ibuq.f(status0, "status");
        throw new UnsupportedOperationException();
    }

    @Override  // bxyn
    public final void h(Status status0, CredentialInformationResponse credentialInformationResponse0) {
        ibuq.f(status0, "status");
        throw new UnsupportedOperationException();
    }

    @Override  // bxyn
    public final void i(Status status0, CredentialTransferCapabilities credentialTransferCapabilities0, ApiMetadata apiMetadata0) {
        ibuq.f(status0, "status");
        throw new UnsupportedOperationException();
    }

    @Override  // bxyn
    public final void j(Status status0, PendingImportCredentialsHandle pendingImportCredentialsHandle0, ApiMetadata apiMetadata0) {
        ibuq.f(status0, "status");
        throw new UnsupportedOperationException();
    }

    @Override  // bxyn
    public final void k(Status status0, ImportCredentialsForDeviceSetupResponse importCredentialsForDeviceSetupResponse0, ApiMetadata apiMetadata0) {
        ibuq.f(status0, "status");
        throw new UnsupportedOperationException();
    }

    @Override  // bxyn
    public void l(Status status0, RegisterCreationOptionsResponse registerCreationOptionsResponse0, ApiMetadata apiMetadata0) {
        ibuq.f(status0, "status");
        throw new UnsupportedOperationException();
    }

    @Override  // bxyn
    public void m(Status status0, RegistrationResponse registrationResponse0, ApiMetadata apiMetadata0) {
        ibuq.f(status0, "status");
        throw new UnsupportedOperationException();
    }

    @Override  // bxyn
    public final void n(Status status0, RegisterExportResponse registerExportResponse0, ApiMetadata apiMetadata0) {
        ibuq.f(status0, "status");
        throw new UnsupportedOperationException();
    }

    @Override  // bxyn
    public void o(Status status0, SignalCredentialStateResponse signalCredentialStateResponse0, ApiMetadata apiMetadata0) {
        ibuq.f(status0, "status");
        throw new UnsupportedOperationException();
    }
}

