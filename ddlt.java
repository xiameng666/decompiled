import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.StrictMode;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.io.File;

public final class ddlt extends Drawable {
    private static final int[][] a;
    private final Context b;
    private final Paint c;
    private final int d;
    private final int e;
    private final int f;
    private final ddls g;
    private Bitmap h;
    private final int i;
    private final int j;
    private final int k;
    private final boolean l;
    private boolean m;

    static {
        ddlt.a = new int[][]{new int[]{-20054, -2407369}, new int[]{0xFFFFBAD1, 0xFFE91E63}, new int[]{0xFFF5BFFF, 0xFF9C27B0}, new int[]{0xFFE0CEFF, -10011977}, new int[]{0xFFB2BDFF, 0xFF3F51B5}, new int[]{0xFFBFE9FF, 0xFF039BE5}, new int[]{0xFFB7D2FF, 0xFF4285F4}, new int[]{0xFFC4F9FF, 0xFF0097A7}, new int[]{0xFFD3FFFA, 0xFF009688}, new int[]{0xFFCCFFE6, 0xFF0F9D58}, new int[]{0xFFDAFFBA, 0xFF689F38}, new int[]{-9798, 0xFFEF6C00}, new int[]{-12609, -43230}};
    }

    public ddlt(Context context0, ShareTarget shareTarget0) {
        this(context0, new ddls(shareTarget0.b, shareTarget0.c, shareTarget0.h), ((int)context0.getResources().getDimension(0x7F0710DD)), shareTarget0.d, shareTarget0.n, shareTarget0.q() && shareTarget0.n);  // dimen:sharing_share_target_profile_drawable_size
    }

    public ddlt(Context context0, ddls ddls0, int v, int v1, boolean z, boolean z1) {
        this.m = z;
        this.b = context0;
        this.g = ddls0;
        this.k = v1;
        this.l = z1;
        Paint paint0 = new Paint(1);
        this.c = paint0;
        paint0.setStyle(Paint.Style.FILL);
        paint0.setFilterBitmap(true);
        this.d = djbm.e(context0, ((float)v));
        this.e = djbm.e(context0, ((float)(v / 2)));
        this.f = djbm.e(context0, ((float)(((int)(((double)v) / 2.6)))));
        if(ddls0.c) {
            this.i = z1 ? context0.getColor(0x7F0610E2) : ddlt.a[ddlt.d(ddls0)][0];  // color:sharing_drawable_unknown
            if(z) {
                this.j = context0.getColor(0x7F0610FB);  // color:sharing_self_device_color
                return;
            }
            this.j = ddlt.a[ddlt.d(ddls0)][1];
            return;
        }
        this.i = context0.getColor(0x7F0610E2);  // color:sharing_drawable_unknown
        this.j = context0.getColor(0x7F0610E3);  // color:sharing_drawable_unknown_dark
    }

    private static void a(Canvas canvas0, Context context0, int v, int v1, int v2, int v3) {
        canvas0.drawARGB(0, 0, 0, 0);
        if(v != 1) {
            Paint paint0 = new Paint();
            paint0.setAntiAlias(true);
            paint0.setFilterBitmap(true);
            paint0.setColor(v3);
            float f = ((float)v2) / 2.0f;
            canvas0.drawCircle(f, ((float)v1) / 2.0f, f, paint0);
            return;
        }
        Drawable drawable0 = context0.getResources().getDrawable(0x7F080F11);  // drawable:sharing_wiggly_circle
        drawable0.setTint(v3);
        drawable0.setBounds(0, 0, v2, v1);
        drawable0.draw(canvas0);
    }

    private final void b(Canvas canvas0) {
        Drawable drawable0;
        switch(this.k) {
            case 2: {
                drawable0 = this.b.getDrawable(0x7F080C42);  // drawable:quantum_gm_ic_tablet_vd_theme_24
                break;
            }
            case 3: {
                drawable0 = this.b.getDrawable(0x7F080BAD);  // drawable:quantum_gm_ic_laptop_chromebook_vd_theme_24
                break;
            }
            case 6: {
                drawable0 = this.b.getDrawable(0x7F08058F);  // drawable:gs_head_mounted_device_vd_theme_24
                break;
            }
            default: {
                drawable0 = this.b.getDrawable(0x7F080BED);  // drawable:quantum_gm_ic_phone_android_vd_theme_24
            }
        }
        if(drawable0 == null) {
            return;
        }
        drawable0.applyTheme(this.b.getTheme());
        drawable0.setBounds(0, 0, this.e, this.e);
        drawable0.setTint(this.b.getColor((this.l ? 0x7F061279 : 0x7F06127B)));  // color:textColorPrimary
        int v = ddlt.c(this.m);
        int v1 = this.m ? this.b.getColor(0x7F0610FD) : this.b.getColor(0x7F0610F9);  // color:sharing_self_share_profile_background_color
        ddlt.a(canvas0, this.b, v, this.d, this.d, v1);
        float f = (float)(this.d / 2 - this.e / 2);
        canvas0.drawBitmap(dizk.d(drawable0), f, f, this.c);
    }

