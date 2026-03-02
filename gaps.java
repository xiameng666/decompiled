import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.idunderstanding.imagequality.DetectImageQualityRequest;
import com.google.android.gms.idunderstanding.imagequality.DetectImageQualityResponse;
import com.google.android.gms.idunderstanding.imagequality.ImageQualityDetectorConfig;
import com.google.android.gms.idunderstanding.imagequality.ImageQualityFinding;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public final class gaps extends gaok {
    public static final gapr b;
    private final ibtw c;
    private final gclx d;

    static {
        gaps.b = new gapr();
    }

    public gaps(Context context0, gclx gclx0) {
        ibuq.f(context0, "context");
        ibuq.f(gclx0, "idUnderstandingManager");
        gapq gapq0 = new gapq(gaps.b);
        ibuq.f(context0, "context");
        ibuq.f(gclx0, "idUnderstandingManager");
        super(context0);
        this.d = gclx0;
        this.c = gapq0;
    }

    @Override  // gamu
    public final ganp a(gano gano0) {
        evql evql1;
        ibuq.f(gano0, "request");
        ibuq.e(gano0.a, "getIntent(...)");
        ibuq.f(gano0.a, "<this>");
        MessageLite hfvm0 = gawi.i(gano0.a, "modelMetadata", ((MessageLite)hdck.a));
        ibuq.e(hfvm0, "requireTrustedProto(...)");
        ImageQualityDetectorConfig imageQualityDetectorConfig0 = new ImageQualityDetectorConfig(((hdck)hfvm0).b);
        ibuq.e(gano0.a, "getIntent(...)");
        ibuq.f(gano0.a, "<this>");
        Parcelable parcelable0 = gano0.a.getParcelableExtra("imageFileUri");
        ibuq.c(parcelable0);
        Uri uri0 = (Uri)parcelable0;
        try {
            bznp bznp0 = this.d.b;
            Context context0 = bznp0.a;
            fpjb.f(context0);
            if(hufq.a.b().a()) {
                ibuq.f(context0, "context");
                bznt bznt0 = new bznt(context0, bznp0, new bzny(context0, imageQualityDetectorConfig0, new bznw(bzny.a)), bznp0.b);
                Object object0 = bznt0.c.a(bznt0.a);
                ArrayList arrayList0 = new ArrayList();
                bavv.b(bznt0.b, arrayList0);
                evql evql0 = ((bavt)object0).c(bavv.a(arrayList0, bznt0));
                evql0.b(new bznr(new bznq(bznt0)));
                evql0.A(new bzns(bznt0));
                evql1 = bznt0.d.a;
            }
            else {
                evql1 = evrg.c(new bznh(new IllegalStateException("Feature disabled.")));
            }
            Object object1 = evrg.n(evql1);
            ibuq.e(object1, "await(...)");
            ibuq.e(this.a, "getAppContext(...)");
            Object object2 = this.c.a(this.a, uri0);
            if(object2 == null) {
                return new ganp(ganp.d(4));
            }
            DetectImageQualityRequest detectImageQualityRequest0 = new DetectImageQualityRequest(0);
            ObjectWrapper objectWrapper0 = new ObjectWrapper(object2);
            Parcel parcel0 = ((bznk)object1).a.jo();
            wbz.h(parcel0, objectWrapper0);
            wbz.f(parcel0, detectImageQualityRequest0);
            Parcel parcel1 = ((bznk)object1).a.hM(2, parcel0);
            DetectImageQualityResponse detectImageQualityResponse0 = (DetectImageQualityResponse)wbz.a(parcel1, DetectImageQualityResponse.CREATOR);
            parcel1.recycle();
            ibuq.e(detectImageQualityResponse0, "detect(...)");
            Intent intent0 = ganp.e(0);
            ArrayList arrayList1 = new ArrayList(ibpo.q(detectImageQualityResponse0.a, 10));
            for(Object object3: detectImageQualityResponse0.a) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hdcm.a).v_newBuilder();
                int v = ((ImageQualityFinding)object3).a;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((hdcm)hftv0).b |= 1;
                ((hdcm)hftv0).c = v;
                float f = ((ImageQualityFinding)object3).b;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hdcm hdcm0 = (hdcm)hftp0.b_message;
                hdcm0.b |= 2;
                hdcm0.d = f;
                arrayList1.add(((hdcm)hftp0.N_build()));
            }
            gawi.s(intent0, "imageQualityFindingList", arrayList1);
            return new ganp(intent0);
        }
        catch(bznh bznh0) {
            Log.e("ImageQuality", "Id understanding module unavailable.", bznh0);
            return new ganp(ganp.d(1));
        }
        catch(bzng bzng0) {
            Log.e("ImageQuality", "Image quality model unavailable.", bzng0);
            return new ganp(ganp.d(1));
        }
        catch(bznf bznf0) {
            Log.e("ImageQuality", "Failed to initialize.", bznf0);
            return new ganp(ganp.d(2));
        }
        catch(ExecutionException executionException0) {
            Log.e("ImageQuality", "Image quality action failed.", executionException0);
            return ganp.j();
        }
        catch(InterruptedException interruptedException0) {
            Log.e("ImageQuality", "Image quality action interrupted.", interruptedException0);
            return ganp.j();
        }
    }
}

