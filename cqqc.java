import android.os.AsyncTask;

public class cqqc extends AsyncTask {
    protected void a(Boolean boolean0) {
        throw new UnsupportedOperationException("Must override this method.");
    }

    protected Boolean b() {
        throw new UnsupportedOperationException("Must override this method.");
    }

    @Override  // android.os.AsyncTask
    protected Object doInBackground(Object[] arr_object) {
        Void[] arr_void = (Void[])arr_object;
        return this.b();
    }

    @Override  // android.os.AsyncTask
    protected void onPostExecute(Object object0) {
        this.a(((Boolean)object0));
    }
}

