import j..util.Objects;

final class artf implements Runnable {
    final artg a;
    private final artd b;
    private float c;
    private int d;

    public artf(artg artg0, artd artd0) {
        Objects.requireNonNull(artg0);
        this.a = artg0;
        super();
        this.c = -1.0f;
        this.d = -1;
        this.b = artd0;
    }

    @Override
    public final void run() {
        artg artg0 = this.a;
        if(this.d == artg0.i && artg0.h <= this.c) {
            artg.a.d("No progress made, disconnecting from the client: %s", new Object[]{this});
            artg0.b(gfsx.m(this.b));
            return;
        }
        artg.a.d("Progress values changed, not cancelling: %s", new Object[]{this});
        this.d = artg0.i;
        this.c = artg0.h;
    }

    @Override
    public final String toString() {
        return "currentProgress= " + this.a.h + "previousProgress= " + this.c + "currentTotalItems= " + this.a.i + "previousTotalItems= " + this.d;
    }
}

