import android.app.NotificationChannel;
import android.content.Context;

public final class cjkk {
    public static final void a(Context context0) {
        ibuq.f(context0, "context");
        bayn bayn0 = bayn.f(context0);
        if(bayn0 != null) {
            bayn0.q(fsdv.a.a(context0));
            NotificationChannel notificationChannel0 = fsdw.l.a(context0);
            notificationChannel0.setGroup(fsdv.a.e);
            bayn0.p(notificationChannel0);
            dmkl dmkl0 = new dmkl(context0);
            if(hwwq.l() && dmkl0.i()) {
                ibot ibot0 = new ibot(((ibow)fsdw.q));
                while(ibot0.hasNext()) {
                    Object object0 = ibot0.next();
                    fsdw fsdw0 = (fsdw)object0;
                    if(!fsdw0.u) {
                        bayn0.s(fsdw0.r);
                    }
                }
            }
            if(hwfk.a.b().m()) {
                bayn0.t(fsdv.c.e);
                bayn0.t(fsdv.d.e);
            }
        }
    }
}

