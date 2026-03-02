import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.util.concurrent.CountDownLatch;

public final class fdds extends fdal {
    public fddr ag;
    public NestedScrollView ah;
    final ViewTreeObserver.OnGlobalLayoutListener ai;
    public static final int aj;
    private static final baun ak;
    public fded d;

    static {
        fdds.ak = new baun("wearable.Consents", new String[0]);
    }

    public fdds() {
        this.ai = new fddn(this);
    }

    static int B(Bundle bundle0) {
        if(bundle0 == null) {
            return 0;
        }
        return bundle0.getInt("terms_context", 0) == 1 ? 1 : 0;
    }

    @Override  // fdal
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.d = new fded(new fdab(), new fczx(), ((gful_cronetEngineProvider)new fddm(this)), fcfo.d(this.requireContext()));
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        gged_interceptors gged0;
        fdds.ak.h("[TOS] onCreateView", new Object[0]);
        this.A(bundle0);
        int v = fdds.B(this.getArguments());
        if(bundle0 != null) {
            fded fded0 = this.d;
            byte[] arr_b = bundle0.getByteArray("TosOptedTerms");
            if(arr_b != null) {
                try {
                    hftc hftc0 = hftc.a();
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ffco.a), arr_b, 0, arr_b.length, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    fded0.b.e(((ffco)hftv0));
                }
                catch(hfur hfur0) {
                    fded.a.g("Failed to parse consent from bundle", hfur0, new Object[0]);
                }
            }
        }
        View view0 = fczo.c(this.b.a, layoutInflater0).inflate((fczo.i(this.b.a) ? 0x7F0E0EBB : 0x7F0E0EBF), viewGroup0, false);  // layout:wearable_expressive_tos_fragment
        this.ah = (NestedScrollView)view0.findViewById(0x7F0B2252);  // id:terms_of_service_scroll_container
        RecyclerView recyclerView0 = (RecyclerView)view0.findViewById(0x7F0B2251);  // id:terms_of_service_list
        view0.getContext();
        recyclerView0.ap(new LinearLayoutManager());
        Button button0 = (Button)view0.findViewById(0x7F0B224A);  // id:terms_of_service_accept_button
        Button button1 = (Button)view0.findViewById(0x7F0B224B);  // id:terms_of_service_decline_button
        if(viewGroup0 != null) {
            fded fded1 = this.d;
            Context context0 = viewGroup0.getContext();
            boolean z = this.c;
            fdan fdan0 = this.b;
            boolean z1 = fded1.b(context0, fdan0);
            fded.a.d("getAdapter: isLeDevice=%s showBackupConsent=%b", new Object[]{Boolean.valueOf(z), Boolean.valueOf(z1)});
            if(v == 0) {
                ggdy ggdy0 = new ggdy();
                fddf[] arr_fddf = new fddf[3];
                int v1 = fddg.b(fdcm.a(context0), z);
                fdde fdde1 = fddf.a();
                fdde1.c(v1);
                fdde1.d(false);
                fdde1.e(0);
                arr_fddf[0] = fdde1.a();
                arr_fddf[1] = fddj.c();
                arr_fddf[2] = fddj.b();
                ggdy0.j(arr_fddf);
                if(z1) {
                    ggdy0.i(fddj.a());
                }
                ggdy0.i(fddj.d());
                gged0 = ggdy0.h();
            }
            else {
                fdde fdde0 = fddf.a();
                fdde0.c(0x7F152FBF);  // string:supervised_tos_description "By continuing, you agree to the Google <a href=https://policies.google.com/terms>Terms 
                                      // of Service</a> and the terms below on your own behalf and on behalf of your child.<br/>Note: 
                                      // The <a href=https://policies.google.com/privacy>Google Privacy Policy</a> describes 
                                      // how data is handled in this service."
                fdde0.d(false);
                fdde0.e(0);
                gged0 = gged_interceptors.o(fdde0.a(), fddj.c(), fddj.b(), fddj.d());
            }
            if(!z1) {
                fded1.b.f(fdcn.d, false);
            }
            if(z) {
                fded1.b.f(fdcn.b, false);
            }
            fddk fddk0 = new fddk(fded1.b, null, fdan0, context0);
            fddk0.f(gged0);
            recyclerView0.an(fddk0);
            fded fded2 = this.d;
            Context context1 = viewGroup0.getContext();
            hzti hzti0 = hzti.a;
            if(hzti0.b().b()) {
                evqp evqp0 = new evqp();
                fczw fczw0 = new fczw(context1, evqp0);
                fded2.c.a.execute(fczw0);
                long v2 = hzti0.b().a();
                CountDownLatch countDownLatch0 = new CountDownLatch(1);
                fczu fczu0 = new fczu(countDownLatch0);
                evqp0.a.z(fczu0);
                new bblp(1, 9).execute(new fczv(countDownLatch0, v2, evqp0));
                fded2.g = evqp0.a;
            }
        }
        LinearLayout linearLayout0 = (LinearLayout)view0.findViewById(0x7F0B1649);  // id:header
        fczo.h(linearLayout0, this.b.a, new TextView[]{((TextView)linearLayout0.findViewById(0x7F0B2253))});  // id:terms_of_service_title
        fddr fddr0 = new fddr(this, this.ah, button0, bundle0, v);
        this.ag = fddr0;
        fddr0.a.e = fddr0;
        fddo fddo0 = new fddo(fddr0);
        fddr0.b.setOnClickListener(fddo0);
        fddr0.b();
        button1.setOnClickListener(new fddl(this));
        return view0;
    }

    @Override  // du
    public final void onSaveInstanceState(Bundle bundle0) {
        bundle0.putByteArray("TosOptedTerms", this.d.b.b().toBytesArray());
        if(this.ag != null && this.ag.d) {
            bundle0.putBoolean("has_scrolled_to_bottom", true);
        }
    }

    @Override  // du
    public final void onStart() {
        super.onStart();
        this.ah.getViewTreeObserver().addOnGlobalLayoutListener(this.ai);
    }

    @Override  // du
    public final void onStop() {
        this.ah.getViewTreeObserver().removeOnGlobalLayoutListener(this.ai);
        super.onStop();
    }
}

