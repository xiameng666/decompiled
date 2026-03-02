import com.google.android.libraries.messaging.lighter.ui.messagecell.MessageCellStatusView;
import j..util.Objects;

public final class fmwb implements Runnable {
    final MessageCellStatusView a;

    public fmwb(MessageCellStatusView messageCellStatusView0) {
        Objects.requireNonNull(messageCellStatusView0);
        this.a = messageCellStatusView0;
        super();
    }

    @Override
    public final void run() {
        this.a.c(null);
        this.a.postDelayed(this, MessageCellStatusView.a);
    }
}

