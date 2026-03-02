import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class acea extends uq {
    public final TextView A;
    public final TextView B;
    public final View C;
    public final ImageView D;
    public final View E;
    public final TextView F;
    public final View u;
    public final View v;
    public final ehjb w;
    public final View x;
    public final ImageView y;
    public final ImageView z;

    public acea(View view0) {
        super(view0);
        this.u = view0.findViewById(0x7F0B0FCE);  // id:container
        this.v = view0.findViewById(0x7F0B0C38);  // id:avatar_frame
        ViewGroup viewGroup0 = (ViewGroup)view0.findViewById(0x7F0B0C35);  // id:avatar_container
        if(viewGroup0 == null) {
            this.w = null;
        }
        else {
            if(viewGroup0.getChildCount() == 0) {
                ehjb ehjb0 = new ehjb(viewGroup0.getContext());
                this.w = ehjb0;
                viewGroup0.addView(ehjb0, new ViewGroup.LayoutParams(-1, -1));
            }
            else {
                this.w = (ehjb)viewGroup0.getChildAt(0);
            }
            this.w.f();
        }
        this.x = view0.findViewById(0x7F0B1FB0);  // id:selector_container
        this.y = (ImageView)view0.findViewById(0x7F0B1FAF);  // id:selector
        this.z = (ImageView)view0.findViewById(0x7F0B0FBE);  // id:contact_method
        this.A = (TextView)view0.findViewById(0x7F0B19AA);  // id:name
        this.B = (TextView)view0.findViewById(0x7F0B1FA7);  // id:selected_name
        this.F = (TextView)view0.findViewById(0x7F0B0FB4);  // id:contact_detail
        this.C = view0.findViewById(0x7F0B0E99);  // id:channel_switcher
        this.D = (ImageView)view0.findViewById(0x7F0B0E9A);  // id:channel_switcher_icon
        this.E = view0.findViewById(0x7F0B1163);  // id:disabled_overlay
    }
}

