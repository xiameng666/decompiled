import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import jeb.synthetic.TWR;

public final class fmim implements Callable {
    public final fmiv a;
    public final fmjo b;
    public final fmga c;
    public final ConversationId d;
    public final AccountContext e;

    public fmim(fmiv fmiv0, fmjo fmjo0, fmga fmga0, ConversationId conversationId0, AccountContext accountContext0) {
        this.a = fmiv0;
        this.b = fmjo0;
        this.c = fmga0;
        this.d = conversationId0;
        this.e = accountContext0;
    }

    @Override
    public final Object call() {
        File file0;
        byte[] arr_b;
        fmiv fmiv0 = this.a;
        fmiv0.k();
        fmjo fmjo0 = this.b;
        String s = fmjo0.b;
        String s1 = Uri.parse(s).getPath();
        ConversationId conversationId0 = this.d;
        fmga fmga0 = this.c;
        if(s1.startsWith(new File(fmiv0.d + File.separator + "photos" + File.separator).getAbsolutePath())) {
            InputStream inputStream0 = fmiv0.e(Uri.parse(s));
            try {
                arr_b = ghjj.g(inputStream0);
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(inputStream0, throwable0);
                throw throwable0;
            }
            if(inputStream0 != null) {
                inputStream0.close();
            }
        }
        else {
            Uri uri0 = Uri.parse(fmjo0.b);
            int v = (int)iadl.a.f().i();
            int v1 = (int)iadl.a.f().h();
            long v2 = iadl.a.f().g();
            int v3 = (int)iadl.a.f().e();
            arr_b = fmif.a(fmiv0.b, uri0, v, v1, Math.min(v2, fmjo0.f), v3);
            file0 = new File(fmiv0.i(fmiv.m(fmga0.a), conversationId0));
            try(FileOutputStream fileOutputStream0 = new FileOutputStream(file0)) {
                fileOutputStream0.write(arr_b);
            }
            s = Uri.fromFile(file0.getAbsoluteFile()).toString();
        }
        if(arr_b != null) {
            return fmiv0.c(this.e, conversationId0, fmjo0, fmga0, arr_b, s);
        }
        throw new IOException("Failed to compress image");
    }
}

