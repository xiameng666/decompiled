import android.os.Looper;
import com.google.android.gms.pay.ProtoSafeParcelable;

public final class dnok implements evqf {
    public final dnon a;

    public dnok(dnon dnon0) {
        this.a = dnon0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        dxeo dxeo0 = (dxeo)ftqe.c(((ProtoSafeParcelable)object0), ((MessageLite)dxeo.a));
        long v = Math.max(866L - (System.currentTimeMillis() - this.a.h), 0L);
        new clht(Looper.getMainLooper()).postDelayed(new dnom(this.a, dxeo0), v);
    }
}

