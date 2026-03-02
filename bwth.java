import android.os.Bundle;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.Thing.Metadata;
import com.google.firebase.appindexing.internal.Thing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class bwth {
    public static Thing a(hlne hlne0) {
        Bundle bundle0 = bwth.d(hlne0.e);
        hlnc hlnc0 = hlne0.f == null ? hlnc.a : hlne0.f;
        return hlnc0 == null ? new Thing(bundle0, new gopr().a(), hlne0.d, hlne0.c) : new Thing(bundle0, new Thing.Metadata(hlnc0.c, hlnc0.d, hlnc0.e, bwth.d(hlnc0.f), bwth.d(hlnc0.g)), hlne0.d, hlne0.c);
    }

    public static hlne b(Thing thing0) {
        hlnc hlnc0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlne.a).v_newBuilder();
        String s = thing0.d;
        if(s != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hlne hlne0 = (hlne)hftp0.b_message;
            hlne0.b |= 2;
            hlne0.d = s;
        }
        String s1 = thing0.e;
        if(s1 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hlne hlne1 = (hlne)hftp0.b_message;
            hlne1.b |= 1;
            hlne1.c = s1;
        }
        List list0 = bwth.e(thing0.b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlne hlne2 = (hlne)hftp0.b_message;
        hfuo hfuo0 = hlne2.e;
        if(!hfuo0.c()) {
            hlne2.e = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(list0, hlne2.e);
        Thing.Metadata thing$Metadata0 = thing0.c;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hlnc.a).v_newBuilder();
        if(thing$Metadata0 != null) {
            ProtoLiteMessage hftv0 = hftp1.b_message;
            boolean z = thing$Metadata0.a;
            if(z != ((hlnc)hftv0).c) {
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hlnc hlnc1 = (hlnc)hftp1.b_message;
                hlnc1.b |= 1;
                hlnc1.c = z;
            }
            int v = thing$Metadata0.b;
            ProtoLiteMessage hftv1 = hftp1.b_message;
            if(v != ((hlnc)hftv1).d) {
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hlnc hlnc2 = (hlnc)hftp1.b_message;
                hlnc2.b |= 2;
                hlnc2.d = v;
            }
            String s2 = thing$Metadata0.c;
            if(!gfta.c(s2)) {
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hlnc hlnc3 = (hlnc)hftp1.b_message;
                s2.getClass();
                hlnc3.b |= 4;
                hlnc3.e = s2;
            }
            List list1 = bwth.e(thing$Metadata0.d);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hlnc hlnc4 = (hlnc)hftp1.b_message;
            hfuo hfuo1 = hlnc4.f;
            if(!hfuo1.c()) {
                hlnc4.f = ProtoLiteMessage.E(hfuo1);
            }
            hfrj.E(list1, hlnc4.f);
            List list2 = bwth.e(thing$Metadata0.e);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hlnc hlnc5 = (hlnc)hftp1.b_message;
            hfuo hfuo2 = hlnc5.g;
            if(!hfuo2.c()) {
                hlnc5.g = ProtoLiteMessage.E(hfuo2);
            }
            hfrj.E(list2, hlnc5.g);
        }
        hlnc0 = (hlnc)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlne hlne3 = (hlne)hftp0.b_message;
        hlnc0.getClass();
        hlne3.f = hlnc0;
        hlne3.b |= 4;
        return (hlne)hftp0.N_build();
    }

    public static byte[] c(Thing thing0) {
        return bwth.b(thing0).toBytesArray();
    }

    private static Bundle d(List list0) {
        Bundle bundle0 = new Bundle();
        for(Object object0: list0) {
            hlnd hlnd0 = (hlnd)object0;
            String s = hlnd0.c;
            if(!hlnd0.d.isEmpty()) {
                bundle0.putBooleanArray(s, glwj.b(hlnd0.d));
            }
            else if(!hlnd0.i.isEmpty()) {
                bundle0.putDoubleArray(s, glwp.d(hlnd0.i));
            }
            else if(!hlnd0.e.isEmpty()) {
                bundle0.putLongArray(s, glxd.j(hlnd0.e));
            }
            else if(!hlnd0.f.isEmpty()) {
                bundle0.putStringArray(s, ((String[])hlnd0.f.toArray(new String[0])));
            }
            else if(hlnd0.h.size() > 0) {
                bundle0.putByteArray(s, hlnd0.h.toByteArray());
            }
            else if(hlnd0.g.isEmpty()) {
                bwne.g("%s  unknown type!", "ThingSerializer");
            }
            else {
                Thing[] arr_thing = new Thing[hlnd0.g.size()];
                for(int v = 0; v < hlnd0.g.size(); ++v) {
                    arr_thing[v] = bwth.a(((hlne)hlnd0.g.get(v)));
                }
                bundle0.putParcelableArray(s, arr_thing);
            }
        }
        return bundle0;
    }

    private static List e(Bundle bundle0) {
        List list0 = new ArrayList();
        for(Object object0: bundle0.keySet()) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlnd.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hlnd hlnd0 = (hlnd)hftp0.b_message;
            ((String)object0).getClass();
            hlnd0.b |= 1;
            hlnd0.c = (String)object0;
            Object object1 = bundle0.get(((String)object0));
            if((object1 instanceof boolean[])) {
                List list1 = ((boolean[])object1).length == 0 ? Collections.EMPTY_LIST : new glwh(((boolean[])object1), 0, ((boolean[])object1).length);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hlnd hlnd1 = (hlnd)hftp0.b_message;
                hftz hftz0 = hlnd1.d;
                if(!hftz0.c()) {
                    hlnd1.d = ProtoLiteMessage.z(hftz0);
                }
                hfrj.E(list1, hlnd1.d);
                list0.add(((hlnd)hftp0.N_build()));
                continue;
            }
            if((object1 instanceof double[])) {
                List list2 = ((double[])object1).length == 0 ? Collections.EMPTY_LIST : new glwo(((double[])object1), 0, ((double[])object1).length);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hlnd hlnd2 = (hlnd)hftp0.b_message;
                hfua hfua0 = hlnd2.i;
                if(!hfua0.c()) {
                    hlnd2.i = ProtoLiteMessage.A(hfua0);
                }
                hfrj.E(list2, hlnd2.i);
                list0.add(((hlnd)hftp0.N_build()));
                continue;
            }
            if((object1 instanceof long[])) {
                List list3 = glxd.g(((long[])object1));
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hlnd hlnd3 = (hlnd)hftp0.b_message;
                hfui hfui0 = hlnd3.e;
                if(!hfui0.c()) {
                    hlnd3.e = ProtoLiteMessage.D(hfui0);
                }
                hfrj.E(list3, hlnd3.e);
                list0.add(((hlnd)hftp0.N_build()));
                continue;
            }
            if((object1 instanceof String[])) {
                List list4 = Arrays.asList(((String[])object1));
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hlnd hlnd4 = (hlnd)hftp0.b_message;
                hfuo hfuo0 = hlnd4.f;
                if(!hfuo0.c()) {
                    hlnd4.f = ProtoLiteMessage.E(hfuo0);
                }
                hfrj.E(list4, hlnd4.f);
                list0.add(((hlnd)hftp0.N_build()));
                continue;
            }
            if((object1 instanceof byte[])) {
                ByteString hfsf0 = ByteString.copyFrom(((byte[])object1));
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hlnd hlnd5 = (hlnd)hftp0.b_message;
                hlnd5.b |= 2;
                hlnd5.h = hfsf0;
                list0.add(((hlnd)hftp0.N_build()));
                continue;
            }
            if((object1 instanceof Parcelable[])) {
                for(int v = 0; v < ((Parcelable[])object1).length; ++v) {
                    hlne hlne0 = bwth.b(((Thing)((Parcelable[])object1)[v]));
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hlnd hlnd6 = (hlnd)hftp0.b_message;
                    hlne0.getClass();
                    hfuo hfuo1 = hlnd6.g;
                    if(!hfuo1.c()) {
                        hlnd6.g = ProtoLiteMessage.E(hfuo1);
                    }
                    hlnd6.g.add(hlne0);
                }
                list0.add(((hlnd)hftp0.N_build()));
                continue;
            }
            if(object1 != null) {
                throw new IllegalArgumentException("Unsupported type: " + object1.getClass().getSimpleName());
            }
            list0.add(((hlnd)hftp0.N_build()));
            continue;
        }
        return list0;
    }
}

