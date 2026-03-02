import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class ekit extends du {
    public static boolean a;
    ekjl ag;
    ekih ah;
    public lqd ai;
    public lqd aj;
    public bxox ak;
    public ejze al;
    fyxp am;
    ekiz an;
    private String ao;
    private Button ap;
    private lqd aq;
    private lqd ar;
    private SwipeRefreshLayout as;
    Account b;
    ejyv c;
    public ekjq d;

    final void A() {
        this.d.b.l(Integer.valueOf(1));
    }

    // Detected as a lambda impl.
    final void B() {
        List list0;
        this.al.r(21, this.c.g(), this.c.c, ekit.a);
        boolean z = true;
        if(ekit.a) {
            ekih ekih0 = this.ah;
            list0 = new ArrayList();
            for(Object object0: ekih0.i) {
                String s = Long.toString(((ejyy)object0).b.longValue());
                if(ekih0.g.contains(s)) {
                    list0.add(ekih0.a.e(s));
                }
            }
            if(list0.size() == this.ah.b() - 1) {
                z = false;
            }
        }
        else {
            list0 = this.ag.f();
            if(list0.size() == this.ag.b() - 1) {
                z = false;
            }
        }
        if(z) {
            this.al.r(16, this.c.g(), this.c.c, ekit.a);
        }
        this.d.i(list0);
        this.d.g();
    }

    final void C(boolean z) {
        this.as.k(z);
        if(!z) {
            this.as.setEnabled(false);
        }
    }

    final void D() {
        Toast.makeText(this.getContext(), 0x7F1528C1, 0).show();  // string:romanesco_restore_key_recovery_explanation_unknown_error "Could not retrieve 
                                                                  // contacts to restore at this time"
    }

    public final void E(String s, ejyy ejyy0, String s1, int v) {
        aqfl aqfl0 = ejyy0.k;
        if(ejyy.a(aqfl0)) {
            this.ao = s1;
            this.startActivityForResult(asda.a(this.getContext(), new Account(s, "com.google"), aqfl0.toBytesArray()), v);
        }
    }

    public final void F() {
        if(ekmu.d(this.getContext().getApplicationContext())) {
            if(this.am != null && this.am.l()) {
                this.am.e();
            }
            return;
        }
        this.z(false);
    }

    final void G(boolean z) {
        if(!ekmu.d(this.getContext().getApplicationContext())) {
            this.ap.setEnabled(false);
            this.al.d("CRF.disable_with_dconnection_loss.");
            fyxp fyxp0 = fyxp.s(this.getView(), 0x7F1528C2, 0);  // string:romanesco_restore_no_connection "Check connection and try again"
            this.am = fyxp0;
            fyxp0.i();
            return;
        }
        if(this.am != null && this.am.l()) {
            this.am.e();
        }
        this.ap.setEnabled(z);
    }

    final void H() {
        fyxp.s(((xob)this.getContext()).findViewById(0x1020002), 0x7F1508E3, 0).i();  // string:common_something_went_wrong "Something went wrong"
    }

    @Override  // du
    public final void onActivityCreated(Bundle bundle0) {
        super.onActivityCreated(bundle0);
        ekjq ekjq0 = (ekjq)new lso(((xob)this.getContext()), this.y()).a(ekjq.class);
        this.d = ekjq0;
        Objects.requireNonNull(ekjq0.g);
        ekjn ekjn0 = new ekjn(ekjq0.g);
        lqd lqd0 = lsa.c(ekjq0.a, ekjn0);
        this.ar = lqd0;
        lqd0.g(this, new ekin(this));
        ekmc ekmc0 = this.d.a;
        eghw eghw0 = this.d.g;
        Objects.requireNonNull(eghw0);
        lqd lqd1 = lsa.c(ekmc0, new ekjp(eghw0));
        this.aq = lqd1;
        if(ekit.a) {
            ekih ekih0 = this.ah;
            Objects.requireNonNull(ekih0);
            lqd1.g(this, new ekio(ekih0));
            lqd lqd2 = this.d.c();
            this.aj = lqd2;
            ekih ekih1 = this.ah;
            Objects.requireNonNull(ekih1);
            lqd2.g(this, new ekip(ekih1));
            return;
        }
        ekjl ekjl0 = this.ag;
        Objects.requireNonNull(ekjl0);
        lqd1.g(this, new ekiq(ekjl0));
        lqd lqd3 = this.d.b();
        this.ai = lqd3;
        ekjl ekjl1 = this.ag;
        Objects.requireNonNull(ekjl1);
        lqd3.g(this, new ekir(ekjl1));
    }

    @Override  // du
    public final void onActivityResult(int v, int v1, Intent intent0) {
        aqfl aqfl0;
        int v2;
        super.onActivityResult(v, v1, intent0);
        if(v == 1) {
            if(v1 == -1 && intent0 != null) {
                String s = intent0.getStringExtra("authAccount");
                if(!bbqr.d(s)) {
                    ekjq ekjq0 = this.d;
                    ekjq0.c.t(s);
                    ekjq0.a.o();
                }
                v1 = -1;
                goto label_54;
            }
            return;
        }
        else {
            switch(v) {
                case 3: 
                case 4: {
                    v2 = v;
                    break;
                }
                case 5: {
                    v2 = 5;
                    break;
                }
                default: {
                    goto label_54;
                }
            }
            switch(v1) {
                case -1: {
                    this.al.p(3);
                    this.C(true);
                    String s1 = this.c.i();
                    ekiz ekiz0 = this.an;
                    Context context0 = this.getContext();
                    byte[] arr_b = this.ah.f().k.toBytesArray();
                    ekif ekif0 = this.ah.k;
                    String s2 = this.ao;
                    aqgg aqgg0 = new aqgg(this.getContext());
                    ejyn ejyn0 = new ejyn(this.getContext());
                    try {
                        hftc hftc0 = hftc.a();
                        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)aqfl.a), arr_b, 0, arr_b.length, hftc0);
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        aqfl0 = (aqfl)hftv0;
                    }
                    catch(hfur unused_ex) {
                        ekiz0.a.C(false);
                        Log.e("ContactsGmsRestore", "Exception while parsing device");
                        ekiz0.a.C(false);
                        ekiz0.a.D();
                        break;
                    }
                    evqp evqp0 = new evqp();
                    ekiu ekiu0 = new ekiu(context0, s1, evqp0);
                    ekiz0.d.execute(ekiu0);
                    ekiv ekiv0 = new ekiv(aqgg0, aqfl0);
                    evql evql0 = evqp0.a.g(ekiv0).g(new ekiw(ejyn0, s1, aqfl0));
                    evql0.b(new ekix(ekiz0, aqfl0, ekif0, s2, v2));
                    evql0.A(new ekiy(ekiz0));
                    break;
                }
                case 0: {
                    this.al.p(4);
                    break;
                }
                case 1: {
                    this.al.p(5);
                    Toast.makeText(this.getContext(), 0x7F1528BF, 0).show();  // string:romanesco_restore_key_recovery_explanation_permanent_error "Too many unlock 
                                                                              // attempts, the device is now permanently locked"
                    break;
                }
                default: {
                    Log.e("ContactsRestoreFragment", "KeyRecoveryLockScreenActivity returned unknown result!");
                    this.al.p(6);
                    this.D();
                }
            }
            v = v2;
        }
    label_54:
        super.onActivityResult(v, v1, intent0);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E07B9, viewGroup0, false);  // layout:people_contacts_import_screen
        Context context0 = this.getContext().getApplicationContext();
        if(this.c == null) {
            this.c = ejyv.d(context0);
        }
        RecyclerView recyclerView0 = (RecyclerView)view0.findViewById(0x7F0B1E1F);  // id:recycler_list
        this.al = ejze.a();
        ekjq ekjq0 = (ekjq)new lso(((xob)this.getContext()), this.y()).a(ekjq.class);
        this.d = ekjq0;
        boolean z = ekjq0.j();
        ekit.a = z;
        if(z) {
            ekih ekih0 = new ekih(context0, this, this.c);
            this.ah = ekih0;
            recyclerView0.an(ekih0);
            if(this.an == null) {
                this.an = ekiz.a(this, this.ah, this.al);
            }
        }
        else {
            ekjl ekjl0 = new ekjl(context0, this, this.c);
            this.ag = ekjl0;
            recyclerView0.an(ekjl0);
        }
        recyclerView0.ap(new LinearLayoutManager());
        SwipeRefreshLayout swipeRefreshLayout0 = (SwipeRefreshLayout)view0.findViewById(0x7F0B1E6F);  // id:restore_source_swipe_layout
        this.as = swipeRefreshLayout0;
        swipeRefreshLayout0.a = new ekis(this);
        this.C(true);
        Button button0 = (Button)view0.findViewById(0x7F0B0DFD);  // id:cancel_button
        this.ap = (Button)view0.findViewById(0x7F0B1E68);  // id:restore_button
        view0.findViewById(0x7F0B19BA).getBackground().mutate().setAlpha(0xF4);  // id:navi_bar
        button0.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
            xob xob0 = (xob)this.getContext();
            if(xob0 != null) {
                xob0.setResult((false ? -1 : 0));
                xob0.finish();
            }
        });
        if(ekit.a) {
            this.ap.setOnClickListener(new ekik(this));
        }
        else if(hxuf.a.b().e()) {
            this.ap.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
                List list0;
                this.al.r(21, this.c.g(), this.c.c, ekit.a);
                boolean z = true;
                if(ekit.a) {
                    ekih ekih0 = this.ah;
                    list0 = new ArrayList();
                    for(Object object0: ekih0.i) {
                        String s = Long.toString(((ejyy)object0).b.longValue());
                        if(ekih0.g.contains(s)) {
                            list0.add(ekih0.a.e(s));
                        }
                    }
                    if(list0.size() == this.ah.b() - 1) {
                        z = false;
                    }
                }
                else {
                    list0 = this.ag.f();
                    if(list0.size() == this.ag.b() - 1) {
                        z = false;
                    }
                }
                if(z) {
                    this.al.r(16, this.c.g(), this.c.c, ekit.a);
                }
                this.d.i(list0);
                this.d.g();
            });
        }
        else {
            this.ap.setOnClickListener(new ekim(this));
        }
        this.al.r(19, this.c.g(), this.c.c, ekit.a);
        return view0;
    }

    @Override  // du
    public final void onDestroyView() {
        super.onDestroyView();
        if(ekit.a) {
            this.aj.k(this);
            this.aj = null;
        }
        else {
            this.ai.k(this);
            this.ai = null;
        }
        this.ar.k(this);
        this.ar = null;
        this.aq.k(this);
        this.aq = null;
    }

    final ekjr y() {
        return ekjr.d(this.getContext());
    }

    // Detected as a lambda impl.
    final void z(boolean z) {
        xob xob0 = (xob)this.getContext();
        if(xob0 != null) {
            xob0.setResult((z ? -1 : 0));
            xob0.finish();
        }
    }
}

