import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer;
import com.google.android.gms.growth.uiflow.ui.widget.media.IllustrationVideoView;

public final class bvxy implements MediaPlayer.OnCompletionListener {
    public final IllustrationVideoView a;

    public bvxy(IllustrationVideoView illustrationVideoView0) {
        this.a = illustrationVideoView0;
    }

    @Override  // android.media.MediaPlayer$OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer0) {
        this.a.c();
    }
}

