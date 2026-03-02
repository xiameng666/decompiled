import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.GetCredentialTransferCapabilitiesRequest;

public final class byfc extends cjtm {
    public final bxyn a;
    private final bxxx b;
    private final GetCredentialTransferCapabilitiesRequest c;

    public byfc(bxxx bxxx0, bxyn bxyn0, GetCredentialTransferCapabilitiesRequest getCredentialTransferCapabilitiesRequest0, azug azug0) {
        ibuq.f(bxyn0, "callbacks");
        ibuq.f(getCredentialTransferCapabilitiesRequest0, "request");
        super(0x160, "GetCredentialTransferCapabilities", azug0);
        this.b = bxxx0;
        this.a = bxyn0;
        this.c = getCredentialTransferCapabilitiesRequest0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ibuq.f(context0, "context");
        GetCredentialTransferCapabilitiesRequest getCredentialTransferCapabilitiesRequest0 = this.c;
        ibuq.f(getCredentialTransferCapabilitiesRequest0, "request");
        bxxx bxxx0 = this.b;
        ComponentName componentName0 = bxxx0.c;
        if(componentName0 == null) {
            throw new cjuh(8, "No primary provider found");
        }
        gmcu gmcu0 = new gmcu();
        Bundle bundle0 = bxxx.a(bxxx0, bxxx0.a);
        getCredentialTransferCapabilitiesRequest0.a.putBundle("androidx.credentials.providerevents.extra.CALLING_APP_INFO", bundle0);
        bxxx0.f = new bydh(bxxx0.b, bxxx0.a, componentName0, getCredentialTransferCapabilitiesRequest0, gmcu0);
        Intent intent0 = new Intent().setComponent(componentName0).setAction("androidx.credentials.DEVICE_SETUP_SERVICE_ACTION").putExtra("androidx.credentials.providerevents.service.DEVICE_SETUP_PROVIDER_KEY", "androidx.credentials.providerevents.playservices.DeviceSetupProviderPlayServices");
        ibuq.e(intent0, "putExtra(...)");
        bydh bydh0 = bxxx0.f;
        if(bydh0 == null) {
            ibuq.j("capabilitiesRemoteServiceConnection");
            bydh0 = null;
        }
        if(bydh0.d(componentName0, intent0)) {
            gmbu.t(gmcu0, new byfb(this), gmap.a);
            return;
        }
        ((ggtj)bxxx0.g.j()).x("Failed to bind to remote service");
        throw new cjuh(8, "Failed to bind to remote service");
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        this.a.i(status0, null, ApiMetadata.b);
    }
}

