import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.InAppTrainerOptions;

public final class ccgu extends cjtm {
    public static final fnaa a;
    public final azxs b;
    final byte[] c;

    static {
        ccgu.a = fmzv.a("ScheduleOperation");
    }

    public ccgu(byte[] arr_b, azxs azxs0, azug azug0) {
        super(0x8B, "Schedule", azug0);
        ccfl.a();
        this.c = arr_b;
        this.b = azxs0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        try(fmzu fmzu0 = fmzu.b(context0)) {
            cbyw cbyw0 = (cbyw)fmzu0.c(cbyw.class);
            cbzh cbzh0 = (cbzh)fmzu0.c(cbzh.class);
            InAppTrainerOptions inAppTrainerOptions0 = (InAppTrainerOptions)bauc.a(this.c, InAppTrainerOptions.CREATOR);
            long v = cbyw0.q();
            if(Long.compare(v, 0L) > 0 && ((long)inAppTrainerOptions0.c().length) > v) {
                Status status0 = new Status(10, "Context data size exceeds the limit");
                this.b.a(status0);
                return;
            }
            int v1 = inAppTrainerOptions0.b;
            if(!cbzd.a.contains(Integer.valueOf(v1))) {
                this.b.a(new Status(10, a.f(v1, "Job id ", " is not allowed.")));
                return;
            }
            cbzh0.c(201);
            ccgo ccgo0 = (ccgo)fmzu0.c(ccgo.class);
            fmzu0.d();
            gmbu.t(ccgo0.h(inAppTrainerOptions0), new ccgt(this, ccgo0, inAppTrainerOptions0, fmzu0), gmap.a);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.a(status0);
    }
}

