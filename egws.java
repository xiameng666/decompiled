import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

final class egws extends uq {
    final ProgressBar A;
    final Button B;
    final View C;
    public static final int D;
    final ImageView t;
    final TextView u;
    final TextView v;
    final TextView w;
    final ImageView x;
    final TextView y;
    final ImageView z;

    public egws(ViewGroup viewGroup0) {
        super(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E01C8, viewGroup0, false));  // layout:card_layout_3_gm3
        this.t = (ImageView)this.a.findViewById(0x7F0B16B9);  // id:icon
        this.u = (TextView)this.a.findViewById(0x7F0B22B8);  // id:title
        this.w = (TextView)this.a.findViewById(0x7F0B20C7);  // id:status
        this.x = (ImageView)this.a.findViewById(0x7F0B20CF);  // id:status_icon
        this.v = (TextView)this.a.findViewById(0x7F0B0CD7);  // id:body
        this.y = (TextView)this.a.findViewById(0x7F0B0DC3);  // id:button_text
        this.B = (Button)this.a.findViewById(0x7F0B0D7D);  // id:button
        ImageView imageView0 = (ImageView)this.a.findViewById(0x7F0B0BE5);  // id:arrow_icon
        this.z = imageView0;
        imageView0.setImageResource(0x7F080D5A);  // drawable:quantum_ic_keyboard_arrow_right_vd_theme_24
        this.A = (ProgressBar)this.a.findViewById(0x7F0B1D35);  // id:progress_bar
        this.C = this.a.findViewById(0x7F0B0FAF);  // id:constraint_layout
    }
}

