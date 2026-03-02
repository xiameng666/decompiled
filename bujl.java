import com.google.android.chimera.android.Activity;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class bujl implements Factory {
    private final Provider a;

    public bujl(Provider provider0) {
        this.a = provider0;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        Activity activity0 = ((ejaw)this.a).a();
        String s = activity0.getIntent().getStringExtra("account_name_key");
        if(s == null) {
            s = "";
        }
        if(s.length() == 0) {
            ((ggtj)bujk.a.j()).x("No account set in the intent");
            activity0.finish();
        }
        return new bujj(s);
    }
}

