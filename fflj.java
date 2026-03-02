import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.LogTimerRequest;
import j..time.Duration;
import j..util.Objects;

final class fflj extends ffee {
    final LogTimerRequest c;
    final fdiy d;
    final fflv e;

    public fflj(fflv fflv0, LogTimerRequest logTimerRequest0, fdiy fdiy0) {
        this.c = logTimerRequest0;
        this.d = fdiy0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("stopTimer");
    }

    @Override  // ffee
    public final void a() {
        gilb gilb0;
        try {
            LogTimerRequest logTimerRequest0 = this.c;
            byte[] arr_b = logTimerRequest0.c;
            if(arr_b == null) {
                gilb0 = null;
            }
            else {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gilb.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                gilb0 = (gilb)hftv0;
            }
            fdox fdox0 = this.e.D;
            batl.s(fdox0);
            String s = logTimerRequest0.a;
            Duration duration0 = Duration.ofMillis(logTimerRequest0.b);
            if(fdox0.d.b()) {
                ayve ayve0 = fdox0.c.g(s);
                ayvd ayvd0 = new ayvd(ayve0, ayve0);
                long v = duration0.toMillis();
                ayuy ayuy0 = ayuy.a(((MessageLite)fdox.b(gilb0)));
                long v1 = ayvd0.a.g.a(v);
                ayvd0.a.a(v1, 1L, ayuy0);
            }
            Status status0 = new Status(0);
            this.d.a(status0);
        }
        catch(hfur unused_ex) {
            Status status1 = new Status(13);
            this.d.a(status1);
        }
    }
}

