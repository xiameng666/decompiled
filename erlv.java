import android.graphics.Bitmap;
import android.os.AsyncTask;
import j..util.Objects;

final class erlv extends AsyncTask {
    final efoa a;
    final erlw b;

    public erlv(erlw erlw0, efoa efoa0) {
        this.a = efoa0;
        Objects.requireNonNull(erlw0);
        this.b = erlw0;
        super();
    }

    @Override  // android.os.AsyncTask
    protected final Object doInBackground(Object[] arr_object) {
        Void[] arr_void = (Void[])arr_object;
        return efoo.a(this.a.b());
    }

    @Override  // android.os.AsyncTask
    protected final void onPostExecute(Object object0) {
        this.b.b.b.put(this.b.a, ((Bitmap)object0));
        for(Object object1: this.b.b.c) {
            ((erlx)object1).a();
        }
    }
}

