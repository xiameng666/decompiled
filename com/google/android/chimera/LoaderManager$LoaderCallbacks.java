package com.google.android.chimera;

import android.os.Bundle;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0L)
public interface LoaderManager.LoaderCallbacks {
    Loader onCreateLoader(int arg1, Bundle arg2);

    void onLoadFinished(Loader arg1, Object arg2);

    void onLoaderReset(Loader arg1);
}

