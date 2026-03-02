package com.google.android.gms.cast.settings;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import avev;
import oij;

public class CastClickableTextSettingPreference extends Preference {
    private final Context a;
    private final int b;
    private final int c;

    public CastClickableTextSettingPreference(Context context0, int v) {
        super(context0);
        this.a = context0;
        this.b = 0x7F150728;  // string:cast_settings_rcn_device_settings_text_open_app "You can prevent other devices 
                              // from controlling media that\'s playing on a device that works with Google Cast. 
                              // Open the Google Home app, then go to Settings and turn off Shared controls. %1$s"
        this.c = v;
    }

    @Override  // androidx.preference.Preference
    public final void a(oij oij0) {
        super.a(oij0);
        View view0 = oij0.a;
        String s = this.a.getString(this.c);
        String s1 = this.a.getString(this.b, new Object[]{s});
        TextView textView0 = (TextView)view0.findViewById(0x7F0B2259);  // id:text
        if(textView0 == null) {
            return;
        }
        SpannableString spannableString0 = new SpannableString(s1);
        spannableString0.setSpan(new avev(this), s1.length() - s.length() - 1, s1.length(), 33);
        textView0.setText(spannableString0);
    }
}

