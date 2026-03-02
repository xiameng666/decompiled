import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Locale;

public final class cqrt extends cqsd {
    public Inet6Address a;
    public Inet4Address b;

    public cqrt(String[] arr_s, int v, cqrw cqrw0) {
        super(arr_s, v, cqrw0);
    }

    @Override  // cqsd
    protected final void a(cqrw cqrw0) {
        int v = this.d == 28 ? 16 : 4;
        byte[] arr_b = new byte[v];
        cqrw0.d(v);
        System.arraycopy(cqrw0.a, cqrw0.c, arr_b, 0, v);
        cqrw0.c += v;
        try {
            InetAddress inetAddress0 = InetAddress.getByAddress(arr_b);
            if((inetAddress0 instanceof Inet4Address)) {
                this.b = (Inet4Address)inetAddress0;
                this.a = null;
                return;
            }
            if((inetAddress0 instanceof Inet6Address)) {
                this.b = null;
                this.a = (Inet6Address)inetAddress0;
                return;
            }
            this.b = null;
            this.a = null;
        }
        catch(UnknownHostException unused_ex) {
        }
    }

    @Override  // cqsd
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof cqrt) ? super.equals(object0) && bata.b(this.b, ((cqrt)object0).b) && bata.b(this.a, ((cqrt)object0).a) : false;
    }

    @Override  // cqsd
    public final int hashCode() {
        int v = Arrays.hashCode(new Object[]{this.b});
        int v1 = Arrays.hashCode(new Object[]{this.a});
        return super.hashCode() * 0x1F + v + v1;
    }

    @Override
    public final String toString() {
        return this.d == 1 ? String.format(Locale.ROOT, "%s: Inet4Address: %s Inet6Address: %s", "A", this.b, this.a) : String.format(Locale.ROOT, "%s: Inet4Address: %s Inet6Address: %s", "AAAA", this.b, this.a);
    }
}

