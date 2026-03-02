import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public final class dxkg extends uq {
    public final bboh t;
    public final Context u;
    public final ImageView v;
    public final TextView w;
    public final TextView x;
    final dxkh y;

    public dxkg(dxkh dxkh0, View view0) {
        ibuq.f(view0, "passView");
        this.y = dxkh0;
        super(view0);
        this.t = bboh.b("Pay", bbcu.cZ);
        Context context0 = view0.getContext();
        ibuq.e(context0, "getContext(...)");
        this.u = context0;
        View view1 = view0.findViewById(0x7F0B0823);  // id:StartIcon
        ibuq.e(view1, "findViewById(...)");
        this.v = (ImageView)view1;
        View view2 = view0.findViewById(0x7F0B08C5);  // id:TitleText
        ibuq.e(view2, "findViewById(...)");
        this.w = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B0857);  // id:SubtitleText
        ibuq.e(view3, "findViewById(...)");
        this.x = (TextView)view3;
    }
}

