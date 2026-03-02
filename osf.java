import android.app.RemoteInput;
import android.app.slice.Slice.Builder;
import android.app.slice.Slice;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import androidx.slice.SliceItem;
import androidx.slice.SliceSpec;
import java.util.List;
import java.util.Set;

public final class osf {
    public static Slice a(androidx.slice.Slice slice0) {
        if(slice0 != null && slice0.a() != null) {
            Slice.Builder slice$Builder0 = new Slice.Builder(slice0.a(), osf.e(slice0.c));
            slice$Builder0.addHints(slice0.c());
            SliceItem[] arr_sliceItem = slice0.d;
            for(int v = 0; v < arr_sliceItem.length; ++v) {
                SliceItem sliceItem0 = arr_sliceItem[v];
                switch(sliceItem0.b) {
                    case "action": {
                        slice$Builder0.addAction(sliceItem0.c(), osf.a(sliceItem0.e()), sliceItem0.c);
                        break;
                    }
                    case "bundle": {
                        slice$Builder0.addBundle(((Bundle)sliceItem0.d), sliceItem0.c, sliceItem0.i());
                        break;
                    }
                    case "image": {
                        slice$Builder0.addIcon(jxw.c(sliceItem0.d()), sliceItem0.c, sliceItem0.i());
                        break;
                    }
                    case "input": {
                        slice$Builder0.addRemoteInput(((RemoteInput)sliceItem0.d), sliceItem0.c, sliceItem0.i());
                        break;
                    }
                    case "int": {
                        slice$Builder0.addInt(sliceItem0.a(), sliceItem0.c, sliceItem0.i());
                        break;
                    }
                    case "long": {
                        slice$Builder0.addLong(sliceItem0.b(), sliceItem0.c, sliceItem0.i());
                        break;
                    }
                    case "slice": {
                        slice$Builder0.addSubSlice(osf.a(sliceItem0.e()), sliceItem0.c);
                        break;
                    }
                    case "text": {
                        slice$Builder0.addText(sliceItem0.g(), sliceItem0.c, sliceItem0.i());
                    }
                }
            }
            return slice$Builder0.build();
        }
        return null;
    }

    public static androidx.slice.Slice b(Slice slice0, Context context0) {
        if(slice0 != null && slice0.getUri() != null) {
            ose ose0 = new ose(slice0.getUri());
            List list0 = slice0.getHints();
            ose0.c(((String[])list0.toArray(new String[list0.size()])));
            ose0.b = osf.f(slice0.getSpec());
            for(Object object0: slice0.getItems()) {
                android.app.slice.SliceItem sliceItem0 = (android.app.slice.SliceItem)object0;
                switch(sliceItem0.getFormat()) {
                    case "action": {
                        ose0.b(sliceItem0.getAction(), osf.b(sliceItem0.getSlice(), context0), sliceItem0.getSubType());
                        continue;
                    }
                    case "bundle": {
                        ose0.f(new SliceItem(sliceItem0.getBundle(), sliceItem0.getFormat(), sliceItem0.getSubType(), sliceItem0.getHints()));
                        continue;
                    }
                    case "image": {
                        try {
                            ose0.l(IconCompat.e(context0, sliceItem0.getIcon()), sliceItem0.getSubType(), sliceItem0.getHints());
                        }
                        catch(IllegalArgumentException illegalArgumentException0) {
                            Log.w("SliceConvert", "The icon resource isn\'t available.", illegalArgumentException0);
                        }
                        catch(Resources.NotFoundException resources$NotFoundException0) {
                            Log.w("SliceConvert", "The icon resource isn\'t available.", resources$NotFoundException0);
                        }
                        continue;
                    }
                    case "input": {
                        RemoteInput remoteInput0 = sliceItem0.getRemoteInput();
                        String s3 = sliceItem0.getSubType();
                        List list4 = sliceItem0.getHints();
                        kay.i(remoteInput0);
                        kay.i(remoteInput0);
                        ose0.a.add(new SliceItem(remoteInput0, "input", s3, ((String[])list4.toArray(new String[list4.size()]))));
                        continue;
                    }
                    case "int": {
                        int v = sliceItem0.getInt();
                        String s = sliceItem0.getSubType();
                        List list1 = sliceItem0.getHints();
                        ose0.e(v, s, ((String[])list1.toArray(new String[list1.size()])));
                        continue;
                    }
                    case "long": {
                        long v1 = sliceItem0.getLong();
                        String s1 = sliceItem0.getSubType();
                        List list2 = sliceItem0.getHints();
                        ose0.g(v1, s1, ((String[])list2.toArray(new String[list2.size()])));
                        continue;
                    }
                    case "slice": {
                        ose0.i(osf.b(sliceItem0.getSlice(), context0), sliceItem0.getSubType());
                        continue;
                    }
                    case "text": {
                        CharSequence charSequence0 = sliceItem0.getText();
                        String s2 = sliceItem0.getSubType();
                        List list3 = sliceItem0.getHints();
                        ose0.j(charSequence0, s2, ((String[])list3.toArray(new String[list3.size()])));
                    }
                }
            }
            return ose0.a();
        }
        return null;
    }

    static Set c(Set set0) {
        Set set1 = new bxf();
        if(set0 != null) {
            bxe bxe0 = new bxe(((bxf)set0));
            while(bxe0.hasNext()) {
                Object object0 = bxe0.next();
                set1.add(osf.e(((SliceSpec)object0)));
            }
        }
        return set1;
    }

    public static Set d(Set set0) {
        Set set1 = new bxf();
        if(set0 != null) {
            for(Object object0: set0) {
                set1.add(osf.f(((android.app.slice.SliceSpec)object0)));
            }
        }
        return set1;
    }

    private static android.app.slice.SliceSpec e(SliceSpec sliceSpec0) {
        return sliceSpec0 == null ? null : new android.app.slice.SliceSpec(sliceSpec0.a, sliceSpec0.b);
    }

    private static SliceSpec f(android.app.slice.SliceSpec sliceSpec0) {
        return sliceSpec0 == null ? null : new SliceSpec(sliceSpec0.getType(), sliceSpec0.getRevision());
    }
}

