public final class asgl extends aqgj {
    final ichm a;
    private Float b;
    private Integer c;
    private Integer d;

    public asgl(ichm ichm0) {
        this.a = ichm0;
        super();
    }

    @Override  // aqgk
    public final void a(int v) {
        ((ggtj)asgr.a.h()).x("Back up now finished.");
        this.e(new asga(false));
        this.b = null;
        this.c = null;
        this.d = null;
    }

    @Override  // aqgk
    public final void b(float f) {
        this.b = f;
        this.d();
    }

    @Override  // aqgk
    public final void c(int v, int v1) {
        this.c = v;
        this.d = v1;
        this.d();
    }

    private final void d() {
        this.e(new asga(true, this.c, this.d, this.b));
    }

    private final void e(asga asga0) {
        aqqf aqqf0 = new aqqf(asga0);
        ichm ichm0 = this.a;
        if((ichd.a(ichm0, aqqf0) instanceof icgz)) {
            ichp.a(ichm0);
        }
    }
}

