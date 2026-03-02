import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.audiomodem.TokenReceiver.Params;

public final class acpf implements azys {
    public final TokenReceiver.Params a;
    public final acqg b;

    public acpf(acqg acqg0, TokenReceiver.Params tokenReceiver$Params0) {
        this.b = acqg0;
        this.a = tokenReceiver$Params0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        acqb acqb0 = (acqb)object0;
        acqd acqd0 = (acqd)acqb0.H();
        IBinder iBinder0 = acqb0.i();
        acqc acqc0 = acqc.a(((evqp)object1));
        Parcel parcel0 = acqd0.jo();
        parcel0.writeStrongBinder(iBinder0);
        wbz.h(parcel0, this.b);
        wbz.f(parcel0, this.a);
        wbz.h(parcel0, acqc0);
        acqd0.jp(1, parcel0);
    }
}

