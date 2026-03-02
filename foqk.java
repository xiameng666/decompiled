abstract class foqk {
    public int a;

    public foqk() {
        this.a = 1;
    }

    public abstract void g(fokg arg1);

    public abstract void j(fokg arg1);

    public final void k(fokg fokg0) {
        if(this.a == 3) {
            return;
        }
        this.a = 3;
        this.g(fokg0);
    }

    public final void l(fokg fokg0) {
        if(this.a == 2) {
            return;
        }
        this.a = 2;
        this.j(fokg0);
    }
}

