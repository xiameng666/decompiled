package com.google.android.chimera;

import android.content.ContentProvider.PipeDataWriter;
import android.content.ContentProvider;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.pm.PathPermission;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

public interface ContentProvider.ProxyCallbacks {
    ContentProvider getContainerContentProvider();

    void setShutdownAllowed(boolean arg1);

    ContentProviderResult[] superApplyBatch(ArrayList arg1);

    int superBulkInsert(Uri arg1, ContentValues[] arg2);

    Bundle superCall(String arg1, String arg2, Bundle arg3);

    Uri superCanonicalize(Uri arg1);

    void superDump(FileDescriptor arg1, PrintWriter arg2, String[] arg3);

    String superGetCallingPackage();

    PathPermission[] superGetPathPermissions();

    String superGetReadPermission();

    String[] superGetStreamTypes(Uri arg1, String arg2);

    String superGetWritePermission();

    boolean superIsTemporary();

    AssetFileDescriptor superOpenAssetFile(Uri arg1, String arg2);

    AssetFileDescriptor superOpenAssetFile(Uri arg1, String arg2, CancellationSignal arg3);

    ParcelFileDescriptor superOpenFile(Uri arg1, String arg2);

    ParcelFileDescriptor superOpenFile(Uri arg1, String arg2, CancellationSignal arg3);

    ParcelFileDescriptor superOpenFileHelper(Uri arg1, String arg2);

    ParcelFileDescriptor superOpenPipeHelper(Uri arg1, String arg2, Bundle arg3, Object arg4, ContentProvider.PipeDataWriter arg5);

    AssetFileDescriptor superOpenTypedAssetFile(Uri arg1, String arg2, Bundle arg3);

    AssetFileDescriptor superOpenTypedAssetFile(Uri arg1, String arg2, Bundle arg3, CancellationSignal arg4);

    Cursor superQuery(Uri arg1, String[] arg2, Bundle arg3, CancellationSignal arg4);

    Cursor superQuery(Uri arg1, String[] arg2, String arg3, String[] arg4, String arg5, CancellationSignal arg6);

    void superSetPathPermissions(PathPermission[] arg1);

    void superSetReadPermission(String arg1);

    void superSetWritePermission(String arg1);

    void superShutdown();

    Uri superUncanonicalize(Uri arg1);
}

