import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public final class cjfh extends cjfw {
    public cjfh(Context context0) {
        super("wifi_scanning", new cjfm(new cjfi(context0)));
    }

    @Override  // cjfw
    public final void z(FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        printWriter0.print("wifi scanning=");
        super.z(fileDescriptor0, printWriter0, arr_s);
    }
}

