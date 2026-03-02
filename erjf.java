import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.setupdesign.GlifLayout;

public final class erjf extends du {
    public erje a;
    private String b;
    private GlifLayout c;

    @Override  // du
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        try {
            this.a = (erje)context0;
        }
        catch(ClassCastException classCastException0) {
            throw new RuntimeException("Containing activity must implement InstallAppFragment.Listener", classCastException0);
        }
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Bundle bundle1 = this.getArguments();
        batl.s(bundle1);
        String s = bundle1.getString("smartdevice.message");
        batl.s(s);
        this.b = s;
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        Context context0 = this.getContext();
        batl.s(context0);
        GlifLayout glifLayout0 = (GlifLayout)layoutInflater0.inflate(0x7F0E09D8, viewGroup0, false);  // layout:smartdevice_app_install_confirm
        this.c = glifLayout0;
        gaff gaff0 = (gaff)glifLayout0.t(gaff.class);
        gafg gafg0 = new gafg(context0);
        gafg0.b(0x7F150874);  // string:common_install "Install"
        gafg0.c = 5;
        gafg0.d = 0x7F1608FE;  // style:SudGlifButton.Primary
        gafh gafh0 = gafg0.a();
        gafg gafg1 = new gafg(context0);
        gafg1.b(0x7F1508A3);  // string:common_no_thanks "No thanks"
        gafg1.c = 7;
        gafg1.d = 0x7F1608FF;  // style:SudGlifButton.Secondary
        gafh gafh1 = gafg1.a();
        gaff0.c(gafh0);
        gaff0.d(gafh1);
        return this.c;
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        this.c.L(0x7F152E87);  // string:smartdevice_install_app "Install the app"
        ((TextView)this.c.findViewById(0x7F0B18F0)).setText(this.b);  // id:message
        gaff gaff0 = (gaff)this.c.t(gaff.class);
        gafh gafh0 = gaff0.k;
        gafh0.f = new erjc(this);
        gafh gafh1 = gaff0.l;
        gafh1.f = new erjd(this);
    }
}

