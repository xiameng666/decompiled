public final class ddfo implements ibth {
    public final gep a;
    public final ibva b;
    public final ibva c;

    public ddfo(gep gep0, ibva ibva0, ibva ibva1) {
        this.a = gep0;
        this.b = ibva0;
        this.c = ibva1;
    }

    @Override  // ibth
    public final Object a() {
        gep gep0 = this.a;
        Float float0 = null;
        if(gep0 != null) {
            ges ges0 = gep0.b();
            if(ges0 != null) {
                float0 = (float)ges0.b;
            }
        }
        ibva ibva0 = this.c;
        ibva ibva1 = this.b;
        if(!ibuq.k(float0, ibva1.a - ibva0.a) && gep0 != null) {
            ges ges1 = gep0.b();
            if(ges1 != null) {
                ges1.b = ibva1.a - ibva0.a;
            }
        }
        return ibom.a;
    }
}

