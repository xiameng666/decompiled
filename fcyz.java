import com.google.android.gms.wearable.internal.MessageEventParcelable;

public final class fcyz implements Runnable {
    public final fczl a;
    public final MessageEventParcelable b;
    public final fdiv c;

    public fcyz(fczl fczl0, MessageEventParcelable messageEventParcelable0, fdiv fdiv0) {
        this.a = fczl0;
        this.b = messageEventParcelable0;
        this.c = fdiv0;
    }

    @Override
    public final void run() {
        evql evql0 = this.a.a.k(this.b.d, this.b.b, this.b.c);
        fdiv fdiv0 = this.c;
        if(evql0 == null) {
            fczl.q(fdiv0);
            return;
        }
        evql0.z(new fcza(fdiv0));
    }
}

