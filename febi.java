import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.wearable.node.accountmatching.matcher.AccountsMatcher.AccountsMatcherResult;
import com.google.android.gms.wearable.node.accountmatching.ui.AccountMatchingChimeraActivity;

public final class febi implements febg {
    public final febk a;

    public febi(febk febk0) {
        this.a = febk0;
    }

    @Override  // febg
    public final void a(Object object0) {
        febk febk0 = this.a;
        if(((AccountsMatcher.AccountsMatcherResult)object0).b()) {
            febk0.c.l(((AccountsMatcher.AccountsMatcherResult)object0).b);
            return;
        }
        febj febj0 = new febj(febk0);
        Intent intent0 = AccountMatchingChimeraActivity.g("sign_in_fragment", febk0.c.d, febk0.c.e);
        Bundle bundle0 = intent0.getExtras();
        gftb.check(bundle0);
        bundle0.putParcelable("com.google.android.gms.wearable.node.accountmatching.ui.SignInAccounts", ((Parcelable)object0));
        bundle0.putBinder("com.google.android.gms.wearable.node.accountmatching.ui.CallbackBinder", febj0);
        intent0.putExtras(bundle0);
        intent0.addFlags(0x10008000);
        febk0.c.c.startActivity(intent0);
    }
}

