import com.google.android.gms.backup.d2d.component.D2dSourceChimeraActivity;

public final class arco implements Runnable {
    public final D2dSourceChimeraActivity a;

    public arco(D2dSourceChimeraActivity d2dSourceChimeraActivity0) {
        this.a = d2dSourceChimeraActivity0;
    }

    @Override
    public final void run() {
        D2dSourceChimeraActivity d2dSourceChimeraActivity0 = this.a;
        if(d2dSourceChimeraActivity0.s()) {
            d2dSourceChimeraActivity0.o(arch.e);
            return;
        }
        d2dSourceChimeraActivity0.o(arch.b);
    }
}

