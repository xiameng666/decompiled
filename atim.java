import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

final class atim implements atkr {
    public final MessageDigest a;
    private final atkr b;

    public atim(atkr atkr0) {
        this.b = atkr0;
        try {
            this.a = MessageDigest.getInstance("SHA-256");
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new AssertionError(noSuchAlgorithmException0);
        }
    }

    @Override  // atkr
    public final Object b() {
        Object object0 = (atjy)this.b.b();
        this.a.update(((atjv)object0.b).a);
        return object0;
    }

    @Override  // atkr
    public final boolean c() {
        return this.b.c();
    }

    @Override
    public final void close() {
        this.b.close();
    }
}

