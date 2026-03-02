public final class fktz {
    public final Object a;
    public final boolean b;
    public final boolean c;

    public fktz(Object object0, boolean z, boolean z1) {
        gftb.b(!z || !z1, "Skipped sync can have only a result!");
        this.a = object0;
        this.b = z;
        this.c = z1;
    }

    public static fkty a() {
        return fktz.b(null);
    }

    public static fkty b(Object object0) {
        fkty fkty0 = new fkty();
        fkty0.a = object0;
        fkty0.b = false;
        fkty0.c = false;
        return fkty0;
    }

    public final fkty c(Object object0) {
        fkty fkty0 = new fkty();
        fkty0.a = object0;
        fkty0.b = this.b;
        fkty0.c = this.c;
        return fkty0;
    }

    public static fktz d() {
        return fktz.e(null);
    }

    public static fktz e(Object object0) {
        fkty fkty0 = new fkty();
        fkty0.a = object0;
        fkty0.b = true;
        fkty0.c = false;
        return fkty0.a();
    }
}

