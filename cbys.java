import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;

public final class cbys extends cjtm {
    private final azxs a;
    private final String b;
    private final String c;

    public cbys(azxs azxs0, String s, String s1, azug azug0) {
        super(0xA7, "RemoveLanguageSettings", azug0);
        this.a = azxs0;
        this.b = s;
        this.c = s1;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        String s = this.c;
        if(s == null) {
            this.a.a(Status.d);
            return;
        }
        String s1 = this.b;
        cbyf cbyf0 = cbyf.a();
        if(huln.h()) {
            if(s1 == null) {
                gfsx gfsx0 = cbxc.b();
                if(gfsx0.i()) {
                    Account[] arr_account = (Account[])gfsx0.d();
                    for(int v = 0; v < arr_account.length; ++v) {
                        cbyf0.k(arr_account[v], s);
                    }
                    cbyf0.i(Arrays.asList(((Object[])gfsx0.d())));
                }
            }
            else {
                gfsx gfsx1 = cbxc.a(s1);
                if(!gfsx1.i()) {
                    throw new cjuh(5, "Account is not available: " + s1);
                }
                cbyf0.k(((Account)gfsx1.d()), s);
                cbyf0.i(Arrays.asList(new Account[]{((Account)gfsx1.d())}));
            }
        }
        if(huln.i()) {
            cbyf0.l(s1, s);
            if(s1 == null) {
                gfsx gfsx3 = cbxc.b();
                if(gfsx3.i()) {
                    cbyf0.i(Arrays.asList(((Object[])gfsx3.d())));
                }
            }
            else {
                gfsx gfsx2 = cbxc.a(s1);
                if(!gfsx2.i()) {
                    throw new cjuh(5, "Account is not available: " + s1);
                }
                cbyf0.i(Arrays.asList(new Account[]{((Account)gfsx2.d())}));
            }
        }
        this.a.a(Status.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0);
    }
}

