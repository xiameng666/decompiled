import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.ParcelFileDescriptor;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class dgez extends ibsl implements ibtw {
    final dgfc a;
    final Context b;
    final Size c;
    final int d;

    public dgez(dgfc dgfc0, Context context0, Size size0, int v, ibrl ibrl0) {
        this.a = dgfc0;
        this.b = context0;
        this.c = size0;
        this.d = v;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgez)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dgez(this.a, this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Bitmap bitmap0;
        ibnx.b(object0);
        Object object1 = new ArrayList();
        dgfc dgfc0 = this.a;
        for(Object object2: dgfc0.c) {
            dgfl dgfl0 = (dgfl)object2;
            if(((List)object1).size() < 3) {
                cuwu cuwu0 = (cuwu)dgfc0.g.get(new Long(dgfl0.b));
                if(cuwu0 != null) {
                    cuws cuws0 = cuwu0.l;
                    if(cuws0 != null) {
                        Uri uri0 = cuws0.d;
                        if(uri0 != null) {
                            int v = dgfl0.c;
                            if(v == 1) {
                                bitmap0 = dizk.b(this.b, uri0);
                                if(bitmap0 == null) {
                                    continue;
                                }
                            }
                            else {
                                if(v != 2) {
                                    continue;
                                }
                                bitmap0 = dizk.e(this.b, this.c, uri0);
                                if(bitmap0 != null) {
                                    goto label_22;
                                }
                                continue;
                            }
                        label_22:
                            ibuq.f(bitmap0, "<this>");
                            int v1 = Math.min(bitmap0.getWidth(), this.c.getWidth());
                            float f = (float)Math.min(bitmap0.getHeight(), this.c.getHeight());
                            float f1 = (float)bitmap0.getHeight();
                            float f2 = Math.min(((float)v1) / ((float)bitmap0.getWidth()), f / f1);
                            byte[] arr_b = dizk.g(Bitmap.createScaledBitmap(bitmap0, ((int)(((float)bitmap0.getWidth()) * f2)), ((int)(((float)bitmap0.getHeight()) * f2)), true), this.d);
                            dcvz.a.a().h("Compressed preview bitmap size: %d bytes", new Integer(arr_b.length));
                            ParcelFileDescriptor[] arr_parcelFileDescriptor = ParcelFileDescriptor.createReliablePipe();
                            ibuq.c(arr_parcelFileDescriptor);
                            ParcelFileDescriptor parcelFileDescriptor0 = arr_parcelFileDescriptor[0];
                            ParcelFileDescriptor.AutoCloseOutputStream parcelFileDescriptor$AutoCloseOutputStream0 = new ParcelFileDescriptor.AutoCloseOutputStream(arr_parcelFileDescriptor[1]);
                            parcelFileDescriptor$AutoCloseOutputStream0.write(arr_b);
                            cuwu cuwu1 = cuwu.g(parcelFileDescriptor0, ((long)arr_b.length));
                            cuwu1.o = true;
                            cuwu1.l("nearby_share_previews");
                            cuwu1.j("preview_" + Arrays.hashCode(arr_b) + ".webp");
                            ((List)object1).add(new dgfv(parcelFileDescriptor$AutoCloseOutputStream0, cuwu1));
                        }
                    }
                }
            }
        }
        return object1;
    }
}

