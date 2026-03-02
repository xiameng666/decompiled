import android.app.RemoteLockscreenValidationSession;
import android.os.Bundle;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;
import com.google.android.gms.smartdevice.quickstart.QuickStartTargetEventData;
import com.google.android.gms.smartdevice.quickstart.api.TargetQuickStartApiService;
import j..util.Objects;

public final class eqzz extends eqwt {
    final eraf a;

    public eqzz(eraf eraf0) {
        Objects.requireNonNull(eraf0);
        this.a = eraf0;
        super();
    }

    @Override  // eqwu
    public final void a() {
        TargetQuickStartApiService.a.d("Internal callbacks: onAwaitUserVerification()", new Object[0]);
        eqwx eqwx0 = this.a.a;
        if(eqwx0 != null) {
            eqwx0.b(new QuickStartTargetEventData(9, null, null, 0, false, null, 0, null, false, null, 0));
        }
    }

    @Override  // eqwu
    public final void b(BootstrapCompletionResult bootstrapCompletionResult0) {
        TargetQuickStartApiService.a.d("Internal callbacks: onCompleted()", new Object[0]);
        eqzx eqzx0 = this.a.b;
        if(eqzx0 != null) {
            eqzx0.c(bootstrapCompletionResult0);
        }
    }

    @Override  // eqwu
    public final void c() {
        TargetQuickStartApiService.a.d("Internal callbacks: onConnected()", new Object[0]);
        eqzx eqzx0 = this.a.b;
        if(eqzx0 != null) {
            eqzx0.i();
        }
    }

    @Override  // eqwu
    public final void d() {
        TargetQuickStartApiService.a.f("Internal callbacks: onDisconnected()", new Object[0]);
        eqwx eqwx0 = this.a.a;
        if(eqwx0 != null) {
            eqwx0.a();
        }
    }

    @Override  // eqwu
    public final void e(int v, Bundle bundle0) {
        TargetQuickStartApiService.a.f("onError: %d", new Object[]{v});
        eqzx eqzx0 = this.a.b;
        if(eqzx0 != null) {
            eqzx0.g(v);
        }
    }

    @Override  // eqwu
    public final void f(QuickStartTargetEventData quickStartTargetEventData0) {
        TargetQuickStartApiService.a.d("Internal callbacks: onEvent(%d)", new Object[]{((int)quickStartTargetEventData0.a)});
        eqwx eqwx0 = this.a.a;
        if(eqwx0 != null) {
            eqwx0.b(quickStartTargetEventData0);
        }
    }

    @Override  // eqwu
    public final void g(VerificationInfo verificationInfo0) {
        TargetQuickStartApiService.a.d("Internal callbacks: onNearbyVerification()", new Object[0]);
        eqwx eqwx0 = this.a.a;
        if(eqwx0 != null) {
            batl.t(verificationInfo0, "VerificationInfo cannot be null");
            eqwx0.b(new QuickStartTargetEventData(2, null, verificationInfo0, 0, false, null, 0, null, false, null, 0));
        }
    }

    @Override  // eqwu
    public final void h(RemoteLockscreenValidationSession remoteLockscreenValidationSession0) {
        TargetQuickStartApiService.a.d("Internal callbacks: onPromptForLskf()", new Object[0]);
    }

    @Override  // eqwu
    public final void i(int v) {
        TargetQuickStartApiService.a.d("Internal callbacks: onUserVerificationCompleted(%d)", new Object[]{v});
        eqzx eqzx0 = this.a.b;
        if(eqzx0 != null) {
            eqzx0.k(v);
        }
    }

    @Override  // eqwu
    public final void j(Bundle bundle0) {
        TargetQuickStartApiService.a.d("Internal callbacks: onWifiAvailable()", new Object[0]);
        eqzx eqzx0 = this.a.b;
        if(eqzx0 != null) {
            eqzx0.l(bundle0);
        }
    }

    @Override  // eqwu
    public final void k(BootstrapProgressResult bootstrapProgressResult0) {
        TargetQuickStartApiService.a.d("Internal callbacks: onBootstrapProgress(%d)", new Object[]{((int)bootstrapProgressResult0.a)});
    }
}

