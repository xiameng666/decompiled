import java.io.File;

public final class azfb implements gfsi {
    public final azfv a;

    public azfb(azfv azfv0) {
        this.a = azfv0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        return new File(this.a.g, Integer.toString(((hlqe)object0).f));
    }
}

