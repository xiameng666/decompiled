import android.content.Context;
import com.google.android.gms.castauth.service.CastDeviceRegistrationTaskBoundService;
import com.google.android.gms.castauth.service.IdentityRegistrationTaskBoundService;
import com.google.android.gms.castauth.service.PostIdDidTaskBoundService;
import com.google.android.gms.chimera.modules.castauth.AppContextProvider;

public final class avoq {
    public static final void a() {
        ((ggtj)CastDeviceRegistrationTaskBoundService.a.h()).B("Start cancelling tasks scheduled in %s", "CastDeviceRegistrationTaskBoundService");
        cljp.a(AppContextProvider.a()).c(CastDeviceRegistrationTaskBoundService.class.getName());
        ((ggtj)IdentityRegistrationTaskBoundService.a.h()).B("Start cancelling tasks scheduled in %s", "IdentityRegistrationTaskBoundService");
        cljp.a(AppContextProvider.a()).c(new ibuk(PostIdDidTaskBoundService.class).b());
        ((ggtj)PostIdDidTaskBoundService.a.h()).B("Start cancelling tasks scheduled in %s", "PostIdDidTaskBoundService");
        cljp.a(AppContextProvider.a()).c(new ibuk(PostIdDidTaskBoundService.class).b());
        ((ggtj)PostIdDidTaskBoundService.a.h()).B("All tasks have been cancelled for %s", "PostIdDidTaskBoundService");
        ((ggtj)IdentityRegistrationTaskBoundService.a.h()).B("All tasks have been cancelled for %s", "IdentityRegistrationTaskBoundService");
        ((ggtj)CastDeviceRegistrationTaskBoundService.a.h()).B("All tasks have been cancelled for %s", "CastDeviceRegistrationTaskBoundService");
    }

    public static final void b(Context context0, String s, Long long0) {
        ibuq.f(context0, "context");
        ibuq.f(s, "deviceId");
        ((ggtj)CastDeviceRegistrationTaskBoundService.a.h()).B("Start scheduling %s", "CastDeviceRegistrationTaskBoundService");
        clkn clkn0 = new clkn();
        clkn0.e(0L, 1L);
        clkn0.w(CastDeviceRegistrationTaskBoundService.class.getName());
        clkn0.t("CastDeviceRegistrationTaskBoundService");
        clkn0.y(0, 0);
        clkn0.t = (cllc)CastDeviceRegistrationTaskBoundService.b.a();
        clkn0.v(2);
        clkn0.u = jyu.a(new ibns[]{new ibns("deviceId", s), new ibns("anlyticsSessionId", long0)});
        cljp.a(context0).f(clkn0.a());
        ((ggtj)CastDeviceRegistrationTaskBoundService.a.h()).B("Scheduled %s", "CastDeviceRegistrationTaskBoundService");
    }
}

