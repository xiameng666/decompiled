import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ListView;
import java.util.ArrayDeque;
import java.util.List;

public final class gbmx extends gbmq {
    public final gfzc a;
    public final ArrayDeque b;
    private final gast c;
    private final gbmv d;
    private ListView e;
    private Integer f;

    public gbmx(gast gast0, gbmv gbmv0, List list0) {
        super(gast0.a.e, list0);
        this.a = new ggdh();
        this.b = new ArrayDeque();
        this.f = (int)0;
        this.c = gast0;
        this.d = gbmv0;
    }

    @Override  // gbmq
    public final CharSequence a(Object object0) {
        return this.c.b.i(((hdrl)object0).e, "BE_DDPA_01").t();
    }

    @Override  // android.widget.BaseAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    @Override  // gbmq
    public final void b(View view0, int v) {
        gass gass0 = this.e(view0);
        if(gass0 != null) {
            gass0.af();
        }
        this.c();
    }

    @Override  // gbmq
    public final void c() {
        ggdf ggdf0 = new ggdf(((ggdg)this.a.b()));
        while(ggdf0.hasNext()) {
            Object object0 = ggdf0.next();
            gass gass0 = (gass)object0;
            if(gass0 != null) {
                this.f(gass0);
            }
        }
    }

    // Detected as a lambda impl.
    final void d(View view0) {
        ((ViewGroup)view0).removeAllViews();
        gass gass0 = this.e(view0);
        if(gass0 != null) {
            this.f(gass0);
        }
        view0.setTag(0x7F0B0B0C, null);  // id:adapter_reference
    }

    private final gass e(View view0) {
        Integer integer0 = (Integer)view0.getTag(0x7F0B0B0C);  // id:adapter_reference
        return integer0 == null ? null : ((gass)this.a.get(integer0));
    }

    private final void f(gass gass0) {
        ArrayDeque arrayDeque0 = this.b;
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
        if(this.e != viewGroup0 && (viewGroup0 instanceof ListView)) {
            this.e = (ListView)viewGroup0;
            ((ListView)viewGroup0).setRecyclerListener((View view0) -> {
                ((ViewGroup)view0).removeAllViews();
                gass gass0 = this.e(view0);
                if(gass0 != null) {
                    this.f(gass0);
                }
                view0.setTag(0x7F0B0B0C, null);  // id:adapter_reference
            });
        }
        if(view0 == null) {
            view0 = new FrameLayout(this.c.a.e);
        }
        else {
            if(((ViewGroup)view0).getChildCount() == 0) {
                view0.setTag(0x7F0B0B0C, null);  // id:adapter_reference
            }
            this.d(view0);
        }
        hdrl hdrl0 = (hdrl)this.getItem(v);
        if(hdrl0 != null) {
            ArrayDeque arrayDeque0 = this.b;
            if(arrayDeque0.isEmpty()) {
                gass0 = this.c.c.b(this.c, hdrl0);
                Integer integer0 = this.f;
                this.f = (int)(((int)integer0) + 1);
                this.a.put(integer0, gass0);
            }
            else {
                gass0 = (gass)arrayDeque0.removeFirst();
            }
            gass0.as(hdrl0);
            this.d.a(gass0);
            view0.setTag(0x7F0B0B0C, this.a.a().get(gass0));  // id:adapter_reference
            if(!gass0.aI()) {
                gass0.ag();
            }
            View view1 = gass0.i;
            gftb.check(view1);
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

