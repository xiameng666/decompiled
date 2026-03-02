package com.google.android.gms.googlehelp.contact;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import btkp;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import com.google.android.material.button.MaterialButton;

public final class ContactOptionsContainer extends LinearLayout {
    public static final String a;
    public int b;
    public boolean c;
    public HelpChimeraActivity d;
    public HelpConfig e;
    public MaterialButton f;

    static {
        ContactOptionsContainer.a = "gH_ContactOptsContainer-" + btkp.class.getSimpleName();
    }

    public ContactOptionsContainer(Context context0) {
        this(context0, null);
    }

    public ContactOptionsContainer(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        LayoutInflater.from(context0).inflate(0x7F0E046F, this, true);  // layout:gh_contact_options_content
    }
}

