public final class begn implements evqc {
    public final lqi a;
    public final String b;

    public begn(lqi lqi0, String s) {
        this.a = lqi0;
        this.b = s;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        bedv bedv0 = new bedv(bedu.c, null, exception0);
        this.a.l(bedv0);
        ((ggtj)((ggtj)begp.a.j()).s(exception0)).B("%s passkey operation failed", this.b);
    }
}

