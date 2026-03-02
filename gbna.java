import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ListView;
import java.util.ArrayDeque;
import java.util.List;

public final class gbna extends gbmq {
    public final hdrl a;
    public List b;
    public final gast c;
    private final gbmv d;
    private final gfzc e;
    private final ArrayDeque f;
    private ListView g;

    public gbna(gast gast0, gbmv gbmv0, List list0, hdrl hdrl0, List list1) {
        ibuq.f(gast0, "pageContext");
        ibuq.f(hdrl0, "templateNode");
        super(gast0.a.e, list0);
        this.d = gbmv0;
        this.a = hdrl0;
        this.b = list1;
        this.e = new ggdh();
        this.f = new ArrayDeque();
        this.c = gast0;
    }

    @Override  // gbmq
    public final CharSequence a(Object object0) {
        ibuq.f(object0, "selectedItem");
        CharSequence charSequence0 = this.c.b.i(((hdrl)object0).e, "BE_DDPA_02").t();
        ibuq.e(charSequence0, "getDisplayText(...)");
        return charSequence0;
    }

    @Override  // android.widget.BaseAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    @Override  // gbmq
    public final void b(View view0, int v) {
        ibuq.f(view0, "view");
        gass gass0 = this.d(view0);
        if(gass0 != null) {
            gass0.af();
        }
        this.c();
    }

    @Override  // gbmq
    public final void c() {
        ggdf ggdf0 = new ggdf(((ggdg)((ggdh)this.e).b()));
        while(ggdf0.hasNext()) {
            Object object0 = ggdf0.next();
            gass gass0 = (gass)object0;
            if(gass0 != null) {
                this.f(gass0);
            }
        }
    }

    public final gass d(View view0) {
        ibuq.f(view0, "view");
        Object object0 = view0.getTag(0x7F0B0B0C);  // id:adapter_reference
        Long long0 = (object0 instanceof Long) ? ((Long)object0) : null;
        return long0 == null ? null : ((gass)this.e.get(long0));
    }

    public final void e(View view0) {
        ibuq.f(view0, "view");
        ((ViewGroup)view0).removeAllViews();
        gass gass0 = this.d(view0);
        if(gass0 != null) {
            this.f(gass0);
        }
        view0.setTag(0x7F0B0B0C, null);  // id:adapter_reference
    }

    public final void f(gass gass0) {
        ArrayDeque arrayDeque0 = this.f;
        if(!arrayDeque0.contains(gass0)) {
            View view0 = gass0.i;
            if(view0 != null) {
                ViewParent viewParent0 = view0.getParent();
                if(viewParent0 != null) {
                    ((ViewGroup)viewParent0).removeView(view0);
                }
                view0.setTag(0x7F0B0B0C, null);  // id:adapter_reference
            }
            gass0.I();
            arrayDeque0.addFirst(gass0);
        }
    }

    @Override  // android.widget.ArrayAdapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        gass gass0;
        ibuq.f(viewGroup0, "parent");
        if(!ibuq.m(this.g, viewGroup0) && (viewGroup0 instanceof ListView)) {
            this.g = (ListView)viewGroup0;
            if(((ListView)viewGroup0) != null) {
                ((ListView)viewGroup0).setRecyclerListener(new gbmz(this));
            }
        }
        if(view0 == null) {
            view0 = new FrameLayout(this.c.a.e);
        }
        else {
            if(((ViewGroup)view0).getChildCount() == 0) {
                ((ViewGroup)view0).setTag(0x7F0B0B0C, null);  // id:adapter_reference
            }
            this.e(view0);
        }
        hdrl hdrl0 = (hdrl)this.getItem(v);
        if(hdrl0 != null) {
            ArrayDeque arrayDeque0 = this.f;
            if(arrayDeque0.isEmpty()) {
                gass0 = this.c.c.b(this.c, hdrl0);
                ibuq.e(gass0, "createPresenter(...)");
                this.e.put(Long.valueOf(hdrl0.c), gass0);
            }
            else {
                Object object0 = arrayDeque0.removeFirst();
                ibuq.e(object0, "removeFirst(...)");
                gass0 = (gass)object0;
            }
            gass0.as(hdrl0);
            this.d.a(gass0);
            ((ViewGroup)view0).setTag(0x7F0B0B0C, this.e.a().get(gass0));  // id:adapter_reference
            if(!gass0.aI()) {
                gass0.ag();
            }
            View view1 = gass0.i;
            gavr.d(view1, "BE_DDPA_01", this.c.a.g, null, null, 24);
            ((ViewGroup)view0).addView(view1);
        }
        return view0;
    }

    @Override  // android.widget.BaseAdapter
    public final boolean isEnabled(int v) {
        hdrl hdrl0 = (hdrl)this.getItem(v);
        if(hdrl0 != null) {
            garp garp0 = this.c.b.g(hdrl0.e, garp.class);
            return garp0 == null ? true : garp0.ak();
        }
        return true;
    }
}

