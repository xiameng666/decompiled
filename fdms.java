import android.util.Log;
import com.google.android.gms.wearable.internal.MessageEventParcelable;

final class fdms implements azye {
    final MessageEventParcelable a;
    final fdiv b;

    public fdms(MessageEventParcelable messageEventParcelable0, fdiv fdiv0) {
        this.a = messageEventParcelable0;
        this.b = fdiv0;
        super();
    }

    @Override  // azye
    public final void a(Object object0) {
        evql evql0 = ((fcfd)object0).k(this.a.d, this.a.b, this.a.c);
        if(evql0 == null) {
            fdmt.q(this.b);
            return;
        }
        evql0.z(new fdmr(this.b));
    }

    @Override  // azye
    public final void b() {
        Log.e("WearableListenerStub", "Failed to notify listener, sending null response");
        fdmt.q(this.b);
    }
}

