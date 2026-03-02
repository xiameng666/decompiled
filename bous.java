import java.io.IOException;

public abstract class bous extends frgu {
    private final MessageLite a;
    private final frlp b;

    public bous(MessageLite hfvm0) {
        this.a = hfvm0;
        this.b = new frlp(hfvm0);
    }

    protected abstract gmcd a();

    @Override  // frgu
    public final gmcd b(IOException iOException0, frgv frgv0) {
        return gdta.g(this.b.b(iOException0, frgv0)).i(new bour(this), gmap.a);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof bous) ? ((bous)object0).a.equals(this.a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}

