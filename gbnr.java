import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class gbnr extends ConstraintLayout implements View.OnFocusChangeListener, View.OnKeyListener {
    public float A;
    public float B;
    public int C;
    public char D;
    public int E;
    public ColorStateList F;
    public final int G;
    public final int H;
    public Typeface I;
    public float J;
    public int K;
    public String L;
    public final TextView M;
    public ImageView N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public StringBuilder U;
    public final FlexboxLayout V;
    public final List W;
    public final List aa;
    public gccu ab;
    private final Drawable ac;
    private final int ad;
    private final int ae;
    private final int af;
    private boolean ag;
    private AccessibilityNodeProvider ah;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public String o;
    public char p;
    public ColorStateList q;
    public final int r;
    public final int s;
    public int t;
    public final int u;
    public ColorStateList v;
    public ColorStateList w;
    public int x;
    public float y;
    public float z;

    public gbnr(Context context0) {
        super(context0);
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = "";
        this.p = '\u0000';
        this.ad = 2;
        this.y = -1.0f;
        this.z = -1.0f;
        this.A = -1.0f;
        this.B = -1.0f;
        this.C = 2;
        this.D = '\u0000';
        this.ag = true;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = -1;
        this.U = new StringBuilder();
        this.W = new ArrayList();
        this.aa = new ArrayList();
        this.J = (float)this.getResources().getDimensionPixelSize(0x7F0714F8);  // dimen:wallet_segmented_input_default_text_size
        this.ae = this.getResources().getDimensionPixelSize(0x7F071530);  // dimen:wallet_text_input_min_height
        this.G = this.getResources().getDimensionPixelSize(0x7F0714F9);  // dimen:wallet_segmented_input_edit_text_default_min_width
        this.H = this.getResources().getDimensionPixelSize(0x7F0714FA);  // dimen:wallet_segmented_input_edit_text_left_and_right_padding
        this.af = this.getResources().getDimensionPixelSize(0x7F0714FE);  // dimen:wallet_segmented_input_text_view_top_and_bottom_padding
        this.r = this.getResources().getDimensionPixelSize(0x7F0714FD);  // dimen:wallet_segmented_input_spacing
        this.s = this.getResources().getDimensionPixelSize(0x7F0714FB);  // dimen:wallet_segmented_input_error_icon_spacing
        this.u = this.getResources().getDimensionPixelSize(0x7F0714FC);  // dimen:wallet_segmented_input_error_message_spacing
        FlexboxLayout flexboxLayout0 = new FlexboxLayout(this.getContext());
        this.V = flexboxLayout0;
        flexboxLayout0.p(1);
        flexboxLayout0.t(2);
        flexboxLayout0.setId(1000);
        Drawable drawable0 = kv.a(this.getContext(), 0x7F080944);  // drawable:mtrl_ic_error
        gftb.check(drawable0);
        this.ac = drawable0;
        drawable0.setColorFilter(this.getContext().getColor(0x7F060801), PorterDuff.Mode.MULTIPLY);  // color:google_textfield_error_color
        ImageView imageView0 = new ImageView(this.getContext());
        this.N = imageView0;
        imageView0.setImageDrawable(drawable0);
        this.N.setVisibility(8);
        this.t = drawable0.getIntrinsicWidth();
        ColorStateList colorStateList0 = jwe.d(this.getContext(), 0x7F060802);  // color:google_textfield_filled_error_color
        gftb.check(colorStateList0);
        this.q = colorStateList0;
        TextView textView0 = new TextView(this.getContext());
        this.M = textView0;
        textView0.setTextColor(this.q);
        textView0.setVisibility(4);
        textView0.setId(1001);
    }

    public final int b(TextInputEditText textInputEditText0) {
        for(int v = 0; v < this.W.size(); ++v) {
            if(this.d(v).equals(textInputEditText0)) {
                return v;
            }
        }
        return -1;
    }

    public final LinearLayout c(List list0, String s) {
        LinearLayout linearLayout0 = new LinearLayout(this.getContext());
        linearLayout0.setImportantForAccessibility(1);
        linearLayout0.setContentDescription(s);
        for(Object object0: list0) {
            linearLayout0.addView(((TextView)object0));
        }
        return linearLayout0;
    }

    public final TextInputEditText d(int v) {
        EditText editText0 = ((TextInputLayout)this.W.get(v)).f;
        gftb.check(editText0);
        return (TextInputEditText)editText0;
    }

    public final String e() {
        return this.U.toString();
    }

    public final String f(String s) {
        return s.length() <= this.W.size() ? s : s.substring(0, this.W.size());
    }

    public final void g() {
        gccu gccu0 = this.ab;
        if(gccu0 != null) {
            String s = this.e();
            ((gawu)((gccv)gccu0.aW("BE_SIP_03")).t).t(s, gccu0, gkwv.a);
            gccu0.bc();
        }
    }

    @Override  // android.view.View
    public final AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if(this.ah == null) {
            this.ah = new gbnq(this, this);
        }
        return this.ah;
    }

    public final void h(float f, float f1, float f2, float f3) {
        this.f = true;
        if((this.y != f || this.z != f1 || this.A != f2) || this.B != f3) {
            this.y = f;
            this.z = f1;
            this.A = f2;
            this.B = f3;
            for(Object object0: this.W) {
                ((TextInputLayout)object0).v(f, f1, f2, f3);
            }
        }
    }

    public final void i(boolean z) {
        if(this.ag != z) {
            this.ag = z;
            this.s(((boolean)(TextUtils.isEmpty(this.L) ^ 1)));
        }
    }

    public final void j(int v) {
        FlexboxLayout flexboxLayout0 = this.V;
        if(flexboxLayout0.a != v) {
            flexboxLayout0.o(v);
        }
    }

    public final void k(TextView textView0) {
        textView0.setTextSize(this.J);
        textView0.setMinHeight(this.ae);
        textView0.setGravity(17);
        textView0.setPadding(0, this.af, 0, this.af);
        if(this.e) {
            textView0.setTextColor(this.K);
        }
        if(this.g) {
            textView0.setTypeface(this.I);
        }
    }

    public final void l(int v) {
        this.m = true;
        String s = this.e();
        boolean z = false;
        while(true) {
            List list0 = this.W;
            if(v >= list0.size()) {
                break;
            }
            TextInputEditText textInputEditText0 = this.d(v);
            if(v < s.length()) {
                textInputEditText0.setText(String.valueOf(s.charAt(v)));
                textInputEditText0.setHint("");
                gbnr.r(textInputEditText0, true);
            }
            else {
                textInputEditText0.setText("");
                if(this.d && !textInputEditText0.isFocused()) {
                    textInputEditText0.setHint(String.valueOf(this.D));
                }
                if(z) {
                    gbnr.r(textInputEditText0, false);
                }
                else {
                    gbnr.r(textInputEditText0, true);
                    z = true;
                }
            }
            this.n(((TextInputLayout)list0.get(v)));
            ++v;
        }
        this.m = false;
    }

    public final void m(boolean z) {
        int v;
        Iterator iterator0 = this.W.iterator();
        while(true) {
            v = 8;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            TextInputLayout textInputLayout0 = (TextInputLayout)object0;
            if(z) {
                textInputLayout0.H(" ");
                textInputLayout0.e.s(null);
                textInputLayout0.e.h();
                textInputLayout0.getChildAt(1).setVisibility(8);
            }
            else {
                textInputLayout0.I(false);
            }
        }
        ImageView imageView0 = this.N;
        if(imageView0 != null) {
            if(z) {
                v = 0;
            }
            imageView0.setVisibility(v);
        }
        this.s(z);
    }

    public final void n(TextInputLayout textInputLayout0) {
        EditText editText0 = textInputLayout0.f;
        if(editText0 != null) {
            if(!TextUtils.isEmpty(editText0.getText())) {
                if(this.j) {
                    textInputLayout0.x(this.v);
                }
            }
            else if(this.k) {
                textInputLayout0.x(this.w);
            }
        }
    }

    public final void o() {
        String s = this.f(this.e());
        if(!TextUtils.equals(this.e(), s)) {
            this.U = new StringBuilder(s);
        }
    }

    @Override  // android.view.View$OnFocusChangeListener
    public final void onFocusChange(View view0, boolean z) {
        if((view0 instanceof TextInputEditText)) {
            if(z) {
                ((TextInputEditText)view0).setHint("");
                InputMethodManager inputMethodManager0 = (InputMethodManager)this.getContext().getSystemService("input_method");
                if(inputMethodManager0 != null) {
                    inputMethodManager0.showSoftInput(((TextInputEditText)view0), 1);
                }
            }
            else if(this.d) {
                ((TextInputEditText)view0).setHint(String.valueOf(this.D));
            }
        }
    }

    @Override  // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setClassName(gbnr.class.getName());
        StringBuilder stringBuilder0 = new StringBuilder();
        int v1 = 0;
        for(int v = 0; v < this.o.length(); ++v) {
            int v2 = this.o.charAt(v);
            if(v2 == this.p) {
                Editable editable0 = this.d(v1).getText();
                gftb.check(editable0);
                stringBuilder0.append(editable0.toString());
                ++v1;
            }
            else {
                stringBuilder0.append(((char)v2));
            }
        }
        if(!TextUtils.isEmpty(this.L)) {
            stringBuilder0.append(" ");
            stringBuilder0.append(this.L);
        }
        accessibilityNodeInfo0.setContentDescription(stringBuilder0.toString());
    }

    @Override  // android.view.View$OnKeyListener
    public final boolean onKey(View view0, int v, KeyEvent keyEvent0) {
        if((view0 instanceof TextInputEditText)) {
            int v1 = ((TextInputEditText)view0).getSelectionStart();
            if(v1 != ((TextInputEditText)view0).getSelectionEnd()) {
                return false;
            }
            if(v1 == 0) {
                if(keyEvent0.getAction() == 0 && v == 67) {
                    int v2 = this.b(((TextInputEditText)view0));
                    if(v2 != 0) {
                        TextInputEditText textInputEditText0 = this.d(v2 - 1);
                        textInputEditText0.setText("");
                        textInputEditText0.requestFocus();
                        textInputEditText0.setSelection(0);
                        return true;
                    }
                    return false;
                }
                if(keyEvent0.getAction() == 0 && v == 21) {
                    int v3 = this.b(((TextInputEditText)view0));
                    if(v3 != 0) {
                        TextInputEditText textInputEditText1 = this.d(v3 - 1);
                        textInputEditText1.requestFocus();
                        textInputEditText1.setSelection(0);
                        return true;
                    }
                }
                return false;
            }
            if(keyEvent0.getAction() == 0 && v == 22) {
                int v4 = this.b(((TextInputEditText)view0));
                return this.q(v4) ? false : this.p(((TextInputEditText)view0).isFocused(), v4 + 1);
            }
        }
        return false;
    }

    public final boolean p(boolean z, int v) {
        if(z) {
            TextInputEditText textInputEditText0 = this.d(v);
            textInputEditText0.requestFocus();
            textInputEditText0.setSelection(0);
            return true;
        }
        return false;
    }

    public final boolean q(int v) {
        return v == this.W.size() - 1;
    }

    private static void r(TextInputEditText textInputEditText0, boolean z) {
        textInputEditText0.setFocusable(z);
        textInputEditText0.setFocusableInTouchMode(z);
        textInputEditText0.setClickable(z);
        textInputEditText0.setLongClickable(z);
    }

    private final void s(boolean z) {
        int v1;
        int v = 0;
        if(!this.ag) {
            v1 = 8;
        }
        else if(!z) {
            v1 = 4;
        }
        else {
            v1 = 0;
        }
        bb bb0 = new bb();
        bb0.c(this);
        int v2 = this.O;
        if(v2 == 2) {
            bb0.d(this.M.getId(), 6, this.V.getId(), 6);
        }
        else {
            switch(v2) {
                case 3: {
                    int v3 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault());
                    int v4 = this.M.getId();
                    int v5 = this.V.getId();
                    if(v3 == 0) {
                        v = this.s;
                    }
                    bb0.e(v4, 7, v5, 7, v);
                    break;
                }
                case 4: {
                    bb0.h(this.M.getId());
                    bb0.d(this.M.getId(), 6, 0, 6);
                    bb0.d(this.M.getId(), 7, 0, 7);
                }
            }
        }
        bb0.a(this);
        this.M.setVisibility(v1);
    }

    private static boolean t(int v) {
        return v == 0;
    }
}

