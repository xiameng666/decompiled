import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.owners.ParcelableDeviceOwner;
import com.google.android.gms.smartdevice.directtransfer.AccountPickerOptions;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class eqqo extends eqqh implements eqnv, eqos, erlp, erlq {
    public static final erqc ah;
    public ProtoLiteBuilder ai;
    private int aj;
    private Future ak;
    private gfsx al;
    private gfsx am;
    private final foeg an;
    private ArrayList ao;
    private eqnw ap;

    static {
        eqqo.ah = new erqc(new String[]{"CustomAccountPickerFragment"});
    }

    public eqqo() {
        this.al = gfqx.a;
        this.am = gfqx.a;
        this.an = fofa.a();
    }

    @Override  // erlq
    public final void A(int v) {
    }

    @Override  // erlq
    public final void C() {
        eqqo.ah.j("onScreenLockFailed", new Object[0]);
        erlq erlq0 = this.L();
        if(erlq0 != null) {
            erlq0.C();
        }
        if(!hyfy.a.b().a()) {
            this.M(this.ao);
        }
    }

    @Override  // erlq
    public final void D() {
        eqqo.ah.j("onScreenLockSkipped", new Object[0]);
        erlq erlq0 = this.L();
        if(erlq0 != null) {
            erlq0.D();
        }
    }

    @Override  // erlq
    public final void E() {
        eqqo.ah.j("onScreenUnlocked", new Object[0]);
        erlq erlq0 = this.L();
        if(erlq0 != null) {
            erlq0.E();
        }
        this.M(this.ao);
    }

    @Override  // erlp
    public final void F(int v) {
        eqqo.ah.j("onScreenUnlocked(authType)", new Object[0]);
        Context context0 = this.getContext();
        erlp erlp0 = (context0 instanceof erlp) ? ((erlp)context0) : null;
        if(erlp0 != null) {
            erlp0.F(v);
        }
        this.M(this.ao);
    }

    final du H(int v) {
        boolean z = true;
        switch(v) {
            case 0: {
                eqqr eqqr0 = new eqqr();
                eqqr0.d = (ParcelableDeviceOwner)this.am.d();
                eqqr0.b = this.G();
                eqqr0.c = this.z();
                eqqr0.a = this.b;
                eqqr0.e = 2011;
                eqqr0.f = 2012;
                if(((ArrayList)this.al.d()).size() <= 1) {
                    z = false;
                }
                eqqr0.g = z;
                eqqr0.h = this.ag;
                AccountPickerOptions accountPickerOptions0 = this.a;
                if(accountPickerOptions0.d) {
                    if(accountPickerOptions0.h) {
                        eqqr0.e(this.getString(0x7F1507F2), 0x7DF);  // string:common_cancel "Cancel"
                        return eqqr0.f();
                    }
                    eqqr0.e(this.getString(0x7F1508E0), 2010);  // string:common_skip "Skip"
                }
                return eqqr0.f();
            }
            case 1: {
                eqqe eqqe0 = new eqqe();
                eqqe0.b = this.G();
                eqqe0.c = this.z();
                eqqe0.d = (ArrayList)this.al.d();
                eqqe0.e = 2014;
                eqqe0.a = this.b;
                eqqe0.f = this.ag;
                if(hyfy.c()) {
                    AccountPickerOptions accountPickerOptions1 = this.a;
                    if(accountPickerOptions1.d) {
                        if(accountPickerOptions1.h) {
                            eqqe0.e(this.getString(0x7F1507F2), 0x7DF);  // string:common_cancel "Cancel"
                            return eqqe0.f();
                        }
                        eqqe0.e(this.getString(0x7F1508E0), 2010);  // string:common_skip "Skip"
                        return eqqe0.f();
                    }
                }
                eqqe0.e(this.getString(0x7F1507EB), 2013);  // string:common_back "Back"
                return eqqe0.f();
            }
            default: {
                throw new IllegalArgumentException("Unknown fragment state: " + v);
            }
        }
    }

    public final void I(ArrayList arrayList0) {
        this.al = gfsx.m(arrayList0);
        Context context0 = this.getContext();
        batl.s(context0);
        ArrayList arrayList1 = (ArrayList)this.al.d();
        int v = arrayList1.size();
        for(int v1 = 0; true; ++v1) {
            boolean z = true;
            if(v1 >= v) {
                break;
            }
            ParcelableDeviceOwner parcelableDeviceOwner0 = (ParcelableDeviceOwner)arrayList1.get(v1);
            AccountPickerOptions accountPickerOptions0 = this.a;
            String s = parcelableDeviceOwner0.a;
            if(!accountPickerOptions0.f && bbmn.w(context0, s)) {
                z = false;
            }
            else if(!accountPickerOptions0.g && s.endsWith("@google.com")) {
                z = false;
            }
            parcelableDeviceOwner0.f = z;
        }
        try {
            String s1 = (String)((gfsx)this.ak.get(100L, TimeUnit.MILLISECONDS)).g();
            this.am = gggq.c(((Iterable)this.al.d()), new eqqj(s1));
        }
        catch(TimeoutException | ExecutionException | InterruptedException exception0) {
            eqqo.ah.n("Getting default account name failed, falling back to first account", exception0, new Object[0]);
        }
        if(!this.am.i()) {
            this.am = gfsx.m(((ParcelableDeviceOwner)((ArrayList)this.al.d()).get(0)));
        }
        if(!((ParcelableDeviceOwner)this.am.d()).f) {
            gfsx gfsx0 = gggq.c(((Iterable)this.al.d()), new eqqk());
            if(gfsx0.i()) {
                this.am = gfsx0;
                goto label_33;
            }
            this.y().s(1, Bundle.EMPTY);
            return;
        }
    label_33:
        this.J(this.H(this.aj));
    }

    final void J(du du0) {
        this.K(du0, 0, 0);
    }

    final void K(du du0, int v, int v1) {
        xnz xnz0 = (xnz)this.getContext();
        if(xnz0 != null && !xnz0.isFinishing()) {
            fm fm0 = this.getChildFragmentManager();
            if(!fm0.au()) {
                ca ca0 = new ca(fm0);
                if(v != 0 || v1 != 0) {
                    ca0.I(v, v1);
                }
                ca0.z(0x7F0B14C5, du0, "cap_fragment_tag");  // id:fragment_container
                ca0.a();
                return;
            }
            eqqo.ah.m("startFragment called after state is already saved", new Object[0]);
            return;
        }
        eqqo.ah.m("startFragment called when activity is finishing", new Object[0]);
    }

    private final erlq L() {
        Context context0 = this.getContext();
        return (context0 instanceof erlq) ? ((erlq)context0) : null;
    }

    private final void M(ArrayList arrayList0) {
        eqqi eqqi0 = this.y();
        if(eqqi0 != null) {
            eqqo.ah.j("Sending account picker logs", new Object[0]);
            Bundle bundle0 = new Bundle();
            bundle0.putByteArray("accountPickerInfo", ((gjoh)this.ai.N_build()).toBytesArray());
            eqqi0.s(2, bundle0);
        }
        this.y().u(arrayList0);
    }

    private final void N(ArrayList arrayList0) {
        xnz xnz0 = (xnz)this.getContext();
        if(xnz0 != null && !xnz0.isFinishing()) {
            this.ao = arrayList0;
            ca ca0 = new ca(this.getChildFragmentManager());
            ca0.u(0x7F0B14C5, erlf.y(), "lockscreen_fragment_tag");  // id:fragment_container
            ca0.a();
            return;
        }
        eqqo.ah.m("showLockScreenFragment called when activity is finishing", new Object[0]);
    }

    @Override  // eqos
    public final void c(int v, Bundle bundle0) {
        erqc erqc0 = eqqo.ah;
        erqc0.d("onAction, actionId: %d", new Object[]{v});
        switch(v) {
            case 2010: {
                this.y().t();
                return;
            }
            case 2011: {
                if(this.am.i()) {
                    ProtoLiteBuilder hftp0 = this.ai;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gjoh gjoh0 = (gjoh)hftp0.b_message;
                    gjoh0.b |= 4;
                    gjoh0.e = true;
                    Context context0 = this.getContext();
                    gftb.check(context0);
                    if(!erlr.A(context0) && !this.d) {
                        this.N(ggia.d(new BootstrapAccount[]{((ParcelableDeviceOwner)this.am.d()).a()}));
                        return;
                    }
                    this.M(ggia.d(new BootstrapAccount[]{((ParcelableDeviceOwner)this.am.d()).a()}));
                    return;
                }
                erqc0.f("ACTION_CHOOSE_DEFAULT_ACCOUNT occurred with null default owner", new Object[0]);
                return;
            }
            case 2012: {
                ProtoLiteBuilder hftp1 = this.ai;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gjoh gjoh1 = (gjoh)hftp1.b_message;
                gjoh1.b |= 4;
                gjoh1.e = false;
                this.aj = 1;
                this.K(this.H(1), 0x7F0100C2, 0x7F0100C3);  // anim:slide_next_in
                return;
            }
            case 2013: {
                this.aj = 0;
                this.K(this.H(0), 0x7F0100B8, 0x7F0100B9);  // anim:slide_back_in
                return;
            }
            case 2014: {
                ArrayList arrayList0 = bauc.e(bundle0, "selectedAccounts", BootstrapAccount.CREATOR);
                if(arrayList0 != null) {
                    Context context1 = this.getContext();
                    gftb.check(context1);
                    if(!erlr.A(context1) && !this.d) {
                        this.N(arrayList0);
                        return;
                    }
                    this.M(arrayList0);
                    return;
                }
                erqc0.f("ACTION_ACCOUNT_SELECTED occurred with null accounts list", new Object[0]);
                return;
            }
            case 0x7DF: {
                this.y().r();
                return;
            }
            default: {
                throw new IllegalArgumentException("Unknown action: " + v);
            }
        }
    }

    @Override  // erlq
    public final void kF() {
        eqqo.ah.j("onPrepareScreenLock", new Object[0]);
        erlq erlq0 = this.L();
        if(erlq0 != null) {
            erlq0.kF();
        }
    }

    @Override  // eqqh
    public final void onCreate(Bundle bundle0) {
        eqqo.ah.d("onCreate()", new Object[0]);
        super.onCreate(bundle0);
        this.ap = new eqnw(this.an);
        this.ak = new bblp(1, 10).e(new eqql(this));
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjoh.a).v_newBuilder();
        boolean z = this.a.h;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjoh gjoh0 = (gjoh)hftp0.b_message;
        gjoh0.b |= 8;
        gjoh0.f = z;
        this.ai = hftp0;
        this.aj = 0;
        if(bundle0 != null) {
            this.aj = bundle0.getInt("state", 0);
            this.al = gfsx.l(bundle0.getParcelableArrayList("owners"));
            this.am = gfsx.l(((ParcelableDeviceOwner)bundle0.getParcelable("defaultOwner")));
        }
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        return layoutInflater0.inflate(0x7F0E09E1, viewGroup0, false);  // layout:smartdevice_fragment_container
    }

    @Override  // du
    public final void onSaveInstanceState(Bundle bundle0) {
        bundle0.putInt("state", this.aj);
        bundle0.putParcelableArrayList("owners", ((ArrayList)this.al.g()));
        bundle0.putParcelable("defaultOwner", ((Parcelable)this.am.g()));
    }

    @Override  // du
    public final void onStart() {
        super.onStart();
        erqc erqc0 = eqqo.ah;
        erqc0.j("onStart()", new Object[0]);
        if(!this.al.i()) {
            eqnw eqnw0 = this.ap;
            eqnw0.c = this;
            gmbu.t(glzd.g(gmbt.h(eqnw0.a.c()), new eqnq(eqnw0), eqnw0.b), new eqnu(eqnw0), eqnw0.b);
            return;
        }
        if((this.getChildFragmentManager().h("lockscreen_fragment_tag") instanceof erlr)) {
            erqc0.m("onStart called with LockScreenFragment shown, ignored", new Object[0]);
            return;
        }
        this.J(this.H(this.aj));
    }

    @Override  // du
    public final void onStop() {
        super.onStop();
        eqqo.ah.j("onStop()", new Object[0]);
        eqnw eqnw0 = this.ap;
        if(eqnw0 != null) {
            eqnw0.c = null;
        }
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        eqqo.ah.d("onViewCreated()", new Object[0]);
        ProtoLiteBuilder hftp0 = this.ai;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjoh gjoh0 = (gjoh)hftp0.b_message;
        gjoh0.b |= 1;
        gjoh0.c = true;
    }
}

