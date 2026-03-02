import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public final class dxuu extends ArrayAdapter {
    public final int a;
    private final gged_interceptors b;
    private final String c;
    private final LayoutInflater d;
    private boolean e;

    public dxuu(Context context0, String s, List list0, long v) {
        int v1;
        boolean z = false;
        super(context0, 0);
        this.c = s;
        this.d = LayoutInflater.from(context0);
        this.b = gged_interceptors.i(list0);
        if(list0.isEmpty()) {
            v1 = 0;
        }
        else {
            long v2 = Math.abs(((long)(((Long)list0.get(0)))) - v);
            v1 = 0;
            for(int v3 = 1; v3 < list0.size(); ++v3) {
                long v4 = Math.abs(((long)(((Long)list0.get(v3)))) - v);
                int v5 = Long.compare(v4, v2);
                if(v5 < 0) {
                    v1 = v3;
                }
                if(v5 < 0) {
                    v2 = v4;
                }
            }
        }
        this.a = v1;
        if(v1 >= 4) {
            z = true;
        }
        this.e = z;
    }

    public final Long a(int v) {
        return (Long)this.b.get(v);
    }

    public final boolean b(int v) {
        if(v == 4 && !this.e) {
            this.e = true;
            this.notifyDataSetChanged();
            return true;
        }
        return false;
    }

    private final View c(int v, View view0, ViewGroup viewGroup0) {
        if(view0 == null) {
            view0 = this.d.inflate(0x7F0E0084, viewGroup0, false);  // layout:amount_item
        }
        TextView textView0 = (TextView)view0.findViewById(0x7F0B0073);  // id:Amount
        if(v == 4) {
            if(this.e) {
                v = 4;
                textView0.setText(fscd.c(edok.a(((Long)this.b.get(v)).longValue(), this.c)));
                return view0;
            }
            textView0.setText("More options");
            return view0;
        }
        textView0.setText(fscd.c(edok.a(((Long)this.b.get(v)).longValue(), this.c)));
        return view0;
    }

    @Override  // android.widget.ArrayAdapter
    public final int getCount() {
        return this.e ? this.b.size() : Math.min(5, this.b.size());
    }

    @Override  // android.widget.ArrayAdapter
    public final View getDropDownView(int v, View view0, ViewGroup viewGroup0) {
        return this.c(v, view0, viewGroup0);
    }

    @Override  // android.widget.ArrayAdapter
    public final Object getItem(int v) {
        return this.a(v);
    }

    @Override  // android.widget.ArrayAdapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        return this.c(v, view0, viewGroup0);
    }
}

