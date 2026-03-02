import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.languageprofile.ClientLanguageSettings;
import java.util.Arrays;

public final class cbyt extends cjtm {
    private final azxs a;
    private final String b;
    private final String c;
    private final ClientLanguageSettings d;

    public cbyt(azxs azxs0, String s, String s1, ClientLanguageSettings clientLanguageSettings0, azug azug0) {
        super(0xA7, "GetLanguageSettings", azug0);
        this.a = azxs0;
        this.b = s;
        this.c = s1;
        this.d = clientLanguageSettings0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        String s = this.c;
        if(s == null) {
            this.a.a(Status.d);
            return;
        }
        String s1 = this.b;
        gqhu gqhu0 = (gqhu)((ProtoLiteMessage)gqhv.a).v_newBuilder();
        gqhu0.a(this.d.a);
        if(!gqhu0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gqhu0).ensureMutable();
        }
        ((gqhv)gqhu0.b_message).c = s;
        if(!gqhu0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gqhu0).ensureMutable();
        }
        gqhv.c(((gqhv)gqhu0.b_message));
        gqhv gqhv0 = (gqhv)((ProtoLiteBuilder)gqhu0).N_build();
        cbyf cbyf0 = cbyf.a();
        if(huln.h()) {
            if(s1 == null) {
                gfsx gfsx0 = cbxc.b();
                if(gfsx0.i()) {
                    Account[] arr_account = (Account[])gfsx0.d();
                    for(int v = 0; v < arr_account.length; ++v) {
                        cbyf0.p(arr_account[v], gqhv0);
                    }
                    cbyf0.i(Arrays.asList(((Object[])gfsx0.d())));
                }
            }
            else {
                gfsx gfsx1 = cbxc.a(s1);
                if(!gfsx1.i()) {
                    throw new cjuh(5, "Account is not available: " + s1);
                }
                cbyf0.p(((Account)gfsx1.d()), gqhv0);
                cbyf0.i(Arrays.asList(new Account[]{((Account)gfsx1.d())}));
            }
        }
        if(huln.i()) {
            cbyf0.q(s1, gqhv0, gqhv0.c);
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

