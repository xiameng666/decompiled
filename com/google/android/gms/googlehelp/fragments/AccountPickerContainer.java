package com.google.android.gms.googlehelp.fragments;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

public final class AccountPickerContainer extends LinearLayout {
    public AccountPickerContainer(Context context0) {
        this(context0, null);
    }

    public AccountPickerContainer(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        LayoutInflater.from(context0).inflate(0x7F0E0456, this, true);  // layout:gh_account_picker_content
    }
}

