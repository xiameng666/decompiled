import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.util.SparseBooleanArray;
import java.util.Set;

public final class ezsg {
    private final Context a;

    public ezsg(Context context0) {
        this.a = context0;
    }

    public final void a(Account account0) {
        Intent intent0 = new Intent("com.google.android.gms.udc.action.FACS_CACHE_UPDATED");
        Context context0 = this.a;
        context0.sendBroadcast(intent0);
        for(Object object0: gfud.e(',').d().n(hzdj.a.l().x())) {
            String s = (String)object0;
            String s1 = account0.name;
            if(azql.c(context0).g(s)) {
                context0.sendBroadcast(new Intent("com.google.android.gms.udc.action.FACS_CACHE_UPDATED_EXPLICIT").setPackage(s).putExtra("com.google.android.gms.udc.extra.facsCacheAccountName", s1));
            }
        }
    }

    public final void b(Account account0, hffw hffw0, ezmc ezmc0) {
        bxf bxf0 = new bxf();
        SparseBooleanArray sparseBooleanArray0 = new SparseBooleanArray();
        if(ezmc0 != null) {
            for(Object object0: (ezmc0.c == null ? hffw.a : ezmc0.c).c) {
                sparseBooleanArray0.put(((hffv)object0).c, ((hffv)object0).d);
            }
        }
        SparseBooleanArray sparseBooleanArray1 = new SparseBooleanArray();
        if(ezmc0 != null) {
            for(Object object1: (ezmc0.c == null ? hffw.a : ezmc0.c).c) {
                sparseBooleanArray1.put(((hffv)object1).c, ((hffv)object1).e);
            }
        }
        Set set0 = ezto.a();
        for(Object object2: hffw0.c) {
            hffv hffv0 = (hffv)object2;
            if(sparseBooleanArray0.indexOfKey(hffv0.c) < 0 || sparseBooleanArray0.get(hffv0.c) != hffv0.d || sparseBooleanArray1.get(hffv0.c) != hffv0.e) {
                int v = eztq.a(hffv0.c);
                if(v != 0) {
                    Integer integer0 = v;
                    if(!set0.contains(integer0)) {
                        bxf0.add(integer0);
                    }
                }
            }
        }
        if(!bxf0.isEmpty()) {
            String s = account0.name;
            int[] arr_v = bbmt.g(bxf0);
            bars.f(this.a, s, arr_v);
        }
        if(ezmc0 != null && ((ProtoLiteMessage)hffw0).equals((ezmc0.c == null ? hffw.a : ezmc0.c))) {
            return;
        }
        this.a(account0);
    }
}

