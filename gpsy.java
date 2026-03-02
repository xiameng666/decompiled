import android.net.Network;
import j..util.Objects;

public final class gpsy {
    public final Network a;
    public final int b;

    public gpsy(Network network0, int v) {
        this.a = network0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof gpsy) ? Objects.equals(this.a, ((gpsy)object0).a) && this.b == ((gpsy)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, ((int)this.b)});
    }

    @Override
    public final String toString() {
        return "SocketKey{ network=" + this.a + " interfaceIndex=" + this.b + " }";
    }
}

