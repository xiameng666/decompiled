package com.google.android.gms.wallet.ui.verifypin;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.media.AudioManager;
import android.provider.Settings.Secure;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import fccz;
import fcda;
import fcdd;

public class KeyPadView extends LinearLayout {
    public fcdd a;

    public KeyPadView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        LayoutInflater.from(context0).inflate(0x7F0E0E43, this, true);  // layout:wallet_view_keypad
        fccz fccz0 = new fccz(this);
        this.findViewById(0x7F0B1797).setOnClickListener(fccz0);  // id:keypad_button_0
        this.findViewById(0x7F0B1798).setOnClickListener(fccz0);  // id:keypad_button_1
        this.findViewById(0x7F0B1799).setOnClickListener(fccz0);  // id:keypad_button_2
        this.findViewById(0x7F0B179A).setOnClickListener(fccz0);  // id:keypad_button_3
        this.findViewById(0x7F0B179B).setOnClickListener(fccz0);  // id:keypad_button_4
        this.findViewById(0x7F0B179C).setOnClickListener(fccz0);  // id:keypad_button_5
        this.findViewById(0x7F0B179D).setOnClickListener(fccz0);  // id:keypad_button_6
        this.findViewById(0x7F0B179E).setOnClickListener(fccz0);  // id:keypad_button_7
        this.findViewById(0x7F0B179F).setOnClickListener(fccz0);  // id:keypad_button_8
        this.findViewById(0x7F0B17A0).setOnClickListener(fccz0);  // id:keypad_button_9
        ((ImageButton)this.findViewById(0x7F0B17A1)).setOnClickListener(new fcda(this));  // id:keypad_button_back
        AudioManager audioManager0 = (AudioManager)this.getContext().getSystemService("audio");
        if(!audioManager0.isWiredHeadsetOn() && !audioManager0.isBluetoothA2dpOn() && Settings.Secure.getInt(this.getContext().getContentResolver(), "speak_password", 0) == 0) {
            this.findViewById(0x7F0B1797).setContentDescription("Dot");  // id:keypad_button_0
            this.findViewById(0x7F0B1798).setContentDescription("Dot");  // id:keypad_button_1
            this.findViewById(0x7F0B1799).setContentDescription("Dot");  // id:keypad_button_2
            this.findViewById(0x7F0B179A).setContentDescription("Dot");  // id:keypad_button_3
            this.findViewById(0x7F0B179B).setContentDescription("Dot");  // id:keypad_button_4
            this.findViewById(0x7F0B179C).setContentDescription("Dot");  // id:keypad_button_5
            this.findViewById(0x7F0B179D).setContentDescription("Dot");  // id:keypad_button_6
            this.findViewById(0x7F0B179E).setContentDescription("Dot");  // id:keypad_button_7
            this.findViewById(0x7F0B179F).setContentDescription("Dot");  // id:keypad_button_8
            this.findViewById(0x7F0B17A0).setContentDescription("Dot");  // id:keypad_button_9
        }
    }

    @Override  // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.findViewById(0x7F0B1797).setEnabled(z);  // id:keypad_button_0
        this.findViewById(0x7F0B1798).setEnabled(z);  // id:keypad_button_1
        this.findViewById(0x7F0B1799).setEnabled(z);  // id:keypad_button_2
        this.findViewById(0x7F0B179A).setEnabled(z);  // id:keypad_button_3
        this.findViewById(0x7F0B179B).setEnabled(z);  // id:keypad_button_4
        this.findViewById(0x7F0B179C).setEnabled(z);  // id:keypad_button_5
        this.findViewById(0x7F0B179D).setEnabled(z);  // id:keypad_button_6
        this.findViewById(0x7F0B179E).setEnabled(z);  // id:keypad_button_7
        this.findViewById(0x7F0B179F).setEnabled(z);  // id:keypad_button_8
        this.findViewById(0x7F0B17A0).setEnabled(z);  // id:keypad_button_9
        ImageButton imageButton0 = (ImageButton)this.findViewById(0x7F0B17A1);  // id:keypad_button_back
        imageButton0.setEnabled(z);
        if(z) {
            imageButton0.clearColorFilter();
            return;
        }
        imageButton0.setColorFilter(0xFF888888, PorterDuff.Mode.SRC_ATOP);
    }
}

