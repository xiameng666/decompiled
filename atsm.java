import com.google.android.gms.cast.internal.ApplicationStatus;

public final class atsm implements Runnable {
    public final atss a;
    public final ApplicationStatus b;

    public atsm(atss atss0, ApplicationStatus applicationStatus0) {
        this.a = atss0;
        this.b = applicationStatus0;
    }

    @Override
    public final void run() {
        boolean z;
        atst atst0 = this.a.a;
        String s = this.b.a;
        if(aurf.u(s, atst0.j)) {
            z = false;
        }
        else {
            atst0.j = s;
            z = true;
        }
        atst.a.c("hasChanged=%b, mFirstApplicationStatusUpdate=%b", new Object[]{Boolean.valueOf(z), Boolean.valueOf(atst0.d)});
        atst0.d = false;
    }
}

