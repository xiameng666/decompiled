package com.google.android.gms.icing.shim.schemas;

import aef;
import aei;
import aeq;
import aes;
import aeu;
import aew;
import aez;
import afa;
import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ..__AppSearch__MusicPlaylist implements aeu {
    @Override  // aeu
    public final aes a() {
        aef aef0 = new aef("MusicPlaylist");
        aeq aeq0 = new aeq("name");
        aeq0.b(2);
        aeq0.e(1);
        aeq0.c(2);
        aeq0.d(0);
        aef0.c(aeq0.a());
        aeq aeq1 = new aeq("keywords");
        aeq1.b(1);
        aeq1.e(2);
        aeq1.c(1);
        aeq1.d(0);
        aef0.c(aeq1.a());
        aeq aeq2 = new aeq("alternateName");
        aeq2.b(1);
        aeq2.e(1);
        aeq2.c(2);
        aeq2.d(0);
        aef0.c(aeq2.a());
        aei aei0 = new aei("g3attrinfo", "G3AttributionInfo");
        aei0.c(2);
        aei0.a = true;
        aef0.c(aei0.a());
        aei aei1 = new aei("track", "MusicRecording");
        aei1.c(1);
        aei1.a = false;
        aei1.d(new String[]{"name"});
        aef0.c(aei1.a());
        return aef0.a();
    }

    @Override  // aeu
    public final afa b(Object object0) {
        aez aez0 = new aez(((MusicPlaylist)object0).q, ((MusicPlaylist)object0).p, "MusicPlaylist");
        aez0.b("name", new String[]{((MusicPlaylist)object0).r});
        List list0 = ((MusicPlaylist)object0).b();
        int v = 0;
        if(list0 != null) {
            aez0.b("keywords", ((String[])list0.toArray(new String[0])));
        }
        List list1 = ((MusicPlaylist)object0).a();
        if(list1 != null) {
            aez0.b("alternateName", ((String[])list1.toArray(new String[0])));
        }
        aez0.a("g3attrinfo", new afa[]{afa.f(((MusicPlaylist)object0).s)});
        List list2 = ((MusicPlaylist)object0).a;
        if(list2 != null) {
            afa[] arr_afa = new afa[list2.size()];
            for(Object object1: list2) {
                arr_afa[v] = afa.f(((MusicRecording)object1));
                ++v;
            }
            aez0.a("track", arr_afa);
        }
        return aez0.e();
    }

    @Override  // aeu
    public final Object c(afa afa0, aew aew0) {
        String s = afa0.k();
        String s1 = afa0.l();
        String[] arr_s = afa0.u("name");
        ArrayList arrayList0 = null;
        String s2 = arr_s == null || arr_s.length == 0 ? null : arr_s[0];
        String[] arr_s1 = afa0.u("keywords");
        List list0 = arr_s1 == null ? null : Arrays.asList(arr_s1);
        String[] arr_s2 = afa0.u("alternateName");
        List list1 = arr_s2 == null ? null : Arrays.asList(arr_s2);
        afa afa1 = afa0.g("g3attrinfo");
        G3AttributionInfo g3AttributionInfo0 = afa1 == null ? null : ((G3AttributionInfo)afa1.j(G3AttributionInfo.class, aew0));
        afa[] arr_afa = afa0.t("track");
        if(arr_afa != null) {
            arrayList0 = new ArrayList(arr_afa.length);
            for(int v = 0; v < arr_afa.length; ++v) {
                arrayList0.add(((MusicRecording)arr_afa[v].j(MusicRecording.class, aew0)));
            }
        }
        return new MusicPlaylist(s1, s, s2, list0, list1, arrayList0, g3AttributionInfo0);
    }

    @Override  // aeu
    public final String d() {
        return "MusicPlaylist";
    }

    @Override  // aeu
    public final List e() {
        List list0 = new ArrayList();
        list0.add(G3AttributionInfo.class);
        list0.add(MusicRecording.class);
        return list0;
    }
}

