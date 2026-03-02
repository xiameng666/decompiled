import android.os.AsyncTask;

final class ganl extends AsyncTask implements Runnable {
    public gann a;
    ganp b;
    gano c;
    public boolean d;
    long e;
    gamy f;

    private final void a(ganp ganp0) {
        if(!this.d) {
            this.d = true;
            this.b = ganp0;
            gann gann0 = this.a;
            if(gann0 != null) {
                gann0.D();
            }
        }
    }

    @Override  // android.os.AsyncTask
    protected final Object doInBackground(Object[] arr_object) {
        gamy gamy0 = this.f;
        gano gano0 = this.c;
        gavs.g(gano0, "BE_AEFT_05", null);
        this.f = null;
        this.c = null;
        gavs.g(gamy0, "BE_AEFT_06", null);
        return gamy0.a(gano0);
    }

    @Override  // android.os.AsyncTask
    protected final void onPostExecute(Object object0) {
        if(this.e != -1L) {
            gann.A().removeCallbacks(this);
        }
        this.a(((ganp)object0));
    }

    @Override  // android.os.AsyncTask
    protected final void onPreExecute() {
        if(this.e != -1L) {
            gann.A().postDelayed(this, this.e);
        }
    }

    @Override
    public final void run() {
        this.cancel(true);
        this.a(new ganp(ganp.e(4)));
    }
}

