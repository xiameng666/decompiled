import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdd.FileGroupResponse;
import com.google.android.gms.mdd.MddFile;
import com.google.android.gms.mdd.OverrideFileGroupRequest;
import j..util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

final class cpxf implements gmbg {
    final cpxg a;

    public cpxf(cpxg cpxg0) {
        Objects.requireNonNull(cpxg0);
        this.a = cpxg0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        try {
            this.a.j(Status.d);
        }
        catch(RemoteException remoteException0) {
            fkbp.k(remoteException0, "Client died during DiagnosticsOverrideOperation", new Object[0]);
        }
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Status status0;
        File file0;
        long v2;
        ParcelFileDescriptor[] arr_parcelFileDescriptor1;
        Void void0 = (Void)object0;
        cpxg cpxg0 = this.a;
        OverrideFileGroupRequest overrideFileGroupRequest0 = cpxg0.b;
        String[] arr_s = overrideFileGroupRequest0.d;
        ParcelFileDescriptor[] arr_parcelFileDescriptor = overrideFileGroupRequest0.e;
        if(arr_s.length == arr_parcelFileDescriptor.length) {
            Context context0 = cpxg0.a.b;
            SharedPreferences sharedPreferences0 = context0.getSharedPreferences("gms_icing_mdd_overrider_groups", 0);
            long v = sharedPreferences0.getLong("_key_next_file_name", System.currentTimeMillis());
            ArrayList arrayList0 = new ArrayList();
            int v1 = 0;
            while(v1 < arr_s.length) {
                String s = arr_s[v1];
                ParcelFileDescriptor parcelFileDescriptor0 = arr_parcelFileDescriptor[v1];
                Uri uri0 = fkdj.e(context0, (overrideFileGroupRequest0.c.length == 0 ? 1 : 2), gfqx.a);
                try {
                    if(hrnt.i()) {
                        arr_parcelFileDescriptor1 = arr_parcelFileDescriptor;
                        v2 = v + 1L;
                        file0 = new File(ccsb.a.b(frcg.b(uri0, context0, null), a.u(v, "datadownloadfile_override_")));
                    }
                    else {
                        arr_parcelFileDescriptor1 = arr_parcelFileDescriptor;
                        v2 = v + 1L;
                        file0 = new File(frcg.b(uri0, context0, null), a.u(v, "datadownloadfile_override_"));
                    }
                    v = v2;
                    File file1 = file0.getParentFile();
                    batl.s(file1);
                    if(!file1.exists()) {
                        file1.mkdirs();
                    }
                }
                catch(IOException unused_ex) {
                    fkbp.b("IOException occurred while getting file path");
                    goto label_52;
                }
                file0.getAbsolutePath();
                FileInputStream fileInputStream0 = new FileInputStream(parcelFileDescriptor0.getFileDescriptor());
                try {
                    bboc.c(fileInputStream0, file0);
                    parcelFileDescriptor0.close();
                }
                catch(IOException unused_ex) {
                    fkbp.b("IOException occurred while copying files to mdd directory");
                    goto label_52;
                }
                frce frce0 = new frce(context0);
                frce0.g(file0);
                arrayList0.add(new MddFile(s, frce0.a().toString()));
                ++v1;
                arr_s = arr_s;
                sharedPreferences0 = sharedPreferences0;
                arr_parcelFileDescriptor = arr_parcelFileDescriptor1;
            }
            if(sharedPreferences0.edit().putLong("_key_next_file_name", v).commit()) {
                FileGroupResponse fileGroupResponse0 = new FileGroupResponse(overrideFileGroupRequest0.a, overrideFileGroupRequest0.b, 0, arrayList0);
                String s1 = cpws.a(overrideFileGroupRequest0.a, overrideFileGroupRequest0.b, overrideFileGroupRequest0.f);
                cpws.a.put(s1, fileGroupResponse0);
                status0 = Status.b;
            }
            else {
            label_52:
                status0 = new Status(13);
            }
        }
        else {
            status0 = new Status(13);
        }
        try {
            this.a.c.a(status0);
        }
        catch(RemoteException remoteException0) {
            fkbp.k(remoteException0, "Client died during DiagnosticsOverrideOperation", new Object[0]);
        }
    }
}

