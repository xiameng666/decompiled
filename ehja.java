import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import j..util.Objects;

public final class ehja extends AsyncTask {
    final ehjb a;
    private final Context b;
    private final long c;
    private final boolean d;

    public ehja(ehjb ehjb0, long v, boolean z) {
        Objects.requireNonNull(ehjb0);
        this.a = ehjb0;
        super();
        this.b = ehjb0.getContext();
        this.c = v;
        this.d = z;
    }

    @Override  // android.os.AsyncTask
    protected final Object doInBackground(Object[] arr_object) {
        Void[] arr_void = (Void[])arr_object;
        Context context0 = this.b;
        byte[] arr_b = egbx.a(context0, this.c, true);
        if(arr_b == null) {
            return null;
        }
        Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
        if(bitmap0 == null) {
            return null;
        }
        if(this.d) {
            if(bitmap0.getWidth() != bitmap0.getHeight()) {
                bitmap0 = bbrs.b(bitmap0, Math.max(bitmap0.getWidth(), bitmap0.getHeight()));
            }
            bitmap0 = bbrs.a(context0, bitmap0, new Paint());
        }
        return new BitmapDrawable(context0.getResources(), bitmap0);
    }

    @Override  // android.os.AsyncTask
    protected final void onPostExecute(Object object0) {
        super.onPostExecute(((BitmapDrawable)object0));
        ehjb ehjb0 = this.a;
        if(bata.b(Long.valueOf(this.c), ehjb0.b) && this.d == ehjb0.e) {
            ehjb0.d = null;
            ehjb0.c = (BitmapDrawable)object0;
            if(!this.isCancelled() && ((BitmapDrawable)object0) != null) {
                ehjb0.a.setImageDrawable(((BitmapDrawable)object0));
                ehjb0.e();
            }
        }
    }
}

