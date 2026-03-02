import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;

public final class iu {
    int A;
    public final int B;
    public final int C;
    final int D;
    final int E;
    final int F;
    final int G;
    public final boolean H;
    final Handler I;
    public final View.OnClickListener J;
    public final Context a;
    final kc b;
    public final Window c;
    public CharSequence d;
    public CharSequence e;
    ListView f;
    public View g;
    public int h;
    public boolean i;
    Button j;
    public CharSequence k;
    Message l;
    Button m;
    public CharSequence n;
    Message o;
    Button p;
    public CharSequence q;
    Message r;
    NestedScrollView s;
    public int t;
    public Drawable u;
    public ImageView v;
    public TextView w;
    public TextView x;
    public View y;
    ListAdapter z;

    public iu(Context context0, kc kc0, Window window0) {
        this.i = false;
        this.t = 0;
        this.A = -1;
        this.J = new in(this);
        this.a = context0;
        this.b = kc0;
        this.c = window0;
        this.I = new is(kc0);
        TypedArray typedArray0 = context0.obtainStyledAttributes(null, ku.e, 0x7F0400B2, 0);  // attr:alertDialogStyle
        this.B = typedArray0.getResourceId(0, 0);
        this.C = typedArray0.getResourceId(2, 0);
        this.D = typedArray0.getResourceId(4, 0);
        this.E = typedArray0.getResourceId(5, 0);
        this.F = typedArray0.getResourceId(7, 0);
        this.G = typedArray0.getResourceId(3, 0);
        this.H = typedArray0.getBoolean(6, true);
        typedArray0.getDimensionPixelSize(1, 0);
        typedArray0.recycle();
        kc0.j();
    }

    public final void a(int v) {
        this.u = null;
        this.t = v;
        ImageView imageView0 = this.v;
        if(imageView0 != null) {
            if(v != 0) {
                imageView0.setVisibility(0);
                this.v.setImageResource(this.t);
                return;
            }
            imageView0.setVisibility(8);
        }
    }

    public final void b(CharSequence charSequence0) {
        this.d = charSequence0;
        TextView textView0 = this.w;
        if(textView0 != null) {
            textView0.setText(charSequence0);
        }
        this.c.setTitle(charSequence0);
    }

    public final void c(View view0) {
        this.g = view0;
        this.h = 0;
        this.i = false;
    }

    static boolean d(View view0) {
        if(view0.onCheckIsTextEditor()) {
            return true;
        }
        if(!(view0 instanceof ViewGroup)) {
            return false;
        }
        int v = ((ViewGroup)view0).getChildCount();
        while(v > 0) {
            --v;
            if(iu.d(((ViewGroup)view0).getChildAt(v))) {
                return true;
            }
        }
        return false;
    }

    public static final void e(Button button0) {
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)button0.getLayoutParams();
        linearLayout$LayoutParams0.gravity = 1;
        linearLayout$LayoutParams0.weight = 0.5f;
        button0.setLayoutParams(linearLayout$LayoutParams0);
    }

    public static final ViewGroup f(View view0, View view1) {
        if(view0 == null) {
            if((view1 instanceof ViewStub)) {
                view1 = ((ViewStub)view1).inflate();
            }
            return (ViewGroup)view1;
        }
        if(view1 != null) {
            ViewParent viewParent0 = view1.getParent();
            if((viewParent0 instanceof ViewGroup)) {
                ((ViewGroup)viewParent0).removeView(view1);
            }
        }
        if((view0 instanceof ViewStub)) {
            view0 = ((ViewStub)view0).inflate();
        }
        return (ViewGroup)view0;
    }

    public final void g(int v, CharSequence charSequence0, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        Message message0 = dialogInterface$OnClickListener0 == null ? null : this.I.obtainMessage(v, dialogInterface$OnClickListener0);
        switch(v) {
            case -3: {
                this.q = charSequence0;
                this.r = message0;
                return;
            }
            case -2: {
                this.n = charSequence0;
                this.o = message0;
                return;
            }
            default: {
                this.k = charSequence0;
                this.l = message0;
            }
        }
    }
}

