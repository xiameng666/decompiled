import java.math.BigInteger;

public abstract class igpm implements igpw {
    @Override  // igpw
    public final igpz a(igpz igpz0, BigInteger bigInteger0) {
        int v = bigInteger0.signum();
        if(v != 0 && !igpz0.v()) {
            igpz igpz1 = this.b(igpz0, bigInteger0.abs());
            if(v <= 0) {
                igpz1 = igpz1.g();
            }
            if(igpz1.x()) {
                return igpz1;
            }
            throw new IllegalArgumentException("Invalid point");
        }
        return igpz0.b.k();
    }

    protected abstract igpz b(igpz arg1, BigInteger arg2);
}

