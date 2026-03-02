import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

final class pb {
    public final int[] a;
    public final int[] b;
    public final int[] c;
    public final int[] d;
    public final int[] e;
    public final int[] f;

    public pb() {
        this.a = new int[]{0x7F0801C4, 0x7F0801C2, 0x7F080171};
        this.b = new int[]{0x7F08018A, 0x7F0801AF, 0x7F080191, 0x7F08018C, 0x7F08018D, 0x7F080190, 0x7F08018F};  // drawable:abc_seekbar_tick_mark_material
        this.c = new int[]{0x7F0801C1, 0x7F0801C3, 0x7F080182, 0x7F0801BD, 0x7F0801BE, 0x7F0801BF, 0x7F0801C0};  // drawable:abc_text_cursor_material
        this.d = new int[]{0x7F0801A5, 0x7F080180, 0x7F0801A4};  // drawable:abc_cab_background_internal_bg
        this.e = new int[]{0x7F0801BB, 0x7F0801C5};  // drawable:abc_tab_indicator_material
        this.f = new int[]{0x7F080174, 0x7F08017A, 0x7F080175, 0x7F08017B};  // drawable:abc_btn_check_material
    }

    public static final boolean a(int[] arr_v, int v) {
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(arr_v[v1] == v) {
                return true;
            }
        }
        return false;
    }

    public static final ColorStateList b(Context context0, int v) {
        int v1 = wd.b(context0, 0x7F0402BE);  // attr:colorControlHighlight
        int v2 = wd.a(context0, 0x7F0402A0);  // attr:colorButtonNormal
        int v3 = jxm.f(v1, v);
        int v4 = jxm.f(v1, v);
        return new ColorStateList(new int[][]{wd.a, wd.c, wd.b, wd.e}, new int[]{v2, v3, v4, v});
    }

    public static final LayerDrawable c(ut ut0, Context context0, int v) {
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable1;
        BitmapDrawable bitmapDrawable0;
        int v1 = context0.getResources().getDimensionPixelSize(v);
        Drawable drawable0 = ut0.c(context0, 0x7F0801B7);  // drawable:abc_star_black_48dp
        Drawable drawable1 = ut0.c(context0, 0x7F0801B8);  // drawable:abc_star_half_black_48dp
        if((drawable0 instanceof BitmapDrawable) && drawable0.getIntrinsicWidth() == v1 && drawable0.getIntrinsicHeight() == v1) {
            bitmapDrawable0 = (BitmapDrawable)drawable0;
            bitmapDrawable1 = new BitmapDrawable(bitmapDrawable0.getBitmap());
        }
        else {
            Bitmap bitmap0 = Bitmap.createBitmap(v1, v1, Bitmap.Config.ARGB_8888);
            Canvas canvas0 = new Canvas(bitmap0);
            drawable0.setBounds(0, 0, v1, v1);
            drawable0.draw(canvas0);
            bitmapDrawable0 = new BitmapDrawable(bitmap0);
            bitmapDrawable1 = new BitmapDrawable(bitmap0);
        }
        bitmapDrawable1.setTileModeX(Shader.TileMode.REPEAT);
        if((drawable1 instanceof BitmapDrawable) && drawable1.getIntrinsicWidth() == v1 && drawable1.getIntrinsicHeight() == v1) {
            bitmapDrawable2 = (BitmapDrawable)drawable1;
        }
        else {
            Bitmap bitmap1 = Bitmap.createBitmap(v1, v1, Bitmap.Config.ARGB_8888);
            Canvas canvas1 = new Canvas(bitmap1);
            drawable1.setBounds(0, 0, v1, v1);
            drawable1.draw(canvas1);
            bitmapDrawable2 = new BitmapDrawable(bitmap1);
        }
        LayerDrawable layerDrawable0 = new LayerDrawable(new Drawable[]{bitmapDrawable0, bitmapDrawable2, bitmapDrawable1});
        layerDrawable0.setId(0, 0x1020000);
        layerDrawable0.setId(1, 0x102000F);
        layerDrawable0.setId(2, 0x102000D);
        return layerDrawable0;
    }

    public static final void d(Drawable drawable0, int v, PorterDuff.Mode porterDuff$Mode0) {
        Drawable drawable1 = drawable0.mutate();
        if(porterDuff$Mode0 == null) {
            porterDuff$Mode0 = pc.a;
        }
        drawable1.setColorFilter(pc.b(v, porterDuff$Mode0));
    }
}

