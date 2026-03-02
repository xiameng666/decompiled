import android.accounts.Account;
import android.content.Context;
import android.graphics.BitmapFactory;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import java.io.File;
import java.util.concurrent.Callable;

public final class dmep implements Callable {
    public final dmet a;
    public final File b;
    public final String c;

    public dmep(dmet dmet0, File file0, String s) {
        this.a = dmet0;
        this.b = file0;
        this.c = s;
    }

    @Override
    public final Object call() {
        File file0 = this.b;
        if(file0.exists()) {
            return gfsx.m(BitmapFactory.decodeFile(file0.getPath()));
        }
        Context context0 = this.a.b;
        Account account0 = this.a.c;
        String s = dlmj.b(context0, account0.name);
        if(s == null) {
            return gfqx.a;
        }
        AccountInfo accountInfo0 = new AccountInfo(s, account0.name, 0);
        dmet.d(context0, this.c, accountInfo0);
        return gfqx.a;
    }
}

