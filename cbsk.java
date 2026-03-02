import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.TextView;
import com.google.android.setupdesign.GlifLayout;

public final class cbsk extends du {
    public final cbvd a;
    public final ibnn b;
    public static final int c;
    private static final bboh d;

    static {
        cbsk.d = bboh.b("AccountsRemovalFragment", bbcu.ac);
    }

    public cbsk() {
        super(0x7F0E0041);  // layout:accounts_removal
        this.a = new cbvd();
        cbrt cbrt0 = new cbrt(this);
        this.b = new lsd(new ibuk(cbte.class), new cbsd(this), cbrt0, new cbse(this));
    }

    public final void A(gvij gvij0, gvkq gvkq0) {
        ibuq.f(gvij0, "supervisionLog");
        ibuq.f(gvkq0, "eventCode");
        cczb cczb0 = cfvm.v().c(((ProtoLiteMessage)gvij0));
        cczb0.c = (int)gvkq0.er;
        cczb0.a();
    }

    public final void B(TextView textView0) {
        if(this.C(this.requireContext())) {
            textView0.setTypeface(Typeface.DEFAULT, 0);
            textView0.setTextSize(2, 14.0f);
        }
    }

    public final boolean C(Context context0) {
        return hukf.f() && gaec.t(context0);
    }

    public final void D(SpannableStringBuilder spannableStringBuilder0, String s, View.OnClickListener view$OnClickListener0) {
        String s1 = spannableStringBuilder0.toString();
        if(ibzk.G(s1, s)) {
            int v = ibzk.N(s1, s, 0, false, 6);
            int v1 = ibzk.N(s1, s, 0, false, 6) + s.length();
            spannableStringBuilder0.setSpan(new cbsf(view$OnClickListener0), v, v1, 0);
        }
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        String s;
        ibuq.f(view0, "view");
        if(bundle0 == null) {
            gvib gvib0 = gvia.a(((hftr)((ProtoLiteMessage)gvij.a).v_newBuilder()));
            gvhy gvhy0 = gvhx.a(((ProtoLiteMessage)gvhl.a).v_newBuilder());
            Bundle bundle1 = this.getArguments();
            if(bundle1 == null) {
                s = "";
            }
            else {
                s = bundle1.getString("session_id");
                if(s == null) {
                    s = "";
                }
            }
            gvhy0.c(s);
            gvhy0.d(gvkw.T);
            gvhg gvhg0 = gvhf.a(((ProtoLiteMessage)gvhe.a).v_newBuilder());
            gvhg0.b(gvky.bs);
            gvhy0.e(gvhg0.a());
            gvib0.b(gvhy0.a());
            this.A(gvib0.a(), gvkq.au);
        }
        cbrw cbrw0 = (/* MISSING LAMBDA PARAMETER */) -> {
            ((ggtj)cbsk.d.h()).x("Closing Accounts Removal Activity.");
            xob xob0 = xoc.b(this);
            xob0.setResult(-1);
            xob0.finishAndRemoveTask();
        };
        gaff gaff0 = (gaff)this.y().t(gaff.class);
        if(gaff0 != null) {
            gafh gafh0 = gaff0.k;
            if(gafh0 != null) {
                gafh0.f = cbrw0;
            }
        }
        icbb.b(lpt.a(this), null, null, new cbsh(this, view0, null), 3);
        Context context0 = this.requireContext();
        abc abc0 = (context0 instanceof xni) ? ((xni)context0).getOnBackPressedDispatcher() : xoc.b(this).getOnBackPressedDispatcher();
        ibuq.c(abc0);
        abc0.c(this, new cbsj(this));
    }

    public final GlifLayout y() {
        View view0 = this.getView();
        ibuq.d(view0, "null cannot be cast to non-null type com.google.android.setupdesign.GlifLayout");
        return (GlifLayout)view0;
    }

    // Detected as a lambda impl.
    public final void z(int v) {
        ((ggtj)cbsk.d.h()).x("Closing Accounts Removal Activity.");
        xob xob0 = xoc.b(this);
        xob0.setResult(v);
        xob0.finishAndRemoveTask();
    }
}

