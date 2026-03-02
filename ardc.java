import com.google.android.gms.backup.d2d.component.D2dSourceChimeraService.1;

public final class ardc implements Runnable {
    public final D2dSourceChimeraService.1 a;
    public final boolean b;
    public final int c;

    public ardc(D2dSourceChimeraService.1 d2dSourceChimeraService$10, boolean z, int v) {
        this.a = d2dSourceChimeraService$10;
        this.b = z;
        this.c = v;
    }

    @Override
    public final void run() {
        if(!aqze.g()) {
            throw new RuntimeException();
        }
        int v = this.c;
        D2dSourceChimeraService.1 d2dSourceChimeraService$10 = this.a;
        if(this.b) {
            d2dSourceChimeraService$10.a.c.c(new arda(v));
            return;
        }
        d2dSourceChimeraService$10.a.c.g(new ardb(v));
    }
}

