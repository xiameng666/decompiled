import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

final class ermj extends ArrayAdapter {
    private final int a;

    public ermj(Context context0, int v) {
        super(context0, v, new ArrayList());
        this.a = v;
    }

    @Override  // android.widget.ArrayAdapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        if(view0 == null) {
            view0 = LayoutInflater.from(this.getContext()).inflate(this.a, viewGroup0, false);
        }
        ermk ermk0 = (ermk)this.getItem(v);
        TextView textView0 = (TextView)view0.findViewById(0x7F0B22B8);  // id:title
        int v1 = TextUtils.isEmpty(ermk0.b) || ermk0.b.equalsIgnoreCase(ermk0.a) ? 0 : 1;
        textView0.setVisibility((1 == v1 ? 0 : 8));
        if(v1 != 0) {
            textView0.setText(ermk0.b);
            if(ermk0.d) {
                textView0.setAlpha(0.5f);
            }
        }
        TextView textView1 = (TextView)view0.findViewById(0x7F0B2121);  // id:subtitle
        textView1.setText(ermk0.a);
        textView1.setVisibility(0);
        if(ermk0.d) {
            textView1.setAlpha(0.5f);
        }
        ImageView imageView0 = (ImageView)view0.findViewById(0x7F0B16E3);  // id:image
        Bitmap bitmap0 = ermk0.c;
        if(bitmap0 == null) {
            imageView0.setImageResource(0x7F080A57);
        }
        else {
            imageView0.setImageBitmap(bitmap0);
        }
        if(ermk0.d) {
            imageView0.setAlpha(0.5f);
        }
        return view0;
    }
}

