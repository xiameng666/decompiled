import android.content.Context;

public abstract class aihz extends cjtm {
    private static final baun a;

    static {
        aihz.a = new baun(new String[]{"CryptauthKeyServiceOperation"});
    }

    public aihz(String s) {
        super(104, s);
    }

    protected abstract void b(Context arg1);

    @Override  // cjtm
    protected final void f(Context context0) {
        try {
            this.b(context0);
        }
        catch(cjuh cjuh0) {
            if(cjuh0.getCause() == null) {
                aihz.a.f(cjuh0.getMessage(), new Object[0]);
            }
            else {
                aihz.a.g(cjuh0.getMessage(), cjuh0.getCause(), new Object[0]);
            }
            throw cjuh0;
        }
    }
}

