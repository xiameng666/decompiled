import java.util.List;

public final class bhx implements bhz {
    @Override  // bhz
    public final int a(List list0) {
        if(list0.contains(Integer.valueOf(35))) {
            return 35;
        }
        if(list0.contains(Integer.valueOf(0x100))) {
            return 0x100;
        }
        return list0.contains(Integer.valueOf(0x1005)) ? 0x1005 : 0;
    }
}

