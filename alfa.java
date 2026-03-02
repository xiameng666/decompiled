import android.accounts.Account;
import android.app.PendingIntent.CanceledException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.proximity.firstparty.SetupRequestedSubscription;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;

public final class alfa {
    private static final bboh a;

    static {
        alfa.a = alis.a("FeatureSetupRouter");
    }

    public final void a(Context context0, Account account0, String s) {
        int v;
        String s1 = account0.name;
        hpzt hpzt0 = hpzt.a;
        if(hpzt0.b().p() && gqus.h.name().equals(s)) {
            Intent intent0 = new Intent("com.google.android.apps.messaging.BETTER_TOGETHER_SETUP_REQUESTED");
            intent0.setPackage("com.google.android.apps.messaging");
            intent0.putExtra("android.intent.extra.USER", s1);
            context0.sendBroadcast(intent0);
        }
        if(hpzt0.b().s() && gqus.b.name().equals(s) && !alfm.a(context0, account0)) {
            ((ggtj)alfa.a.j()).B("Failed to trigger force sync for account: %s", account0.name);
        }
        try {
            v = gqus.b(s).a();
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            if(!Pattern.matches("^([0-9A-Fa-f]{2}:){5}([0-9A-Fa-f]{2})$", s)) {
                a.e(alfa.a.j(), "Invalid feature name: %s", s, illegalArgumentException0);
                return;
            }
            return;
        }
        aliu aliu0 = new aliu();
        aliu0.C("feature_setup_event", v);
        algs algs0 = algs.a();
        try {
            gmce gmce0 = new gmce(new algq(algs0));
            algs0.e(gmce0);
            List list0 = (List)gmce0.get();
        }
        catch(InterruptedException | ExecutionException exception0) {
            a.ae(alfa.a.j(), "Failed to fetch subscriptions.", exception0);
            return;
        }
        if(!list0.isEmpty()) {
            Bundle bundle0 = new Bundle();
            bundle0.putString("EXTRA_ACCOUNT_NAME_FOR_SETUP", s1);
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                SetupRequestedSubscription setupRequestedSubscription0 = (SetupRequestedSubscription)object0;
                if(s.equals(setupRequestedSubscription0.b)) {
                    goto label_34;
                }
                continue;
                try {
                label_34:
                    setupRequestedSubscription0.d(context0, bundle0);
                    aliu0.C("feature_setup_event_reported", v);
                }
                catch(PendingIntent.CanceledException unused_ex) {
                    arrayList0.add(algs0.d(setupRequestedSubscription0));
                }
            }
            try {
                for(Object object1: ((List)((glyq)gmbu.e(arrayList0)).u())) {
                    Status status0 = (Status)object1;
                    if(!status0.equals(Status.b)) {
                        ((ggtj)alfa.a.j()).B("Failed to update cache subscription. %s", status0);
                    }
                }
                return;
            }
            catch(InterruptedException | ExecutionException exception1) {
                goto label_48;
            }
        }
        return;
    label_48:
        a.ae(alfa.a.j(), "Failed to update cache subscriptions.", exception1);
    }
}

