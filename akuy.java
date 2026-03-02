import com.google.android.gms.auth.proximity.RemoteDevice;
import j..util.Objects;

final class akuy implements Runnable {
    final RemoteDevice a;
    final akvf b;

    public akuy(akvf akvf0, RemoteDevice remoteDevice0) {
        this.a = remoteDevice0;
        Objects.requireNonNull(akvf0);
        this.b = akvf0;
        super();
    }

    @Override
    public final void run() {
        akvf akvf0 = this.b;
        String s = this.a.b;
        if(akvf0.i.contains(s)) {
            return;
        }
        akvf0.d.add(s);
        akvf0.e();
    }
}

