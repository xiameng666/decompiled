package com.google.android.wallet.ui.creditcard;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import clht;
import com.google.android.wallet.ui.common.FormEditText;
import fcbl;
import gczb;
import gczc;
import gddr;
import gdds;
import gddt;
import gddu;
import gfae;
import gfag;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreditCardNumberEditText extends FormEditText implements View.OnClickListener, ViewTreeObserver.OnGlobalLayoutListener, Runnable {
    public static final List a;
    public String b;
    public ColorStateList c;
    public String d;
    public String e;
    public boolean f;
    boolean g;
    public List h;
    public final ArrayList i;
    public Pair j;
    public List k;
    public gfae l;
    Handler m;
    ArrayList n;
    public gczc o;
    public gczc p;
    public fcbl q;
    private boolean r;
    private final int[] s;
    private final TextWatcher t;

    static {
        Integer integer0 = (int)4;
        CreditCardNumberEditText.a = DesugarCollections.unmodifiableList(Arrays.asList(new Integer[]{integer0, integer0, integer0, integer0}));
    }

    public CreditCardNumberEditText(Context context0) {
        super(context0);
        this.b = "";
        this.i = new ArrayList();
        this.s = new int[]{-1, -1};
        this.t = new gddu(this);
        this.ae(context0);
    }

    public CreditCardNumberEditText(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.b = "";
        this.i = new ArrayList();
        this.s = new int[]{-1, -1};
        this.t = new gddu(this);
        this.ae(context0);
    }

    public CreditCardNumberEditText(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.b = "";
        this.i = new ArrayList();
        this.s = new int[]{-1, -1};
        this.t = new gddu(this);
        this.ae(context0);
    }

    @Override  // com.google.android.wallet.ui.common.FormEditText
    public final void T(List list0) {
        this.r = true;
        gczc gczc0 = this.o;
        if(gczc0 != null) {
            this.af(gczc0);
            this.o = null;
        }
        gczc gczc1 = this.p;
        if(gczc1 != null) {
            this.af(gczc1);
            this.p = null;
        }
        this.setDropDownBackgroundResource(0x1080099);
        super.T(list0);
    }

    public final int a() {
        return this.j == null ? 16 : ((gfae)this.j.second).d;
    }

    public final void ab() {
        if(this.getWindowToken() != null && this.ah() && this.enoughToFilter() && this.hasFocus()) {
            this.showDropDown();
            this.setError(null);
        }
    }

    private final void ac(gczc gczc0) {
        if(!this.g) {
            this.ad(gczc0);
            return;
        }
        if(this.m == null) {
            this.m = new clht(Looper.getMainLooper());
        }
        if(this.n == null) {
            this.n = new ArrayList(2);
        }
        this.n.add(gczc0);
        this.m.removeCallbacks(this);
        this.m.postDelayed(this, 500L);
    }

    private final void ad(gczc gczc0) {
        if(this.getAdapter() == null) {
            ArrayList arrayList0 = new ArrayList(2);
            arrayList0.add(gczc0);
            this.setAdapter(new gczb(this.getContext(), arrayList0));
            this.setOnClickListener(this);
            this.getViewTreeObserver().addOnGlobalLayoutListener(this);
            return;
        }
        ((gczb)this.getAdapter()).add(gczc0);
    }

    private final void ae(Context context0) {
        this.setKeyListener(DigitsKeyListener.getInstance("1234567890 "));
        this.setSingleLine();
        this.ag();
        this.setTextDirection(3);
        this.z(this.t);
        this.y(new gddr(this));
        this.y(new gdds(this, "Invalid card number"));
        this.B(new gddt(this, "Invalid card number"));
        int[] arr_v = {0x7F040E0D, 0x7F040E17};  // attr:uicInvalidCardNumberShakeAnimationEnabled
        Arrays.sort(arr_v);
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(arr_v);
        this.f = typedArray0.getBoolean(Arrays.binarySearch(arr_v, 0x7F040E0D), false);  // attr:uicInvalidCardNumberShakeAnimationEnabled
        this.g = typedArray0.getBoolean(Arrays.binarySearch(arr_v, 0x7F040E17), false);  // attr:uicShowCardDropDownAfterDelay
        typedArray0.recycle();
    }

    private final void af(gczc gczc0) {
        if((this.getAdapter() instanceof gczb)) {
            ((gczb)this.getAdapter()).remove(gczc0);
        }
    }

    private final void ag() {
        this.c = this.getTextColors();
    }

    private final boolean ah() {
        return this.getAdapter() != null && this.getAdapter().getCount() > 0;
    }

    public static gfae d(List list0, String s) {
        if(list0 == null) {
            return null;
        }
        int v = s.length();
        for(Object object0: list0) {
            gfae gfae0 = (gfae)object0;
            int v1 = gfae0.b.length();
            if(v >= v1) {
                String s1 = s.substring(0, v1);
                if(s1.compareTo(gfae0.b) >= 0 && s1.compareTo(gfae0.c) <= 0) {
                    return gfae0;
                }
            }
        }
        return null;
    }

    @Override  // com.google.android.wallet.ui.common.FormEditText
    public final boolean enoughToFilter() {
        return this.r ? super.enoughToFilter() : this.getText().length() == 0;
    }

    public final gfag f() {
        return this.j == null ? null : ((gfag)this.j.first);
    }

    public final String h() {
        return this.b.substring(Math.max(0, this.b.length() - 4));
    }

    public final void n(int v) {
        if(this.p == null) {
            gczc gczc0 = gczc.a(this.getContext(), v);
            this.p = gczc0;
            this.ac(gczc0);
        }
    }

    @Override  // com.google.android.wallet.ui.common.FormEditText
    public final boolean nV() {
        int v = this.a();
        return this.b.length() == v;
    }

    public final void o(int v) {
        if(this.o == null) {
            gczc gczc0 = gczc.b(this.getContext(), v);
            this.o = gczc0;
            this.ac(gczc0);
        }
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        if(view0 == this) {
            this.ab();
        }
    }

    @Override  // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.ag();
    }

    @Override  // com.google.android.wallet.ui.common.FormEditText
    protected final void onFocusChanged(boolean z, int v, Rect rect0) {
        super.onFocusChanged(z, v, rect0);
        if(this.ah()) {
            if(z) {
                this.ab();
                return;
            }
            this.dismissDropDown();
        }
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int v = this.s[1];
        this.getLocationOnScreen(this.s);
        int v1 = this.s[1];
        if(this.isPopupShowing() && v1 != v) {
            this.dismissDropDown();
            this.showDropDown();
        }
    }

    @Override  // android.widget.TextView
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        if(z) {
            this.ab();
        }
    }

    @Override  // android.widget.AutoCompleteTextView
    protected final void replaceText(CharSequence charSequence0) {
        if(this.r) {
            super.replaceText(charSequence0);
        }
    }

    @Override
    public final void run() {
        int v = this.n.size();
        for(int v1 = 0; v1 < v; ++v1) {
            this.ad(((gczc)this.n.get(v1)));
        }
        this.n.clear();
        this.ab();
    }
}

