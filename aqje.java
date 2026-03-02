import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.backup.base.SetBackupAccountChimeraActivity;
import j..util.Objects;

public final class aqje extends ArrayAdapter {
    final SetBackupAccountChimeraActivity a;
    private final LayoutInflater b;
    private final String[] c;
    private final Drawable d;
    private final Drawable e;
    private final int f;
    private float g;

    public aqje(SetBackupAccountChimeraActivity setBackupAccountChimeraActivity0, Context context0, String[] arr_s, Drawable drawable0, Drawable drawable1) {
        Objects.requireNonNull(setBackupAccountChimeraActivity0);
        this.a = setBackupAccountChimeraActivity0;
        super(context0, 0x1090003, arr_s);
        this.g = -1.0f;
        this.c = arr_s;
        this.f = arr_s.length;
        this.d = drawable0;
        this.e = drawable1;
        this.b = (LayoutInflater)context0.getSystemService("layout_inflater");
    }

    @Override  // android.widget.ArrayAdapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        aqjf aqjf0;
        if(view0 == null) {
            view0 = this.b.inflate(0x7F0E003C, null);  // layout:account_row
            aqjf0 = new aqjf();
            aqjf0.b = (TextView)view0.findViewById(0x7F0B2259);  // id:text
            aqjf0.a = (ImageView)view0.findViewById(0x7F0B16B9);  // id:icon
            view0.setTag(aqjf0);
        }
        else {
            aqjf0 = (aqjf)view0.getTag();
        }
        String[] arr_s = this.c;
        aqjf0.b.setText(arr_s[v]);
        if(v == this.f - 1) {
            aqjf0.a.setImageDrawable(this.e);
        }
        else {
            if(v == 0) {
                if((this.g < 0.0f)) {
                    float f = this.getContext().getResources().getDimension(0x7F07006C);  // dimen:abc_text_size_menu_material
                    kim.e(aqjf0.b, 1, ((int)f));
                }
                v = 0;
            }
            gfsx gfsx0 = this.a.m.b(arr_s[v]);
            if(gfsx0.i()) {
                aqjf0.a.setImageBitmap(((Bitmap)gfsx0.d()));
                aqjf0.a.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            else {
                aqjf0.a.setImageDrawable(this.d);
            }
        }
        if((this.g < 0.0f) && viewGroup0.getChildCount() > 0) {
            this.g = ((TextView)viewGroup0.getChildAt(0).findViewById(0x7F0B2259)).getTextSize();  // id:text
        }
        if((this.g > 0.0f)) {
            aqjf0.b.setAutoSizeTextTypeWithDefaults(0);
            aqjf0.b.setTextSize(0, this.g);
        }
        return view0;
    }
}

