import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

final class egwt extends uq {
    final ImageView t;
    final ImageView u;
    public static final int v;

    public egwt(ViewGroup viewGroup0) {
        super(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0247, viewGroup0, false));  // layout:contacts_sync_core_list_single_line
        ImageView imageView0 = (ImageView)this.a.findViewById(0x7F0B1826);  // id:list_left_icon
        this.t = imageView0;
        TextView textView0 = (TextView)this.a.findViewById(0x7F0B1824);  // id:list_item_text
        ImageView imageView1 = (ImageView)this.a.findViewById(0x7F0B182C);  // id:list_right_icon
        this.u = imageView1;
        imageView0.setImageResource(0x7F080B42);  // drawable:quantum_gm_ic_delete_vd_theme_24
        imageView1.setImageResource(0x7F080BAF);  // drawable:quantum_gm_ic_launch_vd_theme_24
    }
}

