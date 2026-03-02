import android.app.PendingIntent.CanceledException;
import android.app.PendingIntent;
import android.widget.Toast;

public final class asqf implements asqh {
    private final PendingIntent a;

    public asqf(PendingIntent pendingIntent0) {
        this.a = pendingIntent0;
    }

    public final void a(xob xob0) {
        ibuq.f(xob0, "activity");
        try {
            fpxq.a(this.a);
        }
        catch(PendingIntent.CanceledException pendingIntent$CanceledException0) {
            if(hqky.a.b().o()) {
                Toast.makeText(xob0, 0x7F1508E3, 0).show();  // string:common_something_went_wrong "Something went wrong"
                a.ae(asqd.a.i(), "Failed to send PendingIntent", pendingIntent$CanceledException0);
                return;
            }
            Toast.makeText(xob0, 0x7F15048A, 0).show();  // string:backup_launch_photos_settings_error "There was an error opening photos settings"
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof asqf) ? ibuq.m(this.a, ((asqf)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "OpenPendingIntent(pendingIntent=" + this.a + ")";
    }
}

