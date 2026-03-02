import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
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

public abstract class bxyp extends wby implements bxyq {
    public bxyp() {
        super("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        bxyn bxyn0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
                    bxyn0 = (iInterface0 instanceof bxyn) ? ((bxyn)iInterface0) : new bxyl(iBinder0);
                }
                GetCredentialRequest getCredentialRequest0 = (GetCredentialRequest)wbz.a(parcel0, GetCredentialRequest.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bxyp.gr(parcel0);
                this.g(bxyn0, getCredentialRequest0, apiMetadata0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
                    bxyn0 = (iInterface1 instanceof bxyn) ? ((bxyn)iInterface1) : new bxyl(iBinder1);
                }
                RegistrationRequest registrationRequest0 = (RegistrationRequest)wbz.a(parcel0, RegistrationRequest.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bxyp.gr(parcel0);
                this.m(bxyn0, registrationRequest0, apiMetadata1);
                break;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
                    bxyn0 = (iInterface2 instanceof bxyn) ? ((bxyn)iInterface2) : new bxyl(iBinder2);
                }
                ClearRegistryRequest clearRegistryRequest0 = (ClearRegistryRequest)wbz.a(parcel0, ClearRegistryRequest.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bxyp.gr(parcel0);
                this.d(bxyn0, clearRegistryRequest0, apiMetadata2);
                break;
            }
            case 4: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
                    bxyn0 = (iInterface3 instanceof bxyn) ? ((bxyn)iInterface3) : new bxyl(iBinder3);
                }
                ImportCredentialsRequest importCredentialsRequest0 = (ImportCredentialsRequest)wbz.a(parcel0, ImportCredentialsRequest.CREATOR);
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bxyp.gr(parcel0);
                this.j(bxyn0, importCredentialsRequest0, apiMetadata3);
                break;
            }
            case 5: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
                    bxyn0 = (iInterface4 instanceof bxyn) ? ((bxyn)iInterface4) : new bxyl(iBinder4);
                }
                RegisterExportRequest registerExportRequest0 = (RegisterExportRequest)wbz.a(parcel0, RegisterExportRequest.CREATOR);
                ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bxyp.gr(parcel0);
                this.n(bxyn0, registerExportRequest0, apiMetadata4);
                break;
            }
            case 6: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
                    bxyn0 = (iInterface5 instanceof bxyn) ? ((bxyn)iInterface5) : new bxyl(iBinder5);
                }
                CreateCredentialRequest createCredentialRequest0 = (CreateCredentialRequest)wbz.a(parcel0, CreateCredentialRequest.CREATOR);
                ApiMetadata apiMetadata5 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bxyp.gr(parcel0);
                this.e(bxyn0, createCredentialRequest0, apiMetadata5);
                break;
            }
            case 8: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
                    bxyn0 = (iInterface6 instanceof bxyn) ? ((bxyn)iInterface6) : new bxyl(iBinder6);
                }
                RegisterCreationOptionsRequest registerCreationOptionsRequest0 = (RegisterCreationOptionsRequest)wbz.a(parcel0, RegisterCreationOptionsRequest.CREATOR);
                ApiMetadata apiMetadata6 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bxyp.gr(parcel0);
                this.l(bxyn0, registerCreationOptionsRequest0, apiMetadata6);
                break;
            }
            case 9: {
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
                    bxyn0 = (iInterface7 instanceof bxyn) ? ((bxyn)iInterface7) : new bxyl(iBinder7);
                }
                ClearCredentialStateRequest clearCredentialStateRequest0 = (ClearCredentialStateRequest)wbz.a(parcel0, ClearCredentialStateRequest.CREATOR);
                ApiMetadata apiMetadata7 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bxyp.gr(parcel0);
                this.b(bxyn0, clearCredentialStateRequest0, apiMetadata7);
                break;
            }
            case 10: {
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 != null) {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
                    bxyn0 = (iInterface8 instanceof bxyn) ? ((bxyn)iInterface8) : new bxyl(iBinder8);
                }
                SignalCredentialStateRequest signalCredentialStateRequest0 = (SignalCredentialStateRequest)wbz.a(parcel0, SignalCredentialStateRequest.CREATOR);
                ApiMetadata apiMetadata8 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bxyp.gr(parcel0);
                this.o(bxyn0, signalCredentialStateRequest0, apiMetadata8);
                break;
            }
            case 11: {
                IBinder iBinder9 = parcel0.readStrongBinder();
                if(iBinder9 != null) {
                    IInterface iInterface9 = iBinder9.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
                    bxyn0 = (iInterface9 instanceof bxyn) ? ((bxyn)iInterface9) : new bxyl(iBinder9);
                }
                ClearExportRequest clearExportRequest0 = (ClearExportRequest)wbz.a(parcel0, ClearExportRequest.CREATOR);
                ApiMetadata apiMetadata9 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bxyp.gr(parcel0);
                this.c(bxyn0, clearExportRequest0, apiMetadata9);
                break;
            }
            case 12: {
                IBinder iBinder10 = parcel0.readStrongBinder();
                if(iBinder10 != null) {
                    IInterface iInterface10 = iBinder10.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
                    bxyn0 = (iInterface10 instanceof bxyn) ? ((bxyn)iInterface10) : new bxyl(iBinder10);
                }
                ImportCredentialsForDeviceSetupRequest importCredentialsForDeviceSetupRequest0 = (ImportCredentialsForDeviceSetupRequest)wbz.a(parcel0, ImportCredentialsForDeviceSetupRequest.CREATOR);
                ApiMetadata apiMetadata10 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bxyp.gr(parcel0);
                this.k(bxyn0, importCredentialsForDeviceSetupRequest0, apiMetadata10);
                break;
            }
            case 13: {
                IBinder iBinder11 = parcel0.readStrongBinder();
                if(iBinder11 != null) {
                    IInterface iInterface11 = iBinder11.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
                    bxyn0 = (iInterface11 instanceof bxyn) ? ((bxyn)iInterface11) : new bxyl(iBinder11);
                }
                ExportCredentialsToDeviceSetupRequest exportCredentialsToDeviceSetupRequest0 = (ExportCredentialsToDeviceSetupRequest)wbz.a(parcel0, ExportCredentialsToDeviceSetupRequest.CREATOR);
                ApiMetadata apiMetadata11 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bxyp.gr(parcel0);
                this.f(bxyn0, exportCredentialsToDeviceSetupRequest0, apiMetadata11);
                break;
            }
            case 14: {
                IBinder iBinder12 = parcel0.readStrongBinder();
                if(iBinder12 != null) {
                    IInterface iInterface12 = iBinder12.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
                    bxyn0 = (iInterface12 instanceof bxyn) ? ((bxyn)iInterface12) : new bxyl(iBinder12);
                }
                GetCredentialTransferCapabilitiesRequest getCredentialTransferCapabilitiesRequest0 = (GetCredentialTransferCapabilitiesRequest)wbz.a(parcel0, GetCredentialTransferCapabilitiesRequest.CREATOR);
                ApiMetadata apiMetadata12 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bxyp.gr(parcel0);
                this.i(bxyn0, getCredentialTransferCapabilitiesRequest0, apiMetadata12);
                break;
            }
            case 15: {
                IBinder iBinder13 = parcel0.readStrongBinder();
                if(iBinder13 != null) {
                    IInterface iInterface13 = iBinder13.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
                    bxyn0 = (iInterface13 instanceof bxyn) ? ((bxyn)iInterface13) : new bxyl(iBinder13);
                }
                ClearCreationOptionsRequest clearCreationOptionsRequest0 = (ClearCreationOptionsRequest)wbz.a(parcel0, ClearCreationOptionsRequest.CREATOR);
                ApiMetadata apiMetadata13 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bxyp.gr(parcel0);
                this.a(bxyn0, clearCreationOptionsRequest0, apiMetadata13);
                break;
            }
            case 16: {
                IBinder iBinder14 = parcel0.readStrongBinder();
                if(iBinder14 != null) {
                    IInterface iInterface14 = iBinder14.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
                    bxyn0 = (iInterface14 instanceof bxyn) ? ((bxyn)iInterface14) : new bxyl(iBinder14);
                }
                CredentialInformationRequest credentialInformationRequest0 = (CredentialInformationRequest)wbz.a(parcel0, CredentialInformationRequest.CREATOR);
                ApiMetadata apiMetadata14 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bxyp.gr(parcel0);
                this.h(bxyn0, credentialInformationRequest0, apiMetadata14);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

