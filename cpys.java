import com.google.android.gms.mdd.FileGroupWithDownloadStatus;
import com.google.android.gms.mdi.download.ui.DebugUiChimeraActivity;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class cpys implements evqf {
    final DebugUiChimeraActivity a;

    public cpys(DebugUiChimeraActivity debugUiChimeraActivity0) {
        Objects.requireNonNull(debugUiChimeraActivity0);
        this.a = debugUiChimeraActivity0;
        super();
    }

    @Override  // evqf
    public final void gw(Object object0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: ((List)object0)) {
            arrayList0.add("GroupName = " + ((FileGroupWithDownloadStatus)object1).a + "\nOwnerPackage = " + ((FileGroupWithDownloadStatus)object1).b + "\nFileGroupVersionNumber = " + ((FileGroupWithDownloadStatus)object1).c + "\nDownloaded = " + ((FileGroupWithDownloadStatus)object1).d);
        }
        this.a.j.clear();
        this.a.j.addAll(arrayList0);
    }
}

