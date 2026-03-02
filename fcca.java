import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.wallet.common.ui.PopoverView;
import com.google.android.gms.wallet.ui.component.lineitem.LineItemBundleView;
import com.google.android.gms.wallet.ui.component.lineitem.LineItemContainerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class fcca extends gdak {
    public boolean a;
    LineItemContainerView b;
    public boolean c;
    private final gamj d;

    public fcca() {
        this.d = new gamj(3);
    }

    @Override  // gami
    public final gamj B() {
        return this.d;
    }

    @Override  // gdak
    protected final gewg C() {
        return null;
    }

    @Override  // gdak
    protected final Parser D() {
        return (Parser)((ProtoLiteMessage)gfcg.a).jf(7, null);
    }

    @Override  // gdak
    public final void K(gffq gffq0, List list0) {
        int v = gfev.a(gffq0.e);
        int v1 = 1;
        if(v == 0) {
            v = 1;
        }
        if(v - 1 != 12) {
            super.K(gffq0, list0);
            return;
        }
        batl.b(gffq0.c == 9);
        gffj gffj0 = gffq0.c == 9 ? ((gffj)gffq0.d) : gffj.a;
        int v2 = gffj0.d;
        if(gffg.a(v2) != 2 && gffg.a(v2) != 3) {
            int v3 = gffg.a(v2);
            if(v3 != 0) {
                v1 = v3;
            }
            throw new IllegalArgumentException(String.format("Unsupported modify component list type %s", ((int)(v1 - 1))));
        }
        int v4 = gffj0.c;
        if(gffi.a(v4) != 2 && gffi.a(v4) != 3) {
            int v5 = gffi.a(v4);
            if(v5 != 0) {
                v1 = v5;
            }
            throw new IllegalArgumentException(String.format("Unsupported modify type %s", ((int)(v1 - 1))));
        }
        LineItemContainerView lineItemContainerView0 = this.b;
        ArrayList arrayList0 = lineItemContainerView0 == null ? new ArrayList() : lineItemContainerView0.a;
        int v6 = arrayList0.size();
        int v7 = 0;
        while(v7 < v6) {
            LineItemBundleView lineItemBundleView0 = (LineItemBundleView)arrayList0.get(v7);
            boolean z = gffj0.b.contains(Long.valueOf(lineItemBundleView0.g.c));
            if(gffg.a(gffj0.d) == 2) {
                if(z) {
                    goto label_32;
                }
                else {
                    goto label_41;
                }
                goto label_31;
            }
            else {
            label_31:
                if(z) {
                label_32:
                    if(gffi.a(gffj0.c) == 2) {
                        lineItemBundleView0.setVisibility(0);
                    }
                    else {
                        lineItemBundleView0.setVisibility(8);
                    }
                }
                else if(gffi.a(gffj0.c) == 2) {
                    lineItemBundleView0.setVisibility(8);
                }
                else {
                    lineItemBundleView0.setVisibility(0);
                }
            }
        label_41:
            ++v7;
        }
        this.Q();
    }

    @Override  // gdcm
    protected final void M() {
    }

    private final void Q() {
        LineItemBundleView lineItemBundleView0 = null;
        View view0 = null;
        if(this.b != null && this.b.a != null) {
            for(int v = 0; v < this.b.a.size(); ++v) {
                LineItemBundleView lineItemBundleView1 = (LineItemBundleView)this.b.a.get(v);
                if(lineItemBundleView1.getVisibility() == 0) {
                    lineItemBundleView0 = lineItemBundleView1;
                    break;
                }
            }
        }
        if(lineItemBundleView0 != null) {
            lineItemBundleView0.f(this.c, false, false);
        }
        if(this.a) {
            int v1 = fbgn.d(this.getContext());
            int v2 = this.getContext().getResources().getConfiguration().orientation;
            if(v1 != 0 || !gcif.a(this.getContext()) && v2 != 2) {
                PopoverView popoverView0 = fbgn.n(this.getContext());
                if(popoverView0 != null) {
                    if(v1 == 1) {
                        popoverView0.g(0x7F04030E);  // attr:colorPrimaryDark
                    }
                    else {
                        popoverView0.g(0x7F04030C);  // attr:colorPrimary
                    }
                    if(lineItemBundleView0 != null && lineItemBundleView0.h()) {
                        view0 = lineItemBundleView0;
                    }
                    popoverView0.i(view0);
                }
            }
        }
    }

    @Override  // gdak
    public final long bs() {
        this.aj();
        return ((gfcg)this.aA).b;
    }

    @Override  // gdaa
    public final boolean la() {
        return true;
    }

    @Override  // gczu
    public final ArrayList lh() {
        return new ArrayList();
    }

    @Override  // gami
    public final List li() {
        return Collections.EMPTY_LIST;
    }

    @Override  // gdaa
    public final boolean ly(getg getg0) {
        return false;
    }

    @Override  // gdak
    public final void onActivityCreated(Bundle bundle0) {
        super.onActivityCreated(bundle0);
        this.Q();
    }

    @Override  // gdak
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.a = this.getArguments().getBoolean("isTopContainer");
        if(bundle0 != null) {
            this.c = bundle0.getBoolean("bundleExpanded");
        }
    }

    @Override  // gdak
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putBoolean("bundleExpanded", this.c);
    }

    @Override  // gcyg
    protected final View y(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E0D3E, null, false);  // layout:wallet_fragment_line_item_container
        LineItemContainerView lineItemContainerView0 = (LineItemContainerView)view0.findViewById(0x7F0B17FC);  // id:line_item_container
        this.b = lineItemContainerView0;
        int v = this.a ^ 1;
        lineItemContainerView0.b = v;
        gfcg gfcg0 = lineItemContainerView0.c;
        if(gfcg0 != null) {
            lineItemContainerView0.f(gfcg0, ((boolean)v));
        }
        this.b.d(((gfcg)this.aA));
        this.b.d = this;
        this.b.e();
        this.Q();
        return view0;
    }
}

