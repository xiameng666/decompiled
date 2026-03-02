import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.identitycredentials.CallingAppInfoParcelable;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;
import com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupRequest;
import com.google.android.gms.identitycredentials.GetCredentialTransferCapabilitiesRequest;
import com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupRequest;
import com.google.android.gms.identitycredentials.SignalCredentialStateRequest;
import java.lang.ref.WeakReference;

public final class bycm extends wby implements bycn {
    public final Context a;
    public WeakReference b;
    private final Handler c;

    public bycm() {
        super("com.google.android.gms.identitycredentials.provider.ICredentialProviderService");
    }

    public bycm(kyq kyq0, Handler handler0) {
        super("com.google.android.gms.identitycredentials.provider.ICredentialProviderService");
        this.c = handler0;
        Context context0 = kyq0.getApplicationContext();
        ibuq.e(context0, "getApplicationContext(...)");
        this.a = context0;
        this.b = new WeakReference(kyq0);
    }

    @Override  // bycn
    public final void a(CreateCredentialRequest createCredentialRequest0, CallingAppInfoParcelable callingAppInfoParcelable0, byck byck0) {
        ibuq.f(createCredentialRequest0, "request");
        ibuq.f(callingAppInfoParcelable0, "callingAppInfo");
        ibuq.f(byck0, "callback");
        int v = bycm.getCallingUid();
        if(bbqw.a(this.a, v)) {
            ibuq.f(createCredentialRequest0, "request");
            Bundle bundle0 = createCredentialRequest0.c;
            Bundle bundle1 = bundle0.getBundle("androidx.credentials.providerevents.extra.CALLING_APP_INFO");
            kwv kwv0 = null;
            kvx kvx0 = bundle1 == null ? null : kvu.c(bundle1);
            if(kvx0 == null) {
                Log.e("ConversionUtils", "Failed to construct calling app info from request");
            }
            else {
                kwv0 = new kwv(kip.a(createCredentialRequest0.a, createCredentialRequest0.b, bundle0, false, null), kvx0);
            }
            if(kwv0 == null) {
                byck0.a("android.credentials.CreateCredentialException.TYPE_UNKNOWN", "Request could not be constructed");
                return;
            }
            kyl kyl0 = new kyl(this, kwv0, byck0);
            this.c.post(kyl0);
        }
    }

    @Override  // bycn
    public final void b(ExportCredentialsToDeviceSetupRequest exportCredentialsToDeviceSetupRequest0, CallingAppInfoParcelable callingAppInfoParcelable0, byct byct0) {
        ibuq.f(exportCredentialsToDeviceSetupRequest0, "request");
        ibuq.f(callingAppInfoParcelable0, "callingAppInfo");
        ibuq.f(byct0, "callback");
    }

    @Override  // bycn
    public final void c(GetCredentialTransferCapabilitiesRequest getCredentialTransferCapabilitiesRequest0, CallingAppInfoParcelable callingAppInfoParcelable0, bycq bycq0) {
        ibuq.f(getCredentialTransferCapabilitiesRequest0, "request");
        ibuq.f(callingAppInfoParcelable0, "callingAppInfo");
        ibuq.f(bycq0, "callback");
    }

    @Override  // bycn
    public final void d(ImportCredentialsForDeviceSetupRequest importCredentialsForDeviceSetupRequest0, CallingAppInfoParcelable callingAppInfoParcelable0, bycw bycw0) {
        ibuq.f(importCredentialsForDeviceSetupRequest0, "request");
        ibuq.f(callingAppInfoParcelable0, "callingAppInfo");
        ibuq.f(bycw0, "callback");
    }

