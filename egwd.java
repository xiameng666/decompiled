import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.people.contactssync.model.AccountWithDataSet;
import com.google.android.gms.people.contactssync.model.ImportSimContactsRequest;
import java.util.List;

public final class egwd implements egwa {
    public static final bboh a;
    public final egns b;
    private final gmcg c;
    private final SubscriptionManager d;
    private final bzt e;
    private final efyr f;
    private evql g;
    private gmcd h;

    static {
        egwd.a = bboh.a("SimImportRepo");
    }

    public egwd(gmcg gmcg0, SubscriptionManager subscriptionManager0, efyr efyr0, egns egns0) {
        this.e = new bzt(1);
        this.c = gmcg0;
        this.d = subscriptionManager0;
        this.b = egns0;
        this.f = efyr0;
    }

    @Override  // egwa
    public final lqd a(AccountWithDataSet accountWithDataSet0) {
        lqd lqd0 = new lqi();
        evql evql0 = this.f.b(accountWithDataSet0);
        this.g = evql0;
        evql0.z(new egwb(((lqi)lqd0)));
        return lqd0;
    }

    @Override  // egwa
    public final evql b(ImportSimContactsRequest importSimContactsRequest0) {
        return this.f.c(importSimContactsRequest0);
    }

    @Override  // egwa
    public final gmcd c(int v) {
        if(this.h == null) {
            egwc egwc0 = new egwc(this, v);
            this.h = this.c.e(egwc0);
        }
        return this.h;
    }

    @Override  // egwa
    public final CharSequence d(int v) {
        SubscriptionInfo subscriptionInfo0 = this.h(v);
        return subscriptionInfo0 == null ? null : egwd.i(subscriptionInfo0.getCarrierName());
    }

    @Override  // egwa
    public final CharSequence e(int v) {
        SubscriptionInfo subscriptionInfo0 = this.h(v);
        return subscriptionInfo0 == null ? null : egwd.i(subscriptionInfo0.getDisplayName());
    }

    @Override  // egwa
    public final String f(int v) {
        SubscriptionInfo subscriptionInfo0 = this.h(v);
        return subscriptionInfo0 == null ? null : gfta.a(subscriptionInfo0.getNumber());
    }

    @Override  // egwa
    public final evql g(ImportSimContactsRequest importSimContactsRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new egan(importSimContactsRequest0);
        azzc0.c = new Feature[]{efnu.p};
        azzc0.d = 0xAA8;
        azzd azzd0 = azzc0.a();
        return ((azts)this.f).iG(azzd0);
    }

    private final SubscriptionInfo h(int v) {
        bzt bzt0 = this.e;
        if(bzt0.j()) {
            List list0 = this.d.getActiveSubscriptionInfoList();
            if(list0 == null) {
                list0 = ggna.a;
            }
            for(Object object0: list0) {
                bzt0.h(((SubscriptionInfo)object0).getSubscriptionId(), ((SubscriptionInfo)object0));
            }
        }
        SubscriptionInfo subscriptionInfo0 = (SubscriptionInfo)bzu.a(bzt0, v);
        if(subscriptionInfo0 == null) {
            SubscriptionInfo subscriptionInfo1 = this.d.getActiveSubscriptionInfo(v);
            if(subscriptionInfo1 != null) {
                bzt0.h(subscriptionInfo1.getSubscriptionId(), subscriptionInfo1);
            }
            return subscriptionInfo1;
        }
        return subscriptionInfo0;
    }

    private static final CharSequence i(CharSequence charSequence0) {
        return TextUtils.isEmpty(charSequence0) ? null : charSequence0;
    }
}

