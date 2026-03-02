import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.UploadBatchParcel;
import com.google.android.gms.measurement.internal.UploadBatchesCriteria;
import com.google.android.gms.measurement.internal.UploadBatchesParcel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public final class crkx implements Runnable {
    public final String a;
    public final UploadBatchesCriteria b;
    public final crih c;
    public final crim d;

    public crkx(crih crih0, String s, UploadBatchesCriteria uploadBatchesCriteria0, crim crim0) {
        this.c = crih0;
        this.a = s;
        this.b = uploadBatchesCriteria0;
        this.d = crim0;
    }

    @Override
    public final void run() {
        crih crih0 = this.c;
        crqq crqq0 = crih0.a;
        crqq0.F();
        crqq0.E();
        crqq0.G();
        crdg crdg0 = crqq0.o();
        int v = (int)(((Integer)crif.A.a()));
        String s = this.a;
        List list0 = crdg0.y(s, this.b, v);
        ArrayList arrayList0 = new ArrayList();
        crim crim0 = this.d;
        for(Object object0: list0) {
            crqs crqs0 = (crqs)object0;
            String s1 = crqs0.c;
            if(crqq0.ao(s, s1)) {
                int v1 = crqs0.i;
                if(v1 > 0) {
                    if(v1 <= ((int)(((Integer)crif.y.a())))) {
                        long v2 = Math.min(((long)(((Long)crif.w.a()))) * (1L << v1 - 1), ((Long)crif.x.a()).longValue());
                        crqq0.av();
                        if(System.currentTimeMillis() < crqs0.h + v2) {
                            crqq0.aJ().k.d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", s, Long.valueOf(crqs0.a), Long.valueOf(crqs0.h));
                            continue;
                        }
                    }
                    else {
                        crqq0.aJ().k.d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", s, Long.valueOf(crqs0.a), Long.valueOf(crqs0.h));
                        continue;
                    }
                }
                Bundle bundle0 = new Bundle();
                for(Object object1: crqs0.d.entrySet()) {
                    bundle0.putString(((String)((Map.Entry)object1).getKey()), ((String)((Map.Entry)object1).getValue()));
                }
                byte[] arr_b = crqs0.b.toBytesArray();
                UploadBatchParcel uploadBatchParcel0 = new UploadBatchParcel(crqs0.a, arr_b, s1, bundle0, crqs0.e.g, crqs0.g, "");
                try {
                    crsr crsr0 = (crsr)crqt.o(((Builder)(((crsr)((ProtoLiteMessage)crss.a).v_newBuilder()))), uploadBatchParcel0.b);
                    for(int v3 = 0; v3 < ((crss)crsr0.b_message).c.size(); ++v3) {
                        crsu crsu0 = (crsu)((crss)crsr0.b_message).c.get(v3);
                        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)crsu0).jf(5, null);
                        hftp0.X(((ProtoLiteMessage)crsu0));
                        crst crst0 = (crst)hftp0;
                        crqq0.av();
                        long v4 = System.currentTimeMillis();
                        if(!crst0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crst0).ensureMutable();
                        }
                        crsu crsu1 = (crsu)crst0.b_message;
                        crsu1.b |= 2;
                        crsu1.g = v4;
                        crsr0.l(v3, crst0);
                    }
                    uploadBatchParcel0.b = ((crss)((ProtoLiteBuilder)crsr0).N_build()).toBytesArray();
                    if(crqq0.aJ().j(2)) {
                        uploadBatchParcel0.g = crqq0.z().p(((crss)((ProtoLiteBuilder)crsr0).N_build()));
                    }
                }
                catch(hfur unused_ex) {
                    crqq0.aJ().f.b("Failed to parse queued batch. appId", s);
                    continue;
                }
                arrayList0.add(uploadBatchParcel0);
            }
            else {
                crqq0.aJ().k.d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", s, Long.valueOf(crqs0.a), crqs0.c);
            }
        }
        UploadBatchesParcel uploadBatchesParcel0 = new UploadBatchesParcel(arrayList0);
        try {
            Parcel parcel0 = crim0.jo();
            wbz.f(parcel0, uploadBatchesParcel0);
            crim0.jq(2, parcel0);
            crih0.a.aJ().k.c("[sgtm] Sending queued upload batches to client. appId, count", s, Integer.valueOf(uploadBatchesParcel0.a.size()));
        }
        catch(RemoteException remoteException0) {
            crih0.a.aJ().c.c("[sgtm] Failed to return upload batches for app", s, remoteException0);
        }
    }
}

