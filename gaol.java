public abstract class gaol implements gana {
    private ggfp a;

    @Override  // gana
    public final boolean b(gano gano0) {
        if(this.a == null) {
            this.a = this.c();
        }
        return this.a.contains(gano0.g());
    }

    protected abstract ggfp c();
}

