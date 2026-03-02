import android.os.Handler;

final class fvnk {
    public final Handler a;
    public final fwzp b;
    public fvlv c;
    public fvnn d;
    public fvls e;
    public final fybc f;
    public String g;
    public fvkx h;
    public fvlh i;

    public fvnk(fwzp fwzp0, Handler handler0, fybc fybc0) {
        this.a = handler0;
        if(fybc0 == null) {
            fybc0 = fvpm.a;
        }
        this.f = fybc0;
        this.b = fwzp0;
    }

    final void a() {
        fvlv fvlv0 = this.c;
        if(fvlv0 != null) {
            fvls fvls0 = this.e;
            if(fvls0 != null) {
                fvls0.post(new fvlp(fvlv0));
            }
        }
    }
}

