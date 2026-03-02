public final class hmoh extends hmoe {
    public hmok j;
    public hmok k;
    public hmok l;
    public hmok m;
    public int n;

    public hmoh() {
        this.f = 2;
    }

    @Override  // hmoe
    public final hmoe a() {
        hmoe hmoe0 = new hmoh();
        hmoe0.e = this.e;
        hmoe0.d = this.d;
        hmoe0.c = this.c;
        hmoe0.d(((byte[])this.a.clone()));
        hmoe0.i = this.i;
        hmoe0.b = this.b;
        hmoe0.f = this.f;
        hmok hmok0 = this.m;
        if(hmok0 != null) {
            hmoe0.m = new hmok(hmok0);
        }
        hmoe0.k = new hmok(this.k);
        hmoe0.j = new hmok(this.j);
        hmoe0.l = new hmok(this.l);
        hmoe0.n = this.n;
        return hmoe0;
    }

    @Override  // hmoe
    public final void b(hmoe hmoe0) {
        super.b(hmoe0);
        hmok hmok0 = ((hmoh)hmoe0).m;
        if(hmok0 != null) {
            this.m = new hmok(hmok0);
        }
        this.k = new hmok(((hmoh)hmoe0).k);
        this.j = new hmok(((hmoh)hmoe0).j);
        this.l = new hmok(((hmoh)hmoe0).l);
        this.n = ((hmoh)hmoe0).n;
    }
}

