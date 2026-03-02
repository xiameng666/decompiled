import java.math.BigInteger;

public abstract class igpv implements igpo {
    public int a() {
        return this.c().bitLength();
    }

    public abstract int b();

    public abstract BigInteger c();

    public abstract igpv d(igpv arg1);

    public abstract igpv e();

    public abstract igpv f(igpv arg1);

    public abstract igpv g();

    public abstract igpv h(igpv arg1);

    public igpv i(igpv igpv0, igpv igpv1, igpv igpv2) {
        throw null;
    }

    public igpv j(igpv igpv0, igpv igpv1, igpv igpv2) {
        throw null;
    }

    public abstract igpv k();

    public abstract igpv l();

    public abstract igpv m();

    public igpv n(igpv igpv0, igpv igpv1) {
        throw null;
    }

    public igpv o(int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            this = this.m();
        }
        return this;
    }

    public abstract igpv p(igpv arg1);

    public boolean r() {
        return this.a() == 1;
    }

    public boolean s() {
        return this.c().signum() == 0;
    }

    public boolean t() {
        return this.c().testBit(0);
    }

    @Override
    public final String toString() {
        return this.c().toString(16);
    }
}

