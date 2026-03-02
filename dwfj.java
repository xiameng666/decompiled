import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import com.google.mlkit.vision.documentscanner..AutoValue_GmsDocumentScanningResult;
import com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult.Page;
import com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult;
import java.util.ArrayList;
import java.util.List;

public final class dwfj implements acn {
    public final dwfo a;

    public dwfj(dwfo dwfo0) {
        this.a = dwfo0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        Intent intent0;
        int v = ((ActivityResult)object0).a;
        dwfo dwfo0 = this.a;
        Context context0 = dwfo0.d;
        batl.m("com.google.android.gms".equals("com.google.android.gms"), "Must be called from GMS app.");
        GmsDocumentScanningResult gmsDocumentScanningResult0 = new hbvy(context0).b(((ActivityResult)object0).b, false);
        if(gmsDocumentScanningResult0 != null) {
            List list0 = ((.AutoValue_GmsDocumentScanningResult)gmsDocumentScanningResult0).a;
            if(list0 != null) {
                switch(v) {
                    case -1: {
                        if(!list0.isEmpty()) {
                            ggdy ggdy0 = new ggdy();
                            for(Object object1: list0) {
                                ggdy0.i(((GmsDocumentScanningResult.Page)object1).a());
                            }
                            gged_interceptors gged0 = ggdy0.h();
                            ggdy ggdy1 = new ggdy();
                            for(Object object2: list0) {
                                ggdy1.i(gfta.b(((GmsDocumentScanningResult.Page)object2).b()));
                            }
                            gged_interceptors gged1 = ggdy1.h();
                            dwfo0.al = false;
                            if(!gged0.isEmpty()) {
                                if(hwvf.g()) {
                                    int v1 = dwfo0.am;
                                    intent0 = dlnf.t(gged0, dwfo0.an, dwfo0.ao).putStringArrayListExtra("ORIGINAL_IMAGE_HASHES", new ArrayList(gged1)).putExtra("USER_CREATED_PASS_VERSION", v1);
                                }
                                else {
                                    intent0 = dlnf.t(gged0, dwfo0.an, dwfo0.ao).putStringArrayListExtra("ORIGINAL_IMAGE_HASHES", new ArrayList(gged1));
                                }
                                dwfo0.startActivity(intent0.setFlags(0x4000000).addFlags(1).addFlags(0x40).addFlags(0x2000000));
                                dwfo0.aq.c();
                                return;
                            }
                            dwfo0.ar();
                            return;
                        }
                        break;
                    }
                    case 0: {
                        dwfo0.ar();
                        break;
                    }
                    default: {
                        return;
                    }
                }
            }
            return;
        }
        dwfo0.ar();
    }
}

