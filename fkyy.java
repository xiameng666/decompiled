import android.net.Uri;
import java.io.InputStream;

public final class fkyy implements glzm {
    public final fkyz a;
    public final Uri b;

    public fkyy(fkyz fkyz0, Uri uri0) {
        this.a = fkyz0;
        this.b = uri0;
    }

    @Override  // glzm
    public final gmcd a() {
        frfr frfr0 = new frfr();
        return gmbu.i(((InputStream)this.a.a.d(this.b, frfr0)));
    }
}

