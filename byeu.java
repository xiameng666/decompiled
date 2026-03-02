import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;

public final class byeu extends cjtm {
    public final long a;
    public final int b;
    public final bxyn c;
    public final CreateCredentialRequest d;
    private final String e;
    private final bxvx f;
    private final byce g;

    public byeu(Context context0, long v, String s, int v1, bxyn bxyn0, CreateCredentialRequest createCredentialRequest0, bxvx bxvx0, byce byce0) {
        ibuq.f(context0, "context");
        ibuq.f(s, "callingPackage");
        ibuq.f(bxyn0, "callbacks");
        ibuq.f(createCredentialRequest0, "request");
        super(0x160, "CreateCredential");
        this.a = v;
        this.e = s;
        this.b = v1;
        this.c = bxyn0;
        this.d = createCredentialRequest0;
        this.f = bxvx0;
        this.g = byce0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ibuq.f(context0, "context");
        bych bych0 = (bych)ibpo.T(this.g.a(bycd.a));
        bydh bydh0 = null;
        if(bych0 == null) {
            Status status0 = new Status(8, "No primary provider found");
            this.c.e(status0, null, ApiMetadata.b);
            bxzl.d(this.a, this.b, bxzh.g, this.d, true);
            return;
        }
        bxvx bxvx0 = this.f;
        String s = this.e;
        CreateCredentialRequest createCredentialRequest0 = this.d;
        ibuq.f(s, "callingPackage");
        ibuq.f(createCredentialRequest0, "request");
        gmcu gmcu0 = new gmcu();
        gmcu gmcu1 = new gmcu();
        String s1 = createCredentialRequest0.a;
        if(ibuq.m(s1, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
            bboh bboh0 = bxvx0.d;
            ((ggtj)bboh0.h()).x("Creating conditional public key credential");
            if(bydf.b(bych0, ibpo.b("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL"))) {
                ComponentName componentName0 = bych0.c;
                if(componentName0 == null) {
                    ((ggtj)bboh0.j()).x("Provider component name is null");
                    gmcu0.r(new bxuf("android.credentials.CreateCredentialException.TYPE_UNKNOWN", "Provider component name is null"));
                }
                else {
                    ((ggtj)bboh0.h()).B("About to create remote service connection for conditional create with provider: %s", componentName0);
                    Bundle bundle0 = bydf.a(bxvx0.a, s, createCredentialRequest0.d);
                    createCredentialRequest0.c.putBundle("androidx.credentials.providerevents.extra.CALLING_APP_INFO", bundle0);
                    bxvx0.c = new bydh(bxvx0.a, s, componentName0, createCredentialRequest0, gmcu0);
                    Intent intent0 = new Intent().setComponent(componentName0).setAction("android.credentials.EVENTS_SERVICE_ACTION").putExtra("androidx.credentials.providerevents.service.EVENTS_SERVICE_PROVIDER_KEY", "androidx.credentials.providerevents.playservices.CredentialEventsProviderPlayServices");
                    ibuq.e(intent0, "putExtra(...)");
                    bydh bydh1 = bxvx0.c;
                    if(bydh1 == null) {
                        ibuq.j("remoteServiceConnection");
                        bydh1 = null;
                    }
                    if(!bydh1.d(componentName0, intent0)) {
                        ((ggtj)bboh0.j()).x("Failed to bind to remote service");
                        bydh bydh2 = bxvx0.c;
                        if(bydh2 == null) {
                            ibuq.j("remoteServiceConnection");
                        }
                        else {
                            bydh0 = bydh2;
                        }
                        bydh0.c();
                        gmcu0.r(new bxuf("android.credentials.CreateCredentialException.TYPE_UNKNOWN", "Failed to bind to remote service"));
                    }
                }
            }
            else {
                ((ggtj)bboh0.j()).x("Provider is not valid.");
                gmcu0.r(new bxuf("android.credentials.CreateCredentialException.TYPE_UNKNOWN", "Provider is not valid"));
            }
        }
        else {
            ((ggtj)bxvx0.d.j()).B("Unsupported credential type: %s", s1);
            gmcu1.r(new bxuf("android.credentials.CreateCredentialException.TYPE_UNKNOWN", "Unsupported credential type or version"));
        }
        gmbu.t(gmcu0, new bxvw(gmcu1, bxvx0, s), gmap.a);
        gmbu.t(gmcu1, new byet(this), gmap.a);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        this.c.e(status0, null, ApiMetadata.b);
    }
}

