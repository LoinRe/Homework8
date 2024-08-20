import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
// Задача 1
        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        double[] numsD = {1.57, 7.654, 9.986};
        String[] names = {"Dima", "Sasha", "Alex"};

        System.out.println("Задача 2");
// Задача 2
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                System.out.println(nums[i]);
                break;
            }
            System.out.print(nums[i] + ", ");
        }

        for (int i = 0; i < numsD.length; i++) {
            if (i == numsD.length - 1) {
                System.out.println(numsD[i]);
                break;
            }
            System.out.print(numsD[i] + ", ");
        }

        for (int i = 0; i < names.length; i++) {
            if (i == names.length - 1) {
                System.out.println(names[i]);
                break;
            }
            System.out.print(names[i] + ", ");
        }

        System.out.println("Задача 3");
// Задача 3
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(nums[i]);
                break;
            }
            System.out.print(nums[i] + ", ");
        }

        for (int i = numsD.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(numsD[i]);
                break;
            }
            System.out.print(numsD[i] + ", ");
        }

        for (int i = names.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(names[i]);
                break;
            }
            System.out.print(names[i] + ", ");
        }


        System.out.println("Задача 4");
// Задача 4
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                nums[i] += 1;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
