import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.io.File;
import java.util.concurrent.Callable;

public final class fmiq implements Callable {
    public final fmiv a;
    public final AccountContext b;

    public fmiq(fmiv fmiv0, AccountContext accountContext0) {
        this.a = fmiv0;
        this.b = accountContext0;
    }

    @Override
    public final Object call() {
        gged_interceptors gged0 = this.b.c().g();
        int v = ((ggna)gged0).c;
        boolean z = true;
        for(int v1 = 0; v1 < v; ++v1) {
            fmiv fmiv0 = this.a;
            ContactId contactId0 = (ContactId)gged0.get(v1);
            String s = File.separator;
            String s1 = File.separator;
            String s2 = fmiv.f(contactId0);
            String s3 = fmiv0.d;
            File file0 = new File(s3 + s + "photos" + s1 + s2 + File.separator);
            if(file0.exists()) {
                z = z && fmiv0.l(file0, null);
            }
            File file1 = new File(s3 + File.separator + "photos" + File.separator + fmiv0.e + File.separator);
            if(file1.exists()) {
                z = z && fmiv0.l(file1, fmiv.f(contactId0));
            }
        }
        return Boolean.valueOf(z);
    }
}

