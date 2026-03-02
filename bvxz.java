import android.media.MediaPlayer;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.growth.uiflow.ui.widget.media.IllustrationVideoView;

public final class bvxz implements View.OnClickListener {
    public final View a;
    public final IllustrationVideoView b;

    public bvxz(View view0, IllustrationVideoView illustrationVideoView0) {
        this.a = view0;
        this.b = illustrationVideoView0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ImageView imageView0 = (ImageView)this.a.findViewById(0x7F0B23DB);  // id:up_play_pause
        IllustrationVideoView illustrationVideoView0 = this.b;
        if(illustrationVideoView0.d()) {
            if(illustrationVideoView0.d()) {
                MediaPlayer mediaPlayer0 = illustrationVideoView0.a;
                gftb.check(mediaPlayer0);
                mediaPlayer0.pause();
                illustrationVideoView0.c = 4;
            }
            illustrationVideoView0.d = 4;
            imageView0.setVisibility(0);
            return;
        }
        illustrationVideoView0.c();
        imageView0.setVisibility(4);
    }
}

