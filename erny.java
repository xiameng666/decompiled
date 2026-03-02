import com.google.android.gms.smartdevice.setup.ui.views.MagicArchChallengeView;

public final class erny implements Runnable {
    public final MagicArchChallengeView a;

    public erny(MagicArchChallengeView magicArchChallengeView0) {
        this.a = magicArchChallengeView0;
    }

    @Override
    public final void run() {
        this.a.h.b(this.a.m);
    }
}

