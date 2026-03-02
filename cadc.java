import java.io.File;

public final class cadc extends clbm {
    public final File a;
    private static final bboh b;

    static {
        cadc.b = bboh.b("ScottyDownloadResponse", bbcu.gS);
    }

    public cadc(File file0) {
        super(file0);
        this.a = file0;
    }

    @Override  // clck
    public final void in(clcn clcn0, clcq clcq0, String s) {
        ibuq.f(clcn0, "request");
        ibuq.f(s, "newLocationUrl");
        ((ggtj)cadc.b.h()).B("Redirect received: %s", s);
        clcn0.c();
    }
}

