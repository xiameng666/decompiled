import android.os.Looper;
import android.os.Message;
import j..util.Objects;

final class dfzv extends clht {
    final dfzw a;

    public dfzv(dfzw dfzw0, Looper looper0) {
        Objects.requireNonNull(dfzw0);
        this.a = dfzw0;
        super(looper0);
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        switch(message0.what) {
            case 0: {
                dcvz.a.a().p("StreamAttachment message handler attempting to close local write pfd", new Object[0]);
                dfzx.b(this.a.a.a);
                return;
            }
            case 1: {
                dcvz.a.a().p("StreamAttachment message handler attempting to close remote read pfd", new Object[0]);
                dfzx.b(this.a.a.b);
                return;
            }
            case 2: {
                dcvz.a.a().p("StreamAttachment message handler attempting to close local read pfd", new Object[0]);
                dfzx.b(this.a.a.c);
                return;
            }
            case 3: {
                dcvz.a.a().p("StreamAttachment message handler got shutdown signal.", new Object[0]);
                this.a.quitSafely();
                return;
            }
            default: {
                dcvz.a.e().p("Unknown ID passed to handleMessage... dying.", new Object[0]);
                this.a.quit();
            }
        }
    }
}

