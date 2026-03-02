public abstract class igox {
    private igow a;

    protected abstract igow a();

    public final igow b() {
        synchronized(this) {
            if(this.a == null) {
                this.a = this.a();
            }
        }
        return this.a;
    }
}

