import android.util.Log;

public final class ekiy implements evqc {
    public final ekiz a;

    public ekiy(ekiz ekiz0) {
        this.a = ekiz0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        Log.e("ContactsGmsRestore", "Getting contact counts failed : " + exception0.getMessage());
        this.a.c.o(4);
        this.a.a.C(false);
        this.a.a.D();
    }
}

