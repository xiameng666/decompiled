import com.google.android.gms.backup.d2d.component.D2dSourceChimeraActivity;

public final class arcx implements Runnable {
    public final D2dSourceChimeraActivity a;

    public arcx(D2dSourceChimeraActivity d2dSourceChimeraActivity0) {
        this.a = d2dSourceChimeraActivity0;
    }

    @Override
    public final void run() {
        this.a.getWindow().clearFlags(0x80);
        this.a.o(arch.g);
    }
}

