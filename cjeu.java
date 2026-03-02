import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

public final class cjeu extends cjfw {
    public cjeu(Context context0) {
        super("nlp_consent", new cjfm(new cjev(context0)));
    }

    public final void a(cjep cjep0, Executor executor0) {
        super.i(cjep0, new cjet(this, cjep0), executor0);
    }

    public final boolean b() {
        return ((Boolean)this.h()).booleanValue();
    }

    @Override  // cjfw
    public final void z(FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        printWriter0.print("nlp consent=");
        super.z(fileDescriptor0, printWriter0, arr_s);
    }
}

