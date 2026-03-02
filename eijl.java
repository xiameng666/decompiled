import com.google.android.gms.chimera.modules.personalsafety.AppContextProvider;
import java.io.File;
import java.io.IOException;
import jeb.synthetic.FIN;

public final class eijl {
    private final gmcg a;

    public eijl(gmcg gmcg0) {
        this.a = gmcg0;
    }

    public final void a(String s) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        File file0 = AppContextProvider.a().getFilesDir();
        if(file0 != null) {
            File file1 = hrnt.i() ? new File(ccsb.a.b(file0, s)) : new File(file0, s);
            if(file1.exists() && !file1.delete()) {
                throw new IOException("delete");
            }
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw new IOException();
    }
}

