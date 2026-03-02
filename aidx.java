import android.accounts.Account;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Deprecated
public final class aidx {
    public Set a;
    public String b;
    private boolean c;
    private boolean d;
    private boolean e;
    private String f;
    private Account g;
    private String h;
    private Map i;

    public aidx() {
        this.a = new HashSet();
        this.i = new HashMap();
    }

    public aidx(GoogleSignInOptions googleSignInOptions0) {
        this.a = new HashSet();
        this.i = new HashMap();
        batl.s(googleSignInOptions0);
        this.a = new HashSet(googleSignInOptions0.i);
        this.c = googleSignInOptions0.l;
        this.d = googleSignInOptions0.m;
        this.e = googleSignInOptions0.k;
        this.f = googleSignInOptions0.n;
        this.g = googleSignInOptions0.j;
        this.h = googleSignInOptions0.o;
        this.i = GoogleSignInOptions.b(googleSignInOptions0.p);
        this.b = googleSignInOptions0.q;
    }

    public final GoogleSignInOptions a() {
        if(this.a.contains(GoogleSignInOptions.e)) {
            Scope scope0 = GoogleSignInOptions.d;
            if(this.a.contains(scope0)) {
                this.a.remove(scope0);
            }
        }
        if(this.e && (this.g == null || !this.a.isEmpty())) {
            this.b();
        }
        return new GoogleSignInOptions(3, new ArrayList(this.a), this.g, this.e, this.c, this.d, this.f, this.h, this.i, this.b);
    }

    public final void b() {
        this.a.add(GoogleSignInOptions.c);
    }

    public final void c(Scope scope0, Scope[] arr_scope) {
        this.a.add(scope0);
        this.a.addAll(Arrays.asList(arr_scope));
    }
}

