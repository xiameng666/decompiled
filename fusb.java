import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.lang.reflect.Field;

public final class fusb implements fura {
    @Override  // fura
    public final void a(fusj fusj0, View view0) {
        if((view0 instanceof RecyclerView)) {
            fusj0.c("recyclerView_hasFixedSize", ((RecyclerView)view0).r);
            tk tk0 = ((RecyclerView)view0).m;
            if(tk0 != null) {
                fusj0.e("recyclerView_adapter_itemCount", tk0.b());
                fusj0.c("recyclerView_adapter_hasStableIds", tk0.c);
            }
            tr tr0 = ((RecyclerView)view0).D;
            if(tr0 != null) {
                fusj0.c("recyclerView_itemAnimator_isRunning", tr0.i());
            }
            try {
                Field field0 = RecyclerView.class.getDeclaredField("t");
                field0.setAccessible(true);
                fusj0.c("recyclerView_mLayoutWasDefered", field0.getBoolean(view0));
            }
            catch(ReflectiveOperationException unused_ex) {
            }
            try {
                Field field1 = RecyclerView.class.getDeclaredField("ak");
                field1.setAccessible(true);
                fusj0.e("recyclerView_mInterceptRequestLayoutDepth", field1.getInt(view0));
            }
            catch(ReflectiveOperationException unused_ex) {
            }
            try {
                Field field2 = RecyclerView.class.getDeclaredField("u");
                field2.setAccessible(true);
                fusj0.c("recyclerView_mLayoutSuppressed", field2.getBoolean(view0));
            }
            catch(ReflectiveOperationException unused_ex) {
            }
        }
        if((view0.getParent() instanceof RecyclerView)) {
            uq uq0 = ((RecyclerView)view0.getParent()).o(view0);
            fusj0.e("recyclerView_viewHolder_adapterPosition", uq0.fq());
            fusj0.e("recyclerView_viewHolder_layoutPosition", uq0.c());
            fusj0.b("recyclerView_viewHolder_itemId", Long.toString(uq0.e));
            fusj0.c("recyclerView_viewHolder_isRecyclable", uq0.u());
            fusj0.b("recyclerView_viewHolder_viewType", ((CharSequence)gfsx.l(fusc.a(view0.getContext().getResources(), uq0.f)).f(Integer.toString(uq0.f))));
        }
    }
}

