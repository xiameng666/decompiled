import android.app.AlertDialog.Builder;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Spannable.Factory;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.mobiledataplan.MdpUpsellPlan;
import com.google.android.gms.mobiledataplan.ui.PurchaseDialogFragment.URLSpanMediumNoUnderline;

public final class csep extends de {
    public static final Typeface ag;
    public static final bboh ah;
    public View.OnClickListener ai;
    public View.OnClickListener aj;
    public Context ak;
    public MdpUpsellPlan al;
    public csdj am;
    public String an;
    public Button ao;
    public Button ap;

    static {
        csep.ag = Typeface.create("sans-serif-medium", 0);
        csep.ah = bboh.b("MobileDataPlan", bbcu.ck);
    }

    @Override  // de
    public final Dialog onCreateDialog(Bundle bundle0) {
        Context context0 = this.requireContext();
        AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(context0, 0x7F16050B);  // style:MdpPurchaseDialog
        String s = this.am.x == null ? hvko.y() : this.am.x;
        Spanned spanned0 = csly.f((this.al.j + " "), s);
        Spanned spanned1 = csly.e((TextUtils.isEmpty(this.am.w) ? hvko.z() : this.am.w));
        if(hvly.a.c().n()) {
            View view0 = ((xob)context0).getLayoutInflater().inflate(0x7F0E0830, null);  // layout:purchase_dialog_fragment
            TextView textView0 = (TextView)view0.findViewById(0x7F0B22CE);  // id:title_text_static
            TextView textView1 = (TextView)view0.findViewById(0x7F0B1D05);  // id:price_text_static
            textView1.setTextColor(this.ak.getColor(0x7F0606CA));  // color:google_blue_500
            textView0.setText(this.al.b);
            textView1.setText(this.an);
            TextView textView2 = (TextView)view0.findViewById(0x7F0B1D13);  // id:primary_text_static
            if(textView2 != null) {
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
                textView2.setText(csep.y(spanned0));
            }
            TextView textView3 = (TextView)view0.findViewById(0x7F0B1F6C);  // id:secondary_text_static
            if(textView3 != null) {
                textView3.setMovementMethod(LinkMovementMethod.getInstance());
                textView3.setText(csep.y(spanned1));
            }
            alertDialog$Builder0.setView(view0);
        }
        else {
            RecyclerView recyclerView0 = new RecyclerView(this.ak);
            recyclerView0.ap(new LinearLayoutManager());
            csee csee0 = new csee();
            recyclerView0.an(csee0);
            csee0.H(new csko(this.al.b, this.an, 0x7F0606CA));  // color:google_blue_500
            csee0.H(new cskn(spanned0, spanned1));
            alertDialog$Builder0.setView(recyclerView0);
        }
        alertDialog$Builder0.setPositiveButton(0x7F152658, null);  // string:purchase_dialog_buy "Buy"
        alertDialog$Builder0.setNegativeButton(0x7F150DB0, null);  // string:dialog_cancel "@com.google.android.gms:string/common_cancel"
        Dialog dialog0 = alertDialog$Builder0.create();
        ((AlertDialog)dialog0).setOnShowListener(new cseo(this, ((AlertDialog)dialog0), context0));
        return dialog0;
    }

    @Override  // de
    public final void show(fm fm0, String s) {
        try {
            super.show(fm0, s);
        }
        catch(IllegalStateException unused_ex) {
        }
    }

    private static Spannable y(Spanned spanned0) {
        Spannable spannable0 = Spannable.Factory.getInstance().newSpannable(spanned0);
        URLSpan[] arr_uRLSpan = (URLSpan[])spannable0.getSpans(0, spannable0.length(), URLSpan.class);
        for(int v = 0; v < arr_uRLSpan.length; ++v) {
            URLSpan uRLSpan0 = arr_uRLSpan[v];
            int v1 = spannable0.getSpanStart(uRLSpan0);
            int v2 = spannable0.getSpanEnd(uRLSpan0);
            spannable0.removeSpan(uRLSpan0);
            spannable0.setSpan(new PurchaseDialogFragment.URLSpanMediumNoUnderline(uRLSpan0.getURL()), v1, v2, 0);
        }
        return spannable0;
    }
}

