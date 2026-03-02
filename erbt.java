import android.accounts.Account;
import androidx.activity.result.ActivityResult;

final class erbt extends ibuo implements ibtx {
    public erbt(Object object0) {
        super(3, object0, erbv.class, "onManagedSetupCompleted", "onManagedSetupCompleted(Lcom/google/android/gms/smartdevice/quickstart/onboarding/AccountTransferResult;Landroidx/activity/result/ActivityResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ibrl ibrl0 = (ibrl)object2;
        erbv erbv0 = (erbv)this.e;
        erqc erqc0 = erbv0.i;
        erqc0.d("onManagedSetupCompleted", new Object[0]);
        ibuq.d(((erbi)object0), "null cannot be cast to non-null type com.google.android.gms.smartdevice.quickstart.onboarding.AccountTransferResult.Success");
        String s = ((erbh)(((erbi)object0))).c;
        int v = ((ActivityResult)object1).a;
        if(v != -1 && bbmn.w(erbv0.g(), s)) {
            erqc0.d("KidSetupActivity failed with error: %s, removing account.", new Object[]{new Integer(v)});
            cchj.b(erbv0.g()).m(new Account(s, "com.google"));
            return new rkt(new erbf(s));
        }
        return new rkt(((erbh)(((erbi)object0))));
    }
}

