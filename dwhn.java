import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import java.util.ArrayList;

final class dwhn implements acn, ibum {
    final dwhp a;

    public dwhn(dwhp dwhp0) {
        this.a = dwhp0;
        super();
    }

    @Override  // ibum
    public final ibnk b() {
        return new ibuo(1, this.a, dwhp.class, "handleEditCategoryResult", "handleEditCategoryResult(Landroidx/activity/result/ActivityResult;)V", 0);
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
        gfsx gfsx0;
        Bundle bundle0;
        ibuq.f(((ActivityResult)object0), "p0");
        ibuq.f(((ActivityResult)object0), "result");
        dwhp dwhp0 = this.a;
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
                    a.ae(dwhp.a.j(), "Unable to de-serialize UcpCategoryInfo", hfur0);
                    gfsx0 = gfqx.a;
                }
            }
            if(!gfsx0.i()) {
                ((ggtj)dwhp.a.j()).x("Checked category info is not present");
                dwhp0.e(lsc.a(dwhp0), new frxf[]{dwhe.a});
                return;
            }
            gged_interceptors gged0 = dwhp0.g;
            ArrayList arrayList0 = new ArrayList(ibpo.q(gged0, 10));
            for(Object object1: gged0) {
                arrayList0.add(((dvkz)object1).c);
            }
            gged_interceptors gged1 = ggdx.a(arrayList0);
            icck icck0 = lsc.a(dwhp0);
            dwhk dwhk0 = new dwhk(dwhp0, gged1, gfsx0, null);
            icbb.b(icck0, dwhp0.d, null, dwhk0, 2);
            return;
        }
        dwhp0.e(lsc.a(dwhp0), new frxf[]{dwhe.a});
    }
}

