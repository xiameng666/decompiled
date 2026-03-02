import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.wearable.AppTheme;
import java.util.List;

final class fcgn extends ArrayAdapter {
    private final LayoutInflater a;
    private final List b;
    private final fcfy c;
    private float d;

    public fcgn(Context context0, List list0, fcfy fcfy0, AppTheme appTheme0) {
        super(context0, 0x7F0B2420, list0);  // id:user_name
        this.d = -1.0f;
        this.b = list0;
        this.c = fcfy0;
        Object object0 = context0.getSystemService("layout_inflater");
        gftb.check(object0);
        this.a = fczo.c(appTheme0, ((LayoutInflater)object0));
    }

    @Override  // android.widget.ArrayAdapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        fcgo fcgo0;
        List list0 = this.b;
        Object[] arr_object = {baun.q(((fexs)list0.get(v)).c)};
        fcgp.a.h("Displaying account: %s", arr_object);
        if(view0 == null) {
            view0 = this.a.inflate(0x7F0E021C, viewGroup0, false);  // layout:companion_backup_account_picker_item
            fcgo0 = new fcgo();
            fcgo0.b = (TextView)view0.findViewById(0x7F0B2420);  // id:user_name
            fcgo0.a = (ImageView)view0.findViewById(0x7F0B241C);  // id:user_avatar
            view0.setTag(fcgo0);
        }
        else {
            Object object0 = view0.getTag();
            gftb.check(object0);
            fcgo0 = (fcgo)object0;
        }
        String s = ((fexs)list0.get(v)).c;
        fcgo0.b.setText(s);
        this.c.a(s, fcgo0.a);
        if((this.d < 0.0f) && viewGroup0.getChildCount() > 0) {
            this.d = ((TextView)viewGroup0.getChildAt(0).findViewById(0x7F0B2420)).getTextSize();  // id:user_name
        }
        if((this.d > 0.0f)) {
            fcgo0.b.setAutoSizeTextTypeWithDefaults(0);
            fcgo0.b.setTextSize(0, this.d);
        }
        return view0;
    }
}

