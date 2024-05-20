package HackerRank;

public class JumpingCloud {
   public static void main(String [] args) {
        int[] c = {0, 0, 1, 0};
        int k = 2;
        System.out.println(jumpingCloudSolution(c, k));
   } 

   private static int jumpingCloudSolution(int[] cloud, int stepSize) {
        int energy = 100;
        int i = 0;
        do {
            i = (i + stepSize) % cloud.length;
            energy -= cloud[i] == 1 ? 3 : 1;
        } while (i != 0);
        return energy;
   }
}
