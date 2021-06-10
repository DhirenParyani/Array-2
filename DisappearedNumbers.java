import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        //change state of element corresponding to that index to -1
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int index=Math.abs(nums[i]);
            if(nums[index-1]>0)
            {
                nums[index-1]*=-1;
            }
        }
          for(int i=0;i<nums.length;i++)
          {
             if(nums[i]>0)
             {
                 result.add(i+1);
             }
              else nums[i]*=-1;
          }
        
        return result;
    }

    public static void main(String[] args)
    {
        int[] nums={4,3,2,7,8,2,3,1};
       System.out.println(findDisappearedNumbers(nums));
    }
}