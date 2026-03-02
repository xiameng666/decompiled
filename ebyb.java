import android.app.PendingIntent;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.PushEmoneyCardRequest;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import dagger.internal.Preconditions;
import j..util.Optional;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class ebyb extends ebav {
    public edqy a;
    public ebst b;
    public bbng c;
    public edse d;
    public boolean e;
    private final PushEmoneyCardRequest f;
    private final donp g;
    private long h;
    private Optional n;

    public ebyb(PushEmoneyCardRequest pushEmoneyCardRequest0, String s, donp donp0, azug azug0) {
        ibuq.f(pushEmoneyCardRequest0, "request");
        ibuq.f(s, "callingPackage");
        ibuq.f(donp0, "callbacks");
        super("PushEmoneyCard", s, azug0);
        this.f = pushEmoneyCardRequest0;
        this.g = donp0;
        this.e = true;
        Optional optional0 = Optional.empty();
        ibuq.e(optional0, "empty(...)");
        this.n = optional0;
    }

    @Override  // ebaw
    public final void b(Context context0) {
        dylc dylc0;
        String s3;
        edqy edqy0;
        JSONObject jSONObject1;
        String s2;
        JSONObject jSONObject0;
        Status status1;
        String s = "cardData";
        ibuq.f(context0, "context");
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        new ebow(domv0).inject(this);
        this.e();
        this.h = System.currentTimeMillis();
        Optional optional0 = dlmj.a(context0).n();
        ibuq.e(optional0, "toJavaUtil(...)");
        this.n = optional0;
        hfuo hfuo0 = this.e ? hwnm.d().b : hwnm.e().b;
        ibuq.c(hfuo0);
        if(!hwnm.o() && !(azqx.a(context0) ? ebza.k(context0, this.j) : ebza.j(context0, this.j, hfuo0))) {
            ebyb.d(this, 1);
            Status status0 = new Status(8, "Caller not authorized");
            this.g.h(status0);
            return;
        }
        PushEmoneyCardRequest pushEmoneyCardRequest0 = this.f;
        if(TextUtils.isEmpty(pushEmoneyCardRequest0.a)) {
            this.g(2, (hwnm.m() ? "Missing json in the request" : null));
            status1 = new Status(10, "Missing json in the request", null);
        }
        else {
            try {
                jSONObject0 = new JSONObject(pushEmoneyCardRequest0.a);
            }
            catch(JSONException unused_ex) {
                s = "requestJson";
                goto label_43;
            }
            try {
                String s1 = jSONObject0.getString("serviceProvider");
                ibuq.e(s1, "getString(...)");
                if(s1.equals("SERVICE_PROVIDER_OCTOPUS")) {
                    goto label_34;
                }
                else {
                    ebyb.d(this, 3);
                    status1 = new Status(10, "Unsupported service provider", null);
                }
                goto label_80;
            }
            catch(JSONException unused_ex) {
                s = "serviceProvider";
                goto label_43;
            }
            try {
            label_34:
                s2 = jSONObject0.optString("sessionId");
                ibuq.e(s2, "optString(...)");
            }
            catch(JSONException unused_ex) {
                s = "sessionId";
                goto label_43;
            }
            try {
                jSONObject1 = jSONObject0.getJSONObject("cardData");
                ibuq.e(jSONObject1, "getJSONObject(...)");
                edqy0 = this.a;
                goto label_51;
            }
            catch(JSONException unused_ex) {
            }
        label_43:
            if(hwnm.m()) {
                s3 = String.format("Json parsing stopped at field: %s", Arrays.copyOf(new Object[]{s}, 1));
                ibuq.e(s3, "format(...)");
            }
            else {
                s3 = null;
            }
            this.g(2, s3);
            status1 = new Status(10, "Failed to parse request JSON", null);
            goto label_80;
        label_51:
            if(edqy0 == null) {
                ibuq.j("octopusCardEligibility");
                edqy0 = null;
            }
            if(edqy0.b) {
                try {
                    dylc0 = fsgr.f(jSONObject1);
                }
                catch(fsev fsev0) {
                    this.g(2, (hwnm.m() ? fsev0.b : null));
                    status1 = new Status(10, "Failed to parse Octopus card data", null);
                    goto label_80;
                }
                eagw eagw0 = eagv.a(((ProtoLiteMessage)eagu.a).v_newBuilder());
                eagw0.d(dyna.i);
                eagw0.c(eagt.j);
                eagw0.j();
                eagw0.f(dylc0);
                if(!TextUtils.isEmpty(s2)) {
                    ibuq.f(s2, "value");
                    ProtoLiteBuilder hftp0 = eagw0.a;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    eagu eagu0 = (eagu)hftp0.b_message;
                    s2.getClass();
                    eagu0.k = s2;
                }
                PendingIntent pendingIntent0 = bbmq.g(context0, dlnf.am(null, context0, eagw0.a()), 0x44000000);
                ebyb.d(this, 0);
                status1 = new Status(0, null, pendingIntent0);
            }
            else {
                ebyb.d(this, 4);
                status1 = new Status(10, "Feature is not available", null);
            }
        }
    label_80:
        this.g.h(status1);
    }

    public final ebst c() {
        ebst ebst0 = this.b;
        if(ebst0 != null) {
            return ebst0;
        }
        ibuq.j("emoneyOperationUtils");
        return null;
    }

    static void d(ebyb ebyb0, int v) {
        ebyb0.g(v, null);
    }

    public final void e() {
        if(this.c != null) {
            return;
        }
        ibuq.j("clock");
    }

    private final void g(int v, String s) {
        if(this.n.isPresent()) {
            ebst ebst0 = this.c();
            String s1 = ((AccountInfo)this.n.get()).b;
            ibuq.e(s1, "getAccountName(...)");
            this.e();
            ebst0.b(s1, 0x33305, System.currentTimeMillis() - this.h, v, s);
            return;
        }
        ebst ebst1 = this.c();
        this.e();
        ebst1.c(0x33305, System.currentTimeMillis() - this.h, v, s);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        this.g.h(Status.d);
    }
}

