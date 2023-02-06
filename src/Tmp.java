import java.util.ArrayList;
import java.util.List;

public class Tmp {


        public int[] separateDigits (int[] nums){
            List<Integer> ans = new ArrayList<>();
            for (int i : nums) {
                List<Integer> list = new ArrayList<>();
                while (i > 0) {
                    list.add(0, i % 10);
                    i /= 10;
                }
                ans.addAll(list);
            }

            return ans.stream().mapToInt(i -> i).toArray();
        }

    }


// int[] << []是什麼 -> 陣列
// 到底為什麼不能run :(
