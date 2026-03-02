import android.net.Uri;
import java.util.concurrent.Callable;

public final class flmh implements Callable {
    public final flmu a;
    public final String b;
    public final String[] c;

    public flmh(flmu flmu0, String s, String[] arr_s) {
        this.a = flmu0;
        this.b = s;
        this.c = arr_s;
    }

    @Override
    public final Object call() {
        Uri uri0 = this.a.l("messages");
        int v = this.a.e.a(uri0, this.b, this.c);
        this.a.L();
        return v;
    }
}

