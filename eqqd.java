import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.smartdevice.d2d.AdvertisementOptions;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.ui.TargetChimeraActivity;
import java.util.ArrayList;

public final class eqqd extends du {
    public static final baun a;
    public Bundle ag;
    public int ah;
    public final eqpj ai;
    public final eqlq aj;
    public boolean ak;
    public erjb al;
    public bboe am;
    public final long an;
    private Bundle ao;
    private final eqda ap;
    public eqdz b;
    public boolean c;
    public String d;

    static {
        eqqd.a = new erqc(new String[]{"D2D", "UI", "TargetResourcesFragment"});
    }

    public eqqd() {
        this.b = null;
        this.ah = 1;
        this.ai = new eqpj(Looper.getMainLooper());
        this.aj = new eqlq();
        this.an = erqb.a();
        this.ap = new eqqa(this);
    }

    public final void A() {
        if(this.b == null) {
            eqqd.a.o("Invalid connectionless client state.", new Object[0]);
            return;
        }
        this.c = false;
        eqqd.a.j("Disabling target mode.", new Object[0]);
        eqdz eqdz0 = this.b;
        eqdz0.e();
        azzc azzc0 = new azzc();
        azzc0.a = new eqds();
        eqdz0.jn(azzc0.a()).b(new eqpz());
    }

    public static final Bundle B(Bundle bundle0) {
        if(bundle0 == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle1 = new Bundle();
        String s = bundle0.getString("restoreAccount");
        String s1 = bundle0.getString("restoreToken");
        baun baun0 = eqqd.a;
        baun0.j("restoreAccountId: " + s, new Object[0]);
        baun0.j("restoreToken: " + s1, new Object[0]);
        if(TextUtils.isEmpty(s)) {
            baun0.d("Restore account is null or empty.", new Object[0]);
        }
        bundle1.putString("restoreAccount", s);
        bundle1.putString("restoreToken", s1);
        bundle1.putParcelableArrayList("accounts", bundle0.getParcelableArrayList("accounts"));
        return bundle1;
    }

    @Override  // du
    public final void onActivityCreated(Bundle bundle0) {
        super.onActivityCreated(bundle0);
        this.ao = bundle0;
    }

    @Override  // du
    public final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 3) {
            this.al.e(3, v1);
        }
    }

    @Override  // du
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        if(this.am != null) {
            new clht(Looper.getMainLooper()).post(new eqqc(this, context0));
        }
        this.al = new erjb(((xnz)context0), null, this.ao);
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setRetainInstance(true);
        if(bundle0 != null) {
            eqqd.a.d("Activity was destroyed. Unable to recover state", new Object[0]);
            return;
        }
        this.z(this.getContext());
    }

    @Override  // du
    public final void onDestroy() {
        super.onDestroy();
        this.A();
    }

    @Override  // du
    public final void onPause() {
        super.onPause();
        this.al.a();
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        this.al.b();
    }

    @Override  // du
    public final void onSaveInstanceState(Bundle bundle0) {
        this.al.c(bundle0);
    }

    @Override  // du
    public final void onStart() {
        super.onStart();
        this.ai.b(((eqos)this.getContext()));
    }

    @Override  // du
    public final void onStop() {
        super.onStop();
        this.ai.b(null);
    }

    public final void y() {
        this.A();
        this.aj.b(13);
        this.ai.c(0x70, Bundle.EMPTY);
    }

    public final void z(Context context0) {
        if(!this.c) {
            this.b = new eqdz(context0);
            TargetChimeraActivity targetChimeraActivity0 = (TargetChimeraActivity)this.getContext();
            boolean z = targetChimeraActivity0 != null && targetChimeraActivity0.t();
            ArrayList arrayList0 = new ArrayList();
            String s = Build.MODEL;
            AdvertisementOptions advertisementOptions0 = new AdvertisementOptions(0);
            ArrayList arrayList1 = new ArrayList();
            boolean z1 = hyim.a.e().F();
            long v = this.an;
            boolean z2 = hyim.a.e().z();
            boolean z3 = hyim.k();
            epzc epzc0 = new epzc();
            epzc0.c(1, true);
            epzc0.c(3, true);
            epzc0.c(5, hyhe.f());
            epzc0.c(11, bbod.c(hygh.b()));
            epzc0.c(16, true);
            epzc0.c(8, z);
            epzc0.c(9, z);
            if(hygb.e() && targetChimeraActivity0 != null) {
                advertisementOptions0 = new AdvertisementOptions(eqmy.b(targetChimeraActivity0.getApplicationContext()).h);
            }
            BootstrapOptions bootstrapOptions0 = epxk.a((z ? 5 : 4), arrayList0, 0, s, z1, v, z3, z2, epzc0, null, advertisementOptions0, arrayList1);
            eqdz eqdz0 = this.b;
            azzc azzc0 = new azzc();
            azzc0.a = new eqdp(eqdz0, bootstrapOptions0, this.ap);
            evql evql0 = eqdz0.jn(azzc0.a());
            evql0.b(new eqdq(eqdz0));
            evql0.A(new eqpt(this));
            evql0.b(new eqpu(this));
            evql0.z(new eqpv());
            evql evql1 = evql0.e(new eqpw(this));
            evql1.b(new eqpx(this));
            evql1.A(new eqpy());
        }
    }
}

