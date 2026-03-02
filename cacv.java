import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class cacv extends clcy {
    private static final bboh a;

    static {
        cacv.a = bboh.b("IntrusionLoggeringResponse", bbcu.gS);
    }

    public cacv(ByteArrayOutputStream byteArrayOutputStream0) {
        ibuq.f(byteArrayOutputStream0, "responseBodyOutputStream");
        super(byteArrayOutputStream0);
    }

    @Override  // clck
    public final void b(clcn clcn0, clcq clcq0) {
    }

    @Override  // clck
    public final void c(gfsx gfsx0, clbw clbw0) {
        a.ae(cacv.a.j(), "Intrusion Logging request failed.", clbw0);
        throw clbw0;
    }

    @Override  // clck
    public final void in(clcn clcn0, clcq clcq0, String s) {
        ibuq.f(clcn0, "request");
        ibuq.f(s, "newLocationUrl");
        throw new IOException("Redirect not supported");
    }
}

