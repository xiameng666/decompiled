import java.util.ArrayList;
import java.util.List;

public final class akwf {
    public final akub a;

    public akwf() {
        akub akub0 = new akub();
        super();
        this.a = akub0;
    }

    public static int a(List list0) {
        if(list0 != null) {
            if(list0.isEmpty()) {
                return 1;
            }
            if(list0.size() < 4) {
                return 2;
            }
            if(list0.size() > 4) {
                return 3;
            }
            for(int v = 1; v < 4; ++v) {
                if(((allu)list0.get(v - 1)).d != ((allu)list0.get(v)).c) {
                    return 4;
                }
            }
            return 0;
        }
        return 1;
    }

    public static List b(List list0, boolean z, alvm alvm0) {
        List list1 = new ArrayList();
        for(int v = 0; v < list0.size(); ++v) {
            allu allu0 = (allu)list0.get(v);
            if(v == list0.size() - 1 && z) {
                list1.add(allu0);
                return list1;
            }
            byte[] arr_b = alvm0.b(allu0.c);
            if(arr_b != null) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)allu.a).w(((ProtoLiteMessage)allu0));
                ByteString hfsf0 = ByteString.copyFrom(arr_b);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((allu)hftp0.b_message).b = hfsf0;
                allu0 = (allu)hftp0.N_build();
            }
            list1.add(allu0);
        }
        return list1;
    }
}

