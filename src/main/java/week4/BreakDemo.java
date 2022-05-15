package week4;

class BreakDemo {
    public static void main(String[] args) {

        int[] arrayOfInts = { 32, 87, 12, 4};
        int searchFor = 12;

        // 전체 반복문
        entireLoop : for(int i=0; i<3; i++){
            // 내부 반복문
            System.out.println("entire "+i);
            eachLoop : for (int index = 0; index < arrayOfInts.length; index++) {
                if (arrayOfInts[index] == searchFor) {
                    break eachLoop;
                }
            }
        }
    }
}