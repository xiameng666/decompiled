import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

public final class ajvo extends cjtm {
    private static final bboh a;
    private final azxs b;
    private final akbo c;
    private final akbl d;

    static {
        ajvo.a = akea.b("AddGaiaPasswordMemberOperation");
    }

    public ajvo(azxs azxs0, String s, String s1, azug azug0) {
        super(0xAC, "AddGaiaPasswordMember", azug0);
        this.b = azxs0;
        akbm akbm0 = new akbm();
        batl.q(s1);
        akbm0.b(s1);
        batl.q(s);
        akbm0.a = new Account(s, "com.google");
        akbm0.b = akbn.t;
        akbo akbo0 = akbm0.a();
        this.c = akbo0;
        this.d = new akbl(akbo0);
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        byte[] arr_b;
        try {
            grdg grdg0 = this.d.e().b;
            if(grdg0 == null) {
                grdg0 = grdg.a;
            }
            arr_b = grdg0.c.toByteArray();
        }
        catch(akbi akbi0) {
            ggtj ggtj0 = (ggtj)((ggtj)ajvo.a.j()).s(akbi0);
            int v = akbi0.a - 1;
            if(akbi0.a == 0) {
                throw null;
            }
            ggtj0.z("getCurrentGaiaPasswordPublicEncryptionKey failed with FolsomSyncException result code: %d", v);
            arr_b = new byte[0];
        }
        int v1 = 8;
        if(arr_b.length == 0) {
            this.j(new Status(8, "Could not get current Gaia password member public encryption key"));
            return;
        }
        try {
            this.d.q(arr_b, 3);
            this.b.a(Status.b);
        }
        catch(akbi akbi1) {
            int v2 = akbi1.a - 1;
            Locale locale0 = Locale.US;
            if(akbi1.a == 0) {
                throw null;
            }
            String s = String.format(locale0, "AddGaiaPasswordMemberOperation failed with FolsomSyncException result code: %d", v2);
            switch(v2) {
                case 7: {
                    v1 = 7;
                    break;
                }
                case 13: {
                    v1 = 38500;
                }
            }
            this.j(new Status(v1, s));
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.a(status0);
    }
}

