import android.accounts.Account;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.pay.IntentSource;
import com.google.android.gms.pay.PayIntentArgs;

public abstract class dmqc {
    public final dlhd a;
    private final Intent b;

    protected dmqc(String s) {
        this.b = new Intent(s).setClassName("com.google.android.gms", "com.google.android.gms.pay.main.PayActivity");
        this.a = new dlhd();
    }

    protected abstract void a(PayIntentArgs arg1);

    protected abstract void b(dlhd arg1);

    public Intent c() {
        this.b(this.a);
        PayIntentArgs payIntentArgs0 = this.a.a;
        this.a(payIntentArgs0);
        Intent intent0 = this.b;
        bauc.l(payIntentArgs0, intent0, "args");
        Account account0 = payIntentArgs0.a;
        if(account0 != null) {
            intent0.putExtra("authAccount", account0.name);
        }
        if(!TextUtils.isEmpty(payIntentArgs0.b)) {
            intent0.putExtra("wear_intent", true);
        }
        return intent0;
    }

    public final void d(Account account0) {
        this.a.a.a = account0;
    }

    public final void e(int v) {
        IntentSource intentSource0 = new IntentSource();
        intentSource0.a = v;
        this.a.a.d = intentSource0;
    }

    public final void f(long v) {
        this.a.a.c = v;
    }

    public final void g(String s) {
        this.a.a.b = s;
    }
}

