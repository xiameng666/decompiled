import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.pay.UserCreatedPassAttachmentMetadata;
import java.util.ArrayList;

final class dwgk implements acn, ibum {
    final dwgo a;

    public dwgk(dwgo dwgo0) {
        this.a = dwgo0;
        super();
    }

    @Override  // ibum
    public final ibnk b() {
        return new ibuo(1, this.a, dwgo.class, "onEditChangeActivityResult", "onEditChangeActivityResult(Landroidx/activity/result/ActivityResult;)V", 0);
    }

    @Override
    public final boolean equals(Object object0) {
        return !(object0 instanceof acn) || !(object0 instanceof ibum) ? false : ibuq.m(this.b(), ((ibum)object0).b());
    }

    @Override
    public final int hashCode() {
        return this.b().hashCode();
    }

    @Override  // acn
    public final void jN(Object object0) {
        gged_interceptors gged2;
        gfsx gfsx0;
        Bundle bundle0;
        ibuq.f(((ActivityResult)object0), "p0");
        ibuq.f(((ActivityResult)object0), "result");
        dwgo dwgo0 = this.a;
        if(((ActivityResult)object0).a == -1) {
            Intent intent0 = ((ActivityResult)object0).b;
            if(intent0 == null) {
                bundle0 = new Bundle();
            }
            else {
                bundle0 = intent0.getExtras();
                if(bundle0 == null) {
                    bundle0 = new Bundle();
                }
            }
            byte[] arr_b = bundle0.getByteArray("CHECKED_CATEGORY_INFO");
            if(arr_b == null) {
                gfsx0 = gfqx.a;
            }
            else {
                try {
                    hftc hftc0 = hftc.a();
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gvby.a), arr_b, 0, arr_b.length, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    gfsx0 = gfsx.l(((gvby)hftv0));
                }
                catch(hfur hfur0) {
                    a.ae(dwgo.a.i(), "Unable to de-serialize UcpCategoryInfo", hfur0);
                    gfsx0 = gfqx.a;
                }
            }
            if(!gfsx0.i()) {
                dwgo0.l(lsc.a(dwgo0), new frxf[]{dwfz.a});
                return;
            }
            int v = ((gvby)gfsx0.d()).c;
            guwr guwr0 = dwgo0.s;
            if(guwr0 == null) {
                ibuq.j("ucpManualInputAction");
                guwr0 = null;
            }
            if(v == (guwr0.c == null ? gvby.a : guwr0.c).c) {
                dwgo0.m(null);
                return;
            }
            icck icck0 = lsc.a(dwgo0);
            frxf[] arr_frxf = new frxf[1];
            gged_interceptors gged0 = dwgo0.c();
            if(hwvf.f()) {
                gged_interceptors gged1 = dwgo0.l;
                ArrayList arrayList0 = new ArrayList(ibpo.q(gged1, 10));
                for(Object object1: gged1) {
                    String s = ((UserCreatedPassAttachmentMetadata)object1).b;
                    if(s == null) {
                        s = "";
                    }
                    arrayList0.add(s);
                }
                gged2 = ggdx.a(arrayList0);
            }
            else {
                gged2 = ggna.a;
                ibuq.c(gged2);
            }
            Intent intent1 = dlnf.af(gged0, gged2, ((gvby)gfsx0.d()).c, dwgo0.u, true, dwgo0.q, dwgo0.r).setFlags(0x6000000);
            ibuq.e(intent1, "setFlags(...)");
            arr_frxf[0] = new frxg(intent1);
            dwgo0.l(icck0, arr_frxf);
            return;
        }
        dwgo0.l(lsc.a(dwgo0), new frxf[]{dwfz.a});
    }
}

