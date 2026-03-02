import android.util.Log;
import j..util.Objects;
import java.io.IOException;
import java.security.GeneralSecurityException;

final class fedz implements gmbg {
    final clch a;

    public fedz(feea feea0, clch clch0) {
        this.a = clch0;
        Objects.requireNonNull(feea0);
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        IOException iOException0;
        if((throwable0 instanceof IOException)) {
            iOException0 = (IOException)throwable0;
        }
        else {
            iOException0 = (throwable0 instanceof GeneralSecurityException) ? new IOException("Very unexpected crypto setup failure", throwable0) : new IOException("Got an unexpected exception from copyFuture!?", throwable0);
        }
        Log.w("CloudNode", "An error occurred while encrypting the asset: " + iOException0);
        this.a.a.a(iOException0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Long long0 = (Long)object0;
        this.a.a(true);
    }
}

