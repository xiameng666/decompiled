import java.io.InputStream;

public final class arpr implements arrf {
    public final asby a;
    public final Exception b;

    public arpr(asby asby0, Exception exception0) {
        this.a = asby0;
        this.b = exception0;
    }

    @Override  // arrf
    public final InputStream a() {
        throw new arrg("D2D item preparation failed for: " + this.a.e, this.b);
    }
}

