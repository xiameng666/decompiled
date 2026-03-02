import android.accounts.Account;
import android.content.Context;
import j..util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.Map;

public final class ezse implements ezss {
    public final Context a;
    public final frii b;
    public final gmcg c;
    public final Map d;

    public ezse(Context context0, frii frii0, gmcg gmcg0) {
        this.d = new ConcurrentHashMap();
        this.a = context0;
        this.b = frii0;
        this.c = gmcg0;
    }

    @Override  // ezss
    public final gmcd a(Account account0) {
        throw null;
    }

    public static boolean b(File file0) {
        if(file0.isDirectory()) {
            File[] arr_file = file0.listFiles();
            if(arr_file != null) {
                boolean z = true;
                for(int v = 0; v < arr_file.length; ++v) {
                    z = z && ezse.b(arr_file[v]);
                }
                return z ? file0.delete() : false;
            }
        }
        return file0.delete();
    }

    public static final String c() {
        return String.format("%s/%s", "udc", "sc");
    }
}

