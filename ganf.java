import android.os.AsyncTask;

final class ganf extends AsyncTask implements Runnable {
    public gani a;
    ganp b;
    gano c;
    public boolean d;
    long e;
    gamy f;

    private final void a(ganp ganp0) {
        if(!this.d) {
            this.d = true;
            this.b = ganp0;
            gani gani0 = this.a;
            if(gani0 != null) {
                gani0.L();
            }
        }
    }

    @Override  // android.os.AsyncTask
    protected final Object doInBackground(Object[] arr_object) {
        gamy gamy0 = this.f;
        gano gano0 = this.c;
        gavs.g(gano0, "BE_AEF_05", null);
        this.f = null;
        this.c = null;
        gavs.g(gamy0, "BE_AEF_06", null);
        return gamy0.a(gano0);
    }

    @Override  // android.os.AsyncTask
    protected final void onPostExecute(Object object0) {
        if(this.e != -1L) {
            gani.D().removeCallbacks(this);
        }
        this.a(((ganp)object0));
    }

    @Override  // android.os.AsyncTask
    protected final void onPreExecute() {
        if(this.e != -1L) {
            gani.D().postDelayed(this, this.e);
        }
    }

    @Override
    public final void run() {
        this.cancel(true);
        this.a(new ganp(ganp.e(4)));
    }
}

