import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer;
import com.google.android.gms.growth.uiflow.ui.widget.media.IllustrationVideoView;

public final class bvxx implements MediaPlayer.OnPreparedListener {
    public final IllustrationVideoView a;

    public bvxx(IllustrationVideoView illustrationVideoView0) {
        this.a = illustrationVideoView0;
    }

    @Override  // android.media.MediaPlayer$OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer0) {
        this.a.c();
    }
}

