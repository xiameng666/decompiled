import android.content.Context;
import android.content.Intent;
import java.util.List;

final class erbs extends ibuo implements ibtx {
    public erbs(Object object0) {
        super(3, object0, erbv.class, "onFallbackCompleted", "onFallbackCompleted(Lcom/google/android/gms/smartdevice/quickstart/onboarding/AccountTransferState;Lcom/google/android/libraries/onboarding/contracts/auth/TargetFallbackActivityContract$Response;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        erbi erbi0;
        ibrl ibrl0 = (ibrl)object2;
        erbv erbv0 = (erbv)this.e;
        erqc erqc0 = erbv0.i;
        erqc0.d("onFallbackCompleted, response: %s", new Object[]{((fncx)object1)});
        List list0 = ibpo.at(((erbm)object0).c);
        List list1 = ((fncx)object1).b;
        if(list1 != null) {
            list0.addAll(list1);
        }
        List list2 = ((erbm)object0).b;
        String s = ((erbm)object0).d;
        erbm erbm0 = new erbm(list2, list0, s, ((erbm)object0).e);
        fnfb fnfb0 = erbv0.E(erbm0);
        erbv0.w(fnfb.class, fnfb0);
        erbv0.H(erbm0);
        if(list0.isEmpty()) {
            Context context0 = erbv0.g();
            ((eray)erbv0.k.a(context0)).o(gjjm.Z);
            erbk erbk0 = (erbk)ibpo.T(list2);
            String s1 = erbk0 == null ? null : erbk0.b;
            if(s == null) {
                s = s1;
            }
            erbi0 = new erbf(s);
        }
        else {
            erbi0 = erbv0.D(erbm0);
        }
        Intent intent0 = erbv0.C(list0);
        if(intent0 != null) {
            erqc0.d("Launch managed setup activity", new Object[0]);
            return erbv0.g.a(erbi0, intent0);
        }
        return new rkt(erbi0);
    }
}

