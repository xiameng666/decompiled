import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.LogCounterRequest;
import j..util.Objects;

final class ffli extends ffee {
    final LogCounterRequest c;
    final fdiy d;
    final fflv e;

    public ffli(fflv fflv0, LogCounterRequest logCounterRequest0, fdiy fdiy0) {
        this.c = logCounterRequest0;
        this.d = fdiy0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("incrementHistgramCounter");
    }

    @Override  // ffee
    public final void a() {
        gilb gilb0;
        try {
            LogCounterRequest logCounterRequest0 = this.c;
            byte[] arr_b = logCounterRequest0.c;
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
            String s = logCounterRequest0.a;
            long v = logCounterRequest0.d;
            long v1 = logCounterRequest0.b;
            if(fdox0.d.b()) {
                ayvb ayvb0 = fdox0.c.f(s);
                ayuy ayuy0 = ayuy.a(((MessageLite)fdox.b(gilb0)));
                ayvb0.a(ayvb0.g.a(v), v1, ayuy0);
            }
            Status status0 = fdlg.a(0);
            this.d.a(status0);
        }
        catch(hfur unused_ex) {
            Status status1 = fdlg.a(13);
            this.d.a(status1);
        }
    }
}

