import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer;
import j..util.Objects;

final class fxmk implements MediaPlayer.OnPreparedListener {
    final fxmn a;

    public fxmk(fxmn fxmn0) {
        Objects.requireNonNull(fxmn0);
        this.a = fxmn0;
        super();
    }

    @Override  // android.media.MediaPlayer$OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer0) {
        this.a.ak.start();
    }
}

