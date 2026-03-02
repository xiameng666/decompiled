package com.google.android.chimera;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import java.util.Collection;
import java.util.Set;

public interface SliceProvider.ProxyCallbacks extends ContentProvider.ProxyCallbacks {
    int superDelete(Uri arg1, String arg2, String[] arg3);

    String superGetType(Uri arg1);

    Uri superInsert(Uri arg1, ContentValues arg2);

    Slice superOnBindSlice(Uri arg1, Set arg2);

    PendingIntent superOnCreatePermissionRequest(Uri arg1);

    Collection superOnGetSliceDescendants(Uri arg1);

    Uri superOnMapIntentToUri(Intent arg1);

    void superOnSlicePinned(Uri arg1);

    void superOnSliceUnpinned(Uri arg1);

    Cursor superQuery(Uri arg1, String[] arg2, String arg3, String[] arg4, String arg5);

    int superUpdate(Uri arg1, ContentValues arg2, String arg3, String[] arg4);
}

