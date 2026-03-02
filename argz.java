import android.app.backup.FullBackupDataOutput;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class argz {
    public final Context a;
    public final argx b;
    public ProtoLiteBuilder c;
    private static final aqql d;
    private final aqwp e;

    static {
        argz.d = new aqql(new String[]{"TelephonyHelper"});
    }

    public argz(Context context0) {
        this.a = context0;
        this.e = new aqwp(context0, context0.getPackageManager());
        this.b = new argx(context0);
    }

    public final void a(File file0, argy argy0) {
        Cursor cursor1;
        argx argx0;
        int v1;
        Closeable closeable0;
        Cursor cursor0;
        aqql aqql0;
        ParcelFileDescriptor parcelFileDescriptor1;
        FileOutputStream fileOutputStream0;
        Context context0 = this.a;
        File file1 = aqze.b(context0, file0.getName());
        ParcelFileDescriptor parcelFileDescriptor0 = null;
        try {
            try {
                fileOutputStream0 = null;
                fileOutputStream0 = new FileOutputStream(file1);
            }
            catch(IOException | NoSuchMethodException | IllegalAccessException | ClassNotFoundException | InstantiationException | InvocationTargetException exception0) {
                parcelFileDescriptor1 = null;
                throw new aqwq("Error calling fullBackup.", exception0);
            }
            try {
                parcelFileDescriptor1 = ParcelFileDescriptor.dup(fileOutputStream0.getFD());
            }
            catch(IOException | NoSuchMethodException | IllegalAccessException | ClassNotFoundException | InstantiationException | InvocationTargetException exception0) {
                parcelFileDescriptor1 = null;
                goto label_89;
            }
        }
        catch(Throwable throwable0) {
            bbpb.a(parcelFileDescriptor0);
            bbpb.b(fileOutputStream0);
            throw throwable0;
        }
        try {
            File file2 = aqze.b(context0, "_manifest");
            aqql0 = argz.d;
            aqql0.d("Writing manifest to %s", new Object[]{file2.getPath()});
            this.e.e(file2);
            FullBackupDataOutput fullBackupDataOutput0 = (FullBackupDataOutput)FullBackupDataOutput.class.getConstructor(ParcelFileDescriptor.class).newInstance(parcelFileDescriptor1);
            aqwp.g(null, file2.getParent(), file2.getAbsolutePath(), fullBackupDataOutput0);
            try {
                cursor0 = ((argx)argy0).c();
            }
            catch(IOException iOException0) {
                closeable0 = null;
                throw new aqwq("Error backing up telephony data.", iOException0);
            }
            catch(Throwable throwable1) {
                closeable0 = null;
                bbpb.b(parcelFileDescriptor0);
                bbpb.b(closeable0);
                throw throwable1;
            }
            try {
                parcelFileDescriptor0 = ((argx)argy0).b();
                if(cursor0 != null) {
                    argx.e(cursor0, ((argx)argy0).g);
                }
                if(parcelFileDescriptor0 != null) {
                    argx.e(((Cursor)parcelFileDescriptor0), ((argx)argy0).h);
                }
                ((argx)argy0).j = 0L;
                ((argx)argy0).k = 0L;
                int v;
                for(v = 0; cursor0 != null && (!cursor0.isAfterLast() && parcelFileDescriptor0 != null && !((Cursor)parcelFileDescriptor0).isAfterLast()); v = v1) {
                    if(TimeUnit.MILLISECONDS.toSeconds(argx.a(cursor0)) < argx.a(((Cursor)parcelFileDescriptor0))) {
                        v1 = v + 1;
                        ((argx)argy0).d(fullBackupDataOutput0, cursor0, String.format(Locale.US, "%06d_sms_backup", v));
                        ((argx)argy0).j += TimeUnit.NANOSECONDS.toMillis(0L);
                    }
                    else {
                        v1 = v + 1;
                        ((argx)argy0).d(fullBackupDataOutput0, ((Cursor)parcelFileDescriptor0), String.format(Locale.US, "%06d_mms_backup", v));
                        ((argx)argy0).k += TimeUnit.NANOSECONDS.toMillis(0L);
                    }
                }
                while(true) {
                label_49:
                    if(cursor0 == null || cursor0.isAfterLast()) {
                        goto label_64;
                    }
                    ((argx)argy0).d(fullBackupDataOutput0, cursor0, String.format(Locale.US, "%06d_sms_backup", v));
                    argx0 = (argx)argy0;
                    cursor1 = cursor0;
                    break;
                }
            }
            catch(IOException iOException0) {
                cursor1 = cursor0;
                goto label_71;
            }
            catch(Throwable throwable1) {
                cursor1 = cursor0;
                goto label_77;
            }
            try {
                ((argx)argy0).j = argx0.j + TimeUnit.NANOSECONDS.toMillis(0L);
                cursor0 = cursor1;
                ++v;
                goto label_49;
            label_64:
                cursor1 = cursor0;
                while(true) {
                    if(parcelFileDescriptor0 == null || ((Cursor)parcelFileDescriptor0).isAfterLast()) {
                        goto label_82;
                    }
                    ((argx)argy0).d(fullBackupDataOutput0, ((Cursor)parcelFileDescriptor0), String.format(Locale.US, "%06d_mms_backup", v));
                    ((argx)argy0).k += TimeUnit.NANOSECONDS.toMillis(0L);
                    ++v;
                }
            }
            catch(IOException iOException0) {
            label_71:
                closeable0 = parcelFileDescriptor0;
                parcelFileDescriptor0 = cursor1;
                try {
                    throw new aqwq("Error backing up telephony data.", iOException0);
                }
                catch(Throwable throwable1) {
                    bbpb.b(parcelFileDescriptor0);
                    bbpb.b(closeable0);
                    throw throwable1;
                }
            }
            catch(Throwable throwable1) {
            }
        label_77:
            closeable0 = parcelFileDescriptor0;
            parcelFileDescriptor0 = cursor1;
            bbpb.b(parcelFileDescriptor0);
            bbpb.b(closeable0);
            throw throwable1;
        label_82:
            bbpb.b(cursor1);
            bbpb.b(parcelFileDescriptor0);
            ((argx)argy0).i = new HashMap();
            file2.delete();
            fileOutputStream0.write(new byte[4]);
            goto label_99;
        }
        catch(IOException | NoSuchMethodException | IllegalAccessException | ClassNotFoundException | InstantiationException | InvocationTargetException exception0) {
        label_89:
            parcelFileDescriptor0 = fileOutputStream0;
            try {
                throw new aqwq("Error calling fullBackup.", exception0);
            }
            catch(Throwable throwable0) {
                fileOutputStream0 = parcelFileDescriptor0;
            }
        }
        catch(Throwable throwable0) {
        }
        parcelFileDescriptor0 = parcelFileDescriptor1;
        bbpb.a(parcelFileDescriptor0);
        bbpb.b(fileOutputStream0);
        throw throwable0;
    label_99:
        bbpb.a(parcelFileDescriptor1);
        bbpb.b(fileOutputStream0);
        aqql0.d("Writing backup to %s", new Object[]{file0.getPath()});
        try {
            aqwp.h(file1, file0);
        }
        catch(IOException iOException1) {
            throw new aqwq("Error calling fullBackup.", iOException1);
        }
        finally {
            file1.delete();
        }
    }

    public final void b(File file0) {
        aqwp.c(this.a, file0);
    }

    public static final int c(Cursor cursor0) {
        int v1;
        if(cursor0 == null) {
            return -1;
        }
        try {
            v1 = -2;
            v1 = cursor0.getCount();
        }
        catch(SQLException unused_ex) {
        }
        finally {
            bbpb.b(cursor0);
        }
        return v1;
    }
}

