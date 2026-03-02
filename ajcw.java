import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeoutException;

public final class ajcw extends cjtm {
    private final ajcx a;
    private final azxs b;
    private final String c;

    public ajcw(ajcx ajcx0, azxs azxs0, String s) {
        super(0xDD, "AuthConfigSync");
        this.a = ajcx0;
        this.b = azxs0;
        this.c = s;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        try {
            this.a.a(this.c);
        }
        catch(ajcv ajcv0) {
            Throwable throwable0 = ajcv0.getCause();
            if(throwable0 == null) {
                throw new cjuh(8, "Unknown config sync error");
            }
            if((throwable0 instanceof TimeoutException)) {
                throw new cjuh(15, "The request to sync configs timed out", null, throwable0);
            }
            if(!(throwable0 instanceof InterruptedException)) {
                throw new cjuh(13, "An error occurred while trying to sync configs", null, throwable0);
            }
            Thread.currentThread().interrupt();
            throw new cjuh(14, "The request to sync configs was interrupted", null, throwable0);
        }
        this.b.a(Status.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.a(status0);
    }
}

