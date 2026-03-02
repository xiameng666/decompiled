import java.io.InputStream;

public final class arpq implements arrf {
    public final asby a;

    public arpq(asby asby0) {
        this.a = asby0;
    }

    @Override  // arrf
    public final InputStream a() {
        throw new arrg("The client did not return any D2D item for: " + this.a.e);
    }
}

