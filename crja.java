import j..util.Objects;
import java.io.ByteArrayOutputStream;

final class crja extends clcy {
    public final String a;
    public final crjk b;
    final crjb d;
    private final String e;

    public crja(crjb crjb0, String s, String s1, crjk crjk0, ByteArrayOutputStream byteArrayOutputStream0) {
        Objects.requireNonNull(crjb0);
        this.d = crjb0;
        super(byteArrayOutputStream0);
        this.a = s;
        this.e = s1;
        this.b = crjk0;
    }

    @Override  // clck
    public final void b(clcn clcn0, clcq clcq0) {
        this.d.aJ().k.c("Gms url request successful. app", this.a, this.e);
        this.d.aK().f(new criz(this, clcq0));
    }

    @Override  // clck
    public final void c(gfsx gfsx0, clbw clbw0) {
        while(clbw0.getCause() != null) {
            clbw0 = clbw0.getCause();
        }
        this.d.aJ().h.d("Gms url request failed, app", this.a, this.e, clbw0);
        this.d.aK().f(new criy(this, clbw0));
    }

    @Override  // clck
    public final void in(clcn clcn0, clcq clcq0, String s) {
        throw new clbw("Unexpected redirect");
    }
}

