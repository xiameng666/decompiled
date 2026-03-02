import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupRequest;

public final class byff extends cjtm {
    public final bxyn a;
    private final bxxx b;
    private final ImportCredentialsForDeviceSetupRequest c;

    public byff(bxxx bxxx0, bxyn bxyn0, ImportCredentialsForDeviceSetupRequest importCredentialsForDeviceSetupRequest0, azug azug0) {
        ibuq.f(bxyn0, "callbacks");
        ibuq.f(importCredentialsForDeviceSetupRequest0, "request");
        super(0x160, "ImportCredentialsForDeviceSetup", azug0);
        this.b = bxxx0;
        this.a = bxyn0;
        this.c = importCredentialsForDeviceSetupRequest0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ibuq.f(context0, "context");
        ImportCredentialsForDeviceSetupRequest importCredentialsForDeviceSetupRequest0 = this.c;
        ibuq.f(importCredentialsForDeviceSetupRequest0, "request");
        bxxx bxxx0 = this.b;
        ComponentName componentName0 = bxxx0.c;
        if(componentName0 == null) {
            throw new cjuh(8, "No primary provider found");
        }
        gmcu gmcu0 = new gmcu();
        Bundle bundle0 = bxxx.a(bxxx0, bxxx0.a);
        importCredentialsForDeviceSetupRequest0.c.putBundle("androidx.credentials.providerevents.extra.CALLING_APP_INFO", bundle0);
        Context context1 = bxxx0.b;
        bxxx0.d = new bydh(context1, bxxx0.a, componentName0, importCredentialsForDeviceSetupRequest0, gmcu0);
        Intent intent0 = new Intent().setComponent(componentName0).setAction("androidx.credentials.DEVICE_SETUP_SERVICE_ACTION").putExtra("androidx.credentials.providerevents.service.DEVICE_SETUP_PROVIDER_KEY", "androidx.credentials.providerevents.playservices.DeviceSetupProviderPlayServices").addFlags(2);
        Uri uri0 = importCredentialsForDeviceSetupRequest0.b;
        Intent intent1 = intent0.setData(uri0);
        ibuq.e(intent1, "setData(...)");
        context1.grantUriPermission(componentName0.getPackageName(), uri0, 2);
        bydh bydh0 = bxxx0.d;
        if(bydh0 == null) {
            ibuq.j("importRemoteServiceConnection");
            bydh0 = null;
        }
        if(bydh0.d(componentName0, intent1)) {
            gmbu.t(gmcu0, new byfe(this), gmap.a);
            return;
        }
        ((ggtj)bxxx0.g.j()).x("Failed to bind to remote service");
        context1.revokeUriPermission(componentName0.getPackageName(), uri0, 2);
        throw new cjuh(8, "Failed to bind to remote service");
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        this.a.k(status0, null, ApiMetadata.b);
    }
}

