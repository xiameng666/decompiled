import android.app.Dialog;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.auth.api.phone.IncomingCallRetrieverRequest;
import com.google.android.gms.auth.api.phone.ui.PhoneNumberVerificationUserConsentPromptChimeraActivity;

final class aicb extends ibsl implements ibtw {
    final PhoneNumberVerificationUserConsentPromptChimeraActivity a;
    final String b;
    final IncomingCallRetrieverRequest c;

    public aicb(PhoneNumberVerificationUserConsentPromptChimeraActivity phoneNumberVerificationUserConsentPromptChimeraActivity0, String s, IncomingCallRetrieverRequest incomingCallRetrieverRequest0, ibrl ibrl0) {
        this.a = phoneNumberVerificationUserConsentPromptChimeraActivity0;
        this.b = s;
        this.c = incomingCallRetrieverRequest0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((aicb)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new aicb(this.a, this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        PhoneNumberVerificationUserConsentPromptChimeraActivity phoneNumberVerificationUserConsentPromptChimeraActivity0 = this.a;
        Dialog dialog0 = new Dialog(phoneNumberVerificationUserConsentPromptChimeraActivity0);
        View view0 = phoneNumberVerificationUserConsentPromptChimeraActivity0.getLayoutInflater().inflate(0x7F0E07E5, null);  // layout:pnv_user_consent_activity
        dialog0.setContentView(view0);
        dialog0.setCancelable(true);
        dialog0.setCanceledOnTouchOutside(false);
        CharSequence charSequence0 = this.b;
        dialog0.setOnCancelListener(new aibx(phoneNumberVerificationUserConsentPromptChimeraActivity0, ((String)charSequence0)));
        TextView textView0 = (TextView)view0.findViewById(0x7F0B0FA2);  // id:consent_header
        SpannableString spannableString0 = new SpannableString(charSequence0);
        try {
            CharSequence charSequence1 = bbsr.b(phoneNumberVerificationUserConsentPromptChimeraActivity0).g(((String)charSequence0));
            ibuq.e(charSequence1, "getApplicationLabel(...)");
            charSequence0 = charSequence1;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            ((ggtj)PhoneNumberVerificationUserConsentPromptChimeraActivity.j.i()).B("Cannot find calling package: %s.", charSequence0);
        }
        if(!TextUtils.isEmpty(charSequence0)) {
            String s = phoneNumberVerificationUserConsentPromptChimeraActivity0.getString(0x7F150965, new Object[]{charSequence0});  // string:consent_header_title "Allow %s to confirm the number of an incoming phone 
                                                                                                                                     // call?"
            ibuq.e(s, "getString(...)");
            spannableString0 = new SpannableString(s);
            int v = ibzk.N(s, charSequence0.toString(), 0, false, 6);
            spannableString0.setSpan(new StyleSpan(1), v, charSequence0.length() + v, 33);
        }
        textView0.setText(spannableString0);
        ((Button)view0.findViewById(0x7F0B10E4)).setOnClickListener(new aiby(dialog0));  // id:deny_button
        Button button0 = (Button)view0.findViewById(0x7F0B0B89);  // id:allow_button
        PhoneNumberVerificationUserConsentPromptChimeraActivity phoneNumberVerificationUserConsentPromptChimeraActivity1 = this.a;
        String s1 = this.b;
        button0.setOnClickListener(new aibz(phoneNumberVerificationUserConsentPromptChimeraActivity1, s1, this.c, dialog0));
        Window window0 = dialog0.getWindow();
        if(window0 != null) {
            window0.setBackgroundDrawable(new ColorDrawable(0));
            window0.setDimAmount(0.32f);
        }
        dialog0.show();
        ghwp ghwp0 = aicv.c(s1, ghwo.k);
        phoneNumberVerificationUserConsentPromptChimeraActivity1.l.a(ghwp0);
        return ibom.a;
    }
}

