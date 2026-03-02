import android.content.Context;

public abstract class aihu extends cjtm {
    private static final baun a;

    static {
        aihu.a = new baun(new String[]{"CryptauthInternalDataServiceOperation"});
    }

    public aihu(String s) {
        super(107, s);
    }

    protected abstract void b(Context arg1);

    @Override  // cjtm
    protected final void f(Context context0) {
        try {
            this.b(context0);
        }
        catch(cjuh cjuh0) {
            if(cjuh0.getCause() == null) {
                aihu.a.f(cjuh0.getMessage(), new Object[0]);
            }
            else {
                aihu.a.g(cjuh0.getMessage(), cjuh0.getCause(), new Object[0]);
            }
            throw cjuh0;
        }
    }
}

