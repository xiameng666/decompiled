import android.content.Context;
import android.content.res.TypedArray;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class fupu {
    public static final fupv a(Context context0) {
        ibuq.f(context0, "context");
        ibns[] arr_ibns = new ibns[0x2F];
        arr_ibns[0] = new ibns("Background", ((int)0x1010031));
        arr_ibns[1] = new ibns("On Background", ((int)0x7F0402C9));  // attr:colorOnBackground
        arr_ibns[2] = new ibns("Surface Variant", ((int)0x7F040345));  // attr:colorSurfaceVariant
        arr_ibns[3] = new ibns("Inverse Surface", ((int)0x7F04033F));  // attr:colorSurfaceInverse
        Integer integer0 = (int)0x7F040332;  // attr:colorSurface
        arr_ibns[4] = new ibns("Surface Tint", integer0);
        arr_ibns[5] = new ibns("On Surface", ((int)0x7F0402F7));  // attr:colorOnSurface
        arr_ibns[6] = new ibns("On Surface Variant", ((int)0x7F0402FC));  // attr:colorOnSurfaceVariant
        arr_ibns[7] = new ibns("Inverse On Surface", ((int)0x7F0402F9));  // attr:colorOnSurfaceInverse
        arr_ibns[8] = new ibns("Primary", ((int)0x7F04030C));  // attr:colorPrimary
        arr_ibns[9] = new ibns("Inverse Primary", ((int)0x7F040314));  // attr:colorPrimaryInverse
        arr_ibns[10] = new ibns("On Primary", ((int)0x7F0402DC));  // attr:colorOnPrimary
        arr_ibns[11] = new ibns("Primary Container", ((int)0x7F04030D));  // attr:colorPrimaryContainer
        arr_ibns[12] = new ibns("On Primary Container", ((int)0x7F0402DD));  // attr:colorOnPrimaryContainer
        arr_ibns[13] = new ibns("Secondary", ((int)0x7F040322));  // attr:colorSecondary
        arr_ibns[14] = new ibns("On Secondary", ((int)0x7F0402EA));  // attr:colorOnSecondary
        arr_ibns[15] = new ibns("Secondary Container", ((int)0x7F040323));  // attr:colorSecondaryContainer
        arr_ibns[16] = new ibns("On Secondary Container", ((int)0x7F0402EC));  // attr:colorOnSecondaryContainer
        arr_ibns[17] = new ibns("Tertiary", ((int)0x7F04034E));  // attr:colorTertiary
        arr_ibns[18] = new ibns("On Tertiary", ((int)0x7F040301));  // attr:colorOnTertiary
        arr_ibns[19] = new ibns("Tertiary Container", ((int)0x7F04034F));  // attr:colorTertiaryContainer
        arr_ibns[20] = new ibns("On Tertiary Container", ((int)0x7F040302));  // attr:colorOnTertiaryContainer
        arr_ibns[21] = new ibns("Error", ((int)0x7F0402C1));  // attr:colorError
        arr_ibns[22] = new ibns("On Error", ((int)0x7F0402D7));  // attr:colorOnError
        arr_ibns[23] = new ibns("Error Container", ((int)0x7F0402C2));  // attr:colorErrorContainer
        arr_ibns[24] = new ibns("On Error Container", ((int)0x7F0402D8));  // attr:colorOnErrorContainer
        arr_ibns[25] = new ibns("Outline", ((int)0x7F040307));  // attr:colorOutline
        arr_ibns[26] = new ibns("Outline Variant", ((int)0x7F04030A));  // attr:colorOutlineVariant
        arr_ibns[27] = new ibns("Primary Fixed", ((int)0x7F040310));  // attr:colorPrimaryFixed
        arr_ibns[28] = new ibns("Primary Fixed Dim", ((int)0x7F040311));  // attr:colorPrimaryFixedDim
        arr_ibns[29] = new ibns("On Primary Fixed", ((int)0x7F0402E3));  // attr:colorOnPrimaryFixed
        arr_ibns[30] = new ibns("On Primary Fixed Variant", ((int)0x7F0402E4));  // attr:colorOnPrimaryFixedVariant
        arr_ibns[0x1F] = new ibns("Secondary Fixed", ((int)0x7F040324));  // attr:colorSecondaryFixed
        arr_ibns[0x20] = new ibns("Secondary Fixed Dim", ((int)0x7F040325));  // attr:colorSecondaryFixedDim
        arr_ibns[33] = new ibns("On Secondary Fixed", ((int)0x7F0402F1));  // attr:colorOnSecondaryFixed
        arr_ibns[34] = new ibns("On Secondary Fixed Variant", ((int)0x7F0402F2));  // attr:colorOnSecondaryFixedVariant
        arr_ibns[35] = new ibns("Tertiary Fixed", ((int)0x7F040350));  // attr:colorTertiaryFixed
        arr_ibns[36] = new ibns("Tertiary Fixed Dim", ((int)0x7F040351));  // attr:colorTertiaryFixedDim
        arr_ibns[37] = new ibns("On Tertiary Fixed", ((int)0x7F040305));  // attr:colorOnTertiaryFixed
        arr_ibns[38] = new ibns("On Tertiary Fixed Variant", ((int)0x7F040306));  // attr:colorOnTertiaryFixedVariant
        arr_ibns[39] = new ibns("Surface Dim", ((int)0x7F04033E));  // attr:colorSurfaceDim
        arr_ibns[40] = new ibns("Surface", integer0);
        arr_ibns[41] = new ibns("Surface Bright", ((int)0x7F040338));  // attr:colorSurfaceBright
        arr_ibns[42] = new ibns("Surface Container Lowest", ((int)0x7F04033D));  // attr:colorSurfaceContainerLowest
        arr_ibns[43] = new ibns("Surface Container Low", ((int)0x7F04033C));  // attr:colorSurfaceContainerLow
        arr_ibns[44] = new ibns("Surface Container", ((int)0x7F040339));  // attr:colorSurfaceContainer
        arr_ibns[45] = new ibns("Surface Container High", ((int)0x7F04033A));  // attr:colorSurfaceContainerHigh
        arr_ibns[46] = new ibns("Surface Container Highest", ((int)0x7F04033B));  // attr:colorSurfaceContainerHighest
        Map map0 = ibpz.i(arr_ibns);
        ibuq.f(context0, "context");
        List list0 = ibpo.ar(map0.entrySet());
        ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
        for(Object object0: list0) {
            arrayList0.add(Integer.valueOf(((Number)((Map.Entry)object0).getValue()).intValue()));
        }
        int[] arr_v = ibpo.aF(arrayList0);
        ibvd ibvd0 = new ibvd();
        TypedArray typedArray0 = context0.obtainStyledAttributes(arr_v);
        try {
            ArrayList arrayList1 = new ArrayList(ibpo.q(list0, 10));
            int v1 = 0;
            for(Object object1: list0) {
                if(v1 < 0) {
                    ibpo.m();
                }
                arrayList1.add(new ibns(((String)((Map.Entry)object1).getKey()), typedArray0.getColor(v1, 0xFF000000)));
                ++v1;
            }
            ibvd0.a = ibpz.p(arrayList1);
        }
        finally {
            typedArray0.recycle();
        }
        fupv fupv0 = new fupv(((Map)ibvd0.a));
        Map map1 = ibpz.i(new ibns[]{new ibns("Surface 0", fipw.a), new ibns("Surface 1", fipw.b), new ibns("Surface 2", fipw.c), new ibns("Surface 3", fipw.d), new ibns("Surface 4", fipw.e), new ibns("Surface 5", fipw.f)});
        ibuq.f(context0, "context");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibpz.a(map1.size()));
        for(Object object2: map1.entrySet()) {
            linkedHashMap0.put(((Map.Entry)object2).getKey(), Integer.valueOf(((fipw)((Map.Entry)object2).getValue()).a(context0)));
        }
        return fupv0.a(new fupv(linkedHashMap0));
    }
}

