package com.google.android.gms.mdisync.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlbg;
import dlbh;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TeleportingSyncRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final SyncRequest a;

    static {
        TeleportingSyncRequest.CREATOR = new dlbg();
    }

    public TeleportingSyncRequest(SyncRequest syncRequest0) {
        this.a = syncRequest0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        Parcel parcel1 = Parcel.obtain();
        try {
            int v2 = baub.a(parcel1);
            baub.t(parcel1, 1, this.a, v, false);
            baub.c(parcel1, v2);
            byte[] arr_b = parcel1.marshall();
            File file0 = File.createTempFile("teleporter", ".tmp", null);
            RandomAccessFile randomAccessFile0 = new RandomAccessFile(file0, "rw");
            randomAccessFile0.write(arr_b);
            randomAccessFile0.seek(0L);
            file0.delete();
            parcel0.writeFileDescriptor(randomAccessFile0.getFD());
            randomAccessFile0.close();
        }
        catch(IOException iOException0) {
            throw new dlbh("Couldn\'t write SafeParcelable to unlinked file.", iOException0);
        }
        finally {
            parcel1.recycle();
        }
    }
}

