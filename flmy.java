import android.database.Cursor;
import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.concurrent.Callable;

public final class flmy implements Callable {
    public final flna a;
    public final ContactId b;

    public flmy(flna flna0, ContactId contactId0) {
        this.a = flna0;
        this.b = contactId0;
    }

    @Override
    public final Object call() {
        Object object0;
        byte[] arr_b;
        Cursor cursor1;
        flna flna0 = this.a;
        Cursor cursor0 = flna0.c(this.b);
        try {
            if(cursor0.moveToFirst()) {
                Uri uri0 = flna0.d("registration");
                cursor1 = flna0.a.h(uri0, new String[]{"registration_properties"}, "registration_id=?", new String[]{Long.toString(cursor0.getInt(0))}, null, null);
                goto label_5;
            }
            else {
                object0 = gfqx.a;
            }
            goto label_34;
        }
        catch(Throwable throwable0) {
            goto label_28;
        }
        try {
        label_5:
            if(cursor1.moveToFirst()) {
                arr_b = cursor1.getBlob(0);
                if(arr_b == null) {
                    object0 = gfqx.a;
                    goto label_9;
                }
                else {
                    goto label_11;
                }
            }
            else {
                object0 = gfqx.a;
                goto label_23;
            }
            goto label_34;
        }
        catch(Throwable throwable1) {
            goto label_17;
        }
        try {
        label_9:
            cursor1.close();
        }
        catch(Throwable throwable0) {
            goto label_28;
        }
        goto label_34;
        try {
        label_11:
            object0 = flos.c(arr_b);
        }
        catch(Throwable throwable1) {
            goto label_17;
        }
        try {
            cursor1.close();
        }
        catch(Throwable throwable0) {
            goto label_28;
        }
        goto label_34;
        try {
            object0 = gfqx.a;
            goto label_23;
        }
        catch(Throwable throwable1) {
        label_17:
            if(cursor1 != null) {
                try {
                    cursor1.close();
                }
                catch(Throwable throwable2) {
                    try {
                        throwable1.addSuppressed(throwable2);
                        throw throwable1;
                    label_23:
                        cursor1.close();
                        goto label_34;
                    }
                    catch(Throwable throwable0) {
                    }
                    goto label_28;
                }
            }
            throw throwable1;
        }
    label_28:
        if(cursor0 != null) {
            try {
                cursor0.close();
            }
            catch(Throwable throwable3) {
                throwable0.addSuppressed(throwable3);
            }
        }
        throw throwable0;
    label_34:
        cursor0.close();
        return object0;
    }
}

