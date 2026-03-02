package com.google.android.chimera.container.router;

import android.content.ContentProvider.PipeDataWriter;
import android.content.ContentProviderClient;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.RemoteException;
import clim;
import com.google.android.chimera.ContentProvider;
import gfuy;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import xdv;
import xfd;
import xft;
import xgh;
import xgt;
import xgv;
import xgx;
import xhf;

public class ContentProviderRouter extends ContentProvider implements clim, xdv {
    private xgx a;
    private final String b;
    private ContentProviderClient c;
    private final xhf d;
    private final ProviderInfo e;

    public ContentProviderRouter(String s, String s1, ProviderInfo providerInfo0) {
        this.b = s;
        this.d = new xhf(new xgh(s1));
        this.e = providerInfo0;
    }

    @Override  // xdv
    public final boolean a(Context context0, String s, String s1) {
        xgx xgx0;
        Bundle bundle0 = new Bundle();
        bundle0.putParcelable("providerInfo", this.e);
        IBinder iBinder0 = xft.b().a(context0, s, s1, new xgt(this), "provider", bundle0, this.d);
        if(iBinder0 == null) {
            xgx0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.chimera.container.router.IContentProviderRemoteProxy");
            xgx0 = (iInterface0 instanceof xgx) ? ((xgx)iInterface0) : new xgv(iBinder0);
        }
        this.a = xgx0;
        if(xgx0 == null) {
            return false;
        }
        ContentProviderClient contentProviderClient0 = xft.b().a.a(s);
        if(contentProviderClient0 == null) {
            throw new xgh("Unable to retrieve router provider client");
        }
        this.c = contentProviderClient0;
        return true;
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final ContentProviderResult[] applyBatch(ArrayList arrayList0) {
        try {
            xgx xgx0 = this.a;
            gfuy.e(xgx0);
            return ContentProviderRouter.e(xgx0.h(arrayList0));
        }
        catch(RemoteException remoteException0) {
            throw new xgh(remoteException0);
        }
    }

    public static Parcelable b(Bundle bundle0, Class class0) {
        String s = bundle0.getString("openFileException");
        switch(bundle0.getInt("openFileResultType")) {
            case 1: {
                throw s == null ? new FileNotFoundException() : new FileNotFoundException(s);
            }
            case 2: {
                throw s == null ? new SecurityException() : new SecurityException(s);
            }
            default: {
                return (Parcelable)class0.cast(bundle0.getParcelable("openFileFileDescriptor"));
            }
        }
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final int bulkInsert(Uri uri0, ContentValues[] arr_contentValues) {
        try {
            xgx xgx0 = this.a;
            gfuy.e(xgx0);
            return xgx0.a(uri0, arr_contentValues);
        }
        catch(RemoteException remoteException0) {
            throw new xgh(remoteException0);
        }
    }

    public static void c(Bundle bundle0, OperationApplicationException operationApplicationException0) {
        bundle0.putString("applyBatchException", operationApplicationException0.getMessage());
        bundle0.putInt("applyBatchNumYieldPoints", operationApplicationException0.getNumSuccessfulYieldPoints());
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final Bundle call(String s, String s1, Bundle bundle0) {
        try {
            xgx xgx0 = this.a;
            gfuy.e(xgx0);
            return xgx0.i(s, s1, bundle0);
        }
        catch(RemoteException remoteException0) {
            throw new xgh(remoteException0);
        }
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final Uri canonicalize(Uri uri0) {
        try {
            xgx xgx0 = this.a;
            gfuy.e(xgx0);
            return xgx0.e(uri0);
        }
        catch(RemoteException remoteException0) {
            throw new xgh(remoteException0);
        }
    }

    public static void d(Bundle bundle0, Exception exception0) {
        if((exception0 instanceof FileNotFoundException)) {
            bundle0.putInt("openFileResultType", 1);
        }
        else if((exception0 instanceof SecurityException)) {
            bundle0.putInt("openFileResultType", 2);
        }
        bundle0.putString("openFileException", exception0.getMessage());
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri0, String s, String[] arr_s) {
        try {
            xgx xgx0 = this.a;
            gfuy.e(xgx0);
            return xgx0.c(uri0, s, arr_s);
        }
        catch(RemoteException remoteException0) {
            throw new xgh(remoteException0);
        }
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final void dump(FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        try(ParcelFileDescriptor parcelFileDescriptor0 = ParcelFileDescriptor.dup(fileDescriptor0)) {
            xgx xgx0 = this.a;
            gfuy.e(xgx0);
            xgx0.n(parcelFileDescriptor0, arr_s);
        }
        catch(RemoteException | IOException exception0) {
            printWriter0.write("Router error: " + exception0.getMessage());
        }
    }

    public static ContentProviderResult[] e(Bundle bundle0) {
        Parcelable[] arr_parcelable = bundle0.getParcelableArray("applyBatchArray");
        if(arr_parcelable != null) {
            return (arr_parcelable instanceof ContentProviderResult[]) ? ((ContentProviderResult[])arr_parcelable) : ((ContentProviderResult[])Arrays.copyOf(arr_parcelable, arr_parcelable.length, ContentProviderResult[].class));
        }
        int v = bundle0.getInt("applyBatchNumYieldPoints");
        String s = bundle0.getString("applyBatchException");
        throw s == null ? new OperationApplicationException(v) : new OperationApplicationException(s, v);
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final String[] getStreamTypes(Uri uri0, String s) {
        try {
            xgx xgx0 = this.a;
            gfuy.e(xgx0);
            return xgx0.q(uri0, s);
        }
        catch(RemoteException remoteException0) {
            throw new xgh(remoteException0);
        }
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri0) {
        try {
            xgx xgx0 = this.a;
            gfuy.e(xgx0);
            return xgx0.m(uri0);
        }
        catch(RemoteException remoteException0) {
            throw new xgh(remoteException0);
        }
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final Uri insert(Uri uri0, ContentValues contentValues0) {
        try {
            xgx xgx0 = this.a;
            gfuy.e(xgx0);
            return xgx0.f(uri0, contentValues0);
        }
        catch(RemoteException remoteException0) {
            throw new xgh(remoteException0);
        }
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final boolean isTemporary() {
        try {
            xgx xgx0 = this.a;
            gfuy.e(xgx0);
            return xgx0.p();
        }
        catch(RemoteException remoteException0) {
            throw new xgh(remoteException0);
        }
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        return false;
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final AssetFileDescriptor openAssetFile(Uri uri0, String s) {
        try {
            xgx xgx0 = this.a;
            gfuy.e(xgx0);
            return (AssetFileDescriptor)ContentProviderRouter.b(xgx0.j(uri0, s), AssetFileDescriptor.class);
        }
        catch(RemoteException remoteException0) {
            throw new xgh(remoteException0);
        }
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final AssetFileDescriptor openAssetFile(Uri uri0, String s, CancellationSignal cancellationSignal0) {
        try {
            return this.c.openAssetFile(xfd.a(uri0, this.b), s, cancellationSignal0);
        }
        catch(RemoteException remoteException0) {
            throw new xgh(remoteException0);
        }
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri0, String s) {
        try {
            xgx xgx0 = this.a;
            gfuy.e(xgx0);
            return (ParcelFileDescriptor)ContentProviderRouter.b(xgx0.k(uri0, s), ParcelFileDescriptor.class);
        }
        catch(RemoteException remoteException0) {
            throw new xgh(remoteException0);
        }
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri0, String s, CancellationSignal cancellationSignal0) {
        try {
            return this.c.openFile(xfd.a(uri0, this.b), s, cancellationSignal0);
        }
        catch(RemoteException remoteException0) {
            throw new xgh(remoteException0);
        }
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final ParcelFileDescriptor openPipeHelper(Uri uri0, String s, Bundle bundle0, Object object0, ContentProvider.PipeDataWriter contentProvider$PipeDataWriter0) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final AssetFileDescriptor openTypedAssetFile(Uri uri0, String s, Bundle bundle0) {
        try {
            xgx xgx0 = this.a;
            gfuy.e(xgx0);
            return (AssetFileDescriptor)ContentProviderRouter.b(xgx0.l(uri0, s, bundle0), AssetFileDescriptor.class);
        }
        catch(RemoteException remoteException0) {
            throw new xgh(remoteException0);
        }
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final AssetFileDescriptor openTypedAssetFile(Uri uri0, String s, Bundle bundle0, CancellationSignal cancellationSignal0) {
        try {
            return this.c.openTypedAssetFileDescriptor(xfd.a(uri0, this.b), s, bundle0, cancellationSignal0);
        }
        catch(RemoteException remoteException0) {
            throw new xgh(remoteException0);
        }
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri0, String[] arr_s, Bundle bundle0, CancellationSignal cancellationSignal0) {
        try {
            return this.c.query(xfd.a(uri0, this.b), arr_s, bundle0, cancellationSignal0);
        }
        catch(RemoteException remoteException0) {
            throw new xgh(remoteException0);
        }
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1) {
        try {
            return this.c.query(xfd.a(uri0, this.b), arr_s, s, arr_s1, s1);
        }
        catch(RemoteException remoteException0) {
            throw new xgh(remoteException0);
        }
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1, CancellationSignal cancellationSignal0) {
        try {
            return this.c.query(xfd.a(uri0, this.b), arr_s, s, arr_s1, s1, cancellationSignal0);
        }
        catch(RemoteException remoteException0) {
            throw new xgh(remoteException0);
        }
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final void shutdown() {
        xgx xgx0 = this.a;
        gfuy.e(xgx0);
        IBinder iBinder0 = xgx0.asBinder();
        this.d.a(iBinder0);
        this.a = null;
        try {
            xgx0.o();
        }
        catch(DeadObjectException unused_ex) {
        }
        catch(RemoteException remoteException0) {
            throw new xgh(remoteException0);
        }
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final Uri uncanonicalize(Uri uri0) {
        try {
            xgx xgx0 = this.a;
            gfuy.e(xgx0);
            return xgx0.g(uri0);
        }
        catch(RemoteException remoteException0) {
            throw new xgh(remoteException0);
        }
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final int update(Uri uri0, ContentValues contentValues0, String s, String[] arr_s) {
        try {
            xgx xgx0 = this.a;
            gfuy.e(xgx0);
            return xgx0.d(uri0, contentValues0, s, arr_s);
        }
        catch(RemoteException remoteException0) {
            throw new xgh(remoteException0);
        }
    }
}

