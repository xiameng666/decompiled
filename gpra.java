import j..util.Objects;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Locale;

public final class gpra extends gprm {
    public Inet6Address a;
    public Inet4Address b;

    public gpra(String[] arr_s, int v, gprh gprh0, boolean z) {
        super(arr_s, v, gprh0, z);
    }

    public gpra(String[] arr_s, int v, boolean z) {
        super(arr_s, v, (z ? 0x8000 : 0) | 1, 0L, false, 0L);
    }

    @Override  // gprm
    protected final void a(gprh gprh0) {
        byte[] arr_b = new byte[(this.d == 28 ? 16 : 4)];
        gprh0.e(arr_b);
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

    @Override  // gprm
    protected final void b(gpri gpri0) {
        byte[] arr_b;
        Inet4Address inet4Address0 = this.b;
        if(inet4Address0 == null) {
            arr_b = this.a == null ? null : this.a.getAddress();
        }
        else {
            arr_b = inet4Address0.getAddress();
        }
        if(arr_b != null) {
            gpri0.b(arr_b);
        }
    }

    @Override  // gprm
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof gpra) ? super.equals(object0) && Objects.equals(this.b, ((gpra)object0).b) && Objects.equals(this.a, ((gpra)object0).a) : false;
    }

    @Override  // gprm
    public final int hashCode() {
        int v = Objects.hashCode(this.b);
        int v1 = Objects.hashCode(this.a);
        return super.hashCode() * 0x1F + v + v1;
    }

    @Override
    public final String toString() {
        return this.d == 1 ? String.format(Locale.ROOT, "%s: Inet4Address: %s Inet6Address: %s", "A", this.b, this.a) : String.format(Locale.ROOT, "%s: Inet4Address: %s Inet6Address: %s", "AAAA", this.b, this.a);
    }
}

