import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

public final class cjeb extends cjfw {
    public cjeb(Context context0) {
        super("device_idle", new cjfm(new cjec(context0)));
    }

    public final void a(cntb cntb0, Executor executor0) {
        super.i(cntb0, new cjea(this, cntb0), executor0);
    }

    @Override  // cjfw
    public final void z(FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        printWriter0.print("device idle=");
        super.z(fileDescriptor0, printWriter0, arr_s);
    }
}

