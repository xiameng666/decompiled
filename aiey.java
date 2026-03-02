import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

abstract class aiey extends bxoi {
    protected final String a;
    protected final GoogleSignInOptions b;
    protected final aier c;

    static {
        new baun("Auth.Api.SignIn", new String[]{"BaseGoogleSignInOperation"});
    }

    public aiey(aier aier0, GoogleSignInOptions googleSignInOptions0, String s, String s1) {
        super(91, s1);
        batl.s(aier0);
        this.c = aier0;
        this.b = googleSignInOptions0;
        batl.q(s);
        this.a = s;
    }
}

