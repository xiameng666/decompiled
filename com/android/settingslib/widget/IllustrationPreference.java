package com.android.settingslib.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable2.AnimationCallback;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.preference.Preference;
import com.airbnb.lottie.LottieAnimationView;
import ggeo;
import ggqj;
import ibuq;
import ibzk;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import oij;
import pbk;
import pbl;
import qle;
import qlm;
import qpq;
import sjy;
import sjz;
import ska;
import skb;
import skc;
import skd;
import skf;
import skg;
import skh;
import sku;
import slh;

public class IllustrationPreference extends Preference implements sjy {
    private final pbk H;
    public Drawable a;
    public boolean b;
    private int c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private final Animatable2.AnimationCallback i;

    public IllustrationPreference(Context context0) {
        super(context0);
        this.c = -1;
        this.e = true;
        this.i = new skb(this);
        this.H = new skc(this);
        this.ah(context0, null);
    }

    public IllustrationPreference(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.c = -1;
        this.e = true;
        this.i = new skb(this);
        this.H = new skc(this);
        this.ah(context0, attributeSet0);
    }

    public IllustrationPreference(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.c = -1;
        this.e = true;
        this.i = new skb(this);
        this.H = new skc(this);
        this.ah(context0, attributeSet0);
    }

    public IllustrationPreference(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.c = -1;
        this.e = true;
        this.i = new skb(this);
        this.H = new skc(this);
        this.ah(context0, attributeSet0);
    }

    @Override  // androidx.preference.Preference
    public void a(oij oij0) {
        super.a(oij0);
        FrameLayout frameLayout0 = (FrameLayout)oij0.D(0x7F0B16DA);  // id:illustration_frame
        ImageView imageView0 = (ImageView)oij0.D(0x7F0B0C4C);  // id:background_view
        ImageView imageView1 = (ImageView)oij0.D(0x7F0B0C4D);  // id:background_view_tablet
        if(imageView0 != null) {
            imageView0.setVisibility((this.g ? 8 : 0));
        }
        if(imageView1 != null) {
            imageView1.setVisibility((this.g ? 0 : 8));
        }
        if(this.g) {
            imageView0 = imageView1;
        }
        FrameLayout frameLayout1 = (FrameLayout)oij0.D(0x7F0B1907);  // id:middleground_layout
        LottieAnimationView lottieAnimationView0 = (LottieAnimationView)oij0.D(0x7F0B1875);  // id:lottie_view
        if(lottieAnimationView0 != null && !TextUtils.isEmpty(null)) {
            lottieAnimationView0.setContentDescription(null);
            lottieAnimationView0.setImportantForAccessibility(1);
            ((View)frameLayout0.getParent()).setImportantForAccessibility(1);
        }
        int v = this.j.getResources().getDisplayMetrics().widthPixels;
        int v1 = this.j.getResources().getDisplayMetrics().heightPixels;
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = frameLayout0.getLayoutParams();
        if(v >= v1) {
            v = v1;
        }
        viewGroup$LayoutParams0.width = v;
        frameLayout0.setLayoutParams(viewGroup$LayoutParams0);
        lottieAnimationView0.e = this.e;
        if(this.a != null) {
            IllustrationPreference.ai(lottieAnimationView0);
            lottieAnimationView0.setImageDrawable(this.a);
            Drawable drawable0 = lottieAnimationView0.getDrawable();
            if(drawable0 != null) {
                this.aj(drawable0);
                this.h = false;
            }
        }
        if(this.d > 0) {
            try(InputStream inputStream0 = lottieAnimationView0.getResources().openRawResource(this.d)) {
                if(inputStream0.read() == -1) {
                    lottieAnimationView0.setVisibility(8);
                    frameLayout0.setVisibility(8);
                }
                else {
                    goto label_42;
                }
                goto label_57;
            }
            catch(IOException iOException0) {
                Log.w("IllustrationPreference", "Unable to open Lottie raw resource", iOException0);
            }
        label_42:
            lottieAnimationView0.setVisibility(0);
            frameLayout0.setVisibility(0);
            IllustrationPreference.ai(lottieAnimationView0);
            lottieAnimationView0.setImageResource(this.d);
            Drawable drawable1 = lottieAnimationView0.getDrawable();
            if(drawable1 == null) {
                int v2 = this.d;
                lottieAnimationView0.b = new sjz(v2);
                lottieAnimationView0.l(v2);
                lottieAnimationView0.t(-1);
                lottieAnimationView0.i();
                this.h = true;
            }
            else {
                this.aj(drawable1);
                this.h = false;
            }
        }
    label_57:
        if(this.h) {
            if(TextUtils.isEmpty(null)) {
                lottieAnimationView0.setContentDescription("Animation");
                Log.w("IllustrationPreference", "Illustration should have a content description. preference key = " + this.s);
            }
            frameLayout0.setOnClickListener(new ska(this, lottieAnimationView0, frameLayout0));
            this.o(frameLayout0);
        }
        if(this.c != -1) {
            Resources resources0 = imageView0.getResources();
            int v3 = resources0.getDimensionPixelSize(0x7F071037);  // dimen:settingslib_illustration_width
            int v4 = resources0.getDimensionPixelSize(0x7F071033);  // dimen:settingslib_illustration_height
            int v5 = this.c;
            imageView0.setMaxHeight(v5);
            lottieAnimationView0.setMaxHeight(v5);
            lottieAnimationView0.setMaxWidth(((int)(((float)v5) * (((float)v3) / ((float)v4)))));
        }
        frameLayout1.removeAllViews();
        frameLayout1.setVisibility(8);
        if(this.f) {
            Context context0 = this.j;
            if((context0.getResources().getConfiguration().uiMode & 0x30) != 0x20) {
                ggeo ggeo0 = skh.a;
                ggqj ggqj0 = ggeo0.w().om();
                while(ggqj0.hasNext()) {
                    Object object0 = ggqj0.next();
                    int v6 = context0.getColor(((Integer)ggeo0.get(((String)object0))).intValue());
                    qpq qpq0 = new qpq(new String[]{"**", ((String)object0), "**"});
                    skg skg0 = new skg(v6);
                    lottieAnimationView0.d(qpq0, qle.K, skg0);
                }
            }
        }
        Context context1 = this.j;
        if(sku.a(context1)) {
            ggeo ggeo1 = skh.b;
            ggqj ggqj1 = ggeo1.w().om();
            while(ggqj1.hasNext()) {
                Object object1 = ggqj1.next();
                int v7 = context1.getColor(((Integer)ggeo1.get(((String)object1))).intValue());
                qpq qpq1 = new qpq(new String[]{"**", ((String)object1), "**"});
                skf skf0 = new skf(v7);
                lottieAnimationView0.d(qpq1, qle.K, skf0);
            }
        }
    }

