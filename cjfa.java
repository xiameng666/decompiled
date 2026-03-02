import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

public final class cjfa extends cjfw {
    public cjfa(Context context0, cjee cjee0, cjeu cjeu0) {
        super("provider_enabled", new cjfg(context0, cjee0, cjeu0));
    }

    public final void a(cjeq cjeq0, Executor executor0) {
        super.i(cjeq0, new cjey(this, cjeq0), executor0);
    }

    @Override  // cjfw
    public final void z(FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        printWriter0.print("enabled providers=");
        super.z(fileDescriptor0, printWriter0, arr_s);
    }
}

