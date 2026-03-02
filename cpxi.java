import android.content.Context;
import android.content.Intent;
import com.google.android.gms.mdd.BroadcastDownloadedFileGroupInfo;
import java.util.ArrayList;
import java.util.List;

public final class cpxi implements gfsi {
    public final cpxl a;
    public final ggfp b;
    public final Context c;

    public cpxi(cpxl cpxl0, ggfp ggfp0, Context context0) {
        this.a = cpxl0;
        this.b = ggfp0;
        this.c = context0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: ((List)object0)) {
            fjcl fjcl0 = ((fjxp)object1).a;
            fjbs fjbs0 = ((fjxp)object1).b;
            if(fjcl0.f) {
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)fjcl0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)fjcl0));
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                fjcl fjcl1 = (fjcl)hftp0.b_message;
                fjcl1.b |= 8;
                fjcl1.f = false;
                fjcl fjcl2 = (fjcl)hftp0.N_build();
                if(this.b.contains(fjcl2)) {
                    arrayList0.add(new BroadcastDownloadedFileGroupInfo(fjbs0.d, fjbs0.e));
                    this.a.c.m(1073, fjbs0.d, fjbs0.f, fjbs0.t, fjbs0.u);
                }
            }
        }
        if(!arrayList0.isEmpty()) {
            Intent intent0 = bbmq.j(new Intent());
            intent0.setAction("com.google.android.gms.mdi.download.DOWNLOAD_COMPLETE");
            bauc.j(arrayList0, intent0, "newly_downloaded_file_group_info");
            this.c.sendBroadcast(intent0);
        }
        return null;
    }
}

