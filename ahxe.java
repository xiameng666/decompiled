import android.content.Intent;
import com.google.android.gms.common.api.Status;

public final class ahxe {
    public static Intent a(String s, Status status0) {
        return new Intent("com.google.android.gms.auth.api.phone.SMS_CODE_RETRIEVED").setPackage(s).putExtra("com.google.android.gms.auth.api.phone.EXTRA_STATUS", status0);
    }

    public static Intent b(String s, int v) {
        gftb.check(s);
        return ahxe.a(s, new Status(v));
    }

    public static Intent c(String s, String s1) {
        gftb.check(s);
        gftb.check(s1);
        return ahxe.a(s, Status.b).putExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_CODE_LINE", s1);
    }

    public static Intent d(String s) {
        gftb.check(s);
        return ahxe.a(s, Status.e);
    }
}

