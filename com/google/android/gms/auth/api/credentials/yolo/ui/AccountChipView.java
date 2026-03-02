package com.google.android.gms.auth.api.credentials.yolo.ui;

import ahjd;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bapk;
import bbfw;
import bbrw;
import com.android.volley.toolbox.ImageLoader;

public final class AccountChipView extends LinearLayout {
    private static ImageLoader a;
    private static bapk b;

    public AccountChipView(Context context0) {
        super(context0);
        this.f(context0);
    }

    public AccountChipView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.f(context0);
    }

    public AccountChipView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.f(context0);
    }

    final bbrw a() {
        return (bbrw)this.findViewById(0x7F0B1022);  // id:credential_avatar
    }

    public final void b(ahjd ahjd0) {
        TextView textView0 = (TextView)this.findViewById(0x7F0B1038);  // id:credential_primary_label
        String s = ahjd0.d;
        if(TextUtils.isEmpty(s)) {
            textView0.setText("");
        }
        else {
            textView0.setText(s);
        }
        this.c(ahjd0.e);
        String s1 = ahjd0.c;
        if(!TextUtils.isEmpty(s1)) {
            this.d().setVisibility(8);
            this.a().setVisibility(0);
            this.a().setImageUrl(s1, AccountChipView.e());
        }
        else if(ahjd0.b) {
            this.d().setVisibility(8);
            this.a().setVisibility(0);
            this.a().setDefaultImageResId(ahjd0.a);
            this.a().setImageUrl(null, AccountChipView.e());
        }
        else {
            this.a().setVisibility(8);
            this.d().setVisibility(0);
            ((ImageView)this.findViewById(0x7F0B10C4)).setBackgroundResource(ahjd0.a);  // id:default_credential_avatar_icon
        }
        this.setContentDescription(s);
    }

    @Deprecated
    public final void c(String s) {
        TextView textView0 = (TextView)this.findViewById(0x7F0B103E);  // id:credential_secondary_label
        if(TextUtils.isEmpty(s)) {
            textView0.setVisibility(8);
            return;
        }
        textView0.setText(s);
        textView0.setVisibility(0);
    }

    private final LinearLayout d() {
        return (LinearLayout)this.findViewById(0x7F0B10C3);  // id:default_credential_avatar
    }

    private static ImageLoader e() {
        if(AccountChipView.a == null) {
            AccountChipView.b = new bapk();
            AccountChipView.a = new ImageLoader(bbfw.b(), AccountChipView.b);
        }
        return AccountChipView.a;
    }

    private final void f(Context context0) {
        View.inflate(context0, 0x7F0E0036, this);  // layout:account_chip_view
    }
}

