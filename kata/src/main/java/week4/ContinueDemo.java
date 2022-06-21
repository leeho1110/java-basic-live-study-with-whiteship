package week4;

class ContinueDemo {
    public static void main(String[] args) {

        String searchMe = "peter piper picked a " + "peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;

        entire: for(int j=0; j<3;j++){
            for (int i = 0; i < max; i++) {
                // interested only in p's
                if (searchMe.charAt(i) != 'p'){
                    continue entire;
                }

                // process p's
                numPs++;
            }
        }
        System.out.println("Found " + numPs + " p's in the string.");
    }
}