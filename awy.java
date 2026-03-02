import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class awy {
    public final ayf a;
    public final awz b;
    private final Map c;

    public awy(StreamConfigurationMap streamConfigurationMap0, ayf ayf0) {
        this.c = new HashMap();
        new HashMap();
        new HashMap();
        this.b = new awz(streamConfigurationMap0, null);
        this.a = ayf0;
    }

    public final StreamConfigurationMap a() {
        return this.b.a;
    }

    public final Size[] b(int v) {
        ArrayList arrayList1;
        List list0;
        Size[] arr_size1;
        int v1 = v;
        Integer integer0 = v1;
        Size[] arr_size = null;
        if(this.c.containsKey(integer0)) {
            return ((Size[])this.c.get(integer0)) == null ? null : ((Size[])((Size[])this.c.get(integer0)).clone());
        }
        try {
            arr_size = this.b.a.getOutputSizes(v1);
        }
        catch(Throwable throwable0) {
            bcs.e("StreamConfigurationMapCompat", "Failed to get output sizes for " + v1, throwable0);
        }
        if(arr_size != null && arr_size.length != 0) {
            ayf ayf0 = this.a;
            ArrayList arrayList0 = new ArrayList(Arrays.asList(arr_size));
            if(ayf0.a != null) {
                if(v1 != 34) {
                    arr_size1 = new Size[0];
                }
                else if(ExtraSupportedOutputSizeQuirk.a()) {
                    arr_size1 = new Size[]{new Size(0x5A0, 1080), new Size(960, 720)};
                    v1 = 34;
                }
                else {
                    v1 = 34;
                    arr_size1 = new Size[0];
                }
                if(arr_size1.length > 0) {
                    arrayList0.addAll(Arrays.asList(arr_size1));
                }
            }
            axz axz0 = ayf0.b;
            if(((ExcludedSupportedSizesQuirk)axv.a(ExcludedSupportedSizesQuirk.class)) == null) {
                list0 = new ArrayList();
            }
            else {
                String s = axz0.a;
                if(ExcludedSupportedSizesQuirk.b()) {
                    arrayList1 = new ArrayList();
                    if(s.equals("0") && v1 == 0x100) {
                        arrayList1.add(new Size(0x1040, 0xC30));
                        arrayList1.add(new Size(4000, 3000));
                    }
                    list0 = arrayList1;
                }
                else if(ExcludedSupportedSizesQuirk.c()) {
                    arrayList1 = new ArrayList();
                    if(s.equals("0") && v1 == 0x100) {
                        arrayList1.add(new Size(0x1040, 0xC30));
                        arrayList1.add(new Size(4000, 3000));
                    }
                    list0 = arrayList1;
                }
                else if(ExcludedSupportedSizesQuirk.a()) {
                    ArrayList arrayList2 = new ArrayList();
                    if(s.equals("0") && (v1 == 34 || v1 == 35)) {
                        arrayList2.add(new Size(720, 720));
                        arrayList2.add(new Size(400, 400));
                    }
                    list0 = arrayList2;
                }
                else if(ExcludedSupportedSizesQuirk.g()) {
                    arrayList1 = new ArrayList();
                    if(s.equals("0")) {
                        switch(v1) {
                            case 34: {
                                arrayList1.add(new Size(0x1020, 3096));
                                arrayList1.add(new Size(0x1020, 0x912));
                                arrayList1.add(new Size(0xC10, 0xC10));
                                arrayList1.add(new Size(0xCC0, 0x990));
                                arrayList1.add(new Size(0xCC0, 0x72C));
                                arrayList1.add(new Size(0x800, 0x600));
                                arrayList1.add(new Size(0x800, 0x480));
                                arrayList1.add(new Size(0x780, 1080));
                                break;
                            }
                            case 35: {
                                arrayList1.add(new Size(0x1020, 0x912));
                                arrayList1.add(new Size(0xC10, 0xC10));
                                arrayList1.add(new Size(0xCC0, 0x990));
                                arrayList1.add(new Size(0xCC0, 0x72C));
                                arrayList1.add(new Size(0x800, 0x600));
                                arrayList1.add(new Size(0x800, 0x480));
                                arrayList1.add(new Size(0x780, 1080));
                            }
                        }
                    }
                    else if(s.equals("1") && (v1 == 34 || v1 == 35)) {
                        arrayList1.add(new Size(0xCC0, 0x990));
                        arrayList1.add(new Size(0xCC0, 0x72C));
                        arrayList1.add(new Size(0x990, 0x990));
                        arrayList1.add(new Size(0x780, 0x780));
                        arrayList1.add(new Size(0x800, 0x600));
                        arrayList1.add(new Size(0x800, 0x480));
                        arrayList1.add(new Size(0x780, 1080));
                    }
                    list0 = arrayList1;
                }
                else if(ExcludedSupportedSizesQuirk.f()) {
                    arrayList1 = new ArrayList();
                    if(s.equals("0")) {
                        switch(v1) {
                            case 34: {
                                arrayList1.add(new Size(0x1020, 3096));
                                arrayList1.add(new Size(0x1020, 0x912));
                                arrayList1.add(new Size(0xC10, 0xC10));
                                arrayList1.add(new Size(0xCC0, 0x990));
                                arrayList1.add(new Size(0xCC0, 0x72C));
                                arrayList1.add(new Size(0x800, 0x600));
                                arrayList1.add(new Size(0x800, 0x480));
                                arrayList1.add(new Size(0x780, 1080));
                                break;
                            }
                            case 35: {
                                arrayList1.add(new Size(0x800, 0x600));
                                arrayList1.add(new Size(0x800, 0x480));
                                arrayList1.add(new Size(0x780, 1080));
                            }
                        }
                    }
                    else if(s.equals("1") && (v1 == 34 || v1 == 35)) {
                        arrayList1.add(new Size(0xA10, 0x78C));
                        arrayList1.add(new Size(0xA00, 0x5A0));
                        arrayList1.add(new Size(0x780, 0x780));
                        arrayList1.add(new Size(0x800, 0x600));
                        arrayList1.add(new Size(0x800, 0x480));
                        arrayList1.add(new Size(0x780, 1080));
                    }
                    list0 = arrayList1;
                }
                else if(ExcludedSupportedSizesQuirk.d()) {
                    arrayList1 = new ArrayList();
                    if(s.equals("0") && v1 == 0x100) {
                        arrayList1.add(new Size(9280, 0x1B20));
                    }
                    list0 = arrayList1;
                }
                else if(ExcludedSupportedSizesQuirk.e()) {
                    list0 = new ArrayList();
                    if(v1 == 35) {
                        list0.add(new Size(0xF00, 0x870));
                        list0.add(new Size(0xCC0, 0x990));
                        list0.add(new Size(3200, 2400));
                        list0.add(new Size(0xA80, 0x5E8));
                        list0.add(new Size(0xA20, 0x798));
                        list0.add(new Size(0xA20, 1940));
                        list0.add(new Size(0x780, 0x5A0));
                    }
                }
                else {
                    bcs.d("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
                    list0 = Collections.EMPTY_LIST;
                }
            }
            if(!list0.isEmpty()) {
                arrayList0.removeAll(list0);
            }
            if(arrayList0.isEmpty()) {
                bcs.d("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
            }
            Size[] arr_size2 = (Size[])arrayList0.toArray(new Size[0]);
            this.c.put(Integer.valueOf(v1), arr_size2);
            return (Size[])arr_size2.clone();
        }
        bcs.d("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + v1);
        return arr_size;
    }
}

