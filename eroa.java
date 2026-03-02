import com.google.android.gms.smartdevice.setup.ui.views.MagicArchChallengeView;

public final class eroa implements Runnable {
    public final MagicArchChallengeView a;

    public eroa(MagicArchChallengeView magicArchChallengeView0) {
        this.a = magicArchChallengeView0;
    }

    @Override
    public final void run() {
        this.a.j.countDown();
    }
}

