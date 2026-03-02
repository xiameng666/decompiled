import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

public final class cjee extends cjfw {
    public cjee(Context context0) {
        super("location_mode", new cjfm(new cjeg(context0)));
    }

    public final int a() {
        return (int)(((Integer)this.h()));
    }

    public final void b(cjeo cjeo0, Executor executor0) {
        super.i(cjeo0, new cjed(this, cjeo0), executor0);
    }

    @Override  // cjfw
    public final void z(FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        printWriter0.print("location mode=");
        super.z(fileDescriptor0, printWriter0, arr_s);
    }
}

