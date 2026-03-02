import android.content.Context;
import java.io.IOException;

final class ezxe {
    private static final baun a;
    private final Context b;

    static {
        ezxe.a = fabk.d("CheckinServiceClientHelper");
    }

    public ezxe(Context context0) {
        this.b = context0;
    }

    final String a() {
        try {
            return avqz.b(this.b);
        }
        catch(IOException | azqi | azqj exception0) {
            ezxe.a.n("Unable to get Checkin data version info.", exception0, new Object[0]);
            return "";
        }
    }
}

