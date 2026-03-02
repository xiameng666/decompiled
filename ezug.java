import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public final class ezug extends BaseAdapter {
    public int a;
    private final List b;
    private final LayoutInflater c;

    public ezug(LayoutInflater layoutInflater0, List list0) {
        this.a = -1;
        this.c = layoutInflater0;
        this.b = list0;
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.b.size();
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.b.get(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return (long)v;
    }

    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        View view1 = this.c.inflate(0x7F0E0B4E, viewGroup0, false);  // layout:system_update_file_browser_list_item
        ImageView imageView0 = (ImageView)view1.findViewById(0x7F0B1E89);  // id:right_image
        TextView textView0 = (TextView)view1.findViewById(0x7F0B177E);  // id:item_text
        imageView0.setVisibility(8);
        String s = (String)this.b.get(v);
        textView0.setText(s);
        if(s.endsWith("/")) {
            imageView0.setVisibility(0);
        }
        if(v == this.a) {
            view1.setBackgroundColor(0x7F06126C);  // color:system_update_file_browser_highlight_color
        }
        return view1;
    }
}

