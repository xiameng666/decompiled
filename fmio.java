import android.net.Uri;

public final class fmio implements gful_cronetEngineProvider {
    public final fmiv a;
    public final fmjo b;

    public fmio(fmiv fmiv0, fmjo fmjo0) {
        this.a = fmiv0;
        this.b = fmjo0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        Uri uri0 = Uri.parse(this.b.b);
        int v = (int)iadl.e();
        int v1 = (int)iadl.d();
        long v2 = iadl.c();
        int v3 = (int)iadl.b();
        return fmif.a(this.a.b, uri0, v, v1, v2, v3);
    }
}

