import android.content.Context;
import com.google.android.gms.notifications.registration.service.NotificationsRegistrationTaskBoundService;

public final class djwn {
    public static final void a(Context context0, String s) {
        clkn clkn0 = new clkn();
        clkn0.w(NotificationsRegistrationTaskBoundService.class.getName());
        clkn0.t(s);
        clkn0.p = true;
        clkn0.e(hvsy.a.d().b(), hvsy.a.d().a());
        clkn0.v(2);
        clkn0.y(0, 1);
        clkn0.f(0, 1);
        clkn0.x(0, 1);
        clkn0.t = NotificationsRegistrationTaskBoundService.b;
        clko clko0 = clkn0.a();
        cljp.a(context0).f(clko0);
    }
}

