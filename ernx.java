import com.google.android.gms.smartdevice.setup.ui.views.MagicArchChallengeView;
import java.util.concurrent.TimeUnit;

public final class ernx implements Runnable {
    public final MagicArchChallengeView a;

    public ernx(MagicArchChallengeView magicArchChallengeView0) {
        this.a = magicArchChallengeView0;
    }

    @Override
    public final void run() {
        try {
            this.a.j.await(hyhp.a.g().h(), TimeUnit.SECONDS);
        }
        catch(InterruptedException interruptedException0) {
            MagicArchChallengeView.a.l(interruptedException0);
        }
    }
}

