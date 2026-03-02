public final class fcco {
    public static int a(hcfc hcfc0) {
        return hcfc0.g == 0 ? 1 : hcfc0.g;
    }

    static int b(hcfc hcfc0, hcff hcff0) {
        int v = 0;
        for(Object object0: hcff0.c) {
            if(((hcfc)object0) == hcfc0) {
                return v;
            }
            v += fcco.a(((hcfc)object0));
        }
        throw new IllegalArgumentException("Cell must be contained in row to getColumnOfCellInRow.");
    }
}