    private final void ah(Context context0, AttributeSet attributeSet0) {
        this.C = 0x7F0E04DD;  // layout:illustration_preference
        boolean z = true;
        if(attributeSet0 != null) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, qlm.a, 0, 0);
            this.d = typedArray0.getResourceId(15, 0);
            this.e = typedArray0.getBoolean(2, true);
            TypedArray typedArray1 = context0.obtainStyledAttributes(attributeSet0, slh.a, 0, 0);
            this.f = typedArray1.getBoolean(0, false);
            typedArray1.recycle();
        }
        if(sku.a(context0)) {
            ibuq.f(context0, "context");
            String s = "";
            try {
                Class class0 = context0.getClassLoader().loadClass("android.os.SystemProperties");
                Method method0 = class0.getMethod("get", ((Class[])Arrays.copyOf(new Class[]{String.class, String.class}, 2)));
                ibuq.e(method0, "getMethod(...)");
                Object object0 = method0.invoke(class0, "ro.build.characteristics", "");
                ibuq.d(object0, "null cannot be cast to non-null type kotlin.String");
                s = (String)object0;
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                throw illegalArgumentException0;
            }
            catch(Exception unused_ex) {
            }
            if(!ibzk.S(s, new char[]{','}, 0, 6).contains("tablet")) {
                z = false;
            }
        }
        else {
            z = false;
        }
        this.g = z;
        if(z) {
            int v = context0.getResources().getDimensionPixelSize(0x7F071034);  // dimen:settingslib_illustration_height_tablet
            if(v != this.c) {
                this.c = v;
                this.d();
            }
        }
    }

    private static void ai(LottieAnimationView lottieAnimationView0) {
        Drawable drawable0 = lottieAnimationView0.getDrawable();
        if((drawable0 instanceof Animatable)) {
            if((drawable0 instanceof Animatable2)) {
                ((Animatable2)drawable0).clearAnimationCallbacks();
            }
            else if((drawable0 instanceof pbl)) {
                ((pbl)drawable0).a();
            }
            ((Animatable)drawable0).stop();
        }
        lottieAnimationView0.e();
    }

    private final void aj(Drawable drawable0) {
        if(!(drawable0 instanceof Animatable)) {
            return;
        }
        if((drawable0 instanceof Animatable2)) {
            ((Animatable2)drawable0).registerAnimationCallback(this.i);
        }
        else if((drawable0 instanceof pbl)) {
            ((pbl)drawable0).b(this.H);
        }
        else if((drawable0 instanceof AnimationDrawable)) {
            ((AnimationDrawable)drawable0).setOneShot(false);
        }
        ((Animatable)drawable0).start();
    }

    public final void k() {
        this.a = null;
        this.d = 0;
    }

    public final void l(int v) {
        if(v != this.d) {
            this.k();
            this.d = v;
            this.d();
        }
    }

    public final void o(ViewGroup viewGroup0) {
        viewGroup0.setAccessibilityDelegate(new skd(this));
    }
}

