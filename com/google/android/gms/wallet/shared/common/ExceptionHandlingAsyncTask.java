package com.google.android.gms.wallet.shared.common;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.wallet.dynamite.logging.e;

public abstract class ExceptionHandlingAsyncTask extends AsyncTask {
    protected final Context f;

    public ExceptionHandlingAsyncTask(Context context0) {
        Context context1 = context0.getApplicationContext();
        if(context1 != null) {
            context0 = context1;
        }
        this.f = context0;
    }

    protected abstract Object a(Object[] arg1);

    @Override  // android.os.AsyncTask
    protected final Object doInBackground(Object[] arr_object) {
        try {
            return this.a(arr_object);
        }
        catch(Throwable throwable0) {
            e.a(this.f, throwable0, null);
            return null;
        }
    }
}

