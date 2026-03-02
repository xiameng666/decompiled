import android.accounts.Account;
import com.google.android.gms.chimera.modules.languageprofile.AppContextProvider;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class cbxq implements fktx {
    @Override  // fktx
    public final gmcd a() {
        ArrayList arrayList0 = new ArrayList();
        try {
            cbyf.a().r();
        }
        catch(IOException iOException0) {
            arrayList0.add(iOException0);
        }
        try {
            List list0 = Arrays.asList(((Account[])cbxc.b().f(new Account[0])));
            frch frch0 = new frch();
            frch0.a = cbwk.a();
            frce frce0 = new frce(AppContextProvider.a());
            frce0.j();
            frce0.d("languageprofile");
            frch0.c(frce0.a());
            frch0.b(list0);
            frch0.a().a();
        }
        catch(IOException iOException1) {
            arrayList0.add(iOException1);
        }
        if(arrayList0.isEmpty()) {
            return gmbx.a;
        }
        throw cbxg.a("Exception in the wipeout task", arrayList0);
    }
}

