import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView.BufferType;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.materialswitch.MaterialSwitch;
import java.util.ArrayList;

public final class atus extends fyfx implements View.OnClickListener {
    public final avjh ag;
    public fyfv ah;
    public String ai;
    public boolean aj;
    public anj ak;
    public ann al;
    public final avij am;
    public atuk an;
    private BottomSheetBehavior ao;
    private final anm ap;

    public atus() {
        this.ag = new avjh("CastTermsOfServiceDialogFragment");
        this.ai = "your Google Cast device";
        this.aj = true;
        this.ap = new atuq(this);
        this.am = avij.e();
    }

    @Override  // de
    public final void onCancel(DialogInterface dialogInterface0) {
        this.ag.m("onCancel");
        this.an.a();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        this.ag.m("onClick");
        int v = view0.getId();
        if(v == 0x7F0B22FF) {  // id:tos_accept_button
            atul atul0 = this.an.a;
            atul0.g = Boolean.valueOf(this.aj);
            atus atus0 = atul0.f;
            if(atus0 != null) {
                if(((Boolean)atul0.e.mr()).booleanValue()) {
                    atus0.dismissNow();
                }
                else {
                    atus0.dismiss();
                }
            }
            atul0.l(5);
            return;
        }
        if(v == 0x7F0B2300) {  // id:tos_cancel_button
            this.an.a();
        }
    }

    @Override  // fyfx
    public final Dialog onCreateDialog(Bundle bundle0) {
        String s1;
        avjh avjh0 = this.ag;
        avjh0.m("onCreateDialog");
        if(this.ak == null) {
            Context context0 = this.getContext();
            batl.s(context0);
            PackageManager packageManager0 = context0.getPackageManager();
            ArrayList arrayList0 = new ArrayList();
            ResolveInfo resolveInfo0 = packageManager0.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
            if(resolveInfo0 != null) {
                String s = resolveInfo0.activityInfo.packageName;
                ArrayList arrayList1 = new ArrayList(arrayList0.size() + 1);
                arrayList1.add(s);
                arrayList0 = arrayList1;
            }
            Intent intent0 = new Intent("android.support.customtabs.action.CustomTabsService");
            for(Object object0: arrayList0) {
                s1 = (String)object0;
                intent0.setPackage(s1);
                if(packageManager0.resolveService(intent0, 0) == null) {
                    continue;
                }
                goto label_23;
            }
            Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
            s1 = null;
        label_23:
            if(s1 == null) {
                avjh0.t("Custom tabs service connection isn\'t supported for this device\'s default browser!");
            }
            else if(!anj.b(context0, s1, this.ap)) {
                avjh0.t("Custom tabs service connection failed!");
            }
        }
        Context context1 = this.getContext();
        batl.s(context1);
        fyfv fyfv0 = new fyfv(context1, 0x7F160C6B);  // style:Theme.GoogleMaterial3.DayNight.BottomSheetDialog
        this.ah = fyfv0;
        fyfv0.setOnShowListener(new atuo(this));
        BottomSheetBehavior bottomSheetBehavior0 = this.ah.a();
        this.ao = bottomSheetBehavior0;
        bottomSheetBehavior0.H(true);
        this.ao.J(0, true);
        this.ao.z = false;
        this.ah.b();
        this.ao.w(new atup(this));
        return this.ah;
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        this.ag.m("onCreateView");
        return layoutInflater0.inflate(0x7F0E01DE, viewGroup0, false);  // layout:cast_terms_of_service_dialog
    }

    @Override  // du
    public final void onDestroy() {
        this.ag.m("onDestroy");
        super.onDestroy();
        if(((Boolean)this.am.f.mr()).booleanValue() && this.getContext() != null) {
            bbic bbic0 = bbic.a();
            Context context0 = this.getContext();
            batl.s(context0);
            bbic0.b(context0, this.ap);
        }
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        this.ag.m("onViewCreated");
        TextView textView0 = (TextView)view0.findViewById(0x7F0B0E75);  // id:cast_terms_of_service_dialog_text_body_0
        TextView textView1 = (TextView)view0.findViewById(0x7F0B0E76);  // id:cast_terms_of_service_dialog_text_body_1
        textView0.setMovementMethod(LinkMovementMethod.getInstance());
        textView1.setMovementMethod(LinkMovementMethod.getInstance());
        textView0.setPaintFlags(textView0.getPaintFlags() & -9);
        textView1.setPaintFlags(textView1.getPaintFlags() & -9);
        ((Button)view0.findViewById(0x7F0B22FF)).setOnClickListener(this);  // id:tos_accept_button
        ((Button)view0.findViewById(0x7F0B2300)).setOnClickListener(this);  // id:tos_cancel_button
        ((MaterialSwitch)view0.findViewById(0x7F0B2301)).setOnCheckedChangeListener(new atun(this));  // id:tos_device_reporting_switch
        textView0.setText(Html.fromHtml(this.getString(0x7F150735, new Object[]{this.ai}), 0x3F));  // string:cast_terms_of_service_dialog_text_body_0 "You can cast media from mobile 
                                                                                                    // apps to <b>%1$s</b>. Your use of Google Cast is subject to the Google Terms of Service. 
                                                                                                    // The Google Privacy Policy describes how your data is handled by Cast.<br><br>To 
                                                                                                    // learn more about how Google protects your privacy, go to g.co/cast/privacy."
        String s = textView0.getText().toString();
        SpannableString spannableString0 = new SpannableString(textView0.getText());
        String s1 = textView1.getText().toString();
        SpannableString spannableString1 = new SpannableString(textView1.getText());
        this.y("https://policies.google.com/terms", "Google Terms of Service", s, spannableString0);
        this.y("https://policies.google.com/privacy", "Google Privacy Policy", s, spannableString0);
        this.y("https://support.google.com/chromecast/answer/9001232", "g.co/cast/privacy", s, spannableString0);
        this.y("https://myaccount.google.com", "myaccount.google.com", s1, spannableString1);
        textView0.setText(spannableString0, TextView.BufferType.SPANNABLE);
        textView1.setText(spannableString1, TextView.BufferType.SPANNABLE);
    }

    private final void y(String s, String s1, String s2, SpannableString spannableString0) {
        atur atur0 = new atur(this, s);
        int v = s2.indexOf(s1);
        int v1 = s1.length() + v;
        if(avij.e().y() && (v < 0 || v > v1)) {
            this.ag.t("Failed to generate ToS TextView! Could not find the appropriate substring to add a hyperlink to.");
            return;
        }
        spannableString0.setSpan(atur0, v, v1, 33);
    }
}

