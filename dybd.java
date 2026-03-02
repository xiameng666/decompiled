import java.util.Collection;

public final class dybd implements gftc {
    public final Collection a;

    public dybd(Collection collection0) {
        this.a = collection0;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        return ((dydu)object0).b == 5 && this.a.contains(((dydn)((dydu)object0).c).c);
    }
}

