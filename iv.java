import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertController.RecycleListView;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

public class iv {
    public final ir a;
    private final int b;

    public iv(Context context0) {
        this(context0, iw.a(context0, 0));
    }

    public iv(Context context0, int v) {
        this.a = new ir(new ContextThemeWrapper(context0, iw.a(context0, v)));
        this.b = v;
    }

    public final iw a() {
        iw iw0 = this.create();
        iw0.show();
        return iw0;
    }

    public final void b(ListAdapter listAdapter0, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        this.a.s = listAdapter0;
        this.a.t = dialogInterface$OnClickListener0;
    }

    public final void c(boolean z) {
        this.a.n = z;
    }

    public iw create() {
        ListAdapter listAdapter0;
        ir ir0 = this.a;
        Context context0 = ir0.a;
        iw iw0 = new iw(context0, this.b);
        iu iu0 = iw0.a;
        View view0 = ir0.f;
        if(view0 == null) {
            CharSequence charSequence0 = ir0.e;
            if(charSequence0 != null) {
                iu0.b(charSequence0);
            }
            Drawable drawable0 = ir0.d;
            if(drawable0 != null) {
                iu0.u = drawable0;
                iu0.t = 0;
                ImageView imageView0 = iu0.v;
                if(imageView0 != null) {
                    imageView0.setVisibility(0);
                    iu0.v.setImageDrawable(drawable0);
                }
            }
            int v = ir0.c;
            if(v != 0) {
                iu0.a(v);
            }
        }
        else {
            iu0.y = view0;
        }
        CharSequence charSequence1 = ir0.g;
        if(charSequence1 != null) {
            iu0.e = charSequence1;
            TextView textView0 = iu0.x;
            if(textView0 != null) {
                textView0.setText(charSequence1);
            }
        }
        CharSequence charSequence2 = ir0.h;
        if(charSequence2 != null) {
            iu0.g(-1, charSequence2, ir0.i);
        }
        CharSequence charSequence3 = ir0.j;
        if(charSequence3 != null) {
            iu0.g(-2, charSequence3, ir0.k);
        }
        CharSequence charSequence4 = ir0.l;
        if(charSequence4 != null) {
            iu0.g(-3, charSequence4, ir0.m);
        }
        if(ir0.r != null || ir0.s != null) {
            AlertController.RecycleListView alertController$RecycleListView0 = (AlertController.RecycleListView)ir0.b.inflate(iu0.D, null);
            if(ir0.x) {
                listAdapter0 = new io(ir0, context0, iu0.E, ir0.r, alertController$RecycleListView0);
            }
            else {
                int v1 = ir0.y ? iu0.F : iu0.G;
                ListAdapter listAdapter1 = ir0.s;
                if(listAdapter1 == null) {
                    listAdapter1 = new it(context0, v1, ir0.r);
                }
                listAdapter0 = listAdapter1;
            }
            iu0.z = listAdapter0;
            iu0.A = ir0.z;
            if(ir0.t != null) {
                alertController$RecycleListView0.setOnItemClickListener(new ip(ir0, iu0));
            }
            else if(ir0.A != null) {
                alertController$RecycleListView0.setOnItemClickListener(new iq(ir0, alertController$RecycleListView0, iu0));
            }
            if(ir0.y) {
                alertController$RecycleListView0.setChoiceMode(1);
            }
            else if(ir0.x) {
                alertController$RecycleListView0.setChoiceMode(2);
            }
            iu0.f = alertController$RecycleListView0;
        }
        View view1 = ir0.v;
        if(view1 == null) {
            int v2 = ir0.u;
            if(v2 != 0) {
                iu0.g = null;
                iu0.h = v2;
                iu0.i = false;
            }
        }
        else {
            iu0.c(view1);
        }
        iw0.setCancelable(ir0.n);
        if(ir0.n) {
            iw0.setCanceledOnTouchOutside(true);
        }
        iw0.setOnCancelListener(ir0.o);
        iw0.setOnDismissListener(ir0.p);
        DialogInterface.OnKeyListener dialogInterface$OnKeyListener0 = ir0.q;
        if(dialogInterface$OnKeyListener0 != null) {
            iw0.setOnKeyListener(dialogInterface$OnKeyListener0);
        }
        return iw0;
    }

    public final void d(View view0) {
        this.a.f = view0;
    }

    public final void e(Drawable drawable0) {
        this.a.d = drawable0;
    }

    public final void f(CharSequence[] arr_charSequence, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        this.a.r = arr_charSequence;
        this.a.t = dialogInterface$OnClickListener0;
    }

    public final void g(CharSequence[] arr_charSequence, boolean[] arr_z, DialogInterface.OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener0) {
        this.a.r = arr_charSequence;
        this.a.A = dialogInterface$OnMultiChoiceClickListener0;
        this.a.w = arr_z;
        this.a.x = true;
    }

    public Context getContext() {
        return this.a.a;
    }

    public final void h(DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        this.a.o = dialogInterface$OnCancelListener0;
    }

    public final void i(ListAdapter listAdapter0, int v, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        this.a.s = listAdapter0;
        this.a.t = dialogInterface$OnClickListener0;
        this.a.z = v;
        this.a.y = true;
    }

    public final void j(int v) {
        this.a.e = this.a.a.getText(v);
    }

    public final void k(int v) {
        this.a.v = null;
        this.a.u = v;
    }

    public final void l(int v) {
        this.a.c = v;
    }

    public void m(int v) {
        this.a.g = this.a.a.getText(v);
    }

    public void n(CharSequence charSequence0) {
        this.a.g = charSequence0;
    }

    public final void o(CharSequence charSequence0, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        this.a.j = charSequence0;
        this.a.k = dialogInterface$OnClickListener0;
    }

    public final void p(DialogInterface.OnDismissListener dialogInterface$OnDismissListener0) {
        this.a.p = dialogInterface$OnDismissListener0;
    }

    public final void q(DialogInterface.OnKeyListener dialogInterface$OnKeyListener0) {
        this.a.q = dialogInterface$OnKeyListener0;
    }

    public final void r(CharSequence charSequence0, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        this.a.h = charSequence0;
        this.a.i = dialogInterface$OnClickListener0;
    }

    public final void s(CharSequence[] arr_charSequence, int v, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        this.a.r = arr_charSequence;
        this.a.t = dialogInterface$OnClickListener0;
        this.a.z = v;
        this.a.y = true;
    }

    public iv setNegativeButton(int v, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        this.a.j = this.a.a.getText(v);
        this.a.k = dialogInterface$OnClickListener0;
        return this;
    }

    public iv setPositiveButton(int v, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        this.a.h = this.a.a.getText(v);
        this.a.i = dialogInterface$OnClickListener0;
        return this;
    }

    public iv setTitle(CharSequence charSequence0) {
        this.a.e = charSequence0;
        return this;
    }

    public iv setView(View view0) {
        this.a.v = view0;
        this.a.u = 0;
        return this;
    }
}

