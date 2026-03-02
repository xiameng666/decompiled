import android.media.MediaRouter2;

public final class audt implements Runnable {
    public final aufc a;

    public audt(aufc aufc0) {
        this.a = aufc0;
    }

    @Override
    public final void run() {
        MediaRouter2 mediaRouter20 = this.a.a;
        if(mediaRouter20 != null) {
            mediaRouter20.stopScan();
        }
    }
}

