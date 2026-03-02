import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.FACLData;
import com.google.android.gms.auth.firstparty.shared.ScopeData;
import com.google.android.gms.auth.firstparty.shared.ScopeDetail;
import java.util.ArrayList;

public final class bxju implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        String s2;
        boolean z10;
        boolean z9;
        boolean z8;
        boolean z7;
        boolean z6;
        boolean z5;
        String s1;
        String s;
        boolean z4;
        boolean z3;
        boolean z2;
        boolean z1;
        boolean z;
        ArrayList arrayList0 = ggia.b(((ScopeDetail)object0).a());
        FACLData fACLData0 = ((ScopeDetail)object0).h;
        if(fACLData0 == null) {
            s2 = null;
            s1 = null;
            z5 = false;
            z10 = false;
            z9 = false;
            z8 = false;
            z7 = false;
            z6 = false;
        }
        else {
            FACLConfig fACLConfig0 = fACLData0.b;
            if(fACLConfig0 == null) {
                s = null;
                z = false;
                z1 = false;
                z2 = false;
                z3 = false;
                z4 = false;
            }
            else {
                z = fACLConfig0.d;
                z1 = fACLConfig0.b;
                z2 = fACLConfig0.f;
                z3 = fACLConfig0.e;
                z4 = fACLConfig0.g;
                s = fACLConfig0.c;
            }
            s1 = fACLData0.c;
            z5 = fACLData0.d;
            z6 = z;
            z7 = z1;
            z8 = z2;
            z9 = z3;
            z10 = z4;
            s2 = s;
        }
        String s3 = ((ScopeDetail)object0).b;
        String s4 = ((ScopeDetail)object0).c;
        String s5 = ((ScopeDetail)object0).d;
        boolean z11 = false;
        String s6 = ((ScopeDetail)object0).e;
        if(fACLData0 != null) {
            z11 = true;
        }
        return new ScopeData(s3, s4, s5, s6, z11, s2, s1, z5, z10, z9, z8, z7, z6, arrayList0, ((ScopeDetail)object0).f);
    }
}

