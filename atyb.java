import java.util.Locale;

public final class atyb {
    public final long a;
    final boolean b;

    public atyb(long v) {
        this.a = v;
        this.b = false;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof atyb) && ((atyb)object0).a == this.a;
    }

    @Override
    public final int hashCode() {
        return (int)(this.a & 0xFFFFL | this.a >> 0x20);
    }

    @Override
    public final String toString() {
        return String.format(Locale.ROOT, "LocalNetworkId code:%d isDefaultGatewayLanAddr:%b", ((long)this.a), Boolean.valueOf(false));
    }
}

