package com.android.settingslib.widget;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import java.net.URISyntaxException;
import oij;
import sjx;
import sjy;
import skm;

public class FooterPreference extends Preference implements sjy, skm {
    View.OnClickListener a;
    int b;
    private CharSequence c;
    private CharSequence d;
    private FooterPreference.FooterLearnMoreSpan e;

    public FooterPreference(Context context0) {
        this(context0, null);
    }

    public FooterPreference(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0, 0x7F040567);  // attr:footerPreferenceStyle
        this.b = 0;
        this.C = 0x7F0E07F5;  // layout:preference_footer
        if(this.q() == null) {
            this.I(0x7F080EA1);  // drawable:settingslib_ic_info_outline_24
        }
        this.M(0x7FFFFFFE);
        if(TextUtils.isEmpty(this.s)) {
            this.L("footer_preference");
        }
        this.N(false);
    }

    @Override  // androidx.preference.Preference
    public final void P(int v) {
        this.R(v);
    }

    @Override  // androidx.preference.Preference
    public void a(oij oij0) {
        super.a(oij0);
        View view0 = oij0.a;
        TextView textView0 = (TextView)view0.findViewById(0x1020016);
        if(textView0 != null) {
            if(!TextUtils.isEmpty(null)) {
                textView0.setContentDescription(null);
            }
            this.ai(textView0);
        }
        TextView textView1 = (TextView)view0.findViewById(0x7F0B1FEF);  // id:settingslib_learn_more
        if(textView1 != null) {
            if(this.a == null) {
                textView1.setVisibility(8);
            }
            else {
                textView1.setVisibility(0);
                if(TextUtils.isEmpty(this.c)) {
                    this.c = textView1.getText();
                }
                else {
                    textView1.setText(this.c);
                }
                SpannableString spannableString0 = new SpannableString(this.c);
                FooterPreference.FooterLearnMoreSpan footerPreference$FooterLearnMoreSpan0 = this.e;
                if(footerPreference$FooterLearnMoreSpan0 != null) {
                    spannableString0.removeSpan(footerPreference$FooterLearnMoreSpan0);
                }
                FooterPreference.FooterLearnMoreSpan footerPreference$FooterLearnMoreSpan1 = new FooterPreference.FooterLearnMoreSpan(this.a);
                this.e = footerPreference$FooterLearnMoreSpan1;
                spannableString0.setSpan(footerPreference$FooterLearnMoreSpan1, 0, spannableString0.length(), 0);
                textView1.setText(spannableString0);
                if(!TextUtils.isEmpty(this.d)) {
                    textView1.setContentDescription(this.d);
                }
            }
        }
        View view1 = view0.findViewById(0x7F0B16C8);  // id:icon_frame
        if(view1 != null) {
            view1.setVisibility(this.b);
        }
    }

    public final void ah(CharSequence charSequence0) {
        if(!TextUtils.equals(this.c, charSequence0)) {
            this.c = charSequence0;
            this.d();
        }
    }

    private final void ai(TextView textView0) {
        CharSequence charSequence0 = this.t();
        if((charSequence0 instanceof Spanned)) {
            ClickableSpan[] arr_clickableSpan = (ClickableSpan[])((Spanned)charSequence0).getSpans(0, charSequence0.length(), ClickableSpan.class);
            if(arr_clickableSpan.length != 0) {
                SpannableString spannableString0 = new SpannableString(charSequence0);
                for(int v = 0; v < arr_clickableSpan.length; ++v) {
                    ClickableSpan clickableSpan0 = arr_clickableSpan[v];
                    if((clickableSpan0 instanceof URLSpan)) {
                        String s = ((URLSpan)clickableSpan0).getURL();
                        if(s != null && s.startsWith("intent:")) {
                            int v1 = spannableString0.getSpanStart(((URLSpan)clickableSpan0));
                            int v2 = spannableString0.getSpanEnd(((URLSpan)clickableSpan0));
                            spannableString0.removeSpan(((URLSpan)clickableSpan0));
                            try {
                                spannableString0.setSpan(new sjx(this, Intent.parseUri(s, 1)), v1, v2, 33);
                            }
                            catch(URISyntaxException uRISyntaxException0) {
                                Log.e("FooterPreference", "Invalid URI " + s, uRISyntaxException0);
                            }
                        }
                    }
                }
                textView0.setText(spannableString0);
                textView0.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
    }

    public final void k(int v) {
        if(this.b == v) {
            return;
        }
        this.b = v;
        this.d();
    }

    public final void l(View.OnClickListener view$OnClickListener0) {
        if(this.a != view$OnClickListener0) {
            this.a = view$OnClickListener0;
            this.d();
        }
    }

    @Override  // androidx.preference.Preference
    public final CharSequence m() {
        return this.t();
    }

    @Override  // androidx.preference.Preference
    public final void n(CharSequence charSequence0) {
        this.S(charSequence0);
    }

    @Deprecated
    public final void o(CharSequence charSequence0) {
        if(!TextUtils.equals(null, charSequence0)) {
            this.d = charSequence0;
            this.d();
        }
    }
}

