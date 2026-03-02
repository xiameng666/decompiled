import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.mlkit.vision.documentscanner.AutoValue_GmsDocumentScanningResult;
import com.google.mlkit.vision.documentscanner.AutoValue_GmsDocumentScanningResult_Page;
import com.google.mlkit.vision.documentscanner.AutoValue_GmsDocumentScanningResult_Pdf;
import com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult;
import j..util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public final class hbvy {
    public static final Executor a;
    private final Context b;

    static {
        hbvy.a = hawb.a;
    }

    public hbvy(Context context0) {
        this.b = context0;
    }

    final Uri a(Uri uri0, String s) {
        if(uri0 == null) {
            return null;
        }
        String s1 = uri0.getScheme();
        if(s1 == null) {
            return null;
        }
        Context context0 = this.b;
        File file0 = new File(context0.getCacheDir(), "mlkit_docscan_ui_client");
        if(!file0.exists()) {
            file0.mkdir();
        }
        File file1 = new File(file0, SystemClock.elapsedRealtimeNanos() + s);
        try(InputStream inputStream0 = fqbf.d(context0, uri0, (Objects.equals("com.google.android.gms", "com.google.android.gms") || !s1.equals("content") ? fqbe.c : fqbe.a)); FileOutputStream fileOutputStream0 = new FileOutputStream(file1)) {
            byte[] arr_b = new byte[0x400];
            int v;
            while((v = inputStream0.read(arr_b)) != -1) {
                fileOutputStream0.write(arr_b, 0, v);
            }
            fileOutputStream0.flush();
            return Uri.fromFile(file1);
        }
        catch(IOException iOException0) {
            hbvy.d(("Failed to save file to local: " + uri0.toString()), iOException0);
            return null;
        }
    }

    public final GmsDocumentScanningResult b(Intent intent0, boolean z) {
        ArrayList arrayList3;
        AutoValue_GmsDocumentScanningResult_Pdf autoValue_GmsDocumentScanningResult_Pdf0 = null;
        if(intent0 != null) {
            ArrayList arrayList0 = intent0.getParcelableArrayListExtra("uri_array_extra_result_image_uris");
            ArrayList arrayList1 = intent0.getStringArrayListExtra("string_array_extra_result_image_hashes");
            Uri uri0 = (Uri)intent0.getParcelableExtra("uri_extra_result_pdf_uri");
            int v1 = intent0.getIntExtra("int_extra_result_page_count", 0);
            ArrayList arrayList2 = new ArrayList();
            if(z) {
                if(arrayList0 != null && !arrayList0.isEmpty()) {
                    int v2 = arrayList0.size();
                    for(int v3 = 0; v3 < v2; ++v3) {
                        Uri uri1 = this.a(((Uri)arrayList0.get(v3)), ".jpg");
                        if(uri1 == null) {
                            return null;
                        }
                        arrayList2.add(uri1);
                    }
                }
                if(uri0 == null) {
                    uri0 = null;
                }
                else {
                    uri0 = this.a(uri0, ".pdf");
                    if(uri0 == null) {
                        return null;
                    }
                }
                arrayList0 = arrayList2;
            }
            else {
                batl.m("com.google.android.gms".equals("com.google.android.gms"), "Copy-to-local should only be skipped if the client library is also within GMS");
            }
            if(arrayList0 == null) {
                arrayList3 = null;
            }
            else {
                arrayList3 = new ArrayList();
                if(arrayList1 == null) {
                    for(Object object0: arrayList0) {
                        arrayList3.add(new AutoValue_GmsDocumentScanningResult_Page(((Uri)object0), null));
                    }
                }
                else {
                    gftb.b(arrayList1.size() == arrayList0.size(), "Error: imageHashes and imageUris size mismatch.");
                    for(int v = 0; v < arrayList1.size(); ++v) {
                        arrayList3.add(new AutoValue_GmsDocumentScanningResult_Page(((Uri)arrayList0.get(v)), ((String)arrayList1.get(v))));
                    }
                }
            }
            if(uri0 != null) {
                autoValue_GmsDocumentScanningResult_Pdf0 = new AutoValue_GmsDocumentScanningResult_Pdf(uri0, v1);
            }
            return new AutoValue_GmsDocumentScanningResult(arrayList3, autoValue_GmsDocumentScanningResult_Pdf0);
        }
        return null;
    }

    final void c(String s) {
        if(s == null) {
            return;
        }
        try {
            hbwb hbwb0 = new hbwb(this.b);
            azzc azzc0 = new azzc();
            azzc0.c = new Feature[]{hawq.t};
            azzc0.a = new hbvz(s);
            azzc0.d = 0x5F11;
            evrg.n(hbwb0.iG(azzc0.a()));
        }
        catch(InterruptedException | ExecutionException exception0) {
            hbvy.d("Failed to cleanup GMS Core cache", exception0);
        }
    }

    private static void d(String s, Exception exception0) {
        if(Log.isLoggable("ResultHelper", 6)) {
            Log.e("ResultHelper", s, exception0);
        }
    }
}

