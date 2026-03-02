import j..util.Objects;

final class gykx extends gxum {
    final gykz a;

    public gykx(gykz gykz0) {
        Objects.requireNonNull(gykz0);
        this.a = gykz0;
        super("SOPStop");
    }

    @Override
    public final void run() {
        gykz gykz0 = this.a;
        batl.s(gykz0.d);
        if(gykz0.d.g()) {
            try {
                batl.s(gykz0.a);
                gykw gykw0 = new gykw(this);
                gykz0.a.e(gykw0);
            }
            catch(Exception exception0) {
                ((ggtj)((ggtj)((ggtj)gyke.a.i()).s(exception0)).ar(0x4F69)).B("%s ERROR stopping operation!", this.m);
                this.a.f = true;
            }
            gykz gykz1 = this.a;
            if(gykz1.f) {
                gykz1.d.c();
            }
        }
    }
}

