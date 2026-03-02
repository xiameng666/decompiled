import com.google.android.gms.backup.d2d.component.D2dSourceChimeraActivity;

public final class arcp implements Runnable {
    public final D2dSourceChimeraActivity a;

    public arcp(D2dSourceChimeraActivity d2dSourceChimeraActivity0) {
        this.a = d2dSourceChimeraActivity0;
    }

    @Override
    public final void run() {
        D2dSourceChimeraActivity d2dSourceChimeraActivity0 = this.a;
        if(!((Boolean)d2dSourceChimeraActivity0.v.mr()).booleanValue()) {
            if(d2dSourceChimeraActivity0.r()) {
                d2dSourceChimeraActivity0.o(arch.b);
            }
        }
        else if(d2dSourceChimeraActivity0.u == hkyj.b) {
            d2dSourceChimeraActivity0.o(arch.b);
        }
    }
}

