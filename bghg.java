import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;

final class bghg {
    public static final bebz a(acse acse0, PendingIntent pendingIntent0) {
        ibuq.f(acse0, "e");
        return new bebz(0xA9F4, "Auth error while doing LeakCheckService GRPC.", pendingIntent0, acse0);
    }

    public static final PendingIntent b(Context context0, UserRecoverableAuthException userRecoverableAuthException0) {
        ibuq.f(context0, "context");
        ibuq.f(userRecoverableAuthException0, "e");
        Intent intent0 = userRecoverableAuthException0.a();
        return intent0 == null ? null : cjok.a(context0, 0, intent0, 0x44000000);
    }

    public static final boolean c(int v, iapk iapk0) {
        if(v >= 3) {
            return false;
        }
        return iapk0.t == iaph.o ? true : iapk0.t == iaph.c;
    }
}

