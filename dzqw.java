import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public final class dzqw {
    public static final void a(Context context0, String s, String s1, String s2) {
        int v = 0x7F1609B7;  // style:SuwMaterialYouAlertDialogTheme.Light
        ibuq.f(s, "title");
        ibuq.f(s1, "message");
        ibuq.f(s2, "buttonText");
        if(jys.d() && gaec.t(context0)) {
            if(gaec.x(context0) && fsce.a(context0)) {
                v = 0x7F1609B6;  // style:SuwMaterialYouAlertDialogTheme
            }
            fyju fyju0 = new fyju(context0, v);
            fyju0.O(s);
            fyju0.D(s1);
            fyju0.M(s2, new dzqu());
            fyju0.create().show();
            return;
        }
        View view0 = LayoutInflater.from(context0).inflate(0x7F0E0AF9, null);  // layout:suw_emoney_message_dialog
        ((TextView)view0.findViewById(0x7F0B0352)).setText(s);  // id:DialogTitle
        ((TextView)view0.findViewById(0x7F0B034E)).setText(s1);  // id:DialogMessage
        ((TextView)view0.findViewById(0x7F0B034F)).setText(s2);  // id:DialogPositiveButton
        iv iv0 = new iv(context0);
        iv0.setView(view0);
        iw iw0 = iv0.create();
        ((TextView)view0.findViewById(0x7F0B034F)).setOnClickListener(new dzqv(iw0));  // id:DialogPositiveButton
        iw0.show();
    }
}

