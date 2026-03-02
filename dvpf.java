import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.graphics.Paint;
import android.graphics.Typeface;
import j..util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;

public final class dvpf {
    public static final int a;
    private static final Typeface b;
    private static final ConcurrentHashMap c;

    static {
        bboh.b("Pay", bbcu.cZ);
        dvpf.b = Typeface.create("google-sans-text-medium", 0);
        dvpf.c = new ConcurrentHashMap();
    }

    public static final Bitmap a(Context context0, gukv gukv0, gubi gubi0, int v, int v1) {
        String s2;
        Bitmap bitmap1;
        guey guey0;
        ibuq.f(context0, "context");
        ibuq.f(gukv0, "passLogo");
        ibuq.f(gubi0, "colorProfile");
        String s = v + "-" + v1;
        ConcurrentHashMap concurrentHashMap0 = dvpf.c;
        Bitmap bitmap0 = (Bitmap)concurrentHashMap0.get(s);
        if(bitmap0 == null) {
            bitmap0 = Bitmap.createBitmap(v, v1, Bitmap.Config.ARGB_8888);
            ibuq.e(bitmap0, "createBitmap(...)");
            concurrentHashMap0.put(s, bitmap0);
        }
        Canvas canvas0 = new Canvas(bitmap0);
        Paint paint0 = new Paint();
        paint0.setColor(fsbm.a((gubi0.d == null ? hjie.a : gubi0.d)).intValue());
        paint0.setTypeface(dvpf.b);
        paint0.setTextSize(((float)v) / 2.0f);
        paint0.setTextAlign(Paint.Align.CENTER);
        canvas0.drawRoundRect(0.0f, 0.0f, ((float)v), ((float)v1), ((float)v) / 32.0f, ((float)v) / 32.0f, paint0);
        if((gukv0.b & 1) == 0) {
            String s1 = gukv0.c;
            ibuq.e(s1, "getUrl(...)");
            if(s1.length() == 0) {
                goto label_51;
            }
            else {
                goto label_21;
            }
        }
        else {
        label_21:
            if(fsce.a(context0) && ((gukv0.f == null ? guez.a : gukv0.f).b & 2) != 0) {
                guey0 = (gukv0.f == null ? guez.a : gukv0.f).d;
                if(guey0 == null) {
                    guey0 = guey.a;
                }
            }
            else {
                guey0 = (gukv0.f == null ? guez.a : gukv0.f).c;
                if(guey0 == null) {
                    guey0 = guey.a;
                }
            }
            ibuq.c(guey0);
            hfuo hfuo0 = guey0.e;
            ibuq.e(hfuo0, "getRemoteResourceList(...)");
            if(hfuo0.isEmpty()) {
                String s3 = gukv0.c;
                ibuq.e(s3, "getUrl(...)");
                if(s3.length() > 0) {
                    s2 = gukv0.c;
                label_43:
                    ibuq.c(s2);
                    tyb tyb0 = txc.d(context0);
                    ibuq.d(tyb0, "null cannot be cast to non-null type com.bumptech.glide.RequestManager");
                    ibuq.f(tyb0, "requestManager");
                    ibuq.f(s2, "url");
                    try {
                        int v2 = (int)(((float)v) / 2.0f);
                        bitmap1 = (Bitmap)((txx)((txx)tyb0.b().h(s2).s(udf.a)).q()).m(v2, v2).get();
                        goto label_52;
                    }
                    catch(ExecutionException | InterruptedException unused_ex) {
                    }
                    goto label_51;
                }
                else {
                label_51:
                    bitmap1 = null;
                }
            }
            else {
                gufg gufg0 = (gufg)guey0.e.get(0);
                s2 = gufg0.c == 3 ? ((String)gufg0.d) : "";
                goto label_43;
            }
        }
    label_52:
        String s4 = dspe.c(new String[]{gukv0.d});
        if(!ibzk.D(s4) || bitmap1 != null) {
            Paint paint1 = new Paint();
            paint1.setColor(fsbm.a((gubi0.g == null ? hjie.a : gubi0.g)).intValue());
            canvas0.drawCircle(((float)v) / 2.0f, ((float)v1) / 2.0f, ((float)v) / 4.0f, paint1);
            if(bitmap1 == null) {
                canvas0.drawText(s4, ((float)v) / 2.0f, ((float)v1) / 2.0f - (paint0.descent() + paint0.ascent()) / 2.0f, paint0);
            }
            else {
                canvas0.drawBitmap(bitmap1, ((float)v) / 2.0f - ((float)v) / 4.0f, ((float)v1) / 2.0f - ((float)v) / 4.0f, null);
            }
        }
        Bitmap bitmap2 = bitmap0.copy(Bitmap.Config.ARGB_8888, false);
        ibuq.e(bitmap2, "copy(...)");
        return bitmap2;
    }
}

