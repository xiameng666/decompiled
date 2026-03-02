import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.RippleDrawable;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class fmoo extends LinearLayout {
    private final TextView a;
    private final ImageView b;

    public fmoo(Context context0) {
        super(fmrf.b(context0, iaea.j()), null, 0);
        fmoo.inflate(this.getContext(), 0x7F0E0C28, this);  // layout:vertical_layout_buttons
        this.a = (TextView)this.findViewById(0x7F0B117A);  // id:display_text
        this.b = (ImageView)this.findViewById(0x7F0B1177);  // id:display_icon
        this.setOrientation(1);
        this.setClickable(true);
    }

    public final void a(fmlm fmlm0, fmqf fmqf0, fmrq fmrq0) {
        this.a.setText(fmlm0.c);
        fmfh fmfh0 = fmlm0.b;
        byte[] arr_b = fmfh0.a;
        if(arr_b.length == 0) {
            Bitmap bitmap1 = BitmapFactory.decodeByteArray(fmlm0.a, 0, fmlm0.a.length);
            this.b.setImageBitmap(bitmap1);
        }
        else {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.b.getLayoutParams();
            viewGroup$LayoutParams0.height = fmro.a(this.getContext(), ((float)fmfh0.c));
            viewGroup$LayoutParams0.width = fmro.a(this.getContext(), ((float)fmfh0.b));
            this.b.setLayoutParams(viewGroup$LayoutParams0);
            Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
            this.b.setImageBitmap(bitmap0);
        }
        this.setBackground(((RippleDrawable)this.getContext().getDrawable(0x7F081007)));  // drawable:vertical_button_ripple
        this.setOnClickListener(new fmon(fmqf0, fmlm0));
        fmrq0.a(String.valueOf(fmlm0.d.e));
    }
}

