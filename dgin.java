import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.android.gms.nearby.sharing.FileAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class dgin implements dgja {
    private final Context a;
    private final List b;
    private final int c;
    private final String d;

    public dgin(Context context0, List list0, int v, String s) {
        ibuq.f(context0, "context");
        super();
        this.a = context0;
        this.b = list0;
        this.c = v;
        this.d = s;
        if(!list0.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override  // dgja
    public final Object a() {
        Intent intent0;
        ibqm ibqm0 = new ibqm(null);
        List list0 = this.b;
        if(!list0.isEmpty()) {
            Iterator iterator0 = list0.iterator();
        label_4:
            if(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                switch(((FileAttachment)object0).b) {
                    case 1: 
                    case 2: {
                        goto label_4;
                    }
                    default: {
                        ibqm0.add(dgiz.c(this.a, true));
                        return ibpo.a(ibqm0);
                    }
                }
            }
        }
        if(list0.size() <= ((int)hvqs.T()) && djbm.g()) {
            intent0 = dgiz.a(this.d);
            intent0.setClassName("com.sec.android.gallery3d", "com.sec.android.gallery3d.app.GalleryActivity");
            intent0.setAction("android.intent.action.VIEW");
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: list0) {
                Uri uri0 = ((FileAttachment)object1).d;
                if(uri0 != null) {
                    arrayList0.add(uri0);
                }
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object2: list0) {
                if(((FileAttachment)object2).b == 2) {
                    arrayList1.add(object2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for(Object object3: arrayList1) {
                Uri uri1 = ((FileAttachment)object3).d;
                if(uri1 != null) {
                    arrayList2.add(uri1);
                }
            }
            intent0.putParcelableArrayListExtra("uriListData", new ArrayList(arrayList0));
            intent0.putExtra("useUriList", true);
            intent0.putExtra("KEY_ITEM_POSITION", 0);
            intent0.setDataAndType(((Uri)arrayList0.get(0)), "image/*");
            if(!arrayList2.isEmpty()) {
                Intent intent1 = new Intent("android.intent.action.VIEW");
                intent1.setType("video/*");
                Context context0 = this.a;
                List list1 = context0.getPackageManager().queryIntentActivities(intent1, 0x20000);
                ibuq.e(list1, "queryIntentActivities(...)");
                for(Object object4: list1) {
                    ActivityInfo activityInfo0 = ((ResolveInfo)object4).activityInfo;
                    for(Object object5: arrayList2) {
                        context0.grantUriPermission(activityInfo0.applicationInfo.packageName, ((Uri)object5), 3);
                    }
                }
            }
            Context context1 = this.a;
            ComponentName componentName0 = intent0.resolveActivity(context1.getPackageManager());
            if(componentName0 == null) {
                dcvz.a.b().p("Failed to find an intent to view multiple media files.", new Object[0]);
                intent0 = null;
            }
            else {
                String s = componentName0.getPackageName();
                ibuq.e(s, "getPackageName(...)");
                for(Object object6: arrayList0) {
                    context1.grantUriPermission(s, ((Uri)object6), 3);
                }
            }
        }
        else {
            intent0 = null;
        }
        if(intent0 == null) {
            ibqm0.add(dgiz.c(this.a, true));
        }
        else {
            Context context2 = this.a;
            ibqm0.add(dgiz.b(context2, intent0, true));
            ibqm0.add(dgiz.c(context2, false));
            if(this.c == 1) {
                if(!list0.isEmpty()) {
                    for(Object object7: list0) {
                        if(((FileAttachment)object7).b != 1) {
                            return ibpo.a(ibqm0);
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for(Object object8: list0) {
                    Uri uri2 = ((FileAttachment)object8).d;
                    String s1 = uri2 == null ? null : uri2.toString();
                    if(s1 != null) {
                        arrayList3.add(s1);
                    }
                }
                if(!arrayList3.isEmpty()) {
                    ibqm0.add(dgiz.f(context2, arrayList3));
                    return ibpo.a(ibqm0);
                }
            }
        }
        return ibpo.a(ibqm0);
    }
}

