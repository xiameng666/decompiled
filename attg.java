import com.google.android.gms.cast.MediaQueueItem;

public final class attg {
    public static final void a(MediaQueueItem mediaQueueItem0) {
        if(mediaQueueItem0.a == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if(!Double.isNaN(mediaQueueItem0.d) && mediaQueueItem0.d < 0.0) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if(Double.isNaN(mediaQueueItem0.e)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if(!Double.isNaN(mediaQueueItem0.f) && mediaQueueItem0.f >= 0.0) {
            return;
        }
        throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
    }
}

