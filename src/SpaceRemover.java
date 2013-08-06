class SpaceRemover {
    public static void main(String[] args) {
        String mostFamouse = "Roudolph the Red-Nosed Reindeer";
        char[] mfl = mostFamouse.toCharArray();
        for (int dex = 0; dex < mfl.length; dex++) {
            char current =mfl[dex];
            if (current != ' ') {
                System.out.print(current);
            } else {
                System.out.print('.');
            }
        }
        System.out.println('.');
    }
}