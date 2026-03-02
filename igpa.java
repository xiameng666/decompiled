import java.math.BigInteger;

public final class igpa extends igne implements igpb {
    private final ignf a;
    private ignj b;

    public igpa(int v, int v1, int v2, int v3) {
        this.a = igpa.i;
        ignc ignc0 = new ignc();
        ignc0.a(new ignd(((long)v)));
        if(v2 == 0) {
            if(v3 != 0) {
                throw new IllegalArgumentException("inconsistent k values");
            }
            ignc0.a(igpa.j);
            ignc0.a(new ignd(((long)v1)));
            this.b = new ignk(ignc0);
            return;
        }
        if(v2 <= v1 || v3 <= v2) {
            throw new IllegalArgumentException("inconsistent k values");
        }
        ignc0.a(igpa.k);
        ignc ignc1 = new ignc();
        ignc1.a(new ignd(((long)v1)));
        ignc1.a(new ignd(((long)v2)));
        ignc1.a(new ignd(((long)v3)));
        ignc0.a(new ignk(ignc1));
        this.b = new ignk(ignc0);
    }

    public igpa(BigInteger bigInteger0) {
        this.a = igpa.h;
        this.b = new ignd(bigInteger0);
    }

    @Override  // igne
    public final ignj a() {
        ignc ignc0 = new ignc();
        ignc0.a(this.a);
        ignc0.a(this.b);
        return new ignk(ignc0);
    }
}

