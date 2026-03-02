import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.AppCompatImageView;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView.ScaleType;

public final class fmnc extends AppCompatImageView implements fmrd {
    public fmmw a;
    public boolean b;
    public final int c;
    private int d;
    private final Handler e;

    public fmnc(Context context0) {
        super(fmrf.b(context0, iaea.j()), null, 0);
        this.b = false;
        this.e = new Handler(Looper.getMainLooper());
        this.c = iaea.j() ? this.getContext().getColor((fmrf.d(this.getContext()) ? 0x7F06085A : 0x7F060859)) : this.getContext().getColor(0x7F06085B);  // color:image_background_light
        if(!iaea.r()) {
            this.setBackgroundColor(this.c);
        }
        this.setAdjustViewBounds(false);
        this.setFocusable(true);
    }

    public final void a(fmlr fmlr0, fmga fmga0) {
        this.d = fmro.a(this.getContext(), (fmlr0.c > 0 ? ((float)fmlr0.c) : 112.0f));
        this.setContentDescription(fmlr0.d);
        if(iaea.i()) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
            viewGroup$LayoutParams0.width = -1;
            viewGroup$LayoutParams0.height = this.d;
            this.setLayoutParams(viewGroup$LayoutParams0);
        }
        else {
            this.setLayoutParams(new ViewGroup.LayoutParams(-1, this.d));
        }
        ByteString hfsf0 = fmlr0.b;
        if(!hfsf0.isEmpty()) {
            byte[] arr_b = hfsf0.toByteArray();
            Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
            if(bitmap0 != null) {
                this.setImageBitmap(bitmap0);
                if(iaea.r()) {
                    this.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    this.setBackgroundColor(-1);
                }
                else {
                    this.setScaleType(ImageView.ScaleType.CENTER_CROP);
                }
                this.b = true;
            }
        }
        fmmw fmmw0 = this.a;
        if(fmmw0 != null) {
            fmmy fmmy0 = new fmmy(((fmna)fmmw0), fmga0, fmlr0);
            fmna.a.e(fmmy0);
        }
    }

    @Override  // fmrd
    public final void aL(Object object0) {
        throw null;
    }

    public final void b(String s) {
        fmnb fmnb0 = new fmnb(this, BitmapFactory.decodeFile(s), s);
        this.e.post(fmnb0);
    }
}

