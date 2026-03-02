import com.google.android.gms.common.api.Status;

public final class ftqh implements Runnable {
    public final ftqm a;

    public ftqh(ftqm ftqm0) {
        this.a = ftqm0;
    }

    @Override
    public final void run() {
        ftqm ftqm0 = this.a;
        if(!ftqm0.l) {
            return;
        }
        ftqm0.l = false;
        ftqm0.f.unbindService(ftqm0.m);
        ftqm0.n = null;
        ftqm0.m(Status.h);
    }
}

