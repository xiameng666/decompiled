import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.NotifyEmoneyCardStatusUpdateRequest;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import dagger.internal.Preconditions;
import j..util.Optional;
import org.json.JSONException;
import org.json.JSONObject;

public final class ebvy extends ebav {
    public edqy a;
    public dyra b;
    public bbng c;
    public ebst d;
    public edse e;
    public boolean f;
    private static final bboh g;
    private final NotifyEmoneyCardStatusUpdateRequest h;
    private final donp n;
    private long o;
    private Optional p;

    static {
        ebvy.g = bboh.b("Pay", bbcu.cZ);
    }

    public ebvy(NotifyEmoneyCardStatusUpdateRequest notifyEmoneyCardStatusUpdateRequest0, String s, donp donp0, azug azug0) {
        ibuq.f(notifyEmoneyCardStatusUpdateRequest0, "request");
        ibuq.f(s, "callingPackage");
        ibuq.f(donp0, "callbacks");
        super("NotifyEmoneyCardStatusUpdate", s, azug0);
        this.h = notifyEmoneyCardStatusUpdateRequest0;
        this.n = donp0;
        this.f = true;
        Optional optional0 = Optional.empty();
        ibuq.e(optional0, "empty(...)");
        this.p = optional0;
    }

    @Override  // ebaw
    public final void b(Context context0) {
        dylc dylc0;
        edqy edqy0;
        JSONObject jSONObject1;
        Status status2;
        ibuq.f(context0, "context");
        Optional optional0 = dlmj.a(context0).n();
        ibuq.e(optional0, "toJavaUtil(...)");
        this.p = optional0;
        if(!optional0.isPresent()) {
            Status status0 = new Status(4, "Active account was not found", null);
            this.n.x(status0);
            return;
        }
        Object object0 = this.p.get();
        ibuq.e(object0, "get(...)");
        boolean z = ((Boolean)((AccountInfo)object0).b().f(Boolean.valueOf(false))).booleanValue();
        dola dola0 = new dola(((AccountInfo)object0).b, ((AccountInfo)object0).a, z);
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        done done0 = new done();
        new ebnz(dola0, new dmgr(this.j), done0, new edop(), domv0).inject(this);
        this.d();
        this.o = System.currentTimeMillis();
        hfuo hfuo0 = this.f ? hwnm.d().b : hwnm.e().b;
        ibuq.c(hfuo0);
        if(!hwnm.o() && !(azqx.a(context0) ? ebza.k(context0, this.j) : ebza.j(context0, this.j, hfuo0))) {
            this.e(1);
            Status status1 = new Status(8, "Caller not authorized");
            this.n.x(status1);
            return;
        }
        NotifyEmoneyCardStatusUpdateRequest notifyEmoneyCardStatusUpdateRequest0 = this.h;
        if(TextUtils.isEmpty(notifyEmoneyCardStatusUpdateRequest0.a)) {
            this.e(2);
            status2 = new Status(10, "Missing json in the request", null);
        }
        else {
            try {
                JSONObject jSONObject0 = new JSONObject(notifyEmoneyCardStatusUpdateRequest0.a);
                String s = jSONObject0.getString("serviceProvider");
                ibuq.e(s, "getString(...)");
                if(s.equals("SERVICE_PROVIDER_OCTOPUS")) {
                    String s1 = jSONObject0.optString("accountName");
                    ibuq.e(s1, "optString(...)");
                    if(s1.length() > 0 && this.p.isPresent() && !s1.equals(((AccountInfo)this.p.get()).b)) {
                        this.e(7);
                        status2 = new Status(5, "Provided account does not match the active account", null);
                    }
                    else {
                        jSONObject1 = jSONObject0.getJSONObject("cardData");
                        ibuq.e(jSONObject1, "getJSONObject(...)");
                        edqy0 = this.a;
                        if(edqy0 == null) {
                            goto label_44;
                        }
                        goto label_46;
                    }
                }
                else {
                    goto label_70;
                }
                goto label_75;
            }
            catch(JSONException unused_ex) {
                goto label_73;
            }
        label_44:
            ibuq.j("octopusCardEligibility");
            edqy0 = null;
        label_46:
            if(edqy0.b) {
                try {
                    dylc0 = fsgr.f(jSONObject1);
                }
                catch(fsev unused_ex) {
                    this.e(2);
                    status2 = new Status(10, "Failed to parse card data", null);
                    goto label_75;
                }
                this.e(0);
                dyng dyng0 = dylc0.h == null ? dyng.a : dylc0.h;
                dyir dyir0 = dyng0.b == 8 ? ((dyir)dyng0.c) : dyir.a;
                if((dyiv.b(dyir0.d) == null ? dyiv.m : dyiv.b(dyir0.d)) == dyiv.l) {
                    dyra dyra0 = this.c();
                    String s2 = dylc0.d;
                    ibuq.e(s2, "getServiceProviderCardId(...)");
                    if(!dyra0.p(s2)) {
                        ((ggtj)ebvy.g.h()).B("%s: Failed to clean up card data.", "NotifyEmoneyCardStatusUpdateOperation");
                    }
                    status2 = new Status(0, null, null);
                }
                else {
                    if(!this.c().q(dylc0, null)) {
                        ((ggtj)ebvy.g.h()).B("%s: Failed to update card data.", "NotifyEmoneyCardStatusUpdateOperation");
                    }
                    status2 = new Status(0, null, null);
                    goto label_75;
                    try {
                    label_70:
                        this.e(3);
                        status2 = new Status(10, "Unsupported service provider", null);
                    }
                    catch(JSONException unused_ex) {
                    label_73:
                        this.e(2);
                        status2 = new Status(10, "Failed to parse request JSON", null);
                    }
                }
            }
            else {
                this.e(4);
                status2 = new Status(10, "Feature is not available", null);
            }
        }
    label_75:
        this.n.x(status2);
    }

    public final dyra c() {
        dyra dyra0 = this.b;
        if(dyra0 != null) {
            return dyra0;
        }
        ibuq.j("octopusCardManager");
        return null;
    }

    public final void d() {
        if(this.c != null) {
            return;
        }
        ibuq.j("clock");
    }

    private final void e(int v) {
        if(this.p.isPresent()) {
            ebst ebst0 = this.d;
            if(ebst0 == null) {
                ibuq.j("emoneyOperationUtils");
                ebst0 = null;
            }
            String s = ((AccountInfo)this.p.get()).b;
            ibuq.e(s, "getAccountName(...)");
            this.d();
            ebst.e(ebst0, s, 0x33308, System.currentTimeMillis() - this.o, v, 16);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        this.n.x(status0);
    }
}

