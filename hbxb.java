import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.Image.Plane;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import com.google.android.gms.vision.text.internal.client.BoundingBoxParcel;
import com.google.android.gms.vision.text.internal.client.LineBoxParcel;
import com.google.android.gms.vision.text.internal.client.TextRecognizerOptions;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

final class hbxb implements hbxm {
    private final Context a;
    private final TextRecognizerOptions b;
    private boolean c;
    private favn d;

    public hbxb(Context context0) {
        this.b = new TextRecognizerOptions();
        this.a = context0;
    }

    @Override  // hbxm
    public final hbwk a(hbtp hbtp0) {
        String s3;
        LineBoxParcel[] arr_lineBoxParcel;
        int v1;
        Bitmap bitmap0;
        if(this.d == null) {
            this.b();
        }
        if(this.d == null) {
            throw new havd("Waiting for the text recognition module to be downloaded. Please wait.", 14);
        }
        int v = hbtp0.g;
        if(v == -1) {
            bitmap0 = hbtp0.a;
            v1 = hbts.a(hbtp0.f);
        }
        else {
            switch(v) {
                case -1: {
                    Bitmap bitmap1 = hbtp0.a;
                    batl.s(bitmap1);
                    bitmap0 = hbtt.a(bitmap1, hbtp0.f, hbtp0.d, hbtp0.e);
                    break;
                }
                case 17: {
                    ByteBuffer byteBuffer0 = hbtp0.b;
                    batl.s(byteBuffer0);
                    bitmap0 = hbtt.d(byteBuffer0, hbtp0.d, hbtp0.e, hbtp0.f);
                    break;
                }
                case 35: {
                    Image.Plane[] arr_image$Plane = hbtp0.b();
                    batl.s(arr_image$Plane);
                    bitmap0 = hbtt.d(hbtt.e(arr_image$Plane, hbtp0.d, hbtp0.e), hbtp0.d, hbtp0.e, hbtp0.f);
                    break;
                }
                case 842094169: {
                    ByteBuffer byteBuffer1 = hbtp0.b;
                    batl.s(byteBuffer1);
                    byte[] arr_b = hbtt.c(hbtt.b(byteBuffer1, true).array(), hbtp0.d, hbtp0.e);
                    Bitmap bitmap2 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
                    int v2 = bitmap2.getWidth();
                    int v3 = bitmap2.getHeight();
                    bitmap0 = hbtt.a(bitmap2, hbtp0.f, v2, v3);
                    break;
                }
                default: {
                    throw new havd("Unsupported image format", 13);
                }
            }
            v1 = 0;
        }
        ObjectWrapper objectWrapper0 = new ObjectWrapper(bitmap0);
        FrameMetadataParcel frameMetadataParcel0 = new FrameMetadataParcel(hbtp0.d, hbtp0.e, 0, 0L, v1);
        try {
            favn favn0 = this.d;
            batl.s(favn0);
            Parcel parcel0 = favn0.jo();
            wbz.h(parcel0, objectWrapper0);
            wbz.f(parcel0, frameMetadataParcel0);
            Parcel parcel1 = favn0.hM(1, parcel0);
            arr_lineBoxParcel = (LineBoxParcel[])parcel1.createTypedArray(LineBoxParcel.CREATOR);
            parcel1.recycle();
        }
        catch(RemoteException remoteException0) {
            throw new havd("Failed to run legacy text recognizer.", remoteException0);
        }
        SparseArray sparseArray0 = new SparseArray();
        for(int v4 = 0; v4 < arr_lineBoxParcel.length; ++v4) {
            LineBoxParcel lineBoxParcel0 = arr_lineBoxParcel[v4];
            int v5 = lineBoxParcel0.j;
            SparseArray sparseArray1 = (SparseArray)sparseArray0.get(v5);
            if(sparseArray1 == null) {
                sparseArray1 = new SparseArray();
                sparseArray0.append(v5, sparseArray1);
            }
            sparseArray1.append(lineBoxParcel0.k, lineBoxParcel0);
        }
        ggdy ggdy0 = new ggdy();
        int v6 = 0;
        while(v6 < sparseArray0.size()) {
            SparseArray sparseArray2 = (SparseArray)sparseArray0.valueAt(v6);
            ggdy ggdy1 = new ggdy();
            for(int v7 = 0; v7 < sparseArray2.size(); ++v7) {
                ggdy1.i(((LineBoxParcel)sparseArray2.valueAt(v7)));
            }
            gged_interceptors gged0 = ggdy1.h();
            List list0 = ggia.h(gged0, new hbxe());
            BoundingBoxParcel boundingBoxParcel0 = ((LineBoxParcel)gged0.get(0)).b;
            int v8 = 0x80000000;
            int v9 = 0x7FFFFFFF;
            int v10 = 0x7FFFFFFF;
            int v11 = 0x80000000;
            ggqk ggqk0 = gged0.E();
            while(ggqk0.hasNext()) {
                Object object0 = ggqk0.next();
                double f = Math.sin(Math.toRadians(boundingBoxParcel0.e));
                double f1 = Math.cos(Math.toRadians(boundingBoxParcel0.e));
                Point[] arr_point = new Point[4];
                Point point0 = new Point(((LineBoxParcel)object0).b.a, ((LineBoxParcel)object0).b.b);
                arr_point[0] = point0;
                point0.offset(-boundingBoxParcel0.a, -boundingBoxParcel0.b);
                double f2 = ((double)(-arr_point[0].x)) * f;
                int v12 = (int)(((double)arr_point[0].x) * f1 + ((double)arr_point[0].y) * f);
                arr_point[0].x = v12;
                int v13 = (int)(f2 + ((double)arr_point[0].y) * f1);
                arr_point[0].y = v13;
                int v14 = ((LineBoxParcel)object0).b.c + v12;
                arr_point[1] = new Point(v14, v13);
                int v15 = v13 + ((LineBoxParcel)object0).b.d;
                arr_point[2] = new Point(v14, v15);
                arr_point[3] = new Point(v12, v15);
                for(int v16 = 0; v16 < 4; ++v16) {
                    Point point1 = arr_point[v16];
                    v9 = Math.min(v9, point1.x);
                    v8 = Math.max(v8, point1.x);
                    v10 = Math.min(v10, point1.y);
                    v11 = Math.max(v11, point1.y);
                }
                boundingBoxParcel0 = boundingBoxParcel0;
                ggqk0 = ggqk0;
                sparseArray0 = sparseArray0;
                v6 = v6;
            }
            int v17 = boundingBoxParcel0.a;
            int v18 = boundingBoxParcel0.b;
            double f3 = Math.sin(Math.toRadians(boundingBoxParcel0.e));
            double f4 = Math.cos(Math.toRadians(boundingBoxParcel0.e));
            Point[] arr_point1 = {new Point(v9, v10), new Point(v8, v10), new Point(v8, v11), new Point(v9, v11)};
            int v19 = 0;
            while(v19 < 4) {
                double f5 = ((double)arr_point1[v19].x) * f4;
                double f6 = ((double)arr_point1[v19].y) * f3;
                double f7 = ((double)arr_point1[v19].x) * f3;
                double f8 = ((double)arr_point1[v19].y) * f4;
                arr_point1[v19].x = (int)(f5 - f6);
                arr_point1[v19].y = (int)(f7 + f8);
                arr_point1[v19].offset(v17, v18);
                ++v19;
                f4 = f4;
            }
            List list1 = Arrays.asList(arr_point1);
            List list2 = ggia.h(list0, new hbxf());
            String s = hbxh.a.b(list2);
            Rect rect0 = hbwx.a(list1);
            HashMap hashMap0 = new HashMap();
            for(Object object1: list0) {
                String s1 = ((hbwh)object1).b;
                hashMap0.put(s1, Integer.valueOf((hashMap0.containsKey(s1) ? ((int)(((Integer)hashMap0.get(s1)))) : 0) + 1));
            }
            Set set0 = hashMap0.entrySet();
            if(!set0.isEmpty()) {
                String s2 = (String)((Map.Entry)Collections.max(set0, hbxh.b)).getKey();
                if(!gfta.c(s2)) {
                    s3 = s2;
                    goto label_140;
                }
            }
            s3 = "und";
        label_140:
            ggdy0.i(new hbwj(s, rect0, list1, s3, list0));
            ++v6;
            sparseArray0 = sparseArray0;
        }
        gged_interceptors gged1 = ggdy0.h();
        List list3 = ggia.h(gged1, new hbxd());
        hbxh.a.b(list3);
        return new hbwk(gged1);
    }

    @Override  // hbxm
    public final void b() {
        favo favo0;
        if(this.d == null) {
            try {
                Context context0 = this.a;
                IBinder iBinder0 = bjia.f(context0, bjia.a, "com.google.android.gms.vision.dynamite").e("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator");
                if(iBinder0 == null) {
                    favo0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
                    favo0 = (iInterface0 instanceof favo) ? ((favo)iInterface0) : new favo(iBinder0);
                }
                favn favn0 = favo0.a(new ObjectWrapper(context0), this.b);
                this.d = favn0;
                if(favn0 == null && !this.c) {
                    hawq.a(context0, "ocr");
                    this.c = true;
                }
            }
            catch(RemoteException remoteException0) {
                throw new havd("Failed to create legacy text recognizer.", remoteException0);
            }
            catch(bjhw bjhw0) {
                throw new havd("Failed to load deprecated vision dynamite module.", bjhw0);
            }
        }
    }

    @Override  // hbxm
    public final void c() {
        favn favn0 = this.d;
        if(favn0 != null) {
            try {
                favn0.a();
            }
            catch(RemoteException remoteException0) {
                Log.e("LegacyTextDelegate", "Failed to release legacy text recognizer.", remoteException0);
            }
            this.d = null;
        }
    }
}

