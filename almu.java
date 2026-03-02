import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore.Files;
import android.util.Size;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import jeb.synthetic.TWR;

public final class almu {
    static final Integer a;
    private static final bboh b;
    private static final Uri c;
    private final Context d;
    private final ContentResolver e;

    static {
        almu.a = (int)0x180;
        almu.b = alis.a("CameraRollManager");
        almu.c = MediaStore.Files.getContentUri("external");
    }

    public almu(Context context0) {
        this.d = context0;
        this.e = context0.getContentResolver();
    }

    final ParcelFileDescriptor a(alte alte0) {
        Uri uri0 = almu.c;
        Cursor cursor0 = this.e.query(uri0, new String[]{"_id"}, "_id=? AND _display_name=? AND mime_type=? AND date_modified=? AND _size=?", new String[]{alte0.b, alte0.c, alte0.d, Long.toString(alte0.e), Long.toString(alte0.f)}, null);
        ParcelFileDescriptor parcelFileDescriptor0 = null;
        if(cursor0 != null) {
            try {
                if(cursor0.moveToFirst()) {
                    Uri uri1 = ContentUris.withAppendedId(uri0, cursor0.getLong(0));
                    try {
                        parcelFileDescriptor0 = fqbf.k(this.d, uri1, fqbe.a);
                    }
                    catch(FileNotFoundException fileNotFoundException0) {
                        ((ggtj)((ggtj)almu.b.j()).s(fileNotFoundException0)).B("File not found for item %s", alte0.b);
                    }
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
        }
        if(cursor0 != null) {
            cursor0.close();
        }
        if(parcelFileDescriptor0 == null) {
            aliu aliu0 = new aliu();
            aliu0.b("phone_hub_camera_roll_file_fetch_failed");
            aliu0.c();
        }
        return parcelFileDescriptor0;
    }

    final gged_interceptors b(int v, List list0) {
        int v10;
        int v9;
        Bitmap bitmap0;
        ggdy ggdy0 = new ggdy();
        String s = hpzm.a.f().w() ? "media_type=1 OR media_type=3" : "media_type=1";
        Bundle bundle0 = new Bundle();
        bundle0.putString("android:query-arg-sql-selection", s);
        bundle0.putString("android:query-arg-sql-sort-order", "date_added DESC");
        bundle0.putString("android:query-arg-sql-limit", String.valueOf(v * 3));
        ContentResolver contentResolver0 = this.e;
        Cursor cursor0 = contentResolver0.query(almu.c, new String[]{"_id", "media_type", "_display_name", "mime_type", "date_modified", "_size"}, bundle0, null);
        try {
            if(cursor0 == null) {
                ((ggtj)almu.b.j()).x("Media store returned null cursor.");
                return ggdy0.h();
            }
            if(cursor0.getCount() > v * 3) {
                ((ggtj)almu.b.j()).F("Cursor count: %d is greater than expected: %d", cursor0.getCount(), v * 3);
            }
            if(cursor0.getCount() == 0) {
                ((ggtj)almu.b.h()).x("No recent media file found.");
            }
            int v1 = 0;
            while(cursor0.moveToNext() && v1 < v) {
                long v2 = cursor0.getLong(0);
                cursor0.getInt(1);
                String s1 = cursor0.getString(2);
                String s2 = cursor0.getString(3);
                long v3 = cursor0.getLong(4);
                long v4 = cursor0.getLong(5);
                Uri uri0 = MediaStore.Files.getContentUri("external", v2);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)altd.a).v_newBuilder();
                alte alte0 = alte.a;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)alte0).v_newBuilder();
                String s3 = String.valueOf(v2);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                s3.getClass();
                ((alte)hftv0).b = s3;
                String s4 = gfta.b(s1);
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                ((alte)hftv1).c = s4;
                String s5 = gfta.b(s2);
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp1.b_message;
                ((alte)hftv2).d = s5;
                if(!hftv2.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp1.b_message;
                ((alte)hftv3).e = v3;
                if(!hftv3.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((alte)hftp1.b_message).f = v4;
                alte alte1 = (alte)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                altd altd0 = (altd)hftp0.b_message;
                alte1.getClass();
                altd0.c = alte1;
                altd0.b |= 1;
                if(list0.contains((altd0.c == null ? alte0 : altd0.c))) {
                    altf altf0 = altf.a;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    altd altd1 = (altd)hftp0.b_message;
                    altf0.getClass();
                    altd1.d = altf0;
                    altd1.b |= 2;
                    goto label_101;
                }
                try {
                    bitmap0 = contentResolver0.loadThumbnail(uri0, new Size(0x180, 0x180), null);
                }
                catch(IOException iOException0) {
                    a.ae(almu.b.j(), "Exception raised in CameraRollManager#getBitmapFromId", iOException0);
                    bitmap0 = null;
                }
                if(bitmap0 == null) {
                    ((ggtj)almu.b.j()).x("Cannot generate thumbnail due to bitmap not present");
                    aliu aliu0 = new aliu();
                    aliu0.b("phone_hub_camera_roll_thumbnail_fetch_failed");
                    aliu0.c();
                }
                else {
                    int v5 = (int)hpzm.a.f().c();
                    int v6 = bitmap0.getWidth();
                    int v7 = bitmap0.getHeight();
                    int v8 = Math.min(v6, v7);
                    if(v6 > v7) {
                        v9 = (v6 - v7) / 2;
                        goto label_81;
                    }
                    else if(v6 >= v7) {
                        v9 = 0;
                    label_81:
                        v10 = 0;
                    }
                    else {
                        v10 = (v7 - v6) / 2;
                        v9 = 0;
                    }
                    Bitmap bitmap1 = Bitmap.createScaledBitmap(Bitmap.createBitmap(bitmap0, v9, v10, v8, v8), v5, v5, ((boolean)1));
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)altf.a).v_newBuilder();
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((altf)hftp2.b_message).b = 2;
                    ByteString hfsf0 = alni.c(bitmap1);
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((altf)hftp2.b_message).c = hfsf0;
                    altf altf1 = (altf)hftp2.N_build();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    altd altd2 = (altd)hftp0.b_message;
                    altf1.getClass();
                    altd2.d = altf1;
                    altd2.b |= 2;
                label_101:
                    ++v1;
                    ggdy0.i(((altd)hftp0.N_build()));
                }
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return ggdy0.h();
    }
}

