import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.update.ChimeraUpdateFromSdCardActivity;
import j..util.Objects;

public final class ezty implements AdapterView.OnItemClickListener {
    final ezug a;
    final ChimeraUpdateFromSdCardActivity b;

    public ezty(ChimeraUpdateFromSdCardActivity chimeraUpdateFromSdCardActivity0, ezug ezug0) {
        this.a = ezug0;
        Objects.requireNonNull(chimeraUpdateFromSdCardActivity0);
        this.b = chimeraUpdateFromSdCardActivity0;
        super();
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        String s = ((TextView)view0.findViewById(0x7F0B177E)).getText().toString();  // id:item_text
        ChimeraUpdateFromSdCardActivity chimeraUpdateFromSdCardActivity0 = this.b;
        View view1 = chimeraUpdateFromSdCardActivity0.m;
        if(view1 != null) {
            view1.setBackgroundColor(0);
        }
        chimeraUpdateFromSdCardActivity0.m = view0;
        chimeraUpdateFromSdCardActivity0.l = s;
        if(s.endsWith("/")) {
            chimeraUpdateFromSdCardActivity0.q.add(s);
            chimeraUpdateFromSdCardActivity0.f();
            return;
        }
        view0.setBackgroundColor(chimeraUpdateFromSdCardActivity0.getResources().getColor(0x7F06126C));  // color:system_update_file_browser_highlight_color
        this.a.a = v;
        ((Button)chimeraUpdateFromSdCardActivity0.n.findViewById(0x7F0B13CD)).setEnabled(true);  // id:file_browser_ok_button
    }
}

