import j..util.Objects;

final class fxcg extends fxcn {
    public fxcg(fxcq fxcq0, fwzh fwzh0, fwze fwze0, fvtz fvtz0, Runnable runnable0) {
        Objects.requireNonNull(fxcq0);
        super(fxcq0, fwzh0, fwze0, fvtz0, true, runnable0);
    }

    @Override  // fxcn
    public final fwzi b(fvtz fvtz0, boolean z) {
        fwzi fwzi0 = super.b(fvtz0, z);
        fwzi0.d = true;
        return fwzi0;
    }
}

