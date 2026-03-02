import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.List;

public abstract class gbmq extends ArrayAdapter {
    public gbmq(Context context0, List list0) {
        super(context0, -1, list0);
    }

    public abstract CharSequence a(Object arg1);

    public abstract void b(View arg1, int arg2);

    public void c() {
    }

    @Override  // android.widget.ArrayAdapter
    public final View getDropDownView(int v, View view0, ViewGroup viewGroup0) {
        return this.getView(v, view0, viewGroup0);
    }
}