    @Override  // bycn
    public final void e(SignalCredentialStateRequest signalCredentialStateRequest0, CallingAppInfoParcelable callingAppInfoParcelable0, bycz bycz0) {
        kkq kkq0;
        ibuq.f(signalCredentialStateRequest0, "request");
        ibuq.f(callingAppInfoParcelable0, "callingAppInfo");
        ibuq.f(bycz0, "callback");
        int v = bycm.getCallingUid();
        if(bbqw.a(this.a, v)) {
            ibuq.f(signalCredentialStateRequest0, "request");
            Bundle bundle0 = signalCredentialStateRequest0.c;
            Bundle bundle1 = bundle0.getBundle("androidx.credentials.providerevents.extra.CALLING_APP_INFO");
            kys kys0 = null;
            kvx kvx0 = bundle1 == null ? null : kvu.c(bundle1);
            if(kvx0 != null) {
                try {
                    String s = signalCredentialStateRequest0.a;
                    String s1 = signalCredentialStateRequest0.b;
                    ibuq.f(s, "requestType");
                    ibuq.f(bundle0, "requestData");
                    String s2 = bundle0.getString("androidx.credentials.signal_request_json_key");
                    if(s2 == null) {
                        throw new IllegalArgumentException("Bundle was missing requestJson");
                    }
                    ibuq.f(s, "requestType");
                    switch(s) {
                        case "androidx.credentials.SIGNAL_ALL_ACCEPTED_CREDENTIALS_REQUEST_TYPE": {
                            kkq0 = new kkq(s2, kkp.a(s2), s1);
                            break;
                        }
                        case "androidx.credentials.SIGNAL_CURRENT_USER_DETAILS_STATE_REQUEST_TYPE": {
                            kkq0 = new kkt(s2, kkp.a(s2), s1);
                            break;
                        }
                        case "androidx.credentials.SIGNAL_UNKNOWN_CREDENTIAL_STATE_REQUEST_TYPE": {
                            kkq0 = new kku(s2, kkp.a(s2), s1);
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException("Request type is not supported");
                        }
                    }
                    kys0 = kkq0;
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    Log.e("ConversionUtils", (illegalArgumentException0.getMessage() == null ? "Signal request conversion failed" : illegalArgumentException0.getMessage()));
                }
                ibuq.c(kys0);
                kys0 = new kys(((kkr)kys0), kvx0);
            }
            if(kys0 == null) {
                bycz0.a("android.credentials.SignalCredentialStateException.TYPE_UNKNOWN", "Request could not be constructed");
                return;
            }
            kym kym0 = new kym(this, kys0, bycz0);
            this.c.post(kym0);
        }
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        byck byck0 = null;
        switch(v) {
            case 1: {
                CreateCredentialRequest createCredentialRequest0 = (CreateCredentialRequest)wbz.a(parcel0, CreateCredentialRequest.CREATOR);
                CallingAppInfoParcelable callingAppInfoParcelable0 = (CallingAppInfoParcelable)wbz.a(parcel0, CallingAppInfoParcelable.CREATOR);
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.identitycredentials.provider.ICreateCredentialCallbacks");
                    byck0 = (iInterface0 instanceof byck) ? ((byck)iInterface0) : new byci(iBinder0);
                }
                bycm.gr(parcel0);
                this.a(createCredentialRequest0, callingAppInfoParcelable0, byck0);
                return true;
            }
            case 2: {
                SignalCredentialStateRequest signalCredentialStateRequest0 = (SignalCredentialStateRequest)wbz.a(parcel0, SignalCredentialStateRequest.CREATOR);
                CallingAppInfoParcelable callingAppInfoParcelable1 = (CallingAppInfoParcelable)wbz.a(parcel0, CallingAppInfoParcelable.CREATOR);
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.identitycredentials.provider.ISignalCredentialStateCallbacks");
                    byck0 = (iInterface1 instanceof bycz) ? ((bycz)iInterface1) : new bycx(iBinder1);
                }
                bycm.gr(parcel0);
                this.e(signalCredentialStateRequest0, callingAppInfoParcelable1, ((bycz)byck0));
                return true;
            }
            case 3: {
                ImportCredentialsForDeviceSetupRequest importCredentialsForDeviceSetupRequest0 = (ImportCredentialsForDeviceSetupRequest)wbz.a(parcel0, ImportCredentialsForDeviceSetupRequest.CREATOR);
                CallingAppInfoParcelable callingAppInfoParcelable2 = (CallingAppInfoParcelable)wbz.a(parcel0, CallingAppInfoParcelable.CREATOR);
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.identitycredentials.provider.IImportCredentialsCallbacks");
                    byck0 = (iInterface2 instanceof bycw) ? ((bycw)iInterface2) : new bycu(iBinder2);
                }
                bycm.gr(parcel0);
                this.d(importCredentialsForDeviceSetupRequest0, callingAppInfoParcelable2, ((bycw)byck0));
                return true;
            }
            case 4: {
                ExportCredentialsToDeviceSetupRequest exportCredentialsToDeviceSetupRequest0 = (ExportCredentialsToDeviceSetupRequest)wbz.a(parcel0, ExportCredentialsToDeviceSetupRequest.CREATOR);
                CallingAppInfoParcelable callingAppInfoParcelable3 = (CallingAppInfoParcelable)wbz.a(parcel0, CallingAppInfoParcelable.CREATOR);
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.identitycredentials.provider.IExportCredentialsCallbacks");
                    byck0 = (iInterface3 instanceof byct) ? ((byct)iInterface3) : new bycr(iBinder3);
                }
                bycm.gr(parcel0);
                this.b(exportCredentialsToDeviceSetupRequest0, callingAppInfoParcelable3, ((byct)byck0));
                return true;
            }
            case 5: {
                GetCredentialTransferCapabilitiesRequest getCredentialTransferCapabilitiesRequest0 = (GetCredentialTransferCapabilitiesRequest)wbz.a(parcel0, GetCredentialTransferCapabilitiesRequest.CREATOR);
                CallingAppInfoParcelable callingAppInfoParcelable4 = (CallingAppInfoParcelable)wbz.a(parcel0, CallingAppInfoParcelable.CREATOR);
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.identitycredentials.provider.ICredentialTransferCapabilitiesCallbacks");
                    byck0 = (iInterface4 instanceof bycq) ? ((bycq)iInterface4) : new byco(iBinder4);
                }
                bycm.gr(parcel0);
                this.c(getCredentialTransferCapabilitiesRequest0, callingAppInfoParcelable4, ((bycq)byck0));
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

