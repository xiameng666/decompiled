import android.net.Uri.Builder;
import j..util.Objects;
import java.io.FileOutputStream;
import java.io.InputStream;
import jeb.synthetic.TWR;

public final class aqpd extends aqpp {
    final hisr a;
    final FileOutputStream b;

    public aqpd(aqpe aqpe0, aqwm aqwm0, hisr hisr0, FileOutputStream fileOutputStream0) {
        this.a = hisr0;
        this.b = fileOutputStream0;
        Objects.requireNonNull(aqpe0);
        super(aqwm0);
    }

    @Override  // aqpp
    protected final Object a(InputStream inputStream0) {
        FileOutputStream fileOutputStream0;
        try {
            fileOutputStream0 = this.b;
            ghjj.b(inputStream0, fileOutputStream0);
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(fileOutputStream0, throwable0);
            throw throwable0;
        }
        fileOutputStream0.close();
        return null;
    }

    @Override  // aqpp
    protected final String b() {
        Uri.Builder uri$Builder0 = new Uri.Builder().scheme("https").encodedAuthority(hqje.n()).appendPath("download").appendPath("v1").appendEncodedPath(this.a.d).appendQueryParameter("alt", "media").appendQueryParameter("transaction_id", this.a.e);
        aqpe.a(uri$Builder0, (this.a.c == null ? hise.a : this.a.c));
        return uri$Builder0.build().toString();
    }
}

