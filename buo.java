import java.util.UUID;

public final class buo extends bkh {
    public int a;
    private final String b;

    public buo(bik bik0) {
        super(bik0);
        this.b = "virtual-" + bik0.j() + "-" + UUID.randomUUID().toString();
    }

    @Override  // bkh
    public final int b() {
        return this.c(0);
    }

    @Override  // bkh
    public final int c(int v) {
        return bok.b(super.c(v) - this.a);
    }

    @Override  // bkh
    public final String j() {
        return this.b;
    }
}

