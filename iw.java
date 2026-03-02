import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AlertController.RecycleListView;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;

public class iw extends kc implements DialogInterface {
    public final iu a;

    protected iw(Context context0, int v) {
        super(context0, iw.a(context0, v));
        this.a = new iu(this.getContext(), this, this.getWindow());
    }

    static int a(Context context0, int v) {
        if(v >>> 24 > 0) {
            return v;
        }
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(0x7F0400B3, typedValue0, true);  // attr:alertDialogTheme
        return typedValue0.resourceId;
    }

    public final Button b(int v) {
        return v == -2 ? this.a.m : this.a.j;
    }

    public final ListView c() {
        return this.a.f;
    }

    public final void d(View view0) {
        this.a.y = view0;
    }

    public final void e(int v) {
        this.a.a(v);
    }

    public final void f(View view0) {
        this.a.c(view0);
    }

    public final void g(CharSequence charSequence0, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        this.a.g(-1, charSequence0, dialogInterface$OnClickListener0);
    }

    @Override  // kc
    protected final void onCreate(Bundle bundle0) {
        int v2;
        super.onCreate(bundle0);
        iu iu0 = this.a;
        iu0.b.setContentView(iu0.B);
        Window window0 = iu0.c;
        View view0 = window0.findViewById(0x7F0B1BB9);  // id:parentPanel
        View view1 = view0.findViewById(0x7F0B22E9);  // id:topPanel
        View view2 = view0.findViewById(0x7F0B0FDC);  // id:contentPanel
        View view3 = view0.findViewById(0x7F0B0D8E);  // id:buttonPanel
        ViewGroup viewGroup0 = (ViewGroup)view0.findViewById(0x7F0B106F);  // id:customPanel
        View view4 = iu0.g;
        int v = 0;
        if(view4 == null) {
            view4 = iu0.h == 0 ? null : LayoutInflater.from(iu0.a).inflate(iu0.h, viewGroup0, false);
        }
        if(view4 == null || !iu.d(view4)) {
            window0.setFlags(0x20000, 0x20000);
            if(view4 == null) {
                viewGroup0.setVisibility(8);
                goto label_24;
            }
            goto label_18;
        }
        else {
        label_18:
            FrameLayout frameLayout0 = (FrameLayout)window0.findViewById(0x7F0B106E);  // id:custom
            frameLayout0.addView(view4, new ViewGroup.LayoutParams(-1, -1));
            if(iu0.i) {
                frameLayout0.setPadding(0, 0, 0, 0);
            }
            if(iu0.f != null) {
                ((sc)viewGroup0.getLayoutParams()).weight = 0.0f;
            }
        }
    label_24:
        View view5 = viewGroup0.findViewById(0x7F0B22E9);  // id:topPanel
        View view6 = viewGroup0.findViewById(0x7F0B0FDC);  // id:contentPanel
        View view7 = viewGroup0.findViewById(0x7F0B0D8E);  // id:buttonPanel
        ViewGroup viewGroup1 = iu.f(view5, view1);
        ViewGroup viewGroup2 = iu.f(view6, view2);
        ViewGroup viewGroup3 = iu.f(view7, view3);
        iu0.s = (NestedScrollView)window0.findViewById(0x7F0B1F3A);  // id:scrollView
        iu0.s.setFocusable(false);
        iu0.s.setNestedScrollingEnabled(false);
        iu0.x = (TextView)viewGroup2.findViewById(0x102000B);
        TextView textView0 = iu0.x;
        if(textView0 != null) {
            CharSequence charSequence0 = iu0.e;
            if(charSequence0 == null) {
                textView0.setVisibility(8);
                iu0.s.removeView(iu0.x);
                if(iu0.f == null) {
                    viewGroup2.setVisibility(8);
                }
                else {
                    ViewGroup viewGroup4 = (ViewGroup)iu0.s.getParent();
                    int v1 = viewGroup4.indexOfChild(iu0.s);
                    viewGroup4.removeViewAt(v1);
                    viewGroup4.addView(iu0.f, v1, new ViewGroup.LayoutParams(-1, -1));
                }
            }
            else {
                textView0.setText(charSequence0);
            }
        }
        iu0.j = (Button)viewGroup3.findViewById(0x1020019);
        View.OnClickListener view$OnClickListener0 = iu0.J;
        iu0.j.setOnClickListener(view$OnClickListener0);
        if(TextUtils.isEmpty(iu0.k)) {
            iu0.j.setVisibility(8);
            v2 = 0;
        }
        else {
            iu0.j.setText(iu0.k);
            iu0.j.setVisibility(0);
            v2 = 1;
        }
        iu0.m = (Button)viewGroup3.findViewById(0x102001A);
        iu0.m.setOnClickListener(view$OnClickListener0);
        if(TextUtils.isEmpty(iu0.n)) {
            iu0.m.setVisibility(8);
        }
        else {
            iu0.m.setText(iu0.n);
            iu0.m.setVisibility(0);
            v2 |= 2;
        }
        iu0.p = (Button)viewGroup3.findViewById(0x102001B);
        iu0.p.setOnClickListener(view$OnClickListener0);
        if(TextUtils.isEmpty(iu0.q)) {
            iu0.p.setVisibility(8);
        }
        else {
            iu0.p.setText(iu0.q);
            iu0.p.setVisibility(0);
            v2 |= 4;
        }
        TypedValue typedValue0 = new TypedValue();
        iu0.a.getTheme().resolveAttribute(0x7F0400B1, typedValue0, true);  // attr:alertDialogCenterButtons
        if(typedValue0.data == 0) {
        label_87:
            if(v2 == 0) {
                viewGroup3.setVisibility(8);
            }
        }
        else if(v2 == 1) {
            iu.e(iu0.j);
        }
        else if(v2 == 2) {
            iu.e(iu0.m);
        }
        else {
            if(v2 == 4) {
                iu.e(iu0.p);
                goto label_89;
            }
            goto label_87;
        }
    label_89:
        if(iu0.y == null) {
            iu0.v = (ImageView)window0.findViewById(0x1020006);
            if(!TextUtils.isEmpty(iu0.d) && iu0.H) {
                iu0.w = (TextView)window0.findViewById(0x7F0B0B7B);  // id:alertTitle
                iu0.w.setText(iu0.d);
                int v3 = iu0.t;
                if(v3 == 0) {
                    Drawable drawable0 = iu0.u;
                    if(drawable0 == null) {
                        iu0.w.setPadding(iu0.v.getPaddingLeft(), iu0.v.getPaddingTop(), iu0.v.getPaddingRight(), iu0.v.getPaddingBottom());
                        iu0.v.setVisibility(8);
                    }
                    else {
                        iu0.v.setImageDrawable(drawable0);
                    }
                }
                else {
                    iu0.v.setImageResource(v3);
                }
            }
            else {
                window0.findViewById(0x7F0B22CC).setVisibility(8);  // id:title_template
                iu0.v.setVisibility(8);
                viewGroup1.setVisibility(8);
            }
        }
        else {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-1, -2);
            viewGroup1.addView(iu0.y, 0, viewGroup$LayoutParams0);
            window0.findViewById(0x7F0B22CC).setVisibility(8);  // id:title_template
        }
        boolean z = viewGroup0.getVisibility() != 8;
        int v4 = viewGroup1 == null || viewGroup1.getVisibility() == 8 ? 0 : 1;
        int v5 = viewGroup3.getVisibility() == 8 ? 0 : 1;
        if(v5 == 0) {
            View view8 = viewGroup2.findViewById(0x7F0B2266);  // id:textSpacerNoButtons
            if(view8 != null) {
                view8.setVisibility(0);
            }
        }
        if(v4 == 0) {
            View view10 = viewGroup2.findViewById(0x7F0B2267);  // id:textSpacerNoTitle
            if(view10 != null) {
                view10.setVisibility(0);
            }
        }
        else {
            NestedScrollView nestedScrollView0 = iu0.s;
            if(nestedScrollView0 != null) {
                nestedScrollView0.setClipToPadding(true);
            }
            View view9 = iu0.e != null || iu0.f != null ? viewGroup1.findViewById(0x7F0B22B9) : null;  // id:titleDividerNoCustom
            if(view9 != null) {
                view9.setVisibility(0);
            }
        }
        ListView listView0 = iu0.f;
        if((listView0 instanceof AlertController.RecycleListView)) {
            if(v5 == 0) {
                ((AlertController.RecycleListView)listView0).setPadding(((AlertController.RecycleListView)listView0).getPaddingLeft(), (v4 == 0 ? ((AlertController.RecycleListView)listView0).a : ((AlertController.RecycleListView)listView0).getPaddingTop()), ((AlertController.RecycleListView)listView0).getPaddingRight(), ((AlertController.RecycleListView)listView0).b);
            }
            else if(v4 == 0) {
                ((AlertController.RecycleListView)listView0).setPadding(((AlertController.RecycleListView)listView0).getPaddingLeft(), ((AlertController.RecycleListView)listView0).a, ((AlertController.RecycleListView)listView0).getPaddingRight(), (v5 == 0 ? ((AlertController.RecycleListView)listView0).b : ((AlertController.RecycleListView)listView0).getPaddingBottom()));
            }
        }
        if(!z) {
            ListView listView1 = iu0.f;
            if(listView1 == null) {
                listView1 = iu0.s;
            }
            if(listView1 != null) {
                if(1 == v5) {
                    v = 2;
                }
                View view11 = window0.findViewById(0x7F0B1F39);  // id:scrollIndicatorUp
                View view12 = window0.findViewById(0x7F0B1F38);  // id:scrollIndicatorDown
                listView1.setScrollIndicators(v4 | v, 3);
                if(view11 != null) {
                    viewGroup2.removeView(view11);
                }
                if(view12 != null) {
                    viewGroup2.removeView(view12);
                }
            }
        }
        ListView listView2 = iu0.f;
        if(listView2 != null) {
            ListAdapter listAdapter0 = iu0.z;
            if(listAdapter0 != null) {
                listView2.setAdapter(listAdapter0);
                int v6 = iu0.A;
                if(v6 >= 0) {
                    listView2.setItemChecked(v6, true);
                    listView2.setSelection(v6);
                }
            }
        }
    }

    @Override  // android.app.Dialog
    public final boolean onKeyDown(int v, KeyEvent keyEvent0) {
        NestedScrollView nestedScrollView0 = this.a.s;
        return nestedScrollView0 == null || !nestedScrollView0.q(keyEvent0) ? super.onKeyDown(v, keyEvent0) : true;
    }

    @Override  // android.app.Dialog
    public final boolean onKeyUp(int v, KeyEvent keyEvent0) {
        NestedScrollView nestedScrollView0 = this.a.s;
        return nestedScrollView0 == null || !nestedScrollView0.q(keyEvent0) ? super.onKeyUp(v, keyEvent0) : true;
    }

    @Override  // kc
    public final void setTitle(CharSequence charSequence0) {
        super.setTitle(charSequence0);
        this.a.b(charSequence0);
    }
}

