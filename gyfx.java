import j..util.Objects;

final class gyfx extends gxum {
    final gyga a;

    public gyfx(gyga gyga0) {
        Objects.requireNonNull(gyga0);
        this.a = gyga0;
        super("FastPairScanner_scanModeDowngrade");
    }

    @Override
    public final void run() {
        gyga gyga0 = this.a;
        gxuf gxuf0 = gyga0.b;
        if(gxuf0 != null) {
            gxuf0.h(gyga0.k);
        }
        gyga0.c(gyga0.g, ((int)(gyga0.h ? hvpg.R() : hvpg.T())));
    }
}

