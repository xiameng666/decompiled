public final class ggzp {
    public int a;
    public int b;

    public ggzp() {
        this.a = 0;
        this.b = 0;
    }

    public ggzp(int v, int v1) {
        boolean z = false;
        this.a = 0;
        this.b = 0;
        gftb.checkTrue(v >= 0);
        if(v1 >= 0) {
            z = true;
        }
        gftb.checkTrue(z);
        this.a = v;
        this.b = v1;
    }
}

