spublic class scoresSpecial {
    public int scoresSpecial(int[] a, int[] b) {
        int amax = 0;
        int bmax = 0;
        for (int num : a) {
          if (num % 10 == 0) amax = Math.max(amax, num);
        }
        for (int num : b) {
          if (num % 10 == 0) bmax = Math.max(bmax, num);
        }
        return amax+bmax;
    }      
}