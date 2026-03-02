package com.google.android.gms.wallet.ui.verifypin;

import android.content.Context;
import android.provider.Settings.Global;
import android.provider.Settings.SettingNotFoundException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import fcdb;
import qka;
import qkb;
import qkm;

public class PinDotsView extends LinearLayout {
    public static final int a;
    private final LottieAnimationView[] b;
    private int c;

    static {
    }

    public PinDotsView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        LayoutInflater.from(context0).inflate(0x7F0E0E59, this, true);  // layout:wallet_view_pin_dots
        LottieAnimationView[] arr_lottieAnimationView = {((LottieAnimationView)this.findViewById(0x7F0B1C96)), ((LottieAnimationView)this.findViewById(0x7F0B1C97)), ((LottieAnimationView)this.findViewById(0x7F0B1C98)), ((LottieAnimationView)this.findViewById(0x7F0B1C99))};  // id:pin_entry_1
        this.b = arr_lottieAnimationView;
        for(int v = 0; v < 4; ++v) {
            arr_lottieAnimationView[v].setTag(Boolean.valueOf(false));
        }
    }

    public final long a() {
        qkb qkb0 = this.b[3].a();
        return qkb0 == null ? ((long)(0.0f * this.e())) : ((long)(((float)(((long)qkb0.a()))) * this.e()));
    }

    public final void b(int v) {
        for(int v1 = 0; true; ++v1) {
            LottieAnimationView[] arr_lottieAnimationView = this.b;
            if(v1 >= 4) {
                break;
            }
            LottieAnimationView lottieAnimationView0 = arr_lottieAnimationView[v1];
            Context context0 = this.getContext();
            qka qka0 = new qka(new fcdb(lottieAnimationView0, v));
            qkm.g(context0, PinDotsView.d(v, v1)).d(qka0);
        }
    }

    public final void c(int v) {
        if(v >= 0) {
            LottieAnimationView[] arr_lottieAnimationView = this.b;
            if(v <= 4) {
                this.c = v;
                for(int v1 = 0; v1 < 4; ++v1) {
                    LottieAnimationView lottieAnimationView0 = arr_lottieAnimationView[v1];
                    lottieAnimationView0.m(PinDotsView.d(0, v1));
                    boolean z = ((Boolean)lottieAnimationView0.getTag()).booleanValue();
                    if(v1 < this.c && !z) {
                        lottieAnimationView0.s(0.0f);
                        lottieAnimationView0.i();
                        lottieAnimationView0.setTag(Boolean.valueOf(true));
                        lottieAnimationView0.setContentDescription("Dot");
                    }
                    if(v1 >= this.c && z) {
                        lottieAnimationView0.v(-1.0f);
                        lottieAnimationView0.i();
                        lottieAnimationView0.setContentDescription("Empty Dot");
                        lottieAnimationView0.setTag(Boolean.valueOf(false));
                    }
                }
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    static final String d(int v, int v1) {
        switch(v) {
            case 0: {
                return String.format("verifypin/dot_%02d.json", ((int)(v1 + 1)));
            }
            case 1: {
                return String.format("verifypin/load_%02d.json", ((int)(v1 + 1)));
            }
            default: {
                return v == 2 ? String.format("verifypin/success_%02d.json", ((int)(v1 + 1))) : String.format("verifypin/fail_%02d.json", ((int)(v1 + 1)));
            }
        }
    }

    private final float e() {
        try {
            return Settings.Global.getFloat(this.getContext().getContentResolver(), "animator_duration_scale");
        }
        catch(Settings.SettingNotFoundException unused_ex) {
            return 1.0f;
        }
    }
}

