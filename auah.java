import android.net.Network;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Arrays;
import java.util.Locale;

public final class auah {
    public final InetAddress a;
    public final int b;
    public final Integer c;
    public final Network d;

    public auah() {
        throw null;
    }

    public auah(InetAddress inetAddress0, int v, Integer integer0, Network network0) {
        this.a = inetAddress0;
        this.b = v;
        this.c = integer0;
        this.d = network0;
    }

    public static auag a(InetAddress inetAddress0, int v, Network network0) {
        auag auag0 = new auag();
        if(inetAddress0 == null) {
            throw new NullPointerException("Null inetAddress");
        }
        auag0.a = inetAddress0;
        auag0.b = v;
        auag0.e = 1;
        auag0.c = null;
        auag0.d = network0;
        return auag0;
    }

    public final InetSocketAddress b() {
        return new InetSocketAddress(this.a, this.b);
    }

    public final boolean c(auah auah0) {
        return bata.b(this.b(), auah0.b());
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof auah) ? bata.b(this.a, ((auah)object0).a) && this.b == ((auah)object0).b && bata.b(this.c, ((auah)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((int)this.b), this.c});
    }

    @Override
    public final String toString() {
        return this.c == null ? String.format(Locale.ROOT, "socket address: %s, port: %d, network: %s", this.a, ((int)this.b), this.d) : String.format(Locale.ROOT, "socket address: %s, port: %d/%d, network: %s", this.a, ((int)this.b), this.c, this.d);
    }
}

