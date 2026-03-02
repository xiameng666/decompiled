import android.accounts.Account;
import android.content.Context;
import com.google.android.chimera.android.Activity;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mdocstore.MobileDocumentRequest;
import com.google.android.gms.mdocstore.NamespaceEntriesRequest;
import com.google.android.gms.mdocstore.OperatingStatus;
import com.google.android.gms.mdocstore.StartPresentationRequest;
import com.google.android.gms.mdocstore.types.CryptoSchemeId;
import com.google.android.gms.mdocstore.types.ProvisioningId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class craf extends azts implements cqxc {
    public static final baun a;
    public final Account b;

    static {
        craf.a = new baun("InternalMdocStoreClient", new String[0]);
    }

    public craf(Context context0, Account account0) {
        super(context0, cqxa.a, azsx.s, aztr_settings.a);
        this.b = account0;
    }

    public craf(Activity activity0, Account account0) {
        super(activity0, cqxa.a, azsx.s, aztr_settings.a);
        this.b = account0;
    }

    @Override  // cqxc
    public final evql b(ProvisioningId provisioningId0, OperatingStatus operatingStatus0) {
        azzc azzc0 = new azzc();
        azzc0.a = new cqyy(this, provisioningId0, operatingStatus0);
        azzc0.b = false;
        azzc0.c = new Feature[]{cqwp.b};
        azzc0.d = 0x722B;
        return this.iG(azzc0.a());
    }

    @Override  // cqxc
    public final evql c(cram cram0) {
        azzc azzc0 = new azzc();
        azzc0.a = new cqyo(this, cram0);
        azzc0.b = false;
        azzc0.c = new Feature[]{cqwp.b};
        azzc0.d = 29201;
        return this.iG(azzc0.a());
    }

    public final void cA(cqxz cqxz0, StartPresentationRequest startPresentationRequest0) {
        azyf azyf0 = this.iD(cqxz0, "mdocstorePresentationListener");
        cqyl cqyl0 = new cqyl(this, startPresentationRequest0, azyf0);
        cqym cqym0 = new cqym();
        azyq azyq0 = new azyq();
        azyq0.c = azyf0;
        azyq0.d = new Feature[]{cqwp.b};
        azyq0.e = 0x721E;
        azyq0.a = cqyl0;
        azyq0.b = cqym0;
        this.iH(azyq0.a());
    }

    public static List cz(Map map0) {
        List list0 = new ArrayList();
        for(Object object0: map0.keySet()) {
            String s = (String)object0;
            Collection collection0 = (Collection)map0.get(s);
            if(collection0 != null) {
                NamespaceEntriesRequest namespaceEntriesRequest0 = new NamespaceEntriesRequest();
                namespaceEntriesRequest0.a = s;
                namespaceEntriesRequest0.b = (String[])collection0.toArray(new String[0]);
                list0.add(namespaceEntriesRequest0);
            }
        }
        return list0;
    }

    @Override  // cqxc
    public final evql d(ProvisioningId provisioningId0, byte[] arr_b) {
        azzc azzc0 = new azzc();
        azzc0.a = new cqyd(this, provisioningId0, arr_b);
        azzc0.b = false;
        azzc0.c = new Feature[]{cqwp.b};
        azzc0.d = 0x721B;
        return this.iG(azzc0.a());
    }

    @Override  // cqxc
    public final evql e(ProvisioningId provisioningId0) {
        azzc azzc0 = new azzc();
        azzc0.a = new cqza(this, provisioningId0);
        azzc0.b = false;
        azzc0.c = new Feature[]{cqwp.b};
        azzc0.d = 0x722C;
        return this.iG(azzc0.a());
    }

    @Override  // cqxc
    public final evql f(CryptoSchemeId cryptoSchemeId0, List list0, boolean z) {
        azzc azzc0 = new azzc();
        azzc0.a = new cqyc(this, cryptoSchemeId0, list0, z);
        azzc0.b = false;
        azzc0.c = new Feature[]{cqwp.b};
        azzc0.d = 0x7227;
        return this.iG(azzc0.a());
    }

    @Override  // cqxc
    public final evql g(ProvisioningId provisioningId0) {
        azzc azzc0 = new azzc();
        azzc0.a = new cqyw(this, provisioningId0);
        azzc0.b = false;
        azzc0.c = new Feature[]{cqwp.b};
        azzc0.d = 29205;
        return this.iG(azzc0.a());
    }

    @Override  // cqxc
    public final evql h(ProvisioningId provisioningId0) {
        azzc azzc0 = new azzc();
        azzc0.a = new cqyx(this, provisioningId0);
        azzc0.b = false;
        azzc0.c = new Feature[]{cqwp.b};
        azzc0.d = 29220;
        return this.iG(azzc0.a());
    }

    @Override  // cqxc
    public final evql i(CryptoSchemeId cryptoSchemeId0) {
        azzc azzc0 = new azzc();
        azzc0.a = new cqyp(this, cryptoSchemeId0);
        azzc0.b = false;
        azzc0.c = new Feature[]{cqwp.b};
        azzc0.d = 0x7226;
        return this.iG(azzc0.a());
    }

    @Override  // cqxc
    public final evql j(ProvisioningId provisioningId0, Map map0) {
        List list0 = craf.cz(map0);
        azzc azzc0 = new azzc();
        azzc0.a = new cqzd(this, provisioningId0, list0);
        azzc0.b = false;
        azzc0.c = new Feature[]{cqwp.b};
        azzc0.d = 0x721C;
        return this.iG(azzc0.a());
    }

    @Override  // cqxc
    public final evql k(ProvisioningId provisioningId0) {
        azzc azzc0 = new azzc();
        azzc0.a = new cqyn(this, provisioningId0);
        azzc0.b = false;
        azzc0.c = new Feature[]{cqwp.b};
        azzc0.d = 29208;
        return this.iG(azzc0.a());
    }

    @Override  // cqxc
    public final evql l() {
        azzc azzc0 = new azzc();
        azzc0.a = new cqyr(this);
        azzc0.b = false;
        azzc0.c = new Feature[]{cqwp.b};
        azzc0.d = 0x721D;
        return this.iG(azzc0.a());
    }

    @Override  // cqxc
    public final evql m(MobileDocumentRequest mobileDocumentRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new cqyj(this, mobileDocumentRequest0);
        azzc0.b = false;
        azzc0.c = new Feature[]{cqwp.c};
        azzc0.d = 0x721D;
        return this.iG(azzc0.a());
    }

    @Override  // cqxc
    public final evql n() {
        azzc azzc0 = new azzc();
        azzc0.a = new cqyt(this);
        azzc0.b = false;
        azzc0.c = new Feature[]{cqwp.b};
        azzc0.d = 0x722A;
        return this.iG(azzc0.a());
    }

    @Override  // cqxc
    public final evql o(ProvisioningId provisioningId0, byte[] arr_b) {
        azzc azzc0 = new azzc();
        azzc0.a = new cqzj(this, provisioningId0, arr_b);
        azzc0.b = false;
        azzc0.c = new Feature[]{cqwp.b};
        azzc0.d = 0x7225;
        return this.iG(azzc0.a());
    }

    @Override  // cqxc
    public final evql p(gtxf gtxf0, byte[] arr_b) {
        azzc azzc0 = new azzc();
        azzc0.a = new cqyg(this, arr_b, gtxf0);
        azzc0.b = false;
        azzc0.c = new Feature[]{cqwp.g};
        azzc0.d = 0x7230;
        return this.iG(azzc0.a());
    }

    @Override  // cqxc
    public final evql q(ProvisioningId provisioningId0, byte[] arr_b) {
        azzc azzc0 = new azzc();
        azzc0.a = new cqyu(this, provisioningId0, arr_b);
        azzc0.b = false;
        azzc0.c = new Feature[]{cqwp.b};
        azzc0.d = 29202;
        return this.iG(azzc0.a());
    }

    @Override  // cqxc
    public final evql r(crap crap0) {
        azzc azzc0 = new azzc();
        azzc0.a = new cqzg(this, crap0);
        azzc0.b = false;
        azzc0.c = new Feature[]{cqwp.b};
        azzc0.d = 0x7223;
        return this.iG(azzc0.a());
    }

    @Override  // cqxc
    public final evql s(ProvisioningId provisioningId0, byte[] arr_b) {
        azzc azzc0 = new azzc();
        azzc0.a = new cqzk(this, provisioningId0, arr_b);
        azzc0.b = false;
        azzc0.c = new Feature[]{cqwp.b};
        azzc0.d = 29209;
        return this.iG(azzc0.a());
    }

    @Override  // cqxc
    public final evql t(ProvisioningId provisioningId0, List list0) {
        azzc azzc0 = new azzc();
        azzc0.a = new cqyh(this, provisioningId0, list0);
        azzc0.b = false;
        azzc0.c = new Feature[]{cqwp.b};
        azzc0.d = 29206;
        return this.iG(azzc0.a());
    }

    @Override  // cqxc
    public final evql u(ProvisioningId provisioningId0, byte[] arr_b) {
        azzc azzc0 = new azzc();
        azzc0.a = new cqzc(this, provisioningId0, arr_b);
        azzc0.b = false;
        azzc0.c = new Feature[]{cqwp.b};
        azzc0.d = 29207;
        return this.iG(azzc0.a());
    }

    @Override  // cqxc
    public final evql v(CryptoSchemeId cryptoSchemeId0, List list0) {
        azzc azzc0 = new azzc();
        azzc0.a = new cqzf(this, cryptoSchemeId0, list0);
        azzc0.b = false;
        azzc0.c = new Feature[]{cqwp.b};
        azzc0.d = 0x7228;
        return this.iG(azzc0.a());
    }
}

