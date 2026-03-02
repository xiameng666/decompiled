import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.delegate.TokenWorkflowRequest;
import java.util.ArrayList;
import java.util.UUID;

public final class epvh {
    public static final baun a;
    public static actv b;
    public final Context c;
    private static final gged_interceptors d;
    private final ajnv e;
    private final bxjz f;

    static {
        epvh.a = epul.c("TokenRequester");
        epvh.d = gged_interceptors.p("authAccount", "booleanResult", "accountType", "authtoken", "retry");
    }

    public epvh(Context context0) {
        this.c = context0;
        this.e = new ajnv(context0);
        this.f = new bxjz(context0);
    }

    public final epvi a(TokenRequest tokenRequest0) {
        Context context2;
        PendingIntent pendingIntent0;
        azox azox0;
        ajoy ajoy0;
        TokenWorkflowRequest tokenWorkflowRequest0;
        bxjz bxjz0;
        TokenResponse tokenResponse0 = this.e.c(tokenRequest0);
        TokenData tokenData0 = tokenResponse0.w;
        if(tokenData0 != null) {
            gfsx gfsx0 = gfsx.l(tokenData0);
            return new epvi(0, gfqx.a, gfsx0);
        }
        if(ajpt.e(tokenResponse0.a())) {
            if(hyeu.a.b().a()) {
                boolean z = hoxf.k();
                return epvi.a(4, "Sign-in required.", gfsx.m(bxjs.a(this.c, tokenRequest0, z)));
            }
            try {
                bxjz0 = this.f;
                tokenWorkflowRequest0 = new TokenWorkflowRequest();
                tokenWorkflowRequest0.b(tokenRequest0.a());
                tokenWorkflowRequest0.a = tokenRequest0.a;
                tokenWorkflowRequest0.d(tokenRequest0.b());
                tokenWorkflowRequest0.e = tokenRequest0.e;
                tokenWorkflowRequest0.g = tokenRequest0.i;
                tokenWorkflowRequest0.f = tokenRequest0.b().getBoolean("suppressProgressScreen", false);
                Context context0 = bxjz0.b;
                ajoy0 = null;
                if(bxjz.a.a(context0).i()) {
                    tokenWorkflowRequest0.e = null;
                    tokenWorkflowRequest0.c();
                }
                ResolveInfo resolveInfo0 = context0.getPackageManager().resolveService(bxjz0.c, 0);
                if(resolveInfo0 == null || resolveInfo0.serviceInfo == null || resolveInfo0.serviceInfo.applicationInfo == null) {
                    throw new SecurityException("Couldn\'t resolve AuthDelegateService intent to a delegate service.");
                }
                int v = resolveInfo0.serviceInfo.applicationInfo.uid;
                String[] arr_s = context0.getPackageManager().getPackagesForUid(v);
                if(arr_s == null || arr_s.length == 0) {
                    throw new SecurityException("Cannot delegate to the service with different signature.");
                }
                try {
                    PackageInfo packageInfo0 = context0.getPackageManager().getPackageInfo(arr_s[0], 0x8000040);
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                    throw new SecurityException("Cannot delegate to the service with different signature.");
                }
                Context context1 = bxjz0.b;
                if(!azql.c(context1).f(packageInfo0)) {
                    throw new SecurityException("Cannot delegate to the service with different signature.");
                }
                bxjz0.c.setPackage(resolveInfo0.serviceInfo.packageName);
                azox0 = new azox();
                if(!bbic.a().e(context1, "AuthUiDelegateHelper", bxjz0.c, azox0, 1)) {
                    throw new InterruptedException("Unable to bind to auth delegate service.");
                }
            }
            catch(InterruptedException | RemoteException exception0) {
                epvh.a.g("Unable to fetch the intent to launch token retrieval workflow.", exception0, new Object[0]);
                return epvi.a(8, "Internal error.", gfqx.a);
            }
            try {
                try {
                    IBinder iBinder0 = azox0.a();
                    if(iBinder0 != null) {
                        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService");
                        ajoy ajoy1 = (iInterface0 instanceof ajoy) ? ((ajoy)iInterface0) : new ajow(iBinder0);
                        ajoy0 = ajoy1;
                    }
                }
                catch(InterruptedException unused_ex) {
                    IBinder iBinder1 = azox0.a();
                    if(iBinder1 != null) {
                        IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService");
                        ajoy0 = (iInterface1 instanceof ajoy) ? ((ajoy)iInterface1) : new ajow(iBinder1);
                    }
                }
                pendingIntent0 = ajoy0.j(tokenWorkflowRequest0);
                context2 = bxjz0.b;
                if(!azql.c(context2).i(pendingIntent0.getCreatorUid())) {
                    throw new SecurityException("Invalid delegate! Only first party auth delegates are supported.");
                }
                goto label_59;
            }
            catch(Throwable throwable0) {
                try {
                    bbic.a().b(bxjz0.b, azox0);
                    throw throwable0;
                label_59:
                    bbic.a().b(context2, azox0);
                    String s = hoxf.d() ? "timestamp=" + System.currentTimeMillis() : String.valueOf(UUID.randomUUID());
                    Intent intent0 = new Intent().setClassName(this.c, "com.google.android.gms.auth.uiflows.common.FilteringRedirectActivity");
                    ArrayList arrayList0 = new ArrayList(epvh.d);
                    return epvi.a(4, "Sign-in required.", gfsx.m(ajcp.a(cjok.a(this.c.getApplicationContext(), 0, intent0.setData(Uri.parse(String.format("intent://%s/%s", "com.google.android.gms.auth.uiflows.common.FilteringRedirectActivity", s))).putExtra("com.google.android.gms.auth.redirect.INTENT", pendingIntent0).putStringArrayListExtra("com.google.android.gms.auth.redirect.whitelist", arrayList0), 0x2000000))));
                }
                catch(InterruptedException | RemoteException exception0) {
                }
            }
            epvh.a.g("Unable to fetch the intent to launch token retrieval workflow.", exception0, new Object[0]);
            return epvi.a(8, "Internal error.", gfqx.a);
        }
        if(ajpt.d(tokenResponse0.a())) {
            ajpt ajpt0 = tokenResponse0.a();
            return ajpt.e.equals(ajpt0) ? epvi.a(7, "Network error.", gfqx.a) : epvi.a(8, "Internal error.", gfqx.a);
        }
        ajpt ajpt1 = tokenResponse0.a();
        if(ajpt.u.equals(ajpt1)) {
            return epvi.a(16, "Account or application is not allowed to use some or all of Google services.", gfqx.a);
        }
        ajpt ajpt2 = tokenResponse0.a();
        if(!ajpt.C.equals(ajpt2)) {
            ajpt ajpt3 = tokenResponse0.a();
            return ajpt.D.equals(ajpt3) ? epvi.a(10, "Mis-configured OAuth client, please check. Detailed error: " + tokenResponse0.a().ak, gfqx.a) : epvi.a(17, "Sign-in failed.", gfqx.a);
        }
        return epvi.a(10, "Mis-configured OAuth client, please check. Detailed error: " + tokenResponse0.a().ak, gfqx.a);
    }
}

