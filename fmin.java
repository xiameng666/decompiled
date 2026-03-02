import android.util.Base64;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;

public final class fmin implements Callable {
    public final fmiv a;
    public final String b;
    public final fmjo c;
    public final fmga d;
    public final ConversationId e;
    public final AccountContext f;

    public fmin(fmiv fmiv0, String s, fmjo fmjo0, fmga fmga0, ConversationId conversationId0, AccountContext accountContext0) {
        this.a = fmiv0;
        this.b = s;
        this.c = fmjo0;
        this.d = fmga0;
        this.e = conversationId0;
        this.f = accountContext0;
    }

    @Override
    public final Object call() {
        fmiv fmiv0 = this.a;
        fmiv0.k();
        byte[] arr_b = Base64.decode(this.b, 2);
        if(arr_b != null) {
            try(FileOutputStream fileOutputStream0 = new FileOutputStream(new File(fmiv0.i(fmiv.m(this.d.a), this.e)))) {
                fileOutputStream0.write(arr_b);
                return fmiv0.c(this.f, this.e, this.c, this.d, arr_b, this.c.b);
            }
        }
        throw new IOException("base64 String is invalid");
    }
}

