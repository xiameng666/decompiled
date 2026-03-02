import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.gms.growth.uiflow.ui.widget.media.IllustrationVideoView;
import com.google.android.gms.growth.uiflow.ui.widget.media.MediaContainer;
import com.google.android.gms.growth.uiflow.ui.widget.media.ScaledImageView;
import com.google.android.gms.growth.uiflow.ui.widget.media.ScaledLottieAnimationView;
import j..util.Objects;

public final class bvyc extends bvxo {
    public static final int a;
    private final bvwu b;

    public bvyc(hgmq hgmq0, bvwy bvwy0, bvwu bvwu0, bvwa bvwa0, bvxp bvxp0, du du0, fhwo fhwo0, bwdm bwdm0) {
        super(hgmq0, bvwy0, fhwo0, bvwa0, bvxp0, du0, bwdm0);
        this.b = bvwu0;
    }

    @Override  // bvxo
    public final void a(View view0, LayoutInflater layoutInflater0) {
        hgmq hgmq0 = this.d;
        hgnh hgnh0 = hgmq0.e == 13 ? ((hgnh)hgmq0.f) : hgnh.a;
        if(!hgmq0.h.isEmpty()) {
            ((MediaContainer)view0).setContentDescription(hgmq0.h);
        }
        this.d(((MediaContainer)view0));
        int v = hgnf.a(hgnh0.b);
        int v1 = 1;
        if(v == 0) {
            v = 1;
        }
        switch(v - 2) {
            case 1: {
                ScaledImageView scaledImageView0 = (ScaledImageView)layoutInflater0.inflate(0x7F0E0C15, ((MediaContainer)view0)).findViewById(0x7F0B23D8);  // layout:up_image
                txx txx0 = txc.e(scaledImageView0).h(hgnh0.c);
                int v2 = hgng.a(hgnh0.f);
                if(v2 != 0) {
                    v1 = v2;
                }
                scaledImageView0.a = new bwbf(scaledImageView0, v1);
                txx0.k(scaledImageView0);
                return;
            }
            case 2: {
                View view1 = layoutInflater0.inflate(0x7F0E0C17, ((MediaContainer)view0));  // layout:up_video
                IllustrationVideoView illustrationVideoView0 = (IllustrationVideoView)view1.findViewById(0x7F0B23DA);  // id:up_media_video
                illustrationVideoView0.b = Uri.parse(hgnh0.c);
                illustrationVideoView0.a();
                if(hgnh0.d) {
                    illustrationVideoView0.f = new bvxx(illustrationVideoView0);
                }
                if(hgnh0.e) {
                    illustrationVideoView0.e = new bvxy(illustrationVideoView0);
                }
                if(hgnh0.g) {
                    illustrationVideoView0.setOnClickListener(new bvxz(view1, illustrationVideoView0));
                    return;
                }
                break;
            }
            case 3: {
                View view2 = layoutInflater0.inflate(0x7F0E0C16, ((MediaContainer)view0));  // layout:up_lottie
                ScaledLottieAnimationView scaledLottieAnimationView0 = (ScaledLottieAnimationView)view2.findViewById(0x7F0B23D9);  // id:up_media_lottie
                scaledLottieAnimationView0.f = new bwbf(scaledLottieAnimationView0, (hgng.a(hgnh0.f) == 0 ? 1 : hgng.a(hgnh0.f)));
                scaledLottieAnimationView0.f(true);
                String s = hgnh0.c;
                lqi lqi0 = new lqi();
                qli qli0 = qkm.l(this.b.a, s);
                Objects.requireNonNull(lqi0);
                qli0.d(new bvwt(lqi0));
                lqi0.g(this.h.getViewLifecycleOwner(), new bvya(scaledLottieAnimationView0, hgnh0));
                if(hgnh0.g) {
                    scaledLottieAnimationView0.setOnClickListener(new bvyb(view2, scaledLottieAnimationView0));
                    return;
                }
                break;
            }
        }
    }
}