    private static final int c(boolean z) {
        return z ? 1 : 0;
    }

    private static int d(ddls ddls0) {
        return Math.abs((ddls0.a.hashCode() == 0x80000000 ? 0 : ddls0.a.hashCode())) % 13;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas0) {
        if(this.h == null) {
            ddls ddls0 = this.g;
            int v = this.d;
            Bitmap bitmap0 = Bitmap.createBitmap(v, v, Bitmap.Config.ARGB_8888);
            Canvas canvas1 = new Canvas(bitmap0);
            Uri uri0 = ddls0.b;
            Bitmap bitmap1 = null;
            if(uri0 != null) {
                Context context0 = this.b;
                Bitmap bitmap2 = dizk.b(context0, uri0);
                if(bitmap2 == null) {
                    if(djad.s(uri0.toString()) && "com.google.android.gms.fileprovider".equals(uri0.getAuthority())) {
                        String s = uri0.getLastPathSegment();
                        if(s != null) {
                            StrictMode.allowThreadDiskWrites();
                            File[] arr_file = djbw.a(context0).listFiles(new djbu(s));
                            if(arr_file == null) {
                                dcvz.a.d().p("Unable to load image cache to delete image", new Object[0]);
                            }
                            else if(arr_file.length == 1) {
                                File file0 = hrnt.k() ? new File(ccsb.a.b(djbw.a(context0), arr_file[0].getName())) : new File(djbw.a(context0), arr_file[0].getName());
                                if(file0.exists() && file0.delete()) {
                                    dcvz.a.d().h("Deleted cached image: %s", file0);
                                }
                                else {
                                    dcvz.a.d().h("Unable to delete cached image: %s", arr_file[0]);
                                }
                            }
                            else {
                                dcvz.a.d().p("Unable to load find file from cache to delete image", new Object[0]);
                            }
                        }
                    }
                    dcvz.a.a().h("Failed to read bitmap from %s", uri0);
                }
                else {
                    Bitmap bitmap3 = Bitmap.createScaledBitmap(bitmap2, v, v, false);
                    int v1 = ddlt.c(this.m);
                    bitmap1 = Bitmap.createBitmap(bitmap3.getWidth(), bitmap3.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmap1);
                    ddlt.a(canvas2, context0, v1, bitmap3.getHeight(), bitmap3.getWidth(), 0xFF000000);
                    Paint paint0 = new Paint();
                    paint0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    Rect rect0 = new Rect(0, 0, bitmap3.getWidth(), bitmap3.getHeight());
                    canvas2.drawBitmap(bitmap3, rect0, rect0, paint0);
                }
            }
            if(this.l) {
                this.b(canvas1);
            }
            else if(!ddls0.c) {
                this.b(canvas1);
            }
            else if(bitmap1 != null) {
                this.c.setColor(-1);
                canvas1.drawBitmap(bitmap1, 0.0f, 0.0f, this.c);
            }
            else if(this.m) {
                this.b(canvas1);
            }
            else {
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.appendCodePoint(ddls0.a.codePointAt(ddls0.a.offsetByCodePoints(0, 0)));
                this.c.setColor(this.j);
                this.c.setTextSize(((float)this.f));
                this.c.setTextAlign(Paint.Align.CENTER);
                float f = ((float)v) - this.c.descent() - this.c.ascent();
                ddlt.a(canvas1, this.b, ddlt.c(this.m), v, v, this.i);
                canvas1.drawText(stringBuilder0.toString(), ((float)(v / 2)), ((float)(((int)(f / 2.0f)))), this.c);
            }
            this.h = bitmap0;
        }
        canvas0.drawBitmap(this.h, 0.0f, 0.0f, this.c);
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.c.getAlpha();
    }

    @Override  // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.c.getColorFilter();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.d;
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.d;
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setAlpha(int v) {
        this.c.setAlpha(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter0) {
        this.c.setColorFilter(colorFilter0);
    }
}

