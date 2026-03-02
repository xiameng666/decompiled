import com.google.android.gms.wearable.node.accountmatching.matcher.AccountsMatcher.AccountsMatcherResult;
import j..util.Objects;
import java.util.List;

final class febk extends febb {
    final febl c;

    public febk(febl febl0) {
        Objects.requireNonNull(febl0);
        this.c = febl0;
        super(febl0);
    }

    @Override  // febb
    public final boolean a() {
        febl febl0 = this.c;
        AccountsMatcher.AccountsMatcherResult accountsMatcher$AccountsMatcherResult0 = febl0.f;
        if(accountsMatcher$AccountsMatcherResult0 == null) {
            throw new feav(this.a);
        }
        if(accountsMatcher$AccountsMatcherResult0.b()) {
            febm febm0 = febl0.b;
            if(febm0 != null) {
                febm0.c();
            }
            return false;
        }
        febl0.k();
        return true;
    }

    @Override  // febb
    public final void c(List list0) {
        febh febh0 = new febh(this.c, list0);
        febh0.a = new febi(this);
        this.c.a.post(febh0);
    }
}

