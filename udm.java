public final class udm {
    public final udx a;
    public final ufj b;
    public final udj c;
    public final uef d;
    public final udk e;
    public final udh f;
    public final ucn g;

    public udm(ufj ufj0, uff uff0, ufv ufv0, ufv ufv1, ufv ufv2, ufv ufv3) {
        this.b = ufj0;
        udk udk0 = new udk(uff0);
        this.e = udk0;
        this.g = new ucn();
        synchronized(this) {
        }
        this.a = new udx();
        this.c = new udj(ufv0, ufv1, ufv3, this, this);
        this.f = new udh(udk0);
        this.d = new uef();
        ((ufi)ufj0).a = this;
    }

    public final void a(udr udr0, uay uay0) {
        synchronized(this) {
            this.a.b(uay0, udr0);
        }
    }

    public final void b(udr udr0, uay uay0, udt udt0) {
        synchronized(this) {
            if(udt0 != null && udt0.a) {
                this.g.b(uay0, udt0);
            }
            this.a.b(uay0, udr0);
        }
    }
}

