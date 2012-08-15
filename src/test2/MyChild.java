package test2;

class MyParent {
    int x, y;

    MyParent(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int addMe(int x, int y) {
        return this.x + x + y + this.y;
    }

    public int addMe(MyParent myPar) {
        return addMe(myPar.x, myPar.y);
    }
}

class MyChild extends MyParent {
    int z;

    MyChild(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int addMe(int x, int y, int z) {
        return this.x + x + this.y + y + this.z + z;
    }

    public int addMe(MyChild myChi) {
        return addMe(myChi.x, myChi.y, myChi.z);
    }

    public int addMe(int x, int y) {
        return this.x + x + this.y + y;
    }
}
