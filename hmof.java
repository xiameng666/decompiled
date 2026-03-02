public final class hmof extends hmoe {
    public int j;
    public int k;
    public int l;

    @Override  // hmoe
    public final hmoe a() {
        hmoe hmoe0 = new hmof();
        hmoe0.e = this.e;
        hmoe0.d = this.d;
        hmoe0.c = this.c;
        hmoe0.d(((byte[])this.a.clone()));
        hmoe0.i = this.i;
        hmoe0.b = this.b;
        hmoe0.f = this.f;
        hmoe0.l = this.l;
        hmoe0.k = this.k;
        hmoe0.j = this.j;
        return hmoe0;
    }

    @Override  // hmoe
    public final void b(hmoe hmoe0) {
        super.b(hmoe0);
        hmof hmof0 = (hmof)hmoe0;
        this.l = hmof0.l;
        this.k = hmof0.k;
        this.j = hmof0.j;
    }
}

