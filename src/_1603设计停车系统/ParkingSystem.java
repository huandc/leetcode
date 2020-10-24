package _1603设计停车系统;

class ParkingSystem {
//
//    int big;
//    int medium;
//    int small;
//
//    public ParkingSystem(int big, int medium, int small) {
//        this.big = big;
//        this.medium = medium;
//        this.small = small;
//    }
//
//    public  boolean addCar(int carType) {
//        if (carType == 1) return --big>=0?true:false;
//        if (carType == 2) return --medium>=0?true:false;
//        if (carType == 3) return --small>=0?true:false;
//
//        return false;
//    }


    int[] parking = new int[3];
    public ParkingSystem(int big, int medium, int small) {

        parking[0]=big;
        parking[1]=medium;
        parking[2]=small;
    }
    public  boolean addCar(int carType) {
        return --parking[carType-1] >= 0;
    }
}
