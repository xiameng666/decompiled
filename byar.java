import android.os.CancellationSignal;

public final class byar {
    public final byaq a;
    public final byam b;
    public final byao c;
    public final CancellationSignal d;

    public byar() {
        this(null);
    }

    public byar(byaq byaq0, byam byam0, byao byao0, CancellationSignal cancellationSignal0) {
        ibuq.f(byao0, "biometricStatus");
        super();
        this.a = byaq0;
        this.b = byam0;
        this.c = byao0;
        this.d = cancellationSignal0;
    }

    public byar(byte[] arr_b) {
        CancellationSignal cancellationSignal0 = new CancellationSignal();
        this(null, null, byao.a, cancellationSignal0);
    }

    public static byar a(byar byar0, byaq byaq0, byam byam0, byao byao0, int v) {
        if((v & 1) != 0) {
            byaq0 = byar0.a;
        }
        if((v & 2) != 0) {
            byam0 = byar0.b;
        }
        if((v & 4) != 0) {
            byao0 = byar0.c;
        }
        ibuq.f(byao0, "biometricStatus");
        return new byar(byaq0, byam0, byao0, byar0.d);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof byar)) {
            return false;
        }
        if(!ibuq.m(this.a, ((byar)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((byar)object0).b)) {
            return false;
        }
        return this.c == ((byar)object0).c ? ibuq.m(this.d, ((byar)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        byam byam0 = this.b;
        if(byam0 != null) {
            v = byam0.hashCode();
        }
        return ((v1 * 0x1F + v) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "BiometricState(biometricResult=" + this.a + ", biometricError=" + this.b + ", biometricStatus=" + this.c + ", biometricCancellationSignal=" + this.d + ")";
    }
}

