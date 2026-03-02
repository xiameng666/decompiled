import android.accounts.Account;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.util.Size;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.FileAttachment;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public final class dcup extends ibsl implements ibtw {
    int a;
    final dcus b;
    final List c;
    final byte[] d;
    final Account e;
    final String f;

    public dcup(dcus dcus0, List list0, byte[] arr_b, Account account0, String s, ibrl ibrl0) {
        this.b = dcus0;
        this.c = list0;
        this.d = arr_b;
        this.e = account0;
        this.f = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcup)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dcup(this.b, this.c, this.d, this.e, this.f, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        byte[] arr_b;
        Matrix matrix1;
        Rect rect0;
        Bitmap bitmap1;
        Bitmap bitmap0;
        Size size0;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        dcus dcus0 = this.b;
        List list0 = this.c;
        ibuq.f(list0, "attachments");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        ArrayList arrayList0 = new ArrayList();
        for(Object object2: list0) {
            if((object2 instanceof FileAttachment)) {
                arrayList0.add(object2);
            }
        }
        for(Object object3: arrayList0) {
            FileAttachment fileAttachment0 = (FileAttachment)object3;
            int v1 = arrayList0.size();
            int v2 = linkedHashMap0.size();
            Uri uri0 = fileAttachment0.d;
            if(uri0 != null) {
                switch(v1) {
                    case 1: {
                        size0 = new Size(((int)hvqs.a.aT().F()), ((int)hvqs.a.aT().B()));
                        break;
                    }
                    case 2: {
                        size0 = new Size(((int)hvqs.a.aT().E()), ((int)hvqs.a.aT().A()));
                        break;
                    }
                    default: {
                        size0 = v2 == 0 ? new Size(((int)hvqs.a.aT().C()), ((int)hvqs.a.aT().y())) : new Size(((int)hvqs.a.aT().D()), ((int)hvqs.a.aT().z()));
                    }
                }
                dctg dctg0 = dcus0.c;
                switch(fileAttachment0.b) {
                    case 1: {
                        bitmap0 = dizk.b(dctg0.a, uri0);
                        break;
                    }
                    case 2: {
                        bitmap0 = dizk.e(dctg0.a, size0, uri0);
                        break;
                    }
                    default: {
                        bitmap0 = null;
                    }
                }
                if(bitmap0 != null) {
                    if(bitmap0.getWidth() == size0.getWidth() && bitmap0.getHeight() == size0.getHeight()) {
                        bitmap1 = bitmap0;
                    }
                    else {
                        float f = (float)bitmap0.getWidth();
                        float f1 = (float)bitmap0.getHeight();
                        float f2 = ((float)size0.getWidth()) / ((float)size0.getHeight());
                        if(Float.compare(f / f1, f2) > 0) {
                            float f3 = ((float)bitmap0.getHeight()) * f2;
                            int v3 = (bitmap0.getWidth() - ((int)f3)) / 2;
                            rect0 = new Rect(v3, 0, ((int)f3) + v3, bitmap0.getHeight());
                        }
                        else {
                            float f4 = ((float)bitmap0.getWidth()) / f2;
                            int v4 = (bitmap0.getHeight() - ((int)f4)) / 2;
                            rect0 = new Rect(0, v4, bitmap0.getWidth(), ((int)f4) + v4);
                        }
                        Rect rect1 = new Rect(0, 0, bitmap0.getWidth(), bitmap0.getHeight());
                        Rect rect2 = new Rect(rect0);
                        rect2.intersect(rect1);
                        float f5 = ((float)size0.getWidth()) / ((float)rect2.width());
                        if((f5 < 1.0f)) {
                            Matrix matrix0 = new Matrix();
                            matrix0.setScale(f5, f5);
                            matrix1 = matrix0;
                        }
                        else {
                            matrix1 = null;
                        }
                        bitmap1 = Bitmap.createBitmap(bitmap0, rect2.left, rect2.top, rect2.width(), rect2.height(), matrix1, true);
                        ibuq.e(bitmap1, "createBitmap(...)");
                    }
                    arr_b = dizk.g(bitmap1, ((int)hvqs.a.aT().x()));
                    goto label_70;
                }
            }
            arr_b = null;
        label_70:
            if(arr_b != null) {
                linkedHashMap0.put(Long.valueOf(fileAttachment0.g), arr_b);
                if(linkedHashMap0.size() >= 3) {
                    break;
                }
            }
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object4: list0) {
            arrayList1.add(new dcsk(((Attachment)object4), ((byte[])linkedHashMap0.get(new Long(((Attachment)object4).b())))));
        }
        this.a = 1;
        Object object5 = dcus0.a.c(this.d, arrayList1, this.e, this.f, this);
        return object5 == object1 ? object1 : object5;
    }
}

