import android.view.View;
import android.widget.TextView;

public final class bdei implements ibts {
    public final View a;
    public final bdeq b;
    public final bdee c;

    public bdei(View view0, bdeq bdeq0, bdee bdee0) {
        this.a = view0;
        this.b = bdeq0;
        this.c = bdee0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((bedv)object0), "blocklistEntriesResource");
        gged_interceptors gged0 = (gged_interceptors)((bedv)object0).b;
        if(gged0 == null) {
            gged0 = ggdx.a(ibps.a);
        }
        else {
            if(!((bedv)object0).c()) {
                gged0 = null;
            }
            if(gged0 == null) {
                gged0 = ggdx.a(ibps.a);
            }
        }
        ((TextView)this.a.findViewById(0x7F0B0CD6)).setText(this.b.getResources().getQuantityString(0x7F130056, gged0.size(), new Object[]{gged0.size()}));  // id:blocklist_title
        this.c.a = gged0;
        this.c.q();
        return ibom.a;
    }
}

