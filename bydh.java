import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.identitycredentials.CallingAppInfoParcelable;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;
import com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupRequest;
import com.google.android.gms.identitycredentials.GetCredentialTransferCapabilitiesRequest;
import com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupRequest;
import com.google.android.gms.identitycredentials.SignalCredentialStateRequest;
import com.google.android.gms.identitycredentials.SignalCredentialStateResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class bydh extends clil {
    public final ComponentName a;
    public final bboh b;
    private final Context c;
    private final String d;
    private final Object e;
    private final gmcu f;
    private final bbku g;

    public bydh(Context context0, String s, ComponentName componentName0, Object object0, gmcu gmcu0) {
        ibuq.f(context0, "context");
        ibuq.f(s, "clientCallingPackage");
        super("identity_credentials");
        this.c = context0;
        this.d = s;
        this.a = componentName0;
        this.e = object0;
        this.f = gmcu0;
        this.g = new bbll(1, 9);
        this.b = bboh.b("RemoteServiceConnection", bbcu.fN);
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        bycn bycn0;
        ibuq.f(componentName0, "name");
        ibuq.f(iBinder0, "service");
        if(iBinder0 == null) {
            bycn0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.identitycredentials.provider.ICredentialProviderService");
            bycn0 = (iInterface0 instanceof bycn) ? ((bycn)iInterface0) : new bycl(iBinder0);
        }
        if(bycn0 == null) {
            ((ggtj)this.b.j()).B("Failed to get binder for %s", componentName0.getPackageName());
            this.i();
            return;
        }
        if(!this.h(this.d).isEmpty()) {
            gmcu gmcu0 = this.f;
            bydg bydg0 = new bydg(this);
            bbku bbku0 = this.g;
            gmcu0.hB(bydg0, bbku0);
            Object object0 = this.e;
            if((object0 instanceof CreateCredentialRequest)) {
                ibuq.d(object0, "null cannot be cast to non-null type com.google.android.gms.identitycredentials.CreateCredentialRequest");
                CallingAppInfoParcelable callingAppInfoParcelable0 = this.g(((CreateCredentialRequest)object0).d);
                ibuq.f(((CreateCredentialRequest)object0), "request");
                gmcu gmcu1 = new gmcu();
                long v = Binder.clearCallingIdentity();
                try {
                    bycn0.a(((CreateCredentialRequest)object0), callingAppInfoParcelable0, new bycj(gmcu1, this.b));
                }
                finally {
                    Binder.restoreCallingIdentity(v);
                }
                gmcd gmcd0 = gmbu.q(gmcu1, 5L, TimeUnit.SECONDS, bbku0);
                ibuq.e(gmcd0, "withTimeout(...)");
                gmbu.t(gmcd0, new byda(gmcu0), gmap.a);
                return;
            }
            if((object0 instanceof SignalCredentialStateRequest)) {
                ibuq.d(object0, "null cannot be cast to non-null type com.google.android.gms.identitycredentials.SignalCredentialStateRequest");
                CallingAppInfoParcelable callingAppInfoParcelable1 = this.g(((SignalCredentialStateRequest)object0).b);
                bboh bboh0 = this.b;
                SignalCredentialStateResponse signalCredentialStateResponse0 = byde.a(((SignalCredentialStateRequest)object0), bycn0, callingAppInfoParcelable1, bboh0);
                if(!this.f.q(signalCredentialStateResponse0)) {
                    ((ggtj)bboh0.j()).x("Failed to set result for signal credential state request");
                }
            }
            else {
                if((object0 instanceof ExportCredentialsToDeviceSetupRequest)) {
                    ibuq.d(object0, "null cannot be cast to non-null type com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupRequest");
                    CallingAppInfoParcelable callingAppInfoParcelable2 = bydh.e(this);
                    CallingAppInfoParcelable callingAppInfoParcelable3 = this.f(this.a);
                    ibuq.f(((ExportCredentialsToDeviceSetupRequest)object0), "request");
                    ibuq.f(this.c, "context");
                    gmcu gmcu2 = new gmcu();
                    long v2 = Binder.clearCallingIdentity();
                    try {
                        bycn0.b(((ExportCredentialsToDeviceSetupRequest)object0), callingAppInfoParcelable2, new bycs(gmcu2, this.b));
                    }
                    finally {
                        Binder.restoreCallingIdentity(v2);
                    }
                    gmcd gmcd1 = gmbu.q(gmcu2, 5L, TimeUnit.SECONDS, this.g);
                    ibuq.e(gmcd1, "withTimeout(...)");
                    gmbu.t(gmcd1, new bydb(this.c, callingAppInfoParcelable3, ((ExportCredentialsToDeviceSetupRequest)object0), this.f), gmap.a);
                    return;
                }
                if((object0 instanceof ImportCredentialsForDeviceSetupRequest)) {
                    ibuq.d(object0, "null cannot be cast to non-null type com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupRequest");
                    CallingAppInfoParcelable callingAppInfoParcelable4 = bydh.e(this);
                    CallingAppInfoParcelable callingAppInfoParcelable5 = this.f(this.a);
                    ibuq.f(((ImportCredentialsForDeviceSetupRequest)object0), "request");
                    ibuq.f(this.c, "context");
                    gmcu gmcu3 = new gmcu();
                    long v4 = Binder.clearCallingIdentity();
                    try {
                        bycn0.d(((ImportCredentialsForDeviceSetupRequest)object0), callingAppInfoParcelable4, new bycv(gmcu3, this.b));
                    }
                    finally {
                        Binder.restoreCallingIdentity(v4);
                    }
                    gmcd gmcd2 = gmbu.q(gmcu3, 5L, TimeUnit.SECONDS, this.g);
                    ibuq.e(gmcd2, "withTimeout(...)");
                    gmbu.t(gmcd2, new bydd(this.c, callingAppInfoParcelable5, ((ImportCredentialsForDeviceSetupRequest)object0), this.f), gmap.a);
                    return;
                }
                if((object0 instanceof GetCredentialTransferCapabilitiesRequest)) {
                    ibuq.d(object0, "null cannot be cast to non-null type com.google.android.gms.identitycredentials.GetCredentialTransferCapabilitiesRequest");
                    CallingAppInfoParcelable callingAppInfoParcelable6 = bydh.e(this);
                    CallingAppInfoParcelable callingAppInfoParcelable7 = this.f(this.a);
                    ibuq.f(((GetCredentialTransferCapabilitiesRequest)object0), "request");
                    gmcu gmcu4 = new gmcu();
                    long v6 = Binder.clearCallingIdentity();
                    try {
                        bycn0.c(((GetCredentialTransferCapabilitiesRequest)object0), callingAppInfoParcelable6, new bycp(gmcu4, this.b));
                    }
                    finally {
                        Binder.restoreCallingIdentity(v6);
                    }
                    gmcd gmcd3 = gmbu.q(gmcu4, 5L, TimeUnit.SECONDS, this.g);
                    ibuq.e(gmcd3, "withTimeout(...)");
                    gmbu.t(gmcd3, new bydc(callingAppInfoParcelable7, this.f), gmap.a);
                    return;
                }
            }
            Objects.toString(this.e);
            this.j(new bxuf("android.credentials.CreateCredentialException.TYPE_UNKNOWN", "Failed to handle request: " + this.e));
            return;
        }
        ((ggtj)this.b.j()).B("Failed to get signatures for package: %s", componentName0.getPackageName());
        this.i();
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        ibuq.f(componentName0, "name");
        if(!this.f.isDone()) {
            ((ggtj)this.b.j()).x("doServiceDisconnected but request is still pending, so setting an exception");
            this.j(new bxuf("android.credentials.CreateCredentialException.TYPE_NO_CREDENTIAL", "Provider service disconnected"));
        }
    }

    public final void c() {
        bbic.a().c(this.c, this);
    }

    public final boolean d(ComponentName componentName0, Intent intent0) {
        boolean z;
        ibuq.f(intent0, "bindIntent");
        ((ggtj)this.b.h()).B("About to bind to service: %s", componentName0);
        try {
            z = bbic.a().d(this.c, intent0, this, 5);
        }
        catch(SecurityException securityException0) {
            a.e(this.b.j(), "Failed to bind to service with error: %s", securityException0.getMessage(), securityException0);
            z = false;
        }
        ((ggtj)this.b.h()).B("bound: %s", Boolean.valueOf(z));
        return z;
    }

    static CallingAppInfoParcelable e(bydh bydh0) {
        return bydh0.g(null);
    }

    private final CallingAppInfoParcelable f(ComponentName componentName0) {
        String s = componentName0.getPackageName();
        ibuq.e(s, "getPackageName(...)");
        String s1 = componentName0.getPackageName();
        ibuq.e(s1, "getPackageName(...)");
        return new CallingAppInfoParcelable(s, this.h(s1), null);
    }

    private final CallingAppInfoParcelable g(String s) {
        List list0 = this.h(this.d);
        return new CallingAppInfoParcelable(this.d, list0, s);
    }

    private final List h(String s) {
        PackageManager packageManager0 = this.c.getPackageManager();
        try {
            PackageInfo packageInfo0 = packageManager0.getPackageInfo(s, 0x8000000);
            if(packageInfo0 == null) {
                return ibps.a;
            }
            int v = 0;
            SigningInfo signingInfo0 = packageInfo0.signingInfo;
            if(signingInfo0 == null) {
                return ibps.a;
            }
            if(signingInfo0.hasMultipleSigners()) {
                Signature[] arr_signature = signingInfo0.getApkContentsSigners();
                ibuq.e(arr_signature, "getApkContentsSigners(...)");
                List list0 = new ArrayList(arr_signature.length);
                while(v < arr_signature.length) {
                    list0.add(arr_signature[v].toByteArray());
                    ++v;
                }
                return list0;
            }
            Signature[] arr_signature1 = signingInfo0.getSigningCertificateHistory();
            ibuq.e(arr_signature1, "getSigningCertificateHistory(...)");
            List list1 = new ArrayList(arr_signature1.length);
            while(v < arr_signature1.length) {
                list1.add(arr_signature1[v].toByteArray());
                ++v;
            }
            return list1;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return ibps.a;
        }
    }

    private final void i() {
        Object object0 = this.e;
        if((object0 instanceof CreateCredentialRequest)) {
            Objects.toString(object0);
            this.j(new bxuf("android.credentials.CreateCredentialException.TYPE_UNKNOWN", "Failed to handle request: " + object0));
            return;
        }
        if((object0 instanceof SignalCredentialStateRequest)) {
            Objects.toString(object0);
            this.j(new bxvj("Failed to handle request: " + object0));
            return;
        }
        if((object0 instanceof ImportCredentialsForDeviceSetupRequest)) {
            Objects.toString(object0);
            this.j(new cjuh(8, "Failed to handle request: " + object0));
            return;
        }
        if((object0 instanceof ExportCredentialsToDeviceSetupRequest)) {
            Objects.toString(object0);
            this.j(new cjuh(8, "Failed to handle request: " + object0));
            return;
        }
        if((object0 instanceof GetCredentialTransferCapabilitiesRequest)) {
            Objects.toString(object0);
            this.j(new cjuh(8, "Failed to handle request: " + object0));
        }
    }

    private final void j(Exception exception0) {
        if(!this.f.r(exception0)) {
            ((ggtj)this.b.j()).x("Failed to set exception on callback");
        }
    }
}

