import android.net.Uri;
import java.util.concurrent.Executor;

public final class fkyz {
    public final frbx a;
    private final Executor b;

    public fkyz(Executor executor0, frbx frbx0) {
        this.b = executor0;
        this.a = frbx0;
    }

    public final gmcd a(fkvt fkvt0, int v) {
        switch(v) {
            case 0: {
                return gmbu.n(new fkyy(this, Uri.parse(fkvt0.c)), this.b);
            }
            case 1: {
                return gmbu.n(new fkyy(this, Uri.parse(fkvt0.d)), this.b);
            }
            case 2: {
                return gmbu.n(new fkyy(this, Uri.parse(fkvt0.e)), this.b);
            }
            case 3: {
                return gmbu.n(new fkyy(this, Uri.parse(fkvt0.f)), this.b);
            }
            case 4: {
                return gmbu.n(new fkyy(this, Uri.parse(fkvt0.g)), this.b);
            }
            default: {
                return gmbu.n(new fkyy(this, Uri.parse(fkvt0.h)), this.b);
            }
        }
    }
}

