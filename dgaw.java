import android.accounts.Account;
import j..util.Collection.-EL;
import j..util.Optional;
import java.io.File;
import java.util.ArrayList;

public final class dgaw implements dawp {
    private final dgan a;
    private final dfsk b;

    public dgaw(dgan dgan0, dfsk dfsk0) {
        this.a = dgan0;
        this.b = dfsk0;
    }

    @Override  // dawp
    public final boolean a(byte[] arr_b, byte[] arr_b1, byte[] arr_b2, byte[] arr_b3) {
        dawv dawv0;
        dbwy dbwy0 = this.a.n();
        ArrayList arrayList0 = new ArrayList();
        if(dbwy0 != null && !dbwy0.b.isEmpty()) {
            for(Object object0: dbwy0.b) {
                heax heax0 = ((dbwx)object0).k;
                if(heax0 == null) {
                    heax0 = heax.a;
                }
                arrayList0.add(heax0);
            }
            Optional optional0 = Collection.-EL.stream(arrayList0).filter(new dgau(arr_b)).findFirst();
            if(!optional0.isEmpty()) {
                heax heax1 = (heax)optional0.get();
                try {
                    dawv0 = null;
                    dawv0 = new dawv(heax1.g.toByteArray());
                }
                catch(IllegalArgumentException unused_ex) {
                }
                return dawv0 == null ? false : dawv0.a(arr_b1, arr_b2, arr_b3);
            }
        }
        return false;
    }

    @Override  // dawp
    public final byte[] b(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) {
        Account account0 = this.b.c();
        if(account0 != null) {
            File file0 = this.a.q(account0, "nearby_sharing_private_certificate_file_for_all_contacts");
            Optional optional0 = Collection.-EL.stream(this.a.u(file0)).filter(new dgav(arr_b)).findFirst();
            if(!optional0.isEmpty()) {
                heav heav0 = ((dbwu)optional0.get()).p;
                if(heav0 == null) {
                    heav0 = heav.a;
                }
                byte[] arr_b3 = dbad.p(heav0);
                return arr_b3 == null ? new byte[0] : dazo.a(arr_b1, arr_b2, new gnqn(arr_b3));
            }
        }
        return new byte[0];
    }
}

