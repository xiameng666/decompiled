import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import j..util.Optional;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Supplier;
import jeb.synthetic.TWR;

public final class ahzw implements Supplier {
    public final ahzz a;
    public final String b;

    public ahzw(ahzz ahzz0, String s) {
        this.a = ahzz0;
        this.b = s;
    }

    @Override
    public final Object get() {
        Throwable throwable3;
        ByteArrayOutputStream byteArrayOutputStream0;
        ContentResolver contentResolver1;
        String s2;
        byte[] arr_b;
        InputStream inputStream0;
        int v1;
        Object object0;
        ArrayList arrayList0 = new ArrayList();
        Context context0 = this.a.e;
        ContentResolver contentResolver0 = context0.getContentResolver();
        Uri uri0 = ahzz.d;
        Cursor cursor0 = contentResolver0.query(uri0, ahzz.b, this.b, null, null);
        if(cursor0 == null) {
        label_82:
            if(cursor0 != null) {
                cursor0.close();
            }
        }
        else {
            while(true) {
                try {
                label_6:
                    if(!cursor0.moveToNext()) {
                        goto label_82;
                    }
                    String s = cursor0.getString(cursor0.getColumnIndexOrThrow("ct"));
                    object0 = null;
                    if(s == null) {
                    }
                    else if(!s.equals("text/plain") && !s.equals("application/vnd.gsma.botmessage.v1.0+json")) {
                        ahzz.a.d("can\'t load rcs message; content type is not plain text or rich card", new Object[0]);
                        goto label_75;
                    }
                    else {
                        long v = cursor0.getLong(cursor0.getColumnIndexOrThrow("_id"));
                        String s1 = cursor0.getString(cursor0.getColumnIndexOrThrow("text"));
                        v1 = cursor0.getInt(cursor0.getColumnIndexOrThrow("chset"));
                        if(!s.equals("text/plain")) {
                            contentResolver1 = context0.getContentResolver();
                            byteArrayOutputStream0 = new ByteArrayOutputStream();
                            try {
                            label_32:
                                inputStream0 = contentResolver1.openInputStream(Uri.parse((uri0 + "/" + v)));
                                if(inputStream0 != null) {
                                    goto label_34;
                                }
                                goto label_47;
                            }
                            catch(IOException iOException0) {
                                goto label_51;
                            }
                        }
                        else if(!TextUtils.isEmpty(s1)) {
                            if(v1 == 0) {
                                arr_b = s1.getBytes();
                            }
                            else {
                                try {
                                    arr_b = s1.getBytes(ahxn.a(v1));
                                }
                                catch(UnsupportedEncodingException unused_ex) {
                                    arr_b = s1.getBytes();
                                }
                            }
                            if(arr_b != null && arr_b.length > 0) {
                                s2 = ahzz.b(arr_b, v1);
                                goto label_69;
                            }
                        }
                        else {
                            contentResolver1 = context0.getContentResolver();
                            byteArrayOutputStream0 = new ByteArrayOutputStream();
                            goto label_32;
                        }
                        goto label_67;
                    }
                    goto label_74;
                }
                catch(Throwable throwable0) {
                    goto label_79;
                }
                try {
                label_34:
                    byte[] arr_b1 = new byte[0x100];
                    int v2 = inputStream0.read(arr_b1);
                    while(true) {
                        if(v2 < 0) {
                            goto label_47;
                        }
                        byteArrayOutputStream0.write(arr_b1, 0, v2);
                        v2 = inputStream0.read(arr_b1);
                    }
                }
                catch(Throwable throwable1) {
                    try {
                        throwable3 = throwable1;
                        inputStream0.close();
                        throw throwable3;
                    }
                    catch(Throwable throwable2) {
                        try {
                            try {
                                throwable3.addSuppressed(throwable2);
                                throw throwable3;
                            label_47:
                                if(inputStream0 != null) {
                                    inputStream0.close();
                                }
                            }
                            catch(IOException iOException0) {
                            label_51:
                                ahzz.a.f("DatabaseMessages.MmsPart: loading text from file failed: " + iOException0.toString(), new Object[0]);
                            }
                            byte[] arr_b2 = byteArrayOutputStream0.toByteArray();
                            if(arr_b2.length > 0) {
                                ahzq ahzq0 = null;
                                String s3 = ahzz.b(arr_b2, v1);
                                HashMap hashMap0 = new HashMap();
                                ArrayList arrayList1 = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                ArrayDeque arrayDeque0 = new ArrayDeque();
                                gqbe gqbe0 = gqbe.a.b();
                                gqbe0.d = true;
                                gpzl gpzl0 = gpzm.a(gqbe0, hashMap0, arrayList1, arrayList2, gpzl.a, arrayDeque0, 1, gpzl.d, gpzl.e);
                                if(!TextUtils.isEmpty(s3)) {
                                    try {
                                        ahzq0 = (ahzq)gpzl0.g(s3, ahzq.class);
                                    }
                                    catch(gpzy unused_ex) {
                                    }
                                }
                                if(ahzq0 != null) {
                                    throw null;
                                }
                            }
                        label_67:
                            ahzz.a.d("can\'t load rcs message; no content", new Object[0]);
                            s2 = null;
                        label_69:
                            if(s2 == null) {
                                ahzz.a.d("can\'t load rcs message; no content", new Object[0]);
                            }
                            else {
                                object0 = new ahzr(s2);
                            }
                            goto label_75;
                        label_74:
                            ahzz.a.d("can\'t load rcs message; no content type", new Object[0]);
                        label_75:
                            if(object0 == null) {
                                goto label_6;
                            }
                            arrayList0.add(object0);
                            continue;
                        }
                        catch(Throwable throwable0) {
                        }
                    }
                }
            label_79:
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
        }
        return Optional.of(arrayList0);
    }
}

