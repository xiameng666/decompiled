import java.util.Random;

public final class azdr implements azeg {
    private final azdw a;
    private final Random b;

    public azdr(Random random0, azdw azdw0) {
        this.a = azdw0;
        this.b = random0;
    }

    @Override  // azeg
    public final azef a() {
        hlqv hlqv0 = this.a.a;
        boolean z = this.b.nextDouble() < (hlqv0.b == 2 ? ((hlqs)hlqv0.c) : hlqs.a).b;
        return hlqv0.b == 2 ? new azef(z, ((hlqs)hlqv0.c).b, this.a.b) : new azef(z, hlqs.a.b, this.a.b);
    }
}

