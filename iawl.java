import j..util.Objects;

final class iawl implements Runnable {
    final iawo a;

    public iawl(iawo iawo0) {
        Objects.requireNonNull(iawo0);
        this.a = iawo0;
        super();
    }

    @Override
    public final void run() {
        gftb.r(((ibai)this.a.f).a.C.get(), "Channel must have been shut down");
    }
}

