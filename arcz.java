import com.google.android.gms.backup.d2d.component.D2dSourceChimeraService;

public final class arcz implements Runnable {
    public final D2dSourceChimeraService a;

    public arcz(D2dSourceChimeraService d2dSourceChimeraService0) {
        this.a = d2dSourceChimeraService0;
    }

    @Override
    public final void run() {
        D2dSourceChimeraService d2dSourceChimeraService0 = this.a;
        argf argf0 = d2dSourceChimeraService0.c;
        arls arls0 = argf0.p;
        if(arls0 != null) {
            arls0.d();
        }
        argf0.i();
        d2dSourceChimeraService0.c = null;
    }
}

