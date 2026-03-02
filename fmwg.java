import com.google.android.libraries.messaging.lighter.ui.messagecell.TimestampHeaderView;
import j..util.Objects;

public final class fmwg implements Runnable {
    final TimestampHeaderView a;

    public fmwg(TimestampHeaderView timestampHeaderView0) {
        Objects.requireNonNull(timestampHeaderView0);
        this.a = timestampHeaderView0;
        super();
    }

    @Override
    public final void run() {
        this.a.b.setText(fmwf.a(this.a.c, this.a.getContext()));
        this.a.postDelayed(this, TimestampHeaderView.a);
    }
}

