import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.quickstart.XosLaunchParameters;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.view.InfoFooterView;

public final class eree extends du {
    private String a;
    private String b;
    private GlifLayout c;

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Bundle bundle1 = this.getArguments();
        if(bundle1 == null) {
            bundle1 = Bundle.EMPTY;
        }
        this.a = bundle1.getString("title");
        this.b = bundle1.getString("deeplinkUrl");
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        GlifLayout glifLayout0 = (GlifLayout)layoutInflater0.inflate(0x7F0E09F6, viewGroup0, false);  // layout:smartdevice_xos_manual_fragment
        this.c = glifLayout0;
        String s = this.a;
        if(s != null) {
            glifLayout0.b(s);
        }
        ((InfoFooterView)this.c.findViewById(0x7F0B1713)).a(Html.fromHtml(this.getString(0x7F152EE4, new Object[]{((int)26)})));  // id:info_footer_view
        if(!TextUtils.isEmpty(this.b)) {
            this.y(this.b);
        }
        return this.c;
    }

    public final void y(String s) {
        XosLaunchParameters xosLaunchParameters0 = XosLaunchParameters.a(Uri.parse(s));
        ((TextView)this.c.findViewById(0x7F0B1FBE)).setText(gfqz.d(xosLaunchParameters0.c));  // id:session_id
        ((TextView)this.c.findViewById(0x7F0B1BCA)).setText(gfqz.d(xosLaunchParameters0.d));  // id:passcode
    }
}

