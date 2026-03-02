import android.os.AsyncTask;
import j..util.Objects;

final class flpx extends AsyncTask {
    final flpz a;

    public flpx(flpz flpz0) {
        Objects.requireNonNull(flpz0);
        this.a = flpz0;
        super();
    }

    @Override  // android.os.AsyncTask
    protected final Object doInBackground(Object[] arr_object) {
        Void[] arr_void = (Void[])arr_object;
        flbo.b();
        flpv flpv0 = new flpv(this.a.k);
        return flng.a(this.a.k.d, flpv0);
    }

    @Override  // android.os.AsyncTask
    protected final void onPostExecute(Object object0) {
        flpz flpz0 = this.a;
        flpz0.commitContentChanged();
        flpz0.j = false;
        if(flpz0.isStarted()) {
            flbj.a("DatabaseUriMonitor", "delivering: " + flpz0.b);
            flpz0.k.c(object0);
        }
    }
}

