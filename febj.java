import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.node.accountmatching.matcher.AccountsMatcher.AccountsMatcherResult;
import j..util.Objects;

final class febj extends azxr {
    final febk a;

    public febj(febk febk0) {
        Objects.requireNonNull(febk0);
        this.a = febk0;
        super();
    }

    @Override  // azxs
    public final void a(Status status0) {
        boolean z = status0.equals(Status.b);
        febl febl0 = this.a.c;
        if(!z) {
            febl0.b(null);
            return;
        }
        AccountsMatcher.AccountsMatcherResult accountsMatcher$AccountsMatcherResult0 = febl0.f;
        if(accountsMatcher$AccountsMatcherResult0 == null) {
            febl0.b(new fean("No remote accounts have been received."));
            return;
        }
        febh febh0 = new febh(febl0, accountsMatcher$AccountsMatcherResult0.a);
        febh0.a = new febf(febl0);
        febl0.a.post(febh0);
    }
}

