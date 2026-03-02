import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewParent;
import java.util.Iterator;

public final class iqr implements View.OnAttachStateChangeListener {
    final ijr a;

    public iqr(ijr ijr0) {
        this.a = ijr0;
        super();
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
        ijr ijr0 = this.a;
        Iterator iterator0 = ibxv.f(ijr0.getParent(), kfo.a).a();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            ViewParent viewParent0 = (ViewParent)object0;
            if((viewParent0 instanceof View)) {
                ibuq.f(((View)viewParent0), "<this>");
                Object object1 = ((View)viewParent0).getTag(0x7F0B1777);  // id:is_pooling_container_tag
                Boolean boolean0 = (object1 instanceof Boolean) ? ((Boolean)object1) : null;
                if(boolean0 != null && boolean0.booleanValue()) {
                    return;
                }
            }
        }
        ijr0.f();
    }
}

