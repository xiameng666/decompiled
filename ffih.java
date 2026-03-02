import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import j..util.Objects;
import java.util.Map.Entry;

final class ffih extends ffee {
    final PutDataRequest c;
    final fdiy d;
    final fflv e;

    public ffih(fflv fflv0, String s, PutDataRequest putDataRequest0, fdiy fdiy0) {
        this.c = putDataRequest0;
        this.d = fdiy0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super(s);
    }

    @Override  // ffee
    public final void a() {
        fdpo fdpo0;
        fflv fflv0 = this.e;
        String s = fflv0.t().a;
        PutDataRequest putDataRequest0 = this.c;
        fdun fdun0 = null;
        if(putDataRequest0 != null) {
            Uri uri0 = putDataRequest0.a;
            String s1 = uri0.getHost();
            boolean z = true;
            String s2 = TextUtils.isEmpty(s1) ? s : s1;
            ffml ffml0 = (ffml)ffgp.l.get();
            long v = 0L;
            if(putDataRequest0.d != 0L) {
                z = false;
            }
            if(!z) {
                v = ffml0 == null ? hzzi.d() : ffml0.a().toMillis();
            }
            long v1 = SystemClock.elapsedRealtime() + v;
            String s3 = uri0.getPath();
            batl.s(s3);
            fdun fdun1 = new fdun(s2, s3, z, v1);
            for(Object object0: putDataRequest0.c().entrySet()) {
                String s4 = (String)((Map.Entry)object0).getKey();
                Asset asset0 = (Asset)((Map.Entry)object0).getValue();
                String s5 = asset0.b;
                if(s5 != null) {
                    fdpo0 = new fdpo(null, s5, null);
                    fdun1.d(s4, fdpo0);
                    continue;
                }
                byte[] arr_b = asset0.a;
                if(arr_b != null) {
                    fdpo0 = new fdpo(arr_b, null, null);
                    fdun1.d(s4, fdpo0);
                    continue;
                }
                ParcelFileDescriptor parcelFileDescriptor0 = asset0.c;
                if(parcelFileDescriptor0 == null) {
                    throw new IllegalArgumentException("Unconvertable asset: " + asset0);
                }
                fdpo0 = new fdpo(null, null, parcelFileDescriptor0);
                fdun1.d(s4, fdpo0);
                continue;
            }
            fdun1.e = putDataRequest0.c;
            fdun0 = fdun1;
        }
        gmcd gmcd0 = fflv0.h.o(fflv0.e, fdun0);
        gmcd0.hB(new ffig(gmcd0, this.d), new gmaq());
    }
}

