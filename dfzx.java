import android.os.Handler;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.IOException;

final class dfzx {
    public ParcelFileDescriptor a;
    public ParcelFileDescriptor b;
    public ParcelFileDescriptor c;
    public Handler d;

    public dfzx() {
        new dfzw(this).start();
    }

    public final void a() {
        Handler handler0 = this.d;
        if(handler0 != null) {
            Message message0 = handler0.obtainMessage();
            message0.what = 3;
            this.d.sendMessage(message0);
        }
        dfzx.b(this.a);
        dfzx.b(this.c);
        dfzx.b(this.b);
    }

    public static void b(Closeable closeable0) {
        if(closeable0 != null) {
            try {
                closeable0.close();
            }
            catch(IOException iOException0) {
                dcvz.a.e().f(iOException0).p("tryToClose failed", new Object[0]);
            }
        }
    }
}

